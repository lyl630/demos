package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Drug;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MedicineServiceImplTest {
    @Resource
    DrugService drugService;

    @Test
    public void findAll() {
        PageHelper.startPage(1,2);
        List<Drug> list = drugService.findAllDrug();
        PageInfo<Drug> pageInfo = new PageInfo<>(list);
        log.debug(pageInfo.toString());
        pageInfo.getList().forEach(medicine -> {
            log.debug(medicine.toString());
        });
    }
    @Test
    public void findAllBy() {
        PageHelper.startPage(2,2);
        List<Drug> list = drugService.findAllByDrug(1,"化");
        PageInfo<Drug> pageInfo = new PageInfo<>(list);
        log.debug(pageInfo.toString());
        pageInfo.getList().forEach(medicine -> {
            log.debug(medicine.toString());
        });

    }
}
package school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import school.mapper.GirlsMapper;
import school.pojo.Girls;
import school.pojo.Me;
import school.service.MethodService;

public class MethodServiceImpl implements MethodService {
    @Autowired
    private GirlsMapper girlsMapper;

    @Override
    public void grabBreast(Long id) {
        Girls girls = girlsMapper.selectByPrimaryKey(id);
        System.out.println("我伸出双手握住"+girls.getName()+"的"+girls.getCup()+"不断的揉捏着");
        Me.kuaigan+=10;
    }

    @Override
    public void grabNipper(Long id) {
        Girls girls = girlsMapper.selectByPrimaryKey(id);
        System.out.println("我的食指和拇指捏住"+girls.getName()+"的乳头不断揉搓着");
        Me.kuaigan+=10;
    }

    @Override
    public void insertFingerIntoVegina(Long id) {
        Girls girls = girlsMapper.selectByPrimaryKey(id);
        System.out.println("我的食指和中指同时插入"+girls.getName()+"的小穴内不断抽插起来！");
    }

    @Override
    public void insertPenisIntoVegina(Long id) {
        Girls girls = girlsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void cumIn() {

    }

    @Override
    public void cumOut() {

    }
}

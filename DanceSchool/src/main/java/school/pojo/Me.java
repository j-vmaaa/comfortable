package school.pojo;

import org.springframework.stereotype.Component;

@Component
public class Me {
   public static int kuaigan = 0;

   public static void shejing(){
      System.out.println("我太舒服了射出了大量滚烫的精液！！");
   }

   public static void isShejing(int kuaigan){
      if(kuaigan==100){
         shejing();
      }
   }

}


package annotationorn2;

import java.lang.annotation.*;  
import java.lang.reflect.Method;

  

@Retention(RetentionPolicy.RUNTIME)  

@Target(ElementType.METHOD)  

@interface YeniAnnotation{  

        int deger();  

}    

//Annotation’ı uygulama

class Selam{  

         @YeniAnnotation(deger=10)  

         public void selamla(){

                   System.out.println("selamlama annotation");

         }  

}    

//Annotation’a erişim

class Annotationorn2{  

    
    public static void main(String[] args) 
        throws Exception{
        Selam selam = new Selam();
        Method m=selam.getClass().getMethod("selamlama");
        YeniAnnotation yeniAnno = m.getAnnotation(YeniAnnotation.class);
        System.out.println("deger="+ yeniAnno.deger());
    }
    }



package com.hzdq;

import static org.junit.Assert.assertTrue;

import com.hzdq.CglibDynamicProxy.CglibDynamicProxy;
import com.hzdq.CglibDynamicProxy.CglibPerson;
import com.hzdq.JDKDynamicProxy.JdkDynamicProxy;
import com.hzdq.JDKDynamicProxy.JdkPerson;
import com.hzdq.imitateJdkDynamicProxy.ImitateJdkDynamicProxy;
import com.hzdq.staticProxy.staticPerson;
import com.hzdq.staticProxy.StaticProxy;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void staticProxy(){
        staticPerson staticPerson = new staticPerson();
        StaticProxy staticProxy = new StaticProxy(staticPerson);
        staticProxy.eatApple();
    }
    @Test
    public void  JdkDynamicProxy(){
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy();
        Person person = (Person) jdkDynamicProxy.getInstance(new JdkPerson());
        person.eatApple();
    }
    @Test
    public void CglibDynamicProxy(){
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy();
        CglibPerson cglibPerson=(CglibPerson) cglibDynamicProxy.getInstance(new CglibPerson().getClass());
        cglibPerson.eatApple();
    }
    @Test
    public void  ImitateJdkDynamicProxy(){
        ImitateJdkDynamicProxy jdkDynamicProxy = new ImitateJdkDynamicProxy();
        Person person = (Person) jdkDynamicProxy.getInstance(new JdkPerson());
        person.eatApple();
    }

}

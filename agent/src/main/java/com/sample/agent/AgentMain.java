package com.sample.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;

public class AgentMain {

    private static final Logger log = LoggerFactory.getLogger(AgentMain.class);

    public static void agentmain(String args, Instrumentation instrumentation) {
        log.warn("agentmain start,args:{}", args);

        try {
//            FileInputStream fileInputStream = new FileInputStream("F://file.class");
//            byte[] bytes = new byte[fileInputStream.available()];
//            fileInputStream.read(bytes);
//
//            ClassDefinition classDefinition = new ClassDefinition(Class.forName("com.sample.sample1.Dog"),bytes);
//            instrumentation.redefineClasses(classDefinition);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

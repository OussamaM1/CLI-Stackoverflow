package com.github.oussamaM1;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CLIStackoverflowCommandTest {

    @Test
    public void testWithCommandLineOption() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(baos));

        try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
            String[] args = new String[] { "search" , "-q" , "Collections" , "-t" , "java" , "--verbose" };
            PicocliRunner.run(CLIStackoverflowCommand.class, ctx, args);
            out.println(baos.toString());

            // CLI-Stackoverflow
            assertTrue(baos.toString().contains("Search command running..."));
        }
    }
}

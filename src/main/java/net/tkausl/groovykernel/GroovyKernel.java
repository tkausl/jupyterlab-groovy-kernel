package net.tkausl.groovykernel;

import groovy.lang.GroovyShell;
import io.github.spencerpark.jupyter.kernel.BaseKernel;
import io.github.spencerpark.jupyter.kernel.LanguageInfo;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import org.apache.groovy.groovysh.Groovysh;

public class GroovyKernel extends BaseKernel {

    Groovysh shell;

    public GroovyKernel() {
        shell = new Groovysh();
    }
    @Override
    public DisplayData eval(String expr) throws Exception {
        Object result = null;
        for(String line : expr.split("\n")) {
            result = shell.execute(line);
        }
        if(result != null)
            return new DisplayData(result.toString());
        return null;
    }

    @Override
    public LanguageInfo getLanguageInfo() {
        return new LanguageInfo(
                "groovy",
                "0.0.1",
                "text/x-groovy",
                ".groovy",
                "",
                "",
                ""
        );
    }
}

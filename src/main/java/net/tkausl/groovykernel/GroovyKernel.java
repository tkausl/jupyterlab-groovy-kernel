package net.tkausl.groovykernel;

import io.github.spencerpark.jupyter.kernel.BaseKernel;
import io.github.spencerpark.jupyter.kernel.LanguageInfo;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;

public class GroovyKernel extends BaseKernel {
    @Override
    public DisplayData eval(String expr) throws Exception {
        return new DisplayData("Foo, Bar");
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

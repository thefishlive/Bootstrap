package io.github.thefishlive.bootstrap;

public class Bootstrapper {

    public static void launch(Class<? extends Launcher> clazz, String[] args) throws ReflectiveOperationException, Exception {
        Launcher launcher = clazz.newInstance();
        launcher.launch(args);
    }
}

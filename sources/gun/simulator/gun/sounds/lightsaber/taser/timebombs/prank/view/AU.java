package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f2817a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC2995aW.p(methods, "throwableMethods");
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC2995aW.i(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC2995aW.p(parameterTypes, "it.parameterTypes");
                if (AbstractC2995aW.i(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f2817a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC2995aW.i(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}

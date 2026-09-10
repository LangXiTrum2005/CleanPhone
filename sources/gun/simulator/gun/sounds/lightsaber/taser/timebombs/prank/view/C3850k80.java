package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContextWrapper;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3850k80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4589a = new Object();
    public static SharedPreferences b;

    public static SharedPreferences.Editor a(AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        String packageName = abstractApplicationC2673Ph.getPackageName();
        AbstractC2995aW.p(packageName, "getPackageName(...)");
        return b(abstractApplicationC2673Ph, packageName).edit();
    }

    public static SharedPreferences b(ContextWrapper contextWrapper, String str) {
        SharedPreferences sharedPreferences;
        AbstractC2995aW.q(contextWrapper, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, "spName");
        SharedPreferences sharedPreferences2 = b;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        synchronized (f4589a) {
            SharedPreferences sharedPreferences3 = b;
            if (sharedPreferences3 == null) {
                sharedPreferences = contextWrapper.getApplicationContext().getSharedPreferences(str, 0);
                b = sharedPreferences;
            } else {
                sharedPreferences = sharedPreferences3;
            }
        }
        AbstractC2995aW.p(sharedPreferences, "run(...)");
        return sharedPreferences;
    }

    public static ClassNotFoundException c(Object obj) {
        return new ClassNotFoundException("The parameter not contain " + obj.getClass().getSimpleName() + " can only be of Boolean, String, Set<String>, Int, Long, Float type");
    }
}

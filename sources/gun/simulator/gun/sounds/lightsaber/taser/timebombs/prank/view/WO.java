package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class WO {
    public static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3919a;
    public final ActivityManager b;
    public final NN c;
    public final float d;

    static {
        e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public WO(Context context) {
        this.d = e;
        this.f3919a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new NN(context.getResources().getDisplayMetrics(), 5);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }
}

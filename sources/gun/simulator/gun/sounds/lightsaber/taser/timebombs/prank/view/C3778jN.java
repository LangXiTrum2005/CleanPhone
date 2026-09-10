package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3778jN {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZM f4551a;

    public C3778jN(Context context, ComponentName componentName, WM wm) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f4551a = new C3075bN(context, componentName, wm);
        } else if (i >= 23) {
            this.f4551a = new C2986aN(context, componentName, wm);
        } else {
            this.f4551a = new ZM(context, componentName, wm);
        }
    }
}

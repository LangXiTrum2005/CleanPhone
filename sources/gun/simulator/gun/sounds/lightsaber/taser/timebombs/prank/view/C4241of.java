package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4241of {
    private final Context context;
    private final DisplayMetrics dm;

    public C4241of(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.context = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.dm = displayMetrics;
        Object systemService = context.getSystemService("window");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
    }

    public static /* synthetic */ C4241of copy$default(C4241of c4241of, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c4241of.context;
        }
        return c4241of.copy(context);
    }

    public final Context component1() {
        return this.context;
    }

    public final C4241of copy(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return new C4241of(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4241of) && AbstractC2995aW.i(this.context, ((C4241of) obj).context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getDeviceHeight() {
        return this.dm.heightPixels;
    }

    public final int getDeviceWidth() {
        return this.dm.widthPixels;
    }

    public int hashCode() {
        return this.context.hashCode();
    }

    public String toString() {
        return "DeviceScreenInfo(context=" + this.context + ')';
    }
}

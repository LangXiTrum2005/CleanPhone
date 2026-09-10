package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class XO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3966a;
    public final int b;
    public final Context c;
    public final int d;

    public XO(WO wo) {
        Context context = wo.f3919a;
        this.c = context;
        ActivityManager activityManager = wo.b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.d = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) wo.c.b;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = wo.d;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.b = iRound3;
            this.f3966a = iRound2;
        } else {
            float f3 = i2 / (f2 + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.f3966a = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.b);
            Formatter.formatFileSize(context, this.f3966a);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}

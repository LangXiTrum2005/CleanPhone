package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends IronSourceLogger {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29593c = "console";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29594d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        StringBuilder sb2 = new StringBuilder("UIThread: ");
        sb2.append(Looper.getMainLooper() == Looper.myLooper());
        sb2.append(" ");
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder("Activity: ");
        sb3.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb3.append(" ");
        String string2 = sb3.toString();
        if (i10 == 0) {
            Log.v(f29594d + ironSourceTag, string + string2 + str);
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Log.w(f29594d + ironSourceTag, str);
                return;
            } else if (i10 == 3) {
                Log.e(f29594d + ironSourceTag, str);
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        Log.i(f29594d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        StringBuilder sbJ = u.j(str, ":stacktrace[");
        sbJ.append(Log.getStackTraceString(th2));
        sbJ.append(X3.j.f27836e);
        log(ironSourceTag, sbJ.toString(), 3);
    }

    public a(int i10) {
        super("console", i10);
    }
}

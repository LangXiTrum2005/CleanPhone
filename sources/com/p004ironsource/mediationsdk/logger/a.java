package com.p004ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.p004ironsource.d9;
import com.p004ironsource.environment.ContextProvider;

/* JADX INFO: loaded from: classes5.dex */
public class a extends IronSourceLogger {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25942c = "console";
    public static final String d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.p004ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i2) {
        String strT = android.support.v4.media.a.t(new StringBuilder("UIThread: "), Looper.getMainLooper() == Looper.myLooper(), " ");
        String strQ = android.support.v4.media.a.q(new StringBuilder("Activity: "), ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE, " ");
        if (i2 == 0) {
            Log.v(d + ironSourceTag, strT + strQ + str);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Log.w(d + ironSourceTag, str);
                return;
            } else if (i2 == 3) {
                Log.e(d + ironSourceTag, str);
                return;
            } else if (i2 != 4) {
                return;
            }
        }
        Log.i(d + ironSourceTag, str);
    }

    @Override // com.p004ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder sbX = android.support.v4.media.a.x(str, ":stacktrace[");
        sbX.append(Log.getStackTraceString(th));
        sbX.append(d9.i.f24752e);
        log(ironSourceTag, sbX.toString(), 3);
    }

    public a(int i2) {
        super("console", i2);
    }
}

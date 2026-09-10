package org.greenrobot.eventbus.android;

import android.support.v4.media.a;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.logging.Level;
import org.greenrobot.eventbus.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidLogger implements Logger {
    public static int c(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // org.greenrobot.eventbus.Logger
    public final void a(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int iC = c(level);
            StringBuilder sbX = a.x(str, IOUtils.LINE_SEPARATOR_UNIX);
            sbX.append(Log.getStackTraceString(th));
            Log.println(iC, "EventBus", sbX.toString());
        }
    }

    @Override // org.greenrobot.eventbus.Logger
    public final void b(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(c(level), "EventBus", str);
        }
    }
}

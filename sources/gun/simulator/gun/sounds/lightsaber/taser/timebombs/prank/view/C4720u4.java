package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4720u4 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4720u4 f5062a = new C4720u4();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        AbstractC2995aW.q(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC4632t4.f5013a;
        String loggerName = logRecord.getLoggerName();
        AbstractC2995aW.p(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        AbstractC2995aW.p(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strY0 = (String) AbstractC4632t4.b.get(loggerName);
        if (strY0 == null) {
            strY0 = AbstractC3177ca0.Y0(23, loggerName);
        }
        if (Log.isLoggable(strY0, i)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iS0 = AbstractC3089ba0.s0(message, '\n', i2, false, 4);
                if (iS0 == -1) {
                    iS0 = length;
                }
                while (true) {
                    iMin = Math.min(iS0, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strY0, strSubstring);
                    if (iMin >= iS0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}

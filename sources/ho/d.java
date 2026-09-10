package ho;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f42468a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i10;
        int iMin;
        n.f(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f42466a;
        String loggerName = record.getLoggerName();
        n.e(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i10 = 5;
        } else {
            i10 = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        n.e(message, "record.message");
        Throwable thrown = record.getThrown();
        String strS0 = (String) c.f42467b.get(loggerName);
        if (strS0 == null) {
            strS0 = an.h.S0(23, loggerName);
        }
        if (Log.isLoggable(strS0, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int iV0 = an.h.v0(message, '\n', i11, 4);
                if (iV0 == -1) {
                    iV0 = length;
                }
                while (true) {
                    iMin = Math.min(iV0, i11 + 4000);
                    String strSubstring = message.substring(i11, iMin);
                    n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strS0, strSubstring);
                    if (iMin >= iV0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
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

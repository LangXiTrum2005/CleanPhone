package gold;

import androidx.media3.common.PlaybackException;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Arrays;
import java.util.logging.Logger;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgold/attabal;", "task", "Lgold/wireman;", "queue", "", PglCryptUtils.KEY_MESSAGE, "", "dern", "(Lgold/attabal;Lgold/wireman;Ljava/lang/String;)V", "", "ns", "saneness", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class saneness {
    public static final void dern(attabal attabalVar, wireman wiremanVar, String str) {
        Logger loggerAttabal = marial.f27336impromptu.attabal();
        StringBuilder sb = new StringBuilder();
        sb.append(wiremanVar.beachfront());
        sb.append(' ');
        gintrap gintrapVar = gintrap.f29390attabal;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(attabalVar.getName());
        loggerAttabal.fine(sb.toString());
    }

    public static final String saneness(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        gintrap gintrapVar = gintrap.f29390attabal;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }
}

package okhttp3;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Interceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lokhttp3/adultoid;", "", "Lokhttp3/adultoid$attabal;", "chain", "Lokhttp3/cuirassed;", "intercept", "(Lokhttp3/adultoid$attabal;)Lokhttp3/cuirassed;", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface adultoid {

    /* JADX INFO: compiled from: Interceptor.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/adultoid$attabal;", "", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "()Lokhttp3/preprohormone;", "Lokhttp3/cuirassed;", "attabal", "(Lokhttp3/preprohormone;)Lokhttp3/cuirassed;", "Lokhttp3/taiyuan;", "connection", "()Lokhttp3/taiyuan;", "Lokhttp3/marial;", NotificationCompat.CATEGORY_CALL, "()Lokhttp3/marial;", "", "readTimeoutMillis", "()I", "writeTimeoutMillis", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface attabal {
        cuirassed attabal(preprohormone request) throws IOException;

        marial call();

        taiyuan connection();

        int readTimeoutMillis();

        preprohormone request();

        int writeTimeoutMillis();
    }

    cuirassed intercept(attabal chain) throws IOException;
}

package okhttp3;

import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/marial;", "", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "()Lokhttp3/preprohormone;", "Lokhttp3/cuirassed;", "execute", "()Lokhttp3/cuirassed;", "Lokhttp3/beachfront;", "responseCallback", "", "privatdozent", "(Lokhttp3/beachfront;)V", "cancel", "()V", "", "isCanceled", "()Z", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface marial extends Cloneable {

    /* JADX INFO: compiled from: Call.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/marial$attabal;", "", "Lokhttp3/preprohormone;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/marial;", "attabal", "(Lokhttp3/preprohormone;)Lokhttp3/marial;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface attabal {
        marial attabal(preprohormone request);
    }

    void cancel();

    cuirassed execute() throws IOException;

    boolean isCanceled();

    void privatdozent(beachfront responseCallback);

    preprohormone request();
}

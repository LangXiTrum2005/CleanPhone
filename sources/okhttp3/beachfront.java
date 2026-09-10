package okhttp3;

import androidx.core.app.NotificationCompat;
import com.ironsource.Ie;
import java.io.IOException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/beachfront;", "", "Lokhttp3/marial;", NotificationCompat.CATEGORY_CALL, "Ljava/io/IOException;", "e", "", "onFailure", "(Lokhttp3/marial;Ljava/io/IOException;)V", "Lokhttp3/cuirassed;", Ie.n, "onResponse", "(Lokhttp3/marial;Lokhttp3/cuirassed;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface beachfront {
    void onFailure(marial call, IOException e);

    void onResponse(marial call, cuirassed response) throws IOException;
}

package b0;

import android.app.Notification;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}

package ha;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.auth.j2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f42292a = new j2(4);

    static {
        new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
    }
}

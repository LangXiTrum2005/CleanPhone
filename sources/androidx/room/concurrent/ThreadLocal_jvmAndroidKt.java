package androidx.room.concurrent;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u001c\u0010\u0002\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/ThreadLocal;", "ThreadLocal", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThreadLocal_jvmAndroidKt {
    public static final long a() {
        return Thread.currentThread().getId();
    }
}

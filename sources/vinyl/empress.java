package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.SoftReference;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Lvinyl/empress;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "Lkotlin/Function0;", "factory", "attabal", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/lang/ref/SoftReference;", "Ljava/lang/ref/SoftReference;", "reference", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class empress<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T attabal(Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        T t = this.reference.get();
        if (t != null) {
            return t;
        }
        T tInvoke = factory.invoke();
        this.reference = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}

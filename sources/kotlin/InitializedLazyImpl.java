package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/InitializedLazyImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {
    public final Object X;

    public InitializedLazyImpl(Object obj) {
        this.X = obj;
    }

    @Override // kotlin.Lazy
    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final Object getX() {
        return this.X;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.X);
    }
}

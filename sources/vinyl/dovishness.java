package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvinyl/dovishness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/ClassValue;", "Lvinyl/empress;", "<init>", "()V", "Ljava/lang/Class;", "type", "attabal", "(Ljava/lang/Class;)Lvinyl/empress;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dovishness<T> extends ClassValue<empress<T>> {
    @Override // java.lang.ClassValue
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public empress<T> computeValue(Class<?> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new empress<>();
    }
}

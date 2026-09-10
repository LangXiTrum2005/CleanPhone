package monocoque;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Optional;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Optionals.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\f\u0012\b\b\u0001\u0012\u0004\b\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b9¨\u0006\b"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/Optional;", "saneness", "(Ljava/util/Optional;)Ljava/lang/Object;", "defaultValue", "attabal", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib-jdk8"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class attabal {
    public static final <T> T attabal(Optional<? extends T> optional, T t) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : t;
    }

    public static final <T> T saneness(Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }
}

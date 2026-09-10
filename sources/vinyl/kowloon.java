package vinyl;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lkurbash/wireman;", "Lasosan/wireman;", "factory", "Lvinyl/basify;", "attabal", "(Lkotlin/jvm/functions/Function1;)Lvinyl/basify;", "Lkotlin/Function2;", "", "", "Lkurbash/arytenoidectomy;", "Lvinyl/achondroplasia;", "saneness", "(Lkotlin/jvm/functions/Function2;)Lvinyl/achondroplasia;", "", "Z", "useClassValue", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final boolean f39415attabal;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f39415attabal = z;
    }

    public static final <T> basify<T> attabal(Function1<? super kurbash.wireman<?>, ? extends asosan.wireman<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f39415attabal ? new graveside(factory) : new preprohormone(factory);
    }

    public static final <T> achondroplasia<T> saneness(Function2<? super kurbash.wireman<Object>, ? super List<? extends kurbash.arytenoidectomy>, ? extends asosan.wireman<T>> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f39415attabal ? new adultoid(factory) : new cord(factory);
    }
}

package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001e\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00060\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PagedList$removeWeakLoadStateListener$1 extends Lambda implements Function1<WeakReference<Function2<? super LoadType, ? super LoadState, ? extends Unit>>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WeakReference it = (WeakReference) obj;
        Intrinsics.f(it, "it");
        return Boolean.valueOf(it.get() == null || it.get() == null);
    }
}

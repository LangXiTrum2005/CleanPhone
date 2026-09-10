package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "R", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "stash", "Landroidx/paging/TransformablePage;", "invoke", "(Landroidx/paging/TransformablePage;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SeparatorState$onDrop$1 extends Lambda implements Function1<TransformablePage<Object>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransformablePage stash = (TransformablePage) obj;
        Intrinsics.f(stash, "stash");
        int[] iArr = stash.f7886a;
        if (iArr.length <= 0) {
            return false;
        }
        int i2 = iArr[0];
        throw null;
    }
}

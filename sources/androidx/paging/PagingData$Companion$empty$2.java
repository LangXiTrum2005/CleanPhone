package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/paging/PageEvent$Insert;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PagingData$Companion$empty$2 extends Lambda implements Function0<PageEvent.Insert<Object>> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PageEvent.Insert insert = PageEvent.Insert.g;
        return PageEvent.Insert.Companion.a(CollectionsKt.H(new TransformablePage(0, EmptyList.X)), 0, 0, null, null);
    }
}

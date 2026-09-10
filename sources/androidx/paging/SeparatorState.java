package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/paging/SeparatorState;", "", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class SeparatorState<R, T extends R> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TerminalSeparatorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static TransformablePage a(TransformablePage transformablePage) {
        List list = transformablePage.f7887b;
        List listI = CollectionsKt.I(CollectionsKt.w(list), CollectionsKt.F(list));
        List list2 = transformablePage.d;
        return new TransformablePage(transformablePage.f7886a, listI, transformablePage.f7888c, CollectionsKt.I(Integer.valueOf(list2 != null ? ((Number) CollectionsKt.w(list2)).intValue() : 0), Integer.valueOf(list2 != null ? ((Number) CollectionsKt.F(list2)).intValue() : CollectionsKt.A(list))));
    }
}

package androidx.paging;

import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/paging/TransformablePage;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TransformablePage<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TransformablePage f7885e = new TransformablePage(0, EmptyList.X);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7888c;
    public final List d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/TransformablePage$Companion;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public TransformablePage(int[] originalPageOffsets, List data, int i2, List list) {
        Intrinsics.f(originalPageOffsets, "originalPageOffsets");
        Intrinsics.f(data, "data");
        this.f7886a = originalPageOffsets;
        this.f7887b = data;
        this.f7888c = i2;
        this.d = list;
        if (originalPageOffsets.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        Intrinsics.c(list);
        sb.append(list.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformablePage.class != obj.getClass()) {
            return false;
        }
        TransformablePage transformablePage = (TransformablePage) obj;
        return Arrays.equals(this.f7886a, transformablePage.f7886a) && Intrinsics.a(this.f7887b, transformablePage.f7887b) && this.f7888c == transformablePage.f7888c && Intrinsics.a(this.d, transformablePage.d);
    }

    public final int hashCode() {
        int iC = (a.c(Arrays.hashCode(this.f7886a) * 31, 31, this.f7887b) + this.f7888c) * 31;
        List list = this.d;
        return iC + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f7886a) + ", data=" + this.f7887b + ", hintOriginalPageOffset=" + this.f7888c + ", hintOriginalIndices=" + this.d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformablePage(int i2, List data) {
        this(new int[]{i2}, data, i2, null);
        Intrinsics.f(data, "data");
    }
}

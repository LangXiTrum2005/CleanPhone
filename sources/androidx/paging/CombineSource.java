package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/CombineSource;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CombineSource {
    public static final CombineSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final CombineSource f7780Y;
    public static final CombineSource Z;
    public static final /* synthetic */ CombineSource[] e0;

    static {
        CombineSource combineSource = new CombineSource("INITIAL", 0);
        X = combineSource;
        CombineSource combineSource2 = new CombineSource("RECEIVER", 1);
        f7780Y = combineSource2;
        CombineSource combineSource3 = new CombineSource("OTHER", 2);
        Z = combineSource3;
        e0 = new CombineSource[]{combineSource, combineSource2, combineSource3};
    }

    public static CombineSource valueOf(String str) {
        return (CombineSource) Enum.valueOf(CombineSource.class, str);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) e0.clone();
    }
}

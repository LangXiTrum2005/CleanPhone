package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadType;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadType {
    public static final LoadType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final LoadType f7815Y;
    public static final LoadType Z;
    public static final /* synthetic */ LoadType[] e0;

    static {
        LoadType loadType = new LoadType("REFRESH", 0);
        X = loadType;
        LoadType loadType2 = new LoadType("PREPEND", 1);
        f7815Y = loadType2;
        LoadType loadType3 = new LoadType("APPEND", 2);
        Z = loadType3;
        e0 = new LoadType[]{loadType, loadType2, loadType3};
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) e0.clone();
    }
}

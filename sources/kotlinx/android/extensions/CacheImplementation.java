package kotlinx.android.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "Companion", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CacheImplementation {
    public static final CacheImplementation X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ CacheImplementation[] f44735Y;
    public static final /* synthetic */ EnumEntries Z;

    /* JADX INFO: Fake field, exist only in values array */
    CacheImplementation EF0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CacheImplementation cacheImplementation = new CacheImplementation("SPARSE_ARRAY", 0);
        CacheImplementation cacheImplementation2 = new CacheImplementation("HASH_MAP", 1);
        X = cacheImplementation2;
        CacheImplementation[] cacheImplementationArr = {cacheImplementation, cacheImplementation2, new CacheImplementation("NO_CACHE", 2)};
        f44735Y = cacheImplementationArr;
        Z = EnumEntriesKt.a(cacheImplementationArr);
    }

    public static CacheImplementation valueOf(String str) {
        return (CacheImplementation) Enum.valueOf(CacheImplementation.class, str);
    }

    public static CacheImplementation[] values() {
        return (CacheImplementation[]) f44735Y.clone();
    }
}

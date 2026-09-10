package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/DeprecationLevel;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeprecationLevel {
    public static final DeprecationLevel X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final DeprecationLevel f43246Y;
    public static final /* synthetic */ DeprecationLevel[] Z;
    public static final /* synthetic */ EnumEntries e0;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        X = deprecationLevel;
        DeprecationLevel deprecationLevel2 = new DeprecationLevel("ERROR", 1);
        f43246Y = deprecationLevel2;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, new DeprecationLevel("HIDDEN", 2)};
        Z = deprecationLevelArr;
        e0 = EnumEntriesKt.a(deprecationLevelArr);
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) Z.clone();
    }
}

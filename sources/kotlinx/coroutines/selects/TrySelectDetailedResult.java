package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrySelectDetailedResult {
    public static final TrySelectDetailedResult X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final TrySelectDetailedResult f45099Y;
    public static final TrySelectDetailedResult Z;
    public static final TrySelectDetailedResult e0;
    public static final /* synthetic */ TrySelectDetailedResult[] f0;
    public static final /* synthetic */ EnumEntries g0;

    static {
        TrySelectDetailedResult trySelectDetailedResult = new TrySelectDetailedResult("SUCCESSFUL", 0);
        X = trySelectDetailedResult;
        TrySelectDetailedResult trySelectDetailedResult2 = new TrySelectDetailedResult("REREGISTER", 1);
        f45099Y = trySelectDetailedResult2;
        TrySelectDetailedResult trySelectDetailedResult3 = new TrySelectDetailedResult("CANCELLED", 2);
        Z = trySelectDetailedResult3;
        TrySelectDetailedResult trySelectDetailedResult4 = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        e0 = trySelectDetailedResult4;
        TrySelectDetailedResult[] trySelectDetailedResultArr = {trySelectDetailedResult, trySelectDetailedResult2, trySelectDetailedResult3, trySelectDetailedResult4};
        f0 = trySelectDetailedResultArr;
        g0 = EnumEntriesKt.a(trySelectDetailedResultArr);
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f0.clone();
    }
}

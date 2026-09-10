package kotlin.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvocationKind {
    public static final /* synthetic */ InvocationKind[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f43288Y;

    /* JADX INFO: Fake field, exist only in values array */
    InvocationKind EF5;

    static {
        InvocationKind[] invocationKindArr = {new InvocationKind("AT_MOST_ONCE", 0), new InvocationKind("AT_LEAST_ONCE", 1), new InvocationKind("EXACTLY_ONCE", 2), new InvocationKind("UNKNOWN", 3)};
        X = invocationKindArr;
        f43288Y = EnumEntriesKt.a(invocationKindArr);
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) X.clone();
    }
}

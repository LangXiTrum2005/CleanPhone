package kotlin.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequireKotlinVersionKind {
    public static final RequireKotlinVersionKind X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ RequireKotlinVersionKind[] f43301Y;
    public static final /* synthetic */ EnumEntries Z;

    static {
        RequireKotlinVersionKind requireKotlinVersionKind = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
        X = requireKotlinVersionKind;
        RequireKotlinVersionKind[] requireKotlinVersionKindArr = {requireKotlinVersionKind, new RequireKotlinVersionKind("COMPILER_VERSION", 1), new RequireKotlinVersionKind("API_VERSION", 2)};
        f43301Y = requireKotlinVersionKindArr;
        Z = EnumEntriesKt.a(requireKotlinVersionKindArr);
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) f43301Y.clone();
    }
}

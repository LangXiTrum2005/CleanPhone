package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KVisibility {
    public static final KVisibility X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final KVisibility f43356Y;
    public static final KVisibility Z;
    public static final KVisibility e0;
    public static final /* synthetic */ KVisibility[] f0;
    public static final /* synthetic */ EnumEntries g0;

    static {
        KVisibility kVisibility = new KVisibility("PUBLIC", 0);
        X = kVisibility;
        KVisibility kVisibility2 = new KVisibility("PROTECTED", 1);
        f43356Y = kVisibility2;
        KVisibility kVisibility3 = new KVisibility("INTERNAL", 2);
        Z = kVisibility3;
        KVisibility kVisibility4 = new KVisibility("PRIVATE", 3);
        e0 = kVisibility4;
        KVisibility[] kVisibilityArr = {kVisibility, kVisibility2, kVisibility3, kVisibility4};
        f0 = kVisibilityArr;
        g0 = EnumEntriesKt.a(kVisibilityArr);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f0.clone();
    }
}

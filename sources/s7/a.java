package s7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f50200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f50201g;

    static {
        a aVar = new a("Unknown", 0);
        f50195a = aVar;
        a aVar2 = new a("Analysis", 1);
        f50196b = aVar2;
        a aVar3 = new a("AnrReport", 2);
        f50197c = aVar3;
        a aVar4 = new a("CrashReport", 3);
        f50198d = aVar4;
        a aVar5 = new a("CrashShield", 4);
        f50199e = aVar5;
        a aVar6 = new a("ThreadCheck", 5);
        f50200f = aVar6;
        f50201g = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f50201g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return "Analysis";
        }
        if (iOrdinal == 2) {
            return "AnrReport";
        }
        if (iOrdinal == 3) {
            return "CrashReport";
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}

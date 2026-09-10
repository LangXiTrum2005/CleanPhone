package vf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f52573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f52574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f52575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f52576e;

    static {
        b bVar = new b("ABSENT", 0);
        f52572a = bVar;
        b bVar2 = new b("REMOVING", 1);
        f52573b = bVar2;
        b bVar3 = new b("PASS_THROUGH", 2);
        f52574c = bVar3;
        b bVar4 = new b("COMPRESSING", 3);
        f52575d = bVar4;
        f52576e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f52576e.clone();
    }

    public final boolean d() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return true;
        }
        throw new RuntimeException("Unexpected track status: " + this);
    }
}

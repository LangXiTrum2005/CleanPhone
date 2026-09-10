package ql;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f49139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f49140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f49141c;

    static {
        e eVar = new e("READ_ONLY", 0);
        f49139a = eVar;
        e eVar2 = new e("MUTABLE", 1);
        f49140b = eVar2;
        f49141c = new e[]{eVar, eVar2};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f49141c.clone();
    }
}

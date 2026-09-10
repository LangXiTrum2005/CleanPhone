package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f53280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f53281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f53282c;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("SYNCHRONIZED", 0);
        e eVar2 = new e("PUBLICATION", 1);
        f53280a = eVar2;
        e eVar3 = new e("NONE", 2);
        f53281b = eVar3;
        f53282c = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f53282c.clone();
    }
}

package am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f3762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f3763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ p[] f3764c;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    static {
        p pVar = new p("PRETTY", 0);
        p pVar2 = new p("DEBUG", 1);
        f3762a = pVar2;
        p pVar3 = new p("NONE", 2);
        f3763b = pVar3;
        f3764c = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f3764c.clone();
    }
}

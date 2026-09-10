package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f49125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f49126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f49127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f49128d;

    static {
        n nVar = new n("INSTANCE", 0);
        f49125a = nVar;
        n nVar2 = new n("CONTEXT", 1);
        n nVar3 = new n("EXTENSION_RECEIVER", 2);
        f49126b = nVar3;
        n nVar4 = new n("VALUE", 3);
        f49127c = nVar4;
        f49128d = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f49128d.clone();
    }
}

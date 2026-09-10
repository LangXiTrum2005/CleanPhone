package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f4564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f4565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f4566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f4567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f4568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n[] f4569f;

    static {
        n nVar = new n("DESTROYED", 0);
        f4564a = nVar;
        n nVar2 = new n("INITIALIZED", 1);
        f4565b = nVar2;
        n nVar3 = new n("CREATED", 2);
        f4566c = nVar3;
        n nVar4 = new n("STARTED", 3);
        f4567d = nVar4;
        n nVar5 = new n("RESUMED", 4);
        f4568e = nVar5;
        f4569f = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f4569f.clone();
    }
}

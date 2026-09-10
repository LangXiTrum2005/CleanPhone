package q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f48781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f48782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f48783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f48784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s[] f48785e;

    static {
        s sVar = new s("NOT_LOADED", 0);
        f48781a = sVar;
        s sVar2 = new s("LOADING", 1);
        f48782b = sVar2;
        s sVar3 = new s("SUCCESS", 2);
        f48783c = sVar3;
        s sVar4 = new s("ERROR", 3);
        f48784d = sVar4;
        f48785e = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f48785e.clone();
    }
}

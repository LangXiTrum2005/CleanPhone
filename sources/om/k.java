package om;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f47577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f47578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f47579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f47580d;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        f47577a = kVar;
        k kVar2 = new k("COMPUTING", 1);
        f47578b = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        f47579c = kVar3;
        f47580d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f47580d.clone();
    }
}

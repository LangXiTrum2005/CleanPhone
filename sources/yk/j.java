package yk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f54475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f54476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f54477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f54478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f54479e;

    static {
        j jVar = new j("HIDDEN", 0);
        f54475a = jVar;
        j jVar2 = new j("VISIBLE", 1);
        f54476b = jVar2;
        j jVar3 = new j("NOT_CONSIDERED", 2);
        f54477c = jVar3;
        j jVar4 = new j("DROP", 3);
        f54478d = jVar4;
        f54479e = new j[]{jVar, jVar2, jVar3, jVar4};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f54479e.clone();
    }
}

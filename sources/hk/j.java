package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f42398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f42399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f42400c;

    static {
        j jVar = new j("TOP_DOWN", 0);
        f42398a = jVar;
        j jVar2 = new j("BOTTOM_UP", 1);
        f42399b = jVar2;
        f42400c = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f42400c.clone();
    }
}

package e6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f39149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j[] f39150b;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    static {
        j jVar = new j("SRGB", 0);
        j jVar2 = new j("DISPLAY_P3", 1);
        f39149a = jVar2;
        f39150b = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f39150b.clone();
    }
}

package eh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i[] f40080a = {new i("AVERAGE_HASH", 0), new i("DIFFERENCE_HASH", 1), new i("PERCEPTUAL_HASH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    i EF5;

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f40080a.clone();
    }
}

package c8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f5959d;

    static {
        a aVar = new a("Image", 0);
        f5956a = aVar;
        a aVar2 = new a("Video", 1);
        f5957b = aVar2;
        a aVar3 = new a("Audio", 2);
        f5958c = aVar3;
        f5959d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5959d.clone();
    }
}

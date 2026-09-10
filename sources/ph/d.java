package ph;

import com.ironsource.mediationsdk.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f48376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f48377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f48378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f48379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f48380e;

    static {
        d dVar = new d("UNSPECIFIED", 0);
        f48376a = dVar;
        d dVar2 = new d("INTERSTITIAL", 1);
        f48377b = dVar2;
        d dVar3 = new d("REWARDED", 2);
        f48378c = dVar3;
        d dVar4 = new d(j.f29553a, 3);
        f48379d = dVar4;
        f48380e = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f48380e.clone();
    }
}

package sg.bigo.ads.ad.interstitial;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46714c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46715e;
    public int j;
    public boolean k;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46719n;
    public boolean f = false;
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46716h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46717i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f46718l = 0;

    public static int a(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 10;
        }
        return 5;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            return i2 != 3 ? 5 : 10;
        }
        return 3;
    }
}

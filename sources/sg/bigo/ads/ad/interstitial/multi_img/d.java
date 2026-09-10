package sg.bigo.ads.ad.interstitial.multi_img;

/* JADX INFO: loaded from: classes7.dex */
public enum d {
    NONE(0, 3, 20, 0, 1.0f, 1.0f),
    LTR(1, 1, 20, 12, 1.0f, 1.0f),
    CENTER(2, 2, 30, 12, 0.8f, 0.9f),
    FULL(3, 3, 20, 0, 1.0f, 1.0f),
    TILE(Integer.MIN_VALUE, Integer.MIN_VALUE, 20, 12, 1.0f, 1.0f);

    public final int f;
    final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f46391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46392i;
    public final int j;
    private final int k;

    d(int i2, int i3, int i4, int i5, float f, float f2) {
        this.k = i2;
        this.j = i3;
        this.f46392i = i4;
        this.f = i5;
        this.g = f;
        this.f46391h = f2;
    }

    public static d a(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            return TILE;
        }
        if (i2 == 1) {
            return LTR;
        }
        if (i2 != 2) {
            return i2 != 3 ? NONE : FULL;
        }
        return CENTER;
    }
}

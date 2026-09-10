package sg.bigo.ads.ad.interstitial.multi_img;

/* JADX INFO: loaded from: classes7.dex */
public enum c {
    FILL_MATCH_SELF(1, 1),
    FILL_MATCH_MAIN_VIEW(2, 2),
    FILL_MATCH_PARENT(3, 3);

    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46385e;

    c(int i2, int i3) {
        this.f46385e = i2;
        this.d = i3;
    }

    public static c a(int i2) {
        if (i2 != 2) {
            return i2 != 3 ? FILL_MATCH_SELF : FILL_MATCH_PARENT;
        }
        return FILL_MATCH_MAIN_VIEW;
    }
}

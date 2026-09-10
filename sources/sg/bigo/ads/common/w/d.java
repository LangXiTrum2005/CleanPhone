package sg.bigo.ads.common.w;

/* JADX INFO: loaded from: classes7.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d f47735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f47736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float[] f47737c;
    final float[] d = {0.24f, 0.52f, 0.24f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f47738e = true;

    static {
        d dVar = new d();
        f47735a = dVar;
        float[] fArr = dVar.f47737c;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
        float[] fArr2 = dVar.f47736b;
        fArr2[0] = 0.35f;
        fArr2[1] = 1.0f;
    }

    public d() {
        float[] fArr = new float[3];
        this.f47736b = fArr;
        float[] fArr2 = new float[3];
        this.f47737c = fArr2;
        a(fArr);
        a(fArr2);
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}

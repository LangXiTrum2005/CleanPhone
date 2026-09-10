package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements mc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f52059a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mc.c f52060b = mc.c.a("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.c f52061c = mc.c.a("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mc.c f52062d = mc.c.a("sessionSamplingRate");

    @Override // mc.a
    public final void a(Object obj, Object obj2) {
        k kVar = (k) obj;
        mc.e eVar = (mc.e) obj2;
        eVar.a(f52060b, kVar.f52115a);
        eVar.a(f52061c, kVar.f52116b);
        eVar.g(f52062d, kVar.f52117c);
    }
}

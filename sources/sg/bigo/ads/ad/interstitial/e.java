package sg.bigo.ads.ad.interstitial;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f46166a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f46167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f46168c;

    public interface a {
        boolean a(Runnable runnable);
    }

    public final void a() {
        this.f46166a = true;
        sg.bigo.ads.common.utils.n nVar = this.f46168c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void b() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f46166a || (nVar = this.f46168c) == null || nVar.f47525i) {
            return;
        }
        nVar.c();
    }

    public void c() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f46166a || (nVar = this.f46168c) == null || nVar.f47525i) {
            return;
        }
        nVar.d();
    }

    public final void a(int i2, final Runnable runnable) {
        sg.bigo.ads.common.utils.n nVar = this.f46168c;
        if (nVar != null) {
            nVar.b();
        }
        this.f46166a = false;
        sg.bigo.ads.common.utils.n nVar2 = new sg.bigo.ads.common.utils.n(((long) i2) * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                Runnable runnable2;
                e eVar = e.this;
                if (eVar.f46166a || (runnable2 = runnable) == null) {
                    return;
                }
                a aVar = eVar.f46167b;
                if (aVar != null) {
                    aVar.a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
            }
        };
        this.f46168c = nVar2;
        nVar2.c();
    }
}

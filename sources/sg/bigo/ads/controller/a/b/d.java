package sg.bigo.ads.controller.a.b;

import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.a.j;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.controller.a.b f47842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f47843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.controller.b.d f47844c;
    private h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.controller.e.e f47845e;
    private c f;
    private c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f47846h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f47847a = new d();
    }

    public final void a(String str, j jVar, j jVar2) {
        c cVar;
        if (str == null || jVar == null || jVar2 == null || !i.f46986a.x() || i.f46986a.y() <= 0 || i.f46986a.z() <= 0 || i.f46986a.A() <= 0 || this.f47842a == null) {
            return;
        }
        if (str.equals("/Ad/GetSDKConfig")) {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f == null) {
                this.f = new e(this.f47842a, this.f47843b, this.f47844c, this.d);
            }
            cVar = this.f;
        } else if (str.equals("/Ad/ReportUniBaina")) {
            if (jVar.d() == 1) {
                return;
            }
            if (this.g == null) {
                this.g = new b(this.f47842a, this.f47843b, this.f47844c, this.d);
            }
            cVar = this.g;
        } else {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f47846h == null) {
                this.f47846h = new sg.bigo.ads.controller.a.b.a(this.f47842a, this.f47843b, this.f47844c, this.d);
            }
            cVar = this.f47846h;
            ((sg.bigo.ads.controller.a.b.a) cVar).f47830a = this.f47845e;
        }
        cVar.c();
    }

    public final void a(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar, sg.bigo.ads.controller.e.e eVar) {
        this.f47842a = bVar;
        this.f47843b = gVar;
        this.f47844c = dVar;
        this.d = hVar;
        this.f47845e = eVar;
    }
}

package sg.bigo.ads.controller.g;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends e<sg.bigo.ads.common.u.b.d> {
    public l(Map<String, Object> map, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, sg.bigo.ads.controller.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.controller.g.e, sg.bigo.ads.controller.g.a
    public final void a(a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.f48147b.P());
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.c();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        String str = this.f48151i;
        return str != null ? new sg.bigo.ads.common.u.b.d(sg.bigo.ads.b.a(str, "/Ad/ReportUniBaina")) : new sg.bigo.ads.common.u.b.d(sg.bigo.ads.b.a(sg.bigo.ads.b.b(), "/Ad/ReportUniBaina"));
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return false;
    }
}

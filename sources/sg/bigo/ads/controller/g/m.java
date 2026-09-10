package sg.bigo.ads.controller.g;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends e<sg.bigo.ads.controller.a.f> {
    public m(Map<String, Object> map, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, sg.bigo.ads.controller.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.controller.g.e, sg.bigo.ads.controller.g.a
    public final void a(a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.f48147b.P());
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.common.f.b.c()));
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.c();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f48148c;
        return bVar != null ? bVar.f47798a.f47752l.f47797e : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        return this.f48148c.b("/Ad/ReportUniBaina", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
        sg.bigo.ads.common.x.a.C();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return sg.bigo.ads.api.a.i.f46986a.f() && sg.bigo.ads.common.x.a.B();
    }
}

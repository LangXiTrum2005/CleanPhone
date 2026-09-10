package sg.bigo.ads.controller.g;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends e<sg.bigo.ads.controller.a.f> {
    public f(Map<String, Object> map, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, sg.bigo.ads.controller.b bVar2) {
        super(map, gVar, bVar, bVar2);
    }

    @Override // sg.bigo.ads.controller.g.e, sg.bigo.ads.controller.g.a
    public final void a(a.b bVar) {
        super.a(bVar);
        bVar.a("token", this.f48147b.P());
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.common.f.b.c()));
        bVar.a("uuid", this.f48147b.X());
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f48148c;
        return bVar != null ? bVar.f47798a.f47752l.f47796c : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        return this.f48148c.b("/Ad/UniCallback", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
        sg.bigo.ads.common.x.a.E();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return sg.bigo.ads.api.a.i.f46986a.g() && sg.bigo.ads.common.x.a.D();
    }
}

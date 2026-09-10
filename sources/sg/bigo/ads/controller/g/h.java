package sg.bigo.ads.controller.g;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends a<sg.bigo.ads.controller.a.f> {
    private final sg.bigo.ads.controller.b j;

    public h(sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, long j, sg.bigo.ads.controller.b bVar2) {
        super(gVar, bVar, j);
        this.j = bVar2;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i2, int i3, String str) {
        this.j.a(a(), i2, i3, str, null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f48148c;
        return bVar != null ? bVar.f47798a.f47752l.d : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        String str = this.f48151i;
        return str != null ? this.f48148c.b("/Ad/GetUniConfig", str) : this.f48148c.b("/Ad/GetUniConfig", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
        sg.bigo.ads.common.x.a.w();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return sg.bigo.ads.api.a.i.f46986a.c() && sg.bigo.ads.common.x.a.v();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, Map<String, Object> map) {
        this.j.a(a(), str);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(a.b bVar) {
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.common.f.b.c()));
        sg.bigo.ads.common.b bVarAc = this.f48147b.ac();
        bVar.a("bat_stat", bVarAc != null ? String.valueOf(bVarAc.f47113c) : "");
        bVar.a("bat_num", bVarAc != null ? String.valueOf(bVarAc.f47111a) : "");
        bVar.a("bat_scale", bVarAc != null ? String.valueOf(bVarAc.f47112b) : "");
        bVar.a("coppa", Integer.valueOf(sg.bigo.ads.common.x.a.p()));
    }
}

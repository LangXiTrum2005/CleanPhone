package sg.bigo.ads.controller.g;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends sg.bigo.ads.controller.g.a<sg.bigo.ads.controller.a.f> {
    private a j;

    public interface a {
        void a(String str, int i2, int i3, int i4, String str2, Map<String, Object> map);

        void a(String str, int i2, String str2, Map<String, Object> map);
    }

    public k(sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, a aVar) {
        super(gVar, bVar);
        this.j = aVar;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i2, int i3, String str) {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.b();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.u.f d() {
        return sg.bigo.ads.common.u.f.a("application/json");
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f48148c;
        return bVar != null ? bVar.f47798a.f47752l.f47794a : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        String str = this.f48151i;
        return str != null ? this.f48148c.b("/Ad/GetSDKConfig", str) : this.f48148c.b("/Ad/GetSDKConfig", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean h() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, int i2, int i3, String str2, Map<String, Object> map) {
        super.a(str, i2, i3, str2, map);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(str, a(), i2, i3, str2, map);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, String str2, Map<String, Object> map) {
        super.a(str, str2, map);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(str, a(), str2, map);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, Map<String, Object> map) {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(sg.bigo.ads.controller.g.a.b bVar) {
    }
}

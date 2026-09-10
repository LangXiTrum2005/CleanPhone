package sg.bigo.ads.controller.g;

import android.text.TextUtils;
import java.util.Map;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class b extends a<sg.bigo.ads.controller.a.f> implements i {
    protected final sg.bigo.ads.api.a.h j;
    protected final sg.bigo.ads.api.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final sg.bigo.ads.api.a.l f48160l;
    protected final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> m;

    public b(sg.bigo.ads.api.a.h hVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, sg.bigo.ads.api.b bVar2, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> eVar) {
        super(gVar, bVar, ((long) lVar.d()) * 1000);
        this.j = hVar;
        this.k = bVar2;
        this.f48160l = lVar;
        this.m = eVar;
        bVar2.a(this.f48149e, this.f, this.g);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final StringBuilder a(long j, String str) {
        StringBuilder sbA = super.a(j, str);
        sbA.append(",");
        sbA.append(q.a(this.f48160l.l()));
        sbA.append(",");
        sbA.append(q.a(this.f48160l.n()));
        return sbA;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f48148c;
        return bVar != null ? bVar.f47798a.f47752l.f47795b : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    public void i() {
        sg.bigo.ads.common.x.a.y();
    }

    @Override // sg.bigo.ads.controller.g.a
    public boolean j() {
        return sg.bigo.ads.api.a.i.f46986a.d() && sg.bigo.ads.common.x.a.x();
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.b k() {
        return this.k;
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.a.l l() {
        return this.f48160l;
    }

    @Override // sg.bigo.ads.controller.g.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public sg.bigo.ads.controller.a.f f() {
        return this.f48148c.b("/Ad/GetUniAd", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i2, int i3, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> eVar = this.m;
        if (eVar != null) {
            eVar.a(a(), i2, i3, str, this.f48160l);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public void a(String str, Map<String, Object> map) {
        if (this.m != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.controller.c.b bVarA = sg.bigo.ads.controller.c.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.k.g, this.f48160l, str);
            if (bVarA != null) {
                this.m.a(a(), this.k, bVarA);
            } else {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(a.b bVar) {
        int iU;
        bVar.a("slot", q.a(this.f48160l.l()));
        bVar.a("placement_id", q.a(this.f48160l.n()));
        bVar.a("strategy_id", this.f48160l.a());
        bVar.a("support_adx_types", sg.bigo.ads.api.core.b.a(this.k.c()));
        bVar.a("lat_enable", Integer.valueOf(this.f48147b.z() ? 1 : 0));
        bVar.a("hw_lat_enable", Integer.valueOf(this.f48147b.F() ? 1 : 0));
        bVar.a("fire_lat_enable", Integer.valueOf(this.f48147b.ad() ? 1 : 0));
        bVar.a("token", this.j.l());
        bVar.a("slot_abflags", this.f48160l.o());
        bVar.a("global_abflags", this.j.j());
        bVar.a("support_playable_ad", Integer.valueOf(this.f48160l.r()));
        bVar.a("session_id", this.k.g.f46992b);
        int iC = sg.bigo.ads.common.f.b.c();
        bVar.a("req_status", Integer.valueOf(iC));
        this.k.c(iC);
        this.k.b(this.f48147b.X());
        if (sg.bigo.ads.controller.e.h.a().f48130a) {
            bVar.a("algo_info", sg.bigo.ads.controller.e.h.a().f48133e.a(q.a(this.f48160l.l())));
        }
        bVar.a("auc_mode", Integer.valueOf(this.f48160l.v()));
        if (sg.bigo.ads.api.core.b.d(this.f48160l.b())) {
            iU = this.f48160l.q().a("splash_orientation");
        } else {
            sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f46986a;
            iU = hVar == null ? 0 : hVar.u();
        }
        bVar.a("orientation", Integer.valueOf(iU));
        Map<String, Object> mapD = this.k.d();
        if (mapD != null) {
            for (Map.Entry<String, Object> entry : mapD.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
        String str = this.k.g.f46991a;
        if (!q.a((CharSequence) str)) {
            bVar.a("load_ext", str);
        }
        String strA = d.a(this.k, this.f48147b);
        if (!TextUtils.isEmpty(strA)) {
            bVar.a("ad_info", strA);
        }
        sg.bigo.ads.common.b bVarAc = this.f48147b.ac();
        bVar.a("bat_stat", bVarAc != null ? String.valueOf(bVarAc.f47113c) : "");
        bVar.a("bat_num", bVarAc != null ? String.valueOf(bVarAc.f47111a) : "");
        bVar.a("bat_scale", bVarAc != null ? String.valueOf(bVarAc.f47112b) : "");
        bVar.a("tc_string", sg.bigo.ads.common.m.b.e());
    }
}

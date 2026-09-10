package sg.bigo.ads.controller.a.b;

import android.util.Pair;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    sg.bigo.ads.controller.e.e f47830a;

    public a(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.controller.a.a.b b() {
        return this.f47836b.f47798a.f47751i;
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final void a(final Pair<String, Integer> pair) {
        g gVar;
        if (pair == null || (gVar = this.f47837c) == null || this.d == null || this.f47838e == null) {
            return;
        }
        String strA = gVar.a();
        if (q.a((CharSequence) strA) || !sg.bigo.ads.controller.e.c.a().a(strA)) {
            sg.bigo.ads.common.t.a.a(0, 3, "GlobalConfig", "app key is empty or invalid");
            return;
        }
        this.f47839h.set(true);
        sg.bigo.ads.controller.g.h hVar = new sg.bigo.ads.controller.g.h(this.f47837c, this.f47836b, sg.bigo.ads.controller.b.e.E(), new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.a.b.a.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i2, int i3, int i4, String str, Object obj) {
                a.this.f47839h.set(false);
                a.this.a(pair, c.a(i4));
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i2, String str) {
                a.this.f47839h.set(false);
                sg.bigo.ads.controller.e.e eVar = a.this.f47830a;
                if (eVar != null) {
                    eVar.a(i2, str, true);
                }
                a.this.a(pair, false);
            }
        });
        hVar.f48151i = (String) pair.first;
        hVar.b();
    }
}

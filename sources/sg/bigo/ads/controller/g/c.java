package sg.bigo.ads.controller.g;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.controller.b.d f48161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sg.bigo.ads.common.g f48162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.api.b f48163c;
    private final sg.bigo.ads.api.a.l d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> f48164e;
    private final int f;

    public c(sg.bigo.ads.controller.b.d dVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.api.b bVar, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> eVar) {
        this.f48161a = dVar;
        this.f48162b = gVar;
        this.f48163c = bVar;
        this.d = lVar;
        this.f48164e = eVar;
        bVar.a(gVar.Q(), gVar.R(), gVar.S());
        this.f = sg.bigo.ads.common.y.a.a();
    }

    @Override // sg.bigo.ads.controller.g.i
    public final int a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    @Override // sg.bigo.ads.controller.g.i
    public final void b() throws Throwable {
        String str;
        String strA;
        String str2 = this.f48163c.f46988b;
        if (TextUtils.isEmpty(str2)) {
            a(1018, 10200, "An adm show be passed when constructing an ad request if using a server bidding slot.");
            return;
        }
        this.f48163c.c(sg.bigo.ads.common.f.b.c());
        sg.bigo.ads.common.g gVar = this.f48162b;
        if (gVar != null) {
            this.f48163c.b(gVar.X());
        }
        int[] iArr = new int[1];
        sg.bigo.ads.controller.h.a aVar = null;
        if (!TextUtils.isEmpty(str2)) {
            byte[] bArrB = sg.bigo.ads.common.j.a.b(str2, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
            if (bArrB == null) {
                iArr[0] = 1;
            } else {
                strA = sg.bigo.ads.controller.c.c.a(bArrB);
                if (TextUtils.isEmpty(strA)) {
                    iArr[0] = 2;
                } else if (!TextUtils.isEmpty(strA)) {
                    aVar = new sg.bigo.ads.controller.h.a(strA);
                }
            }
            strA = null;
            if (!TextUtils.isEmpty(strA)) {
                aVar = new sg.bigo.ads.controller.h.a(strA);
            }
        }
        if (aVar == null || !aVar.a()) {
            if (aVar != null) {
                a(1005, aVar.f48165a, aVar.f48166b);
                return;
            }
            int i2 = iArr[0];
            if (i2 == 1) {
                str = "Invalid payload response.";
            } else {
                str = i2 == 2 ? "Invalid payload data." : "Unknown payload error.";
            }
            a(1005, 10201, str);
            return;
        }
        String str3 = aVar.f48167c;
        Map<String, Object> map = aVar.d;
        if (this.f48164e != null) {
            Object obj = map.get("logid");
            sg.bigo.ads.controller.c.b bVarA = sg.bigo.ads.controller.c.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.f48163c.g, this.d, str3);
            if (bVarA == null) {
                a(1005, 0, "Empty ad data.");
            } else if (TextUtils.equals(bVarA.b(), bVarA.f47966z)) {
                this.f48164e.a(this.f, this.f48163c, bVarA);
            } else {
                a(1005, 0, "Unmatched slot of ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.b k() {
        return this.f48163c;
    }

    @Override // sg.bigo.ads.controller.g.i
    public final sg.bigo.ads.api.a.l l() {
        return this.d;
    }

    private void a(int i2, int i3, String str) {
        sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> eVar = this.f48164e;
        if (eVar != null) {
            eVar.a(this.f, i2, i3, str, this.d);
        }
    }
}

package com.smartdigimkt.y4;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.api.SDMAdConst;
import com.smartdigimkt.sdk.api.business.express.IExpressComponent;
import com.smartdigimkt.w6.l;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f40186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f40187c;
    protected com.smartdigimkt.v6.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.smartdigimkt.y4.d f40188e;
    protected l f;
    protected com.smartdigimkt.f5.a g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f40190i;
    protected IExpressComponent j;
    protected com.smartdigimkt.a5.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.smartdigimkt.l8.f f40191l;
    private com.smartdigimkt.y6.b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.smartdigimkt.a7.a f40192n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40185a = "OwnBaseAd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40189h = false;
    private final AtomicBoolean o = new AtomicBoolean(false);

    public class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.f5.c f40195a;

        public b(com.smartdigimkt.f5.c cVar) {
            this.f40195a = cVar;
        }

        @Override // com.smartdigimkt.y4.c.f
        public void a() {
            this.f40195a.a();
        }

        @Override // com.smartdigimkt.y4.c.f
        public void a(com.smartdigimkt.v3.h hVar) {
            this.f40195a.a(hVar);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.y4.c$c, reason: collision with other inner class name */
    public class C0646c implements com.smartdigimkt.z4.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f40197a;

        public C0646c(f fVar) {
            this.f40197a = fVar;
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.w6.d dVar) {
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.a5.d dVar) {
            c.this.a(dVar);
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.a5.d dVar2) {
            f fVar = this.f40197a;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v3.h hVar) {
            f fVar = this.f40197a;
            if (fVar != null) {
                fVar.a(hVar);
            }
        }
    }

    public class d implements com.smartdigimkt.z4.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.f5.c f40200b;

        public d(String str, com.smartdigimkt.f5.c cVar) {
            this.f40199a = str;
            this.f40200b = cVar;
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.a5.d dVar) {
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.w6.d dVar) {
            com.smartdigimkt.i7.b.b().a(this.f40199a, System.currentTimeMillis());
            c.this.a(dVar);
            com.smartdigimkt.f5.c cVar = this.f40200b;
            if (cVar != null) {
                cVar.b();
            }
            if (!TextUtils.isEmpty(dVar.H())) {
                com.smartdigimkt.j5.b.a().a(com.smartdigimkt.m6.b.p().k(), dVar.H());
            }
            if (TextUtils.isEmpty(dVar.C())) {
                return;
            }
            com.smartdigimkt.t3.a.a().a(com.smartdigimkt.m6.b.p().k(), dVar.C());
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.a5.d dVar2) {
            String str;
            c cVar = c.this;
            cVar.f = dVar;
            cVar.a(dVar2);
            c cVar2 = c.this;
            cVar2.k = cVar2.a(dVar, cVar2.d, dVar2);
            String str2 = "";
            com.smartdigimkt.m3.f.a(33, dVar, new com.smartdigimkt.v3.l(c.this.d, ""));
            com.smartdigimkt.i7.b.b().f(this.f40199a, System.currentTimeMillis());
            if (!TextUtils.equals(String.valueOf(c.this.d.f39164b), "0")) {
                str = str2;
            } else if (c.this.d.f39173w || dVar2 != null) {
                str2 = "1";
                str = str2;
            } else {
                str = "0";
            }
            com.smartdigimkt.i7.d.a(dVar, c.this.d, str, com.smartdigimkt.i7.b.b().a(this.f40199a), true, i.a(dVar, c.this.d));
            com.smartdigimkt.i7.b.b().b(this.f40199a);
            c.this.f40189h = true;
            com.smartdigimkt.f5.c cVar3 = this.f40200b;
            if (cVar3 != null) {
                cVar3.a();
            }
        }

        @Override // com.smartdigimkt.z4.a.g
        public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v3.h hVar) {
            com.smartdigimkt.i7.b.b().f(this.f40199a, System.currentTimeMillis());
            String str = "0";
            if (TextUtils.equals(String.valueOf(c.this.d.f39164b), "0")) {
                if (c.this.d.f39173w) {
                    str = "1";
                }
            } else {
                str = "";
            }
            com.smartdigimkt.i7.d.a(dVar, c.this.d, str, com.smartdigimkt.i7.b.b().a(this.f40199a), false, i.a(dVar, c.this.d));
            com.smartdigimkt.i7.b.b().b(this.f40199a);
            c.this.a((com.smartdigimkt.w6.f) dVar, hVar, this.f40200b, true);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40202a;

        static {
            int[] iArr = new int[g.values().length];
            f40202a = iArr;
            try {
                iArr[g.ADX_OFFER_REQUEST_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public interface f {
        void a();

        void a(com.smartdigimkt.v3.h hVar);
    }

    public enum g {
        ADX_OFFER_REQUEST_TYPE
    }

    public class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f40205b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f40206c = 2;
        public static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f40207e = 4;
        public static final int f = 5;
        public static final int g = 6;

        public h() {
        }
    }

    public c(Context context, g gVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.l8.f fVar) {
        this.f40187c = context.getApplicationContext();
        this.f40186b = gVar;
        this.d = aVar;
        this.f40191l = fVar;
        if (fVar != null) {
            this.m = fVar.D();
        }
    }

    private void b(com.smartdigimkt.f5.c cVar) {
        try {
            com.smartdigimkt.v6.a aVar = this.d;
            if (aVar != null && !TextUtils.isEmpty(aVar.f39163a) && !TextUtils.isEmpty(this.d.f39168i)) {
                String strA = com.smartdigimkt.i7.b.b().a(this.d);
                com.smartdigimkt.i7.b.b().g(strA, System.currentTimeMillis());
                com.smartdigimkt.z4.a.a(this.f40187c).a(this.d, this.m, this.f40188e, new d(strA, cVar));
                return;
            }
            if (cVar != null) {
                cVar.a(com.smartdigimkt.v3.i.a("30001", "bidid、placementid can not be null!"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (cVar != null) {
                cVar.a(com.smartdigimkt.v3.i.a("-9999", th.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Map<String, Object> map = this.f40190i;
        if (map != null) {
            map.put("cached_ad_material_type", Integer.valueOf(j()));
            if (this.f == null || f() == null || !f().f0()) {
                return;
            }
            this.f40190i.put("sdm_ad_title", this.f.g0());
            this.f40190i.put("sdm_ad_desc", this.f.r());
            this.f40190i.put("sdm_ad_image_url", this.f.N0());
            this.f40190i.put("sdm_ad_video_url", this.f.k0());
            this.f40190i.put("sdm_ad_click_url", this.f.k());
            this.f40190i.put("sdm_ad_package_name", this.f.X());
        }
    }

    public boolean a(int i2) {
        return i2 == -1;
    }

    public void c() {
        com.smartdigimkt.a5.c cVar = this.k;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    public Map<String, Object> e() {
        return this.f40190i;
    }

    public com.smartdigimkt.a7.a f() {
        return this.f40192n;
    }

    public com.smartdigimkt.w6.f g() {
        return this.f;
    }

    public com.smartdigimkt.v6.a h() {
        return this.d;
    }

    public com.smartdigimkt.y6.b i() {
        return this.m;
    }

    public int j() {
        return i.a(this.f, this.d);
    }

    public int k() {
        if (e.f40202a[this.f40186b.ordinal()] != 1) {
            return 3;
        }
        if (this.f == null) {
            this.f = com.smartdigimkt.z4.a.a(this.f40187c).a(this.d);
        }
        l lVar = this.f;
        if (lVar == null) {
            return 0;
        }
        if (lVar.U0()) {
            return 1;
        }
        if (this.k == null) {
            this.k = a(this.f, this.d, null);
        }
        if (this.o.get()) {
            return 2;
        }
        if (this.f40189h) {
            return -1;
        }
        com.smartdigimkt.a5.c cVar = this.k;
        if (cVar == null || !cVar.isAdReady()) {
            return 3;
        }
        this.f40189h = true;
        return -1;
    }

    public com.smartdigimkt.l8.f l() {
        return this.f40191l;
    }

    public boolean m() {
        return a(k());
    }

    public boolean n() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar.U0();
        }
        return System.currentTimeMillis() >= this.d.f39171p;
    }

    public void o() {
        com.smartdigimkt.y6.b bVar;
        if (!this.o.compareAndSet(false, true) || (bVar = this.m) == null || TextUtils.isEmpty(bVar.f40233e)) {
            return;
        }
        com.smartdigimkt.p6.b.b().c(com.smartdigimkt.m6.b.p().k(), this.m.f40233e);
    }

    public class a implements com.smartdigimkt.f5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.f5.c f40193a;

        public a(com.smartdigimkt.f5.c cVar) {
            this.f40193a = cVar;
        }

        @Override // com.smartdigimkt.f5.c
        public void a() {
            c.this.d();
            com.smartdigimkt.f5.c cVar = this.f40193a;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.smartdigimkt.f5.c
        public void b() {
            com.smartdigimkt.f5.c cVar = this.f40193a;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.smartdigimkt.f5.c
        public void a(com.smartdigimkt.v3.h hVar) {
            com.smartdigimkt.f5.c cVar = this.f40193a;
            if (cVar != null) {
                cVar.a(hVar);
            }
        }
    }

    public void a(com.smartdigimkt.y4.d dVar) {
        this.f40188e = dVar;
    }

    public void a(com.smartdigimkt.f5.a aVar) {
        com.smartdigimkt.f5.g gVar = new com.smartdigimkt.f5.g(this, aVar);
        this.g = gVar;
        com.smartdigimkt.a5.c cVar = this.k;
        if (cVar != null) {
            cVar.a(gVar);
        }
    }

    public boolean b() {
        com.smartdigimkt.w6.g gVar;
        com.smartdigimkt.v6.a aVar = this.d;
        return aVar == null || (gVar = aVar.t) == null || gVar.X() <= 0;
    }

    public void a(com.smartdigimkt.a7.a aVar) {
        this.f40192n = aVar;
    }

    public void a(com.smartdigimkt.f5.c cVar) {
        a aVar = new a(cVar);
        Map<String, Object> map = this.f40190i;
        int iA = 0;
        if (map != null && !map.isEmpty()) {
            iA = com.smartdigimkt.n8.h.a(this.f40190i, SDMAdConst.EXTRA_PARAMS.E_L_PARAMS, 0);
        }
        if (iA != 1) {
            b(aVar);
        } else {
            a(new b(aVar));
        }
    }

    public void a() {
        a((f) null);
    }

    public void a(f fVar) {
        boolean zM = m();
        com.smartdigimkt.e5.a.a(this.d, this.f, this.f40188e);
        if (zM) {
            if (fVar != null) {
                fVar.a();
            }
        } else if (this.d != null) {
            com.smartdigimkt.z4.a.a(this.f40187c).a(this.f, this.d, this.f40188e, new C0646c(fVar));
        }
    }

    public String a(l lVar) {
        return this.d.f39163a + this.d.f39166e + this.d.j + lVar.L() + System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.a5.d dVar) {
        if (dVar == null || !(dVar instanceof com.smartdigimkt.c5.b)) {
            return;
        }
        this.j = com.smartdigimkt.c5.a.b() ? com.smartdigimkt.c5.a.a().createExpressComponent(this.f40187c, this.d, this.f, (com.smartdigimkt.c5.b) dVar) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v3.h hVar, com.smartdigimkt.f5.c cVar, boolean z2) {
        if (fVar != null) {
            com.smartdigimkt.m3.f.a(34, fVar, new com.smartdigimkt.v3.l(this.d, ""));
        }
        if (z2) {
            try {
                com.smartdigimkt.p6.b.b().c(com.smartdigimkt.m6.b.p().k(), this.d.f39168i);
            } catch (Throwable unused) {
            }
        }
        if (cVar != null) {
            cVar.a(hVar);
        }
    }

    public void a(com.smartdigimkt.w6.d dVar) {
        if (dVar.X0() == 1) {
            com.smartdigimkt.p6.d.b().a();
            if (com.smartdigimkt.n8.h.b(this.f40187c, dVar.X())) {
                dVar.K0();
                dVar.X();
                com.smartdigimkt.p6.d.b().a(dVar);
            } else {
                dVar.K0();
                dVar.X();
                com.smartdigimkt.p6.d.b().b(dVar);
            }
        }
    }

    public void a(Map<String, Object> map) {
        this.f40190i = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.smartdigimkt.a5.c a(l lVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.a5.d dVar) {
        if (!TextUtils.isEmpty(((com.smartdigimkt.w6.d) this.f).W0())) {
            IExpressComponent iExpressComponent = this.j;
            if (iExpressComponent != null) {
                return new com.smartdigimkt.a5.b(iExpressComponent);
            }
            return null;
        }
        return new com.smartdigimkt.a5.a(lVar, aVar);
    }
}

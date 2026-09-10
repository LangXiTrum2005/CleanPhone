package com.smartdigimkt.o3;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.smartdigimkt.o3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.k7.c f37347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37348i;
    WeakReference<View> j;
    private final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f37349l;

    public class a implements com.smartdigimkt.n3.b {
        public a() {
        }

        @Override // com.smartdigimkt.n3.b
        public void a(long j) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            d dVar = d.this;
            com.smartdigimkt.v6.a aVar = dVar.d;
            com.smartdigimkt.i7.d.a(aVar, aVar.f39164b, dVar.f37330c, j, jCurrentTimeMillis);
        }
    }

    public class b implements com.smartdigimkt.n3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37353c;

        public class a extends com.smartdigimkt.k7.a {
            public a() {
            }

            @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
            public int getImpressionMinPercentageViewed() {
                return 50;
            }

            @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
            public void recordImpression(View view) throws Throwable {
                if (!TextUtils.isEmpty(b.this.f37351a)) {
                    b bVar = b.this;
                    if (!bVar.f37352b.equals(bVar.f37351a)) {
                        b bVar2 = b.this;
                        int i2 = bVar2.f37353c;
                        if (i2 != 2 && i2 != 3) {
                            d dVar = d.this;
                            String str = dVar.f37328a;
                            com.smartdigimkt.i7.d.a(dVar.d, dVar.f37330c, bVar2.f37352b, bVar2.f37351a, 2);
                            return;
                        } else {
                            if (System.currentTimeMillis() - d.this.f37348i > 5000) {
                                String str2 = d.this.f37328a;
                                return;
                            }
                            b bVar3 = b.this;
                            d dVar2 = d.this;
                            com.smartdigimkt.i7.d.a(dVar2.d, dVar2.f37330c, bVar3.f37352b, bVar3.f37351a, 0);
                            if (d.this.d.t.O() != 1) {
                                String str3 = d.this.f37328a;
                                return;
                            } else {
                                if (d.this.f37349l != null) {
                                    d.this.f37349l.a(d.this.f37349l.c(), e.HANDLE_DEEPLINK_REFUSE);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                b bVar4 = b.this;
                d dVar3 = d.this;
                String str4 = dVar3.f37328a;
                com.smartdigimkt.i7.d.a(dVar3.d, dVar3.f37330c, bVar4.f37352b, bVar4.f37351a, 1);
            }
        }

        public b(String str, String str2, int i2) {
            this.f37351a = str;
            this.f37352b = str2;
            this.f37353c = i2;
        }

        @Override // com.smartdigimkt.n3.c
        public void a(boolean z2) {
            d dVar = d.this;
            String str = dVar.f37328a;
            if (!z2) {
                com.smartdigimkt.i7.d.a(dVar.d, dVar.f37330c, this.f37352b, this.f37351a, 3);
                return;
            }
            WeakReference<View> weakReference = dVar.j;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null) {
                String str2 = d.this.f37328a;
                return;
            }
            if (d.this.f37347h != null) {
                d.this.f37347h.b();
                d.this.f37347h = null;
            }
            a aVar = new a();
            com.smartdigimkt.w6.f fVar = d.this.f37330c;
            d.this.f37347h = new com.smartdigimkt.k7.c((fVar == null || fVar.i() == null) ? 1 : d.this.f37330c.i().M1(), view.getContext(), 0);
            d.this.f37347h.a(view, aVar);
        }
    }

    public d(com.smartdigimkt.o3.a.C0557a c0557a) {
        super(c0557a);
        this.f37348i = 0L;
        this.k = 5000L;
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public void destroy() {
        super.destroy();
        com.smartdigimkt.k7.c cVar = this.f37347h;
        if (cVar != null) {
            cVar.b();
            this.f37347h = null;
        }
    }

    public void a(WeakReference<View> weakReference) {
        this.j = weakReference;
    }

    public void a(c cVar) {
        this.f37349l = cVar;
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public n a() {
        k kVar;
        n nVarA;
        k kVar2 = this.f37331e;
        if (kVar2 == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        com.smartdigimkt.v3.l lVarA = kVar2.a();
        if (lVarA == null) {
            return n.a(false, "DeeplinkClickAction empty mOfferClickReportNotify");
        }
        lVarA.k = new com.smartdigimkt.v3.b();
        com.smartdigimkt.v3.g gVarB = b();
        lVarA.k.f39077a = gVarB != null ? gVarB.f39093c : "";
        com.smartdigimkt.m3.f.a(23, this.f37330c, lVarA);
        if (!TextUtils.isEmpty(this.f37330c.X()) && this.f37330c.j() == 1 && (nVarA = a(lVarA)) != null) {
            return nVarA;
        }
        if (!TextUtils.isEmpty(this.f37330c.q())) {
            String strQ = this.f37330c.q();
            String str = this.d.f;
            String strReplaceAll = strQ.replaceAll("\\{req_id\\}", str != null ? str : "");
            com.smartdigimkt.o6.a.b().a(this.f37330c);
            com.smartdigimkt.m3.e eVarA = com.smartdigimkt.q3.d.a(this.f37329b, strReplaceAll, this.f37330c, this.d);
            int iA = eVarA.a();
            if (iA == 0) {
                lVarA.k.f39078b = 1;
            } else if (iA != 1) {
                lVarA.k.f39078b = 3;
            } else {
                lVarA.k.f39078b = 2;
            }
            if (eVarA.a() == 0) {
                if (this.f37330c.j() == 1) {
                    com.smartdigimkt.m3.f.a(this.f37329b, this.f37330c);
                }
                boolean z2 = this.f37330c.i() == null || this.f37330c.i().G1() != 1;
                k kVar3 = this.f37331e;
                if (kVar3 != null) {
                    kVar3.b();
                }
                new f(this.f37330c, this.d, strReplaceAll, lVarA, this.f37331e).b();
                com.smartdigimkt.i7.d.a(this.d, this.f37330c, strReplaceAll, "1", 0, 0, eVarA.b());
                com.smartdigimkt.o3.b bVar = this.f;
                if (bVar != null) {
                    bVar.clickStartUI();
                    this.f.clickCallback();
                    this.f.deeplinkCallback(true);
                    this.f.clickEndUI();
                }
                com.smartdigimkt.k3.c.d().a(new a());
                if (z2 && (kVar = this.f37331e) != null) {
                    kVar.c();
                }
                if (com.smartdigimkt.m3.i.h(this.f37330c, this.d) != 1) {
                    a(lVarA, strReplaceAll);
                }
                return n.a(true, "DeeplinkClickAction execute success");
            }
            com.smartdigimkt.o6.a.b().b(this.f37330c);
            if (eVarA.a() == 1) {
                com.smartdigimkt.m3.f.a(29, this.f37330c, lVarA);
            } else {
                com.smartdigimkt.m3.f.a(28, this.f37330c, lVarA);
            }
            com.smartdigimkt.i7.d.a(this.d, this.f37330c, strReplaceAll, "0", 0, eVarA.a(), eVarA.b());
        }
        return n.a(false, "DeeplinkClickAction execute fail");
    }

    private void a(com.smartdigimkt.v3.l lVar, String str) {
        String strK = this.f37330c.k();
        int iJ = this.f37330c.j();
        this.f37348i = System.currentTimeMillis();
        com.smartdigimkt.k3.c.d().a(new b(strK, str, iJ));
    }
}

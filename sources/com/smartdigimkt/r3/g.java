package com.smartdigimkt.r3;

import android.text.TextUtils;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.v3.l;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38063c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38064e;
    private com.smartdigimkt.w6.f f;
    private com.smartdigimkt.w6.g g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.smartdigimkt.v6.a f38065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.g7.a f38066i;
    long j;
    String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    com.smartdigimkt.g7.a.C0494a f38067l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f38061a = com.smartdigimkt.y4.g.f40227p;
    private long m = 0;

    public class b extends com.smartdigimkt.g7.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f38071a;

        public b(com.smartdigimkt.w6.f fVar) {
            this.f38071a = fVar;
        }

        @Override // com.smartdigimkt.g7.a.c
        public void a(long j, long j2, long j3, long j4, long j5) {
            com.smartdigimkt.m3.f.a(30, this.f38071a, new l("", "", ""));
        }

        @Override // com.smartdigimkt.g7.a.c
        public void a(String str, String str2, long j, long j2, long j3, long j4) {
            e.a().a(g.this.f38062b, i.a(str, str2));
        }
    }

    public g(String str, com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar, com.smartdigimkt.v6.a aVar) {
        this.k = "";
        this.f38062b = fVar.k0();
        this.f = fVar;
        this.g = gVar;
        this.f38065h = aVar;
        this.f38063c = str;
        this.d = fVar.L();
        this.f38064e = fVar.O();
        if (fVar instanceof com.smartdigimkt.w6.l) {
            this.k = ((com.smartdigimkt.w6.l) fVar).I0();
        }
        this.f38066i = com.smartdigimkt.g7.c.a().a(this.f38062b);
        this.j = 0L;
        if (TextUtils.equals(String.valueOf(gVar.Z()), "4") && gVar.E1() != 1 && gVar.F0() > 0) {
            this.j = gVar.z1();
        }
        this.f38066i.a(new com.smartdigimkt.g7.b(this.g.F0(), this.g.K1(), this.j));
        this.f38066i.a(new a(fVar, aVar));
        this.f38066i.a(new b(fVar));
    }

    public void a() {
        this.m = System.currentTimeMillis();
        this.f38066i.n();
    }

    public class a extends com.smartdigimkt.g7.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f38068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f38069b;

        public a(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
            this.f38068a = fVar;
            this.f38069b = aVar;
        }

        @Override // com.smartdigimkt.g7.a.b
        public boolean a(int i2, long j, long j2) {
            if (i2 < g.this.g.F0()) {
                return false;
            }
            if (g.this.f38067l != null) {
                com.smartdigimkt.i7.d.a(this.f38068a, this.f38069b, true, "", j2, j, System.currentTimeMillis() - g.this.m, g.this.f38067l.d(), g.this.f38067l.a(), g.this.f38067l.b());
            } else {
                com.smartdigimkt.i7.d.a(this.f38068a, this.f38069b, j2, j, System.currentTimeMillis() - g.this.m);
            }
            e.a().a(g.this.f38062b, i2);
            return true;
        }

        @Override // com.smartdigimkt.g7.a.b
        public void a(String str, String str2) {
            com.smartdigimkt.i7.d.a(this.f38068a, this.f38069b, str2);
        }

        @Override // com.smartdigimkt.g7.a.b
        public void a(com.smartdigimkt.g7.a.C0494a c0494a) {
            if (c0494a != null) {
                g gVar = g.this;
                gVar.f38067l = c0494a;
                long j = gVar.j;
                if (j <= 0 || j != c0494a.c()) {
                    return;
                }
                g gVar2 = g.this;
                String str = gVar2.f38061a;
                String unused = gVar2.d;
                String unused2 = g.this.f38062b;
                c0494a.d();
                c0494a.b();
                g.this.g.k0(g.this.f38067l.b());
            }
        }
    }
}

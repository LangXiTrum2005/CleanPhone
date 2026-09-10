package com.smartdigimkt.o3;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.w6.f f37388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.v6.a f37389c;
    private com.smartdigimkt.v3.l d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37390e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37387a = "k";
    private boolean f = false;
    private boolean g = false;

    public k(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        com.smartdigimkt.w6.g gVar;
        this.f37388b = fVar;
        this.f37389c = aVar;
        this.f37390e = false;
        if (aVar == null || (gVar = aVar.t) == null) {
            return;
        }
        this.f37390e = gVar.C() != 2;
    }

    public void a(com.smartdigimkt.v3.l lVar) {
        this.d = lVar;
    }

    public synchronized void b() {
        if (this.d == null) {
            return;
        }
        if (this.f37390e || !this.f) {
            this.f = true;
            com.smartdigimkt.w6.f fVar = this.f37388b;
            if (fVar == null || !(fVar instanceof com.smartdigimkt.w6.l) || !((com.smartdigimkt.w6.l) fVar).U0() || this.f37388b.i() == null || this.f37388b.i().A() == 2) {
                com.smartdigimkt.m3.f.a(9, this.f37388b, this.d);
            }
        }
    }

    public synchronized void c() {
        if (this.f37390e || !this.g) {
            this.g = true;
            com.smartdigimkt.w6.f fVar = this.f37388b;
            if (fVar == null || !(fVar instanceof com.smartdigimkt.w6.l) || !((com.smartdigimkt.w6.l) fVar).U0() || this.f37388b.i() == null || this.f37388b.i().A() == 2) {
                com.smartdigimkt.m3.f.a(24, this.f37388b, this.d);
            }
        }
    }

    public com.smartdigimkt.v3.l a() {
        return this.d;
    }
}

package kd;

import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f44604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f44605c;

    public /* synthetic */ f(g gVar, h hVar, int i10) {
        this.f44603a = i10;
        this.f44604b = gVar;
        this.f44605c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44603a) {
            case 0:
                h hVar = this.f44605c;
                g gVar = this.f44604b;
                nd.f fVarB = gVar.b(hVar);
                if (fVarB != null) {
                    gVar.f44608b.add(fVarB);
                }
                break;
            default:
                h hVar2 = this.f44605c;
                g gVar2 = this.f44604b;
                nd.f fVarB2 = gVar2.b(hVar2);
                if (fVarB2 != null) {
                    gVar2.f44608b.add(fVarB2);
                }
                break;
        }
    }
}

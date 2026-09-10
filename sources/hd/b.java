package hd;

import nd.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f42316c;

    public b(u uVar) {
        this.f42316c = uVar;
    }

    @Override // hd.e
    public final boolean a() {
        u uVar = this.f42316c;
        if (!uVar.hasSessionId()) {
            return false;
        }
        if (uVar.m() > 0 || uVar.l() > 0) {
            return true;
        }
        return uVar.p() && uVar.o().l();
    }
}

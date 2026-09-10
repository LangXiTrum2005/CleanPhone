package ae;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.google.gson.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.google.gson.t f3492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.d f3495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe.a f3496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3497f;

    public d(e eVar, boolean z10, boolean z11, com.google.gson.d dVar, fe.a aVar) {
        this.f3497f = eVar;
        this.f3493b = z10;
        this.f3494c = z11;
        this.f3495d = dVar;
        this.f3496e = aVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (this.f3493b) {
            aVar.N();
            return null;
        }
        com.google.gson.t tVarD = this.f3492a;
        if (tVarD == null) {
            tVarD = this.f3495d.d(this.f3497f, this.f3496e);
            this.f3492a = tVarD;
        }
        return tVarD.b(aVar);
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        if (this.f3494c) {
            bVar.s();
            return;
        }
        com.google.gson.t tVarD = this.f3492a;
        if (tVarD == null) {
            tVarD = this.f3495d.d(this.f3497f, this.f3496e);
            this.f3492a = tVarD;
        }
        tVarD.c(bVar, obj);
    }
}

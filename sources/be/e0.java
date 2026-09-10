package be;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.f f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.d f5614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fe.a f5615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.gson.u f5616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile com.google.gson.t f5618f;

    public e0(com.google.gson.f fVar, com.google.gson.d dVar, fe.a aVar, com.google.gson.u uVar, boolean z10) {
        this.f5613a = fVar;
        this.f5614b = dVar;
        this.f5615c = aVar;
        this.f5616d = uVar;
        this.f5617e = z10;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) {
        if (this.f5613a == null) {
            com.google.gson.t tVarD = this.f5618f;
            if (tVarD == null) {
                tVarD = this.f5614b.d(this.f5616d, this.f5615c);
                this.f5618f = tVarD;
            }
            return tVarD.b(aVar);
        }
        com.google.gson.g gVarI = ae.i.i(aVar);
        if (this.f5617e) {
            gVarI.getClass();
            if (gVarI instanceof com.google.gson.i) {
                return null;
            }
        }
        Type type = this.f5615c.f40810b;
        try {
            return ScheduleMode.valueOf(gVarI.m());
        } catch (Exception unused) {
            return gVarI.b() ? ScheduleMode.exactAllowWhileIdle : ScheduleMode.exact;
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) {
        com.google.gson.t tVarD = this.f5618f;
        if (tVarD == null) {
            tVarD = this.f5614b.d(this.f5616d, this.f5615c);
            this.f5618f = tVarD;
        }
        tVarD.c(bVar, obj);
    }

    @Override // be.c0
    public final com.google.gson.t d() {
        com.google.gson.t tVar = this.f5618f;
        if (tVar != null) {
            return tVar;
        }
        com.google.gson.t tVarD = this.f5614b.d(this.f5616d, this.f5615c);
        this.f5618f = tVarD;
        return tVarD;
    }
}

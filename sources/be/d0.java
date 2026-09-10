package be;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements com.google.gson.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fe.a f5610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.gson.f f5612c;

    public d0(ScheduleMode.a aVar, fe.a aVar2, boolean z10) {
        this.f5612c = aVar;
        this.f5610a = aVar2;
        this.f5611b = z10;
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        fe.a aVar2 = this.f5610a;
        if (aVar2.equals(aVar) || (this.f5611b && aVar2.f40810b == aVar.f40809a)) {
            return new e0(this.f5612c, dVar, aVar, this, true);
        }
        return null;
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oh extends qh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh f23823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh f23824d;

    public oh(qh qhVar, qh qhVar2) {
        this.f23823c = qhVar;
        this.f23824d = qhVar2;
    }

    @Override // com.google.android.gms.internal.measurement.qh
    public final void a() {
        qh qhVar = this.f23824d;
        try {
            this.f23823c.a();
        } finally {
            qhVar.a();
        }
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gd extends jd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile double f23513e;

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.f23513e);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ void e(Object obj) {
        this.f23513e = ((Double) obj).doubleValue();
    }
}

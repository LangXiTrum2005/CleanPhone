package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends jd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f23547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23548f;

    public hd(String str, i9.i iVar, long j10) {
        super(str, iVar);
        this.f23548f = j10;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f23548f);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.f23547e);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ void e(Object obj) {
        this.f23547e = ((Long) obj).longValue();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends jd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f23461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23462f;

    public fd(String str, i9.i iVar, boolean z10) {
        super(str, iVar);
        this.f23462f = z10;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f23462f);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.f23461e);
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final /* synthetic */ void e(Object obj) {
        this.f23461e = ((Boolean) obj).booleanValue();
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f19739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f19740f;

    public final sz0 a() {
        String str;
        if (this.f19740f == 63 && (str = this.f19735a) != null) {
            return new sz0(str, this.f19736b, this.f19737c, this.f19738d, this.f19739e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f19735a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f19740f & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f19740f & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f19740f & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.f19740f & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.f19740f & 16) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.f19740f & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

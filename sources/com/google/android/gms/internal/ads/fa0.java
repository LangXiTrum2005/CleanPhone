package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fa0 implements zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zze f14351b;

    public /* synthetic */ fa0(int i10, zze zzeVar) {
        this.f14350a = i10;
        this.f14351b = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo160zza(Object obj) {
        switch (this.f14350a) {
            case 0:
                ((ha0) obj).j0(this.f14351b);
                break;
            default:
                ((ia0) obj).zzc(this.f14351b);
                break;
        }
    }
}

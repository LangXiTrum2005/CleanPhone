package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16161e;

    public jr0(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f16157a = str;
        this.f16158b = z10;
        this.f16159c = z11;
        this.f16160d = z12;
        this.f16161e = z13;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f16157a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z10 = this.f16158b;
        bundle.putInt("test_mode", z10 ? 1 : 0);
        boolean z11 = this.f16159c;
        bundle.putInt("linked_device", z11 ? 1 : 0);
        if (z10 || z11) {
            if (((Boolean) zzba.zzc().a(am.La)).booleanValue()) {
                bundle.putInt("risd", !this.f16160d ? 1 : 0);
            }
            if (((Boolean) zzba.zzc().a(am.Pa)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f16161e);
            }
        }
    }
}

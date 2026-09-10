package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19635b;

    public /* synthetic */ rp0(boolean z10, int i10) {
        this.f19634a = i10;
        this.f19635b = z10;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f19634a) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != this.f19635b ? "0" : "1");
                break;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", this.f19635b);
                break;
            case 2:
                ((Bundle) obj).putBoolean("is_gbid", this.f19635b);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (this.f19635b) {
                    bundle.putBoolean("sdk_prefetch", true);
                }
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14517a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f14519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14520d;

    public fr0(String str, Bundle bundle, String str2) {
        this.f14518b = str;
        this.f14519c = bundle;
        this.f14520d = str2;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f14517a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                bundle.putString("consent_string", this.f14518b);
                bundle.putString("fc_consent", this.f14520d);
                Bundle bundle2 = this.f14519c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                bundle3.putString("rtb", this.f14518b);
                if (((Boolean) zzba.zzc().a(am.f12238l5)).booleanValue()) {
                    String str = this.f14520d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.f14519c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                }
                break;
        }
    }

    public /* synthetic */ fr0(String str, String str2, Bundle bundle) {
        this.f14518b = str;
        this.f14520d = str2;
        this.f14519c = bundle;
    }
}

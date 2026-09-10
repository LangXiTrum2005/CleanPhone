package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.X3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f14507b;

    public /* synthetic */ fq0(int i10, Bundle bundle) {
        this.f14506a = i10;
        this.f14507b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f14506a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = this.f14507b;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle("installed_adapter_data", bundle2);
                }
                break;
            case 1:
                Bundle bundle3 = (Bundle) obj;
                Bundle bundleB = rb0.b(bundle3, X3.i.G);
                bundleB.putBundle("android_mem_info", this.f14507b);
                bundle3.putBundle(X3.i.G, bundleB);
                break;
            case 2:
                Bundle bundle4 = (Bundle) obj;
                Bundle bundle5 = this.f14507b;
                if (bundle5 != null) {
                    bundle4.putAll(bundle5);
                }
                break;
            case 3:
                Bundle bundle6 = (Bundle) obj;
                Bundle bundle7 = this.f14507b;
                if (!bundle7.isEmpty()) {
                    bundle6.putBundle("shared_pref", bundle7);
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle8 = this.f14507b;
                if (bundle8 != null) {
                    try {
                        zzbp.zzh(zzbp.zzh(jSONObject, X3.i.G), "play_store").put("parental_controls", zzay.zza().zzo(bundle8));
                    } catch (JSONException unused) {
                        zze.zza("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }
}

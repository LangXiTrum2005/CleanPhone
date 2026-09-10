package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12501c;

    public /* synthetic */ ar0(int i10, Object obj, Object obj2) {
        this.f12499a = i10;
        this.f12500b = obj;
        this.f12501c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        switch (this.f12499a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f12500b;
                Bundle bundle = (Bundle) obj;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f12501c;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                }
                break;
            default:
                try {
                    JSONObject jSONObjectZzh = zzbp.zzh((JSONObject) obj, "pii");
                    jSONObjectZzh.put("doritos", (String) this.f12500b);
                    jSONObjectZzh.put("doritos_v2", (String) this.f12501c);
                } catch (JSONException unused) {
                    zze.zza("Failed putting doritos string.");
                }
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yp0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22345b;

    public /* synthetic */ yp0(String str, int i10) {
        this.f22344a = i10;
        this.f22345b = str;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10 = this.f22344a;
        String str = this.f22345b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    bundle.putString("arek", str);
                }
                break;
            case 1:
                ((Bundle) obj).putString("ms", str);
                break;
            case 2:
                rb0.F("key_schema", (Bundle) obj, str);
                break;
            case 3:
                rb0.F("omid_v", (Bundle) obj, str);
                break;
            case 4:
                ((Bundle) obj).putString("request_id", str);
                break;
            case 5:
                try {
                    ((JSONObject) obj).put("ms", str);
                } catch (JSONException e10) {
                    zze.zzb("Failed putting Ad ID.", e10);
                    return;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        zzbp.zzh(jSONObject, "pii").put("adsid", str);
                    }
                } catch (JSONException e11) {
                    int i11 = zze.zza;
                    zzo.zzj("Failed putting trustless token.", e11);
                }
                break;
        }
    }
}

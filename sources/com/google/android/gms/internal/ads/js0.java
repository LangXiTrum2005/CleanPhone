package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f16174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2.i0 f16176c;

    public js0(AdvertisingIdClient.Info info, String str, b2.i0 i0Var) {
        this.f16174a = info;
        this.f16175b = str;
        this.f16176c = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        try {
            JSONObject jSONObjectZzh = zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f16174a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f16175b;
                if (str != null) {
                    jSONObjectZzh.put("pdid", str);
                    jSONObjectZzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzh.put("rdid", info.getId());
            jSONObjectZzh.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzh.put("idtype", "adid");
            b2.i0 i0Var = this.f16176c;
            long j10 = i0Var.f5301b;
            String str2 = i0Var.f5300a;
            if (str2 != null && j10 > 0) {
                jSONObjectZzh.put("paidv1_id_android_3p", str2);
                jSONObjectZzh.put("paidv1_creation_time_android_3p", j10);
            }
        } catch (JSONException e10) {
            zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}

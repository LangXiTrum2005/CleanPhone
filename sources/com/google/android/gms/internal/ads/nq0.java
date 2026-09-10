package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17915c;

    public /* synthetic */ nq0(String str, int i10, int i11) {
        this.f17913a = i11;
        this.f17914b = str;
        this.f17915c = i10;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        int i11;
        switch (this.f17913a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f17914b;
                if (!TextUtils.isEmpty(str) && (i10 = this.f17915c) != -1) {
                    Bundle bundleB = rb0.b(bundle, "pii");
                    bundle.putBundle("pii", bundleB);
                    bundleB.putString("pvid", str);
                    bundleB.putInt("pvid_s", i10);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) zzba.zzc().a(am.f12070ac)).booleanValue()) {
                    String str2 = this.f17914b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i12 = this.f17915c;
                    if (i12 != -1) {
                        bundle2.putInt("atps", i12);
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f17914b;
                if (!TextUtils.isEmpty(str3) && (i11 = this.f17915c) != -1) {
                    try {
                        JSONObject jSONObjectZzh = zzbp.zzh(jSONObject, "pii");
                        jSONObjectZzh.put("pvid", str3);
                        jSONObjectZzh.put("pvid_s", i11);
                    } catch (JSONException e10) {
                        zze.zzb("Failed putting gms core app set ID info.", e10);
                    }
                    break;
                }
                break;
        }
    }
}

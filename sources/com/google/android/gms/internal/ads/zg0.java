package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zg0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z90 f22603b;

    public /* synthetic */ zg0(z90 z90Var, int i10) {
        this.f22602a = i10;
        this.f22603b = z90Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        String strValueOf;
        zzc zzcVar;
        switch (this.f22602a) {
            case 0:
                return this.f22603b.a().f18374p.f38703b == 3 ? qj.REWARDED_INTERSTITIAL : qj.REWARD_BASED_VIDEO_AD;
            case 1:
                return this.f22603b.a().f18374p.f38703b == 3 ? "rewarded_interstitial" : "rewarded";
            case 2:
                zzm zzmVar = this.f22603b.a().f18363d;
                if (((Boolean) zzba.zzc().a(am.f12329r8)).booleanValue()) {
                    String str = zzmVar.zzx;
                    if (TextUtils.isEmpty(str)) {
                        zzcVar = zzmVar.zzs;
                        if (zzcVar != null) {
                            strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                            if (TextUtils.isEmpty(strValueOf)) {
                                strValueOf = String.valueOf(zzay.zzh().nextInt() & Integer.MAX_VALUE);
                            }
                        } else {
                            strValueOf = String.valueOf(zzay.zzh().nextInt() & Integer.MAX_VALUE);
                        }
                    } else {
                        try {
                            strValueOf = new JSONObject(str).getString("request_id");
                            if (TextUtils.isEmpty(strValueOf)) {
                                zzcVar = zzmVar.zzs;
                                if (zzcVar != null) {
                                    try {
                                        strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                                        if (TextUtils.isEmpty(strValueOf)) {
                                            strValueOf = String.valueOf(zzay.zzh().nextInt() & Integer.MAX_VALUE);
                                        }
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    strValueOf = String.valueOf(zzay.zzh().nextInt() & Integer.MAX_VALUE);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                } else {
                    strValueOf = String.valueOf(zzay.zzh().nextInt() & Integer.MAX_VALUE);
                }
                ic1.h(strValueOf);
                return strValueOf;
            case 3:
                return new qp0(this.f22603b.a(), 2);
            default:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new xp0(k00Var, this.f22603b.a(), 1);
        }
    }
}

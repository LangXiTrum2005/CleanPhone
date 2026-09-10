package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecl implements zzijg {
    private final zzijp zza;

    private zzecl(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzecl zza(zzijp zzijpVar) {
        return new zzecl(zzijpVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        com.google.android.gms.ads.internal.client.zzc zzcVar;
        zzfik zzfikVarZza = ((zzdab) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzie)).booleanValue()) {
            String str = zzfikVarZza.zzd.zzx;
            if (TextUtils.isEmpty(str)) {
                zzcVar = zzfikVarZza.zzd.zzs;
                if (zzcVar != null) {
                    strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                    }
                } else {
                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                }
            } else {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        zzcVar = zzfikVarZza.zzd.zzs;
                        if (zzcVar != null) {
                            try {
                                strValueOf = new JSONObject(zzcVar.zza).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        } else {
            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.zzh().nextInt() & Integer.MAX_VALUE);
        }
        zzijo.zzb(strValueOf);
        return strValueOf;
    }
}

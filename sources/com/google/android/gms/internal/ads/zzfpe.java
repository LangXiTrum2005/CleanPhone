package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpe {
    private final zzemr zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfid zzf;
    private final zzfie zzg;
    private final Clock zzh;
    private final zzayq zzi;

    public zzfpe(zzemr zzemrVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfid zzfidVar, zzfie zzfieVar, Clock clock, zzayq zzayqVar) {
        this.zza = zzemrVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfidVar;
        this.zzg = zzfieVar;
        this.zzh = clock;
        this.zzi = zzayqVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfic zzficVar, zzfhr zzfhrVar, List list) {
        return zzb(zzficVar, zzfhrVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    public final List zzb(zzfic zzficVar, zzfhr zzfhrVar, boolean z2, String str, String str2, List list, zzcze zzczeVar, zzcdb zzcdbVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z3 = true;
            String strZzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzficVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z2 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfhrVar != null) {
                String strZzd2 = zzd(zzd(zzd(strZzd, "@gw_qdata@", zzfhrVar.zzy), "@gw_adnetid@", zzfhrVar.zzx), "@gw_allocid@", zzfhrVar.zzw);
                Context context = this.zze;
                strZzd = zzcby.zza(strZzd2, context, zzfhrVar.zzW, zzfhrVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoT)).booleanValue() && zzfhrVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    strZzd = zzd(strZzd, "@gw_aps@", true != com.google.android.gms.ads.internal.util.zzs.zzL(context) ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpe)).booleanValue() && zzcdbVar != null) {
                    int i2 = zzcdbVar.zza;
                    String strZzd3 = zzd(strZzd, "@gw_is@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcdbVar.zzb;
                    String strZzd4 = zzd(strZzd3, "@gw_fis@", i3 >= 0 ? Integer.toString(i3) : "");
                    int i4 = zzcdbVar.zzc;
                    strZzd = zzd(strZzd4, "@gw_sfis@", i4 >= 0 ? Integer.toString(i4) : "");
                }
            }
            zzemr zzemrVar = this.zza;
            String strZzd5 = zzd(zzd(zzd(zzd(strZzd, "@gw_adnetstatus@", zzemrVar.zzg()), "@gw_ttr@", Long.toString(zzemrVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpc)).booleanValue()) {
                strZzd5 = (zzczeVar == null || zzczeVar.zza() <= 0) ? zzd(strZzd5, "@gw_placement_id@", "") : zzd(strZzd5, "@gw_placement_id@", Long.toString(zzczeVar.zza(), 10));
            }
            boolean z4 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeq)).booleanValue() && !TextUtils.isEmpty(str)) {
                z4 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z5 = !zIsEmpty;
            if (z4) {
                z3 = z5;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzd5);
            }
            if (this.zzi.zza(Uri.parse(strZzd5))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzd5).buildUpon();
                if (z4) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzd5 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    public final List zzc(zzfhr zzfhrVar, List list, zzbzm zzbzmVar) {
        zzfid zzfidVar;
        zzgpy zzgpyVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzb = zzbzmVar.zzb();
            String string = Integer.toString(zzbzmVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzer)).booleanValue()) {
                zzfie zzfieVar = this.zzg;
                if (zzfieVar == null) {
                    zzgpyVarZzd = zzgpy.zzc();
                } else {
                    zzfidVar = zzfieVar.zza;
                }
                str = (String) zzgpyVarZzd.zzb(zzfpd.zza).zza("");
                str2 = (String) zzgpyVarZzd.zzb(zzfpc.zza).zza("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzcby.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfhrVar.zzW, zzfhrVar.zzaw));
                }
                return arrayList;
            }
            zzfidVar = this.zzf;
            zzgpyVarZzd = zzgpy.zzd(zzfidVar);
            str = (String) zzgpyVarZzd.zzb(zzfpd.zza).zza("");
            str2 = (String) zzgpyVarZzd.zzb(zzfpc.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcby.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfhrVar.zzW, zzfhrVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e2);
            return arrayList;
        }
    }
}

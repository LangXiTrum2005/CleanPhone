package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzftp implements zzfsq {
    private static final zzftp zza = new zzftp();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzftl();
    private static final Runnable zzl = new zzftm();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfti zzh = new zzfti();
    private final zzfss zzg = new zzfss();
    private final zzftj zzi = new zzftj(new zzfts());

    public static zzftp zzb() {
        return zza;
    }

    private final void zzk(View view, zzfsr zzfsrVar, JSONObject jSONObject, int i2, boolean z2) {
        zzfsrVar.zzb(view, jSONObject, this, i2 == 1, z2);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsq
    public final void zza(View view, zzfsr zzfsrVar, JSONObject jSONObject, boolean z2) {
        zzfti zzftiVar;
        int iZzl;
        boolean z3;
        if (zzftg.zza(view) != null || (iZzl = (zzftiVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfsrVar.zza(view);
        zzftb.zze(jSONObject, jSONObjectZza);
        String strZzg = zzftiVar.zzg(view);
        if (strZzg != null) {
            zzftb.zzd(jSONObjectZza, strZzg);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e2) {
                zzftc.zza("Error with setting has window focus", e2);
            }
            boolean zZzk = this.zzh.zzk(strZzg);
            Boolean boolValueOf = Boolean.valueOf(zZzk);
            if (zZzk) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e3) {
                    zzftc.zza("Error with setting is picture-in-picture active", e3);
                }
            }
            this.zzh.zzf();
            this = this;
        } else {
            zzfth zzfthVarZzi = zzftiVar.zzi(view);
            if (zzfthVarZzi != null) {
                zzfsi zzfsiVarZzb = zzfthVarZzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzc = zzfthVarZzi.zzc();
                int size = arrayListZzc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) arrayListZzc.get(i2));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfsiVarZzb.zzb());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfsiVarZzb.zzc());
                    jSONObjectZza.put("friendlyObstructionReason", zzfsiVarZzb.zzd());
                } catch (JSONException e4) {
                    zzftc.zza("Error with setting friendly obstruction", e4);
                }
                z3 = true;
            } else {
                z3 = false;
            }
            zzk(view, zzfsrVar, jSONObjectZza, iZzl, z2 || z3);
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzftk(this));
    }

    public final void zze() {
        zzl();
    }

    public final /* synthetic */ void zzf() {
        zzftp zzftpVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfrl zzfrlVar : zzfsf.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfti zzftiVar = this.zzh;
        zzftiVar.zzd();
        zzfss zzfssVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzfsr zzfsrVarZza = zzfssVar.zza();
        if (zzftiVar.zzb().size() > 0) {
            for (String str : zzftiVar.zzb()) {
                JSONObject jSONObjectZza = zzfsrVarZza.zza(null);
                View viewZzh = zzftiVar.zzh(str);
                zzfsr zzfsrVarZzb = zzfssVar.zzb();
                String strZzc = zzftiVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfsrVarZzb.zza(viewZzh);
                    zzftb.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e2) {
                        zzftc.zza("Error with setting not visible reason", e2);
                    }
                    zzftb.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzftb.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfti zzftiVar2 = this.zzh;
        if (zzftiVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfsrVarZza.zza(null);
            zzftpVar = this;
            zzftpVar.zzk(null, zzfsrVarZza, jSONObjectZza3, 1, false);
            zzftb.zzf(jSONObjectZza3);
            zzftpVar.zzi.zza(jSONObjectZza3, zzftiVar2.zza(), jNanoTime);
        } else {
            zzftpVar = this;
            zzftpVar.zzi.zzc();
        }
        zzftiVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzftpVar.zzj;
        List<zzfto> list = zzftpVar.zzd;
        if (list.size() > 0) {
            for (zzfto zzftoVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzftoVar.zzb();
                if (zzftoVar instanceof zzftn) {
                    ((zzftn) zzftoVar).zza();
                }
            }
        }
        zzfsp.zza().zzc();
    }

    public final /* synthetic */ zzftj zzh() {
        return this.zzi;
    }
}

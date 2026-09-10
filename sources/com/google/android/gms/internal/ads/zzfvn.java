package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.smartdigimkt.h5.f;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzfvn implements zzfui {
    private final Object zza;
    private final zzfvo zzb;
    private final zzfvz zzc;
    private final zzfuf zzd;
    private final boolean zze;

    public zzfvn(Object obj, zzfvo zzfvoVar, zzfvz zzfvzVar, zzfuf zzfufVar, boolean z2) {
        this.zza = obj;
        this.zzb = zzfvoVar;
        this.zzc = zzfvzVar;
        this.zzd = zzfufVar;
        this.zze = z2;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaxf zzaxfVarZza = zzaxg.zza();
        zzaxfVarZza.zzd(5);
        zzaxfVarZza.zza(zzhzl.zzs(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzaxg) zzaxfVarZza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e2) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e2);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfui
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        try {
            Map mapZzb = this.zzc.zzb();
            mapZzb.put(f.j, "q");
            mapZzb.put("ctx", context);
            mapZzb.put(fl.SESSION_HISTORY_KEY_AD_ID, null);
            bArrZzj = zzj(null, mapZzb);
            if (this.zze) {
                mapZzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfui
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzc = this.zzc.zzc();
            mapZzc.put(f.j, "v");
            mapZzc.put("ctx", context);
            mapZzc.put(fl.SESSION_HISTORY_KEY_AD_ID, null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrZzj = zzj(null, mapZzc);
            if (this.zze) {
                mapZzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfui
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzd = this.zzc.zzd();
            mapZzd.put(f.j, "c");
            mapZzd.put("ctx", context);
            mapZzd.put("cs", str2);
            mapZzd.put(fl.SESSION_HISTORY_KEY_AD_ID, null);
            mapZzd.put("view", view);
            mapZzd.put("act", activity);
            bArrZzj = zzj(null, mapZzd);
            if (this.zze) {
                mapZzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfui
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfvx {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put(fl.SESSION_HISTORY_KEY_AD_ID, null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e2) {
            throw new zzfvx(2005, e2);
        }
    }

    public final zzfvo zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzfvx {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e2) {
            throw new zzfvx(2001, e2);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod(d9.a.f, new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfvx {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e2) {
            throw new zzfvx(2003, e2);
        }
    }

    public final synchronized int zzh() throws zzfvx {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e2) {
            throw new zzfvx(2006, e2);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, new Class[0]).invoke(obj, new Object[0])).intValue();
    }
}

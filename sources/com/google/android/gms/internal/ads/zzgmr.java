package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgmr implements zzglz {
    private long zza = -1;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private final long zzi = SystemClock.uptimeMillis();

    public zzgmr(zzfzm zzfzmVar) {
    }

    private static boolean zza(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics zze(Context context) {
        WindowManager windowManager;
        if ((Build.VERSION.SDK_INT >= 33 && !context.isUiContext()) || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    private final void zzf(Map map) {
        map.put("tcq", Long.valueOf(this.zza));
        map.put("tpq", Long.valueOf(this.zzb));
        map.put("tcc", Long.valueOf(this.zzg));
        map.put("tpc", Long.valueOf(this.zzh));
        map.put("tpv", Long.valueOf(this.zzd));
        map.put("tcv", Long.valueOf(this.zzc));
        map.put("tchv", Long.valueOf(this.zze));
        map.put("tphv", Long.valueOf(this.zzf));
        map.put("tst", Long.valueOf(this.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final synchronized void zzb(Map map) {
        this.zzb = this.zza;
        this.zza = SystemClock.uptimeMillis();
        zzf(map);
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final synchronized void zzc(Map map, Context context, View view) {
        try {
            this.zzd = this.zzc;
            this.zzc = SystemClock.uptimeMillis();
            long j = this.zze;
            if (j != -1) {
                this.zzf = j;
            }
            DisplayMetrics displayMetricsZze = zze(context);
            if (displayMetricsZze != null) {
                int i2 = displayMetricsZze.widthPixels * displayMetricsZze.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetricsZze.widthPixels) * Math.min(view.getHeight(), displayMetricsZze.heightPixels);
                    if (iMin + iMin >= i2 || (iMin == 0 && zza(view))) {
                        this.zze = this.zzc;
                    }
                }
                zzf(map);
            }
            this.zze = -1L;
            zzf(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final synchronized void zzd(Map map) {
        this.zzh = this.zzg;
        this.zzg = SystemClock.uptimeMillis();
        zzf(map);
    }
}

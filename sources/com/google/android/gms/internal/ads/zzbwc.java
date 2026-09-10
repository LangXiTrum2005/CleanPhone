package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwc extends zzbwd implements zzbnn {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcir zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbfr zzk;
    private float zzl;
    private int zzm;

    public zzbwc(zzcir zzcirVar, Context context, zzbfr zzbfrVar) {
        super(zzcirVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcirVar;
        this.zzi = context;
        this.zzk = zzbfrVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcir zzcirVar = this.zzh;
        Activity activityZzj = zzcirVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzX = com.google.android.gms.ads.internal.util.zzs.zzX(activityZzj);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzX[0]);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzX[1]);
        }
        if (zzcirVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcirVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbwb zzbwbVar = new zzbwb();
        zzbfr zzbfrVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbwbVar.zzb(zzbfrVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbwbVar.zza(zzbfrVar.zzc(intent2));
        zzbwbVar.zzc(zzbfrVar.zzb());
        zzbwbVar.zzd(zzbfrVar.zza());
        zzbwbVar.zze(true);
        boolean zZzf = zzbwbVar.zzf();
        boolean zZzg = zzbwbVar.zzg();
        boolean zZzh = zzbwbVar.zzh();
        boolean zZzi = zzbwbVar.zzi();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zZzi).put("inlineVideo", zzbwbVar.zzj());
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObjectPut = null;
        }
        zzcirVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcirVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzcirVar.zzs().afmaVersion);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[PHI: r4
  0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i2, int i3) {
        int i4;
        Context context = this.zzi;
        int i5 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i4 = com.google.android.gms.ads.internal.util.zzs.zzY((Activity) context)[0];
        } else {
            i4 = 0;
        }
        zzcir zzcirVar = this.zzh;
        if (zzcirVar.zzN() == null || !zzcirVar.zzN().zzg()) {
            int width = zzcirVar.getWidth();
            int height = zzcirVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzay)).booleanValue()) {
                if (width == 0) {
                    width = zzcirVar.zzN() != null ? zzcirVar.zzN().zzb : 0;
                }
                if (height != 0) {
                    i5 = height;
                } else if (zzcirVar.zzN() != null) {
                    i5 = zzcirVar.zzN().zza;
                }
            } else {
                i5 = height;
            }
            this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i5);
        }
        zzj(i2, i3 - i4, this.zzf, this.zzg);
        zzcirVar.zzP().zzP(i2, i3);
    }
}

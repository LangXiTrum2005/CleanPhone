package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzbr;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzm f10920b;

    public /* synthetic */ zzl(zzm zzmVar) {
        this.f10920b = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzbr zzbrVarZzy = com.google.android.gms.ads.internal.zzt.zzy();
        zzm zzmVar = this.f10920b;
        Bitmap bitmapZza = zzbrVarZzy.zza(Integer.valueOf(zzmVar.f10923b.zzo.zzf));
        if (bitmapZza != null) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.f10923b.zzo;
            boolean z10 = zzlVar.zzd;
            float f10 = zzlVar.zze;
            Activity activity = zzmVar.f10922a;
            if (!z10 || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapZza, bitmapZza.getWidth(), bitmapZza.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f10);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f10918a.f10920b.f10922a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdol {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfik zzc;
    private final zzdnr zzd;
    private final zzdnm zze;
    private final zzdoz zzf;
    private final zzdph zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbjn zzj;
    private final zzdnj zzk;

    public zzdol(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfik zzfikVar, zzdnr zzdnrVar, zzdnm zzdnmVar, zzdoz zzdozVar, zzdph zzdphVar, Executor executor, Executor executor2, zzdnj zzdnjVar) {
        this.zzb = zzgVar;
        this.zzc = zzfikVar;
        this.zzj = zzfikVar.zzj;
        this.zzd = zzdnrVar;
        this.zze = zzdnmVar;
        this.zzf = zzdozVar;
        this.zzg = zzdphVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdnjVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z2) {
        View viewZzJ = z2 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeH)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdpj zzdpjVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdok
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdpjVar);
            }
        });
    }

    public final void zzb(zzdpj zzdpjVar) {
        zzdoz zzdozVar;
        if (zzdpjVar == null || (zzdozVar = this.zzf) == null || zzdpjVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdpjVar.zzdA().addView(zzdozVar.zza());
        } catch (zzcjg e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e2);
        }
    }

    public final void zzc(zzdpj zzdpjVar) {
        if (zzdpjVar == null) {
            return;
        }
        Context context = zzdpjVar.zzdE().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdph zzdphVar = this.zzg;
            if (zzdphVar == null || zzdpjVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdphVar.zza(zzdpjVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcjg e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e2);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    public final /* synthetic */ void zzf(zzdpj zzdpjVar) {
        ViewGroup viewGroup;
        View viewZzA;
        final ViewGroup viewGroup2;
        zzbjv zzbjvVarZza;
        Drawable drawable;
        zzdnr zzdnrVar = this.zzd;
        if (!zzdnrVar.zze() && !zzdnrVar.zzc()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzm = zzdpjVar.zzm(strArr[i2]);
            if (viewZzm instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewZzm;
                break;
            }
            i2++;
        }
        Context context = zzdpjVar.zzdE().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdnm zzdnmVar = this.zze;
        if (zzdnmVar.zzA() != null) {
            viewZzA = zzdnmVar.zzA();
            zzbjn zzbjnVar = this.zzj;
            if (zzbjnVar != null && viewGroup == null) {
                zzh(layoutParams, zzbjnVar.zze);
                viewZzA.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdnmVar.zzz() instanceof zzbjg) {
            zzbjg zzbjgVar = (zzbjg) zzdnmVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbjgVar.zzi());
                viewGroup = null;
            }
            View zzbjhVar = new zzbjh(context, zzbjgVar, layoutParams);
            zzbjhVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeF));
            viewZzA = zzbjhVar;
        } else {
            viewZzA = null;
        }
        if (viewZzA != null) {
            if (viewZzA.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZzA.getParent()).removeView(viewZzA);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZzA);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdpjVar.zzdE().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZzA);
                FrameLayout frameLayoutZzdA = zzdpjVar.zzdA();
                if (frameLayoutZzdA != null) {
                    frameLayoutZzdA.addView(zzaVar);
                }
            }
            zzdpjVar.zzi(zzdpjVar.zzn(), viewZzA, true);
        }
        zzgtd zzgtdVar = zzdoh.zza;
        int size = zzgtdVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzm2 = zzdpjVar.zzm((String) zzgtdVar.get(i3));
            i3++;
            if (viewZzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzm2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdnmVar.zzT() != null) {
                zzdnmVar.zzT().zzaq(new zzdoi(zzdpjVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzls)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdnmVar.zzU() != null) {
                zzdnmVar.zzU().zzaq(new zzdoi(zzdpjVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzdE = zzdpjVar.zzdE();
        Context context2 = viewZzdE != null ? viewZzdE.getContext() : null;
        if (context2 == null || (zzbjvVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzg = zzbjvVarZza.zzg();
            if (iObjectWrapperZzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzo = zzdpjVar.zzo();
            if (iObjectWrapperZzo == null) {
                imageView.setScaleType(zza);
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgZ)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzo));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    public final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdnm zzdnmVar = this.zze;
        if (zzdnmVar.zzJ() != null) {
            boolean z2 = viewGroup != null;
            if (zzdnmVar.zzx() == 2 || zzdnmVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdnmVar.zzx()), z2);
            } else if (zzdnmVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z2);
                zzgVar.zzr(str, "1", z2);
            }
        }
    }
}

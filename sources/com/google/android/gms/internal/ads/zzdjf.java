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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjf {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfcj zzc;
    private final zzdik zzd;
    private final zzdif zze;

    @Nullable
    private final zzdjt zzf;

    @Nullable
    private final zzdkb zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfl zzj;
    private final zzdic zzk;

    public zzdjf(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfcj zzfcjVar, zzdik zzdikVar, zzdif zzdifVar, @Nullable zzdjt zzdjtVar, @Nullable zzdkb zzdkbVar, Executor executor, Executor executor2, zzdic zzdicVar) {
        this.zzb = zzgVar;
        this.zzc = zzfcjVar;
        this.zzj = zzfcjVar.zzi;
        this.zzd = zzdikVar;
        this.zze = zzdifVar;
        this.zzf = zzdjtVar;
        this.zzg = zzdkbVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdicVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z) {
        View viewZzf = z ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdV)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdif zzdifVar = this.zze;
        if (zzdifVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdifVar.zzc() == 2 || zzdifVar.zzc() == 1) {
                this.zzb.zzF(this.zzc.zzf, String.valueOf(zzdifVar.zzc()), z);
            } else if (zzdifVar.zzc() == 6) {
                this.zzb.zzF(this.zzc.zzf, "2", z);
                this.zzb.zzF(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    public final /* synthetic */ void zzb(zzdkd zzdkdVar) {
        ViewGroup viewGroup;
        View viewZze;
        final ViewGroup viewGroup2;
        zzbft zzbftVarZza;
        Drawable drawable;
        if (!this.zzd.zzf() && !this.zzd.zze()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i = 0;
        while (true) {
            if (i >= 2) {
                viewGroup = null;
                break;
            }
            View viewZzg = zzdkdVar.zzg(strArr[i]);
            if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewZzg;
                break;
            }
            i++;
        }
        Context context = zzdkdVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdif zzdifVar = this.zze;
        if (zzdifVar.zze() != null) {
            zzbfl zzbflVar = this.zzj;
            viewZze = zzdifVar.zze();
            if (zzbflVar != null && viewGroup == null) {
                zzh(layoutParams, zzbflVar.zze);
                viewZze.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdifVar.zzl() instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) zzdifVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfgVar.zzc());
                viewGroup = null;
            }
            View zzbfhVar = new zzbfh(context, zzbfgVar, layoutParams);
            zzbfhVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdT));
            viewZze = zzbfhVar;
        } else {
            viewZze = null;
        }
        if (viewZze != null) {
            if (viewZze.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZze.getParent()).removeView(viewZze);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZze);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdkdVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZze);
                FrameLayout frameLayoutZzh = zzdkdVar.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            zzdkdVar.zzq(zzdkdVar.zzk(), viewZze, true);
        }
        zzfxn zzfxnVar = zzdjb.zza;
        int size = zzfxnVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzg2 = zzdkdVar.zzg((String) zzfxnVar.get(i2));
            i2++;
            if (viewZzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdif zzdifVar2 = this.zze;
            if (zzdifVar2.zzs() != null) {
                zzdifVar2.zzs().zzar(new zzdje(zzdkdVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjS)).booleanValue() && zzi(viewGroup2, false)) {
            zzdif zzdifVar3 = this.zze;
            if (zzdifVar3.zzq() != null) {
                zzdifVar3.zzq().zzar(new zzdje(zzdkdVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = zzdkdVar.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (zzbftVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzi = zzbftVarZza.zzi();
            if (iObjectWrapperZzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzj = zzdkdVar.zzj();
            if (iObjectWrapperZzj == null) {
                imageView.setScaleType(zza);
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzga)).booleanValue()) {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj));
            } else {
                imageView.setScaleType(zza);
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(@Nullable zzdkd zzdkdVar) {
        if (zzdkdVar == null || this.zzf == null || zzdkdVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdkdVar.zzh().addView(this.zzf.zza());
        } catch (zzcfj e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(@Nullable zzdkd zzdkdVar) {
        if (zzdkdVar == null) {
            return;
        }
        Context context = zzdkdVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdkdVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdkdVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbv.zzb());
            } catch (zzcfj e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdkd zzdkdVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdkdVar);
            }
        });
    }

    public final boolean zzf(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}

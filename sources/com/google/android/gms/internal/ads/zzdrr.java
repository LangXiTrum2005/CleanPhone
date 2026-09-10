package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrr extends zzbqa implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbji {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzed zzb;
    private zzdnh zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdrr(zzdnh zzdnhVar, zzdnm zzdnmVar) {
        this.zza = zzdnmVar.zzJ();
        this.zzb = zzdnmVar.zzy();
        this.zzc = zzdnhVar;
        if (zzdnmVar.zzT() != null) {
            zzdnmVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdnh zzdnhVar = this.zzc;
        if (zzdnhVar == null || (view = this.zza) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdnhVar.zzu(view, map, map, zzdnh.zzI(view));
    }

    private static final void zzi(zzbqe zzbqeVar, int i2) {
        try {
            zzbqeVar.zzf(i2);
        } catch (RemoteException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final void zza() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    this.zza.zzc();
                } catch (RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final com.google.android.gms.ads.internal.client.zzed zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzc() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzg();
        zzdnh zzdnhVar = this.zzc;
        if (zzdnhVar != null) {
            zzdnhVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzd(IObjectWrapper iObjectWrapper, zzbqe zzbqeVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad can not be shown after destroy().");
            zzi(zzbqeVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream internal error: ".concat(str));
            zzi(zzbqeVar, 0);
            return;
        }
        if (this.zze) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad should not be used again.");
            zzi(zzbqeVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zzb(this.zza, this);
        zzh();
        try {
            zzbqeVar.zze();
        } catch (RemoteException e2) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzd(iObjectWrapper, new zzdrp(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final zzbjv zzf() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdnh zzdnhVar = this.zzc;
        if (zzdnhVar == null || zzdnhVar.zzP() == null) {
            return null;
        }
        return zzdnhVar.zzP().zza();
    }
}

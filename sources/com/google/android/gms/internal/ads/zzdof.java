package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzdof extends zzbkh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdpj {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdnh zze;
    private zzbcm zzf;

    public zzdof(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzbcm(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar != null) {
            zzdnhVar.zzi(view, zzdE(), zzj(), zzk(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar != null) {
            zzdnhVar.zzu(zzdE(), zzj(), zzk(), zzdnh.zzI(zzdE()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar != null) {
            zzdnhVar.zzu(zzdE(), zzj(), zzk(), zzdnh.zzI(zzdE()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar != null) {
            zzdnhVar.zzk(view, motionEvent, zzdE());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdnh)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar != null) {
            zzdnhVar.zzh(this);
        }
        zzdnh zzdnhVar2 = (zzdnh) objUnwrap;
        if (!zzdnhVar2.zzJ()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdnhVar2;
            zzdnhVar2.zzg(this);
            this.zze.zzN(zzdE());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final synchronized void zzc() {
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar != null) {
            zzdnhVar.zzh(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        try {
            if (this.zze != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (!(objUnwrap instanceof View)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzx((View) objUnwrap);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final FrameLayout zzdA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final View zzdE() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final zzbcm zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized void zzi(String str, View view, boolean z2) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized Map zzj() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized Map zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized View zzm(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized String zzn() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized IObjectWrapper zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized JSONObject zzp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpj
    public final synchronized JSONObject zzq() {
        zzdnh zzdnhVar = this.zze;
        if (zzdnhVar == null) {
            return null;
        }
        return zzdnhVar.zzw(zzdE(), zzj(), zzk());
    }
}

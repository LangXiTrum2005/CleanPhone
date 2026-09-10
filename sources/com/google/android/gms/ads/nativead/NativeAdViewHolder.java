package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbki;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();

    @NotOnlyInitialized
    private zzbki zzb;
    private WeakReference zzc;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzo.zzf("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzo.zzf("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.zzc = new WeakReference(view);
        this.zzb = zzbb.zzb().zzf(view, zza(map), zza(map2));
    }

    private static final HashMap zza(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzb.zzd(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        IObjectWrapper iObjectWrapper = (IObjectWrapper) nativeAd.zza();
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzo.zzi("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        zzbki zzbkiVar = this.zzb;
        if (zzbkiVar != null) {
            try {
                zzbkiVar.zzb(iObjectWrapper);
            } catch (RemoteException e2) {
                zzo.zzg("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbki zzbkiVar = this.zzb;
        if (zzbkiVar != null) {
            try {
                zzbkiVar.zzc();
            } catch (RemoteException e2) {
                zzo.zzg("Unable to call unregisterNativeAd on delegate", e2);
            }
        }
        WeakReference weakReference = this.zzc;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}

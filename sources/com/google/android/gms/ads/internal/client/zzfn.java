package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfn extends zzdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnAdMetadataChangedListener f10877a;

    public zzfn(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f10877a = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f10877a;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}

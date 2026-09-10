package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcis implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcbk zza;
    final /* synthetic */ zzcjc zzb;

    public zzcis(zzcjc zzcjcVar, zzcbk zzcbkVar) {
        this.zza = zzcbkVar;
        Objects.requireNonNull(zzcjcVar);
        this.zzb = zzcjcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

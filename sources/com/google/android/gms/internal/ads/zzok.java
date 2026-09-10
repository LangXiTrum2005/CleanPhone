package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class zzok extends ContentObserver {
    final /* synthetic */ zzon zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzok(zzon zzonVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzonVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzon zzonVar = this.zza;
        this.zza.zzj(zzoi.zzc(zzonVar.zza, zzonVar.zzh, zzonVar.zzg));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}

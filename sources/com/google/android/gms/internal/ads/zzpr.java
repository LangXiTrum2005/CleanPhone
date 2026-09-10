package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzpr extends ContentObserver {
    final /* synthetic */ zzpu zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpr(zzpu zzpuVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(zzpuVar);
        this.zza = zzpuVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        zzpu zzpuVar = this.zza;
        zzpuVar.zzf(zzpp.zza(zzpuVar.zzg(), zzpuVar.zzj(), zzpuVar.zzh()));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}

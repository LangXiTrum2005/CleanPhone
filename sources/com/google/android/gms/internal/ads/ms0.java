package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ms0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f17536a;

    public ms0(Context context) {
        this.f17536a = a8.e(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        return ((Boolean) zzba.zzc().a(am.Fd)).booleanValue() ? zw1.d(ls0.f17119a) : zw1.d(new mr0(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 46;
    }
}

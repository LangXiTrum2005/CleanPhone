package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzau extends zzdj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzax f11052b;

    public zzau(zzax zzaxVar, Context context) {
        this.f11051a = context;
        this.f11052b = zzaxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(@Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.f11052b.a(this.f11051a, zzeVar.zzb, true, true);
    }
}

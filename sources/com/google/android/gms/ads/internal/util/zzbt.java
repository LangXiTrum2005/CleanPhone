package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.kx0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.o8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbt extends zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzu f11091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzv f11093d;

    public zzbt(Context context, String str, String str2, @Nullable kx0 kx0Var, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.f11091b = new com.google.android.gms.ads.internal.util.client.zzu(context, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
        this.f11092c = str2;
        this.f11093d = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        String str = this.f11092c;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.f11093d;
        if (zzvVar == null) {
            this.f11091b.zzc(str, null);
            return;
        }
        new o8(zzvVar.zza(), this.f11091b, l00.f16612e, null, null, 7, false).a(str);
    }
}

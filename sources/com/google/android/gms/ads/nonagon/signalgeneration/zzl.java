package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QueryInfo f11495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11499e = new AtomicBoolean(false);

    public zzl(@Nullable QueryInfo queryInfo, String str, long j10, int i10) {
        this.f11495a = queryInfo;
        this.f11496b = str;
        this.f11497c = j10;
        this.f11498d = i10;
    }

    @Nullable
    public final QueryInfo zza() {
        return this.f11495a;
    }

    public final String zzb() {
        return this.f11496b;
    }

    public final boolean zzc() {
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        return this.f11497c <= System.currentTimeMillis();
    }

    public final int zzd() {
        return this.f11498d;
    }

    public final boolean zze() {
        return this.f11499e.get();
    }

    public final void zzf() {
        this.f11499e.set(true);
    }
}

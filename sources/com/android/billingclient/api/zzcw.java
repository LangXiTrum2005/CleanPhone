package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingResult f7296b;

    public zzcw(BillingResult billingResult, @Nullable List list) {
        this.f7295a = list;
        this.f7296b = billingResult;
    }

    public final BillingResult zza() {
        return this.f7296b;
    }

    @Nullable
    public final List zzb() {
        return this.f7295a;
    }
}

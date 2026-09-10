package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcz {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List f16562attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final BillingResult f16563saneness;

    public zzcz(BillingResult billingResult, List list) {
        this.f16562attabal = list;
        this.f16563saneness = billingResult;
    }

    public final BillingResult zza() {
        return this.f16563saneness;
    }

    public final List zzb() {
        return this.f16562attabal;
    }
}

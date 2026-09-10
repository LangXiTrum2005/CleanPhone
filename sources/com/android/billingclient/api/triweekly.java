package com.android.billingclient.api;

import java.util.List;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List f16544attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final BillingResult f16545saneness;

    public triweekly(BillingResult billingResult, List list) {
        this.f16544attabal = list;
        this.f16545saneness = billingResult;
    }

    public final BillingResult attabal() {
        return this.f16545saneness;
    }

    public final List saneness() {
        return this.f16544attabal;
    }
}

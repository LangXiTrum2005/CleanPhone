package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7123b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i10, @Nullable String str) {
        this.f7122a = i10;
        this.f7123b = str;
    }

    @Nullable
    public String getPurchaseToken() {
        return this.f7123b;
    }

    public int getResponseCode() {
        return this.f7122a;
    }
}

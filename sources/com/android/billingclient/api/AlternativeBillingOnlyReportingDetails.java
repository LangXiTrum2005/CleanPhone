package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@zzf
public final class AlternativeBillingOnlyReportingDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7078a;

    public AlternativeBillingOnlyReportingDetails(String str) {
        this.f7078a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f7078a;
    }
}

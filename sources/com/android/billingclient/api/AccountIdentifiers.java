package com.android.billingclient.api;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AccountIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7075b;

    public AccountIdentifiers(String str, String str2) {
        this.f7074a = str;
        this.f7075b = str2;
    }

    @Nullable
    public String getObfuscatedAccountId() {
        return this.f7074a;
    }

    @Nullable
    public String getObfuscatedProfileId() {
        return this.f7075b;
    }
}

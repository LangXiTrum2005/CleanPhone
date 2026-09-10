package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f8989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8992d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f8991c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f8992d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f8989a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f8990b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.f8989a = code;
        this.f8990b = str;
        this.f8991c = i10;
        this.f8992d = str2;
    }
}

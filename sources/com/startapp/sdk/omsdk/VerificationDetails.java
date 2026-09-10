package com.startapp.sdk.omsdk;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class VerificationDetails implements Serializable {
    private static final long serialVersionUID = -710990475280833437L;
    private String javascriptResourceUrl;
    private String vendorKey;
    private String verificationParameters;

    public VerificationDetails() {
    }

    public final String a() {
        return this.vendorKey;
    }

    public final String b() {
        return this.verificationParameters;
    }

    public final String c() {
        return this.javascriptResourceUrl;
    }

    public VerificationDetails(String str, String str2, String str3) {
        this.vendorKey = str;
        this.javascriptResourceUrl = str2;
        this.verificationParameters = str3;
    }
}

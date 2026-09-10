package com.chartboost.sdk;

import com.chartboost.sdk.impl.mb;

/* JADX INFO: loaded from: classes3.dex */
public class Mediation {
    public final String adapterVersion;
    public final String libraryVersion;
    public final String mediationType;

    public Mediation(String str, String str2, String str3) {
        this.mediationType = a(str);
        this.libraryVersion = str2;
        this.adapterVersion = str3;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(" ", "_");
        return strReplace.length() > 50 ? strReplace.substring(0, 50) : strReplace;
    }

    public mb toMediationBodyFields() {
        if (this.mediationType == null) {
            return null;
        }
        String str = this.libraryVersion;
        if (str == null) {
            str = "";
        }
        String str2 = this.adapterVersion;
        return new mb(a(), str, str2 != null ? str2 : "");
    }

    public final String a() {
        String str = this.libraryVersion;
        if (str != null && !str.isEmpty()) {
            return this.mediationType + " " + this.libraryVersion;
        }
        return this.mediationType;
    }
}

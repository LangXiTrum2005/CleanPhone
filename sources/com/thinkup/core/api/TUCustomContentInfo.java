package com.thinkup.core.api;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TUCustomContentInfo {
    TUAdInfo atAdInfo;
    double customContentDouble;
    Object customContentObject;
    String customContentString;

    public TUCustomContentInfo(String str, Object obj) {
        this.customContentDouble = -1.0d;
        this.customContentString = str;
        this.customContentObject = obj;
    }

    public TUAdInfo getAdInfo() {
        return this.atAdInfo;
    }

    public double getCustomContentDouble() {
        return this.customContentDouble;
    }

    public Object getCustomContentObject() {
        return this.customContentObject;
    }

    public String getCustomContentString() {
        return this.customContentString;
    }

    public void setTUAdInfo(TUAdInfo tUAdInfo) {
        this.atAdInfo = tUAdInfo;
    }

    public String toString() {
        return "TUCustomContentInfo{customContentString='" + this.customContentString + "', customContentDouble=" + this.customContentDouble + ", customContentObject=" + this.customContentObject + AbstractJsonLexerKt.END_OBJ;
    }

    public TUCustomContentInfo(double d, Object obj) {
        this.customContentDouble = d;
        this.customContentObject = obj;
    }
}

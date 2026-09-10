package com.bytedance.sdk.component.ud.qdl;

/* JADX INFO: loaded from: classes.dex */
public class exu {
    public tvp lnr;
    public String mml;
    public qdl mo;
    public byte[] mzz;

    public enum qdl {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public exu() {
    }

    public static exu qdl(tvp tvpVar, String str) {
        return new exu(tvpVar, str, qdl.STRING_TYPE);
    }

    public exu(tvp tvpVar, String str, qdl qdlVar) {
        this.lnr = tvpVar;
        this.mml = str;
        this.mo = qdlVar;
    }

    public static exu qdl(tvp tvpVar, byte[] bArr) {
        return new exu(tvpVar, bArr, qdl.BYTE_ARRAY_TYPE);
    }

    public exu(tvp tvpVar, byte[] bArr, qdl qdlVar) {
        this.lnr = tvpVar;
        this.mzz = bArr;
        this.mo = qdlVar;
    }
}

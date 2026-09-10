package com.bytedance.sdk.component.lr.ri;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    public ri di;
    public byte[] fi;
    public jbs ik;
    public String ka;

    public enum ri {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public aw() {
    }

    public static aw ri(jbs jbsVar, String str) {
        return new aw(jbsVar, str, ri.STRING_TYPE);
    }

    public aw(jbs jbsVar, String str, ri riVar) {
        this.ik = jbsVar;
        this.ka = str;
        this.di = riVar;
    }

    public static aw ri(jbs jbsVar, byte[] bArr) {
        return new aw(jbsVar, bArr, ri.BYTE_ARRAY_TYPE);
    }

    public aw(jbs jbsVar, byte[] bArr, ri riVar) {
        this.ik = jbsVar;
        this.fi = bArr;
        this.di = riVar;
    }
}

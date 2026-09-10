package com.bytedance.sdk.component.mzz.lnr.qdl.ud;

import com.bytedance.sdk.component.mzz.jl;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements jl {
    private com.bytedance.sdk.component.mzz.lnr.qdl.lnr<String, byte[]> lnr;
    private int qdl;
    private int ud;

    public lnr(int i2, int i3) {
        this.ud = i2;
        this.qdl = i3;
        this.lnr = new com.bytedance.sdk.component.mzz.lnr.qdl.lnr<String, byte[]>(i2) { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.ud.lnr.1
            @Override // com.bytedance.sdk.component.mzz.lnr.qdl.lnr
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public int ud(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        return this.lnr.qdl(str) != null;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.lnr.qdl(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public byte[] qdl(String str) {
        return this.lnr.qdl(str);
    }
}

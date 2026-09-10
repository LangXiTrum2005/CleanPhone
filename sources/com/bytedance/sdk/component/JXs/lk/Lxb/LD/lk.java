package com.bytedance.sdk.component.JXs.lk.Lxb.LD;

import com.bytedance.sdk.component.JXs.tD;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements tD {
    private int LD;
    private int Lxb;
    private com.bytedance.sdk.component.JXs.lk.Lxb.lk<String, byte[]> lk;

    public lk(int i, int i2) {
        this.LD = i;
        this.Lxb = i2;
        this.lk = new com.bytedance.sdk.component.JXs.lk.Lxb.lk<String, byte[]>(i) { // from class: com.bytedance.sdk.component.JXs.lk.Lxb.LD.lk.1
            @Override // com.bytedance.sdk.component.JXs.lk.Lxb.lk
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public int LD(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean LD(String str) {
        return this.lk.Lxb(str) != null;
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean Lxb(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.lk.Lxb(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public byte[] Lxb(String str) {
        return this.lk.Lxb(str);
    }
}

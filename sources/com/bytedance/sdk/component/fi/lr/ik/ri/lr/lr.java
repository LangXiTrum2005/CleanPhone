package com.bytedance.sdk.component.fi.lr.ik.ri.lr;

import com.bytedance.sdk.component.fi.nr;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements nr {
    private int ik;
    private com.bytedance.sdk.component.fi.lr.ik.ri.ik<String, byte[]> ka;
    private int lr;
    private long ri = 1048576;

    public lr(int i, int i2) {
        this.ik = i;
        this.lr = i2;
        this.ka = new com.bytedance.sdk.component.fi.lr.ik.ri.ik<>(i2);
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public boolean lr(String str) {
        try {
            return this.ka.ri(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public boolean ri(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.ri) {
                    return false;
                }
                this.ka.ri(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public byte[] ri(String str) {
        try {
            return this.ka.ri(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

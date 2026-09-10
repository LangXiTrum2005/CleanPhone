package com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.mzz.jl;

/* JADX INFO: loaded from: classes.dex */
public class ud implements jl {
    private int lnr;
    private com.bytedance.sdk.component.mzz.mml.lnr.qdl.lnr<String, byte[]> mml;
    private long qdl = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    private int ud;

    public ud(int i2, int i3) {
        this.lnr = i2;
        this.ud = i3;
        this.mml = new com.bytedance.sdk.component.mzz.mml.lnr.qdl.lnr<>(i3);
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        try {
            return this.mml.qdl(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.qdl) {
                    return false;
                }
                this.mml.qdl(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public byte[] qdl(String str) {
        try {
            return this.mml.qdl(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.bytedance.sdk.openadsdk.jl.qdl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.mml;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private byte[] lnr;
    private Bitmap mml;
    private Bitmap mzz;
    int qdl;
    private Drawable ud;

    public ud(Drawable drawable, int i2) {
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.ud = drawable;
        this.qdl = i2;
    }

    public byte[] lnr() {
        try {
            if (this.lnr == null) {
                this.lnr = mml.qdl(this.mml);
            }
        } catch (OutOfMemoryError e2) {
            aaj.lnr("GifRequestResult", e2.getMessage());
        }
        return this.lnr;
    }

    public Drawable mml() {
        return this.ud;
    }

    public boolean mzz() {
        if (this.mml != null || this.ud != null) {
            return true;
        }
        byte[] bArr = this.lnr;
        return bArr != null && bArr.length > 0;
    }

    public Bitmap qdl() {
        return this.mml;
    }

    public Bitmap ud() {
        return this.mzz;
    }

    public ud(byte[] bArr, int i2) {
        this.ud = null;
        this.mml = null;
        this.mzz = null;
        this.lnr = bArr;
        this.qdl = i2;
    }

    public ud(Bitmap bitmap, Bitmap bitmap2, int i2) {
        this.ud = null;
        this.lnr = null;
        this.mzz = bitmap2;
        this.mml = bitmap;
        this.qdl = i2;
    }
}

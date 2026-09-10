package com.bytedance.sdk.openadsdk.ac.ri;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ka;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private Bitmap fi;
    private byte[] ik;
    private Bitmap ka;
    private Drawable lr;
    int ri;

    public lr(Drawable drawable, int i) {
        this.ik = null;
        this.ka = null;
        this.fi = null;
        this.lr = drawable;
        this.ri = i;
    }

    public boolean fi() {
        if (this.ka != null || this.lr != null) {
            return true;
        }
        byte[] bArr = this.ik;
        return bArr != null && bArr.length > 0;
    }

    public byte[] ik() {
        try {
            if (this.ik == null) {
                this.ik = ka.ri(this.ka);
            }
        } catch (OutOfMemoryError e) {
            ac.ik("GifRequestResult", e.getMessage());
        }
        return this.ik;
    }

    public Drawable ka() {
        return this.lr;
    }

    public Bitmap lr() {
        return this.fi;
    }

    public Bitmap ri() {
        return this.ka;
    }

    public lr(byte[] bArr, int i) {
        this.lr = null;
        this.ka = null;
        this.fi = null;
        this.ik = bArr;
        this.ri = i;
    }

    public lr(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.lr = null;
        this.ik = null;
        this.fi = bitmap2;
        this.ka = bitmap;
        this.ri = i;
    }
}

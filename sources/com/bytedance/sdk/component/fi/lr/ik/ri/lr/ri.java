package com.bytedance.sdk.component.fi.lr.ik.ri.lr;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fi.bu;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements bu {
    private int ik;
    private com.bytedance.sdk.component.fi.lr.ik.ri.ik<String, Bitmap> ka;
    private int lr;
    private long ri = 4194304;

    public ri(int i, int i2) {
        this.lr = i2;
        this.ik = i;
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
    public boolean ri(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iRi = ri(bitmap);
                if (iRi <= this.ri && iRi != 0) {
                    this.ka.ri(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.fi.ri
    public Bitmap ri(String str) {
        try {
            return this.ka.ri(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int ri(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}

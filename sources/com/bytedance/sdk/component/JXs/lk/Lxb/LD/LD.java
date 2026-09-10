package com.bytedance.sdk.component.JXs.lk.Lxb.LD;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JXs.brP;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements brP {
    private int LD;
    private int Lxb;
    private com.bytedance.sdk.component.JXs.lk.Lxb.lk<String, Bitmap> lk;

    public LD(int i, int i2) {
        this.LD = i;
        this.Lxb = i2;
        this.lk = new com.bytedance.sdk.component.JXs.lk.Lxb.lk<String, Bitmap>(i) { // from class: com.bytedance.sdk.component.JXs.lk.Lxb.LD.LD.1
            @Override // com.bytedance.sdk.component.JXs.lk.Lxb.lk
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public int LD(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return LD.Lxb(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean LD(String str) {
        return this.lk.Lxb(str) != null;
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public boolean Lxb(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.lk.Lxb(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.JXs.Lxb
    public Bitmap Lxb(String str) {
        return this.lk.Lxb(str);
    }

    public static int Lxb(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}

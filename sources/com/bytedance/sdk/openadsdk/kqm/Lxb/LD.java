package com.bytedance.sdk.openadsdk.kqm.Lxb;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.ZU;
import com.bytedance.sdk.component.utils.sLN;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private List<Object> JXs;
    private byte[] LD;
    int Lxb;
    private Bitmap ZU;
    private Map<String, String> lc;
    private Bitmap lk;

    public LD(byte[] bArr, int i) {
        this.lk = null;
        this.ZU = null;
        this.JXs = null;
        this.lc = null;
        this.LD = bArr;
        this.Lxb = i;
    }

    public Bitmap LD() {
        return this.ZU;
    }

    public Bitmap Lxb() {
        return this.lk;
    }

    public boolean ZU() {
        if (this.lk != null) {
            return true;
        }
        byte[] bArr = this.LD;
        return bArr != null && bArr.length > 0;
    }

    public byte[] lk() {
        try {
            if (this.LD == null) {
                this.LD = ZU.Lxb(this.lk);
            }
        } catch (OutOfMemoryError e) {
            sLN.Lxb("GifRequestResult", e.getMessage());
        }
        return this.LD;
    }

    public LD(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.LD = null;
        this.JXs = null;
        this.lc = null;
        this.ZU = bitmap2;
        this.lk = bitmap;
        this.Lxb = i;
    }
}

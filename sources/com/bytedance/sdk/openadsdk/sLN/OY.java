package com.bytedance.sdk.openadsdk.sLN;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private final AudioManager Lxb;
    private int LD = -1;
    private boolean lk = false;

    public OY(Context context) {
        this.Lxb = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public boolean LD() {
        if (!this.lk) {
            return false;
        }
        this.lk = false;
        return true;
    }

    public int Lxb() {
        return this.LD;
    }

    public void Lxb(int i) {
        this.LD = i;
    }

    public void Lxb(boolean z) {
        Lxb(z, false);
    }

    public void Lxb(boolean z, boolean z2) {
        if (this.Lxb == null) {
            return;
        }
        int i = 0;
        if (z) {
            int iEbl = DeviceUtils.ebl();
            if (iEbl != 0) {
                this.LD = iEbl;
            } else if (!z2) {
                return;
            }
            Lxb(3, 0, 0);
            this.lk = true;
            return;
        }
        int iQAg = this.LD;
        if (iQAg == 0) {
            iQAg = DeviceUtils.QAg() / 15;
        } else {
            if (iQAg == -1) {
                if (!z2) {
                    return;
                } else {
                    iQAg = DeviceUtils.QAg() / 15;
                }
            }
            this.LD = -1;
            Lxb(3, iQAg, i);
            this.lk = true;
        }
        i = 1;
        this.LD = -1;
        Lxb(3, iQAg, i);
        this.lk = true;
    }

    private void Lxb(int i, int i2, int i3) {
        try {
            this.Lxb.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}

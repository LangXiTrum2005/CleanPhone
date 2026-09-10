package com.bytedance.sdk.openadsdk.fs;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class tvp {
    private final AudioManager qdl;
    private int ud = -1;
    private boolean lnr = false;

    public tvp(Context context) {
        this.qdl = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int qdl() {
        return this.ud;
    }

    public void qdl(boolean z2) {
        qdl(z2, false);
    }

    public void qdl(boolean z2, boolean z3) {
        if (this.qdl == null) {
            return;
        }
        int i2 = 0;
        if (z2) {
            int iWd = DeviceUtils.wd();
            if (iWd != 0) {
                this.ud = iWd;
            } else if (!z3) {
                return;
            }
            qdl(3, 0, 0);
            this.lnr = true;
            return;
        }
        int iTvp = this.ud;
        if (iTvp == 0) {
            iTvp = DeviceUtils.tvp() / 15;
        } else {
            if (iTvp == -1) {
                if (!z3) {
                    return;
                } else {
                    iTvp = DeviceUtils.tvp() / 15;
                }
            }
            this.ud = -1;
            qdl(3, iTvp, i2);
            this.lnr = true;
        }
        i2 = 1;
        this.ud = -1;
        qdl(3, iTvp, i2);
        this.lnr = true;
    }

    private void qdl(int i2, int i3, int i4) {
        try {
            this.qdl.setStreamVolume(i2, i3, i4);
        } catch (Throwable unused) {
        }
    }
}

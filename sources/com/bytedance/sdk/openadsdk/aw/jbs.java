package com.bytedance.sdk.openadsdk.aw;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class jbs {
    private final AudioManager ri;
    private int lr = -1;
    private boolean ik = false;

    public jbs(Context context) {
        this.ri = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int ri() {
        return this.lr;
    }

    public void ri(boolean z) {
        ri(z, false);
    }

    public void ri(boolean z, boolean z2) {
        if (this.ri == null) {
            return;
        }
        int i = 0;
        if (z) {
            int iXha = DeviceUtils.xha();
            if (iXha != 0) {
                this.lr = iXha;
            } else if (!z2) {
                return;
            }
            ri(3, 0, 0);
            this.ik = true;
            return;
        }
        int iJbs = this.lr;
        if (iJbs == 0) {
            iJbs = DeviceUtils.jbs() / 15;
        } else {
            if (iJbs == -1) {
                if (!z2) {
                    return;
                } else {
                    iJbs = DeviceUtils.jbs() / 15;
                }
            }
            this.lr = -1;
            ri(3, iJbs, i);
            this.ik = true;
        }
        i = 1;
        this.lr = -1;
        ri(3, iJbs, i);
        this.ik = true;
    }

    private void ri(int i, int i2, int i3) {
        try {
            this.ri.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}

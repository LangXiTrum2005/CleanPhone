package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public BannerSize(int i10, int i11, int i12) {
        if (i10 == 1) {
            this.height = 90;
            this.width = 320;
            return;
        }
        if (i10 == 2) {
            this.height = 250;
            this.width = 300;
            return;
        }
        if (i10 == 3) {
            setSmartMode();
            return;
        }
        if (i10 == 4) {
            this.height = 50;
            this.width = 320;
        } else {
            if (i10 != 5) {
                return;
            }
            this.height = i12;
            this.width = i11;
        }
    }

    private void setSmartMode() {
        if (m0.m(c.n().d()) < 720) {
            this.height = 50;
            this.width = 320;
        } else {
            this.height = 90;
            this.width = 728;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}

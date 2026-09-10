package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class PN {
    public static boolean A00(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}

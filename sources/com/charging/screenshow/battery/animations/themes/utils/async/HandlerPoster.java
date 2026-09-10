package com.charging.screenshow.battery.animations.themes.utils.async;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class HandlerPoster extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            try {
                SystemClock.uptimeMillis();
                throw null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (i2 != 2) {
            super.handleMessage(message);
            return;
        }
        try {
            SystemClock.uptimeMillis();
            throw null;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}

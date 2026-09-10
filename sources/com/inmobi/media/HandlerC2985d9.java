package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC2985d9 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23524a;

    public HandlerC2985d9(C3002e9 controller) {
        Intrinsics.f(controller, "controller");
        this.f23524a = new WeakReference(controller);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        C3114l9 c3114l9;
        Intrinsics.f(msg, "msg");
        if (msg.what != 2) {
            super.handleMessage(msg);
            return;
        }
        C3002e9 c3002e9 = (C3002e9) this.f23524a.get();
        if (c3002e9 != null) {
            C3114l9 c3114l10 = c3002e9.d;
            if (c3114l10 != null) {
                int currentPosition = c3114l10.getCurrentPosition();
                int duration = c3114l10.getDuration();
                if (duration != 0) {
                    c3002e9.f23562h.setProgress((currentPosition * 100) / duration);
                }
            }
            if (c3002e9.f23561e && (c3114l9 = c3002e9.d) != null && c3114l9.isPlaying()) {
                Message messageObtainMessage = obtainMessage(2);
                Intrinsics.e(messageObtainMessage, "obtainMessage(...)");
                sendMessageDelayed(messageObtainMessage, 200L);
            }
        }
    }
}

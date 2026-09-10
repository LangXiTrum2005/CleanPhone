package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3066i9 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23694a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3066i9(C3114l9 videoView) {
        super(Looper.getMainLooper());
        Intrinsics.f(videoView, "videoView");
        this.f23694a = new WeakReference(videoView);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        InterfaceC3034g9 playbackEventListener;
        Intrinsics.f(msg, "msg");
        C3114l9 c3114l9 = (C3114l9) this.f23694a.get();
        if (c3114l9 != null && msg.what == 1) {
            int duration = c3114l9.getDuration();
            int currentPosition = c3114l9.getCurrentPosition();
            if (duration != -1 && currentPosition != 0) {
                Object tag = c3114l9.getTag();
                C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
                if (c2968c9 != null) {
                    Object obj = c2968c9.t.get("didCompleteQ1");
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        c2968c9.t.put("didCompleteQ1", Boolean.TRUE);
                        InterfaceC3050h9 quartileCompletedListener = c3114l9.getQuartileCompletedListener();
                        Intrinsics.c(quartileCompletedListener);
                        ((C3336z8) quartileCompletedListener).a((byte) 0);
                    }
                    Object obj2 = c2968c9.t.get("didCompleteQ2");
                    Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj2).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        c2968c9.t.put("didCompleteQ2", Boolean.TRUE);
                        InterfaceC3050h9 quartileCompletedListener2 = c3114l9.getQuartileCompletedListener();
                        if (quartileCompletedListener2 != null) {
                            ((C3336z8) quartileCompletedListener2).a((byte) 1);
                        }
                    }
                    Object obj3 = c2968c9.t.get("didCompleteQ3");
                    Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj3).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        c2968c9.t.put("didCompleteQ3", Boolean.TRUE);
                        InterfaceC3050h9 quartileCompletedListener3 = c3114l9.getQuartileCompletedListener();
                        if (quartileCompletedListener3 != null) {
                            ((C3336z8) quartileCompletedListener3).a((byte) 2);
                        }
                    }
                    if ((currentPosition / duration) * 100 > c2968c9.D) {
                        Object obj4 = c2968c9.t.get("didQ4Fire");
                        Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        if (!((Boolean) obj4).booleanValue() && (playbackEventListener = c3114l9.getPlaybackEventListener()) != null) {
                            ((A8) playbackEventListener).a((byte) 5);
                        }
                    }
                }
            }
            sendEmptyMessageDelayed(1, 1000L);
        }
        super.handleMessage(msg);
    }
}

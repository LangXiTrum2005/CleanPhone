package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC2839d2 extends Handler {
    public final InMobiBanner a;

    /* JADX WARN: Illegal instructions before constructor call */
    public HandlerC2839d2(InMobiBanner mInmobiBanner) {
        Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Looper looper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Intrinsics.checkNotNullParameter(looper, "looper");
        super(looper);
        this.a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            this.a.refreshBanner$media_release();
        } else {
            Intrinsics.checkNotNullExpressionValue("d2", "TAG");
        }
    }
}

package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class P1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f23060a;

    /* JADX WARN: Illegal instructions before constructor call */
    public P1(InMobiBanner mInmobiBanner) {
        Intrinsics.f(mInmobiBanner, "mInmobiBanner");
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.e(mainLooper, "getMainLooper(...)");
        super(mainLooper);
        this.f23060a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.f(msg, "msg");
        if (msg.what == 1) {
            this.f23060a.refreshBanner$media_release();
        }
    }
}

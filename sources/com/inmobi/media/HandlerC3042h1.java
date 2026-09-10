package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC3042h1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23644a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3042h1(Looper looper) {
        super(looper);
        Intrinsics.f(looper, "looper");
        this.f23644a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.f(msg, "msg");
        if (C3090k1.f23739c) {
            return;
        }
        int i2 = msg.what;
        if (i2 == 1001 && this.f23644a) {
            this.f23644a = false;
            C3090k1.a(C3090k1.f23737a, false);
            Intrinsics.e(C3090k1.b(), "access$getTAG$p(...)");
        } else {
            if (i2 != 1002 || this.f23644a) {
                return;
            }
            this.f23644a = true;
            C3090k1.a(C3090k1.f23737a, true);
            Intrinsics.e(C3090k1.b(), "access$getTAG$p(...)");
        }
    }
}

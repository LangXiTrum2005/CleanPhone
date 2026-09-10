package com.inmobi.media;

import A.RunnableC0887e;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3202r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3234t2 f23946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23947b;

    public C3202r2(InterfaceC3234t2 mEventHandler, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(mEventHandler, "mEventHandler");
        this.f23946a = mEventHandler;
        this.f23947b = interfaceC3333z5;
    }

    public final void a(C3107l2 click) {
        Intrinsics.f(click, "click");
        click.f23763i.set(false);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new RunnableC0887e(click, this, handler, 8));
    }

    public static final void a(C3107l2 click, C3202r2 this$0, Handler handler) {
        Intrinsics.f(click, "$click");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(handler, "$handler");
        N9 n9 = new N9(click.f23759b, this$0.f23947b);
        n9.x = false;
        n9.t = false;
        n9.f23014u = false;
        HashMap mapA = C3298x2.a(C3298x2.f24089a, click);
        if (!mapA.isEmpty()) {
            n9.f23010i.putAll(mapA);
        }
        new vf(n9, new C3187q2(click, this$0, handler)).a();
    }
}

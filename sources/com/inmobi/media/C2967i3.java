package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2967i3;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2967i3 {
    public final InterfaceC3041l3 a;

    public C2967i3(InterfaceC3041l3 mEventHandler) {
        Intrinsics.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.a = mEventHandler;
    }

    public static final Unit b(S2 s2) {
        C3315w3 c3315w3 = C3315w3.a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = s2.b;
        return Unit.f29295attabal;
    }

    public final void a(final S2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: adsuki.sanskrit
            @Override // java.lang.Runnable
            public final void run() {
                C2967i3.a(click, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.inmobi.media.mo] */
    public static final void a(final S2 s2, C2967i3 c2967i3) {
        Je je = new Je(s2.b, C3315w3.a(s2), null, null, null, false, 60);
        int pingTimeout = C3315w3.c().getPingTimeout();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? moVar = new mo(je, new C2942h3(new AtomicBoolean(false), ref$ObjectRef, c2967i3, s2), pingTimeout * 1000, new Function0() { // from class: adsuki.rostrated
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2967i3.b(s2);
            }
        });
        ref$ObjectRef.element = moVar;
        moVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C2967i3 c2967i3, S2 s2, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            mo moVar = (mo) ref$ObjectRef.element;
            if (moVar != null) {
                moVar.a();
            }
            if (z) {
                c2967i3.a.a(s2);
            } else {
                c2967i3.a.a(s2, EnumC2765a6.d);
            }
        }
    }
}

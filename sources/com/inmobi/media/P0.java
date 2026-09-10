package com.inmobi.media;

import A.RunnableC0918z;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f23058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WeakReference f23059b;

    public P0(S0 s0, WeakReference weakReference) {
        this.f23058a = s0;
        this.f23059b = weakReference;
    }

    public static final void b(S0 this$0, WeakReference listenerWeakReference) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(listenerWeakReference, "$listenerWeakReference");
        InterfaceC3333z5 interfaceC3333z5 = this$0.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).a(strE, "callback- onAdDisplayed");
        }
        this$0.b((F0) listenerWeakReference.get());
    }

    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            StringBuilder sbA = H6.a(strE, "<get-TAG>(...)", "Ad interaction for placement id: ");
            sbA.append(this.f23058a.I());
            ((A5) interfaceC3333z5).a(strE, sbA.toString());
        }
        if (this.f23058a.Z()) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).b(strE2, "ad unit is destroyed");
                return;
            }
            return;
        }
        F0 f0 = (F0) this.f23059b.get();
        if (f0 != null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23058a.j;
            if (interfaceC3333z7 != null) {
                String strE3 = S0.e();
                Intrinsics.e(strE3, "<get-TAG>(...)");
                ((A5) interfaceC3333z7).a(strE3, "callback - onAdInteraction");
            }
            f0.a(new HashMap());
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f23058a.j;
        if (interfaceC3333z8 != null) {
            String strE4 = S0.e();
            Intrinsics.e(strE4, "<get-TAG>(...)");
            ((A5) interfaceC3333z8).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void c() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).a(strE, "onAdDisplayFailed native interaction callback");
        }
        if (this.f23058a.Z()) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).b(strE2, "callback onAdDisplayFailed failed. already destroyed.");
                return;
            }
            return;
        }
        F0 f0 = (F0) this.f23059b.get();
        if (f0 != null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23058a.j;
            if (interfaceC3333z7 != null) {
                String strE3 = S0.e();
                Intrinsics.e(strE3, "<get-TAG>(...)");
                ((A5) interfaceC3333z7).a(strE3, "callback - onAdShowFailed");
            }
            this.f23058a.a(f0, (short) 91);
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f23058a.j;
        if (interfaceC3333z8 != null) {
            String strE4 = S0.e();
            Intrinsics.e(strE4, "<get-TAG>(...)");
            ((A5) interfaceC3333z8).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void d() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "onAdDisplay ");
        }
        this.f23058a.b((byte) 4);
        if (!this.f23058a.Z()) {
            Handler handlerD = this.f23058a.D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0918z(this.f23058a, this.f23059b, 1));
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
        if (interfaceC3333z6 != null) {
            String strE2 = S0.e();
            Intrinsics.e(strE2, "<get-TAG>(...)");
            ((A5) interfaceC3333z6).b(strE2, "onAdDisplay callback failed. adunit destroyed.");
        }
    }

    public final void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "onAdFullScreenWillDisplay");
        }
        if (this.f23058a.Z()) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).a(strE2, "onAdFullScreenWillDisplay callback failed. adunit destroyed");
                return;
            }
            return;
        }
        F0 f0 = (F0) this.f23059b.get();
        if (f0 != null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23058a.j;
            if (interfaceC3333z7 != null) {
                String strE3 = S0.e();
                Intrinsics.e(strE3, "<get-TAG>(...)");
                ((A5) interfaceC3333z7).a(strE3, "callback - onAdScreenWillDisplay");
            }
            f0.e();
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f23058a.j;
        if (interfaceC3333z8 != null) {
            String strE4 = S0.e();
            Intrinsics.e(strE4, "<get-TAG>(...)");
            ((A5) interfaceC3333z8).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void f() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            StringBuilder sbA = H6.a(strE, "<get-TAG>(...)", "Successfully impressed ad for placement id: ");
            sbA.append(this.f23058a.I());
            ((A5) interfaceC3333z5).a(strE, sbA.toString());
        }
        if (this.f23058a.Z()) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).b(strE2, "ad unit is destroyed");
                return;
            }
            return;
        }
        F0 f0 = (F0) this.f23059b.get();
        if (f0 != null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23058a.j;
            if (interfaceC3333z7 != null) {
                String strE3 = S0.e();
                Intrinsics.e(strE3, "<get-TAG>(...)");
                ((A5) interfaceC3333z7).a(strE3, "callback - onAdImpressed");
            }
            f0.c();
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f23058a.j;
        if (interfaceC3333z8 != null) {
            String strE4 = S0.e();
            Intrinsics.e(strE4, "<get-TAG>(...)");
            ((A5) interfaceC3333z8).b(strE4, "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void g() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).a(strE, "onUserLeftApplication");
        }
        if (this.f23058a.Z()) {
            return;
        }
        F0 f0 = (F0) this.f23059b.get();
        if (f0 != null) {
            f0.h();
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void h() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).a(strE, "onUserSkippedMedia");
        }
        if (this.f23058a.Z()) {
            return;
        }
        F0 f0 = (F0) this.f23059b.get();
        if (f0 != null) {
            f0.i();
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).a(strE, "onAdDismissed");
        }
        if (this.f23058a.Z()) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23058a.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("InMobi", "Ad dismissed for placement id: " + this.f23058a.I());
        }
        Handler handlerD = this.f23058a.D();
        if (handlerD != null) {
            handlerD.post(new RunnableC0918z(this.f23058a, this.f23059b, 0));
        }
    }

    public static final void a(S0 this$0, WeakReference listenerWeakReference) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(listenerWeakReference, "$listenerWeakReference");
        this$0.a((F0) listenerWeakReference.get());
    }
}

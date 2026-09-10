package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class I0 extends G1 {
    public final /* synthetic */ S0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22873e;
    public final /* synthetic */ InterfaceC2961c2 f;
    public final /* synthetic */ String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f22874h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(S0 s0, String str, InterfaceC2961c2 interfaceC2961c2, String str2, String str3) {
        super(s0);
        this.d = s0;
        this.f22873e = str;
        this.f = interfaceC2961c2;
        this.g = str2;
        this.f22874h = str3;
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        S0 s0 = (S0) this.f22834b.get();
        if (s0 != null) {
            try {
                C3040h c3040hM = s0.m();
                if (c3040hM == null || !Intrinsics.a(c3040hM.s(), this.f22873e)) {
                    InterfaceC3333z5 interfaceC3333z5 = this.d.j;
                    if (interfaceC3333z5 != null) {
                        String strE = S0.e();
                        Intrinsics.e(strE, "<get-TAG>(...)");
                        ((A5) interfaceC3333z5).c(strE, "Returning blob as empty string");
                    }
                    InterfaceC2961c2 interfaceC2961c2 = this.f;
                    String jsCallbackNamespace = this.g;
                    String callback = this.f22874h;
                    GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) interfaceC2961c2;
                    gestureDetectorOnGestureListenerC3005ec.getClass();
                    Intrinsics.f(jsCallbackNamespace, "jsCallbackNamespace");
                    Intrinsics.f(callback, "callback");
                    InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                    if (interfaceC3333z6 != null) {
                        String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z6).a(TAG, "retrievedBlob");
                    }
                    gestureDetectorOnGestureListenerC3005ec.a(jsCallbackNamespace, callback.concat("();"));
                    return;
                }
                String blob = c3040hM.F();
                InterfaceC2961c2 interfaceC2961c3 = this.f;
                String jsCallbackNamespace2 = this.g;
                String callback2 = this.f22874h;
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = (GestureDetectorOnGestureListenerC3005ec) interfaceC2961c3;
                gestureDetectorOnGestureListenerC3005ec2.getClass();
                Intrinsics.f(jsCallbackNamespace2, "jsCallbackNamespace");
                Intrinsics.f(callback2, "callback");
                Intrinsics.f(blob, "blob");
                InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec2.f23587i;
                if (interfaceC3333z7 != null) {
                    String TAG2 = GestureDetectorOnGestureListenerC3005ec.a1;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z7).a(TAG2, "retrievedBlob");
                }
                gestureDetectorOnGestureListenerC3005ec2.a(jsCallbackNamespace2, callback2 + '(' + blob + ");");
                InterfaceC3333z5 interfaceC3333z8 = this.d.j;
                if (interfaceC3333z8 != null) {
                    String strE2 = S0.e();
                    Intrinsics.e(strE2, "<get-TAG>(...)");
                    ((A5) interfaceC3333z8).c(strE2, "Returning blob ".concat(blob));
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z9 = this.d.j;
                if (interfaceC3333z9 != null) {
                    String strE3 = S0.e();
                    Intrinsics.e(strE3, "<get-TAG>(...)");
                    ((A5) interfaceC3333z9).a(strE3, "Exception while getBlob", e2);
                }
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
    }
}

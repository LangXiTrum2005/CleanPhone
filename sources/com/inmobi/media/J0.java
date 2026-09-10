package com.inmobi.media;

import A.RunnableC0905n;
import android.content.Context;
import android.os.Handler;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class J0 extends G1 {
    public final /* synthetic */ S0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(S0 s0) {
        super(s0);
        this.d = s0;
    }

    @Override // com.inmobi.media.G1
    public final void a() {
        S0 s0 = (S0) this.f22834b.get();
        if (s0 != null) {
            try {
                byte bJ = s0.J();
                JSONObject jSONObject = new JSONObject(s0.L());
                AdConfig adConfigJ = s0.j();
                Intrinsics.c(adConfigJ);
                HashMap mapA = null;
                if (s0.y() != null) {
                    boolean z2 = T9.f23231a;
                    C3312y0 c3312y0Y = s0.y();
                    mapA = T9.a(c3312y0Y != null ? c3312y0Y.h() : null);
                }
                C3177p8 c3177p8 = new C3177p8(bJ, jSONObject, null, false, adConfigJ, mapA, null, this.d.j);
                Handler handlerD = this.d.D();
                if (handlerD != null) {
                    handlerD.post(new RunnableC0905n(6, c3177p8, this.d));
                }
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z5 = this.d.j;
                if (interfaceC3333z5 != null) {
                    String strE = S0.e();
                    Intrinsics.e(strE, "<get-TAG>(...)");
                    ((A5) interfaceC3333z5).a(strE, "Exception for handleInterActive ", e2);
                }
                s0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 76);
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        }
    }

    @Override // com.inmobi.media.G1
    public final void c() {
        super.c();
        S0 s0 = (S0) this.f22834b.get();
        if (s0 != null) {
            s0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), true, (short) 40);
        }
    }

    public static final void a(C3177p8 dataModel, S0 this$0) {
        String strU;
        Intrinsics.f(dataModel, "$dataModel");
        Intrinsics.f(this$0, "this$0");
        try {
            F9 f9 = dataModel.r;
            C3040h c3040hM = this$0.m();
            if (f9 == null || this$0.t() == null || c3040hM == null) {
                return;
            }
            String strB = this$0.I().b();
            String strO = c3040hM.o();
            boolean zC = this$0.c(0);
            C3040h c3040hM2 = this$0.m();
            AdQualityControl adQualityControlE = c3040hM2 != null ? c3040hM2.e() : null;
            C3040h c3040hM3 = this$0.m();
            if (c3040hM3 == null || (strU = c3040hM3.u()) == null) {
                strU = "html";
            }
            Q q = new Q(strB, this$0.b(c3040hM), this$0.I().l(), zC, strO, null, strU, null, null, null, null, Boolean.valueOf(this$0.I().p()), null, adQualityControlE, this$0.J(), this$0.e(0), this$0.n(), null, null, null, 3020704);
            tf tfVarC = S0.c(this$0);
            Cc cc = new Cc("interactiveAdUnit", "default");
            Context contextT = this$0.t();
            Intrinsics.c(contextT);
            this$0.f23143n = tfVarC.a(cc, contextT, (short) 0, q);
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX = this$0.x();
            if (gestureDetectorOnGestureListenerC3005ecX != null) {
                AbstractC3037gc abstractC3037gc = this$0.L;
                AdConfig adConfigJ = this$0.j();
                Intrinsics.c(adConfigJ);
                gestureDetectorOnGestureListenerC3005ecX.a(abstractC3037gc, adConfigJ);
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX2 = this$0.x();
            if (gestureDetectorOnGestureListenerC3005ecX2 != null) {
                InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ecX2.f23587i;
                if (interfaceC3333z5 != null) {
                    String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "disableUrlsToOpenInExternalApp " + gestureDetectorOnGestureListenerC3005ecX2);
                }
                gestureDetectorOnGestureListenerC3005ecX2.y = true;
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX3 = this$0.x();
            if (gestureDetectorOnGestureListenerC3005ecX3 != null) {
                gestureDetectorOnGestureListenerC3005ecX3.setBlobProvider(this$0);
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX4 = this$0.x();
            if (gestureDetectorOnGestureListenerC3005ecX4 != null) {
                gestureDetectorOnGestureListenerC3005ecX4.setPreloadView(true);
            }
            if (this$0.T() == 0) {
                this$0.a(true, this$0.x());
            }
            if ("URL".equals(f9.y)) {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX5 = this$0.x();
                if (gestureDetectorOnGestureListenerC3005ecX5 != null) {
                    Object obj = f9.f23516e;
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                    gestureDetectorOnGestureListenerC3005ecX5.e((String) obj);
                    return;
                }
                return;
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecX6 = this$0.x();
            if (gestureDetectorOnGestureListenerC3005ecX6 != null) {
                Object obj2 = f9.f23516e;
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
                gestureDetectorOnGestureListenerC3005ecX6.d((String) obj2);
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this$0.j;
            if (interfaceC3333z6 != null) {
                String strE = S0.e();
                Intrinsics.e(strE, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).a(strE, "Exception for handleInterActive ", e2);
            }
            this$0.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 76);
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}

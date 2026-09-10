package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3329z1 extends M1 {
    public final B1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3329z1(Context context, Z placement, F0 f0) {
        super(context, placement, f0);
        Intrinsics.f(context, "context");
        Intrinsics.f(placement, "placement");
        this.S = new B1();
    }

    @Override // com.inmobi.media.M1
    public final boolean D0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "canProceedToLoad");
        }
        if (f0()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).b(strE2, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        if (1 == Q() || 2 == Q()) {
            String strE3 = S0.e();
            Intrinsics.e(strE3, "<get-TAG>(...)");
            AbstractC3048h7.a((byte) 1, strE3, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                String strE4 = S0.e();
                Intrinsics.e(strE4, "<get-TAG>(...)");
                ((A5) interfaceC3333z7).b(strE4, "ad load in progress. ignore load");
            }
            a((short) 53);
            return false;
        }
        if (7 == Q()) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            AbstractC3048h7.a((byte) 1, "InMobi", AbstractC3294we.j + I().l());
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                String strE5 = S0.e();
                Intrinsics.e(strE5, "<get-TAG>(...)");
                ((A5) interfaceC3333z8).b(strE5, "Ad is active. ignore load");
            }
            return false;
        }
        if (Q() == 4) {
            if (!W()) {
                InterfaceC3333z5 interfaceC3333z9 = this.j;
                if (interfaceC3333z9 != null) {
                    String strE6 = S0.e();
                    Intrinsics.e(strE6, "<get-TAG>(...)");
                    ((A5) interfaceC3333z9).c(strE6, "signalCanShowForStateReady");
                }
                InterfaceC3333z5 interfaceC3333z10 = this.j;
                if (interfaceC3333z10 != null) {
                    String strE7 = S0.e();
                    Intrinsics.e(strE7, "<get-TAG>(...)");
                    ((A5) interfaceC3333z10).a(strE7, "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                F0 f0R = r();
                if (f0R == null) {
                    AbstractC3048h7.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    InterfaceC3333z5 interfaceC3333z11 = this.j;
                    if (interfaceC3333z11 != null) {
                        String strE8 = S0.e();
                        Intrinsics.e(strE8, "<get-TAG>(...)");
                        ((A5) interfaceC3333z11).b(strE8, "listener is null. load show callback missed");
                    }
                } else {
                    InterfaceC3333z5 interfaceC3333z12 = this.j;
                    if (interfaceC3333z12 != null) {
                        String strE9 = S0.e();
                        Intrinsics.e(strE9, "<get-TAG>(...)");
                        ((A5) interfaceC3333z12).a(strE9, "callback - onLoadSuccess");
                    }
                    f(f0R);
                }
                return false;
            }
            InterfaceC3333z5 interfaceC3333z13 = this.j;
            if (interfaceC3333z13 != null) {
                String strE10 = S0.e();
                Intrinsics.e(strE10, "<get-TAG>(...)");
                ((A5) interfaceC3333z13).b(strE10, "ad is expired, clearing");
            }
            g();
        }
        e0();
        return true;
    }

    @Override // com.inmobi.media.M1, com.inmobi.media.AbstractC3037gc
    public final void a(D1 audioStatusInternal) {
        Intrinsics.f(audioStatusInternal, "audioStatusInternal");
        F0 f0R = r();
        if (f0R != null) {
            f0R.a(audioStatusInternal);
        }
        B1 b1 = this.S;
        b1.getClass();
        if (!b1.f22713a && audioStatusInternal == D1.f22756e) {
            b1.f22713a = true;
            C3205r5 c3205r5 = C3205r5.f23952c;
            c3205r5.f23148a = System.currentTimeMillis();
            c3205r5.f23149b++;
        }
    }

    public final void d(short s) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "onShowFailure");
        }
        F0 f0R = r();
        if (f0R == null) {
            AbstractC3048h7.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).b(strE2, "listener is null. show fail callback missed. ");
            }
        } else {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                String strE3 = S0.e();
                Intrinsics.e(strE3, "<get-TAG>(...)");
                ((A5) interfaceC3333z7).b(strE3, "callback - onAdShowFailed");
            }
            f0R.d();
        }
        if (s != 0) {
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                String strE4 = S0.e();
                ((A5) interfaceC3333z8).b(strE4, X8.a(strE4, "<get-TAG>(...)", "show failed - ", s));
            }
            c(s);
        }
    }

    @Override // com.inmobi.media.M1, com.inmobi.media.S0, com.inmobi.media.AbstractC3037gc
    public final void i(GestureDetectorOnGestureListenerC3005ec renderView) {
        F0 f0R;
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "onRenderViewVisible");
        }
        if (Q() == 4 && (f0R = r()) != null) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).a(strE2, "callback - onAdDisplayed");
            }
            d(f0R);
        }
        super.i(renderView);
    }

    @Override // com.inmobi.media.M1, com.inmobi.media.S0
    public final String q() {
        return "audio";
    }

    @Override // com.inmobi.media.M1, com.inmobi.media.AbstractC3037gc
    public final void a(boolean z2) {
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6 c6A = B6.a(contextD, "audio_pref_file");
        int i2 = c6A.f22735a.getInt("user_mute_count", 0);
        C6.a(c6A, "user_mute_count", z2 ? Math.max(0, i2 - 1) : i2 + 1, false, 4, (Object) null);
    }
}

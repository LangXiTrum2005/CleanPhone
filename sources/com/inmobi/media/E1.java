package com.inmobi.media;

import A.RunnableC0883c;
import A.RunnableC0905n;
import A.RunnableC0909p;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.p004ironsource.sv;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class E1 extends AbstractC3294we {
    public C3329z1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C3329z1 f22792p;
    public C3329z1 q;
    public C3329z1 r;

    public E1(InMobiAudio.a callbacks) {
        Intrinsics.f(callbacks, "callbacks");
        b(callbacks);
    }

    @Override // com.inmobi.media.AbstractC3294we
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        Intrinsics.f(callbacks, "callbacks");
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public final void b(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).c(str, "onAdFetchSuccess " + this);
        }
        C3329z1 c3329z1 = this.r;
        if ((c3329z1 != null ? c3329z1.m() : null) == null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String str2 = F1.f22805a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P2).b(str2, "adObject is null, fetch failed");
            }
            a((S0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            String str3 = F1.f22805a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P3).a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        s().post(new RunnableC0909p(this, info, 1));
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public final void c(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        a((byte) 0);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String str2 = F1.f22805a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P2).d(str2, "AdManager state - CREATED");
        }
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            String str3 = F1.f22805a;
            Intrinsics.e(str3, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P3).a(str3, "Ad load successful, providing callback");
        }
        s().post(new RunnableC0909p(this, info, 0));
    }

    @Override // com.inmobi.media.F0
    public final void d() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "onAdShowFailed " + this);
        }
        s().post(new RunnableC0883c(this, 2));
    }

    @Override // com.inmobi.media.AbstractC3294we
    public final S0 j() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).c(str, "shouldUseForegroundUnit " + this);
        }
        C3329z1 c3329z1 = this.q;
        Byte bValueOf = c3329z1 != null ? Byte.valueOf(c3329z1.Q()) : null;
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String str2 = F1.f22805a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P2).d(str2, "State - " + bValueOf);
        }
        return ((bValueOf == null || bValueOf.byteValue() != 4) && (bValueOf == null || bValueOf.byteValue() != 7) && (bValueOf == null || bValueOf.byteValue() != 6)) ? this.r : this.q;
    }

    @Override // com.inmobi.media.AbstractC3294we
    public final void w() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "submitAdLoadCalled " + this);
        }
        C3329z1 c3329z1 = this.r;
        if (c3329z1 != null) {
            c3329z1.t0();
        }
    }

    public final void x() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).c(str, "registerLifeCycleCallbacks " + this);
        }
        C3329z1 c3329z1 = this.o;
        if (c3329z1 != null) {
            c3329z1.H0();
        }
        C3329z1 c3329z2 = this.f22792p;
        if (c3329z2 != null) {
            c3329z2.H0();
        }
    }

    public final void y() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "loadIntoView " + this);
        }
        C3329z1 c3329z1 = this.r;
        if (c3329z1 == null) {
            throw new IllegalStateException(AbstractC3294we.m);
        }
        if (a("InMobi", c3329z1.I().toString())) {
            a((byte) 8);
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String str2 = F1.f22805a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P2).d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            c3329z1.j0();
        }
    }

    public static final void a(E1 this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public final void a(S0 s0, InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).b(str, sv.f27214b);
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
    }

    public static final void a(E1 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        InterfaceC3333z5 interfaceC3333z5P2 = this$0.p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public final void a(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "onAdDisplayed");
        }
        super.a(info);
        S0 s0J = j();
        if (s0J != null) {
            s0J.x0();
        }
    }

    public static final void b(E1 this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public final void b() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "onAdDismissed " + this);
        }
        a((byte) 0);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String str2 = F1.f22805a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P2).d(str2, "AdManager state - CREATED");
        }
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            ((A5) interfaceC3333z5P3).a();
        }
        super.b();
    }

    public final void a(InMobiAudio audio) {
        Intrinsics.f(audio, "audio");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a((RelativeLayout) audio);
            } else {
                s().post(new RunnableC0905n(1, this, audio));
            }
        } catch (Exception e2) {
            C3329z1 c3329z1 = this.r;
            if (c3329z1 != null) {
                c3329z1.d((short) 26);
            }
            String str2 = F1.f22805a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            AbstractC3048h7.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b(str2, rf.a(e2, H6.a(str2, "access$getTAG$p(...)", "Show failed with unexpected error: ")));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void b(String adSize) {
        Intrinsics.f(adSize, "adSize");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "load 1 " + this);
        }
        C3329z1 c3329z1 = this.r;
        if (c3329z1 != null && a("InMobi", c3329z1.I().toString(), l()) && c3329z1.e((byte) 1)) {
            a((byte) 1);
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String str2 = F1.f22805a;
                Intrinsics.e(str2, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P2).d(str2, "AdManager state - LOADING");
            }
            d(null);
            c3329z1.e(adSize);
            c3329z1.e(false);
        }
    }

    public static final void a(E1 this$0, RelativeLayout audio) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(audio, "$audio");
        this$0.a(audio);
    }

    public final void a(RelativeLayout relativeLayout) {
        InterfaceC3295x interfaceC3295xK;
        Z zI;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).a(str, "showAudioAd");
        }
        C3329z1 c3329z1 = this.q;
        if (c3329z1 != null ? c3329z1.E0() : false) {
            String str2 = F1.f22805a;
            Intrinsics.e(str2, "access$getTAG$p(...)");
            AbstractC3048h7.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b(str2, "ad is active");
            }
            C3329z1 c3329z2 = this.r;
            if (c3329z2 != null) {
                c3329z2.d((short) 15);
                return;
            }
            return;
        }
        C3329z1 c3329z3 = this.r;
        if (c3329z3 != null) {
            InterfaceC3333z5 interfaceC3333z5 = c3329z3.j;
            if (interfaceC3333z5 != null) {
                String strE = S0.e();
                Intrinsics.e(strE, "<get-TAG>(...)");
                ((A5) interfaceC3333z5).c(strE, "canProceedToShow");
            }
            if (c3329z3.W()) {
                String strE2 = S0.e();
                Intrinsics.e(strE2, "<get-TAG>(...)");
                AbstractC3048h7.a((byte) 1, strE2, "Ad Show has failed because current ad is expired. Please call load() again.");
                InterfaceC3333z5 interfaceC3333z6 = c3329z3.j;
                if (interfaceC3333z6 != null) {
                    String strE3 = S0.e();
                    Intrinsics.e(strE3, "<get-TAG>(...)");
                    ((A5) interfaceC3333z6).b(strE3, "ad is expired");
                }
                InterfaceC3333z5 interfaceC3333z7 = c3329z3.j;
                if (interfaceC3333z7 != null) {
                    String strE4 = S0.e();
                    Intrinsics.e(strE4, "<get-TAG>(...)");
                    ((A5) interfaceC3333z7).d(strE4, "AdUnit " + c3329z3 + " state - CREATED");
                }
                c3329z3.d((byte) 0);
                c3329z3.d((short) 2153);
                return;
            }
            byte bQ = c3329z3.Q();
            if (bQ == 1 || bQ == 2) {
                AbstractC3048h7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                InterfaceC3333z5 interfaceC3333z8 = c3329z3.j;
                if (interfaceC3333z8 != null) {
                    String strE5 = S0.e();
                    Intrinsics.e(strE5, "<get-TAG>(...)");
                    ((A5) interfaceC3333z8).b(strE5, "ad is not ready");
                }
                InterfaceC3333z5 interfaceC3333z9 = c3329z3.j;
                if (interfaceC3333z9 != null) {
                    String strE6 = S0.e();
                    Intrinsics.e(strE6, "<get-TAG>(...)");
                    ((A5) interfaceC3333z9).a(strE6, "callback - onShowFailure");
                }
                c3329z3.d((short) 2152);
                return;
            }
            if (bQ == 3) {
                AbstractC3048h7.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                c3329z3.d((short) 0);
                InterfaceC3333z5 interfaceC3333z10 = c3329z3.j;
                if (interfaceC3333z10 != null) {
                    String strE7 = S0.e();
                    Intrinsics.e(strE7, "<get-TAG>(...)");
                    ((A5) interfaceC3333z10).a(strE7, "callback - onShowFailure");
                }
                InterfaceC3333z5 interfaceC3333z11 = c3329z3.j;
                if (interfaceC3333z11 != null) {
                    String strE8 = S0.e();
                    Intrinsics.e(strE8, "<get-TAG>(...)");
                    ((A5) interfaceC3333z11).b(strE8, "ad is failed");
                    return;
                }
                return;
            }
            if (bQ == 8) {
                AbstractC3048h7.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                c3329z3.d((short) 0);
                InterfaceC3333z5 interfaceC3333z12 = c3329z3.j;
                if (interfaceC3333z12 != null) {
                    String strE9 = S0.e();
                    Intrinsics.e(strE9, "<get-TAG>(...)");
                    ((A5) interfaceC3333z12).a(strE9, "callback - onShowFailure");
                }
                InterfaceC3333z5 interfaceC3333z13 = c3329z3.j;
                if (interfaceC3333z13 != null) {
                    String strE10 = S0.e();
                    Intrinsics.e(strE10, "<get-TAG>(...)");
                    ((A5) interfaceC3333z13).b(strE10, "ad is unloaded");
                    return;
                }
                return;
            }
            if (bQ == 0) {
                AbstractC3048h7.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                c3329z3.d((short) 0);
                InterfaceC3333z5 interfaceC3333z14 = c3329z3.j;
                if (interfaceC3333z14 != null) {
                    String strE11 = S0.e();
                    Intrinsics.e(strE11, "<get-TAG>(...)");
                    ((A5) interfaceC3333z14).a(strE11, "callback - onShowFailure");
                }
                InterfaceC3333z5 interfaceC3333z15 = c3329z3.j;
                if (interfaceC3333z15 != null) {
                    String strE12 = S0.e();
                    Intrinsics.e(strE12, "<get-TAG>(...)");
                    ((A5) interfaceC3333z15).b(strE12, "show called before load");
                    return;
                }
                return;
            }
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null) {
                String str3 = F1.f22805a;
                Intrinsics.e(str3, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P3).a(str3, "swapAdUnits " + this);
            }
            C3329z1 c3329z4 = this.q;
            if (Intrinsics.a(c3329z4, this.o)) {
                this.q = this.f22792p;
                this.r = this.o;
            } else if (Intrinsics.a(c3329z4, this.f22792p) || c3329z4 == null) {
                this.q = this.o;
                this.r = this.f22792p;
            }
            InterfaceC3333z5 interfaceC3333z5P4 = p();
            if (interfaceC3333z5P4 != null) {
                String str4 = F1.f22805a;
                Intrinsics.e(str4, "access$getTAG$p(...)");
                ((A5) interfaceC3333z5P4).a(str4, "displayAd " + this);
            }
            C3329z1 c3329z5 = this.q;
            if (c3329z5 == null || (interfaceC3295xK = c3329z5.k()) == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) interfaceC3295xK;
            Xe viewableAd = gestureDetectorOnGestureListenerC3005ec.getViewableAd();
            C3329z1 c3329z6 = this.q;
            if (c3329z6 != null && (zI = c3329z6.I()) != null && zI.p()) {
                gestureDetectorOnGestureListenerC3005ec.e();
            }
            ViewParent parent = gestureDetectorOnGestureListenerC3005ec.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            View viewD = viewableAd.d();
            viewableAd.a((Map) null);
            C3329z1 c3329z7 = this.r;
            if (c3329z7 != null) {
                c3329z7.F0();
            }
            if (viewGroup == null) {
                relativeLayout.addView(viewD, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(viewD, layoutParams);
            }
            C3329z1 c3329z8 = this.r;
            if (c3329z8 != null) {
                c3329z8.g();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3294we
    public final void a(short s) {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = F1.f22805a;
            Intrinsics.e(str, "access$getTAG$p(...)");
            ((A5) interfaceC3333z5P).b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        C3329z1 c3329z1 = this.r;
        if (c3329z1 != null) {
            c3329z1.a(s);
        }
    }
}

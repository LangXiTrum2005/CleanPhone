package com.inmobi.media;

import A.RunnableC0902l0;
import A.RunnableC0904m0;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.p004ironsource.yq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J1\u0010\r\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\r\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u0013\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b\r\u0010*J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0003R*\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b2\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b\r\u00101R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0016R\u0011\u0010<\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010\u0016¨\u0006="}, d2 = {"Lcom/inmobi/media/o6;", "Lcom/inmobi/media/we;", "<init>", "()V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "e", "(Lcom/inmobi/ads/AdMetaInfo;)V", "", "shouldResetPubState", "", "errorCode", "a", "(ZS)V", "Lcom/inmobi/media/S0;", "adUnit", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "c", "(Lcom/inmobi/media/S0;Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "x", "()Z", "y", "Lcom/inmobi/media/Wa;", "pubSettings", "Landroid/content/Context;", "context", "sendLoadCalledTelemetry", "", "logType", "(Lcom/inmobi/media/Wa;Landroid/content/Context;ZLjava/lang/String;)V", "b", "D", "d", "Lcom/inmobi/ads/controllers/PublisherCallbacks;", "callbacks", "(Lcom/inmobi/ads/controllers/PublisherCallbacks;)V", "F", com.smartdigimkt.y4.g.f40227p, "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "E", "Lcom/inmobi/media/m6;", "o", "Lcom/inmobi/media/m6;", "z", "()Lcom/inmobi/media/m6;", "(Lcom/inmobi/media/m6;)V", "A", "interstitialAdUnit", "p", "Z", "showRequested", "j", "()Lcom/inmobi/media/S0;", "C", "isInitialised", "B", "isAdInReadyState", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C3159o6 extends AbstractC3294we {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private C3127m6 interstitialAdUnit;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean showRequested;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3159o6 this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3159o6 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        InterfaceC3333z5 interfaceC3333z5P2 = this$0.p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
        this$0.y();
    }

    private final void e(AdMetaInfo info) {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).c("InterstitialUnifiedAdManager", yq.f);
        }
        super.c(info);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        a((byte) 2);
        s().post(new RunnableC0902l0(this, info, 0));
    }

    public boolean C() {
        return this.interstitialAdUnit != null;
    }

    public final void D() throws IllegalStateException {
        S0 s0J;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "render");
        }
        C3127m6 c3127m6 = this.interstitialAdUnit;
        if (c3127m6 == null) {
            throw new IllegalStateException(AbstractC3294we.m);
        }
        if (c3127m6.H0() && n() != null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfoN = n();
            Intrinsics.c(adMetaInfoN);
            e(adMetaInfoN);
            return;
        }
        if (this.showRequested) {
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null) {
                ((A5) interfaceC3333z5P3).b("InMobi", AbstractC3294we.k);
            }
            AbstractC3048h7.a((byte) 1, "InMobi", AbstractC3294we.k);
            b(this.interstitialAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3127m6 c3127m7 = this.interstitialAdUnit;
            if (c3127m7 != null) {
                c3127m7.b((short) 2128);
                return;
            }
            return;
        }
        C3127m6 c3127m8 = this.interstitialAdUnit;
        C3040h c3040hM = c3127m8 != null ? c3127m8.m() : null;
        C3127m6 c3127m9 = this.interstitialAdUnit;
        boolean zA = a("InMobi", String.valueOf(c3127m9 != null ? c3127m9.I() : null));
        if (c3040hM == null) {
            InterfaceC3333z5 interfaceC3333z5P4 = p();
            if (interfaceC3333z5P4 != null) {
                ((A5) interfaceC3333z5P4).b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.interstitialAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3127m6 c3127m10 = this.interstitialAdUnit;
            if (c3127m10 != null) {
                c3127m10.a((short) 2166);
            }
        }
        if (n() == null) {
            InterfaceC3333z5 interfaceC3333z5P5 = p();
            if (interfaceC3333z5P5 != null) {
                ((A5) interfaceC3333z5P5).b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.interstitialAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3127m6 c3127m11 = this.interstitialAdUnit;
            if (c3127m11 != null) {
                c3127m11.a((short) 2167);
            }
        }
        if (c3040hM == null || !zA) {
            return;
        }
        if (v() && (s0J = j()) != null) {
            s0J.e((byte) 1);
        }
        InterfaceC3333z5 interfaceC3333z5P6 = p();
        if (interfaceC3333z5P6 != null) {
            ((A5) interfaceC3333z5P6).d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        a((byte) 8);
        C3127m6 c3127m12 = this.interstitialAdUnit;
        if (c3127m12 != null) {
            c3127m12.j0();
        }
    }

    public final void E() {
        C3127m6 c3127m6;
        Nd ndG0;
        C3127m6 c3127m7 = this.interstitialAdUnit;
        if ((c3127m7 == null || (ndG0 = c3127m7.G0()) == null || !ndG0.f23022b) && (c3127m6 = this.interstitialAdUnit) != null) {
            c3127m6.K0();
        }
    }

    public final void F() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "show");
        }
        C3127m6 c3127m6 = this.interstitialAdUnit;
        Nd ndG0 = c3127m6 != null ? c3127m6.G0() : null;
        if (ndG0 != null) {
            ndG0.f23022b = true;
        }
        C3127m6 c3127m7 = this.interstitialAdUnit;
        if (c3127m7 != null) {
            c3127m7.w0();
        }
        if (x()) {
            if (!G4.f22837a.a()) {
                if (this.interstitialAdUnit != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C3127m6 c3127m8 = this.interstitialAdUnit;
            if (c3127m8 == null || !c3127m8.e((byte) 4)) {
                return;
            }
            this.showRequested = true;
            C3127m6 c3127m9 = this.interstitialAdUnit;
            if (c3127m9 != null) {
                c3127m9.j(this);
            }
        }
    }

    public final void a(C3127m6 c3127m6) {
        this.interstitialAdUnit = c3127m6;
    }

    @Override // com.inmobi.media.F0
    public void d() {
        s().post(new RunnableC0904m0(this, 1));
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        a((byte) 6);
        C3127m6 c3127m6 = this.interstitialAdUnit;
        if (c3127m6 != null) {
            c3127m6.g();
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
    }

    @Override // com.inmobi.media.F0
    public void g() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        S0 s0J = j();
        if (s0J != null) {
            if (s0J.Q() == 6 || s0J.Q() == 7) {
                s0J.a(this);
            } else {
                a(true, (short) 2159);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3294we
    public S0 j() {
        return this.interstitialAdUnit;
    }

    public static /* synthetic */ void A() {
    }

    private final void a(boolean shouldResetPubState, short errorCode) {
        C3127m6 c3127m6;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (errorCode != 0 && (c3127m6 = this.interstitialAdUnit) != null) {
            c3127m6.c(errorCode);
        }
        s().post(new RunnableC0904m0(this, 0));
        if (shouldResetPubState) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            a((byte) 6);
            C3127m6 c3127m7 = this.interstitialAdUnit;
            if (c3127m7 != null) {
                c3127m7.g();
            }
        }
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            ((A5) interfaceC3333z5P3).a();
        }
    }

    private final boolean x() {
        byte bQ = q();
        if (bQ == 1) {
            InterfaceC3333z5 interfaceC3333z5P = p();
            if (interfaceC3333z5P != null) {
                ((A5) interfaceC3333z5P).b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            AbstractC3048h7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (bQ == 7) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (bQ != 5) {
            if (!this.showRequested) {
                return true;
            }
            C3127m6 c3127m6 = this.interstitialAdUnit;
            if (c3127m6 != null) {
                c3127m6.c((short) 2149);
            }
            AbstractC3048h7.a((byte) 1, "InMobi", AbstractC3294we.k);
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null) {
                ((A5) interfaceC3333z5P3).b("InMobi", AbstractC3294we.k);
            }
            return false;
        }
        if (this.interstitialAdUnit != null) {
            StringBuilder sb = new StringBuilder(AbstractC3294we.j);
            C3127m6 c3127m7 = this.interstitialAdUnit;
            sb.append(c3127m7 != null ? c3127m7.I() : null);
            AbstractC3048h7.a((byte) 1, "InMobi", sb.toString());
            InterfaceC3333z5 interfaceC3333z5P4 = p();
            if (interfaceC3333z5P4 != null) {
                StringBuilder sb2 = new StringBuilder(AbstractC3294we.j);
                C3127m6 c3127m8 = this.interstitialAdUnit;
                sb2.append(c3127m8 != null ? c3127m8.I() : null);
                ((A5) interfaceC3333z5P4).b("InMobi", sb2.toString());
            }
            a(false, (short) 2148);
        }
        return false;
    }

    private final void y() {
        C3127m6 c3127m6 = this.interstitialAdUnit;
        if (c3127m6 != null) {
            c3127m6.b((byte) 4);
        }
    }

    public final boolean B() {
        C3127m6 c3127m6 = this.interstitialAdUnit;
        if (c3127m6 != null && 2 == q()) {
            return c3127m6.H0();
        }
        return false;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final C3127m6 getInterstitialAdUnit() {
        return this.interstitialAdUnit;
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void b(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        d(info);
        if (this.interstitialAdUnit == null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((S0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        s().post(new RunnableC0902l0(this, info, 1));
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void c(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.interstitialAdUnit == null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b("InterstitialUnifiedAdManager", "adUnit is null");
            }
            c(null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        e(info);
    }

    public static /* synthetic */ void a(C3159o6 c3159o6, Wa wa, Context context, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            str = "intHtml";
        }
        c3159o6.a(wa, context, z2, str);
    }

    public final void a(Wa pubSettings, Context context, boolean sendLoadCalledTelemetry, String logType) {
        C3127m6 c3127m6;
        C3127m6 c3127m7;
        Intrinsics.f(pubSettings, "pubSettings");
        Intrinsics.f(context, "context");
        Intrinsics.f(logType, "logType");
        if (this.interstitialAdUnit == null) {
            this.interstitialAdUnit = new C3127m6(context, new X("int").a(pubSettings.f23322a).c(pubSettings.f23323b).a(pubSettings.f23324c).e(pubSettings.f23325e).b(pubSettings.f).a(), this);
        }
        if (sendLoadCalledTelemetry) {
            w();
        }
        String str = pubSettings.f23325e;
        if (str != null) {
            InterfaceC3333z5 interfaceC3333z5P = p();
            if (interfaceC3333z5P != null) {
                ((A5) interfaceC3333z5P).a();
            }
            a(Cb.a(logType, str, false));
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null && (c3127m7 = this.interstitialAdUnit) != null) {
                c3127m7.a(interfaceC3333z5P3);
            }
            InterfaceC3333z5 interfaceC3333z5P4 = p();
            if (interfaceC3333z5P4 != null) {
                ((A5) interfaceC3333z5P4).a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C3127m6 c3127m8 = this.interstitialAdUnit;
            Intrinsics.c(c3127m8);
            Cb.a(c3127m8, p());
        }
        C3127m6 c3127m9 = this.interstitialAdUnit;
        if (c3127m9 != null) {
            c3127m9.a(context);
        }
        C3127m6 c3127m10 = this.interstitialAdUnit;
        if (c3127m10 != null) {
            c3127m10.a(pubSettings.f23324c);
        }
        C3127m6 c3127m11 = this.interstitialAdUnit;
        if (c3127m11 != null) {
            c3127m11.c("activity");
        }
        if (pubSettings.d && (c3127m6 = this.interstitialAdUnit) != null) {
            c3127m6.F0();
        }
        WatermarkData watermarkDataT = t();
        if (watermarkDataT != null) {
            C3127m6 c3127m12 = this.interstitialAdUnit;
            if (c3127m12 != null) {
                c3127m12.a(watermarkDataT);
            }
            InterfaceC3333z5 interfaceC3333z5P5 = p();
            if (interfaceC3333z5P5 != null) {
                ((A5) interfaceC3333z5P5).c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    public final void c(PublisherCallbacks callbacks) {
        C3127m6 c3127m6;
        Intrinsics.f(callbacks, "callbacks");
        if (l() == null) {
            b(callbacks);
        }
        if (Intrinsics.a(u(), Boolean.FALSE)) {
            C3127m6 c3127m7 = this.interstitialAdUnit;
            if (c3127m7 != null) {
                c3127m7.a((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            InterfaceC3333z5 interfaceC3333z5P = p();
            if (interfaceC3333z5P != null) {
                ((A5) interfaceC3333z5P).b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            AbstractC3048h7.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.showRequested) {
            C3127m6 c3127m8 = this.interstitialAdUnit;
            if (c3127m8 != null) {
                c3127m8.a((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b("InMobi", AbstractC3294we.k);
            }
            AbstractC3048h7.a((byte) 1, "InMobi", AbstractC3294we.k);
            return;
        }
        a(Boolean.TRUE);
        C3127m6 c3127m9 = this.interstitialAdUnit;
        if (c3127m9 == null || !a("InMobi", String.valueOf(c3127m9.I()), callbacks) || (c3127m6 = this.interstitialAdUnit) == null || !c3127m6.e(o())) {
            return;
        }
        a((byte) 1);
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            StringBuilder sb = new StringBuilder("Fetching an Interstitial ad for placement id: ");
            C3127m6 c3127m10 = this.interstitialAdUnit;
            sb.append(c3127m10 != null ? c3127m10.I() : null);
            ((A5) interfaceC3333z5P3).c("InterstitialUnifiedAdManager", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Fetching an Interstitial ad for placement id: ");
        C3127m6 c3127m11 = this.interstitialAdUnit;
        sb2.append(c3127m11 != null ? c3127m11.I() : null);
        AbstractC3048h7.a((byte) 2, "InterstitialUnifiedAdManager", sb2.toString());
        C3127m6 c3127m12 = this.interstitialAdUnit;
        if (c3127m12 != null) {
            c3127m12.g(this);
        }
        C3127m6 c3127m13 = this.interstitialAdUnit;
        if (c3127m13 != null) {
            c3127m13.c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3159o6 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDisplayFailed();
        }
        this$0.y();
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void b() {
        s().post(new RunnableC0904m0(this, 2));
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        a((byte) 0);
        a((Boolean) null);
        C3127m6 c3127m6 = this.interstitialAdUnit;
        if (c3127m6 != null) {
            c3127m6.g();
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
    }

    private final void c(S0 adUnit, InMobiAdRequestStatus status) {
        byte bQ = q();
        if (bQ == 8 || bQ == 1) {
            b(adUnit, status);
            return;
        }
        if (bQ == 2) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            InterfaceC3333z5 interfaceC3333z5P = p();
            if (interfaceC3333z5P != null) {
                ((A5) interfaceC3333z5P).b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (bQ == 5) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                ((A5) interfaceC3333z5P2).b("InMobi", "Ad will be dismissed, Internal error");
            }
            y();
            b();
            return;
        }
        AbstractC3048h7.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            ((A5) interfaceC3333z5P3).b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3159o6 this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3159o6 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            ((A5) interfaceC3333z5P).a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdDismissed();
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void a(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        super.a(info);
        S0 s0J = j();
        if (s0J != null) {
            s0J.x0();
        }
        this.showRequested = false;
    }

    @Override // com.inmobi.media.AbstractC3294we
    public void a(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3127m6 c3127m6 = this.interstitialAdUnit;
        if (c3127m6 != null) {
            c3127m6.a(watermarkData);
        }
    }
}

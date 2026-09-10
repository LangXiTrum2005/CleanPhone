package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.p004ironsource.sv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0016J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0016J\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0016J\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u001eJ\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\"R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010(\u001a\n &*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010<\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0013\u0010>\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0013\u0010@\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0013\u0010B\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0013\u0010D\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0011\u0010H\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bI\u0010.R\u0013\u0010M\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/inmobi/media/V8;", "Lcom/inmobi/media/we;", "Lcom/inmobi/ads/controllers/PublisherCallbacks;", "callbacks", "<init>", "(Lcom/inmobi/ads/controllers/PublisherCallbacks;)V", "Lcom/inmobi/media/Wa;", "pubSettings", "Landroid/content/Context;", "context", "", "sendAdLoadTelemetry", "", "logType", "", "a", "(Lcom/inmobi/media/Wa;Landroid/content/Context;ZLjava/lang/String;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "b", "(Lcom/inmobi/ads/AdMetaInfo;)V", "J", "()V", "c", "d", "x", "N", "K", "M", "L", "(Lcom/inmobi/media/Wa;Landroid/content/Context;)V", com.smartdigimkt.q8.i.f37957c, com.smartdigimkt.h5.f.j, "isMuted", "(Z)V", "o", "Ljava/lang/String;", "DEBUG_LOG_TAG", "kotlin.jvm.PlatformType", "p", "TAG", "Lcom/inmobi/media/c8;", "q", "Lcom/inmobi/media/c8;", "mNativeAdUnit", "F", "()Z", "isAdInReadyState", "Lcom/inmobi/media/S0;", "j", "()Lcom/inmobi/media/S0;", "adUnit", "H", "isInitialised", "Lorg/json/JSONObject;", "E", "()Lorg/json/JSONObject;", "publisherJson", "D", "()Ljava/lang/String;", "adTitle", "z", "adDescription", "A", "adIconUrl", "B", "adLandingPageUrl", "y", "adCtaText", "", "C", "()F", "adRating", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "isAppDownload", "I", "()Ljava/lang/Boolean;", "isVideo", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class V8 extends AbstractC3294we {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String DEBUG_LOG_TAG;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private C2967c8 mNativeAdUnit;

    public V8(PublisherCallbacks callbacks) {
        Intrinsics.f(callbacks, "callbacks");
        this.DEBUG_LOG_TAG = "InMobi";
        this.TAG = "V8";
        b(callbacks);
    }

    public static /* synthetic */ void a(V8 v8, Wa wa, Context context, boolean z2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            str = "native";
        }
        v8.a(wa, context, z2, str);
    }

    public final String D() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null && (interfaceC3295xK = c2967c8.k()) != null) {
            Object dataModel = interfaceC3295xK.getDataModel();
            C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
            if (c3177p8 != null && (c3161o8 = c3177p8.f23891p) != null && (c3145n8 = c3161o8.f23868b) != null) {
                return c3145n8.f23829a;
            }
        }
        return null;
    }

    public final JSONObject E() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null && (interfaceC3295xK = c2967c8.k()) != null) {
            Object dataModel = interfaceC3295xK.getDataModel();
            C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
            if (c3177p8 != null && (c3161o8 = c3177p8.f23891p) != null) {
                return c3161o8.f23867a;
            }
        }
        return null;
    }

    public final boolean F() {
        C2967c8 c2967c8 = this.mNativeAdUnit;
        return c2967c8 != null && c2967c8.Q() == 4;
    }

    public final boolean G() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 == null || (interfaceC3295xK = c2967c8.k()) == null) {
            return false;
        }
        Object dataModel = interfaceC3295xK.getDataModel();
        C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
        if (c3177p8 == null || (c3161o8 = c3177p8.f23891p) == null || (c3145n8 = c3161o8.f23868b) == null) {
            return false;
        }
        return c3145n8.g;
    }

    public boolean H() {
        return this.mNativeAdUnit != null;
    }

    public final Boolean I() {
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null) {
            return Boolean.valueOf(c2967c8.k() instanceof C2934a9);
        }
        return null;
    }

    public final void J() {
        C2967c8 c2967c8;
        if (Intrinsics.a(u(), Boolean.FALSE)) {
            InterfaceC3333z5 interfaceC3333z5P = p();
            if (interfaceC3333z5P != null) {
                ((A5) interfaceC3333z5P).b(this.DEBUG_LOG_TAG, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        C2967c8 c2967c9 = this.mNativeAdUnit;
        if (c2967c9 == null || !a(this.DEBUG_LOG_TAG, String.valueOf(c2967c9.I()), l()) || (c2967c8 = this.mNativeAdUnit) == null || !c2967c8.e((byte) 1)) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P2).a(TAG, "internal load timer started");
        }
        a((byte) 1);
        C2967c8 c2967c10 = this.mNativeAdUnit;
        if (c2967c10 != null) {
            c2967c10.c0();
        }
    }

    public final void K() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "pause called");
        }
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null) {
            InterfaceC3333z5 interfaceC3333z5 = c2967c8.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("c8", com.ironsource.d9.h.t0);
            }
            if (c2967c8.Q() != 4 || (c2967c8.t() instanceof Activity)) {
                return;
            }
            InterfaceC3295x interfaceC3295xK = c2967c8.k();
            T7 t7 = interfaceC3295xK instanceof T7 ? (T7) interfaceC3295xK : null;
            if (t7 != null) {
                t7.l();
            }
        }
    }

    public final void L() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).c(TAG, "reportAdClickAndOpenLandingPage");
        }
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null) {
            InterfaceC3333z5 interfaceC3333z5 = c2967c8.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("c8", "reportAdClickAndOpenLandingPage");
            }
            InterfaceC3295x interfaceC3295xK = c2967c8.k();
            if (interfaceC3295xK == null) {
                InterfaceC3333z5 interfaceC3333z6 = c2967c8.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("c8", "container is null. ignoring");
                    return;
                }
                return;
            }
            T7 t7 = interfaceC3295xK instanceof T7 ? (T7) interfaceC3295xK : null;
            C3177p8 c3177p8 = t7 != null ? t7.f23212b : null;
            if (c3177p8 != null) {
                C3161o8 c3161o8 = c3177p8.f23891p;
                C2984d8 c2984d8 = c3161o8 != null ? c3161o8.f23869c : null;
                if (c2984d8 != null) {
                    InterfaceC3333z5 interfaceC3333z7 = c2967c8.j;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).a("c8", "reporting ad click and opening landing page");
                    }
                    t7.a((View) null, c2984d8);
                    t7.a(c2984d8, true);
                }
            }
        }
    }

    public final void M() {
        We we;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "resume called");
        }
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null) {
            InterfaceC3333z5 interfaceC3333z5 = c2967c8.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("c8", com.ironsource.d9.h.u0);
            }
            if (c2967c8.Q() != 4 || (c2967c8.t() instanceof Activity)) {
                return;
            }
            InterfaceC3295x interfaceC3295xK = c2967c8.k();
            T7 t7 = interfaceC3295xK instanceof T7 ? (T7) interfaceC3295xK : null;
            if (t7 != null) {
                InterfaceC3333z5 interfaceC3333z6 = t7.j;
                if (interfaceC3333z6 != null) {
                    String TAG2 = t7.m;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).c(TAG2, com.ironsource.d9.h.u0);
                }
                t7.f23220u = false;
                T8 t8A = T7.a(t7.g());
                if (t8A != null) {
                    t8A.c();
                }
                t7.p();
                Context contextD = t7.d();
                if (contextD == null || (we = t7.f23219p) == null) {
                    return;
                }
                we.a(contextD, (byte) 0);
            }
        }
    }

    public final void N() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).c(TAG, "takeAction");
        }
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 == null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String TAG2 = this.TAG;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z5P2).b(TAG2, "InMobiNative is not initialized. Ignoring takeAction");
                return;
            }
            return;
        }
        T7 t7G = c2967c8.G();
        if (t7G != null) {
            InterfaceC3333z5 interfaceC3333z5 = t7G.j;
            if (interfaceC3333z5 != null) {
                String TAG3 = t7G.m;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z5).c(TAG3, "takeAction");
            }
            C2984d8 c2984d8 = t7G.f23203E;
            String str = t7G.f23204F;
            Intent intent = t7G.G;
            Context context = (Context) t7G.x.get();
            if (c2984d8 != null && str != null) {
                t7G.a(c2984d8, c2984d8.g, str, null);
            } else {
                if (intent == null || context == null) {
                    return;
                }
                Uc.f23270a.a(context, intent);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void b(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).c(TAG, "onAdFetchSuccess");
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 == null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String TAG2 = this.TAG;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z5P2).b(TAG2, "adunit is null. load failed.");
            }
            a((S0) null, inMobiAdRequestStatus);
            return;
        }
        if (c2967c8.m() == null) {
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null) {
                String TAG3 = this.TAG;
                Intrinsics.e(TAG3, "TAG");
                ((A5) interfaceC3333z5P3).b(TAG3, "adObject is null. load failed");
            }
            a((S0) null, inMobiAdRequestStatus);
            return;
        }
        super.b(info);
        s().post(new A.L(this, info, 1));
        if (F()) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5P4 = p();
        if (interfaceC3333z5P4 != null) {
            String TAG4 = this.TAG;
            Intrinsics.e(TAG4, "TAG");
            ((A5) interfaceC3333z5P4).a(TAG4, "ad is ready. start ad render");
        }
        C2967c8 c2967c9 = this.mNativeAdUnit;
        if (c2967c9 != null) {
            c2967c9.j0();
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void c(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).b(TAG, "onAdLoadSucceeded");
        }
        super.c(info);
        a((byte) 2);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String TAG2 = this.TAG;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z5P2).d(TAG2, "AdManager state - LOADED");
        }
        s().post(new A.L(this, info, 0));
    }

    @Override // com.inmobi.media.F0
    public void d() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).b(TAG, sv.f27216e);
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
    }

    @Override // com.inmobi.media.F0
    public void f() {
        s().post(new A.J(this, 1));
    }

    @Override // com.inmobi.media.F0
    public void i() {
        s().post(new A.J(this, 0));
    }

    @Override // com.inmobi.media.AbstractC3294we
    public S0 j() {
        return this.mNativeAdUnit;
    }

    public final String A() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null && (interfaceC3295xK = c2967c8.k()) != null) {
            Object dataModel = interfaceC3295xK.getDataModel();
            C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
            if (c3177p8 != null && (c3161o8 = c3177p8.f23891p) != null && (c3145n8 = c3161o8.f23868b) != null) {
                return c3145n8.f23831c;
            }
        }
        return null;
    }

    public final String B() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null && (interfaceC3295xK = c2967c8.k()) != null) {
            Object dataModel = interfaceC3295xK.getDataModel();
            C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
            if (c3177p8 != null && (c3161o8 = c3177p8.f23891p) != null && (c3145n8 = c3161o8.f23868b) != null) {
                return c3145n8.f;
            }
        }
        return null;
    }

    public final float C() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 == null || (interfaceC3295xK = c2967c8.k()) == null) {
            return 0.0f;
        }
        Object dataModel = interfaceC3295xK.getDataModel();
        C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
        if (c3177p8 == null || (c3161o8 = c3177p8.f23891p) == null || (c3145n8 = c3161o8.f23868b) == null) {
            return 0.0f;
        }
        return c3145n8.f23832e;
    }

    public final void a(Wa pubSettings, Context context, boolean sendAdLoadTelemetry, String logType) {
        C2967c8 c2967c8;
        Intrinsics.f(pubSettings, "pubSettings");
        Intrinsics.f(context, "context");
        Intrinsics.f(logType, "logType");
        C2967c8 c2967c9 = this.mNativeAdUnit;
        if (c2967c9 == null) {
            this.mNativeAdUnit = new C2967c8(context, new X("native").a(pubSettings.f23322a).d(context instanceof Activity ? "activity" : "others").c(pubSettings.f23323b).a(pubSettings.f23324c).a(pubSettings.d).e(pubSettings.f23325e).b(pubSettings.f).a(), this);
        } else {
            c2967c9.a(context);
            C2967c8 c2967c10 = this.mNativeAdUnit;
            if (c2967c10 != null) {
                c2967c10.c(context instanceof Activity ? "activity" : "others");
            }
        }
        if (sendAdLoadTelemetry) {
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
            if (interfaceC3333z5P2 != null && (c2967c8 = this.mNativeAdUnit) != null) {
                c2967c8.a(interfaceC3333z5P2);
            }
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null) {
                String TAG = this.TAG;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5P3).a(TAG, "adding mNativeAdUnit to referenceTracker");
            }
            C2967c8 c2967c11 = this.mNativeAdUnit;
            Intrinsics.c(c2967c11);
            Cb.a(c2967c11, p());
        }
        InterfaceC3333z5 interfaceC3333z5P4 = p();
        if (interfaceC3333z5P4 != null) {
            String TAG2 = this.TAG;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z5P4).a(TAG2, "load called");
        }
        C2967c8 c2967c12 = this.mNativeAdUnit;
        if (c2967c12 != null) {
            c2967c12.a(pubSettings.f23324c);
        }
    }

    public final void x() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "destroy called");
        }
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null) {
            c2967c8.D0();
        }
        this.mNativeAdUnit = null;
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            ((A5) interfaceC3333z5P2).a();
        }
    }

    public final String y() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null && (interfaceC3295xK = c2967c8.k()) != null) {
            Object dataModel = interfaceC3295xK.getDataModel();
            C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
            if (c3177p8 != null && (c3161o8 = c3177p8.f23891p) != null && (c3145n8 = c3161o8.f23868b) != null) {
                return c3145n8.d;
            }
        }
        return null;
    }

    public final String z() {
        InterfaceC3295x interfaceC3295xK;
        C3161o8 c3161o8;
        C3145n8 c3145n8;
        C2967c8 c2967c8 = this.mNativeAdUnit;
        if (c2967c8 != null && (interfaceC3295xK = c2967c8.k()) != null) {
            Object dataModel = interfaceC3295xK.getDataModel();
            C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
            if (c3177p8 != null && (c3161o8 = c3177p8.f23891p) != null && (c3145n8 = c3161o8.f23868b) != null) {
                return c3145n8.f23830b;
            }
        }
        return null;
    }

    @Override // com.inmobi.media.F0
    public void c() {
        s().post(new A.J(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(V8 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String TAG = this$0.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "callback - onVideoSkipped");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onVideoSkipped();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(V8 this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String TAG = this$0.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(V8 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String TAG = this$0.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "callback - onVideoCompleted");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onVideoCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(V8 this$0, AdMetaInfo info) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(info, "$info");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String TAG = this$0.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
        }
    }

    public final void a(Wa pubSettings, Context context) {
        V8 v8;
        Intrinsics.f(pubSettings, "pubSettings");
        Intrinsics.f(context, "context");
        if (this.mNativeAdUnit == null) {
            v8 = this;
            a(v8, pubSettings, context, false, null, 8, null);
        } else {
            v8 = this;
        }
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = v8.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).c(TAG, "showOnLockScreen");
        }
        C2967c8 c2967c8 = v8.mNativeAdUnit;
        if (c2967c8 != null) {
            c2967c8.O = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(V8 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String TAG = this$0.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "callback - onAdImpressed");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdImpressed();
        }
    }

    @Override // com.inmobi.media.F0
    public void a(boolean isMuted) {
        s().post(new A.K(0, this, isMuted));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(V8 this$0, boolean z2) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5P = this$0.p();
        if (interfaceC3333z5P != null) {
            String TAG = this$0.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).a(TAG, "callback -onAudioStateChanged - " + z2);
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAudioStateChanged(z2);
        }
    }
}

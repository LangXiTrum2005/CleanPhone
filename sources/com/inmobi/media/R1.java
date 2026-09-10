package com.inmobi.media;

import A.RunnableC0879a;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.qt;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\f\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0015J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\f\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b\f\u0010(J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b\f\u0010+J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010\u0003J\u001d\u0010\f\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b\f\u00100J\u0015\u0010\f\u001a\u00020\u00132\u0006\u00102\u001a\u000201¢\u0006\u0004\b\f\u00103J\r\u00104\u001a\u00020\u000b¢\u0006\u0004\b4\u0010\u0003J\r\u00105\u001a\u00020\u0013¢\u0006\u0004\b5\u0010\u0015J\r\u00106\u001a\u00020\u000b¢\u0006\u0004\b6\u0010\u0003J\r\u00107\u001a\u00020\u000b¢\u0006\u0004\b7\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b\u0010\u0010:J\u000f\u0010;\u001a\u00020\u0013H\u0002¢\u0006\u0004\b;\u0010\u0015J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020&H\u0002¢\u0006\u0004\b\u0010\u0010(J\u000f\u0010=\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010\u0003R\u0014\u0010@\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010C\u001a\n A*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010FR\u0018\u0010M\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010Q\u001a\u0004\u0018\u00010N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u0015R\u0011\u0010V\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bW\u0010\u0015¨\u0006Y"}, d2 = {"Lcom/inmobi/media/R1;", "Lcom/inmobi/media/we;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/inmobi/media/Wa;", "pubSettings", "", com.ironsource.d9.h.O, "logType", "", "a", "(Landroid/content/Context;Lcom/inmobi/media/Wa;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "b", "(Lcom/inmobi/ads/AdMetaInfo;)V", "c", "", "C", "()Z", "", "next", "callerIndex", "Lcom/inmobi/media/ec;", "renderView", "(IILcom/inmobi/media/ec;)V", "y", "Lcom/inmobi/ads/controllers/PublisherCallbacks;", "callbacks", "isRefreshRequest", "(Lcom/inmobi/ads/controllers/PublisherCallbacks;Ljava/lang/String;Z)V", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "", qt.f26623n, "([BLcom/inmobi/ads/controllers/PublisherCallbacks;)V", "K", "Landroid/widget/RelativeLayout;", "banner", "(Landroid/widget/RelativeLayout;)V", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "H", "E", "_refreshInterval", "previousInterval", "(II)I", "", "adLoadCalledTimestamp", "(J)Z", "L", "x", "F", "z", "", "errorCode", "(S)V", "I", "inMobiBanner", "J", "o", "Ljava/lang/String;", "DEBUG_LOG_TAG", "kotlin.jvm.PlatformType", "p", "TAG", "Lcom/inmobi/media/M1;", "q", "Lcom/inmobi/media/M1;", "mBannerAdUnit1", "r", "mBannerAdUnit2", "s", "mForegroundBannerAdUnit", "t", "mBackgroundBannerAdUnit", "Lcom/inmobi/media/S0;", "j", "()Lcom/inmobi/media/S0;", "adUnit", "D", "isInitialised", "A", "()I", "defaultRefreshInterval", "B", "isActive", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class R1 extends AbstractC3294we {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String DEBUG_LOG_TAG = "InMobi";

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String TAG = "R1";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private M1 mBannerAdUnit1;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private M1 mBannerAdUnit2;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private M1 mForegroundBannerAdUnit;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private M1 mBackgroundBannerAdUnit;

    private final boolean I() {
        M1 m1 = this.mForegroundBannerAdUnit;
        Byte bValueOf = m1 != null ? Byte.valueOf(m1.Q()) : null;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P).c(TAG, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    private final void J() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "submitAdShowFail ", this));
        }
        S0 s0J = j();
        if (s0J != null) {
            s0J.c((short) 2239);
        }
    }

    public final int A() {
        AdConfig adConfigJ;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "defaultRefreshInterval ", this));
        }
        S0 s0J = j();
        if (s0J == null || (adConfigJ = s0J.j()) == null) {
            return -1;
        }
        return adConfigJ.getDefaultRefreshInterval();
    }

    public final boolean B() {
        String TAG = this.TAG;
        Intrinsics.e(TAG, "TAG");
        Intrinsics.a(this.mForegroundBannerAdUnit, this.mBannerAdUnit1);
        String TAG2 = this.TAG;
        Intrinsics.e(TAG2, "TAG");
        Intrinsics.a(this.mBackgroundBannerAdUnit, this.mBannerAdUnit1);
        String TAG3 = this.TAG;
        Intrinsics.e(TAG3, "TAG");
        Intrinsics.a(this.mForegroundBannerAdUnit, this.mBannerAdUnit2);
        String TAG4 = this.TAG;
        Intrinsics.e(TAG4, "TAG");
        Intrinsics.a(this.mBackgroundBannerAdUnit, this.mBannerAdUnit2);
        String TAG5 = this.TAG;
        Intrinsics.e(TAG5, "TAG");
        M1 m1 = this.mBannerAdUnit1;
        if (m1 != null) {
            m1.E0();
        }
        M1 m2 = this.mBannerAdUnit1;
        if (m2 != null) {
            m2.Q();
        }
        Objects.toString(this.mBannerAdUnit1);
        String TAG6 = this.TAG;
        Intrinsics.e(TAG6, "TAG");
        M1 m3 = this.mBannerAdUnit2;
        if (m3 != null) {
            m3.E0();
        }
        M1 m4 = this.mBannerAdUnit2;
        if (m4 != null) {
            m4.Q();
        }
        Objects.toString(this.mBannerAdUnit2);
        M1 m5 = this.mForegroundBannerAdUnit;
        if (m5 != null) {
            return m5.E0();
        }
        return false;
    }

    public final boolean C() {
        C3040h c3040hM;
        M1 m1 = this.mForegroundBannerAdUnit;
        if (m1 == null || (c3040hM = m1.m()) == null) {
            return false;
        }
        return Intrinsics.a(c3040hM.p(), "audio");
    }

    public boolean D() {
        return (this.mBannerAdUnit1 == null || this.mBannerAdUnit2 == null) ? false : true;
    }

    public final void E() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "pause ", this));
        }
        M1 m1 = this.mForegroundBannerAdUnit;
        if (m1 != null) {
            m1.F0();
        }
    }

    public final void F() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        M1 m1 = this.mBannerAdUnit1;
        if (m1 != null) {
            m1.H0();
        }
        M1 m2 = this.mBannerAdUnit2;
        if (m2 != null) {
            m2.H0();
        }
    }

    public final void G() throws IllegalStateException {
        M1 m1;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "render ", this));
        }
        M1 m2 = this.mBackgroundBannerAdUnit;
        if (m2 == null) {
            throw new IllegalStateException(AbstractC3294we.m);
        }
        if (a(this.DEBUG_LOG_TAG, m2.I().toString())) {
            if (v() && (m1 = this.mBackgroundBannerAdUnit) != null) {
                m1.e((byte) 1);
            }
            a((byte) 8);
            m2.j0();
        }
    }

    public final void H() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "resume ", this));
        }
        M1 m1 = this.mForegroundBannerAdUnit;
        if (m1 != null) {
            m1.G0();
        }
    }

    public final void K() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "swapAdUnits ", this));
        }
        M1 m1 = this.mForegroundBannerAdUnit;
        if (m1 == null) {
            this.mForegroundBannerAdUnit = this.mBannerAdUnit1;
            this.mBackgroundBannerAdUnit = this.mBannerAdUnit2;
        } else if (m1.equals(this.mBannerAdUnit1)) {
            this.mForegroundBannerAdUnit = this.mBannerAdUnit2;
            this.mBackgroundBannerAdUnit = this.mBannerAdUnit1;
        } else if (m1.equals(this.mBannerAdUnit2)) {
            this.mForegroundBannerAdUnit = this.mBannerAdUnit1;
            this.mBackgroundBannerAdUnit = this.mBannerAdUnit2;
        }
    }

    public final void L() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        M1 m1 = this.mBannerAdUnit1;
        if (m1 != null) {
            m1.J0();
        }
        M1 m2 = this.mBannerAdUnit2;
        if (m2 != null) {
            m2.J0();
        }
    }

    public final void a(Context context, Wa pubSettings, String adSize, String logType) {
        Intrinsics.f(context, "context");
        Intrinsics.f(pubSettings, "pubSettings");
        Intrinsics.f(adSize, "adSize");
        Intrinsics.f(logType, "logType");
        Intrinsics.e(this.TAG, "TAG");
        Z zA = new X("banner").d(context instanceof Activity ? "activity" : "others").a(pubSettings.f23322a).c(pubSettings.f23323b).a(pubSettings.f23324c).a(adSize).a(pubSettings.d).e(pubSettings.f23325e).b(pubSettings.f).a();
        String str = pubSettings.f23325e;
        if (str != null) {
            InterfaceC3333z5 interfaceC3333z5P = p();
            if (interfaceC3333z5P != null) {
                ((A5) interfaceC3333z5P).a();
            }
            a(Cb.a(logType, str, false));
        }
        M1 m1 = this.mBannerAdUnit1;
        if (m1 == null || this.mBannerAdUnit2 == null) {
            this.mBannerAdUnit1 = new M1(context, zA, this);
            M1 m2 = new M1(context, zA, this);
            this.mBannerAdUnit2 = m2;
            this.mBackgroundBannerAdUnit = this.mBannerAdUnit1;
            this.mForegroundBannerAdUnit = m2;
        } else {
            m1.a(context, zA, this);
            M1 m3 = this.mBannerAdUnit2;
            if (m3 != null) {
                m3.a(context, zA, this);
            }
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            M1 m4 = this.mBannerAdUnit1;
            if (m4 != null) {
                m4.a(interfaceC3333z5P2);
            }
            M1 m5 = this.mBannerAdUnit2;
            if (m5 != null) {
                m5.a(interfaceC3333z5P2);
            }
            InterfaceC3333z5 interfaceC3333z5P3 = p();
            if (interfaceC3333z5P3 != null) {
                String TAG = this.TAG;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5P3).a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            EnumC2932a7 enumC2932a7 = Cb.f22744a;
            M1 m6 = this.mBannerAdUnit1;
            Intrinsics.c(m6);
            Cb.a(m6, p());
            InterfaceC3333z5 interfaceC3333z5P4 = p();
            if (interfaceC3333z5P4 != null) {
                String TAG2 = this.TAG;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z5P4).a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            M1 m7 = this.mBannerAdUnit2;
            Intrinsics.c(m7);
            Cb.a(m7, p());
        }
        WatermarkData watermarkDataT = t();
        if (watermarkDataT != null) {
            M1 m8 = this.mBannerAdUnit1;
            if (m8 != null) {
                m8.a(watermarkDataT);
            }
            M1 m9 = this.mBannerAdUnit2;
            if (m9 != null) {
                m9.a(watermarkDataT);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void b(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "onAdFetchSuccess ", this));
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        M1 m1 = this.mBackgroundBannerAdUnit;
        if ((m1 != null ? m1.m() : null) == null) {
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String TAG = this.TAG;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5P2).b(TAG, "backgroundAdUnit ad object is null");
            }
            a((S0) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            String TAG2 = this.TAG;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z5P3).a(TAG2, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        s().post(new A.B(this, info, 1));
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void c(AdMetaInfo info) {
        Intrinsics.f(info, "info");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "onAdLoadSucceeded ", this));
        }
        super.c(info);
        a((byte) 0);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P2).a(TAG, "Ad load successful, providing callback");
        }
        s().post(new A.B(this, info, 0));
    }

    @Override // com.inmobi.media.AbstractC3294we
    public S0 j() {
        return I() ? this.mForegroundBannerAdUnit : this.mBackgroundBannerAdUnit;
    }

    public final boolean x() {
        M1 m1;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "canProceedForSuccess ", this));
        }
        if (this.mForegroundBannerAdUnit != null && (m1 = this.mBackgroundBannerAdUnit) != null) {
            m1.Q();
        }
        return true;
    }

    public final boolean y() {
        M1 m1;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "canScheduleRefresh ", this));
        }
        M1 m2 = this.mBackgroundBannerAdUnit;
        if (m2 == null) {
            return false;
        }
        Byte bValueOf = Byte.valueOf(m2.Q());
        if (bValueOf.byteValue() != 4 && bValueOf.byteValue() != 1 && bValueOf.byteValue() != 2 && ((m1 = this.mForegroundBannerAdUnit) == null || m1.Q() != 7)) {
            return true;
        }
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P2).a(TAG, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void z() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "clear ", this));
        }
        L();
        M1 m1 = this.mBannerAdUnit1;
        if (m1 != null) {
            m1.g();
        }
        this.mBannerAdUnit1 = null;
        M1 m2 = this.mBannerAdUnit2;
        if (m2 != null) {
            m2.g();
        }
        this.mBannerAdUnit2 = null;
        a((InterfaceC3333z5) null);
        this.mForegroundBannerAdUnit = null;
        this.mBackgroundBannerAdUnit = null;
        a((Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(R1 this$0, AdMetaInfo info) {
        Unit unit;
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
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.b((short) 2184);
        }
    }

    @Override // com.inmobi.media.AbstractC3294we, com.inmobi.media.F0
    public void b() {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "onAdDismissed ", this));
        }
        a((byte) 0);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P2).d(TAG, "AdManager state - CREATED");
        }
        super.b();
    }

    private final void b(RelativeLayout inMobiBanner) {
        Z zI;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "displayInternal ", this));
        }
        M1 m1 = this.mForegroundBannerAdUnit;
        if (m1 == null) {
            return;
        }
        InterfaceC3295x interfaceC3295xK = m1.k();
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = interfaceC3295xK instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) interfaceC3295xK : null;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            return;
        }
        Xe viewableAd = gestureDetectorOnGestureListenerC3005ec.getViewableAd();
        M1 m2 = this.mForegroundBannerAdUnit;
        if (m2 != null && (zI = m2.I()) != null && zI.p()) {
            gestureDetectorOnGestureListenerC3005ec.e();
        }
        View viewD = viewableAd.d();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC3005ec.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(viewD, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewD, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R1 this$0, AdMetaInfo info) {
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
            return;
        }
        InterfaceC3333z5 interfaceC3333z5P2 = this$0.p();
        if (interfaceC3333z5P2 != null) {
            String TAG2 = this$0.TAG;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z5P2).b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.F0
    public void a(int next, int callerIndex, GestureDetectorOnGestureListenerC3005ec renderView) {
        ViewParent parent;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "onShowNextPodAd ", this));
        }
        super.a(next, callerIndex, renderView);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String str2 = this.TAG;
            ((A5) interfaceC3333z5P2).a(str2, X8.a(str2, "TAG", "on Show next pod ad index: ", next));
        }
        if (renderView != null) {
            try {
                parent = renderView.getParent();
            } catch (Exception unused) {
                M1 m1 = this.mForegroundBannerAdUnit;
                if (m1 != null) {
                    m1.g(callerIndex);
                }
                M1 m2 = this.mForegroundBannerAdUnit;
                if (m2 != null) {
                    m2.b(callerIndex, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            M1 m3 = this.mForegroundBannerAdUnit;
            if (m3 != null) {
                m3.b(callerIndex, true);
            }
            b(inMobiBanner);
            s().post(new RunnableC0879a(this, callerIndex, 1));
            return;
        }
        M1 m4 = this.mForegroundBannerAdUnit;
        if (m4 != null) {
            m4.g(callerIndex);
        }
        M1 m5 = this.mForegroundBannerAdUnit;
        if (m5 != null) {
            m5.b(callerIndex, false);
        }
    }

    public final void b(short errorCode) {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "submitAdLoadFailed ", this));
        }
        S0 s0J = j();
        if (s0J != null) {
            s0J.b(errorCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R1 this$0, int i2) {
        Intrinsics.f(this$0, "this$0");
        M1 m1 = this$0.mForegroundBannerAdUnit;
        if (m1 != null) {
            m1.a(i2, false);
        }
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean isRefreshRequest) {
        M1 m1;
        Intrinsics.f(callbacks, "callbacks");
        Intrinsics.f(adSize, "adSize");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "load 1 ", this));
        }
        if (Intrinsics.a(u(), Boolean.FALSE)) {
            b(this.mBackgroundBannerAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            M1 m2 = this.mBackgroundBannerAdUnit;
            if (m2 != null) {
                m2.a((short) 2006);
            }
            AbstractC3048h7.a((byte) 1, this.DEBUG_LOG_TAG, "Cannot call load() API after calling load(byte[])");
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String TAG = this.TAG;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5P2).b(TAG, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        if (l() == null) {
            b(callbacks);
        }
        M1 m3 = this.mBackgroundBannerAdUnit;
        if (m3 == null || !a(this.DEBUG_LOG_TAG, String.valueOf(m3.I()), callbacks) || (m1 = this.mBackgroundBannerAdUnit) == null || !m1.e(o())) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            String TAG2 = this.TAG;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z5P3).d(TAG2, "AdManager state - LOADING");
        }
        a((byte) 1);
        d(null);
        M1 m4 = this.mBackgroundBannerAdUnit;
        Intrinsics.c(m4);
        m4.e(adSize);
        M1 m5 = this.mBackgroundBannerAdUnit;
        Intrinsics.c(m5);
        m5.e(isRefreshRequest);
    }

    @Override // com.inmobi.media.AbstractC3294we
    public void a(byte[] response, PublisherCallbacks callbacks) {
        M1 m1;
        Intrinsics.f(callbacks, "callbacks");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "load 2 ", this));
        }
        if (Intrinsics.a(u(), Boolean.TRUE)) {
            AbstractC3048h7.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            InterfaceC3333z5 interfaceC3333z5P2 = p();
            if (interfaceC3333z5P2 != null) {
                String TAG = this.TAG;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5P2).b(TAG, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        a(Boolean.FALSE);
        a((byte) 1);
        b(callbacks);
        if (this.mBackgroundBannerAdUnit != null) {
            M1 m2 = this.mForegroundBannerAdUnit;
            if ((m2 == null || !m2.Y()) && (m1 = this.mBackgroundBannerAdUnit) != null && m1.e((byte) 1)) {
                InterfaceC3333z5 interfaceC3333z5P3 = p();
                if (interfaceC3333z5P3 != null) {
                    String TAG2 = this.TAG;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z5P3).a(TAG2, "timer started - load banner");
                }
                M1 m3 = this.mBackgroundBannerAdUnit;
                if (m3 != null) {
                    m3.e0();
                }
                M1 m4 = this.mBackgroundBannerAdUnit;
                if (m4 != null) {
                    m4.a(response);
                }
            }
        }
    }

    public final void a(RelativeLayout banner) {
        Z zI;
        Intrinsics.f(banner, "banner");
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).a(str, Q1.a(str, "TAG", "displayAd ", this));
        }
        M1 m1 = this.mForegroundBannerAdUnit;
        InterfaceC3295x interfaceC3295xK = m1 != null ? m1.k() : null;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = interfaceC3295xK instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) interfaceC3295xK : null;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            return;
        }
        Xe viewableAd = gestureDetectorOnGestureListenerC3005ec.getViewableAd();
        M1 m2 = this.mForegroundBannerAdUnit;
        if (m2 != null && (zI = m2.I()) != null && zI.p()) {
            gestureDetectorOnGestureListenerC3005ec.e();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3005ec.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewD = viewableAd.d();
        viewableAd.a(new HashMap());
        M1 m3 = this.mBackgroundBannerAdUnit;
        if (m3 != null) {
            m3.F0();
        }
        M1 m4 = this.mForegroundBannerAdUnit;
        if (m4 != null && m4.Q() == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            a(viewGroup, banner, layoutParams, view);
            J();
        } else {
            a(viewGroup, banner, layoutParams, viewD);
        }
        M1 m5 = this.mBackgroundBannerAdUnit;
        if (m5 != null) {
            m5.g();
        }
    }

    private static final void a(ViewGroup viewGroup, RelativeLayout relativeLayout, RelativeLayout.LayoutParams layoutParams, View view) {
        if (viewGroup == null) {
            relativeLayout.addView(view, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(view, layoutParams);
        }
    }

    @Override // com.inmobi.media.AbstractC3294we
    public void a(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        super.a(watermarkData);
        M1 m1 = this.mBannerAdUnit1;
        if (m1 != null) {
            m1.a(watermarkData);
        }
        M1 m2 = this.mBannerAdUnit2;
        if (m2 != null) {
            m2.a(watermarkData);
        }
    }

    public final int a(int _refreshInterval, int previousInterval) {
        AdConfig adConfigJ;
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "getRefreshInterval ", this));
        }
        M1 m1 = this.mBackgroundBannerAdUnit;
        if (m1 == null || (adConfigJ = m1.j()) == null) {
            return previousInterval;
        }
        return _refreshInterval < adConfigJ.getMinimumRefreshInterval() ? adConfigJ.getMinimumRefreshInterval() : _refreshInterval;
    }

    public final boolean a(long adLoadCalledTimestamp) {
        InterfaceC3333z5 interfaceC3333z5P = p();
        if (interfaceC3333z5P != null) {
            String str = this.TAG;
            ((A5) interfaceC3333z5P).c(str, Q1.a(str, "TAG", "checkForRefreshRate ", this));
        }
        M1 m1 = this.mBackgroundBannerAdUnit;
        if (m1 == null) {
            return false;
        }
        AdConfig adConfigJ = m1.j();
        Intrinsics.c(adConfigJ);
        int minimumRefreshInterval = adConfigJ.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - adLoadCalledTimestamp >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        InterfaceC3333z5 interfaceC3333z5P2 = p();
        if (interfaceC3333z5P2 != null) {
            String TAG = this.TAG;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5P2).b(TAG, "Early refresh request");
        }
        b(this.mBackgroundBannerAdUnit, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG2 = this.TAG;
        Intrinsics.e(TAG2, "TAG");
        StringBuilder sb = new StringBuilder("Ad cannot be refreshed before ");
        sb.append(minimumRefreshInterval);
        sb.append(" seconds (AdPlacement Id = ");
        M1 m2 = this.mBackgroundBannerAdUnit;
        sb.append(m2 != null ? m2.I() : null);
        sb.append(')');
        AbstractC3048h7.a((byte) 1, TAG2, sb.toString());
        InterfaceC3333z5 interfaceC3333z5P3 = p();
        if (interfaceC3333z5P3 != null) {
            String TAG3 = this.TAG;
            Intrinsics.e(TAG3, "TAG");
            StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
            sb2.append(minimumRefreshInterval);
            sb2.append(" seconds (AdPlacement Id = ");
            M1 m3 = this.mBackgroundBannerAdUnit;
            sb2.append(m3 != null ? m3.I() : null);
            sb2.append(')');
            ((A5) interfaceC3333z5P3).b(TAG3, sb2.toString());
        }
        return false;
    }
}

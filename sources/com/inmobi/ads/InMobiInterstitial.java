package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3047h6;
import com.inmobi.media.AbstractC3048h7;
import com.inmobi.media.AbstractC3285w5;
import com.inmobi.media.C3063i6;
import com.inmobi.media.C3143n6;
import com.inmobi.media.C3159o6;
import com.inmobi.media.C3301x5;
import com.inmobi.media.S5;
import com.inmobi.media.U3;
import com.inmobi.media.Uc;
import com.inmobi.media.Vc;
import com.inmobi.media.Wa;
import com.p004ironsource.qt;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 <2\u00020\u0001:\u0002=>B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\n2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0012R\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u0010;\u001a\u0002058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010\u0012\u001a\u0004\b8\u00109¨\u0006?"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "setListener", "(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "keywords", "setKeywords", "(Ljava/lang/String;)V", "getSignals", "()V", "", qt.f26623n, "load", "([B)V", "loadAdUnit", "show", "", "isReady", "()Z", "", "extras", "setExtras", "(Ljava/util/Map;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "disableHardwareAcceleration", "Lcom/inmobi/media/h6;", "mPubListener", "Lcom/inmobi/media/h6;", "getMPubListener$media_release", "()Lcom/inmobi/media/h6;", "setMPubListener$media_release", "(Lcom/inmobi/media/h6;)V", "Lcom/inmobi/media/o6;", "mAdManager", "Lcom/inmobi/media/o6;", "getMAdManager$media_release", "()Lcom/inmobi/media/o6;", "setMAdManager$media_release", "(Lcom/inmobi/media/o6;)V", "Lcom/inmobi/ads/PreloadManager;", com.smartdigimkt.h5.f.j, "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "Companion", "com/inmobi/media/x5", "a", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InMobiInterstitial {
    public static final C3301x5 Companion = new C3301x5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22636c;
    public final Wa d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22637e;
    public final f f;
    public C3159o6 mAdManager;
    public AbstractC3047h6 mPubListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial$a;", "Lcom/inmobi/media/n6;", "Lcom/inmobi/ads/InMobiInterstitial;", "interstitial", "<init>", "(Lcom/inmobi/ads/InMobiInterstitial;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C3143n6 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiInterstitial interstitial) {
            super(interstitial);
            Intrinsics.f(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C3143n6, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3143n6, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AbstractC3047h6 mPubListener$media_release;
            Intrinsics.f(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f23827a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3143n6, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            Intrinsics.f(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f23827a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().D();
                } catch (IllegalStateException e2) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    Intrinsics.e(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    AbstractC3048h7.a((byte) 1, strAccess$getTAG$cp, e2.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(Context context, long j, InterstitialAdEventListener listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(listener, "listener");
        Wa wa = new Wa();
        this.d = wa;
        this.f22637e = new a(this);
        this.f = new f(this);
        if (!Uc.q()) {
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        this.f22634a = applicationContext;
        wa.f23322a = j;
        this.f22636c = new WeakReference(context);
        setMPubListener$media_release(new C3063i6(listener));
        setMAdManager$media_release(new C3159o6());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    @Deprecated
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void disableHardwareAcceleration() {
        this.d.d = true;
    }

    public final C3159o6 getMAdManager$media_release() {
        C3159o6 c3159o6 = this.mAdManager;
        if (c3159o6 != null) {
            return c3159o6;
        }
        Intrinsics.m("mAdManager");
        throw null;
    }

    public final AbstractC3047h6 getMPubListener$media_release() {
        AbstractC3047h6 abstractC3047h6 = this.mPubListener;
        if (abstractC3047h6 != null) {
            return abstractC3047h6;
        }
        Intrinsics.m("mPubListener");
        throw null;
    }

    public final PreloadManager getPreloadManager() {
        return this.f;
    }

    @Deprecated
    public final void getSignals() {
        this.d.f23325e = "AB";
        C3159o6 mAdManager$media_release = getMAdManager$media_release();
        Wa wa = this.d;
        Context context = this.f22634a;
        if (context == null) {
            Intrinsics.m("mContext");
            throw null;
        }
        mAdManager$media_release.a(wa, context, false, "getToken");
        getMAdManager$media_release().a(this.f22637e);
    }

    public final boolean isReady() {
        boolean zB = getMAdManager$media_release().B();
        if (!zB) {
            getMAdManager$media_release().E();
        }
        return zB;
    }

    public final void load(byte[] response) {
        this.f22635b = true;
        this.d.f23325e = "AB";
        C3159o6 mAdManager$media_release = getMAdManager$media_release();
        Wa wa = this.d;
        Context context = this.f22634a;
        if (context == null) {
            Intrinsics.m("mContext");
            throw null;
        }
        C3159o6.a(mAdManager$media_release, wa, context, false, null, 12, null);
        if (Build.VERSION.SDK_INT >= 29) {
            U3.b((Context) this.f22636c.get());
        }
        getMAdManager$media_release().a(response, this.f22637e);
    }

    public final void loadAdUnit() {
        getMAdManager$media_release().c(this.f22637e);
    }

    public final void setContentUrl(String contentUrl) {
        Intrinsics.f(contentUrl, "contentUrl");
        this.d.f = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            Vc.a(extras.get("tp"));
            Vc.b(extras.get("tp-v"));
        }
        this.d.f23324c = extras;
    }

    public final void setKeywords(String keywords) {
        this.d.f23323b = keywords;
    }

    public final void setListener(InterstitialAdEventListener listener) {
        Intrinsics.f(listener, "listener");
        setMPubListener$media_release(new C3063i6(listener));
    }

    public final void setMAdManager$media_release(C3159o6 c3159o6) {
        Intrinsics.f(c3159o6, "<set-?>");
        this.mAdManager = c3159o6;
    }

    public final void setMPubListener$media_release(AbstractC3047h6 abstractC3047h6) {
        Intrinsics.f(abstractC3047h6, "<set-?>");
        this.mPubListener = abstractC3047h6;
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        Intrinsics.f(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    public final void show() {
        try {
            if (this.f22635b) {
                getMAdManager$media_release().F();
            } else {
                AbstractC3048h7.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e2) {
            AbstractC3048h7.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void load() {
        try {
            this.f22635b = true;
            this.d.f23325e = "NonAB";
            C3159o6 mAdManager$media_release = getMAdManager$media_release();
            Wa wa = this.d;
            Context context = this.f22634a;
            if (context != null) {
                C3159o6.a(mAdManager$media_release, wa, context, false, null, 12, null);
                if (Build.VERSION.SDK_INT >= 29) {
                    U3.b((Context) this.f22636c.get());
                }
                loadAdUnit();
                return;
            }
            Intrinsics.m("mContext");
            throw null;
        } catch (Exception e2) {
            AbstractC3048h7.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}

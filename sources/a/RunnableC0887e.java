package A;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.applovin.impl.EnumC0940i;
import com.applovin.impl.c3;
import com.applovin.impl.c5;
import com.applovin.impl.d2;
import com.applovin.impl.d5;
import com.applovin.impl.e2;
import com.applovin.impl.f1;
import com.applovin.impl.f4;
import com.applovin.impl.g1;
import com.applovin.impl.k7;
import com.applovin.impl.l8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.o8;
import com.applovin.impl.p5;
import com.applovin.impl.s4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinPostbackListener;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.A2;
import com.inmobi.media.Ab;
import com.inmobi.media.AbstractC3294we;
import com.inmobi.media.AbstractC3342ze;
import com.inmobi.media.Bf;
import com.inmobi.media.C3107l2;
import com.inmobi.media.C3127m6;
import com.inmobi.media.C3202r2;
import com.inmobi.media.C3270v6;
import com.inmobi.media.C3338za;
import com.inmobi.media.D8;
import com.inmobi.media.EnumC2932a7;
import com.inmobi.media.Fa;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.J8;
import com.inmobi.media.Pd;
import com.inmobi.media.S0;
import com.inmobi.media.Td;
import com.inmobi.media.pf;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: A.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0887e implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3172Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ RunnableC0887e(D8 d8, J8 j8, ViewGroup viewGroup) {
        this.X = 2;
        this.f3172Y = d8;
        this.e0 = j8;
        this.Z = viewGroup;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, androidx.media3.exoplayer.source.MediaSourceEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e0;
        Object obj2 = this.f3172Y;
        ?? r2 = this.Z;
        switch (this.X) {
            case 0:
                A2.a((A2) obj2, (ViewGroup) r2, (Bf) obj);
                break;
            case 1:
                Ab.a((Ab) obj2, (EnumC2932a7) r2, (JSONObject) obj);
                break;
            case 2:
                D8.a((D8) obj2, (J8) obj, (ViewGroup) r2);
                break;
            case 3:
                Fa.a((Function1) obj2, (Fa) r2, (C3338za) obj);
                break;
            case 4:
                Pd.c((String) obj2, (Map) r2, (Td) obj);
                break;
            case 5:
                S0.a((S0) obj2, (Function0) r2, (Function1) obj);
                break;
            case 6:
                C3127m6.a((C3127m6) obj2, (GestureDetectorOnGestureListenerC3005ec) r2, (Context) obj);
                break;
            case 7:
                pf.a((AdConfig.WebAssetCacheConfig) obj2, (pf) r2, (Context) obj);
                break;
            case 8:
                C3202r2.a((C3107l2) obj2, (C3202r2) r2, (Handler) obj);
                break;
            case 9:
                C3270v6.a((GestureDetectorOnGestureListenerC3005ec) obj2, (C3270v6) r2, (String) obj);
                break;
            case 10:
                AbstractC3294we.a((S0) obj2, (AbstractC3294we) r2, (InMobiAdRequestStatus) obj);
                break;
            case 11:
                AbstractC3342ze.b((InMobiUnifiedIdInterface) obj2, (JSONObject) r2, (Error) obj);
                break;
            case 12:
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.c) obj2).a((String) r2, obj);
                break;
            case 13:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj2;
                eventDispatcher.getClass();
                int i2 = Util.f5683a;
                eventDispatcher.f6081b.o((Format) r2, (DecoderReuseEvaluation) obj);
                break;
            case 14:
                DrmSessionEventListener.EventDispatcher eventDispatcher2 = (DrmSessionEventListener.EventDispatcher) obj2;
                r2.H(eventDispatcher2.f6224a, eventDispatcher2.f6225b, (Exception) obj);
                break;
            case 15:
                MediaSourceEventListener.EventDispatcher eventDispatcher3 = (MediaSourceEventListener.EventDispatcher) obj2;
                r2.O(eventDispatcher3.f6388a, eventDispatcher3.f6389b, (MediaLoadData) obj);
                break;
            case 16:
                VideoRendererEventListener.EventDispatcher eventDispatcher4 = (VideoRendererEventListener.EventDispatcher) obj2;
                eventDispatcher4.getClass();
                int i3 = Util.f5683a;
                eventDispatcher4.f6667b.q((Format) r2, (DecoderReuseEvaluation) obj);
                break;
            case 17:
                ((com.applovin.impl.adview.a) obj2).a((String) r2, (String) obj);
                break;
            case 18:
                ((e2) obj2).b((d2) r2, (List) obj);
                break;
            case 19:
                ((f1) obj2).a((List) r2, (CustomTabsSession) obj);
                break;
            case 20:
                ((f1) obj2).b((g1) r2, (CustomTabsSession) obj);
                break;
            case 21:
                ((f4) obj2).a((String) r2, (Runnable) obj);
                break;
            case 22:
                ((f4) obj2).a((View) r2, (List) obj);
                break;
            case 23:
                k7.a((com.applovin.impl.sdk.k) obj2, (String) r2, (com.applovin.impl.sdk.ad.b) obj);
                break;
            case 24:
                ((l8) obj2).b((com.applovin.impl.sdk.network.e) r2, (AppLovinPostbackListener) obj);
                break;
            case 25:
                ((MaxAdViewImpl) obj2).a((com.applovin.impl.mediation.ads.a.InterfaceC0034a) r2, (EnumC0940i) obj);
                break;
            case 26:
                ((MaxFullscreenAdImpl.b) obj2).a((c3) r2, (MaxAd) obj);
                break;
            case 27:
                ((MaxFullscreenAdImpl.b) obj2).a((String) r2, (MaxError) obj);
                break;
            case 28:
                o8.a((WebView) obj2, (String) r2, (s4) obj);
                break;
            default:
                ((p5) obj2).b((d5) r2, (c5.a) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC0887e(Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.f3172Y = obj;
        this.Z = obj2;
        this.e0 = obj3;
    }
}

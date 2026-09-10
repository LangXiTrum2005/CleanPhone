package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.AppMetrics;
import com.inmobi.media.ads.network.inmobiJson.model.CTA;
import com.inmobi.media.ads.network.inmobiJson.model.Description;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.Sponsored;
import com.inmobi.media.ads.network.inmobiJson.model.Title;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.saran;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3176qd extends AbstractC3361y implements InterfaceC2830cj, InterfaceC3204rh, InterfaceC2887f {
    public final MediaView b;
    public final View c;
    public final AbstractC2863e1 d;
    public final Nc e;
    public final Ec f;
    public final Jc g;
    public final D4 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3176qd(MediaView mediaView, View view, AbstractC2863e1 adSessionManager, Nc nativeBeaconProcessor, Ec nativeAdUnitComponent, Jc stateMachine) {
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C3336x c3336x = nativeAdUnitComponent.a;
        super(c3336x);
        this.b = mediaView;
        this.c = view;
        this.d = adSessionManager;
        this.e = nativeBeaconProcessor;
        this.f = nativeAdUnitComponent;
        this.g = stateMachine;
        G g = c3336x.b;
        this.h = new D4(g.h, g.a.a.a);
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void a() throws JSONException {
        NativeMedia media;
        AppMetrics appMetrics;
        Sponsored sponsored;
        CTA cta;
        Description description;
        Title title;
        Icon icon;
        AppMetrics appMetrics2;
        AppMetrics appMetrics3;
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeLoadedState", "Initialize Called");
        }
        Dc dc = (Dc) this.f.f.getValue();
        Map mapA = AbstractC2983ik.a(dc.a);
        long j = dc.b.a;
        saran saranVar = AbstractC2984il.a;
        mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        Wj wj = Wj.a;
        Wj.b("AdLoadSuccessful", mapA, EnumC2779ak.SDK);
        this.e.b.b.a(Te.a);
        JsonAssetObject assetsObject = this.f.b.getAssetsObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNative.APP_INSTALLS, (assetsObject == null || (appMetrics3 = assetsObject.getAppMetrics()) == null) ? null : appMetrics3.getDownloads());
        jSONObject.put(InMobiNative.LIKES, (assetsObject == null || (appMetrics2 = assetsObject.getAppMetrics()) == null) ? null : appMetrics2.getLikes());
        C2799be pubData = new C2799be((assetsObject == null || (title = assetsObject.getTitle()) == null) ? null : title.getText(), (assetsObject == null || (description = assetsObject.getDescription()) == null) ? null : description.getText(), new InMobiNativeImage((assetsObject == null || (icon = assetsObject.getIcon()) == null) ? null : icon.getUrl()), (assetsObject == null || (cta = assetsObject.getCta()) == null) ? null : cta.getText(), jSONObject, (assetsObject == null || (sponsored = assetsObject.getSponsored()) == null) ? null : sponsored.getText(), (assetsObject == null || (appMetrics = assetsObject.getAppMetrics()) == null) ? null : appMetrics.getRating(), Intrinsics.wireman((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video"), this.b, this.c);
        Ac ac = this.f.c;
        ac.getClass();
        Intrinsics.checkNotNullParameter(pubData, "pubData");
        InterfaceC2830cj interfaceC2830cj = ac.c;
        Cd cd = interfaceC2830cj instanceof Cd ? (Cd) interfaceC2830cj : null;
        if (cd != null) {
            cd.a(pubData);
        }
    }

    @Override // com.inmobi.media.InterfaceC2830cj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC3204rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeLoadedState", "registerViewForTracking - parentView: " + inMobiNativeViewData.getParentView() + ", isAttachedToWindow: " + inMobiNativeViewData.getParentView().isAttachedToWindow());
        }
        G g = this.a.b;
        Intrinsics.checkNotNullParameter(g, "<this>");
        long timeToLive = g.a.b.getCacheConfig("native").getTimeToLive();
        long millis = g.k;
        if (millis == -1) {
            millis = g.j + TimeUnit.SECONDS.toMillis(timeToLive);
        }
        if (millis - System.currentTimeMillis() < 0) {
            InterfaceC3072m9 interfaceC3072m9L2 = l();
            if (interfaceC3072m9L2 != null) {
                ((C3097n9) interfaceC3072m9L2).a("NativeLoadedState", "Ad-Expired");
            }
            Map mapA = AbstractC2983ik.a(((Dc) this.f.f.getValue()).a);
            Wj wj = Wj.a;
            Wj.b("AdExpired", mapA, EnumC2779ak.SDK);
        }
        this.h.a();
        C2811c0 c2811c0 = this.a.a.d;
        c2811c0.getClass();
        c2811c0.d = SystemClock.elapsedRealtime();
        this.e.b.d.a(Te.a);
        Map mapA2 = AbstractC2983ik.a(((Dc) this.f.f.getValue()).a);
        Wj wj2 = Wj.a;
        Wj.b("StartTracking", mapA2, EnumC2779ak.SDK);
        this.g.a(new C3251te(new C3276ue(new C3230si(), new Sg(inMobiNativeViewData, this.b, this.c), this.h, this.d, this.e, this.f), this.g), this);
    }

    @Override // com.inmobi.media.InterfaceC2887f
    public final Object a(dern dernVar) {
        InterfaceC3072m9 interfaceC3072m9L = l();
        if (interfaceC3072m9L != null) {
            ((C3097n9) interfaceC3072m9L).a("NativeLoadedState", "onDestroy");
        }
        Object objA = this.g.a(new Vc(), this, (ContinuationImpl) dernVar);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}

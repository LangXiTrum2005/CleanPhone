package com.p004ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.p004ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.model.Placement;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b:\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R(\u00100\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0013\u00103\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00104\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b!\u00102R\u0013\u00105\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b$\u00102R\u0013\u00106\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b'\u00102R\u0013\u00109\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b,\u00108¨\u0006<"}, d2 = {"Lcom/ironsource/qm;", "Lcom/ironsource/il;", "Lcom/ironsource/yn;", "Lcom/ironsource/vn;", "e", "", dc.q, "", "d", f.j, "Lcom/ironsource/sm;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onNativeAdLoadFailed", "b", "", "placementName", "Ljava/util/UUID;", "Ljava/util/UUID;", g.f40227p, "()Ljava/util/UUID;", com.ironsource.sdk.controller.f.b.AD_ID, "Lcom/ironsource/om;", "Lcom/ironsource/om;", "nativeAd", "Lcom/ironsource/vn;", "nativeAdController", "Ljava/lang/String;", "Lcom/ironsource/mediationsdk/model/Placement;", h.f36614b, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", i.f37957c, "Lcom/ironsource/sm;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "j", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "<set-?>", "k", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "l", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "m", "()Ljava/lang/String;", "title", d9.h.F0, "body", "callToAction", "Lcom/ironsource/pm$a;", "()Lcom/ironsource/pm$a;", "icon", "<init>", "(Ljava/util/UUID;Lcom/ironsource/om;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class qm extends il implements yn {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final UUID adId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final om nativeAd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private vn nativeAdController;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String placementName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Placement placement;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private sm listener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private AdapterNativeAdData adapterNativeAdData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX WARN: Illegal instructions before constructor call */
    public qm(UUID adId, om nativeAd) {
        Intrinsics.f(adId, "adId");
        Intrinsics.f(nativeAd, "nativeAd");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        super(new m1(ad_unit, c2.b.MEDIATION));
        this.adId = adId;
        this.nativeAd = nativeAd;
        this.placementName = "";
        getAdTools().getEventSender().a(new C3372n(ad_unit, adId, getAdUnitId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qm this$0) {
        Intrinsics.f(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            vn vnVar = this$0.nativeAdController;
            if (vnVar == null) {
                Intrinsics.m("nativeAdController");
                throw null;
            }
            vnVar.p();
            this$0.listener = null;
        } catch (Throwable th) {
            q9.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(qm this$0) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.getIsLoadAdCalled()) {
            IronLog.INTERNAL.warning(m1.a(this$0.getAdTools(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            vn vnVar = this$0.nativeAdController;
            if (vnVar != null) {
                vnVar.q();
            } else {
                Intrinsics.m("nativeAdController");
                throw null;
            }
        }
    }

    @Override // com.p004ironsource.il
    public boolean d() {
        this.nativeAdController = e();
        return true;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.adapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new E0(this, 1));
    }

    @Override // com.p004ironsource.yn
    public void onNativeAdLoadFailed(IronSourceError error) {
        String string = this.adId.toString();
        Intrinsics.e(string, "adId.toString()");
        b(new G0(24, this, new LevelPlayAdError(error, string, getAdUnitId())));
    }

    public /* synthetic */ qm(UUID uuid, om omVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? tf.f27296a.a() : uuid, omVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qm this$0, sm smVar) {
        Intrinsics.f(this$0, "this$0");
        this$0.listener = smVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(qm this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInfo, "$adInfo");
        sm smVar = this$0.listener;
        if (smVar != null) {
            smVar.c(this$0.nativeAd, adInfo);
        }
    }

    private final vn e() {
        this.placement = getAdTools().d(this.placementName);
        UUID uuid = this.adId;
        String strB = getAdUnitId();
        Placement placement = this.placement;
        if (placement == null) {
            Intrinsics.m("placement");
            throw null;
        }
        fo foVar = new fo(uuid, strB, placement);
        a(foVar);
        return new vn(this, getAdTools(), foVar);
    }

    public final void f() {
        a(new E0(this, 0));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final UUID getAdId() {
        return this.adId;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.adapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.adapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.adapterNativeAdData;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final pm.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.adapterNativeAdData;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new pm.a(icon.getCom.smartdigimkt.v0.k.d java.lang.String(), icon.getUri());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qm this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(levelPlayError, "$levelPlayError");
        sm smVar = this$0.listener;
        if (smVar != null) {
            smVar.a(this$0.nativeAd, levelPlayError);
        }
    }

    @Override // com.p004ironsource.yn
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        b(new D0(this, adInfo, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qm this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInfo, "$adInfo");
        sm smVar = this$0.listener;
        if (smVar != null) {
            smVar.b(this$0.nativeAd, adInfo);
        }
    }

    public final void b(String placementName) {
        Intrinsics.f(placementName, "placementName");
        a(new G0(23, this, placementName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qm this$0, String placementName) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(placementName, "$placementName");
        this$0.placementName = placementName;
    }

    public final void a(sm listener) {
        a(new G0(25, this, listener));
    }

    @Override // com.p004ironsource.yn
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        sn snVar = new sn();
        vn vnVar = this.nativeAdController;
        if (vnVar == null) {
            Intrinsics.m("nativeAdController");
            throw null;
        }
        vnVar.a(snVar);
        this.adapterNativeAdData = snVar.getNativeAdData();
        this.nativeAdViewBinder = snVar.getNativeAdViewBinder();
        b(new D0(this, adInfo, 0));
    }
}

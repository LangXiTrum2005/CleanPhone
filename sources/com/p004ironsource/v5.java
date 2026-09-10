package com.p004ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\b\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\r\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\"\u0010(\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010%0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-¨\u00063"}, d2 = {"Lcom/ironsource/v5;", "Lcom/ironsource/m;", "Lcom/ironsource/o6;", "Lcom/ironsource/l7;", "Lcom/ironsource/n6;", "o", "Lcom/ironsource/m1;", "tools", "Lcom/ironsource/j6;", "adProperties", "", "isPublisherLoad", "Lcom/ironsource/l6;", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "p", "", f.j, g.f40227p, "c", "e", "Lcom/ironsource/r1;", "adUnitCallback", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "l", "d", h.f36614b, "s", "r", "q", "b", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/j6;", "bannerAdProperties", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/w5;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "currentAdInfo", "nextAdInfo", "Lcom/ironsource/i7;", "Lcom/ironsource/i7;", "bannerStrategy", "Lcom/ironsource/w6;", "bannerViewContainer", "<init>", "(Lcom/ironsource/w5;Lcom/ironsource/m1;Lcom/ironsource/j6;Lcom/ironsource/w6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v5 extends AbstractC3368m implements o6, l7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j6 bannerAdProperties;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final WeakReference<w5> listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private LevelPlayAdInfo currentAdInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private LevelPlayAdInfo nextAdInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final i7 bannerStrategy;

    public v5(w5 listener, m1 adTools, j6 bannerAdProperties, w6 bannerViewContainer) {
        Intrinsics.f(listener, "listener");
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(bannerAdProperties, "bannerAdProperties");
        Intrinsics.f(bannerViewContainer, "bannerViewContainer");
        this.adTools = adTools;
        this.bannerAdProperties = bannerAdProperties;
        this.listener = new WeakReference<>(listener);
        this.currentAdInfo = p();
        this.nextAdInfo = p();
        this.bannerStrategy = i7.INSTANCE.a(adTools, bannerViewContainer, adTools.b(bannerAdProperties.getAdUnitId()), bannerAdProperties, this, o());
    }

    private final l6 a(m1 tools, j6 adProperties, boolean isPublisherLoad) {
        IronLog.INTERNAL.verbose();
        return new l6(tools, m6.INSTANCE.a(adProperties, getSdkConfigService().a(), isPublisherLoad), this);
    }

    private final n6 o() {
        return new O(this, 4);
    }

    private final LevelPlayAdInfo p() {
        String string = this.bannerAdProperties.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "bannerAdProperties.adId.toString()");
        String adUnitId = this.bannerAdProperties.getAdUnitId();
        String string2 = this.bannerAdProperties.getAdFormat().toString();
        Intrinsics.e(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, adUnitId, string2, null, null, null, null, 120, null);
    }

    public final void c() {
        this.bannerStrategy.c();
    }

    @Override // com.p004ironsource.l7
    public void d(IronSourceError error) {
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.currentAdInfo;
            String string = this.bannerAdProperties.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
            Intrinsics.e(string, "bannerAdProperties.adId.toString()");
            w5Var.a(levelPlayAdInfo, new LevelPlayAdError(error, string, this.bannerAdProperties.getAdUnitId()));
        }
    }

    public final void e() {
        this.bannerStrategy.e();
    }

    public final void f() {
        this.bannerStrategy.f();
    }

    public final void g() {
        this.bannerStrategy.g();
    }

    @Override // com.p004ironsource.i2
    public void h() {
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.d(this.currentAdInfo);
        }
    }

    @Override // com.p004ironsource.o6
    public /* bridge */ /* synthetic */ Unit j() {
        q();
        return Unit.f43263a;
    }

    @Override // com.p004ironsource.o6
    public /* bridge */ /* synthetic */ Unit k() {
        s();
        return Unit.f43263a;
    }

    @Override // com.p004ironsource.l7
    public void l() {
        this.currentAdInfo = this.nextAdInfo;
        this.nextAdInfo = p();
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.b(this.currentAdInfo);
        }
    }

    @Override // com.p004ironsource.o6
    public /* bridge */ /* synthetic */ Unit m() {
        r();
        return Unit.f43263a;
    }

    public void q() {
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.e(this.currentAdInfo);
        }
    }

    public void r() {
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.c(this.currentAdInfo);
        }
    }

    public void s() {
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            w5Var.a(this.currentAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l6 a(v5 this$0, boolean z2) {
        Intrinsics.f(this$0, "this$0");
        return this$0.a(this$0.adTools, this$0.bannerAdProperties, z2);
    }

    @Override // com.p004ironsource.l7
    public void c(IronSourceError error) {
        w5 w5Var = this.listener.get();
        if (w5Var != null) {
            String string = this.bannerAdProperties.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
            Intrinsics.e(string, "bannerAdProperties.adId.toString()");
            w5Var.a(new LevelPlayAdError(error, string, this.bannerAdProperties.getAdUnitId()));
        }
    }

    @Override // com.p004ironsource.l7
    public void a(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.nextAdInfo = levelPlayAdInfoC;
            w5 w5Var = this.listener.get();
            if (w5Var != null) {
                w5Var.a(levelPlayAdInfoC, false);
            }
        }
    }
}

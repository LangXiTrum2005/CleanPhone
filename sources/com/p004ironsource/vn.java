package com.p004ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\n\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ironsource/vn;", "Lcom/ironsource/m;", "Lcom/ironsource/jo;", "Lcom/ironsource/k2;", "Lcom/ironsource/w1;", "Lcom/ironsource/m1;", "tools", "Lcom/ironsource/fo;", "adProperties", "Lcom/ironsource/ho;", "a", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "o", "", "q", "Lcom/ironsource/sn;", "nativeAdBinder", "p", "Lcom/ironsource/r1;", "adUnitCallback", "c", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", h.f36614b, "Lcom/ironsource/yn;", "Lcom/ironsource/yn;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/m1;", "adTools", "d", "Lcom/ironsource/fo;", "nativeAdProperties", "e", "Lcom/ironsource/ho;", "nativeAdUnit", f.j, "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "<init>", "(Lcom/ironsource/yn;Lcom/ironsource/m1;Lcom/ironsource/fo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vn extends AbstractC3368m implements jo, k2, w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yn listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final fo nativeAdProperties;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ho nativeAdUnit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private LevelPlayAdInfo adInfo;

    public vn(yn listener, m1 adTools, fo nativeAdProperties) {
        Intrinsics.f(listener, "listener");
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(nativeAdProperties, "nativeAdProperties");
        this.listener = listener;
        this.adTools = adTools;
        this.nativeAdProperties = nativeAdProperties;
        this.adInfo = o();
    }

    private final ho a(m1 tools, fo adProperties) {
        IronLog.INTERNAL.verbose();
        return new ho(tools, io.INSTANCE.a(adProperties, getSdkConfigService().a()), this);
    }

    private final LevelPlayAdInfo o() {
        String string = this.nativeAdProperties.getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "nativeAdProperties.adId.toString()");
        String adUnitId = this.nativeAdProperties.getAdUnitId();
        String string2 = this.nativeAdProperties.getAdFormat().toString();
        Intrinsics.e(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, adUnitId, string2, null, null, null, null, 120, null);
    }

    @Override // com.p004ironsource.w1
    public void b() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.adInfo = levelPlayAdInfoC;
            this.listener.a(levelPlayAdInfoC);
        }
    }

    @Override // com.p004ironsource.i2
    public void h() {
        this.listener.b(this.adInfo);
    }

    public final void p() {
        this.adInfo = o();
        ho hoVar = this.nativeAdUnit;
        if (hoVar != null) {
            hoVar.a(true);
        } else {
            Intrinsics.m("nativeAdUnit");
            throw null;
        }
    }

    public final void q() {
        ho hoVarA = a(this.adTools, this.nativeAdProperties);
        this.nativeAdUnit = hoVarA;
        if (hoVarA != null) {
            hoVarA.a((k2) this);
        } else {
            Intrinsics.m("nativeAdUnit");
            throw null;
        }
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.listener.onNativeAdLoadFailed(error);
    }

    @Override // com.p004ironsource.w1
    public void b(IronSourceError error) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void a(sn nativeAdBinder) {
        Intrinsics.f(nativeAdBinder, "nativeAdBinder");
        ho hoVar = this.nativeAdUnit;
        if (hoVar != null) {
            hoVar.a(new ao(nativeAdBinder), this);
        } else {
            Intrinsics.m("nativeAdUnit");
            throw null;
        }
    }
}

package com.p004ironsource;

import android.app.Activity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB'\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b(\u0010)J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/ironsource/ce;", "Lcom/ironsource/vd;", "Lcom/ironsource/qd$b;", "Lcom/ironsource/qd$a;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/ironsource/ie;", "state", "", PglCryptUtils.KEY_MESSAGE, "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "()Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/rd;", "Lcom/ironsource/rd;", "()Lcom/ironsource/rd;", "factory", "Lcom/ironsource/td;", "c", "Lcom/ironsource/td;", "()Lcom/ironsource/td;", "fullscreenAdUnitListener", "Lcom/ironsource/ud;", "d", "Lcom/ironsource/ud;", "()Lcom/ironsource/ud;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "e", "Lcom/ironsource/ie;", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/rd;Lcom/ironsource/td;Lcom/ironsource/ud;)V", f.j, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ce implements vd, qd.b, qd.a {
    public static final String g = "Fullscreen ProgressiveOnShown Strategy";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rd factory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final td fullscreenAdUnitListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ud listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ie state;

    public ce(m1 adTools, rd factory, td fullscreenAdUnitListener, ud listener) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(factory, "factory");
        Intrinsics.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.f(listener, "listener");
        this.adTools = adTools;
        this.factory = factory;
        this.fullscreenAdUnitListener = fullscreenAdUnitListener;
        this.listener = listener;
        this.state = new de(this, null, false, 4, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m1 getAdTools() {
        return this.adTools;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final rd getFactory() {
        return this.factory;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final td getFullscreenAdUnitListener() {
        return this.fullscreenAdUnitListener;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ud getListener() {
        return this.listener;
    }

    @Override // com.p004ironsource.vd
    public void loadAd() {
        this.state.loadAd();
    }

    @Override // com.p004ironsource.vd
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.state.a(activity);
    }

    @Override // com.ironsource.qd.a
    public void b(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.state.b();
    }

    public final void a(ie state) {
        Intrinsics.f(state, "state");
        this.state = state;
    }

    @Override // com.ironsource.qd.b
    public void b(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.state.a(error);
    }

    @Override // com.ironsource.qd.b
    public void a(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.state.a();
    }

    @Override // com.ironsource.qd.b
    public void b(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.state.b(adInfo);
    }

    @Override // com.ironsource.qd.a
    public void a(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.state.b(error);
    }

    @Override // com.ironsource.qd.b
    public void a(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.state.a(adInfo);
    }

    public final void a(String message) {
        Intrinsics.f(message, "message");
        this.adTools.getEventSender().getTroubleshoot().f("Fullscreen ProgressiveOnShown Strategy - ".concat(message));
    }
}

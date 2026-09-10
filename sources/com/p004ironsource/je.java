package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.q0.b;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/ironsource/je;", "Lcom/ironsource/vd;", "Lcom/ironsource/qd$b;", "Lcom/ironsource/qd$a;", "", "loadAd", "Landroid/app/Activity;", "activity", "a", "Lcom/ironsource/qd;", "adUnit", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "adInfo", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "()Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/vd$a;", "Lcom/ironsource/vd$a;", "()Lcom/ironsource/vd$a;", b.i0, "Lcom/ironsource/rd;", "c", "Lcom/ironsource/rd;", "fullscreenAdUnitFactory", "Lcom/ironsource/td;", "d", "Lcom/ironsource/td;", "fullscreenAdUnitListener", "Lcom/ironsource/ud;", "e", "Lcom/ironsource/ud;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, f.j, "Lcom/ironsource/qd;", "fullscreenAdUnit", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/vd$a;Lcom/ironsource/rd;Lcom/ironsource/td;Lcom/ironsource/ud;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class je implements vd, qd.b, qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vd.a config;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final rd fullscreenAdUnitFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final td fullscreenAdUnitListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ud listener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private qd fullscreenAdUnit;

    public je(m1 adTools, vd.a config, rd fullscreenAdUnitFactory, td fullscreenAdUnitListener, ud listener) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(config, "config");
        Intrinsics.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.f(listener, "listener");
        this.adTools = adTools;
        this.config = config;
        this.fullscreenAdUnitFactory = fullscreenAdUnitFactory;
        this.fullscreenAdUnitListener = fullscreenAdUnitListener;
        this.listener = listener;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m1 getAdTools() {
        return this.adTools;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vd.a getConfig() {
        return this.config;
    }

    @Override // com.p004ironsource.vd
    public void loadAd() {
        qd qdVarA = this.fullscreenAdUnitFactory.a(true, this.fullscreenAdUnitListener);
        qdVarA.a(this);
        this.fullscreenAdUnit = qdVarA;
    }

    @Override // com.p004ironsource.vd
    public void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        qd qdVar = this.fullscreenAdUnit;
        if (qdVar != null) {
            qdVar.a(activity, this);
        }
    }

    @Override // com.ironsource.qd.a
    public void b(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.listener.b();
    }

    @Override // com.ironsource.qd.b
    public void a(qd adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.fullscreenAdUnit = null;
        this.listener.a();
    }

    @Override // com.ironsource.qd.b
    public void b(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.listener.a(error);
    }

    @Override // com.ironsource.qd.a
    public void a(qd adUnit, IronSourceError error) {
        Intrinsics.f(adUnit, "adUnit");
        this.listener.b(error);
    }

    @Override // com.ironsource.qd.b
    public void b(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.listener.a(adInfo);
    }

    @Override // com.ironsource.qd.b
    public void a(qd adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.f(adUnit, "adUnit");
        Intrinsics.f(adInfo, "adInfo");
        this.listener.onAdInfoChanged(adInfo);
    }
}

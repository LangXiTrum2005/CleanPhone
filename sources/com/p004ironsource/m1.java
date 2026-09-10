package com.p004ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.lifecycle.b;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.l;
import com.p004ironsource.mediationsdk.model.Placement;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u001d\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101B\u0019\b\u0016\u0012\u0006\u00102\u001a\u00020\u0000\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00103J \u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010\u0005\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u001bR\u001a\u0010\u000b\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010*R\u0014\u0010-\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u00064"}, d2 = {"Lcom/ironsource/m1;", "Lcom/ironsource/xm;", "", PglCryptUtils.KEY_MESSAGE, "suffix", "a", "Lcom/ironsource/lifecycle/b;", "b", "placementName", "Lcom/ironsource/mediationsdk/model/Placement;", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "d", "adUnitId", "Lcom/ironsource/i7$b;", "Lcom/ironsource/vd$a;", "", f.j, "", "", "data", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "", "Lcom/unity3d/mediation/LevelPlayAdSize;", d9.h.O, "", "", g.f40227p, "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "()Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/ironsource/av$b;", "c", "Lcom/ironsource/av$b;", "logFactory", "Lcom/ironsource/bc;", "Lcom/ironsource/bc;", "e", "()Lcom/ironsource/bc;", "eventSender", "Lcom/ironsource/ei;", "Lcom/ironsource/ei;", "sdkConfigService", "J", "ONE_HOUR_IN_MILLIS", "Lcom/ironsource/c2$b;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Lcom/ironsource/c2$b;)V", "adTools", "(Lcom/ironsource/m1;Lcom/ironsource/c2$b;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class m1 extends xm {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final av.b logFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final bc eventSender;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ei sdkConfigService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long ONE_HOUR_IN_MILLIS;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/ironsource/m1$a;", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "Lcom/ironsource/c2$b;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/ironsource/m1;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25663a = new a();

        private a() {
        }

        @JvmStatic
        public static final m1 a(IronSource.AD_UNIT adFormat, c2.b level) {
            Intrinsics.f(adFormat, "adFormat");
            Intrinsics.f(level, "level");
            return new m1(adFormat, level);
        }
    }

    public m1(m1 adTools, c2.b level) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(level, "level");
        this.sdkConfigService = on.INSTANCE.d().t();
        this.ONE_HOUR_IN_MILLIS = TimeUnit.HOURS.toMillis(1L);
        IronSource.AD_UNIT ad_unit = adTools.adFormat;
        this.adFormat = ad_unit;
        this.logFactory = adTools.logFactory;
        this.eventSender = new bc(ad_unit, level, adTools.eventSender.c(), null, 8, null);
    }

    public final ISBannerSize a(LevelPlayAdSize adSize) {
        Intrinsics.f(adSize, "adSize");
        return new j1().b(adSize);
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        Intrinsics.f(adFormat, "adFormat");
        fm fmVarA = this.sdkConfigService.a();
        return fmVarA != null ? fmVarA.b(adFormat) : this.ONE_HOUR_IN_MILLIS;
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final IronSource.AD_UNIT getAdFormat() {
        return this.adFormat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final bc getEventSender() {
        return this.eventSender;
    }

    public final int f() {
        return on.INSTANCE.d().k().a(this.adFormat);
    }

    public final boolean g() {
        return on.INSTANCE.d().t().c();
    }

    public m1(IronSource.AD_UNIT adFormat, c2.b level) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(level, "level");
        this.sdkConfigService = on.INSTANCE.d().t();
        this.ONE_HOUR_IN_MILLIS = TimeUnit.HOURS.toMillis(1L);
        this.adFormat = adFormat;
        this.eventSender = new bc(adFormat, level, null, null, 12, null);
        av.b bVarA = av.a(adFormat);
        Intrinsics.e(bVarA, "createLogFactory(adFormat)");
        this.logFactory = bVarA;
    }

    public final Placement a(LevelPlay.AdFormat adFormat, String placementName) {
        fm fmVarA;
        Intrinsics.f(adFormat, "adFormat");
        if (placementName == null || (fmVarA = this.sdkConfigService.a()) == null) {
            return null;
        }
        return fmVarA.c(adFormat, placementName);
    }

    public final i7.b b(String adUnitId) {
        Intrinsics.f(adUnitId, "adUnitId");
        fm fmVarA = this.sdkConfigService.a();
        if (fmVarA != null) {
            return fmVarA.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final String c(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final Placement d(String placementName) {
        Intrinsics.f(placementName, "placementName");
        fm fmVarA = this.sdkConfigService.a();
        if (fmVarA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement placementC = fmVarA.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (placementC != null) {
            return placementC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Placement a(String placementName) {
        Intrinsics.f(placementName, "placementName");
        fm fmVarA = this.sdkConfigService.a();
        if (fmVarA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        Placement placementC = fmVarA.c(LevelPlay.AdFormat.BANNER, placementName);
        if (placementC != null) {
            return placementC;
        }
        throw new IllegalStateException("Error getting placement");
    }

    public final b b() {
        b bVarD = b.d();
        Intrinsics.e(bVarD, "getInstance()");
        return bVarD;
    }

    public static /* synthetic */ String a(m1 m1Var, String str, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return m1Var.a(str, str2);
    }

    public final vd.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(adUnitId, "adUnitId");
        fm fmVarA = this.sdkConfigService.a();
        if (fmVarA != null) {
            return fmVarA.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final String a(String message, String suffix) {
        String strA = this.logFactory.a(message, suffix);
        Intrinsics.e(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final void a(Map<String, Object> data, ISBannerSize size) {
        Intrinsics.f(data, "data");
        Intrinsics.f(size, "size");
        l.a(data, size);
    }
}

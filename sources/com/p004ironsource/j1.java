package com.p004ironsource;

import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.ISContainerParams;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.l;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u001e\u0010\u0006\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eJ\u000e\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/j1;", "Lcom/ironsource/xm;", "Lcom/unity3d/mediation/LevelPlayAdSize;", "size", "Lcom/ironsource/mediationsdk/ISBannerSize;", "c", "a", "", "()Ljava/lang/Float;", "", PglCryptUtils.KEY_MESSAGE, "suffix", "", "d", "", "b", "", "width", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Ljava/lang/Integer;", "Lcom/ironsource/bc;", "Lcom/ironsource/bc;", "eventSender", "Lcom/ironsource/av$b;", "Lcom/ironsource/av$b;", "logFactory", "Lcom/ironsource/ei;", "Lcom/ironsource/ei;", "sdkConfigService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class j1 extends xm {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bc eventSender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final av.b logFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ei sdkConfigService;

    public j1() {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.eventSender = new bc(ad_unit, c2.b.MEDIATION, null, null, 12, null);
        av.b bVarA = av.a(ad_unit);
        Intrinsics.e(bVarA, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.logFactory = bVarA;
        this.sdkConfigService = on.INSTANCE.d().t();
    }

    private final Float c() {
        fm fmVarA = this.sdkConfigService.a();
        Float fValueOf = fmVarA != null ? Float.valueOf(fmVarA.i()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.eventSender.getTroubleshoot().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    public final int a(int width) {
        return l.a(width);
    }

    public final Integer b(Context context) {
        Intrinsics.f(context, "context");
        Float fC = c();
        if (fC != null) {
            return Integer.valueOf(MathKt.b(fC.floatValue() * bb.f24416a.a(context)));
        }
        return null;
    }

    public final boolean d() {
        return on.INSTANCE.d().t().c();
    }

    private final ISBannerSize a(LevelPlayAdSize size) {
        LevelPlayAdSize fallbackAdSize = size.getFallbackAdSize();
        if (fallbackAdSize == null) {
            fallbackAdSize = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize);
        iSBannerSizeB.setAdaptive(true);
        iSBannerSizeB.containerParams = new ISContainerParams(size.getWidth(), size.getHeight());
        return iSBannerSizeB;
    }

    private final ISBannerSize c(LevelPlayAdSize size) {
        if (Intrinsics.a(size, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(l.f25925b, size.getWidth(), size.getHeight());
        }
        if (Intrinsics.a(size, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(l.f25926c, size.getWidth(), size.getHeight());
        }
        if (Intrinsics.a(size, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(l.f25927e, 0, 0);
        }
        return size.equals(LevelPlayAdSize.INSTANCE.createCustomSize(size.getWidth(), size.getHeight())) ? new ISBannerSize(size.getWidth(), size.getHeight()) : new ISBannerSize("BANNER", size.getWidth(), size.getHeight());
    }

    public final List<LevelPlayAdSize> b() {
        fm fmVarA = this.sdkConfigService.a();
        if (fmVarA != null) {
            return fmVarA.h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public static /* synthetic */ String a(j1 j1Var, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return j1Var.a(str, str2);
    }

    public final ISBannerSize b(LevelPlayAdSize size) {
        Intrinsics.f(size, "size");
        boolean isAdaptive = size.getIsAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(size);
    }

    public final String a(String message, String suffix) {
        String strA = this.logFactory.a(message, suffix);
        Intrinsics.e(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }
}

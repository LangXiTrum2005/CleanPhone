package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r5 implements we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj f14994a;

    public r5(zj webViewFactory) {
        Intrinsics.f(webViewFactory, "webViewFactory");
        this.f14994a = webViewFactory;
    }

    @Override // com.chartboost.sdk.impl.we
    public f2 a(Context context, ue renderableConfig, w adMarkupConfig, r adFormat, vg trackerComponent, jg telemetryManager, jj viewabilityComponent, Mediation mediation) throws ChartboostError {
        ChartboostError internal;
        Intrinsics.f(context, "context");
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(viewabilityComponent, "viewabilityComponent");
        try {
            String strL = renderableConfig.l();
            fb fbVar = fb.VAST;
            if (Intrinsics.a(strL, fbVar.b())) {
                return new zh(context, renderableConfig.b(), renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, viewabilityComponent, w3.f15454b.a().f(), adFormat, this.f14994a, mediation);
            }
            fb fbVar2 = fb.HTML;
            if (Intrinsics.a(strL, fbVar2.b())) {
                return new xj(renderableConfig.b(), null, adFormat.b() ? zb.INLINE : zb.INTERSTITIAL, null, this.f14994a, renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, viewabilityComponent, null, mediation, 2056, null);
            }
            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Unsupported markup type: " + renderableConfig.l() + ". Supported types: " + fbVar.b() + ", " + fbVar2.b(), null);
            za.b(com.ironsource.d9.i.d + invalidAdm.getCode() + "] Skipping unknown renderable config with type " + renderableConfig.l(), invalidAdm);
            return null;
        } catch (Exception e2) {
            if (e2 instanceof ChartboostError.Load) {
                internal = (ChartboostError.Load) e2;
            } else {
                internal = !(e2 instanceof IllegalArgumentException) ? new ChartboostError.Load.Internal(android.support.v4.media.a.C("Failed to create renderable: ", e2.getMessage()), e2) : new ChartboostError.Load.InvalidAdm(android.support.v4.media.a.C("Invalid renderable configuration: ", e2.getMessage()), e2);
            }
            za.b(com.ironsource.d9.i.d + internal.getCode() + "] Failed to create renderable for markup type: " + renderableConfig.l(), internal);
            throw internal;
        }
    }

    public /* synthetic */ r5(zj zjVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new oc() : zjVar);
    }
}

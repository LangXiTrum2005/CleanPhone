package com.startapp.sdk.internal;

import A.C0880a0;
import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class da extends com.startapp.sdk.adsbase.c {
    public final ca k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(Context context, AdPreferences preferences, AdPreferences.Placement placement, lb httpClient, lb networkApiExecutor, lb eventTracer, lb motionProcessor, ca builder) {
        super(context, null, preferences, null, placement, httpClient, networkApiExecutor, eventTracer, motionProcessor);
        Intrinsics.f(context, "context");
        Intrinsics.f(preferences, "preferences");
        Intrinsics.f(placement, "placement");
        Intrinsics.f(httpClient, "httpClient");
        Intrinsics.f(networkApiExecutor, "networkApiExecutor");
        Intrinsics.f(eventTracer, "eventTracer");
        Intrinsics.f(motionProcessor, "motionProcessor");
        Intrinsics.f(builder, "builder");
        this.k = builder;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        return true;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        f9 f9Var = new f9();
        ca caVar = this.k;
        f9Var.W0 = caVar.f40866b;
        f9Var.X0 = caVar.f40867c;
        AdUnitConfig adUnitConfig = caVar.d;
        f9Var.Y0 = adUnitConfig != null ? adUnitConfig.getBp() : null;
        ca caVar2 = this.k;
        f9Var.Z0 = caVar2.f40868e;
        f9Var.V0 = caVar2.f40865a;
        f9Var.b1 = caVar2.g;
        f9Var.a1 = caVar2.f40869h.intValue();
        f9Var.c1 = this.k.f40870i;
        com.startapp.sdk.adsbase.model.a aVarA = a((com.startapp.sdk.adsbase.model.a) f9Var);
        if (aVarA != null) {
            aVarA.f(this.f40631a);
            Point point = this.k.f;
            aVarA.L = point != null ? point.x : aVarA.L;
            aVarA.M = point != null ? point.y : aVarA.M;
        }
        return aVarA;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a aVarC = c();
        if (aVarC == null) {
            return null;
        }
        p8 p8Var = new p8((q8) this.g.a(), aVarC.a(i0.a(AdsConstants$AdApiType.HTML, this.f40634e)));
        p8Var.f41356e = new C0880a0(this, 25);
        return p8Var.a();
    }

    public static final Void a(da this$0, Throwable th) {
        Intrinsics.f(this$0, "this$0");
        this$0.f = th != null ? th.getMessage() : null;
        return null;
    }
}

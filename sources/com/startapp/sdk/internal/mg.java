package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mg extends ce implements zd {
    public final lb j;
    public final i4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(Context context, lb prefs, lb consentManager, lb handler, i4 configProvider) {
        super(context, prefs, handler, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        Intrinsics.f(context, "context");
        Intrinsics.f(prefs, "prefs");
        Intrinsics.f(consentManager, "consentManager");
        Intrinsics.f(handler, "handler");
        Intrinsics.f(configProvider, "configProvider");
        this.j = consentManager;
        this.k = configProvider;
    }

    @Override // com.startapp.sdk.internal.ce
    public final Object a(String str) {
        return str;
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    @Override // com.startapp.sdk.internal.ce
    public final long d() {
        this.k.getClass();
        SensorsConfig sensorsConfigT = MetaData.E().T();
        if (sensorsConfigT != null) {
            return sensorsConfigT.h();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.ce
    public final boolean f() {
        Boolean boolB = ((h6) this.j.a()).b();
        if (boolB != null && boolB.booleanValue()) {
            this.k.getClass();
            SensorsConfig sensorsConfigT = MetaData.E().T();
            if (sensorsConfigT != null && sensorsConfigT.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ce
    public final void g() {
        i8 i8Var = new i8(this.f41177a, this);
        ((Executor) com.startapp.sdk.components.a.a(i8Var.f41697a).D.a()).execute(i8Var.d);
    }

    @Override // com.startapp.sdk.internal.zd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}

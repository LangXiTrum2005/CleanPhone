package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23955e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f23957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f23958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(b8 b8Var, Activity activity, v6 v6Var) {
        super(b8Var.f23317a, true);
        this.f23957g = activity;
        this.f23958h = v6Var;
        this.f23956f = b8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f23955e) {
            case 0:
                try {
                    Context context = (Context) this.f23957g;
                    k9.c0.h(context);
                    String strA = ea.z1.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = ea.z1.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    y6 y6VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    c8 c8Var = (c8) this.f23956f;
                    boolean z10 = boolValueOf == null || !boolValueOf.booleanValue();
                    c8Var.getClass();
                    try {
                        y6VarAsInterface = x6.asInterface(t9.d.c(context, z10 ? t9.d.f50565d : t9.d.f50564c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (t9.a e10) {
                        c8Var.d(e10, true, false);
                    }
                    c8Var.f23358f = y6VarAsInterface;
                    if (c8Var.f23358f != null) {
                        int iA = t9.d.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = t9.d.d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z11 = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j10 = iMax;
                        c8Var.f23359g = j10;
                        i7 i7Var = new i7(161000L, j10, z11, (Bundle) this.f23958h, ea.z1.a(context));
                        if (c8Var.f23359g < 169) {
                            y6 y6Var = c8Var.f23358f;
                            k9.c0.h(y6Var);
                            y6Var.initialize(new s9.b(context), i7Var, this.f24171a);
                        } else {
                            y6 y6Var2 = c8Var.f23358f;
                            k9.c0.h(y6Var2);
                            y6Var2.initializeWithElapsedTime(new s9.b(context), i7Var, this.f24171a, this.f24172b);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e11) {
                    ((c8) this.f23956f).d(e11, true, false);
                    return;
                }
                break;
            case 1:
                y6 y6Var3 = ((c8) this.f23956f).f23358f;
                k9.c0.h(y6Var3);
                y6Var3.logHealthData(5, (String) this.f23957g, new s9.b(this.f23958h), new s9.b(null), new s9.b(null));
                break;
            case 2:
                y6 y6Var4 = ((c8) this.f23956f).f23358f;
                k9.c0.h(y6Var4);
                y6Var4.getMaxUserProperties((String) this.f23957g, (v6) this.f23958h);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.f23958h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                y6 y6Var5 = ((b8) this.f23956f).f23317a.f23358f;
                k9.c0.h(y6Var5);
                y6Var5.onActivityCreatedByScionActivityInfo(k7.b((Activity) this.f23957g), bundle, this.f24172b);
                break;
            default:
                y6 y6Var6 = ((b8) this.f23956f).f23317a.f23358f;
                k9.c0.h(y6Var6);
                y6Var6.onActivitySaveInstanceStateByScionActivityInfo(k7.b((Activity) this.f23957g), (v6) this.f23958h, this.f24172b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public void b() {
        switch (this.f23955e) {
            case 2:
                ((v6) this.f23958h).e1(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(b8 b8Var, Bundle bundle, Activity activity) {
        super(b8Var.f23317a, true);
        this.f23958h = bundle;
        this.f23957g = activity;
        this.f23956f = b8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(c8 c8Var, Context context, Bundle bundle) {
        super(c8Var, true);
        this.f23957g = context;
        this.f23958h = bundle;
        this.f23956f = c8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(c8 c8Var, String str, v6 v6Var) {
        super(c8Var, true);
        this.f23957g = str;
        this.f23958h = v6Var;
        Objects.requireNonNull(c8Var);
        this.f23956f = c8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(c8 c8Var, String str, Object obj) {
        super(c8Var, false);
        this.f23957g = str;
        this.f23958h = obj;
        this.f23956f = c8Var;
    }
}

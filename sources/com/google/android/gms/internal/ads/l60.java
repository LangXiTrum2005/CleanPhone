package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l60 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m60 f16757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f16758c;

    public /* synthetic */ l60(m60 m60Var, Throwable th2, int i10) {
        this.f16756a = i10;
        this.f16757b = m60Var;
        this.f16758c = th2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f16756a) {
            case 0:
                Context context = this.f16757b.f17305a;
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.Vb)).booleanValue();
                Throwable th2 = this.f16758c;
                if (!zBooleanValue) {
                    zw.c(context).a("AttributionReportingSampled", th2);
                } else {
                    zw.e(context).a("AttributionReporting", th2);
                }
                break;
            default:
                Context context2 = this.f16757b.f17305a;
                boolean zBooleanValue2 = ((Boolean) zzba.zzc().a(am.Vb)).booleanValue();
                Throwable th3 = this.f16758c;
                if (!zBooleanValue2) {
                    zw.c(context2).a("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th3);
                } else {
                    zw.e(context2).a("AttributionReporting.getUpdatedUrlAndRegisterSource", th3);
                }
                break;
        }
    }
}

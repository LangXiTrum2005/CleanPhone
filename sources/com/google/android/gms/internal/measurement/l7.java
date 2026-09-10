package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23696e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f23697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f23699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c8 f23700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f23701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(c8 c8Var, String str, String str2, Bundle bundle, boolean z10) {
        super(c8Var, true);
        this.f23697f = str;
        this.f23698g = str2;
        this.f23701j = bundle;
        this.f23699h = z10;
        this.f23700i = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        switch (this.f23696e) {
            case 0:
                y6 y6Var = this.f23700i.f23358f;
                k9.c0.h(y6Var);
                y6Var.setUserProperty(this.f23697f, this.f23698g, new s9.b(this.f23701j), this.f23699h, this.f24171a);
                break;
            case 1:
                y6 y6Var2 = this.f23700i.f23358f;
                k9.c0.h(y6Var2);
                y6Var2.getUserProperties(this.f23697f, this.f23698g, this.f23699h, (v6) this.f23701j);
                break;
            default:
                long j10 = this.f24171a;
                long j11 = this.f24172b;
                y6 y6Var3 = this.f23700i.f23358f;
                k9.c0.h(y6Var3);
                y6Var3.logEventWithElapsedTime(this.f23697f, this.f23698g, (Bundle) this.f23701j, this.f23699h, true, j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public void b() {
        switch (this.f23696e) {
            case 1:
                ((v6) this.f23701j).e1(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(c8 c8Var, String str, String str2, Object obj, boolean z10) {
        super(c8Var, true);
        this.f23697f = str;
        this.f23698g = str2;
        this.f23701j = obj;
        this.f23699h = z10;
        Objects.requireNonNull(c8Var);
        this.f23700i = c8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(c8 c8Var, String str, String str2, boolean z10, v6 v6Var) {
        super(c8Var, true);
        this.f23697f = str;
        this.f23698g = str2;
        this.f23699h = z10;
        this.f23701j = v6Var;
        Objects.requireNonNull(c8Var);
        this.f23700i = c8Var;
    }
}

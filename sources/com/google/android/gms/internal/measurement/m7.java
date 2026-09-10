package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f23731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c8 f23732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(c8 c8Var, Bundle bundle, int i10) {
        super(c8Var, true);
        this.f23730e = i10;
        switch (i10) {
            case 1:
                this.f23731f = bundle;
                Objects.requireNonNull(c8Var);
                this.f23732g = c8Var;
                super(c8Var, true);
                break;
            case 2:
                this.f23731f = bundle;
                Objects.requireNonNull(c8Var);
                this.f23732g = c8Var;
                super(c8Var, true);
                break;
            default:
                this.f23731f = bundle;
                Objects.requireNonNull(c8Var);
                this.f23732g = c8Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        switch (this.f23730e) {
            case 0:
                y6 y6Var = this.f23732g.f23358f;
                k9.c0.h(y6Var);
                y6Var.setConditionalUserProperty(this.f23731f, this.f24171a);
                break;
            case 1:
                y6 y6Var2 = this.f23732g.f23358f;
                k9.c0.h(y6Var2);
                y6Var2.setConsentThirdParty(this.f23731f, this.f24171a);
                break;
            default:
                y6 y6Var3 = this.f23732g.f23358f;
                k9.c0.h(y6Var3);
                y6Var3.setDefaultEventParameters(this.f23731f);
                break;
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23768e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f23769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c8 f23771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f23772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(c8 c8Var, k7 k7Var, String str, String str2) {
        super(c8Var, true);
        this.f23772i = k7Var;
        this.f23769f = str;
        this.f23770g = str2;
        Objects.requireNonNull(c8Var);
        this.f23771h = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        switch (this.f23768e) {
            case 0:
                y6 y6Var = this.f23771h.f23358f;
                k9.c0.h(y6Var);
                y6Var.clearConditionalUserProperty(this.f23769f, this.f23770g, (Bundle) this.f23772i);
                break;
            case 1:
                y6 y6Var2 = this.f23771h.f23358f;
                k9.c0.h(y6Var2);
                y6Var2.getConditionalUserProperties(this.f23769f, this.f23770g, (v6) this.f23772i);
                break;
            default:
                y6 y6Var3 = this.f23771h.f23358f;
                k9.c0.h(y6Var3);
                y6Var3.setCurrentScreenByScionActivityInfo((k7) this.f23772i, this.f23769f, this.f23770g, this.f24171a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public void b() {
        switch (this.f23768e) {
            case 1:
                ((v6) this.f23772i).e1(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(c8 c8Var, String str, String str2, Bundle bundle) {
        super(c8Var, true);
        this.f23769f = str;
        this.f23770g = str2;
        this.f23772i = bundle;
        Objects.requireNonNull(c8Var);
        this.f23771h = c8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(c8 c8Var, String str, String str2, v6 v6Var) {
        super(c8Var, true);
        this.f23769f = str;
        this.f23770g = str2;
        this.f23772i = v6Var;
        Objects.requireNonNull(c8Var);
        this.f23771h = c8Var;
    }
}

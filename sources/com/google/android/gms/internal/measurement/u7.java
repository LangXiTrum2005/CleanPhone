package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v6 f24023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c8 f24024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7(c8 c8Var, v6 v6Var, int i10, boolean z10) {
        super(c8Var, true);
        this.f24022e = i10;
        this.f24023f = v6Var;
        this.f24024g = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        switch (this.f24022e) {
            case 0:
                y6 y6Var = this.f24024g.f23358f;
                k9.c0.h(y6Var);
                y6Var.getGmpAppId(this.f24023f);
                break;
            case 1:
                y6 y6Var2 = this.f24024g.f23358f;
                k9.c0.h(y6Var2);
                y6Var2.getCachedAppInstanceId(this.f24023f);
                break;
            case 2:
                y6 y6Var3 = this.f24024g.f23358f;
                k9.c0.h(y6Var3);
                y6Var3.generateEventId(this.f24023f);
                break;
            case 3:
                y6 y6Var4 = this.f24024g.f23358f;
                k9.c0.h(y6Var4);
                y6Var4.getCurrentScreenName(this.f24023f);
                break;
            case 4:
                y6 y6Var5 = this.f24024g.f23358f;
                k9.c0.h(y6Var5);
                y6Var5.getCurrentScreenClass(this.f24023f);
                break;
            case 5:
                y6 y6Var6 = this.f24024g.f23358f;
                k9.c0.h(y6Var6);
                y6Var6.getAppInstanceId(this.f24023f);
                break;
            default:
                y6 y6Var7 = this.f24024g.f23358f;
                k9.c0.h(y6Var7);
                y6Var7.getSessionId(this.f24023f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void b() {
        switch (this.f24022e) {
            case 0:
                this.f24023f.e1(null);
                break;
            case 1:
                this.f24023f.e1(null);
                break;
            case 2:
                this.f24023f.e1(null);
                break;
            case 3:
                this.f24023f.e1(null);
                break;
            case 4:
                this.f24023f.e1(null);
                break;
            case 5:
                this.f24023f.e1(null);
                break;
            default:
                this.f24023f.e1(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(c8 c8Var, v6 v6Var, int i10) {
        super(c8Var, true);
        this.f24022e = i10;
        switch (i10) {
            case 1:
                this.f24023f = v6Var;
                Objects.requireNonNull(c8Var);
                this.f24024g = c8Var;
                super(c8Var, true);
                break;
            case 2:
                this.f24023f = v6Var;
                Objects.requireNonNull(c8Var);
                this.f24024g = c8Var;
                super(c8Var, true);
                break;
            case 3:
            case 4:
            default:
                this.f24023f = v6Var;
                Objects.requireNonNull(c8Var);
                this.f24024g = c8Var;
                break;
            case 5:
                this.f24023f = v6Var;
                Objects.requireNonNull(c8Var);
                this.f24024g = c8Var;
                super(c8Var, true);
                break;
            case 6:
                this.f24023f = v6Var;
                Objects.requireNonNull(c8Var);
                this.f24024g = c8Var;
                super(c8Var, true);
                break;
        }
    }
}

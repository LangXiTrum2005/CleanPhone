package pb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.u7;
import com.google.android.gms.internal.measurement.v6;
import ea.q2;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c8 f48306a;

    public e(c8 c8Var) {
        this.f48306a = c8Var;
    }

    @Override // ea.q2
    public final void a(String str, Bundle bundle, String str2) {
        c8 c8Var = this.f48306a;
        c8Var.c(new l7(c8Var, str, str2, bundle, true));
    }

    @Override // ea.q2
    public final void b(String str) {
        c8 c8Var = this.f48306a;
        c8Var.c(new o7(c8Var, str, 1));
    }

    @Override // ea.q2
    public final Map c(String str, String str2, boolean z10) {
        return this.f48306a.a(str, str2, z10);
    }

    @Override // ea.q2
    public final void d(String str, Bundle bundle, String str2) {
        c8 c8Var = this.f48306a;
        c8Var.c(new n7(c8Var, str, str2, bundle));
    }

    @Override // ea.q2
    public final List e(String str, String str2) {
        return this.f48306a.f(str, str2);
    }

    @Override // ea.q2
    public final int g(String str) {
        return this.f48306a.b(str);
    }

    @Override // ea.q2
    public final String zzh() {
        v6 v6Var = new v6();
        c8 c8Var = this.f48306a;
        c8Var.c(new u7(c8Var, v6Var, 3, false));
        return v6Var.r(500L);
    }

    @Override // ea.q2
    public final String zzi() {
        v6 v6Var = new v6();
        c8 c8Var = this.f48306a;
        c8Var.c(new u7(c8Var, v6Var, 4, false));
        return v6Var.r(500L);
    }

    @Override // ea.q2
    public final String zzj() {
        v6 v6Var = new v6();
        c8 c8Var = this.f48306a;
        c8Var.c(new u7(c8Var, v6Var, 1));
        return v6Var.r(50L);
    }

    @Override // ea.q2
    public final String zzk() {
        v6 v6Var = new v6();
        c8 c8Var = this.f48306a;
        c8Var.c(new u7(c8Var, v6Var, 0));
        return v6Var.r(500L);
    }

    @Override // ea.q2
    public final long zzl() {
        return this.f48306a.g();
    }

    @Override // ea.q2
    public final void zzn(String str) {
        c8 c8Var = this.f48306a;
        c8Var.c(new o7(c8Var, str, 2));
    }

    @Override // ea.q2
    public final void zzo(Bundle bundle) {
        c8 c8Var = this.f48306a;
        c8Var.c(new m7(c8Var, bundle, 0));
    }
}

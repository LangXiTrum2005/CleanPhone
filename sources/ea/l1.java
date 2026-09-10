package ea;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f39549a;

    public /* synthetic */ l1(m1 m1Var) {
        this.f39549a = m1Var;
    }

    public void a(Bundle bundle, String str) {
        String string;
        m1 m1Var = this.f39549a;
        j1 j1Var = m1Var.f39588g;
        a1 a1Var = m1Var.f39586e;
        m1.h(j1Var);
        j1Var.G0();
        if (m1Var.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m1.f(a1Var);
        a1Var.f39223w.h(string);
        z0 z0Var = a1Var.f39224x;
        m1Var.f39592k.getClass();
        z0Var.f(System.currentTimeMillis());
    }

    @Override // ea.r2
    public /* synthetic */ void b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f39549a.d(i10, th2, bArr);
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        m1 m1Var = this.f39549a;
        m1Var.f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a1 a1Var = m1Var.f39586e;
        m1.f(a1Var);
        return jCurrentTimeMillis - a1Var.f39224x.e() > m1Var.f39585d.O0(null, d0.f39310i0);
    }

    public boolean d() {
        a1 a1Var = this.f39549a.f39586e;
        m1.f(a1Var);
        return a1Var.f39224x.e() > 0;
    }
}

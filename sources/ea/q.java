package ea;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.ca;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f39715g;

    public q(m1 m1Var, String str, String str2, String str3, long j10, long j11, long j12, Bundle bundle) {
        t tVar;
        k9.c0.e(str2);
        k9.c0.e(str3);
        this.f39709a = str2;
        this.f39710b = str3;
        this.f39711c = true == TextUtils.isEmpty(str) ? null : str;
        this.f39712d = j10;
        this.f39713e = j11;
        this.f39714f = j12;
        if (j12 != 0 && j12 > j10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(s0.O0(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.b("Param name can't be null");
                    it.remove();
                } else {
                    l4 l4Var = m1Var.f39590i;
                    m1.f(l4Var);
                    Object objP0 = l4Var.P0(bundle2.get(next), next);
                    if (objP0 == null) {
                        s0 s0Var3 = m1Var.f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39756i.c(m1Var.f39591j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        l4 l4Var2 = m1Var.f39590i;
                        m1.f(l4Var2);
                        l4Var2.X0(next, objP0, bundle2);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.f39715g = tVar;
    }

    public final q a(m1 m1Var, long j10) {
        return new q(m1Var, this.f39711c, this.f39709a, this.f39710b, this.f39712d, this.f39713e, j10, this.f39715g);
    }

    public final String toString() {
        String string = this.f39715g.toString();
        String str = this.f39709a;
        int length = String.valueOf(str).length();
        String str2 = this.f39710b;
        StringBuilder sb2 = new StringBuilder(ca.h(length, 22, String.valueOf(str2).length(), 10, string.length()) + 1);
        d5.u.r(sb2, "Event{appId='", str, "', name='", str2);
        return q4.a.j(sb2, "', params=", string, "}");
    }

    public q(m1 m1Var, String str, String str2, String str3, long j10, long j11, long j12, t tVar) {
        k9.c0.e(str2);
        k9.c0.e(str3);
        k9.c0.h(tVar);
        this.f39709a = str2;
        this.f39710b = str3;
        this.f39711c = true == TextUtils.isEmpty(str) ? null : str;
        this.f39712d = j10;
        this.f39713e = j11;
        this.f39714f = j12;
        if (j12 != 0 && j12 > j10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39756i.d("Event created with reverse previous/current timestamps. appId, name", s0.O0(str2), s0.O0(str3));
        }
        this.f39715g = tVar;
    }
}

package ea;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f39278b;

    public /* synthetic */ c2(p2 p2Var, int i10) {
        this.f39277a = i10;
        this.f39278b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39277a) {
            case 0:
                this.f39278b.d1();
                break;
            case 1:
                l1 l1Var = this.f39278b.f39698q;
                m1 m1Var = l1Var.f39549a;
                j1 j1Var = m1Var.f39588g;
                p2 p2Var = m1Var.f39593m;
                a1 a1Var = m1Var.f39586e;
                m1.h(j1Var);
                j1Var.G0();
                if (l1Var.d()) {
                    if (l1Var.c()) {
                        m1.f(a1Var);
                        a1Var.f39223w.h(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString(Constants.MEDIUM, "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        m1.g(p2Var);
                        p2Var.N0("auto", bundle, "_cmpx");
                    } else {
                        m1.f(a1Var);
                        bc.s sVar = a1Var.f39223w;
                        String strG = sVar.g();
                        if (TextUtils.isEmpty(strG)) {
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39754g.b("Cache still valid but referrer not found");
                        } else {
                            long jE = a1Var.f39224x.e() / 3600000;
                            Uri uri = Uri.parse(strG);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jE - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : (String) obj;
                            m1.g(p2Var);
                            p2Var.N0(str2, (Bundle) pair.second, "_cmp");
                        }
                        sVar.h(null);
                    }
                    m1.f(a1Var);
                    a1Var.f39224x.f(0L);
                    break;
                }
                break;
            case 2:
                p2 p2Var2 = this.f39278b;
                p2Var2.G0();
                m1 m1Var2 = (m1) p2Var2.f3623a;
                a1 a1Var2 = m1Var2.f39586e;
                s0 s0Var2 = m1Var2.f39587f;
                m1.f(a1Var2);
                y0 y0Var = a1Var2.f39220t;
                if (y0Var.a()) {
                    m1.h(s0Var2);
                    s0Var2.f39759m.b("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    z0 z0Var = a1Var2.f39221u;
                    long jE2 = z0Var.e();
                    z0Var.f(1 + jE2);
                    if (jE2 >= 5) {
                        m1.h(s0Var2);
                        s0Var2.f39756i.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        y0Var.b(true);
                    } else {
                        if (p2Var2.f39700s == null) {
                            p2Var2.f39700s = new d2(p2Var2, m1Var2, 3);
                        }
                        p2Var2.f39700s.b(0L);
                    }
                }
                break;
            default:
                this.f39278b.d1();
                break;
        }
    }
}

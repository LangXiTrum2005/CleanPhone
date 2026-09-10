package ea;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.measurement.k7;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile w2 f39949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w2 f39950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2 f39951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f39952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k7 f39953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f39954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile w2 f39955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w2 f39956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39957k;
    public final Object l;

    public z2(m1 m1Var) {
        super(m1Var);
        this.l = new Object();
        this.f39952f = new ConcurrentHashMap();
    }

    @Override // ea.f0
    public final boolean J0() {
        return false;
    }

    public final w2 K0(boolean z10) {
        H0();
        G0();
        if (!z10) {
            return this.f39951e;
        }
        w2 w2Var = this.f39951e;
        return w2Var != null ? w2Var : this.f39956j;
    }

    public final String L0(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        m1 m1Var = (m1) this.f3623a;
        int length2 = str2.length();
        m1Var.f39585d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        m1Var.f39585d.getClass();
        return str2.substring(0, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    public final void M0(w2 w2Var, w2 w2Var2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        long j11;
        long jElapsedRealtime;
        Bundle bundle2;
        boolean z12 = w2Var.f39866e;
        m1 m1Var = (m1) this.f3623a;
        G0();
        boolean z13 = false;
        if (w2Var2 != null) {
            if (w2Var2.f39864c == w2Var.f39864c && Objects.equals(w2Var2.f39863b, w2Var.f39863b) && Objects.equals(w2Var2.f39862a, w2Var.f39862a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.f39951e != null) {
            z13 = true;
        }
        if (z11) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            l4.B1(w2Var, bundle3, true);
            if (w2Var2 != null) {
                String str = w2Var2.f39862a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = w2Var2.f39863b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", w2Var2.f39864c);
            }
            if (z13) {
                p3 p3Var = m1Var.f39589h;
                m1.g(p3Var);
                c7 c7Var = p3Var.f39707f;
                long j12 = j10 - c7Var.f13071b;
                c7Var.f13071b = j10;
                if (j12 > 0) {
                    l4 l4Var = m1Var.f39590i;
                    m1.f(l4Var);
                    l4Var.r1(bundle3, j12);
                }
            }
            g gVar = m1Var.f39585d;
            p9.b bVar = m1Var.f39592k;
            if (!gVar.V0()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z12 ? "auto" : MBridgeConstans.DYNAMIC_VIEW_WX_APP;
            bVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z12) {
                long j13 = w2Var.f39867f;
                if (j13 != 0) {
                    j11 = j13;
                } else {
                    j11 = jCurrentTimeMillis;
                }
            } else {
                j11 = jCurrentTimeMillis;
            }
            if (m1Var.f39585d.R0(null, d0.f39301e1)) {
                bVar.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                jElapsedRealtime = 0;
            }
            if (z12) {
                bundle2 = bundle3;
                long j14 = w2Var.f39868g;
                if (j14 != 0) {
                    jElapsedRealtime = j14;
                }
            } else {
                bundle2 = bundle3;
            }
            p2 p2Var = m1Var.f39593m;
            m1.g(p2Var);
            p2Var.O0(j11, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z13) {
            P0(this.f39951e, true, j10);
        }
        this.f39951e = w2Var;
        if (z12) {
            this.f39956j = w2Var;
        }
        h3 h3VarK = m1Var.k();
        h3VarK.G0();
        h3VarK.H0();
        h3VarK.U0(new ta.i0(h3VarK, w2Var));
    }

    public final void N0(k7 k7Var, Bundle bundle) {
        Bundle bundle2;
        if (!((m1) this.f3623a).f39585d.V0() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f39952f.put(Integer.valueOf(k7Var.f23674a), new w2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void O0(String str, w2 w2Var, boolean z10) {
        w2 w2Var2;
        w2 w2Var3 = this.f39949c == null ? this.f39950d : this.f39949c;
        if (w2Var.f39863b == null) {
            w2Var2 = new w2(w2Var.f39862a, str != null ? L0(str) : null, w2Var.f39864c, w2Var.f39866e, w2Var.f39867f, w2Var.f39868g);
        } else {
            w2Var2 = w2Var;
        }
        this.f39950d = this.f39949c;
        this.f39949c = w2Var2;
        m1 m1Var = (m1) this.f3623a;
        m1Var.f39592k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.P0(new x2(this, w2Var2, w2Var3, jElapsedRealtime, z10));
    }

    public final void P0(w2 w2Var, boolean z10, long j10) {
        m1 m1Var = (m1) this.f3623a;
        y yVar = m1Var.f39594n;
        m1.e(yVar);
        m1Var.f39592k.getClass();
        yVar.J0(SystemClock.elapsedRealtime());
        boolean z11 = w2Var != null && w2Var.f39865d;
        p3 p3Var = m1Var.f39589h;
        m1.g(p3Var);
        if (!p3Var.f39707f.c(j10, z11, z10) || w2Var == null) {
            return;
        }
        w2Var.f39865d = false;
    }

    public final w2 Q0(k7 k7Var) {
        k9.c0.h(k7Var);
        Integer numValueOf = Integer.valueOf(k7Var.f23674a);
        ConcurrentHashMap concurrentHashMap = this.f39952f;
        w2 w2Var = (w2) concurrentHashMap.get(numValueOf);
        if (w2Var == null) {
            String strL0 = L0(k7Var.f23675b);
            l4 l4Var = ((m1) this.f3623a).f39590i;
            m1.f(l4Var);
            w2 w2Var2 = new w2(null, strL0, l4Var.D1());
            concurrentHashMap.put(numValueOf, w2Var2);
            w2Var = w2Var2;
        }
        return this.f39955i != null ? this.f39955i : w2Var;
    }
}

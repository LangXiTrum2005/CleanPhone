package ea;

import android.os.Bundle;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f39530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f39531c;

    public /* synthetic */ k2(p2 p2Var, Bundle bundle, int i10) {
        this.f39529a = i10;
        this.f39530b = bundle;
        this.f39531c = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39529a) {
            case 0:
                p2 p2Var = this.f39531c;
                p2Var.G0();
                p2Var.H0();
                Bundle bundle = this.f39530b;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                k9.c0.e(string);
                k9.c0.e(string2);
                k9.c0.h(bundle.get(X3.i.X));
                m1 m1Var = (m1) p2Var.f3623a;
                if (!m1Var.a()) {
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39760n.b("Conditional property not set since app measurement is disabled");
                } else {
                    i4 i4Var = new i4(bundle.getLong("triggered_timestamp"), bundle.get(X3.i.X), string, string2);
                    try {
                        l4 l4Var = m1Var.f39590i;
                        m1.f(l4Var);
                        bundle.getString(MBridgeConstans.APP_ID);
                        u uVarM1 = l4Var.m1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        m1.f(l4Var);
                        bundle.getString(MBridgeConstans.APP_ID);
                        u uVarM2 = l4Var.m1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString(MBridgeConstans.APP_ID);
                        m1Var.k().Z0(new e(bundle.getString(MBridgeConstans.APP_ID), string2, i4Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), uVarM2, bundle.getLong("trigger_timeout"), uVarM1, bundle.getLong("time_to_live"), l4Var.m1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                p2 p2Var2 = this.f39531c;
                p2Var2.G0();
                p2Var2.H0();
                Bundle bundle2 = this.f39530b;
                String string3 = bundle2.getString("name");
                k9.c0.e(string3);
                m1 m1Var2 = (m1) p2Var2.f3623a;
                if (!m1Var2.a()) {
                    s0 s0Var2 = m1Var2.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39760n.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    i4 i4Var2 = new i4(0L, null, string3, "");
                    try {
                        l4 l4Var2 = m1Var2.f39590i;
                        m1.f(l4Var2);
                        bundle2.getString(MBridgeConstans.APP_ID);
                        m1Var2.k().Z0(new e(bundle2.getString(MBridgeConstans.APP_ID), "", i4Var2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), l4Var2.m1(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                p2 p2Var3 = this.f39531c;
                s4.i iVar = p2Var3.f39703v;
                m1 m1Var3 = (m1) p2Var3.f3623a;
                Bundle bundle3 = this.f39530b;
                if (!bundle3.isEmpty()) {
                    a1 a1Var = m1Var3.f39586e;
                    l4 l4Var3 = m1Var3.f39590i;
                    g gVar = m1Var3.f39585d;
                    s0 s0Var3 = m1Var3.f39587f;
                    m1.f(a1Var);
                    Bundle bundle4 = new Bundle(a1Var.f39225y.E());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            m1.f(l4Var3);
                            if (l4.R1(obj)) {
                                l4.Y0(iVar, null, 27, null, null, 0);
                            }
                            m1.h(s0Var3);
                            s0Var3.f39758k.d("Invalid default event parameter type. Name, value", str, obj);
                        } else if (l4.j1(str)) {
                            m1.h(s0Var3);
                            s0Var3.f39758k.c(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            m1.f(l4Var3);
                            gVar.getClass();
                            if (l4Var3.K0("param", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, str, obj)) {
                                l4Var3.X0(str, obj, bundle4);
                            }
                        }
                    }
                    m1.f(l4Var3);
                    l4 l4Var4 = ((m1) gVar.f3623a).f39590i;
                    m1.f(l4Var4);
                    int i10 = l4Var4.p1(201500000) ? 100 : 25;
                    if (bundle4.size() > i10) {
                        int i11 = 0;
                        for (String str2 : new TreeSet(bundle4.keySet())) {
                            i11++;
                            if (i11 > i10) {
                                bundle4.remove(str2);
                            }
                        }
                        m1.f(l4Var3);
                        l4.Y0(iVar, null, 26, null, null, 0);
                        m1.h(s0Var3);
                        s0Var3.f39758k.b("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                a1 a1Var2 = m1Var3.f39586e;
                m1.f(a1Var2);
                a1Var2.f39225y.H(bundle3);
                m1Var3.k().L0(bundle3);
                break;
        }
    }
}

package ea;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g3 implements ServiceConnection, k9.b, k9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f39427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile p0 f39428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f39429c;

    public g3(h3 h3Var) {
        this.f39429c = h3Var;
    }

    @Override // k9.b
    public final void d(Bundle bundle) {
        j1 j1Var = ((m1) this.f39429c.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.L0();
        synchronized (this) {
            try {
                k9.c0.h(this.f39428b);
                g0 g0Var = (g0) this.f39428b.getService();
                j1 j1Var2 = ((m1) this.f39429c.f3623a).f39588g;
                m1.h(j1Var2);
                j1Var2.P0(new e3(this, g0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f39428b = null;
                this.f39427a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        j1 j1Var = ((m1) this.f39429c.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.L0();
        synchronized (this) {
            if (iBinder == null) {
                this.f39427a = false;
                s0 s0Var = ((m1) this.f39429c.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39753f.b("Service connected with null binder");
                return;
            }
            g0 e0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    e0Var = iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new e0(iBinder);
                    s0 s0Var2 = ((m1) this.f39429c.f3623a).f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39760n.b("Bound to IMeasurementService interface");
                } else {
                    s0 s0Var3 = ((m1) this.f39429c.f3623a).f39587f;
                    m1.h(s0Var3);
                    s0Var3.f39753f.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                s0 s0Var4 = ((m1) this.f39429c.f3623a).f39587f;
                m1.h(s0Var4);
                s0Var4.f39753f.b("Service connect failed to get IMeasurementService");
            }
            if (e0Var == null) {
                this.f39427a = false;
                try {
                    o9.a aVarB = o9.a.b();
                    h3 h3Var = this.f39429c;
                    aVarB.c(((m1) h3Var.f3623a).f39582a, h3Var.f39457c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                j1 j1Var2 = ((m1) this.f39429c.f3623a).f39588g;
                m1.h(j1Var2);
                j1Var2.P0(new e3(this, e0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m1 m1Var = (m1) this.f39429c.f3623a;
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.L0();
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39759m.b("Service disconnected");
        j1 j1Var2 = m1Var.f39588g;
        m1.h(j1Var2);
        j1Var2.P0(new ta.i0(this, false, componentName, 16));
    }

    @Override // k9.b
    public final void q(int i10) {
        m1 m1Var = (m1) this.f39429c.f3623a;
        j1 j1Var = m1Var.f39588g;
        m1.h(j1Var);
        j1Var.L0();
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39759m.b("Service connection suspended");
        j1 j1Var2 = m1Var.f39588g;
        m1.h(j1Var2);
        j1Var2.P0(new androidx.lifecycle.a0(this, 11));
    }

    @Override // k9.c
    public final void r(ConnectionResult connectionResult) {
        h3 h3Var = this.f39429c;
        j1 j1Var = ((m1) h3Var.f3623a).f39588g;
        m1.h(j1Var);
        j1Var.L0();
        s0 s0Var = ((m1) h3Var.f3623a).f39587f;
        if (s0Var == null || !s0Var.f39766b) {
            s0Var = null;
        }
        if (s0Var != null) {
            s0Var.f39760n.c(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f39427a = false;
            this.f39428b = null;
        }
        j1 j1Var2 = ((m1) this.f39429c.f3623a).f39588g;
        m1.h(j1Var2);
        j1Var2.P0(new ta.i0(this, false, connectionResult, 17));
    }
}

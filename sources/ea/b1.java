package ea;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.p6;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f39252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39253c;

    public b1(c1 c1Var, String str) {
        this.f39251a = 0;
        Objects.requireNonNull(c1Var);
        this.f39253c = c1Var;
        this.f39252b = str;
    }

    public IBinder a() throws InterruptedException {
        if (!((AtomicBoolean) this.f39252b).compareAndSet(false, true)) {
            throw new IllegalStateException("Binder already consumed");
        }
        Object objTake = ((LinkedBlockingDeque) this.f39253c).take();
        kotlin.jvm.internal.n.e(objTake, "queue.take()");
        return (IBinder) objTake;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f39251a) {
            case 0:
                c1 c1Var = (c1) this.f39253c;
                if (iBinder == null) {
                    s0 s0Var = c1Var.f39276b.f39587f;
                    m1.h(s0Var);
                    s0Var.f39756i.b("Install Referrer connection returned with null binder");
                } else {
                    try {
                        int i10 = o6.f23797a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        p6 n6Var = iInterfaceQueryLocalInterface instanceof p6 ? (p6) iInterfaceQueryLocalInterface : new n6(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 1);
                        m1 m1Var = c1Var.f39276b;
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39760n.b("Install Referrer Service connected");
                        j1 j1Var = m1Var.f39588g;
                        m1.h(j1Var);
                        j1Var.P0(new ta.i0(this, n6Var, this));
                    } catch (RuntimeException e10) {
                        s0 s0Var3 = c1Var.f39276b.f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39756i.c(e10, "Exception occurred while calling Install Referrer API");
                        return;
                    }
                }
                break;
            default:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) this.f39253c).put(iBinder);
                    } catch (InterruptedException e11) {
                        q7.e0.C("q7.b", "Service connection interrupted", e11);
                    }
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f39251a) {
            case 0:
                s0 s0Var = ((c1) this.f39253c).f39276b.f39587f;
                m1.h(s0Var);
                s0Var.f39760n.b("Install Referrer Service disconnected");
                break;
        }
    }

    public b1() {
        this.f39251a = 1;
        this.f39252b = new AtomicBoolean(false);
        this.f39253c = new LinkedBlockingDeque();
    }

    private final void b(ComponentName componentName) {
    }
}

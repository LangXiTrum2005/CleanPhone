package k9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f44454b;

    public h0(f fVar, int i10) {
        this.f44454b = fVar;
        this.f44453a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10;
        int i11;
        if (iBinder == null) {
            f fVar = this.f44454b;
            synchronized (fVar.f44415m) {
                i10 = fVar.f44422t;
            }
            if (i10 == 3) {
                fVar.B = true;
                i11 = 5;
            } else {
                i11 = 4;
            }
            f0 f0Var = fVar.l;
            f0Var.sendMessage(f0Var.obtainMessage(i11, fVar.D.get(), 16));
            return;
        }
        f fVar2 = this.f44454b;
        synchronized (fVar2.f44416n) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.f44417o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof y)) ? new y(iBinder) : (y) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f fVar3 = this.f44454b;
        int i12 = this.f44453a;
        fVar3.getClass();
        j0 j0Var = new j0(fVar3, 0, null);
        f0 f0Var2 = fVar3.l;
        f0Var2.sendMessage(f0Var2.obtainMessage(7, i12, -1, j0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.f44454b;
        synchronized (fVar.f44416n) {
            fVar.f44417o = null;
        }
        f fVar2 = this.f44454b;
        int i10 = this.f44453a;
        f0 f0Var = fVar2.l;
        f0Var.sendMessage(f0Var.obtainMessage(6, i10, 1));
    }
}

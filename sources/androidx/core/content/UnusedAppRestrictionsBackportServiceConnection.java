package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    public IUnusedAppRestrictionsBackportService X;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceB0 = IUnusedAppRestrictionsBackportService.Stub.b0(iBinder);
        this.X = iUnusedAppRestrictionsBackportServiceB0;
        try {
            iUnusedAppRestrictionsBackportServiceB0.F(new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
                {
                    attachInterface(this, IUnusedAppRestrictionsBackportCallback.J8);
                }

                @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                public final void x(boolean z2, boolean z3) {
                    UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = UnusedAppRestrictionsBackportServiceConnection.this;
                    if (!z2) {
                        unusedAppRestrictionsBackportServiceConnection.getClass();
                        throw null;
                    }
                    if (z3) {
                        unusedAppRestrictionsBackportServiceConnection.getClass();
                        throw null;
                    }
                    unusedAppRestrictionsBackportServiceConnection.getClass();
                    throw null;
                }
            });
        } catch (RemoteException unused) {
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.X = null;
    }
}

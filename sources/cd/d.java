package cd;

import java.lang.ref.WeakReference;
import nd.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements b {
    private final c appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private l currentAppState = l.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<b> appStateCallback = new WeakReference<>(this);

    public d(c cVar) {
        this.appStateMonitor = cVar;
    }

    public l getAppState() {
        return this.currentAppState;
    }

    public WeakReference<b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i10) {
        this.appStateMonitor.f6357h.addAndGet(i10);
    }

    @Override // cd.b
    public void onUpdateAppState(l lVar) {
        l lVar2 = this.currentAppState;
        l lVar3 = l.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (lVar2 == lVar3) {
            this.currentAppState = lVar;
        } else {
            if (lVar2 == lVar || lVar == lVar3) {
                return;
            }
            this.currentAppState = l.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        c cVar = this.appStateMonitor;
        this.currentAppState = cVar.f6363o;
        WeakReference<b> weakReference = this.appStateCallback;
        synchronized (cVar.f6355f) {
            cVar.f6355f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            c cVar = this.appStateMonitor;
            WeakReference<b> weakReference = this.appStateCallback;
            synchronized (cVar.f6355f) {
                cVar.f6355f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}

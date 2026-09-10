package claque;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: CancellationSignal.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f15631attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Object f15632dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f15633saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f15634wireman;

    /* JADX INFO: compiled from: CancellationSignal.java */
    public interface attabal {
        void onCancel();
    }

    public void attabal() {
        synchronized (this) {
            try {
                if (this.f15631attabal) {
                    return;
                }
                this.f15631attabal = true;
                this.f15634wireman = true;
                attabal attabalVar = this.f15633saneness;
                Object obj = this.f15632dern;
                if (attabalVar != null) {
                    try {
                        attabalVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f15634wireman = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f15634wireman = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void dern() {
        while (this.f15634wireman) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void saneness(attabal attabalVar) {
        synchronized (this) {
            try {
                dern();
                if (this.f15633saneness == attabalVar) {
                    return;
                }
                this.f15633saneness = attabalVar;
                if (this.f15631attabal && attabalVar != null) {
                    attabalVar.onCancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

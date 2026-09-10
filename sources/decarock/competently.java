package decarock;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f25069attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f25070saneness;

    public competently() {
        this(wireman.f25152attabal);
    }

    public synchronized void attabal() throws InterruptedException {
        while (!this.f25070saneness) {
            wait();
        }
    }

    public synchronized boolean dern() {
        boolean z;
        z = this.f25070saneness;
        this.f25070saneness = false;
        return z;
    }

    public synchronized boolean marial() {
        if (this.f25070saneness) {
            return false;
        }
        this.f25070saneness = true;
        notifyAll();
        return true;
    }

    public synchronized void saneness() {
        boolean z = false;
        while (!this.f25070saneness) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean wireman() {
        return this.f25070saneness;
    }

    public competently(wireman wiremanVar) {
        this.f25069attabal = wiremanVar;
    }
}

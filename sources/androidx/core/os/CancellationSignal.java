package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CancellationSignal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnCancelListener f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.os.CancellationSignal f4352c;
    public boolean d;

    public interface OnCancelListener {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.f4350a) {
                    return;
                }
                this.f4350a = true;
                this.d = true;
                OnCancelListener onCancelListener = this.f4351b;
                android.os.CancellationSignal cancellationSignal = this.f4352c;
                if (onCancelListener != null) {
                    try {
                        onCancelListener.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(OnCancelListener onCancelListener) {
        synchronized (this) {
            while (this.d) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f4351b == onCancelListener) {
                return;
            }
            this.f4351b = onCancelListener;
            if (this.f4350a) {
                onCancelListener.onCancel();
            }
        }
    }
}

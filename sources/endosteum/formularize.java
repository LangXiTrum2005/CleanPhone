package endosteum;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: ResourceRecycler.java */
/* JADX INFO: loaded from: classes2.dex */
public class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f25719attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Handler f25720saneness = new Handler(Looper.getMainLooper(), new attabal());

    /* JADX INFO: compiled from: ResourceRecycler.java */
    public static final class attabal implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((cutely) message.obj).attabal();
            return true;
        }
    }

    public synchronized void attabal(cutely<?> cutelyVar, boolean z) {
        try {
            if (this.f25719attabal || z) {
                this.f25720saneness.obtainMessage(1, cutelyVar).sendToTarget();
            } else {
                this.f25719attabal = true;
                cutelyVar.attabal();
                this.f25719attabal = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

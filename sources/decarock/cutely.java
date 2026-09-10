package decarock;

import android.os.Looper;

/* JADX INFO: compiled from: HandlerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public interface cutely {

    /* JADX INFO: compiled from: HandlerWrapper.java */
    public interface attabal {
        void attabal();
    }

    boolean attabal(int i);

    Looper getLooper();

    attabal obtainMessage(int i);

    attabal obtainMessage(int i, int i2, int i3);

    attabal obtainMessage(int i, int i2, int i3, Object obj);

    attabal obtainMessage(int i, Object obj);

    boolean post(Runnable runnable);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i);

    boolean saneness(attabal attabalVar);

    boolean sendEmptyMessage(int i);

    boolean sendEmptyMessageAtTime(int i, long j);
}

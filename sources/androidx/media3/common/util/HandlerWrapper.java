package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public interface HandlerWrapper {

    public interface Message {
        void a();
    }

    boolean a();

    void b();

    boolean c(long j);

    boolean d(Message message);

    Looper getLooper();

    Message obtainMessage(int i2);

    Message obtainMessage(int i2, int i3, int i4);

    Message obtainMessage(int i2, Object obj);

    boolean post(Runnable runnable);

    void removeMessages(int i2);

    boolean sendEmptyMessage(int i2);
}

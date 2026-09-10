package com.google.android.exoplayer2.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public interface HandlerWrapper {

    public interface Message {
        void a();
    }

    boolean a();

    void b();

    boolean c(long j);

    boolean d(Message message);

    Message e(int i2, int i3);

    Looper getLooper();

    Message obtainMessage(int i2);

    Message obtainMessage(int i2, int i3, int i4, Object obj);

    Message obtainMessage(int i2, Object obj);

    boolean post(Runnable runnable);

    void removeMessages(int i2);

    boolean sendEmptyMessage(int i2);
}

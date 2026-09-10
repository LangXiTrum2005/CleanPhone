package com.smartdigimkt.p4;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public interface k {
    Looper a();

    Message a(int i2, int i3, int i4);

    Message a(int i2, int i3, int i4, Object obj);

    Message a(int i2, Object obj);

    void a(Object obj);

    boolean a(int i2);

    boolean a(int i2, long j);

    boolean a(Runnable runnable);

    boolean a(Runnable runnable, long j);

    void b(int i2);

    Message c(int i2);
}

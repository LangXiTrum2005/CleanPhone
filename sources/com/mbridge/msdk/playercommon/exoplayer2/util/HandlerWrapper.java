package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface HandlerWrapper {
    Looper getLooper();

    Message obtainMessage(int i10);

    Message obtainMessage(int i10, int i11, int i12);

    Message obtainMessage(int i10, int i11, int i12, Object obj);

    Message obtainMessage(int i10, Object obj);

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j10);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i10);

    boolean sendEmptyMessage(int i10);

    boolean sendEmptyMessageAtTime(int i10, long j10);
}

package com.smartdigimkt.p4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
final class b0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f37519a;

    public b0(Handler handler) {
        this.f37519a = handler;
    }

    @Override // com.smartdigimkt.p4.k
    public Looper a() {
        return this.f37519a.getLooper();
    }

    @Override // com.smartdigimkt.p4.k
    public void b(int i2) {
        this.f37519a.removeMessages(i2);
    }

    @Override // com.smartdigimkt.p4.k
    public Message c(int i2) {
        return this.f37519a.obtainMessage(i2);
    }

    @Override // com.smartdigimkt.p4.k
    public Message a(int i2, Object obj) {
        return this.f37519a.obtainMessage(i2, obj);
    }

    @Override // com.smartdigimkt.p4.k
    public Message a(int i2, int i3, int i4) {
        return this.f37519a.obtainMessage(i2, i3, i4);
    }

    @Override // com.smartdigimkt.p4.k
    public Message a(int i2, int i3, int i4, Object obj) {
        return this.f37519a.obtainMessage(i2, i3, i4, obj);
    }

    @Override // com.smartdigimkt.p4.k
    public boolean a(int i2) {
        return this.f37519a.sendEmptyMessage(i2);
    }

    @Override // com.smartdigimkt.p4.k
    public boolean a(int i2, long j) {
        return this.f37519a.sendEmptyMessageAtTime(i2, j);
    }

    @Override // com.smartdigimkt.p4.k
    public void a(Object obj) {
        this.f37519a.removeCallbacksAndMessages(obj);
    }

    @Override // com.smartdigimkt.p4.k
    public boolean a(Runnable runnable) {
        return this.f37519a.post(runnable);
    }

    @Override // com.smartdigimkt.p4.k
    public boolean a(Runnable runnable, long j) {
        return this.f37519a.postDelayed(runnable, j);
    }
}

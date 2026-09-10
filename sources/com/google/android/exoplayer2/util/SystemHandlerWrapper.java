package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class SystemHandlerWrapper implements HandlerWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f18970b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f18971a;

    public static final class SystemMessage implements HandlerWrapper.Message {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f18972a;

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public final void a() {
            Message message = this.f18972a;
            message.getClass();
            message.sendToTarget();
            b();
        }

        public final void b() {
            this.f18972a = null;
            ArrayList arrayList = SystemHandlerWrapper.f18970b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.f18971a = handler;
    }

    public static SystemMessage f() {
        SystemMessage systemMessage;
        ArrayList arrayList = f18970b;
        synchronized (arrayList) {
            try {
                systemMessage = arrayList.isEmpty() ? new SystemMessage() : (SystemMessage) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean a() {
        return this.f18971a.hasMessages(0);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final void b() {
        this.f18971a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean c(long j) {
        return this.f18971a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean d(HandlerWrapper.Message message) {
        SystemMessage systemMessage = (SystemMessage) message;
        Message message2 = systemMessage.f18972a;
        message2.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f18971a.sendMessageAtFrontOfQueue(message2);
        systemMessage.b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message e(int i2, int i3) {
        SystemMessage systemMessageF = f();
        systemMessageF.f18972a = this.f18971a.obtainMessage(1, i2, i3);
        return systemMessageF;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final Looper getLooper() {
        return this.f18971a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i2) {
        SystemMessage systemMessageF = f();
        systemMessageF.f18972a = this.f18971a.obtainMessage(i2);
        return systemMessageF;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.f18971a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final void removeMessages(int i2) {
        this.f18971a.removeMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i2) {
        return this.f18971a.sendEmptyMessage(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i2, Object obj) {
        SystemMessage systemMessageF = f();
        systemMessageF.f18972a = this.f18971a.obtainMessage(i2, obj);
        return systemMessageF;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i2, int i3, int i4, Object obj) {
        SystemMessage systemMessageF = f();
        systemMessageF.f18972a = this.f18971a.obtainMessage(i2, i3, i4, obj);
        return systemMessageF;
    }
}

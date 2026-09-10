package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class SystemHandlerWrapper implements HandlerWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f5674b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f5675a;

    public static final class SystemMessage implements HandlerWrapper.Message {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f5676a;

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public final void a() {
            Message message = this.f5676a;
            message.getClass();
            message.sendToTarget();
            b();
        }

        public final void b() {
            this.f5676a = null;
            ArrayList arrayList = SystemHandlerWrapper.f5674b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.f5675a = handler;
    }

    public static SystemMessage e() {
        SystemMessage systemMessage;
        ArrayList arrayList = f5674b;
        synchronized (arrayList) {
            try {
                systemMessage = arrayList.isEmpty() ? new SystemMessage() : (SystemMessage) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean a() {
        return this.f5675a.hasMessages(1);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void b() {
        this.f5675a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean c(long j) {
        return this.f5675a.sendEmptyMessageAtTime(2, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean d(HandlerWrapper.Message message) {
        SystemMessage systemMessage = (SystemMessage) message;
        Message message2 = systemMessage.f5676a;
        message2.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f5675a.sendMessageAtFrontOfQueue(message2);
        systemMessage.b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final Looper getLooper() {
        return this.f5675a.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i2) {
        SystemMessage systemMessageE = e();
        systemMessageE.f5676a = this.f5675a.obtainMessage(i2);
        return systemMessageE;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.f5675a.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final void removeMessages(int i2) {
        Assertions.b(i2 != 0);
        this.f5675a.removeMessages(i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i2) {
        return this.f5675a.sendEmptyMessage(i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i2, Object obj) {
        SystemMessage systemMessageE = e();
        systemMessageE.f5676a = this.f5675a.obtainMessage(i2, obj);
        return systemMessageE;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i2, int i3, int i4) {
        SystemMessage systemMessageE = e();
        systemMessageE.f5676a = this.f5675a.obtainMessage(i2, i3, i4);
        return systemMessageE;
    }
}

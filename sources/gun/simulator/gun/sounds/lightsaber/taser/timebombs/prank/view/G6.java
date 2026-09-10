package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class G6 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I6 f3104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(I6 i6, Looper looper) {
        super(looper);
        this.f3104a = i6;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        I6 i6 = this.f3104a;
        i6.getClass();
        int i = message.what;
        H6 h6 = null;
        if (i == 0) {
            H6 h7 = (H6) message.obj;
            try {
                i6.f3202a.queueInputBuffer(h7.f3154a, h7.b, h7.c, h7.e, h7.f);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = i6.d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            h6 = h7;
        } else if (i == 1) {
            H6 h8 = (H6) message.obj;
            int i2 = h8.f3154a;
            int i3 = h8.b;
            MediaCodec.CryptoInfo cryptoInfo = h8.d;
            long j = h8.e;
            int i4 = h8.f;
            try {
                synchronized (I6.h) {
                    i6.f3202a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = i6.d;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            h6 = h8;
        } else if (i != 2) {
            AtomicReference atomicReference3 = i6.d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            i6.e.d();
        }
        if (h6 != null) {
            I6.c(h6);
        }
    }
}

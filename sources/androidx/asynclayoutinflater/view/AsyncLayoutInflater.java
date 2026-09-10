package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncLayoutInflater {

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1, reason: invalid class name */
    public class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ((InflateRequest) message.obj).getClass();
            throw null;
        }
    }

    public static class BasicInflater extends LayoutInflater {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f3684a = {"android.widget.", "android.webkit.", "android.app."};

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            String[] strArr = f3684a;
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    View viewCreateView = createView(str, strArr[i2], attributeSet);
                    if (viewCreateView != null) {
                        return viewCreateView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public static class InflateRequest {
    }

    public static class InflateThread extends Thread {
        public ArrayBlockingQueue X;

        static {
            InflateThread inflateThread = new InflateThread();
            inflateThread.X = new ArrayBlockingQueue(10);
            new Pools.SynchronizedPool(10);
            inflateThread.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    InflateRequest inflateRequest = (InflateRequest) this.X.take();
                    try {
                        inflateRequest.getClass();
                        throw null;
                    } catch (RuntimeException e2) {
                        Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                        inflateRequest.getClass();
                        throw null;
                    }
                } catch (InterruptedException e3) {
                    Log.w("AsyncLayoutInflater", e3);
                }
            }
        }
    }

    public interface OnInflateFinishedListener {
    }
}

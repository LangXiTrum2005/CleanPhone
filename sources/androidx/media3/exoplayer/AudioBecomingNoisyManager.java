package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioBecomingNoisyReceiver f5814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5815c;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        public final EventListener X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Handler f5816Y;

        public AudioBecomingNoisyReceiver(Handler handler, EventListener eventListener) {
            this.f5816Y = handler;
            this.X = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f5816Y.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (AudioBecomingNoisyManager.this.f5815c) {
                this.X.m();
            }
        }
    }

    public interface EventListener {
        void m();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.f5813a = context.getApplicationContext();
        this.f5814b = new AudioBecomingNoisyReceiver(handler, eventListener);
    }

    public final void a() {
        if (this.f5815c) {
            this.f5813a.unregisterReceiver(this.f5814b);
            this.f5815c = false;
        }
    }
}

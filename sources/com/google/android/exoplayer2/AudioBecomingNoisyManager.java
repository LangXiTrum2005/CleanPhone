package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioBecomingNoisyReceiver f16987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16988c;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {
        public final EventListener X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Handler f16989Y;

        public AudioBecomingNoisyReceiver(Handler handler, EventListener eventListener) {
            this.f16989Y = handler;
            this.X = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16989Y.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (AudioBecomingNoisyManager.this.f16988c) {
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) this.X;
                componentListener.getClass();
                int i2 = ExoPlayerImpl.f17032d0;
                ExoPlayerImpl.this.w(-1, 3, false);
            }
        }
    }

    public interface EventListener {
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, EventListener eventListener) {
        this.f16986a = context.getApplicationContext();
        this.f16987b = new AudioBecomingNoisyReceiver(handler, eventListener);
    }

    public final void a() {
        if (this.f16988c) {
            this.f16986a.unregisterReceiver(this.f16987b);
            this.f16988c = false;
        }
    }
}

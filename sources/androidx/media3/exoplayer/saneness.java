package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f12308attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f12309dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f12310saneness;

    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public final class attabal extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final Handler f12311arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final InterfaceC0088saneness f12312kowloon;

        public attabal(Handler handler, InterfaceC0088saneness interfaceC0088saneness) {
            this.f12311arytenoidectomy = handler;
            this.f12312kowloon = interfaceC0088saneness;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f12311arytenoidectomy.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.f12309dern) {
                this.f12312kowloon.molybdenite();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface InterfaceC0088saneness {
        void molybdenite();
    }

    public saneness(Context context, Handler handler, InterfaceC0088saneness interfaceC0088saneness) {
        this.f12308attabal = context.getApplicationContext();
        this.f12310saneness = new attabal(handler, interfaceC0088saneness);
    }

    public void saneness(boolean z) {
        if (z && !this.f12309dern) {
            this.f12308attabal.registerReceiver(this.f12310saneness, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f12309dern = true;
        } else {
            if (z || !this.f12309dern) {
                return;
            }
            this.f12308attabal.unregisterReceiver(this.f12310saneness);
            this.f12309dern = false;
        }
    }
}

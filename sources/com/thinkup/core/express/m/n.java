package com.thinkup.core.express.m;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static final String m = "android.media.VOLUME_CHANGED_ACTION";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42380n = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static double o = -1.0d;
    private o m0;
    private Context o0;
    private boolean om = false;
    private m on;
    private AudioManager oo;

    public interface m {
        void o();
    }

    public static class o extends BroadcastReceiver {
        private WeakReference<n> o;

        public o(n nVar) {
            this.o = new WeakReference<>(nVar);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            n nVar;
            if (!n.m.equals(intent.getAction()) || intent.getIntExtra(n.f42380n, -1) != 3 || (nVar = this.o.get()) == null || nVar.m() == null) {
                return;
            }
            nVar.o();
        }
    }

    private n(Context context) {
        this.o0 = context;
        this.oo = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    private void n() {
        if (this.o0 != null) {
            this.m0 = new o(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(m);
            this.o0.registerReceiver(this.m0, intentFilter);
            this.om = true;
        }
    }

    private void o0() {
        Context context;
        if (!this.om || (context = this.o0) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.m0);
            this.on = null;
            this.om = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final m m() {
        return this.on;
    }

    public final double o() {
        AudioManager audioManager = this.oo;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.oo;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        o = streamVolume;
        return streamVolume;
    }

    private void o(m mVar) {
        this.on = mVar;
    }
}

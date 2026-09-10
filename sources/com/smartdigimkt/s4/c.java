package com.smartdigimkt.s4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    private static final String f = "android.media.VOLUME_CHANGED_ACTION";
    private static final String g = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static double f38189h = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f38191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38192c = false;
    private b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f38193e;

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<c> f38194a;

        public a(c cVar) {
            this.f38194a = new WeakReference<>(cVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar;
            b bVarB;
            if (!c.f.equals(intent.getAction()) || intent.getIntExtra(c.g, -1) != 3 || (cVar = this.f38194a.get()) == null || (bVarB = cVar.b()) == null) {
                return;
            }
            double dA = cVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    public interface b {
        void a(double d);
    }

    public c(Context context) {
        this.f38190a = context;
        this.f38191b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f38191b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f38191b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f38189h = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.d;
    }

    public void c() {
        if (this.f38190a != null) {
            this.f38193e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f);
            this.f38190a.registerReceiver(this.f38193e, intentFilter);
            this.f38192c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f38192c || (context = this.f38190a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f38193e);
            this.d = null;
            this.f38192c = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.d = bVar;
    }
}

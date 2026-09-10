package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f34880f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f34882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34883c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f34885e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f34886a;

        public a(d dVar) {
            this.f34886a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f34886a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f34881a = context;
        this.f34882b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f34882b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f34882b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f34880f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f34884d;
    }

    public void c() {
        if (this.f34881a != null) {
            this.f34885e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f34881a.registerReceiver(this.f34885e, intentFilter);
            this.f34883c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f34883c || (context = this.f34881a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f34885e);
            this.f34884d = null;
            this.f34883c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f34884d = bVar;
    }
}

package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f9463h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Float f9464i = Float.valueOf(15.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f9465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f9467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9468d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9469e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9471g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(int i10);
    }

    public j(l lVar) {
        this.f9467c = lVar;
        Context contextP = l.p();
        this.f9466b = contextP;
        this.f9465a = (AudioManager) contextP.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void d() {
        this.f9467c.Q();
        if (p.a()) {
            this.f9467c.Q().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f9471g = f9463h;
        this.f9466b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f9467c.Q();
        if (p.a()) {
            this.f9467c.Q().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f9466b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f9465a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f9465a.getRingerMode());
        }
    }

    private Float a() {
        AudioManager audioManager = this.f9465a;
        if (audioManager == null) {
            return f9464i;
        }
        try {
            return Float.valueOf(audioManager.getStreamMaxVolume(3));
        } catch (Throwable th2) {
            this.f9467c.Q();
            if (p.a()) {
                this.f9467c.Q().a("AudioSessionManager", "Unable to collect the maximum device volume", th2);
            }
            return f9464i;
        }
    }

    public Float b() {
        AudioManager audioManager = this.f9465a;
        if (audioManager == null) {
            return null;
        }
        try {
            return Float.valueOf(audioManager.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th2) {
            this.f9467c.Q();
            if (p.a()) {
                this.f9467c.Q().a("AudioSessionManager", "Unable to collect device volume", th2);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f9470f = true;
            this.f9471g = this.f9465a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f9470f = false;
            if (this.f9471g != this.f9465a.getRingerMode()) {
                this.f9471g = f9463h;
                b(this.f9465a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f9469e) {
            try {
                if (this.f9468d.contains(aVar)) {
                    this.f9468d.remove(aVar);
                    if (this.f9468d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f9469e) {
            try {
                if (this.f9468d.contains(aVar)) {
                    return;
                }
                this.f9468d.add(aVar);
                if (this.f9468d.size() == 1) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b(int i10) {
        if (this.f9470f) {
            return;
        }
        this.f9467c.Q();
        if (p.a()) {
            this.f9467c.Q().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f9469e) {
            try {
                Iterator it = this.f9468d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.adview.o(i10, 1, (a) it.next()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f32409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f32410c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32408a = "MBVolumeEventPublisher";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f32411d = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                e.this.b();
            }
        }
    }

    public e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            this.f32409b = (AudioManager) contextD.getApplicationContext().getSystemService("audio");
        }
        c();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f32411d.remove(aVar);
        }
    }

    public void c() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                this.f32410c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                contextD.registerReceiver(this.f32410c, intentFilter);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    public void d() {
        if (this.f32411d.isEmpty()) {
            e();
            this.f32409b = null;
        }
    }

    public void e() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.unregisterReceiver(this.f32410c);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916005");
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.c("volume"), String.valueOf(a()));
            bVar.a(map);
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f32411d.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (this.f32411d.contains(aVar)) {
            return;
        }
        this.f32411d.add(aVar);
    }

    private double a() {
        AudioManager audioManager = this.f32409b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f32409b;
        return (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
    }
}

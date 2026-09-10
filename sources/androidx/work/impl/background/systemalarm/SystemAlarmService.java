package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.y;
import d5.o;
import g5.h;
import java.util.HashMap;
import java.util.WeakHashMap;
import n5.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5031d = o.i("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f5032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5033c;

    public final void a() {
        this.f5033c = true;
        o.g().e(f5031d, "All commands completed in dispatcher", new Throwable[0]);
        String str = l.f46537a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = l.f46538b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o.g().k(l.f46537a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f5032b = hVar;
        if (hVar.f41553j != null) {
            o.g().f(h.f41543k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f41553j = this;
        }
        this.f5033c = false;
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5033c = true;
        this.f5032b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5033c) {
            o.g().h(f5031d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5032b.c();
            h hVar = new h(this);
            this.f5032b = hVar;
            if (hVar.f41553j != null) {
                o.g().f(h.f41543k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.f41553j = this;
            }
            this.f5033c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5032b.a(intent, i11);
        return 3;
    }
}

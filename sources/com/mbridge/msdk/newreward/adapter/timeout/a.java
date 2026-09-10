package com.mbridge.msdk.newreward.adapter.timeout;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static volatile a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, c> f1605a;
    private Handler b;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.adapter.timeout.a$a, reason: collision with other inner class name */
    public interface InterfaceC0203a {
        void a(String str, long j);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1606a;
        private final long b;
        private boolean c;

        public b(String str, long j) {
            this.f1606a = str;
            this.b = j;
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f1607a;
        private final InterfaceC0203a b;

        public c(b bVar, InterfaceC0203a interfaceC0203a) {
            this.f1607a = bVar;
            this.b = interfaceC0203a;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0203a interfaceC0203a;
            if (MBridgeConstans.DEBUG) {
                o0.a("MBridgeTimer", "TimerTask run taskID: " + this.f1607a.f1606a + " isStop: " + this.f1607a.c);
            }
            if (this.f1607a.c || (interfaceC0203a = this.b) == null) {
                return;
            }
            try {
                interfaceC0203a.a(this.f1607a.f1606a, this.f1607a.b);
            } catch (Exception unused) {
            }
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.f1605a = new HashMap();
    }

    public static a a() {
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(String str, long j, InterfaceC0203a interfaceC0203a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            o0.a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j);
        }
        if (this.f1605a.containsKey(str)) {
            return;
        }
        c cVar = new c(new b(str, j), interfaceC0203a);
        this.f1605a.put(str, cVar);
        this.b.postDelayed(cVar, j);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c cVarRemove = this.f1605a.remove(str);
        if (MBridgeConstans.DEBUG) {
            AbstractC3888ke0.s("stopTimer taskID: ", str, "MBridgeTimer");
        }
        if (cVarRemove != null) {
            cVarRemove.f1607a.c = true;
            a(cVarRemove);
        }
    }

    private void a(c cVar) {
        if (cVar == null) {
            return;
        }
        this.b.removeCallbacks(cVar);
    }
}

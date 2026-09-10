package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.z4;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f9450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f9451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f9452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f9453e = new AtomicLong(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f9454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9456h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (i.this.f9450b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - i.this.f9453e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= i.this.f9454f) {
                i.this.f9452d.postDelayed(this, i.this.f9456h);
                return;
            }
            i.this.f9450b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(i.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - l.o());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", i.this.f9449a.B0() ? "non_first_session" : "first_session");
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "seconds_since_app_launch", String.valueOf(seconds));
            List listA = i.this.f9449a.h().a();
            if (!CollectionUtils.isEmpty(listA)) {
                JsonUtils.putJsonArray(jSONObject, "ad_info", new JSONArray((Collection) listA));
            }
            map.put("details", jSONObject.toString());
            i.this.f9449a.E().d(f2.N0, map);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.f9450b.get() != b.MONITORING) {
                return;
            }
            i.this.f9453e.set(System.currentTimeMillis());
            i.this.f9451c.postDelayed(this, i.this.f9455g);
        }
    }

    public i(l lVar) {
        this.f9449a = lVar;
        this.f9450b = new AtomicReference(!q7.c(lVar) ? b.IDLE : b.INELIGIBLE);
        this.f9451c = new Handler(l.p().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f9452d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        AtomicReference atomicReference = this.f9450b;
        b bVar = b.MONITORING;
        b bVar2 = b.IDLE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                this.f9449a.h().b(this);
            }
        }
        this.f9451c.removeCallbacksAndMessages(null);
        this.f9452d.removeCallbacksAndMessages(null);
        this.f9449a.h().b(this);
    }

    private void c() {
        if (((Boolean) this.f9449a.a(z4.f10196l6)).booleanValue() && this.f9449a.o0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        AtomicReference atomicReference = this.f9450b;
        b bVar = b.IDLE;
        b bVar2 = b.MONITORING;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                this.f9449a.h().a(this);
            }
        }
        this.f9451c.post(new d());
        this.f9452d.postDelayed(new c(), this.f9456h / 2);
        this.f9449a.h().a(this);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f9454f = ((Long) this.f9449a.a(z4.f10170i6)).longValue();
        this.f9455g = ((Long) this.f9449a.a(z4.f10179j6)).longValue();
        this.f9456h = ((Long) this.f9449a.a(z4.f10188k6)).longValue();
        if (((Boolean) this.f9449a.a(z4.f10196l6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f9450b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f9449a.a(z4.f10162h6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}

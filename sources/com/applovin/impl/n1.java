package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f8820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f8821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f8822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8823e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a();

        void b();
    }

    public n1(com.applovin.impl.sdk.l lVar, a aVar) {
        this.f8819a = lVar;
        h0 h0Var = new h0();
        this.f8820b = h0Var;
        this.f8821c = h0Var.a(1);
        this.f8822d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f8819a.p0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f8820b.b(this);
        this.f8820b.b(this, this.f8821c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f8819a.Q());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f8820b.b(this);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8820b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f8823e;
            float f11 = (fMax * 0.5f) + (f10 * 0.5f);
            this.f8823e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f8822d.a();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f8822d.b();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}

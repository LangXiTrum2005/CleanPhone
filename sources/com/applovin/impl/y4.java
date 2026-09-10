package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f10070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f10071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f10072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f10073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f10074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f10075h;

    public y4(com.applovin.impl.sdk.l lVar) {
        this.f10073f = lVar;
        h0 h0Var = new h0();
        this.f10070c = h0Var;
        this.f10071d = h0Var.a(9);
        this.f10072e = h0Var.a(4);
        this.f10068a = ((Integer) lVar.a(z4.f10210n4)).intValue();
        this.f10069b = ((Float) lVar.a(z4.f10203m4)).floatValue();
    }

    public float a() {
        float[] fArr = this.f10074g;
        return fArr == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) Math.toDegrees(Math.acos(fArr[2] / 9.81f));
    }

    public float b() {
        return this.f10075h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f10073f.p0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f10070c.b(this);
        if (((Boolean) this.f10073f.q0().a(z4.f10186k4)).booleanValue()) {
            this.f10070c.b(this, this.f10071d, (int) TimeUnit.MILLISECONDS.toMicros(this.f10068a), this.f10073f.Q());
        }
        if (((Boolean) this.f10073f.q0().a(z4.f10194l4)).booleanValue()) {
            this.f10070c.b(this, this.f10072e, (int) TimeUnit.MILLISECONDS.toMicros(this.f10068a), this.f10073f.Q());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10070c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f10074g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f10075h * this.f10069b;
            this.f10075h = f10;
            this.f10075h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}

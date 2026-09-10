package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;

/* JADX INFO: loaded from: classes6.dex */
public final class ig implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lg f41096a;

    public ig(lg lgVar) {
        this.f41096a = lgVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f41096a.k.getClass();
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU != null) {
            try {
                if (sensorsDataU.h()) {
                    if (lg.a(this.f41096a, sensorEvent)) {
                        return;
                    }
                    lg lgVar = this.f41096a;
                    if (lgVar.f41219b < lgVar.m) {
                        d2 d2Var = lgVar.f41221e;
                        if (d2Var != null && d2Var.f != lgVar.a()) {
                        }
                        lg.a(this.f41096a, sensorEvent, sensorsDataU);
                        return;
                    }
                    lg lgVar2 = this.f41096a;
                    lgVar2.a(lgVar2.f41219b >= lgVar2.m);
                    return;
                }
            } catch (Throwable th) {
                if (this.f41096a.a(1)) {
                    g9.a(th);
                    return;
                }
                return;
            }
        }
        this.f41096a.a(true);
    }
}

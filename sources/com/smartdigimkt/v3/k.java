package com.smartdigimkt.v3;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f39129a = "ShakeEventListenerImpl";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.smartdigimkt.x4.d f39130b;

    public class a implements com.smartdigimkt.x4.a {
        public a() {
        }

        @Override // com.smartdigimkt.x4.a
        public boolean a() {
            return k.this.a();
        }
    }

    public void a(com.smartdigimkt.w6.g gVar) {
        com.smartdigimkt.x4.f fVar = new com.smartdigimkt.x4.f(gVar);
        if (fVar.e() != 1 || fVar.c() == null || fVar.c().size() <= 0) {
            this.f39130b = new com.smartdigimkt.x4.g();
        } else {
            this.f39130b = new com.smartdigimkt.x4.c();
        }
        fVar.toString();
        this.f39130b.getClass();
        this.f39130b.a(new com.smartdigimkt.x4.f(gVar));
        this.f39130b.a(new a());
    }

    public abstract boolean a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        com.smartdigimkt.x4.d dVar = this.f39130b;
        if (dVar != null) {
            dVar.a(sensorEvent);
        }
    }
}

package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class fg implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f40975a;

    public fg(hg hgVar) {
        this.f40975a = hgVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        JSONArray jSONArrayA;
        int iA = this.f40975a.f41060b.a(sensorEvent);
        hg hgVar = this.f40975a;
        if (iA == hgVar.f41062e) {
            hgVar.b();
            hg hgVar2 = this.f40975a;
            x1 x1Var = hgVar2.d;
            if (x1Var != null) {
                try {
                    jSONArrayA = hgVar2.f41060b.a();
                } catch (Exception unused) {
                    jSONArrayA = null;
                }
                x1Var.a(jSONArrayA);
            }
        }
    }
}

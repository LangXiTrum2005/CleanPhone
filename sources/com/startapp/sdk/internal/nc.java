package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes6.dex */
public final class nc implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc f41270a;

    public nc(pc pcVar) {
        this.f41270a = pcVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            pc pcVar = this.f41270a;
            qc qcVar = pcVar.d;
            if (qcVar == null || qcVar.a(sensorEvent) || !pcVar.a(8)) {
                return;
            }
            int i2 = pcVar.f;
            if ((i2 & 8) != 0) {
                return;
            }
            pcVar.f = i2 | 8;
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "MP";
            g9Var.f41002e = String.valueOf(8);
            g9Var.a();
        } catch (OutOfMemoryError unused) {
            pc pcVar2 = this.f41270a;
            pcVar2.getClass();
            try {
                pcVar2.d();
            } catch (Throwable th) {
                g9.a(th);
            }
        } catch (Throwable th2) {
            pc pcVar3 = this.f41270a;
            if (pcVar3.a(16)) {
                int i3 = pcVar3.f;
                if ((i3 & 16) != 0) {
                    return;
                }
                pcVar3.f = 16 | i3;
                g9.a(th2);
            }
        }
    }
}

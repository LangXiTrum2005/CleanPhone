package com.thinkup.core.common.inner.m;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.thinkup.core.common.inner.n.om;
import com.thinkup.core.common.inner.n.oo;
import com.thinkup.core.common.on.oon;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n implements SensorEventListener {
    com.thinkup.core.common.inner.n.n m;
    final String o = "ShakeEventListenerImpl";

    public final void o(oon oonVar) {
        com.thinkup.core.common.inner.n.o0 o0Var = new com.thinkup.core.common.inner.n.o0(oonVar);
        if (o0Var.o() != 1 || o0Var.n() == null || o0Var.n().size() <= 0) {
            this.m = new oo();
        } else {
            this.m = new com.thinkup.core.common.inner.n.m();
        }
        o0Var.toString();
        this.m.getClass();
        this.m.o(new com.thinkup.core.common.inner.n.o0(oonVar));
        this.m.o(new om() { // from class: com.thinkup.core.common.inner.m.n.1
            @Override // com.thinkup.core.common.inner.n.om
            public final boolean o() {
                return n.this.o();
            }
        });
    }

    public abstract boolean o();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        com.thinkup.core.common.inner.n.n nVar = this.m;
        if (nVar != null) {
            nVar.m(sensorEvent);
        }
    }
}

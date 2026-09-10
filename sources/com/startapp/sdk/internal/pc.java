package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import com.startapp.motiondetector.AmortizedMaximum;
import com.startapp.motiondetector.Utils;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class pc {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f41361i = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf f41363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f41364c;
    public qc d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41365e;
    public int f;
    public Sensor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nc f41366h = new nc(this);

    public pc(Context context, vf vfVar, q4 q4Var, Handler handler) {
        this.f41362a = context;
        this.f41363b = vfVar;
        this.f41364c = handler;
    }

    public final boolean a(int i2) {
        if (this.f41365e) {
            MotionMetadata motionMetadataJ = MetaData.E().J();
            if (motionMetadataJ == null || !motionMetadataJ.u()) {
                motionMetadataJ = null;
            }
            if (motionMetadataJ != null && (i2 & motionMetadataJ.j()) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.d != null) {
            uf ufVarEdit = this.f41363b.edit();
            float fLongBitsToDouble = (float) Double.longBitsToDouble(this.d.d.get());
            ufVarEdit.a("e9142de3c7cc5952", Float.valueOf(fLongBitsToDouble));
            ufVarEdit.f41545a.putFloat("e9142de3c7cc5952", fLongBitsToDouble);
            long j = this.d.f41404e.get();
            ufVarEdit.a("7783513af1730383", Long.valueOf(j));
            ufVarEdit.f41545a.putLong("7783513af1730383", j);
            ufVarEdit.apply();
            if (a(4)) {
                g9 g9Var = new g9(h9.d);
                g9Var.d = "MP.save";
                g9Var.f41002e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                g9Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata motionMetadataJ = MetaData.E().J();
        MotionMetadata motionMetadata = (motionMetadataJ == null || !motionMetadataJ.u()) ? null : motionMetadataJ;
        if (motionMetadata == null || (sensorManager = (SensorManager) this.f41362a.getSystemService("sensor")) == null || this.g != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        int iMin = Math.min(Math.max(10000, (int) (vi.e(motionMetadata.r()) * 1000)), 100000);
        if (defaultSensor == null || !sensorManager.registerListener(this.f41366h, defaultSensor, iMin)) {
            return;
        }
        this.g = defaultSensor;
        double d = this.f41363b.getFloat("e9142de3c7cc5952", 0.0f);
        long j = this.f41363b.getLong("7783513af1730383", 0L);
        qc qcVar = this.d;
        if (qcVar != null) {
            qcVar.interrupt();
            this.d = null;
        }
        if (this.d == null) {
            qc qcVar2 = new qc("startapp-mp-" + f41361i.incrementAndGet(), motionMetadata, motionMetadata.q(), d, j);
            this.d = qcVar2;
            qcVar2.start();
        }
        if (a(1)) {
            g9 g9Var = new g9(h9.d);
            g9Var.d = "MP.start";
            g9Var.f41002e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
            g9Var.a();
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f41362a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.g) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f41366h, sensor);
        this.g = null;
        b();
        qc qcVar = this.d;
        if (qcVar != null) {
            qcVar.interrupt();
            this.d = null;
        }
        if (a(2)) {
            g9 g9Var = new g9(h9.d);
            g9Var.d = "MP.stop";
            g9Var.a();
        }
    }

    public final double a() {
        MotionMetadata motionMetadataJ = MetaData.E().J();
        if (motionMetadataJ == null || !motionMetadataJ.u()) {
            motionMetadataJ = null;
        }
        if (motionMetadataJ == null) {
            return -1.0d;
        }
        qc qcVar = this.d;
        if (qcVar != null) {
            return Double.longBitsToDouble(qcVar.f41403c.get());
        }
        return ((double) this.f41363b.getFloat("e9142de3c7cc5952", 0.0f)) * AmortizedMaximum.calcImpact(System.currentTimeMillis(), this.f41363b.getLong("7783513af1730383", 0L), motionMetadataJ.b(), motionMetadataJ.a(), motionMetadataJ.c(), Utils.logisticalFunction(0.0d, motionMetadataJ.a(), motionMetadataJ.c()));
    }
}

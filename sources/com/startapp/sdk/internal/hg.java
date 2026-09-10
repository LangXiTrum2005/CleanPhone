package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f41059a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f41061c;
    public final x1 d;
    public final fg f = new fg(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eg f41060b = new eg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41062e = 0;

    public hg(Context context, x1 x1Var) {
        this.f41059a = null;
        this.f41061c = (SensorManager) context.getSystemService("sensor");
        this.d = x1Var;
        this.f41059a = new HashMap();
        SensorsConfig sensorsConfigT = MetaData.E().T();
        a(13, sensorsConfigT.a());
        a(9, sensorsConfigT.b());
        a(5, sensorsConfigT.d());
        a(10, sensorsConfigT.e());
        a(2, sensorsConfigT.f());
        a(6, sensorsConfigT.g());
        a(12, sensorsConfigT.i());
        a(11, sensorsConfigT.j());
        a(16, sensorsConfigT.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f41059a.keySet()) {
            int iIntValue = num.intValue();
            gg ggVar = (gg) this.f41059a.get(num);
            if (Build.VERSION.SDK_INT >= ggVar.f41015a && (defaultSensor = this.f41061c.getDefaultSensor(iIntValue)) != null) {
                this.f41061c.registerListener(this.f, defaultSensor, ggVar.f41016b);
                this.f41062e++;
            }
        }
    }

    public final void b() {
        this.f41061c.unregisterListener(this.f);
    }

    public final void a(int i2, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f41059a.put(Integer.valueOf(i2), new gg(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}

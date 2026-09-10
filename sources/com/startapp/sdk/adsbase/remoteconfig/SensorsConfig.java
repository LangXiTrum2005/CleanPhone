package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class SensorsConfig implements Serializable {
    private static final long serialVersionUID = -4658637722934999907L;
    private int timeoutInSec = 10;
    private boolean enabled = false;
    private long refreshInterval = 900000;

    @TypeInfo(complex = true)
    private BaseSensorConfig ambientTemperatureSensor = new BaseSensorConfig(14);

    @TypeInfo(complex = true)
    private BaseSensorConfig gravitySensor = new BaseSensorConfig(9);

    @TypeInfo(complex = true)
    private BaseSensorConfig lightSensor = new BaseSensorConfig(3);

    @TypeInfo(complex = true)
    private BaseSensorConfig linearAccelerationSensor = new BaseSensorConfig(9);

    @TypeInfo(complex = true)
    private BaseSensorConfig magneticFieldSensor = new BaseSensorConfig(3);

    @TypeInfo(complex = true)
    private BaseSensorConfig pressureSensor = new BaseSensorConfig(9);

    @TypeInfo(complex = true)
    private BaseSensorConfig relativeHumiditySensor = new BaseSensorConfig(14);

    @TypeInfo(complex = true)
    private BaseSensorConfig rotationVectorSensor = new BaseSensorConfig(9);

    @TypeInfo(complex = true)
    private BaseSensorConfig gyroscopeUncalibratedSensor = new BaseSensorConfig(18);

    public final BaseSensorConfig a() {
        return this.ambientTemperatureSensor;
    }

    public final BaseSensorConfig b() {
        return this.gravitySensor;
    }

    public final BaseSensorConfig c() {
        return this.gyroscopeUncalibratedSensor;
    }

    public final BaseSensorConfig d() {
        return this.lightSensor;
    }

    public final BaseSensorConfig e() {
        return this.linearAccelerationSensor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SensorsConfig sensorsConfig = (SensorsConfig) obj;
            if (this.timeoutInSec == sensorsConfig.timeoutInSec && this.enabled == sensorsConfig.enabled && this.refreshInterval == sensorsConfig.refreshInterval && vi.a((Object) this.ambientTemperatureSensor, (Object) sensorsConfig.ambientTemperatureSensor) && vi.a((Object) this.gravitySensor, (Object) sensorsConfig.gravitySensor) && vi.a((Object) this.lightSensor, (Object) sensorsConfig.lightSensor) && vi.a((Object) this.linearAccelerationSensor, (Object) sensorsConfig.linearAccelerationSensor) && vi.a((Object) this.magneticFieldSensor, (Object) sensorsConfig.magneticFieldSensor) && vi.a((Object) this.pressureSensor, (Object) sensorsConfig.pressureSensor) && vi.a((Object) this.relativeHumiditySensor, (Object) sensorsConfig.relativeHumiditySensor) && vi.a((Object) this.rotationVectorSensor, (Object) sensorsConfig.rotationVectorSensor) && vi.a((Object) this.gyroscopeUncalibratedSensor, (Object) sensorsConfig.gyroscopeUncalibratedSensor)) {
                return true;
            }
        }
        return false;
    }

    public final BaseSensorConfig f() {
        return this.magneticFieldSensor;
    }

    public final BaseSensorConfig g() {
        return this.pressureSensor;
    }

    public final long h() {
        return this.refreshInterval;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Long.valueOf(this.refreshInterval), this.ambientTemperatureSensor, this.gravitySensor, this.lightSensor, this.linearAccelerationSensor, this.magneticFieldSensor, this.pressureSensor, this.relativeHumiditySensor, this.rotationVectorSensor, this.gyroscopeUncalibratedSensor};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final BaseSensorConfig i() {
        return this.relativeHumiditySensor;
    }

    public final BaseSensorConfig j() {
        return this.rotationVectorSensor;
    }

    public final int k() {
        return this.timeoutInSec;
    }

    public final boolean l() {
        return this.enabled;
    }
}

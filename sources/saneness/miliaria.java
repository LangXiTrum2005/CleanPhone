package saneness;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes.dex */
public final class miliaria {
    public static final float attabal(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0] / 9.80665f;
        float f2 = fArr[1] / 9.80665f;
        float f3 = fArr[2] / 9.80665f;
        return (float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f));
    }
}

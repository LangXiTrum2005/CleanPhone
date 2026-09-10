package sg.bigo.ads.common.q;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f47428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f47429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SensorManager f47430c;
    public final List<Integer> f;
    long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float[] f47431e = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f47432h = 1.0E-9f;
    public SensorEventListener g = new SensorEventListener() { // from class: sg.bigo.ads.common.q.b.1
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensorEvent.values.length < 3) {
                return;
            }
            int type = sensor.getType();
            if (type != 4) {
                if (type == 9 || type == 1) {
                    b.this.f47429b.a(type, sensorEvent.values, new float[3]);
                    return;
                }
                return;
            }
            float[] fArr = new float[3];
            b bVar = b.this;
            long j = bVar.d;
            if (j != 0) {
                float f = (sensorEvent.timestamp - j) * 1.0E-9f;
                float[] fArr2 = bVar.f47431e;
                float f2 = fArr2[0];
                float[] fArr3 = sensorEvent.values;
                float f3 = (fArr3[0] * f) + f2;
                fArr2[0] = f3;
                fArr2[1] = (fArr3[1] * f) + fArr2[1];
                fArr2[2] = (fArr3[2] * f) + fArr2[2];
                float fAbs = Math.abs((float) Math.toDegrees(f3));
                float fAbs2 = Math.abs((float) Math.toDegrees(b.this.f47431e[1]));
                float fAbs3 = Math.abs((float) Math.toDegrees(b.this.f47431e[2]));
                fArr[0] = fAbs;
                fArr[1] = fAbs2;
                fArr[2] = fAbs3;
            }
            b bVar2 = b.this;
            bVar2.d = sensorEvent.timestamp;
            bVar2.f47429b.a(type, sensorEvent.values, fArr);
        }
    };

    public b(Context context, List<Integer> list, a aVar) {
        this.f47428a = new WeakReference<>(context);
        this.f = list;
        this.f47429b = aVar;
    }
}

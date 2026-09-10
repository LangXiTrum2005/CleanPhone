package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f33406a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f33407b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f33408c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f33411i;
    private Sensor d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f33409e = null;
    private Sensor f = null;
    private volatile boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f33410h = false;
    private AtomicReference<a> j = new AtomicReference<>();
    private long k = 999999;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f33412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f33413b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f33414c = null;
        public float[] d = null;

        public a(long j) {
            this.f33412a = j;
        }
    }

    private ak(Context context) {
        this.f33411i = context;
    }

    public static ak a(Context context) {
        if (f33408c == null) {
            synchronized (ak.class) {
                try {
                    if (f33408c == null) {
                        f33408c = new ak(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (f33407b) {
            f33408c.c();
        }
        return f33408c;
    }

    private void c() {
        if (this.f33410h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f33411i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.d = sensorManager.getDefaultSensor(1);
                this.f33409e = sensorManager.getDefaultSensor(2);
                this.f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f33410h = true;
    }

    private void e() {
        this.k = -1L;
        this.g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f33411i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.j.get();
        if (!f33407b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i2 = 0;
        do {
            if ((this.d == null || aVar.f33413b != null) && ((this.f33409e == null || aVar.f33414c != null) && (this.f == null || aVar.d != null))) {
                break;
            }
            az.a(50L);
            i2++;
        } while (i2 <= 20);
        e();
        this.g = false;
        a(objArr, aVar);
        this.j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f33411i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.d, 2);
                    Sensor sensor = this.f33409e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.k = jCurrentTimeMillis;
                        this.j.set(new a(jCurrentTimeMillis));
                        this.g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f33413b == null) {
                aVar.f33413b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f33414c == null) {
                aVar.f33414c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.d == null) {
            aVar.d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f33406a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        float[] fArr = aVar.f33413b;
        if (fArr != null) {
            float[] fArr2 = aVar.f33414c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f33413b;
        } else {
            objArr[0] = Float.valueOf(999999.0f);
            objArr[1] = Float.valueOf(999999.0f);
            objArr[2] = Float.valueOf(999999.0f);
            objArr[4] = f33406a;
        }
        objArr[3] = Long.valueOf(aVar.f33412a);
        float[] fArr3 = aVar.d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f33406a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float[] fArr4 = new float[3];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, fArr4);
        return new float[]{(((float) Math.toDegrees(fArr4[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt((f3 * f3) + ((f2 * f2) + (f * f))));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f2 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f * fSqrt), f3 * fSqrt))) + 360.0f) % 360.0f};
    }

    public void a() {
        if (!f33407b || this.g) {
            return;
        }
        d();
    }
}

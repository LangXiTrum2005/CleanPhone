package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4370q40 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseActivity f4867a;
    public final long b;
    public final InterfaceC2714Qw c;
    public int d;
    public final double e;
    public final int f;
    public final InterfaceC3069bH g;
    public Sensor h;
    public Sensor i;
    public long j;
    public long k;
    public final double l;
    public final double m;
    public final double n;
    public final int o;
    public final double p;
    public EnumC4018m40 q;
    public final double r;
    public double s;
    public double t;
    public double u;
    public boolean v;

    public C4370q40(WeaponUseActivity weaponUseActivity, long j, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(weaponUseActivity, com.umeng.analytics.pro.f.X);
        this.f4867a = weaponUseActivity;
        this.b = j;
        this.c = interfaceC2714Qw;
        this.d = 50;
        this.e = 3.0d;
        this.f = 50;
        this.g = AbstractC2340Cl.H(EnumC4124nH.c, new X9(this, 6));
        this.l = 0.5d;
        this.m = -0.5d;
        this.n = 9.0d;
        this.o = 3;
        this.p = 0.05d;
        this.q = EnumC4018m40.b;
        this.r = 0.7d;
    }

    public final void a() {
        Sensor sensor = this.h;
        InterfaceC3069bH interfaceC3069bH = this.g;
        if (sensor == null) {
            this.h = ((SensorManager) interfaceC3069bH.getValue()).getDefaultSensor(4);
        }
        if (this.i == null) {
            this.i = ((SensorManager) interfaceC3069bH.getValue()).getDefaultSensor(1);
        }
        ((SensorManager) interfaceC3069bH.getValue()).registerListener(this, this.h, 1);
        ((SensorManager) interfaceC3069bH.getValue()).registerListener(this, this.i, 1);
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C4106n40(this, null), 2);
    }

    public final void b() {
        if (System.currentTimeMillis() - this.k < this.b) {
            return;
        }
        C2498In c2498In = App.n;
        WD.D(C2498In.g(), AbstractC4437qp.b, 0, new C4282p40(this, null), 2);
    }

    public final void c(int i) {
        this.d = AbstractC3375el.p(i, 100);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        AbstractC2995aW.q(sensor, com.umeng.analytics.pro.bc.ac);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC2995aW.q(sensorEvent, NotificationCompat.CATEGORY_EVENT);
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            double d = f3;
            if (d > this.l) {
                this.q = EnumC4018m40.f4678a;
            } else if (d < this.m) {
                this.q = EnumC4018m40.b;
            } else {
                double dAbs = Math.abs(f);
                double d2 = this.n;
                if ((dAbs > d2 || Math.abs(f2) > d2) && Math.abs(f3) < this.o) {
                    this.q = EnumC4018m40.c;
                }
            }
            this.v = Math.abs(f2) > 4.0f;
            return;
        }
        if (type != 4) {
            return;
        }
        float[] fArr2 = sensorEvent.values;
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = fArr2[2];
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.j < this.f) {
            return;
        }
        this.j = jCurrentTimeMillis;
        double d3 = this.s;
        double d4 = this.r;
        double d5 = 1;
        double d6 = d5 - d4;
        double d7 = (((double) f4) * d6) + (d3 * d4);
        this.s = d7;
        double d8 = (((double) f5) * d6) + (this.t * d4);
        this.t = d8;
        double d9 = (d6 * ((double) f6)) + (d4 * this.u);
        this.u = d9;
        double dSqrt = Math.sqrt((d9 * d9) + (d8 * d8) + (d7 * d7));
        double d10 = d5 - (((double) this.d) / 100.0d);
        double d11 = this.e;
        if (dSqrt >= d10 * d11 && !this.v) {
            int iOrdinal = this.q.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                if (Math.abs(f6) <= (d5 - (((double) this.d) / 100.0d)) * d11 * 2.5d || Math.abs(f5) >= 7.0f || Math.abs(f6) <= 2.5d) {
                    return;
                }
                b();
                return;
            }
            if (iOrdinal == 2 && Math.abs(f4) > (d5 - (((double) this.d) / 100.0d)) * d11 * 0.8d && Math.abs(f5) < this.p) {
                b();
            }
        }
    }
}

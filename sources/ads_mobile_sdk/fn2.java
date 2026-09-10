package ads_mobile_sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.astrogate;
import saneness.miliaria;
import saneness.sewage;

/* JADX INFO: loaded from: classes.dex */
public final class fn2 extends sewage {
    public final Context a;
    public final jk0 b;
    public final amphitheatre c;
    public final saran d;
    public SensorManager e;
    public Sensor f;
    public long g;
    public int h;
    public astrogate i;
    public boolean j;

    public fn2(Context context, jk0 flags, amphitheatre clock, saran backgroundScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.a = context;
        this.b = flags;
        this.c = clock;
        this.d = backgroundScope;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.g = p002kotlin.time.dern.molybdenite(0, DurationUnit.MILLISECONDS);
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.j) {
                    SensorManager sensorManager = this.e;
                    if (sensorManager == null) {
                        Intrinsics.preprohormone("sensorManager");
                        sensorManager = null;
                    }
                    Sensor sensor = this.f;
                    if (sensor == null) {
                        Intrinsics.preprohormone("accelerometer");
                        sensor = null;
                    }
                    sensorManager.unregisterListener(this, sensor);
                    kn0.b("Stopped listening for shake gestures.", null);
                    this.j = false;
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                jk0 jk0Var = this.b;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:inspector:shake_enabled", X3.i.W);
                if (((Boolean) jk0Var.a("gads:inspector:shake_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                    SensorManager sensorManager = (SensorManager) this.a.getSystemService(SensorManager.class);
                    Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
                    if (!this.j && sensorManager != null && defaultSensor != null) {
                        this.e = sensorManager;
                        this.f = defaultSensor;
                        jk0 jk0Var2 = this.b;
                        jk0Var2.getClass();
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                        long jMolybdenite = p002kotlin.time.dern.molybdenite(500, durationUnit);
                        Intrinsics.checkNotNullParameter("gads:inspector:shake_interval", X3.i.W);
                        p002kotlin.time.saneness sanenessVarCutely = p002kotlin.time.saneness.cutely(jMolybdenite);
                        tk tkVar = zk.j;
                        sensorManager.registerListener(this, defaultSensor, 3, ((int) p002kotlin.time.saneness.graveside(((p002kotlin.time.saneness) jk0Var2.a("gads:inspector:shake_interval", sanenessVarCutely, tkVar)).getRawValue())) / 10);
                        this.c.getClass();
                        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), durationUnit);
                        jk0 jk0Var3 = this.b;
                        jk0Var3.getClass();
                        long jMolybdenite2 = p002kotlin.time.dern.molybdenite(500, durationUnit);
                        Intrinsics.checkNotNullParameter("gads:inspector:shake_interval", X3.i.W);
                        this.g = p002kotlin.time.saneness.merc(jGraveside, ((p002kotlin.time.saneness) jk0Var3.a("gads:inspector:shake_interval", p002kotlin.time.saneness.cutely(jMolybdenite2), tkVar)).getRawValue());
                        this.j = true;
                        kn0.b("Listening for shake gestures.", null);
                    }
                    Unit unit = Unit.f29295attabal;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // saneness.sewage
    public final void a(Sensor sensor) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // saneness.sewage
    public final void a(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        jk0 jk0Var = this.b;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:inspector:shake_enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:inspector:shake_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            float fAttabal = miliaria.attabal(event);
            jk0 jk0Var2 = this.b;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:inspector:shake_strength", X3.i.W);
            if (fAttabal < ((Number) jk0Var2.a("gads:inspector:shake_strength", Float.valueOf(2.0f), zk.e)).floatValue()) {
                return;
            }
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            long jGraveside = p002kotlin.time.dern.graveside(jElapsedRealtime, durationUnit);
            long j = this.g;
            jk0 jk0Var3 = this.b;
            jk0Var3.getClass();
            long jMolybdenite = p002kotlin.time.dern.molybdenite(500, durationUnit);
            Intrinsics.checkNotNullParameter("gads:inspector:shake_interval", X3.i.W);
            p002kotlin.time.saneness sanenessVarCutely = p002kotlin.time.saneness.cutely(jMolybdenite);
            tk tkVar = zk.j;
            if (p002kotlin.time.saneness.formularize(jGraveside, p002kotlin.time.saneness.polder(j, ((p002kotlin.time.saneness) jk0Var3.a("gads:inspector:shake_interval", sanenessVarCutely, tkVar)).getRawValue())) < 0) {
                return;
            }
            long j2 = this.g;
            jk0 jk0Var4 = this.b;
            jk0Var4.getClass();
            long jMolybdenite2 = p002kotlin.time.dern.molybdenite(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, durationUnit);
            Intrinsics.checkNotNullParameter("gads:inspector:shake_reset_time_ms", X3.i.W);
            if (p002kotlin.time.saneness.formularize(jGraveside, p002kotlin.time.saneness.polder(j2, ((p002kotlin.time.saneness) jk0Var4.a("gads:inspector:shake_reset_time_ms", p002kotlin.time.saneness.cutely(jMolybdenite2), tkVar)).getRawValue())) > 0) {
                this.h = 0;
            }
            kn0.b("Shake detected.", null);
            this.g = jGraveside;
            this.h++;
            saran saranVar = this.d;
            en2 block = new en2(this, null);
            EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
            Intrinsics.checkNotNullParameter(saranVar, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        }
    }
}

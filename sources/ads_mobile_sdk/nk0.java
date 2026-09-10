package ads_mobile_sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;
import saneness.sewage;
import saneness.telepherique;

/* JADX INFO: loaded from: classes.dex */
public final class nk0 extends sewage {
    public final Context a;
    public final jk0 b;
    public final amphitheatre c;
    public final saran d;
    public SensorManager e;
    public Sensor f;
    public float g;
    public float h;
    public long i;
    public int j;
    public boolean k;
    public boolean l;
    public telepherique m;
    public boolean n;

    public nk0(Context context, jk0 flags, amphitheatre clock, saran backgroundScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.a = context;
        this.b = flags;
        this.c = clock;
        this.d = backgroundScope;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        clock.getClass();
        this.i = p002kotlin.time.dern.graveside(amphitheatre.b(), DurationUnit.MILLISECONDS);
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.n) {
                    SensorManager sensorManager = this.e;
                    if (sensorManager == null) {
                        Intrinsics.preprohormone("sensorManager");
                        sensorManager = null;
                    }
                    Sensor sensor = this.f;
                    if (sensor == null) {
                        Intrinsics.preprohormone("gyroscope");
                        sensor = null;
                    }
                    sensorManager.unregisterListener(this, sensor);
                    this.n = false;
                    kn0.b("Stopped listening for flick gestures.", null);
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
                Intrinsics.checkNotNullParameter("gads:inspector:flick_enabled", X3.i.W);
                if (((Boolean) jk0Var.a("gads:inspector:flick_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                    SensorManager sensorManager = (SensorManager) this.a.getSystemService(SensorManager.class);
                    Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
                    if (!this.n && sensorManager != null && defaultSensor != null) {
                        this.e = sensorManager;
                        this.f = defaultSensor;
                        jk0 jk0Var2 = this.b;
                        jk0Var2.getClass();
                        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                        long jMolybdenite = p002kotlin.time.dern.molybdenite(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, DurationUnit.MILLISECONDS);
                        Intrinsics.checkNotNullParameter("gads:inspector:flick_reset_time_ms", X3.i.W);
                        sensorManager.registerListener(this, defaultSensor, 3, ((int) p002kotlin.time.saneness.graveside(((p002kotlin.time.saneness) jk0Var2.a("gads:inspector:flick_reset_time_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue())) / 100);
                        this.n = true;
                        kn0.b("Listening for flick gestures.", null);
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
        Float fValueOf = Float.valueOf(45.0f);
        Intrinsics.checkNotNullParameter(event, "event");
        jk0 jk0Var = this.b;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:inspector:flick_enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:inspector:flick_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            this.c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            long jGraveside = p002kotlin.time.dern.graveside(jElapsedRealtime, durationUnit);
            long j = this.i;
            jk0 jk0Var2 = this.b;
            jk0Var2.getClass();
            long jMolybdenite = p002kotlin.time.dern.molybdenite(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, durationUnit);
            Intrinsics.checkNotNullParameter("gads:inspector:flick_reset_time_ms", X3.i.W);
            if (p002kotlin.time.saneness.formularize(jGraveside, p002kotlin.time.saneness.polder(j, ((p002kotlin.time.saneness) jk0Var2.a("gads:inspector:flick_reset_time_ms", p002kotlin.time.saneness.cutely(jMolybdenite), zk.j)).getRawValue())) > 0) {
                this.j = 0;
                this.i = jGraveside;
                this.k = false;
                this.l = false;
                this.g = this.h;
            }
            float f = this.h + (event.values[1] * 4);
            this.h = f;
            float f2 = this.g;
            jk0 jk0Var3 = this.b;
            jk0Var3.getClass();
            Intrinsics.checkNotNullParameter("gads:inspector:flick_rotation_threshold", X3.i.W);
            nk nkVar = zk.e;
            if (f > ((Number) jk0Var3.a("gads:inspector:flick_rotation_threshold", fValueOf, nkVar)).floatValue() + f2) {
                this.g = this.h;
                this.l = true;
            } else {
                float f3 = this.h;
                float f4 = this.g;
                jk0 jk0Var4 = this.b;
                jk0Var4.getClass();
                Intrinsics.checkNotNullParameter("gads:inspector:flick_rotation_threshold", X3.i.W);
                if (f3 < f4 - ((Number) jk0Var4.a("gads:inspector:flick_rotation_threshold", fValueOf, nkVar)).floatValue()) {
                    this.g = this.h;
                    this.k = true;
                }
            }
            if (Float.isInfinite(this.h)) {
                this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.k && this.l) {
                kn0.b("Flick detected.", null);
                this.i = jGraveside;
                this.j++;
                this.k = false;
                this.l = false;
                saran saranVar = this.d;
                mk0 block = new mk0(this, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            }
        }
    }
}

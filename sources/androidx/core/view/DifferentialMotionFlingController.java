package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DifferentialMotionFlingController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DifferentialMotionFlingTarget f4436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VelocityTracker f4437c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4438e = -1;
    public int f = -1;
    public int g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f4439h = {Integer.MAX_VALUE, 0};

    public interface DifferentialVelocityProvider {
    }

    public interface FlingVelocityThresholdCalculator {
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this.f4435a = context;
        this.f4436b = differentialMotionFlingTarget;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    public final void a(MotionEvent motionEvent, int i2) {
        int i3;
        int i4;
        int i5;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        float f;
        float yVelocity;
        long j;
        float fSqrt;
        float f2;
        int i6;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i7 = this.f;
        int[] iArr = this.f4439h;
        if (i7 == source && this.g == deviceId && this.f4438e == i2) {
            z2 = false;
            i3 = 1;
            i4 = 20;
            i5 = 0;
        } else {
            Context context = this.f4435a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i3 = 1;
            int source2 = motionEvent.getSource();
            i4 = 20;
            int i8 = Build.VERSION.SDK_INT;
            i5 = 0;
            if (i8 >= 34) {
                Method method = ViewConfigurationCompat.f4480a;
                scaledMinimumFlingVelocity = ViewConfigurationCompat.Api34Impl.b(viewConfiguration, deviceId2, i2, source2);
            } else {
                Method method2 = ViewConfigurationCompat.f4480a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if ((device == null || device.getMotionRange(i2, source2) == null) ? false : true) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                } else {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i8 >= 34) {
                scaledMaximumFlingVelocity = ViewConfigurationCompat.Api34Impl.a(viewConfiguration, deviceId3, i2, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i2, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f = source;
            this.g = deviceId;
            this.f4438e = i2;
            z2 = true;
        }
        if (iArr[i5] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f4437c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4437c = null;
                return;
            }
            return;
        }
        if (this.f4437c == null) {
            this.f4437c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f4437c;
        Map map = VelocityTrackerCompat.f4461a;
        velocityTracker2.addMovement(motionEvent);
        float f3 = 0.0f;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = VelocityTrackerCompat.f4461a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new VelocityTrackerFallback());
            }
            VelocityTrackerFallback velocityTrackerFallback = (VelocityTrackerFallback) map2.get(velocityTracker2);
            velocityTrackerFallback.getClass();
            long eventTime = motionEvent.getEventTime();
            int i9 = velocityTrackerFallback.d;
            long[] jArr = velocityTrackerFallback.f4463b;
            if (i9 != 0 && eventTime - jArr[velocityTrackerFallback.f4465e] > 40) {
                velocityTrackerFallback.d = i5;
                velocityTrackerFallback.f4464c = 0.0f;
            }
            int i10 = (velocityTrackerFallback.f4465e + 1) % 20;
            velocityTrackerFallback.f4465e = i10;
            int i11 = velocityTrackerFallback.d;
            if (i11 != i4) {
                velocityTrackerFallback.d = i11 + 1;
            }
            velocityTrackerFallback.f4462a[i10] = motionEvent.getAxisValue(26);
            jArr[velocityTrackerFallback.f4465e] = eventTime;
        }
        int i12 = 1000;
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        VelocityTrackerFallback velocityTrackerFallback2 = (VelocityTrackerFallback) VelocityTrackerCompat.f4461a.get(velocityTracker2);
        if (velocityTrackerFallback2 != null) {
            int i13 = velocityTrackerFallback2.d;
            if (i13 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i14 = velocityTrackerFallback2.f4465e;
                int i15 = ((i14 + 20) - (i13 - 1)) % 20;
                long[] jArr2 = velocityTrackerFallback2.f4463b;
                long j2 = jArr2[i14];
                while (true) {
                    j = jArr2[i15];
                    if (j2 - j <= 100) {
                        break;
                    }
                    velocityTrackerFallback2.d--;
                    i15 = (i15 + 1) % 20;
                }
                int i16 = velocityTrackerFallback2.d;
                if (i16 < 2) {
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else {
                    float[] fArr = velocityTrackerFallback2.f4462a;
                    if (i16 == 2) {
                        int i17 = (i15 + 1) % 20;
                        long j3 = jArr2[i17];
                        if (j == j3) {
                            fSqrt = 0.0f;
                            f = 0.0f;
                        } else {
                            fSqrt = fArr[i17] / (j3 - j);
                            f = 0.0f;
                        }
                    } else {
                        float fAbs = 0.0f;
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            if (i18 >= velocityTrackerFallback2.d - 1) {
                                break;
                            }
                            int i20 = i18 + i15;
                            long j4 = jArr2[i20 % 20];
                            int i21 = (i20 + 1) % 20;
                            if (jArr2[i21] == j4) {
                                f2 = f3;
                                i6 = i3;
                            } else {
                                i19++;
                                f2 = f3;
                                float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                                float f4 = fArr[i21] / (jArr2[i21] - j4);
                                fAbs += Math.abs(f4) * (f4 - fSqrt2);
                                i6 = i3;
                                if (i19 == i6) {
                                    fAbs *= 0.5f;
                                }
                            }
                            i18 += i6;
                            i3 = i6;
                            f3 = f2;
                        }
                        f = f3;
                        fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                        i12 = 1000;
                    }
                }
            }
            float f5 = fSqrt * i12;
            velocityTrackerFallback2.f4464c = f5;
            if (f5 < (-Math.abs((float) r4))) {
                velocityTrackerFallback2.f4464c = -Math.abs(Float.MAX_VALUE);
            } else if (velocityTrackerFallback2.f4464c > Math.abs((float) r4)) {
                velocityTrackerFallback2.f4464c = Math.abs((float) r4);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = VelocityTrackerCompat.Api34Impl.a(velocityTracker2, i2);
        } else if (i2 == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i2 == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            VelocityTrackerFallback velocityTrackerFallback3 = (VelocityTrackerFallback) VelocityTrackerCompat.f4461a.get(velocityTracker2);
            yVelocity = (velocityTrackerFallback3 == null || i2 != 26) ? f : velocityTrackerFallback3.f4464c;
        }
        DifferentialMotionFlingTarget differentialMotionFlingTarget = this.f4436b;
        float fB = differentialMotionFlingTarget.b() * yVelocity;
        float fSignum = Math.signum(fB);
        if (z2 || (fSignum != Math.signum(this.d) && fSignum != f)) {
            differentialMotionFlingTarget.c();
        }
        if (Math.abs(fB) < iArr[0]) {
            return;
        }
        int i22 = iArr[1];
        float fMax = Math.max(-i22, Math.min(fB, i22));
        this.d = differentialMotionFlingTarget.a(fMax) ? fMax : f;
    }
}

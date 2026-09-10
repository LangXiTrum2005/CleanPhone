package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.badlogic.gdx.Input;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewInfo;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class VC implements InterfaceC5110ya {
    public static volatile VC e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3864a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VC(int i) {
        this(10, 4);
        if (i == 4) {
        } else {
            this.f3864a = -1;
            this.b = -2;
        }
    }

    public final synchronized void a(long j, Object obj) {
        int i = this.b;
        if (i > 0) {
            if (j <= ((long[]) this.c)[((this.f3864a + i) - 1) % ((Object[]) this.d).length]) {
                b();
            }
        }
        c();
        int i2 = this.f3864a;
        int i3 = this.b;
        Object obj2 = this.d;
        int length = (i2 + i3) % ((Object[]) obj2).length;
        ((long[]) this.c)[length] = j;
        ((Object[]) obj2)[length] = obj;
        this.b = i3 + 1;
    }

    public final synchronized void b() {
        this.f3864a = 0;
        this.b = 0;
        Arrays.fill((Object[]) this.d, (Object) null);
    }

    public final void c() {
        int length = ((Object[]) this.d).length;
        if (this.b < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f3864a;
        int i3 = length - i2;
        System.arraycopy((long[]) this.c, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.d, this.f3864a, objArr, 0, i3);
        int i4 = this.f3864a;
        if (i4 > 0) {
            System.arraycopy((long[]) this.c, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.d, 0, objArr, i3, this.f3864a);
        }
        this.c = jArr;
        this.d = objArr;
        this.f3864a = 0;
    }

    public final Object d(long j, boolean z) {
        Object objF = null;
        long j2 = Long.MAX_VALUE;
        while (this.b > 0) {
            long j3 = j - ((long[]) this.c)[this.f3864a];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objF = f();
            j2 = j3;
        }
        return objF;
    }

    public final synchronized Object e(long j) {
        return d(j, true);
    }

    public final Object f() {
        FW.s(this.b > 0);
        Object obj = this.d;
        int i = this.f3864a;
        Object obj2 = ((Object[]) obj)[i];
        ((Object[]) obj)[i] = null;
        this.f3864a = (i + 1) % ((Object[]) obj).length;
        this.b--;
        return obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5110ya
    public final C5022xa g(InterfaceC4265ot interfaceC4265ot, long j) {
        long position = interfaceC4265ot.getPosition();
        int iMin = (int) Math.min(this.b, interfaceC4265ot.getLength() - position);
        ((JT) this.d).B(iMin);
        interfaceC4265ot.peekFully(((JT) this.d).f3266a, 0, iMin);
        JT jt = (JT) this.d;
        int i = jt.c;
        long j2 = -1;
        long j3 = -1;
        long j4 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        while (jt.a() >= 188) {
            byte[] bArr = jt.f3266a;
            int i2 = jt.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + Input.Keys.F18;
            if (i3 > i) {
                break;
            }
            long jI0 = AbstractC2995aW.i0(i2, this.f3864a, jt);
            if (jI0 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                long jB = ((Mc0) this.c).b(jI0);
                if (jB > j) {
                    return j4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? new C5022xa(-1, jB, position) : new C5022xa(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, position + j3);
                }
                if (100000 + jB > j) {
                    return new C5022xa(0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, position + ((long) i2));
                }
                j4 = jB;
                j3 = i2;
            }
            jt.E(i3);
            j2 = i3;
        }
        return j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? new C5022xa(-2, j4, position + j2) : C5022xa.d;
    }

    public final void h(final Activity activity, final C4052mX c4052mX) {
        Task task;
        int i = 0;
        if (activity == null) {
            byte[] bArr = {10, com.umeng.analytics.pro.cw.m, -88, 59, -101, 25, -50, -83, 75, 5, -81, 114, -125, 5, -42, -72};
            byte[] bArr2 = {107, 108, -36, 82, -19, 112, -70, -44};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 16) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            c4052mX.a();
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        com.google.android.play.core.review.b bVar = new com.google.android.play.core.review.b(new up0(applicationContext));
        this.c = bVar;
        up0 up0Var = bVar.f839a;
        B4 b4 = up0.c;
        b4.c("requestInAppReview (%s)", up0Var.b);
        int i4 = 2;
        if (up0Var.f5105a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                B4.d(b4.f2852a, "Play Store app is either not installed or not the official version", objArr);
            }
            Locale locale = Locale.getDefault();
            Object[] objArr2 = new Object[2];
            objArr2[0] = -1;
            HashMap map = Zo0.f4093a;
            objArr2[1] = !map.containsKey(-1) ? "" : AbstractC3888ke0.j((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) Zo0.b.get(-1), ")");
            task = Tasks.forException(new TZ(new Status(-1, String.format(locale, "Review Error(%d): %s", objArr2))));
        } else {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            final Cp0 cp0 = up0Var.f5105a;
            zp0 zp0Var = new zp0(up0Var, taskCompletionSource, taskCompletionSource, i4);
            synchronized (cp0.f) {
                cp0.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xp0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        Cp0 cp1 = cp0;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (cp1.f) {
                            cp1.e.remove(taskCompletionSource2);
                        }
                    }
                });
            }
            synchronized (cp0.f) {
                try {
                    if (cp0.k.getAndIncrement() > 0) {
                        B4 b5 = cp0.b;
                        Object[] objArr3 = new Object[0];
                        if (Log.isLoggable("PlayCore", 3)) {
                            B4.d(b5.f2852a, "Already connected to the service.", objArr3);
                        } else {
                            b5.getClass();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            cp0.a().post(new zp0(cp0, taskCompletionSource, zp0Var, i));
            task = taskCompletionSource.getTask();
        }
        task.addOnCompleteListener(new OnCompleteListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UC
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                VC vc = this.f3815a;
                vc.getClass();
                boolean zIsSuccessful = task2.isSuccessful();
                C4052mX c4052mX2 = c4052mX;
                if (!zIsSuccessful) {
                    byte[] bArr3 = {110, 62, -72, 11, -119, 23, -48, -57, 126, 34, -95, 10, -108};
                    byte[] bArr4 = {27, 80, -45, 101, -26, 96, -66, -25};
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < 13) {
                        if (i6 >= 8) {
                            i6 = 0;
                        }
                        bArr3[i5] = (byte) (bArr3[i5] ^ bArr4[i6]);
                        i5++;
                        i6++;
                    }
                    new String(bArr3, StandardCharsets.UTF_8);
                    if (task2.getException() instanceof TZ) {
                        ((TZ) task2.getException()).a();
                        ((TZ) task2.getException()).getMessage();
                    }
                    if (c4052mX2 != null) {
                        c4052mX2.a();
                        return;
                    }
                    return;
                }
                ReviewInfo reviewInfo = (ReviewInfo) task2.getResult();
                vc.d = reviewInfo;
                if (reviewInfo != null) {
                    ((com.google.android.play.core.review.b) vc.c).a(activity, reviewInfo).addOnCompleteListener(new C2503Is(c4052mX2, 3));
                    return;
                }
                if (c4052mX2 != null) {
                    byte[] bArr5 = {-8, 119, 70, 124, -44, -38, -15, 90, -20, 125, com.umeng.analytics.pro.cw.n, 124, -62, -115, -42, 65, -26, 126};
                    byte[] bArr6 = {-118, 18, 48, 21, -79, -83, -72, 52};
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < 18) {
                        if (i8 >= 8) {
                            i8 = 0;
                        }
                        bArr5[i7] = (byte) (bArr5[i7] ^ bArr6[i8]);
                        i7++;
                        i8++;
                    }
                    new String(bArr5, StandardCharsets.UTF_8);
                    c4052mX2.a();
                }
            }
        });
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5110ya
    public final void i() {
        JT jt = (JT) this.d;
        byte[] bArr = Ug0.e;
        jt.getClass();
        jt.C(bArr, bArr.length);
    }

    public VC(int i, int i2) {
        if (i2 != 4) {
            this.c = new C3798jd0[i];
            this.b = 0;
        } else {
            this.c = new long[i];
            this.d = new Object[i];
        }
    }

    public VC(float[] fArr, int i, float[] fArr2, int i2) {
        this.f3864a = i;
        FW.h(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.d = fArr2;
        this.b = i2;
    }

    public VC(VC vc) {
        Object obj = vc.c;
        this.f3864a = ((float[]) obj).length / 3;
        this.c = AbstractC2845Vx.T((float[]) obj);
        this.d = AbstractC2845Vx.T((float[]) vc.d);
        int i = vc.b;
        if (i == 1) {
            this.b = 5;
        } else if (i != 2) {
            this.b = 4;
        } else {
            this.b = 6;
        }
    }
}

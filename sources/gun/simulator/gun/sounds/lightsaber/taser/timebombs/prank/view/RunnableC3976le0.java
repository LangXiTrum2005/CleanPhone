package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.view.Surface;
import android.view.View;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.badlogic.gdx.backends.android.SpineActivity;
import com.badlogic.gdx.backends.android.SpineRenderAdapter;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.le0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3976le0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4656a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC3976le0(int i, Object obj, Object obj2) {
        this.f4656a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.b;
        C4581sZ c4581sZ = (C4581sZ) this.c;
        Object obj = C2315Bm.d0;
        try {
            audioTrack.flush();
            audioTrack.release();
            c4581sZ.d();
            synchronized (C2315Bm.d0) {
                try {
                    int i = C2315Bm.f0 - 1;
                    C2315Bm.f0 = i;
                    if (i == 0) {
                        C2315Bm.e0.shutdown();
                        C2315Bm.e0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            c4581sZ.d();
            synchronized (C2315Bm.d0) {
                try {
                    int i2 = C2315Bm.f0 - 1;
                    C2315Bm.f0 = i2;
                    if (i2 == 0) {
                        C2315Bm.e0.shutdown();
                        C2315Bm.e0 = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private final void b() {
        C2953a0 c2953a0;
        WS ws = (WS) this.b;
        AW aw = (AW) this.c;
        if (ws.b != WS.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (ws) {
            c2953a0 = ws.f3920a;
            ws.f3920a = null;
            ws.b = aw;
        }
        c2953a0.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long j;
        boolean z;
        int i = this.f4656a;
        long j2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        final int i2 = 1;
        boolean z2 = false;
        z2 = false;
        switch (i) {
            case 0:
                ((TrustedWebActivityServiceConnectionPool) this.b).lambda$connect$0((Uri) this.c);
                return;
            case 1:
                ((ViewTransition) this.b).lambda$applyTransition$0((View[]) this.c);
                return;
            case 2:
                ((ResourcesCompat.FontCallback) this.b).lambda$callbackSuccessAsync$0((Typeface) this.c);
                return;
            case 3:
                FragmentStrictMode.m13handlePolicyViolation$lambda0((FragmentStrictMode.Policy) this.b, (Violation) this.c);
                return;
            case 4:
                FragmentStrictMode.m14handlePolicyViolation$lambda1((String) this.b, (Violation) this.c);
                return;
            case 5:
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) this.b, (Runnable) this.c);
                return;
            case 6:
                ((ProfileInstallerInitializer) this.b).lambda$delayAfterFirstFrame$0((Context) this.c);
                return;
            case 7:
                SpineRenderAdapter.updateSpine$lambda$6$lambda$5((SpineActivity) this.b, (SpineRenderAdapter) this.c);
                return;
            case 8:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i3 = JobInfoSchedulerService.f800a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 9:
                C2736Rs c2736Rs = (C2736Rs) this.b;
                C2840Vs c2840Vs = (C2840Vs) this.c;
                int i4 = c2736Rs.G - c2840Vs.c;
                c2736Rs.G = i4;
                if (c2840Vs.d) {
                    c2736Rs.H = c2840Vs.e;
                    c2736Rs.I = true;
                }
                if (c2840Vs.f) {
                    c2736Rs.J = c2840Vs.g;
                }
                if (i4 == 0) {
                    Gc0 gc0 = c2840Vs.b.f2971a;
                    if (!c2736Rs.h0.f2971a.q() && gc0.q()) {
                        c2736Rs.i0 = -1;
                        c2736Rs.j0 = 0L;
                    }
                    if (!gc0.q()) {
                        List listAsList = Arrays.asList(((C3171cV) gc0).m);
                        FW.s(listAsList.size() == c2736Rs.o.size());
                        for (int i5 = 0; i5 < listAsList.size(); i5++) {
                            ((C2710Qs) c2736Rs.o.get(i5)).b = (Gc0) listAsList.get(i5);
                        }
                    }
                    if (c2736Rs.I) {
                        if (c2840Vs.b.b.equals(c2736Rs.h0.b) && c2840Vs.b.d == c2736Rs.h0.r) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            if (gc0.q() || c2840Vs.b.b.a()) {
                                j2 = c2840Vs.b.d;
                            } else {
                                DU du = c2840Vs.b;
                                C5186zO c5186zO = du.b;
                                long j3 = du.d;
                                Object obj = c5186zO.f4977a;
                                Ec0 ec0 = c2736Rs.n;
                                gc0.h(obj, ec0);
                                j2 = j3 + ec0.e;
                            }
                        }
                        j = j2;
                        z = i2;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    c2736Rs.I = false;
                    c2736Rs.O(c2840Vs.b, 1, c2736Rs.J, false, z, c2736Rs.H, j, -1, false);
                    return;
                }
                return;
            case 10:
                C2918Ys c2918Ys = (C2918Ys) this.b;
                ZU zu = (ZU) this.c;
                c2918Ys.getClass();
                try {
                    C2918Ys.b(zu);
                    return;
                } catch (C2321Bs e) {
                    AbstractC4038mJ.d("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 11:
                C3491g4 c3491g4 = (C3491g4) this.b;
                final String str = (String) this.c;
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) c3491g4.c;
                int i6 = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) surfaceHolderCallbackC2658Os.f3526a.q;
                final C3403f4 c3403f4M = c4167nm.M();
                final int i7 = z2 ? 1 : 0;
                c4167nm.N(c3403f4M, 1012, new BI(c3403f4M, str, i7) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zl

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4090a;

                    {
                        this.f4090a = i7;
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj2) {
                        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj2;
                        switch (this.f4090a) {
                            case 0:
                                interfaceC3579h4.getClass();
                                break;
                            default:
                                interfaceC3579h4.getClass();
                                break;
                        }
                    }
                });
                return;
            case 12:
                a();
                return;
            case 13:
                C2782Tm c2782Tm = (C2782Tm) this.b;
                C4619sw c4619sw = (C4619sw) this.c;
                com.google.android.exoplayer2.drm.b bVar = c2782Tm.d;
                if (bVar.o == 0 || c2782Tm.c) {
                    return;
                }
                Looper looper = bVar.s;
                looper.getClass();
                c2782Tm.b = bVar.a(looper, c2782Tm.f3791a, c4619sw, false);
                bVar.m.add(c2782Tm);
                return;
            case 14:
                C3525gW c3525gW = (C3525gW) this.b;
                O30 o30 = (O30) this.c;
                c3525gW.y = c3525gW.r == null ? o30 : new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                c3525gW.z = o30.getDurationUs();
                if (!c3525gW.F && o30.getDurationUs() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    z2 = true;
                }
                c3525gW.A = z2;
                c3525gW.B = z2 ? 7 : 1;
                c3525gW.g.w(c3525gW.z, o30.isSeekable(), c3525gW.A);
                if (c3525gW.v) {
                    return;
                }
                c3525gW.l();
                return;
            case 15:
                AbstractC3950lJ.z(((C3491g4) this.b).c);
                int i8 = I3.k;
                throw null;
            case 16:
                C3643hn c3643hn = (C3643hn) this.b;
                Uri uri = (Uri) this.c;
                c3643hn.i = false;
                c3643hn.b(uri);
                return;
            case 17:
                O00.a((O00) this.b, (List) this.c);
                return;
            case 18:
                ((C2367Dm) this.c).a(((BR) this.b).e());
                return;
            case 19:
                Gh0 gh0 = (Gh0) this.b;
                Ih0 ih0 = (Ih0) this.c;
                gh0.getClass();
                int i9 = Ug0.f3833a;
                C2736Rs c2736Rs2 = ((SurfaceHolderCallbackC2658Os) gh0.b).f3526a;
                c2736Rs2.f0 = ih0;
                c2736Rs2.l.e(25, new Md0(ih0, 18));
                return;
            case 20:
                Gh0 gh1 = (Gh0) this.b;
                final String str2 = (String) this.c;
                gh1.getClass();
                int i10 = Ug0.f3833a;
                C4167nm c4167nm2 = (C4167nm) ((SurfaceHolderCallbackC2658Os) gh1.b).f3526a.q;
                final C3403f4 c3403f4M2 = c4167nm2.M();
                c4167nm2.N(c3403f4M2, PointerIconCompat.TYPE_ZOOM_OUT, new BI(c3403f4M2, str2, i2) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zl

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f4090a;

                    {
                        this.f4090a = i2;
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
                    public final void invoke(Object obj2) {
                        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj2;
                        switch (this.f4090a) {
                            case 0:
                                interfaceC3579h4.getClass();
                                break;
                            default:
                                interfaceC3579h4.getClass();
                                break;
                        }
                    }
                });
                return;
            case 21:
                Gh0 gh2 = (Gh0) this.b;
                Exception exc = (Exception) this.c;
                gh2.getClass();
                int i11 = Ug0.f3833a;
                C4167nm c4167nm3 = (C4167nm) ((SurfaceHolderCallbackC2658Os) gh2.b).f3526a.q;
                C3403f4 c3403f4M3 = c4167nm3.M();
                c4167nm3.N(c3403f4M3, 1030, new C3641hm(c3403f4M3, exc, 0));
                return;
            case 22:
                A80 a80 = (A80) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture2 = a80.g;
                Surface surface = a80.h;
                Surface surface2 = new Surface(surfaceTexture);
                a80.g = surfaceTexture;
                a80.h = surface2;
                Iterator it = a80.f2804a.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolderCallbackC2658Os) it.next()).f3526a.L(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 23:
                b();
                return;
            case 24:
                C3772jH c3772jH = (C3772jH) this.b;
                AW aw = (AW) this.c;
                synchronized (c3772jH) {
                    try {
                        if (c3772jH.b == null) {
                            c3772jH.f4546a.add(aw);
                        } else {
                            c3772jH.b.add(aw.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 25:
            default:
                C3767jC c3767jC = (C3767jC) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                c3767jC.getClass();
                try {
                    taskCompletionSource.setResult(c3767jC.h());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 26:
                ThreadFactoryC2521Jk threadFactoryC2521Jk = (ThreadFactoryC2521Jk) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(threadFactoryC2521Jk.c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC2521Jk.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 27:
                Callable callable = (Callable) this.b;
                Wm0 wm0 = (Wm0) this.c;
                try {
                    Object objCall = callable.call();
                    ScheduledFutureC4610so scheduledFutureC4610so = (ScheduledFutureC4610so) wm0.b;
                    int i12 = ScheduledFutureC4610so.b;
                    scheduledFutureC4610so.set(objCall);
                    return;
                } catch (Exception e3) {
                    ScheduledFutureC4610so scheduledFutureC4610so2 = (ScheduledFutureC4610so) wm0.b;
                    int i13 = ScheduledFutureC4610so.b;
                    scheduledFutureC4610so2.setException(e3);
                    return;
                }
            case 28:
                C2504It c2504It = (C2504It) this.b;
                Intent intent = (Intent) this.c;
                c2504It.getClass();
                C2504It.a(intent);
                return;
        }
    }
}

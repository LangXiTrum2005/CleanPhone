package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.OY.ebl;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLoadingRewardAdsBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogLockHintBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.dialog.LockHintDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class TY implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3776a;
    public final Object b;

    public /* synthetic */ TY(Object obj, int i) {
        this.f3776a = i;
        this.b = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r1;
        int i = 0;
        Socket socketAccept = null;
        switch (this.f3776a) {
            case 0:
                VY vy = (VY) this.b;
                vy.c.s(vy);
                return;
            case 1:
                C4624t0 c4624t0 = (C4624t0) this.b;
                c4624t0.getClass();
                while (true) {
                    try {
                        c4624t0.b((C4536s0) c4624t0.d.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ((JK) this.b).getClass();
                return;
            case 3:
                com.bytedance.sdk.component.OY.lc.LD(new C5051xo0(this));
                return;
            case 4:
                try {
                    C4963wo0 c4963wo0 = (C4963wo0) this.b;
                    ((C4963wo0) this.b).getClass();
                    c4963wo0.f5198a = new ServerSocket(0, 50, InetAddress.getByName(C4963wo0.d()));
                    C4963wo0 c4963wo1 = (C4963wo0) this.b;
                    c4963wo1.b = c4963wo1.f5198a.getLocalPort();
                    if (((C4963wo0) this.b).b == -1) {
                        ((C4963wo0) this.b).a();
                        return;
                    }
                    ((C4963wo0) this.b).getClass();
                    ProxySelector.setDefault(new Wo0(C4963wo0.d(), ((C4963wo0) this.b).b));
                    C4963wo0 c4963wo2 = (C4963wo0) this.b;
                    c4963wo2.getClass();
                    ebl eblVar = new ebl(new CallableC4787uo0(C4963wo0.d(), c4963wo2.b), 5, 1);
                    com.bytedance.sdk.component.OY.lc.lk().submit(eblVar);
                    try {
                        try {
                            socketAccept = c4963wo2.f5198a.accept();
                            socketAccept.setSoTimeout(2000);
                            if ("Ping".equals(new BufferedReader(new InputStreamReader(socketAccept.getInputStream())).readLine())) {
                                OutputStream outputStream = socketAccept.getOutputStream();
                                outputStream.write("OK\n".getBytes(PK.b));
                                outputStream.flush();
                            }
                        } catch (Throwable th) {
                            PK.k(socketAccept);
                            throw th;
                        }
                    } catch (IOException e) {
                        Log.getStackTraceString(e);
                    }
                    PK.k(socketAccept);
                    try {
                        if (((Boolean) eblVar.get()).booleanValue()) {
                            No0 no0 = AbstractC4648tE.f5026a;
                            boolean zCompareAndSet = ((C4963wo0) this.b).c.compareAndSet(0, 1);
                            c4963wo2 = zCompareAndSet;
                            if (zCompareAndSet) {
                                AtomicInteger atomicInteger = ((C4963wo0) this.b).c;
                                while (true) {
                                    try {
                                        r1 = ((C4963wo0) this.b).c.get();
                                        if (r1 == 1) {
                                            try {
                                                Socket socketAccept2 = ((C4963wo0) this.b).f5198a.accept();
                                                Vo0 vo0 = ((C4963wo0) this.b).d;
                                                if (vo0 != null) {
                                                    C3844k50 c3844k50 = new C3844k50(2);
                                                    c3844k50.c = vo0;
                                                    if (socketAccept2 == null) {
                                                        throw new IllegalArgumentException("socket == null");
                                                    }
                                                    c3844k50.d = socketAccept2;
                                                    c3844k50.e = ((C4963wo0) this.b).g;
                                                    com.bytedance.sdk.component.OY.lc.lk().execute(new Bo0(this, "ProxyTask", 10, new C4172no0(c3844k50), 2));
                                                } else {
                                                    PK.k(socketAccept2);
                                                }
                                            } catch (IOException e2) {
                                                Log.getStackTraceString(e2);
                                                i++;
                                                r1 = 3;
                                                if (i > 3) {
                                                    No0 no1 = AbstractC4648tE.f5026a;
                                                    ((C4963wo0) this.b).a();
                                                    c4963wo2 = r1;
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        r1 = "proxy server crashed!  ";
                                        "proxy server crashed!  ".concat(String.valueOf(Log.getStackTraceString(th2)));
                                    }
                                }
                                No0 no2 = AbstractC4648tE.f5026a;
                                ((C4963wo0) this.b).a();
                                c4963wo2 = r1;
                            }
                        } else {
                            c4963wo2.a();
                            c4963wo2 = c4963wo2;
                        }
                        return;
                    } catch (Throwable th3) {
                        Log.getStackTraceString(th3);
                        c4963wo2.a();
                        return;
                    }
                } catch (IOException e3) {
                    if (AbstractC4648tE.c) {
                        Log.getStackTraceString(e3);
                    }
                    Log.getStackTraceString(e3);
                    ((C4963wo0) this.b).a();
                    return;
                }
                break;
            case 5:
                MediaView mediaView = (MediaView) this.b;
                mediaView.removeAllViews();
                ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
                mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
                mediaView.attachAdComponentViewApi(mediaView.mMediaViewApi);
                mediaView.mMediaViewApi.initialize(mediaView.mConstructorParams, mediaView);
                return;
            case 6:
                try {
                    ((Runnable) this.b).run();
                    return;
                } catch (Exception unused2) {
                    AbstractC2871Wx.f0("Executor");
                    return;
                }
            case 7:
                ((MI) this.b).onLoaderReleased();
                return;
            case 8:
                C2700Qi c2700Qi = (C2700Qi) this.b;
                if (c2700Qi.a()) {
                    if (new Date(c2700Qi.n.currentTimeMillis()).before(c2700Qi.o.b().b)) {
                        c2700Qi.h();
                        return;
                    }
                    C4617su c4617su = (C4617su) c2700Qi.i;
                    Task taskE = c4617su.e();
                    Task taskD = c4617su.d();
                    Task<List<Task<?>>> taskWhenAllComplete = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskE, taskD});
                    C2351Cw c2351Cw = new C2351Cw(c2700Qi, taskE, taskD, 7);
                    ScheduledExecutorService scheduledExecutorService = c2700Qi.f;
                    Task taskContinueWithTask = taskWhenAllComplete.continueWithTask(scheduledExecutorService, c2351Cw);
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(scheduledExecutorService, new C3285dk(18, c2700Qi, taskContinueWithTask));
                    return;
                }
                return;
            case 9:
                ((C3097be0) this.b).e.q();
                return;
            case 10:
                ((Zd0) this.b).e.q();
                return;
            case 11:
                ((C3008ae0) this.b).e.q();
                return;
            case 12:
                C3844k50 c3844k51 = (C3844k50) this.b;
                if (((WeakReference) ((RunnableC3163cN) c3844k51.e).c).get() == null || ((WeakReference) ((RunnableC3163cN) c3844k51.e).b).get() == null) {
                    return;
                }
                com.bumptech.glide.a.d((Context) ((WeakReference) ((RunnableC3163cN) c3844k51.e).c).get()).i(Drawable.class).z((File) c3844k51.d).w((ImageView) ((WeakReference) ((RunnableC3163cN) c3844k51.e).b).get());
                return;
            case 13:
                SI si = (SI) this.b;
                int i2 = SI.l;
                si.d().removeCallbacks(this);
                if (System.currentTimeMillis() - si.j > WorkRequest.MIN_BACKOFF_MILLIS) {
                    ((DialogLoadingRewardAdsBinding) si.a()).conLoadingReward.setVisibility(8);
                    ((DialogLoadingRewardAdsBinding) si.a()).conLoadingRewardError.setVisibility(0);
                    return;
                } else if (si.k) {
                    WZ.b().a(si.b, AbstractC3485g1.d, si.c, new QI(si));
                    return;
                } else {
                    si.d().postDelayed(this, 50L);
                    return;
                }
            default:
                LockHintDialog lockHintDialog = (LockHintDialog) this.b;
                int i3 = LockHintDialog.g;
                Handler handlerD = lockHintDialog.d();
                if (handlerD != null) {
                    handlerD.removeCallbacks(this);
                }
                int i4 = lockHintDialog.c;
                lockHintDialog.c = (-1) + i4;
                if (i4 < 0) {
                    return;
                }
                ((DialogLockHintBinding) lockHintDialog.a()).tvAdTime.setText((CharSequence) null);
                Handler handlerD2 = lockHintDialog.d();
                if (handlerD2 != null) {
                    handlerD2.postDelayed(this, 50L);
                    return;
                }
                return;
        }
    }
}

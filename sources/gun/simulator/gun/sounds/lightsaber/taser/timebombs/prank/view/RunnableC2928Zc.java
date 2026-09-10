package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.badlogic.gdx.backends.android.SpineActivity;
import com.badlogic.gdx.graphics.GL20;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.view.ScarBannerContainer;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2928Zc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4079a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC2928Zc(Object obj, int i) {
        this.f4079a = i;
        this.b = obj;
    }

    private final void a() {
        J6 j6 = (J6) this.b;
        synchronized (j6.f3254a) {
            try {
                if (j6.l) {
                    return;
                }
                long j = j6.k - 1;
                j6.k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    j6.b(new IllegalStateException());
                } else {
                    j6.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4079a) {
            case 0:
                ((Carousel) this.b).lambda$updateItems$0();
                return;
            case 1:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.b);
                return;
            case 2:
                InputStream inputStream = (InputStream) this.b;
                HashMap map = RJ.f3654a;
                AbstractC3014ah0.b(inputStream);
                return;
            case 3:
                C3951lK c3951lK = (C3951lK) this.b;
                ExecutorService executorService = C3951lK.e;
                c3951lK.d();
                return;
            case 4:
                SpineActivity.exit$lambda$2((SpineActivity) this.b);
                return;
            case 5:
                C3290dm0 c3290dm0 = (C3290dm0) this.b;
                c3290dm0.getClass();
                ((E20) c3290dm0.d).n(new Md0(c3290dm0, 8));
                return;
            case 6:
                N90 n90 = (N90) this.b;
                int i = C4024m70.c;
                n90.c();
                return;
            case 7:
                C4167nm c4167nm = (C4167nm) this.b;
                C3403f4 c3403f4I = c4167nm.I();
                c4167nm.N(c3403f4I, GL20.GL_FRONT, new C3815jm(c3403f4I, 4));
                c4167nm.f.d();
                return;
            case 8:
                C2782Tm c2782Tm = (C2782Tm) this.b;
                if (c2782Tm.c) {
                    return;
                }
                InterfaceC2889Xp interfaceC2889Xp = c2782Tm.b;
                if (interfaceC2889Xp != null) {
                    interfaceC2889Xp.b(c2782Tm.f3791a);
                }
                c2782Tm.d.m.remove(c2782Tm);
                c2782Tm.c = true;
                return;
            case 9:
                ((com.google.android.exoplayer2.drm.a) this.b).b(null);
                return;
            case 10:
                a();
                return;
            case 11:
                ((HandlerThread) this.b).quit();
                return;
            case 12:
                Y80 y80 = (Y80) this.b;
                int i2 = Y80.A;
                y80.w();
                return;
            case 13:
                C2757Sn c2757Sn = (C2757Sn) this.b;
                int i3 = C2757Sn.N;
                c2757Sn.d(false);
                return;
            case 14:
                A80 a80 = (A80) this.b;
                Surface surface = a80.h;
                if (surface != null) {
                    Iterator it = a80.f2804a.iterator();
                    while (it.hasNext()) {
                        ((SurfaceHolderCallbackC2658Os) it.next()).f3526a.L(null);
                    }
                }
                SurfaceTexture surfaceTexture = a80.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                a80.g = null;
                a80.h = null;
                return;
            case 15:
                ((CarouselLayoutManager) this.b).refreshKeylineState();
                return;
            case 16:
            default:
                C4418qf0.m269retrieveUnclosedAd$lambda1((C4418qf0) this.b);
                return;
            case 17:
                ((MaterialBackOrchestrator) this.b).startListeningForBackCallbacksWithPriorityOverlay();
                return;
            case 18:
                C4617su c4617su = (C4617su) this.b;
                Object obj = C4617su.m;
                c4617su.b(false);
                return;
            case 19:
                C4813v60 c4813v60 = (C4813v60) this.b;
                synchronized (((ArrayDeque) c4813v60.e)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) c4813v60.b).edit();
                    String str = (String) c4813v60.c;
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) c4813v60.e).iterator();
                    while (it2.hasNext()) {
                        sb.append((String) it2.next());
                        sb.append((String) c4813v60.d);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            case 20:
                C3113bm0 c3113bm0 = (C3113bm0) this.b;
                c3113bm0.f4188a.getAction();
                c3113bm0.b.trySetResult(null);
                return;
            case 21:
                ((IUnityAdsTokenListener) this.b).onUnityAdsTokenReady(null);
                return;
            case 22:
                ((BiddingBaseManager) this.b).lambda$fetchSignals$1();
                return;
            case 23:
                ((ShowOperationState) this.b).lambda$onUnityAdsShowClick$1();
                return;
            case 24:
                ((BannerView) this.b).lambda$addScarContainer$0();
                return;
            case 25:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) this.b);
                return;
            case 26:
                X8.m217onLoadSuccess$lambda1((X8) this.b);
                return;
            case 27:
                AbstractC3325e9.m236loadAd$lambda0((AbstractC3325e9) this.b);
                return;
            case 28:
                C3080bS.m233init$lambda2((C3080bS) this.b);
                return;
        }
    }
}

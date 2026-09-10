package sg.bigo.ads.core.player;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.core.player.b.f;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sg.bigo.ads.api.core.a.InterfaceC0831a, sg.bigo.ads.common.aa.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f48848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<WeakReference<View>> f48849c;
    private final Runnable d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f48851a = new d(0);
    }

    private d() {
        this.f48847a = false;
        this.f48848b = new Handler(Looper.getMainLooper());
        this.f48849c = new ArrayList<>();
        this.d = new Runnable() { // from class: sg.bigo.ads.core.player.d.1
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.c()) {
                    d.this.f48848b.postDelayed(this, 500L);
                }
            }
        };
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.api.core.a.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC0831a f47015a;

            public AnonymousClass1() {
                interfaceC0831a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = a.this.f47014b.iterator();
                while (it.hasNext()) {
                    InterfaceC0831a interfaceC0831a = (InterfaceC0831a) ((WeakReference) it.next()).get();
                    if (interfaceC0831a != null && interfaceC0831a == interfaceC0831a) {
                        return;
                    }
                }
                a.this.f47014b.add(new WeakReference(interfaceC0831a));
            }
        }, 1L);
    }

    private synchronized void d() {
        e();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "startCheckTask called");
        this.f48848b.post(this.d);
    }

    private synchronized void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "removeCheckTask called");
        this.f48848b.removeCallbacksAndMessages(null);
        c();
    }

    @Override // sg.bigo.ads.api.core.a.InterfaceC0831a
    public final void a() {
        d();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "onActivityResumed");
    }

    @Override // sg.bigo.ads.api.core.a.InterfaceC0831a
    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "onActivityPaused");
        e();
    }

    public final synchronized boolean c() {
        f fVar;
        int playStatus;
        try {
            if (this.f48849c.isEmpty()) {
                return false;
            }
            Iterator<WeakReference<View>> it = this.f48849c.iterator();
            View view = null;
            boolean z2 = false;
            int i2 = 0;
            while (it.hasNext()) {
                View view2 = it.next().get();
                if (view2 instanceof f) {
                    z2 = view2.getContext() != null && sg.bigo.ads.common.aa.b.a(view2.getContext().getApplicationContext());
                    Rect rect = new Rect();
                    float f = 0.0f;
                    if (sg.bigo.ads.common.ab.a.a(view2, rect)) {
                        float height = view2.getHeight() * 1.0f * view2.getWidth();
                        float fHeight = rect.height() * 1.0f * rect.width();
                        if (height <= 0.0f) {
                            sg.bigo.ads.common.t.a.a(0, 3, "ImpressionChecker", "adView is not visible, width or height is 0");
                        } else {
                            f = fHeight / height;
                        }
                    }
                    int i3 = (int) (100.0f * f);
                    if (i3 < i2 || i3 < 50 || !z2) {
                        ((f) view2).s();
                    } else {
                        if (i3 == i2) {
                            ((f) view).s();
                        } else {
                            i2 = i3;
                        }
                        view = view2;
                    }
                } else {
                    it.remove();
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "playView is recycled, remove it");
                }
            }
            if (view != null && (playStatus = (fVar = (f) view).getPlayStatus()) != 2 && playStatus != 5 && playStatus != 0) {
                fVar.b();
            }
            return z2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    @Override // sg.bigo.ads.common.aa.b.a
    public final void a(int i2) {
        if (i2 == 1) {
            d();
        }
    }

    public final synchronized void b(f fVar) {
        try {
            Iterator<WeakReference<View>> it = this.f48849c.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    if (view == fVar) {
                        fVar.s();
                    }
                }
                it.remove();
            }
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "unregister player, size = " + this.f48849c.size());
            if (this.f48849c.isEmpty()) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(f fVar) {
        try {
            Iterator<WeakReference<View>> it = this.f48849c.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view == null) {
                    it.remove();
                } else if (view == fVar) {
                    sg.bigo.ads.common.t.a.b("VideoPlayerManager", "register playerView exist already");
                    return;
                }
            }
            this.f48849c.add(new WeakReference<>(fVar));
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "register playerView, size = " + this.f48849c.size());
            d();
            if (!this.f48847a) {
                this.f48847a = true;
                sg.bigo.ads.common.aa.b.a(fVar.getContext().getApplicationContext(), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

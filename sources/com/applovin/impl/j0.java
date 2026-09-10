package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f8197i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8199k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f8200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f8201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f8202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f8203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HandlerThread f8204q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f8206s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private WeakReference f8198j = new WeakReference(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f8205r = new k9(this, 2);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f8209b;

        public b(d dVar, Bitmap bitmap) {
            this.f8208a = dVar;
            this.f8209b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f8208a.a(this.f8209b);
                return;
            }
            com.applovin.impl.sdk.p unused = j0.this.f8190b;
            if (com.applovin.impl.sdk.p.a()) {
                j0.this.f8190b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f8208a.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public j0(com.applovin.impl.sdk.l lVar) {
        this.f8189a = lVar;
        this.f8190b = lVar.Q();
        this.f8191c = ((Long) lVar.a(z4.f10228p6)).longValue();
        this.f8192d = ((Long) lVar.a(z4.o6)).longValue();
        this.f8195g = ((Integer) lVar.a(z4.q6)).intValue();
        this.f8196h = ((Integer) lVar.a(z4.f10242r6)).intValue();
        this.f8197i = ((Integer) lVar.a(z4.f10250s6)).intValue();
        this.f8193e = ((Integer) lVar.a(z4.f10293y6)).intValue();
        this.f8194f = ((Integer) lVar.a(z4.f10301z6)).intValue();
    }

    public static /* synthetic */ int a(j0 j0Var) {
        int i10 = j0Var.l;
        j0Var.l = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f(j0 j0Var) {
        int i10 = j0Var.f8199k;
        j0Var.f8199k = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.f8199k >= this.f8194f && !this.f8202o) {
            this.f8202o = true;
            h();
        }
        if (this.f8199k < this.f8193e || this.f8201n) {
            return;
        }
        this.f8201n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f8206s;
        if (cVar != null) {
            cVar.a(this.f8193e, this.f8199k, this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f8206s;
        if (cVar != null) {
            cVar.a(this.f8199k, this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f8206s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f8191c <= 0) {
            if (this.f8199k == 1) {
                if (!this.f8202o) {
                    this.f8202o = true;
                    h();
                }
                if (!this.f8201n) {
                    this.f8201n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f8203p == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8190b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f8201n && this.f8202o) {
            k();
        } else {
            this.f8203p.postDelayed(this.f8205r, this.f8191c);
        }
    }

    private void h() {
        View view = (View) this.f8198j.get();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8190b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new k9(this, 3));
    }

    private void i() {
        View view = (View) this.f8198j.get();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8190b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new k9(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f8199k = 0;
        this.f8200m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f8198j.get() != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8190b.a("BlackViewDetector", "Stopped monitoring view: " + this.f8198j.get());
            }
            this.f8198j.clear();
        }
        Handler handler = this.f8203p;
        if (handler != null) {
            handler.removeCallbacks(this.f8205r);
            this.f8203p = null;
        }
        if (this.f8206s != null) {
            AppLovinSdkUtils.runOnUiThread(new k9(this, 1));
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f8204q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f8204q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f8189a.a(z4.f10212n6)).booleanValue()) {
            View view2 = (View) this.f8198j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8190b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8190b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f8204q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f8204q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f8189a.E().a(f2.T0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f8206s = cVar;
                this.f8198j = new WeakReference(view);
                j();
                this.f8201n = false;
                this.f8202o = false;
                Handler handler = new Handler(this.f8204q.getLooper());
                this.f8203p = handler;
                handler.postDelayed(this.f8205r, this.f8192d);
            } catch (Throwable th2) {
                k();
                this.f8189a.E().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.j0.d
        public void a(Bitmap bitmap) {
            try {
                j0.a(j0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / j0.this.f8195g;
                int i11 = height / j0.this.f8195g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (j0.this.a(pixel)) {
                            bitmap.recycle();
                            j0.this.j();
                            j0.this.g();
                            return;
                        }
                        if (j0.this.f8200m == null) {
                            j0.this.f8200m = Integer.valueOf(pixel);
                        }
                    }
                }
                j0.f(j0.this);
                bitmap.recycle();
                j0.this.g();
            } catch (Exception e10) {
                j0.this.f8189a.E().a("BlackViewDetector", "onScreenshotCaptured", e10);
                j0.this.k();
            }
        }

        @Override // com.applovin.impl.j0.d
        public void a(boolean z10) {
            if (z10) {
                j0.this.k();
            } else {
                j0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f8198j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8190b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l = (Long) this.f8189a.a(z4.f10277w6);
        if (l.longValue() > 0 && (memoryInfoA = q7.a((ActivityManager) com.applovin.impl.sdk.l.p().getSystemService("activity"))) != null && memoryInfoA.availMem < l.longValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8190b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f8189a.o0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8190b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8190b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8190b.k("BlackViewDetector", l1.d.f("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    public boolean a(int i10) {
        boolean z10;
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        Integer num = this.f8200m;
        if (num != null) {
            int iRed2 = Color.red(num.intValue());
            int iGreen2 = Color.green(this.f8200m.intValue());
            int iBlue2 = Color.blue(this.f8200m.intValue());
            if (Math.abs(iRed - iRed2) > this.f8197i || Math.abs(iGreen - iGreen2) > this.f8197i || Math.abs(iBlue - iBlue2) > this.f8197i) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        int i11 = this.f8196h;
        return iRed > i11 || iGreen > i11 || iBlue > i11 || z10;
    }

    private void a(View view, d dVar) {
        if (p0.e()) {
            Activity activityA = this.f8189a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8190b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8190b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8190b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}

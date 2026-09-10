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

/* JADX INFO: renamed from: com.applovin.impl.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0939h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f10893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10894c;
    private final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10895e;
    private final int f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f10897i;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10898l;
    private Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f10899n;
    private volatile boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Handler f10900p;
    private HandlerThread q;
    private c s;
    private WeakReference j = new WeakReference(null);
    private final Runnable r = new O(this, 2);

    /* JADX INFO: renamed from: com.applovin.impl.h0$b */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f10902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f10903b;

        public b(d dVar, Bitmap bitmap) {
            this.f10902a = dVar;
            this.f10903b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i2) {
            if (i2 == 0) {
                this.f10902a.a(this.f10903b);
                return;
            }
            com.applovin.impl.sdk.o unused = C0939h0.this.f10893b;
            if (com.applovin.impl.sdk.o.a()) {
                C0939h0.this.f10893b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i2);
            }
            this.f10902a.a(true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.h0$c */
    public interface c {
        void a(int i2, int i3);

        void a(int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: com.applovin.impl.h0$d */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z2);
    }

    public C0939h0(com.applovin.impl.sdk.k kVar) {
        this.f10892a = kVar;
        this.f10893b = kVar.O();
        this.f10894c = ((Long) kVar.a(x4.j6)).longValue();
        this.d = ((Long) kVar.a(x4.i6)).longValue();
        this.g = ((Integer) kVar.a(x4.k6)).intValue();
        this.f10896h = ((Integer) kVar.a(x4.l6)).intValue();
        this.f10897i = ((Integer) kVar.a(x4.m6)).intValue();
        this.f10895e = ((Integer) kVar.a(x4.s6)).intValue();
        this.f = ((Integer) kVar.a(x4.t6)).intValue();
    }

    public static /* synthetic */ int a(C0939h0 c0939h0) {
        int i2 = c0939h0.f10898l;
        c0939h0.f10898l = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int f(C0939h0 c0939h0) {
        int i2 = c0939h0.k;
        c0939h0.k = i2 + 1;
        return i2;
    }

    private void c() {
        if (this.k >= this.f && !this.o) {
            this.o = true;
            h();
        }
        if (this.k < this.f10895e || this.f10899n) {
            return;
        }
        this.f10899n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(this.f10895e, this.k, this.f10898l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.s;
        if (cVar != null) {
            cVar.a(this.k, this.f10898l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f10894c <= 0) {
            if (this.k == 1) {
                if (!this.o) {
                    this.o = true;
                    h();
                }
                if (!this.f10899n) {
                    this.f10899n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f10900p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10893b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f10899n && this.o) {
            k();
        } else {
            this.f10900p.postDelayed(this.r, this.f10894c);
        }
    }

    private void h() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10893b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new O(this, 3));
    }

    private void i() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f10893b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new O(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.k = 0;
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10893b.a("BlackViewDetector", "Stopped monitoring view: " + this.j.get());
            }
            this.j.clear();
        }
        Handler handler = this.f10900p;
        if (handler != null) {
            handler.removeCallbacks(this.r);
            this.f10900p = null;
        }
        if (this.s != null) {
            AppLovinSdkUtils.runOnUiThread(new O(this, 1));
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f10892a.a(x4.h6)).booleanValue()) {
            View view2 = (View) this.j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10893b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f10893b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f10892a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.s = cVar;
                this.j = new WeakReference(view);
                j();
                this.f10899n = false;
                this.o = false;
                Handler handler = new Handler(this.q.getLooper());
                this.f10900p = handler;
                handler.postDelayed(this.r, this.d);
            } catch (Throwable th) {
                k();
                this.f10892a.D().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.h0$a */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.C0939h0.d
        public void a(Bitmap bitmap) {
            try {
                C0939h0.a(C0939h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i2 = width / C0939h0.this.g;
                int i3 = height / C0939h0.this.g;
                int i4 = i2 / 2;
                for (int i5 = i3 / 2; i5 < height; i5 += i3) {
                    for (int i6 = i4; i6 < width; i6 += i2) {
                        int pixel = bitmap.getPixel(i6, i5);
                        if (C0939h0.this.a(pixel)) {
                            bitmap.recycle();
                            C0939h0.this.j();
                            C0939h0.this.g();
                            return;
                        }
                        if (C0939h0.this.m == null) {
                            C0939h0.this.m = Integer.valueOf(pixel);
                        }
                    }
                }
                C0939h0.f(C0939h0.this);
                bitmap.recycle();
                C0939h0.this.g();
            } catch (Exception e2) {
                C0939h0.this.f10892a.D().a("BlackViewDetector", "onScreenshotCaptured", e2);
                C0939h0.this.k();
            }
        }

        @Override // com.applovin.impl.C0939h0.d
        public void a(boolean z2) {
            if (z2) {
                C0939h0.this.k();
            } else {
                C0939h0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10893b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l2 = (Long) this.f10892a.a(x4.q6);
        if (l2.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l2.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10893b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f10892a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f10893b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f10893b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f10893b.k("BlackViewDetector", androidx.datastore.preferences.protobuf.a.e(measuredWidth, measuredHeight, "Monitored view is not visible due to dimensions (width = ", ", height = ", ")"));
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    public boolean a(int i2) {
        boolean z2;
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        Integer num = this.m;
        if (num != null) {
            int iRed2 = Color.red(num.intValue());
            int iGreen2 = Color.green(this.m.intValue());
            int iBlue2 = Color.blue(this.m.intValue());
            if (Math.abs(iRed - iRed2) > this.f10897i || Math.abs(iGreen - iGreen2) > this.f10897i || Math.abs(iBlue - iBlue2) > this.f10897i) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        int i3 = this.f10896h;
        return iRed > i3 || iGreen > i3 || iBlue > i3 || z2;
    }

    private void a(View view, d dVar) {
        if (AbstractC0953o0.g()) {
            Activity activityA = this.f10892a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10893b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            Rect rect = new Rect(i2, i3, i2 + measuredWidth, i3 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10893b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f10893b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}

package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.k;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i<T extends k<?>> extends sg.bigo.ads.controller.e.b<T> implements k.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AdCountDownButton f46325A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final AtomicBoolean f46326B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f46327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f46329c;
    public T y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected ViewGroup f46330z;

    public i(Activity activity) {
        super(activity);
        this.f46327a = new AtomicBoolean(false);
        this.f46326B = new AtomicBoolean(true);
        this.f46328b = 0L;
        this.f46329c = 0L;
    }

    private void b() {
        AdCountDownButton adCountDownButton = (AdCountDownButton) o(R.id.inter_btn_close);
        this.f46325A = adCountDownButton;
        if (adCountDownButton != null) {
            adCountDownButton.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.interstitial.i.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a() {
                    i.this.d(true);
                }

                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a(Rect rect) {
                    i.this.y.y = rect;
                }
            });
        }
    }

    public int B() {
        return 1;
    }

    public void C() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void D() {
        sg.bigo.ads.common.utils.n nVar;
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null && (nVar = adCountDownButton.f45722b) != null) {
            nVar.b();
        }
        if (this.y != null && this.f46327a.compareAndSet(false, true)) {
            this.y.a(B(), 2);
        }
        T t = this.y;
        if (t != null) {
            t.destroy();
        }
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void N() {
        super.N();
        try {
            T t = (T) this.K;
            this.y = t;
            if (t == null) {
                ap();
                return;
            }
            ao();
            if (O()) {
                int i2 = R.layout.bigo_ad_activity_popup;
                int i3 = this.f47011I.getResources().getDisplayMetrics().widthPixels;
                int iC = sg.bigo.ads.common.utils.e.c(this.f47011I);
                this.f47011I.setContentView(sg.bigo.ads.common.utils.a.a(this.f47011I, i2, null, false), new ViewGroup.LayoutParams(i3, iC));
            } else {
                n(R.layout.bigo_ad_activity_interstitial);
            }
            if (f()) {
                return;
            }
            Q();
        } catch (Exception unused) {
            a("Illegal InterstitialAd.");
        }
    }

    public boolean O() {
        return false;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean P() {
        return O();
    }

    public final void Q() {
        m();
        this.f46330z = (ViewGroup) o(R.id.inter_main);
        int iR = R();
        Activity activity = this.f47011I;
        ViewGroup viewGroup = this.f46330z;
        sg.bigo.ads.common.utils.a.a(activity, iR, viewGroup, viewGroup != null);
        b();
        g(iR);
        this.y.a(this);
        this.y.z();
    }

    public abstract int R();

    public abstract boolean S();

    public final void T() {
        if (this.y != null && !this.f46327a.get()) {
            this.f46328b = (SystemClock.elapsedRealtime() - this.f46329c) + this.f46328b;
            this.y.a(B(), this.f46328b);
            this.f46328b = 0L;
        }
        ap();
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void U() {
        if (g() && this.f46326B.compareAndSet(true, false)) {
            h();
        }
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void V() {
        if (i() && this.f46326B.compareAndSet(false, true)) {
            j();
        }
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void W() {
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
    }

    public final void a(String str) {
        T t = this.y;
        if (t != null) {
            t.e(str);
        }
        ap();
    }

    public void d(boolean z2) {
        T();
    }

    public abstract boolean f();

    public abstract void g(int i2);

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z2) {
        if (z2) {
            ao();
        }
    }

    public void h() {
        h(false);
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null || adCountDownButton.f45723c) {
            return;
        }
        adCountDownButton.c();
    }

    public boolean i() {
        return true;
    }

    public void j() {
        h(true);
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null || adCountDownButton.f45723c) {
            return;
        }
        adCountDownButton.b();
    }

    public abstract void m();

    public void b(String str) {
    }

    public boolean g() {
        return true;
    }

    public final void h(boolean z2) {
        this.f46326B.set(z2);
        if (!z2) {
            this.f46329c = SystemClock.elapsedRealtime();
        } else {
            this.f46328b = (SystemClock.elapsedRealtime() - this.f46329c) + this.f46328b;
        }
    }

    public final void j(int i2) {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            adCountDownButton.setCloseImageResource(i2);
        }
    }
}

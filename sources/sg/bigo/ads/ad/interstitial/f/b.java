package sg.bigo.ads.ad.interstitial.f;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<InterfaceC0819b> f46251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f46252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f46253c;
    protected final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final float f46254e;

    public interface a {
        boolean a();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.b$b, reason: collision with other inner class name */
    public interface InterfaceC0819b {
        void a(int i2);

        void a(int i2, int i3, int i4, int i5, int i6);

        boolean a(MotionEvent motionEvent, a aVar, int i2);

        void b(int i2);

        void c(int i2);

        void d(int i2);
    }

    public b(int i2, int i3, int i4, float f) {
        this.f46252b = i2;
        this.f46253c = i3;
        this.d = i4;
        this.f46254e = f;
    }

    public final void a() {
        int i2 = this.f46252b;
        WeakReference<InterfaceC0819b> weakReference = f46251a;
        InterfaceC0819b interfaceC0819b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0819b != null) {
            interfaceC0819b.b(i2);
        }
    }

    public final void b() {
        int i2 = this.f46252b;
        WeakReference<InterfaceC0819b> weakReference = f46251a;
        InterfaceC0819b interfaceC0819b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0819b != null) {
            interfaceC0819b.c(i2);
        }
    }

    public final void c() {
        int i2 = this.f46252b;
        WeakReference<InterfaceC0819b> weakReference = f46251a;
        InterfaceC0819b interfaceC0819b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0819b != null) {
            interfaceC0819b.d(i2);
        }
    }

    public final int d() {
        return this.d;
    }

    public final float e() {
        return this.f46254e;
    }

    public final boolean f() {
        int i2 = this.f46253c;
        return i2 == 2 || i2 == 4 || i2 == 6;
    }

    public final boolean g() {
        int i2 = this.f46253c;
        return (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6) ? false : true;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        int i6 = this.f46252b;
        WeakReference<InterfaceC0819b> weakReference = f46251a;
        InterfaceC0819b interfaceC0819b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0819b != null) {
            interfaceC0819b.a(i2, i3, i4, i5, i6);
        }
    }

    public static void a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || !landingPageStyleConfig.a() || landingPageStyleConfig.b()) {
            return;
        }
        WeakReference<InterfaceC0819b> weakReference = f46251a;
        InterfaceC0819b interfaceC0819b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0819b != null) {
            interfaceC0819b.a(landingPageStyleConfig.f48170c);
        }
    }

    public final boolean a(MotionEvent motionEvent, a aVar) {
        int i2 = this.f46252b;
        WeakReference<InterfaceC0819b> weakReference = f46251a;
        InterfaceC0819b interfaceC0819b = weakReference != null ? weakReference.get() : null;
        if (interfaceC0819b != null) {
            return interfaceC0819b.a(motionEvent, aVar, i2);
        }
        return false;
    }
}

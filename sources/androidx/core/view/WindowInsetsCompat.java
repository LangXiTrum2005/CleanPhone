package androidx.core.view;

import A.I;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f4504b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Impl f4505a;

    public static class Api21ReflectionHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f4506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Field f4507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f4508c;
        public static final boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4506a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4507b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4508c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }
    }

    public static class BuilderImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f4510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Insets[] f4511b;

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            Insets[] insetsArr = this.f4511b;
            if (insetsArr != null) {
                Insets insetsG = insetsArr[0];
                Insets insetsG2 = insetsArr[1];
                WindowInsetsCompat windowInsetsCompat = this.f4510a;
                if (insetsG2 == null) {
                    insetsG2 = windowInsetsCompat.f4505a.g(2);
                }
                if (insetsG == null) {
                    insetsG = windowInsetsCompat.f4505a.g(1);
                }
                g(Insets.a(insetsG, insetsG2));
                Insets insets = this.f4511b[Type.a(16)];
                if (insets != null) {
                    f(insets);
                }
                Insets insets2 = this.f4511b[Type.a(32)];
                if (insets2 != null) {
                    d(insets2);
                }
                Insets insets3 = this.f4511b[Type.a(64)];
                if (insets3 != null) {
                    h(insets3);
                }
            }
        }

        public WindowInsetsCompat b() {
            a();
            return this.f4510a;
        }

        public void c(int i2, Insets insets) {
            if (this.f4511b == null) {
                this.f4511b = new Insets[9];
            }
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    this.f4511b[Type.a(i3)] = insets;
                }
            }
        }

        public void d(Insets insets) {
        }

        public void e(Insets insets) {
        }

        public void f(Insets insets) {
        }

        public void g(Insets insets) {
        }

        public void h(Insets insets) {
        }

        public BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.f4510a = windowInsetsCompat;
        }
    }

    public static class BuilderImpl30 extends BuilderImpl29 {
        public BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void c(int i2, Insets insets) {
            this.f4515c.setInsets(TypeImpl30.a(i2), insets.d());
        }

        public BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class Impl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final WindowInsetsCompat f4516b = new Builder().f4509a.b().f4505a.a().f4505a.b().f4505a.c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f4517a;

        public Impl(WindowInsetsCompat windowInsetsCompat) {
            this.f4517a = windowInsetsCompat;
        }

        public WindowInsetsCompat a() {
            return this.f4517a;
        }

        public WindowInsetsCompat b() {
            return this.f4517a;
        }

        public WindowInsetsCompat c() {
            return this.f4517a;
        }

        public void d(View view) {
        }

        public void e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return o() == impl.o() && n() == impl.n() && Objects.equals(k(), impl.k()) && Objects.equals(i(), impl.i()) && Objects.equals(f(), impl.f());
        }

        public DisplayCutoutCompat f() {
            return null;
        }

        public Insets g(int i2) {
            return Insets.f4296e;
        }

        public Insets h() {
            return k();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public Insets i() {
            return Insets.f4296e;
        }

        public Insets j() {
            return k();
        }

        public Insets k() {
            return Insets.f4296e;
        }

        public Insets l() {
            return k();
        }

        public WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
            return f4516b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(Insets[] insetsArr) {
        }

        public void q(Insets insets) {
        }

        public void r(WindowInsetsCompat windowInsetsCompat) {
        }

        public void s(Insets insets) {
        }
    }

    public static class Impl28 extends Impl21 {
        public Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat a() {
            return WindowInsetsCompat.p(null, this.f4521c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.f4521c, impl28.f4521c) && Objects.equals(this.g, impl28.g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public DisplayCutoutCompat f() {
            DisplayCutout displayCutout = this.f4521c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.f4521c.hashCode();
        }

        public Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    public static class Impl30 extends Impl29 {
        public static final WindowInsetsCompat q = WindowInsetsCompat.p(null, WindowInsets.CONSUMED);

        public Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public final void d(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets g(int i2) {
            return Insets.c(this.f4521c.getInsets(TypeImpl30.a(i2)));
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        public static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    public static final class TypeImpl30 {
        public static int a(int i2) {
            int iStatusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= iStatusBars;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4504b = Impl30.q;
        } else {
            f4504b = Impl.f4516b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f4505a = new Impl30(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f4505a = new Impl29(this, windowInsets);
        } else if (i2 >= 28) {
            this.f4505a = new Impl28(this, windowInsets);
        } else {
            this.f4505a = new Impl21(this, windowInsets);
        }
    }

    public static Insets l(Insets insets, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, insets.f4297a - i2);
        int iMax2 = Math.max(0, insets.f4298b - i3);
        int iMax3 = Math.max(0, insets.f4299c - i4);
        int iMax4 = Math.max(0, insets.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? insets : Insets.b(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat p(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            WindowInsetsCompat windowInsetsCompatA = ViewCompat.Api23Impl.a(view);
            Impl impl = windowInsetsCompat.f4505a;
            impl.r(windowInsetsCompatA);
            impl.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public final WindowInsetsCompat a() {
        return this.f4505a.a();
    }

    public final WindowInsetsCompat b() {
        return this.f4505a.b();
    }

    public final WindowInsetsCompat c() {
        return this.f4505a.c();
    }

    public final DisplayCutoutCompat d() {
        return this.f4505a.f();
    }

    public final Insets e(int i2) {
        return this.f4505a.g(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return Objects.equals(this.f4505a, ((WindowInsetsCompat) obj).f4505a);
    }

    public final void f() {
        this.f4505a.j();
    }

    public final int g() {
        return this.f4505a.k().d;
    }

    public final int h() {
        return this.f4505a.k().f4297a;
    }

    public final int hashCode() {
        Impl impl = this.f4505a;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public final int i() {
        return this.f4505a.k().f4299c;
    }

    public final int j() {
        return this.f4505a.k().f4298b;
    }

    public final WindowInsetsCompat k(int i2, int i3, int i4, int i5) {
        return this.f4505a.m(i2, i3, i4, i5);
    }

    public final boolean m() {
        return this.f4505a.n();
    }

    public final WindowInsetsCompat n(int i2, int i3, int i4, int i5) {
        Builder builder = new Builder(this);
        Insets insetsB = Insets.b(i2, i3, i4, i5);
        BuilderImpl builderImpl = builder.f4509a;
        builderImpl.g(insetsB);
        return builderImpl.b();
    }

    public final WindowInsets o() {
        Impl impl = this.f4505a;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).f4521c;
        }
        return null;
    }

    public static class BuilderImpl20 extends BuilderImpl {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f4512e = null;
        public static boolean f = false;
        public static Constructor g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f4513h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f4514c;
        public Insets d;

        public BuilderImpl20() {
            this.f4514c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    f4512e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = f4512e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f4513h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f4513h = true;
            }
            Constructor constructor = g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatP = WindowInsetsCompat.p(null, this.f4514c);
            Insets[] insetsArr = this.f4511b;
            Impl impl = windowInsetsCompatP.f4505a;
            impl.p(insetsArr);
            impl.s(this.d);
            return windowInsetsCompatP;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void e(Insets insets) {
            this.d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void g(Insets insets) {
            WindowInsets windowInsets = this.f4514c;
            if (windowInsets != null) {
                this.f4514c = windowInsets.replaceSystemWindowInsets(insets.f4297a, insets.f4298b, insets.f4299c, insets.d);
            }
        }

        public BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f4514c = windowInsetsCompat.o();
        }
    }

    public static class BuilderImpl29 extends BuilderImpl {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f4515c;

        public BuilderImpl29() {
            this.f4515c = I.g();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatP = WindowInsetsCompat.p(null, this.f4515c.build());
            windowInsetsCompatP.f4505a.p(this.f4511b);
            return windowInsetsCompatP;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void d(Insets insets) {
            this.f4515c.setMandatorySystemGestureInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void e(Insets insets) {
            this.f4515c.setStableInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void f(Insets insets) {
            this.f4515c.setSystemGestureInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void g(Insets insets) {
            this.f4515c.setSystemWindowInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void h(Insets insets) {
            this.f4515c.setTappableElementInsets(insets.d());
        }

        public BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderG;
            super(windowInsetsCompat);
            WindowInsets windowInsetsO = windowInsetsCompat.o();
            if (windowInsetsO != null) {
                builderG = I.h(windowInsetsO);
            } else {
                builderG = I.g();
            }
            this.f4515c = builderG;
        }
    }

    public static class Impl21 extends Impl20 {
        public Insets m;

        public Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.p(null, this.f4521c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.p(null, this.f4521c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets i() {
            if (this.m == null) {
                WindowInsets windowInsets = this.f4521c;
                this.m = Insets.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean n() {
            return this.f4521c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void s(Insets insets) {
            this.m = insets;
        }

        public Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.m = null;
            this.m = impl21.m;
        }
    }

    public static class Impl20 extends Impl {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f4518h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f4519i;
        public static Class j;
        public static Field k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f4520l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f4521c;
        public Insets[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Insets f4522e;
        public WindowInsetsCompat f;
        public Insets g;

        public Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f4522e = null;
            this.f4521c = windowInsets;
        }

        private Insets t(int i2, boolean z2) {
            Insets insetsA = Insets.f4296e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    insetsA = Insets.a(insetsA, u(i3, z2));
                }
            }
            return insetsA;
        }

        private Insets v() {
            WindowInsetsCompat windowInsetsCompat = this.f;
            return windowInsetsCompat != null ? windowInsetsCompat.f4505a.i() : Insets.f4296e;
        }

        private Insets w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f4518h) {
                x();
            }
            Method method = f4519i;
            if (method != null && j != null && k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(f4520l.get(objInvoke));
                    if (rect != null) {
                        return Insets.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }

        private static void x() {
            try {
                f4519i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                f4520l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                f4520l.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f4518h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void d(View view) {
            Insets insetsW = w(view);
            if (insetsW == null) {
                insetsW = Insets.f4296e;
            }
            q(insetsW);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.f4505a.r(this.f);
            windowInsetsCompat.f4505a.q(this.g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((Impl20) obj).g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets g(int i2) {
            return t(i2, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets k() {
            if (this.f4522e == null) {
                WindowInsets windowInsets = this.f4521c;
                this.f4522e = Insets.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f4522e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
            Builder builder = new Builder(WindowInsetsCompat.p(null, this.f4521c));
            builder.b(WindowInsetsCompat.l(k(), i2, i3, i4, i5));
            Insets insetsL = WindowInsetsCompat.l(i(), i2, i3, i4, i5);
            BuilderImpl builderImpl = builder.f4509a;
            builderImpl.e(insetsL);
            return builderImpl.b();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean o() {
            return this.f4521c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void p(Insets[] insetsArr) {
            this.d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void q(Insets insets) {
            this.g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void r(WindowInsetsCompat windowInsetsCompat) {
            this.f = windowInsetsCompat;
        }

        public Insets u(int i2, boolean z2) {
            Insets insetsI;
            int i3;
            if (i2 == 1) {
                return z2 ? Insets.b(0, Math.max(v().f4298b, k().f4298b), 0, 0) : Insets.b(0, k().f4298b, 0, 0);
            }
            if (i2 == 2) {
                if (z2) {
                    Insets insetsV = v();
                    Insets insetsI2 = i();
                    return Insets.b(Math.max(insetsV.f4297a, insetsI2.f4297a), 0, Math.max(insetsV.f4299c, insetsI2.f4299c), Math.max(insetsV.d, insetsI2.d));
                }
                Insets insetsK = k();
                WindowInsetsCompat windowInsetsCompat = this.f;
                insetsI = windowInsetsCompat != null ? windowInsetsCompat.f4505a.i() : null;
                int iMin = insetsK.d;
                if (insetsI != null) {
                    iMin = Math.min(iMin, insetsI.d);
                }
                return Insets.b(insetsK.f4297a, 0, insetsK.f4299c, iMin);
            }
            Insets insets = Insets.f4296e;
            if (i2 != 8) {
                if (i2 == 16) {
                    return j();
                }
                if (i2 == 32) {
                    return h();
                }
                if (i2 == 64) {
                    return l();
                }
                if (i2 != 128) {
                    return insets;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f;
                DisplayCutoutCompat displayCutoutCompatF = windowInsetsCompat2 != null ? windowInsetsCompat2.f4505a.f() : f();
                return displayCutoutCompatF != null ? Insets.b(displayCutoutCompatF.b(), displayCutoutCompatF.d(), displayCutoutCompatF.c(), displayCutoutCompatF.a()) : insets;
            }
            Insets[] insetsArr = this.d;
            insetsI = insetsArr != null ? insetsArr[Type.a(8)] : null;
            if (insetsI != null) {
                return insetsI;
            }
            Insets insetsK2 = k();
            Insets insetsV2 = v();
            int i4 = insetsK2.d;
            if (i4 > insetsV2.d) {
                return Insets.b(0, 0, 0, i4);
            }
            Insets insets2 = this.g;
            return (insets2 == null || insets2.equals(insets) || (i3 = this.g.d) <= insetsV2.d) ? insets : Insets.b(0, 0, 0, i3);
        }

        public Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.f4521c));
        }
    }

    public static class Impl29 extends Impl28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Insets f4523n;
        public Insets o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Insets f4524p;

        public Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f4523n = null;
            this.o = null;
            this.f4524p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets h() {
            if (this.o == null) {
                this.o = Insets.c(this.f4521c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets j() {
            if (this.f4523n == null) {
                this.f4523n = Insets.c(this.f4521c.getSystemGestureInsets());
            }
            return this.f4523n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets l() {
            if (this.f4524p == null) {
                this.f4524p = Insets.c(this.f4521c.getTappableElementInsets());
            }
            return this.f4524p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
            return WindowInsetsCompat.p(null, this.f4521c.inset(i2, i3, i4, i5));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void s(Insets insets) {
        }

        public Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.f4523n = null;
            this.o = null;
            this.f4524p = null;
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BuilderImpl f4509a;

        public Builder() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f4509a = new BuilderImpl30();
            } else if (i2 >= 29) {
                this.f4509a = new BuilderImpl29();
            } else {
                this.f4509a = new BuilderImpl20();
            }
        }

        public final WindowInsetsCompat a() {
            return this.f4509a.b();
        }

        public final void b(Insets insets) {
            this.f4509a.g(insets);
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f4509a = new BuilderImpl30(windowInsetsCompat);
            } else if (i2 >= 29) {
                this.f4509a = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f4509a = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.f4505a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (impl instanceof Impl30)) {
                this.f4505a = new Impl30(this, (Impl30) impl);
            } else if (i2 >= 29 && (impl instanceof Impl29)) {
                this.f4505a = new Impl29(this, (Impl29) impl);
            } else if (i2 >= 28 && (impl instanceof Impl28)) {
                this.f4505a = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.f4505a = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.f4505a = new Impl20(this, (Impl20) impl);
            } else {
                this.f4505a = new Impl(this);
            }
            impl.e(this);
            return;
        }
        this.f4505a = new Impl(this);
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
class ViewBoundsCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callback f8152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BoundFlags f8153b;

    public static class BoundFlags {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8156c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8157e;

        public final boolean a() {
            int i2;
            int i3;
            int i4;
            int i5 = this.f8154a;
            int i6 = 2;
            if ((i5 & 7) != 0) {
                int i7 = this.d;
                int i8 = this.f8155b;
                if (i7 > i8) {
                    i4 = 1;
                } else {
                    i4 = i7 == i8 ? 2 : 4;
                }
                if ((i4 & i5) == 0) {
                    return false;
                }
            }
            if ((i5 & 112) != 0) {
                int i9 = this.d;
                int i10 = this.f8156c;
                if (i9 > i10) {
                    i3 = 1;
                } else {
                    i3 = i9 == i10 ? 2 : 4;
                }
                if (((i3 << 4) & i5) == 0) {
                    return false;
                }
            }
            if ((i5 & 1792) != 0) {
                int i11 = this.f8157e;
                int i12 = this.f8155b;
                if (i11 > i12) {
                    i2 = 1;
                } else {
                    i2 = i11 == i12 ? 2 : 4;
                }
                if (((i2 << 8) & i5) == 0) {
                    return false;
                }
            }
            if ((i5 & 28672) != 0) {
                int i13 = this.f8157e;
                int i14 = this.f8156c;
                if (i13 > i14) {
                    i6 = 1;
                } else if (i13 != i14) {
                    i6 = 4;
                }
                if ((i5 & (i6 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface Callback {
        int a(View view);

        int b();

        int c();

        View d(int i2);

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.f8152a = callback;
        BoundFlags boundFlags = new BoundFlags();
        boundFlags.f8154a = 0;
        this.f8153b = boundFlags;
    }

    public final View a(int i2, int i3, int i4, int i5) {
        Callback callback = this.f8152a;
        int iB = callback.b();
        int iC = callback.c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewD = callback.d(i2);
            int iA = callback.a(viewD);
            int iE = callback.e(viewD);
            BoundFlags boundFlags = this.f8153b;
            boundFlags.f8155b = iB;
            boundFlags.f8156c = iC;
            boundFlags.d = iA;
            boundFlags.f8157e = iE;
            if (i4 != 0) {
                boundFlags.f8154a = i4;
                if (boundFlags.a()) {
                    return viewD;
                }
            }
            if (i5 != 0) {
                boundFlags.f8154a = i5;
                if (boundFlags.a()) {
                    view = viewD;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public final boolean b(View view) {
        Callback callback = this.f8152a;
        int iB = callback.b();
        int iC = callback.c();
        int iA = callback.a(view);
        int iE = callback.e(view);
        BoundFlags boundFlags = this.f8153b;
        boundFlags.f8155b = iB;
        boundFlags.f8156c = iC;
        boundFlags.d = iA;
        boundFlags.f8157e = iE;
        boundFlags.f8154a = 24579;
        return boundFlags.a();
    }
}

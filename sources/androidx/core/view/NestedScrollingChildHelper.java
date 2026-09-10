package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollingChildHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f4449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f4450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f4451c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f4452e;

    public NestedScrollingChildHelper(ViewGroup viewGroup) {
        this.f4451c = viewGroup;
    }

    public final boolean a(float f, float f2, boolean z2) {
        ViewParent viewParentE;
        if (this.d && (viewParentE = e(0)) != null) {
            try {
                return ViewParentCompat.Api21Impl.a(viewParentE, this.f4451c, f, f2, z2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    public final boolean b(float f, float f2) {
        ViewParent viewParentE;
        if (this.d && (viewParentE = e(0)) != null) {
            try {
                return ViewParentCompat.Api21Impl.b(viewParentE, this.f4451c, f, f2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent viewParentE;
        int i5;
        int i6;
        if (!this.d || (viewParentE = e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f4451c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f4452e == null) {
                this.f4452e = new int[2];
            }
            iArr = this.f4452e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParentE).k(viewGroup, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                ViewParentCompat.Api21Impl.c(viewParentE, viewGroup, i2, i3, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentE;
        int i7;
        int i8;
        int[] iArr3;
        if (this.d && (viewParentE = e(i6)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                ViewGroup viewGroup = this.f4451c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i7 = iArr[0];
                    i8 = iArr[1];
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (iArr2 == null) {
                    if (this.f4452e == null) {
                        this.f4452e = new int[2];
                    }
                    int[] iArr4 = this.f4452e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof NestedScrollingParent3) {
                    ((NestedScrollingParent3) viewParentE).m(viewGroup, i2, i3, i4, i5, i6, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i4;
                    iArr3[1] = iArr3[1] + i5;
                    if (viewParentE instanceof NestedScrollingParent2) {
                        ((NestedScrollingParent2) viewParentE).n(viewGroup, i2, i3, i4, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            ViewParentCompat.Api21Impl.d(viewParentE, viewGroup, i2, i3, i4, i5);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e2);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i8;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f4449a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f4450b;
    }

    public final boolean f(int i2) {
        return e(i2) != null;
    }

    public final void g(boolean z2) {
        if (this.d) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            ViewCompat.Api21Impl.z(this.f4451c);
        }
        this.d = z2;
    }

    public final boolean h(int i2, int i3) {
        boolean zF;
        if (!f(i3)) {
            if (this.d) {
                ViewGroup viewGroup = this.f4451c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof NestedScrollingParent2;
                    if (z2) {
                        zF = ((NestedScrollingParent2) parent).o(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            zF = ViewParentCompat.Api21Impl.f(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            zF = false;
                        }
                    } else {
                        zF = false;
                    }
                    if (zF) {
                        if (i3 == 0) {
                            this.f4449a = parent;
                        } else if (i3 == 1) {
                            this.f4450b = parent;
                        }
                        if (z2) {
                            ((NestedScrollingParent2) parent).j(view, viewGroup, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                ViewParentCompat.Api21Impl.e(parent, view, viewGroup, i2);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void i(int i2) {
        ViewParent viewParentE = e(i2);
        if (viewParentE != null) {
            boolean z2 = viewParentE instanceof NestedScrollingParent2;
            ViewGroup viewGroup = this.f4451c;
            if (z2) {
                ((NestedScrollingParent2) viewParentE).i(i2, viewGroup);
            } else if (i2 == 0) {
                try {
                    ViewParentCompat.Api21Impl.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f4449a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f4450b = null;
            }
        }
    }
}

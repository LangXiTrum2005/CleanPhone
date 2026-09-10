package m0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f45741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f45742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f45743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f45745e;

    public s(ViewGroup viewGroup) {
        this.f45743c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentE;
        if (this.f45744d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f45743c, f10, f11, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f45744d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f45743c, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentE;
        int i13;
        int i14;
        if (!this.f45744d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f45743c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f45745e == null) {
                this.f45745e = new int[2];
            }
            iArr = this.f45745e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof t) {
            ((t) viewParentE).f(iArr, i10, i11, i12);
        } else if (i12 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        if (this.f45744d && (viewParentE = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                ViewGroup viewGroup = this.f45743c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f45745e == null) {
                        this.f45745e = new int[2];
                    }
                    int[] iArr4 = this.f45745e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof u) {
                    ((u) viewParentE).d(viewGroup, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (viewParentE instanceof t) {
                        ((t) viewParentE).c(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i10, i11, i12, i13);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
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

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.f45741a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f45742b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (!f(i11)) {
            if (this.f45744d) {
                View view = this.f45743c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof t;
                    if (z10) {
                        zOnStartNestedScroll = ((t) parent).e(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i11 == 0) {
                            this.f45741a = parent;
                        } else if (i11 == 1) {
                            this.f45742b = parent;
                        }
                        if (z10) {
                            ((t) parent).a(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof t;
            ViewGroup viewGroup = this.f45743c;
            if (z10) {
                ((t) viewParentE).b(viewGroup, i10);
            } else if (i10 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f45741a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f45742b = null;
            }
        }
    }
}

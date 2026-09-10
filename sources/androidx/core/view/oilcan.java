package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: NestedScrollingChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ViewParent f9372attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final View f9373dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int[] f9374marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ViewParent f9375saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f9376wireman;

    public oilcan(View view) {
        this.f9373dern = view;
    }

    public boolean apical() {
        return formularize(0);
    }

    public boolean arytenoidectomy(int i) {
        return monoploid(i, 0);
    }

    public boolean attabal(float f, float f2, boolean z) {
        ViewParent viewParentTaiyuan;
        if (!impassible() || (viewParentTaiyuan = taiyuan(0)) == null) {
            return false;
        }
        return lerp.attabal(viewParentTaiyuan, this.f9373dern, f, f2, z);
    }

    public boolean beachfront(int i, int i2, int i3, int i4, int[] iArr) {
        return impromptu(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean competently(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return impromptu(i, i2, i3, i4, iArr, i5, null);
    }

    public final int[] cutely() {
        if (this.f9374marial == null) {
            this.f9374marial = new int[2];
        }
        return this.f9374marial;
    }

    public boolean dern(int i, int i2, int[] iArr, int[] iArr2) {
        return wireman(i, i2, iArr, iArr2, 0);
    }

    public boolean formularize(int i) {
        return taiyuan(i) != null;
    }

    public boolean impassible() {
        return this.f9376wireman;
    }

    public final boolean impromptu(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentTaiyuan;
        int i6;
        int i7;
        int[] iArr3;
        if (!impassible() || (viewParentTaiyuan = taiyuan(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f9373dern.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrCutely = cutely();
            iArrCutely[0] = 0;
            iArrCutely[1] = 0;
            iArr3 = iArrCutely;
        } else {
            iArr3 = iArr2;
        }
        lerp.wireman(viewParentTaiyuan, this.f9373dern, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f9373dern.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final void kowloon(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f9372attabal = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f9375saneness = viewParent;
        }
    }

    public void marial(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        impromptu(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void molybdenite(int i) {
        ViewParent viewParentTaiyuan = taiyuan(i);
        if (viewParentTaiyuan != null) {
            lerp.competently(viewParentTaiyuan, this.f9373dern, i);
            kowloon(i, null);
        }
    }

    public boolean monoploid(int i, int i2) {
        if (formularize(i2)) {
            return true;
        }
        if (!impassible()) {
            return false;
        }
        View view = this.f9373dern;
        for (ViewParent parent = this.f9373dern.getParent(); parent != null; parent = parent.getParent()) {
            if (lerp.beachfront(parent, view, this.f9373dern, i, i2)) {
                kowloon(i2, parent);
                lerp.marial(parent, view, this.f9373dern, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void polloi() {
        molybdenite(0);
    }

    public boolean saneness(float f, float f2) {
        ViewParent viewParentTaiyuan;
        if (!impassible() || (viewParentTaiyuan = taiyuan(0)) == null) {
            return false;
        }
        return lerp.saneness(viewParentTaiyuan, this.f9373dern, f, f2);
    }

    public final ViewParent taiyuan(int i) {
        if (i == 0) {
            return this.f9372attabal;
        }
        if (i != 1) {
            return null;
        }
        return this.f9375saneness;
    }

    public void triweekly(boolean z) {
        if (this.f9376wireman) {
            premeiotic.technofreak(this.f9373dern);
        }
        this.f9376wireman = z;
    }

    public boolean wireman(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentTaiyuan;
        int i4;
        int i5;
        if (!impassible() || (viewParentTaiyuan = taiyuan(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f9373dern.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = cutely();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        lerp.dern(viewParentTaiyuan, this.f9373dern, i, i2, iArr3, i3);
        if (iArr2 != null) {
            this.f9373dern.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }
}

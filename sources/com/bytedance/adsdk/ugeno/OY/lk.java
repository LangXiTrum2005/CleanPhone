package com.bytedance.adsdk.ugeno.OY;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lk extends ViewGroup {
    private float BcA;
    private float CG;
    private boolean CSn;
    private float DY;
    private int FD;
    private int HD;
    private lc IeN;
    private boolean Ivz;
    private int JJ;
    private Parcelable JVA;
    private boolean JZE;
    private boolean KPU;
    private List<Object> LXE;
    private EdgeEffect Ld;
    private boolean Lpq;
    private int Lxb;
    private int MGT;
    private int NDz;
    private Scroller NXR;
    private boolean Ns;
    private ZU Nu;
    private final LD OY;
    private EdgeEffect Of;
    private VelocityTracker Pw;
    private final Rect QAg;
    private ZU SS;
    private boolean STP;
    private float Sfi;
    private int Sv;
    private int VU;
    private int VVE;
    int ZU;
    private boolean aH;
    private int ae;
    private int brP;
    private int dR;
    private int eK;
    private final ArrayList<LD> ebl;
    private int foI;
    private int hg;
    private boolean id;
    private final Runnable jeq;
    private Drawable kqm;
    private float le;
    com.bytedance.adsdk.ugeno.OY.LD lk;
    private int nBu;
    private int nE;
    private float nJ;
    private int rW;
    private ClassLoader sLN;
    private boolean sRq;
    private int tD;
    private List<ZU> uxf;
    private JXs wbY;
    private int xan;
    private ArrayList<View> xr;
    static final int[] LD = {R.attr.layout_gravity};
    private static final Comparator<LD> JXs = new Comparator<LD>() { // from class: com.bytedance.adsdk.ugeno.OY.lk.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public int compare(LD ld, LD ld2) {
            return ld.LD - ld2.LD;
        }
    };
    private static final Interpolator lc = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.OY.lk.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final OY bG = new OY();

    public interface JXs {
        void Lxb(View view, float f);
    }

    public static class LD {
        float JXs;
        int LD;
        Object Lxb;
        float ZU;
        boolean lk;
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lxb {
    }

    public static class OY implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0032lk c0032lk = (C0032lk) view.getLayoutParams();
            C0032lk c0032lk2 = (C0032lk) view2.getLayoutParams();
            boolean z = c0032lk.Lxb;
            if (z != c0032lk2.Lxb) {
                return z ? 1 : -1;
            }
            return c0032lk.JXs - c0032lk2.JXs;
        }
    }

    public interface ZU {
        void Lxb(int i, float f, int i2);

        void OY(int i);
    }

    public static class ebl extends com.bytedance.adsdk.ugeno.OY.Lxb {
        public static final Parcelable.Creator<ebl> CREATOR = new Parcelable.ClassLoaderCreator<ebl>() { // from class: com.bytedance.adsdk.ugeno.OY.lk.ebl.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public ebl createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ebl(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public ebl createFromParcel(Parcel parcel) {
                return new ebl(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public ebl[] newArray(int i) {
                return new ebl[i];
            }
        };
        int LD;
        ClassLoader ZU;
        Parcelable lk;

        public ebl(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return AbstractC5044xl.o(sb, this.LD, "}");
        }

        @Override // com.bytedance.adsdk.ugeno.OY.Lxb, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LD);
            parcel.writeParcelable(this.lk, i);
        }

        public ebl(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.LD = parcel.readInt();
            this.lk = parcel.readParcelable(classLoader);
            this.ZU = classLoader;
        }
    }

    public class lc extends DataSetObserver {
        public lc() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            lk.this.LD();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            lk.this.LD();
        }
    }

    public lk(Context context) {
        super(context);
        this.ebl = new ArrayList<>();
        this.OY = new LD();
        this.QAg = new Rect();
        this.nBu = -1;
        this.JVA = null;
        this.sLN = null;
        this.DY = -3.4028235E38f;
        this.Sfi = Float.MAX_VALUE;
        this.foI = 1;
        this.rW = -1;
        this.JZE = true;
        this.Lpq = false;
        this.jeq = new Runnable() { // from class: com.bytedance.adsdk.ugeno.OY.lk.3
            @Override // java.lang.Runnable
            public void run() {
                lk.this.setScrollState(0);
                lk.this.lk();
            }
        };
        this.MGT = 0;
        Lxb();
    }

    private void JXs(int i) {
        ZU zu = this.Nu;
        if (zu != null) {
            zu.OY(i);
        }
        List<ZU> list = this.uxf;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ZU zu2 = this.uxf.get(i2);
                if (zu2 != null) {
                    zu2.OY(i);
                }
            }
        }
        ZU zu3 = this.SS;
        if (zu3 != null) {
            zu3.OY(i);
        }
    }

    private boolean OY() {
        this.rW = -1;
        nBu();
        this.Of.onRelease();
        this.Ld.onRelease();
        return this.Of.isFinished() || this.Ld.isFinished();
    }

    private LD QAg() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.VVE / clientWidth : 0.0f;
        LD ld = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.ebl.size()) {
            LD ld2 = this.ebl.get(i3);
            if (!z && ld2.LD != (i = i2 + 1)) {
                ld2 = this.OY;
                ld2.JXs = f + f3 + f2;
                ld2.LD = i;
                ld2.ZU = this.lk.Lxb(i);
                i3--;
            }
            LD ld3 = ld2;
            f = ld3.JXs;
            float f4 = ld3.ZU + f + f2;
            if (!z && scrollX < f) {
                return ld;
            }
            if (scrollX < f4 || i3 == this.ebl.size() - 1) {
                return ld3;
            }
            int i4 = ld3.LD;
            float f5 = ld3.ZU;
            i3++;
            z = false;
            i2 = i4;
            f3 = f5;
            ld = ld3;
        }
        return ld;
    }

    private boolean ZU(int i) {
        if (this.ebl.size() == 0) {
            if (this.JZE) {
                return false;
            }
            this.Ns = false;
            Lxb(0, 0.0f, 0);
            if (this.Ns) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        LD ldQAg = QAg();
        int clientWidth = getClientWidth();
        int i2 = this.VVE;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = ldQAg.LD;
        float f2 = ((i / f) - ldQAg.JXs) / (ldQAg.ZU + (i2 / f));
        this.Ns = false;
        Lxb(i4, f2, (int) (i3 * f2));
        if (this.Ns) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void ebl() {
        if (this.ae != 0) {
            ArrayList<View> arrayList = this.xr;
            if (arrayList == null) {
                this.xr = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.xr.add(getChildAt(i));
            }
            Collections.sort(this.xr, bG);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void lc() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0032lk) getChildAt(i).getLayoutParams()).Lxb) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void nBu() {
        this.KPU = false;
        this.Ivz = false;
        VelocityTracker velocityTracker = this.Pw;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Pw = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.CSn != z) {
            this.CSn = z;
        }
    }

    public void LD() {
        int iLxb = this.lk.Lxb();
        this.Lxb = iLxb;
        boolean z = this.ebl.size() < (this.foI * 2) + 1 && this.ebl.size() < iLxb;
        int iMax = this.ZU;
        int i = 0;
        while (i < this.ebl.size()) {
            LD ld = this.ebl.get(i);
            int iLxb2 = this.lk.Lxb(ld.Lxb);
            if (iLxb2 != -1) {
                if (iLxb2 == -2) {
                    this.ebl.remove(i);
                    i--;
                    this.lk.Lxb((ViewGroup) this, ld.LD, ld.Lxb);
                    int i2 = this.ZU;
                    if (i2 == ld.LD) {
                        iMax = Math.max(0, Math.min(i2, iLxb - 1));
                    }
                } else {
                    int i3 = ld.LD;
                    if (i3 != iLxb2) {
                        if (i3 == this.ZU) {
                            iMax = iLxb2;
                        }
                        ld.LD = iLxb2;
                    }
                }
                z = true;
            }
            i++;
        }
        Collections.sort(this.ebl, JXs);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0032lk c0032lk = (C0032lk) getChildAt(i4).getLayoutParams();
                if (!c0032lk.Lxb) {
                    c0032lk.lk = 0.0f;
                }
            }
            Lxb(iMax, false, true);
            requestLayout();
        }
    }

    public void Lxb() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.NXR = new Scroller(context, lc);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.hg = viewConfiguration.getScaledPagingTouchSlop();
        this.dR = (int) (400.0f * f);
        this.NDz = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Of = new EdgeEffect(context);
        this.Ld = new EdgeEffect(context);
        this.JJ = (int) (25.0f * f);
        this.VU = (int) (2.0f * f);
        this.nE = (int) (f * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LD ldLxb;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (ldLxb = Lxb(childAt)) != null && ldLxb.LD == this.ZU) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        LD ldLxb;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ldLxb = Lxb(childAt)) != null && ldLxb.LD == this.ZU) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0032lk c0032lk = (C0032lk) layoutParams;
        boolean zLk = c0032lk.Lxb | lk(view);
        c0032lk.Lxb = zLk;
        if (!this.aH) {
            super.addView(view, i, layoutParams);
        } else {
            if (zLk) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0032lk.ZU = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.lk == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.DY));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.Sfi));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0032lk) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.STP = true;
        if (this.NXR.isFinished() || !this.NXR.computeScrollOffset()) {
            Lxb(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.NXR.getCurrX();
        int currY = this.NXR.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!ZU(currX)) {
                this.NXR.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || Lxb(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        LD ldLxb;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ldLxb = Lxb(childAt)) != null && ldLxb.LD == this.ZU && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        com.bytedance.adsdk.ugeno.OY.LD ld;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (ld = this.lk) == null || ld.Lxb() <= 1)) {
            this.Of.finish();
            this.Ld.finish();
            return;
        }
        if (this.Of.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate(getPaddingTop() + (-height), this.DY * width);
            this.Of.setSize(height, width);
            zDraw = this.Of.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.Ld.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.Sfi + 1.0f)) * width2);
            this.Ld.setSize(height2, width2);
            zDraw |= this.Ld.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.kqm;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0032lk();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.OY.LD getAdapter() {
        return this.lk;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.ae == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0032lk) this.xr.get(i2).getLayoutParams()).lc;
    }

    public int getCurrentItem() {
        return this.ZU;
    }

    public int getOffscreenPageLimit() {
        return this.foI;
    }

    public int getPageMargin() {
        return this.VVE;
    }

    public void lk() {
        Lxb(this.ZU);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.JZE = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.jeq);
        Scroller scroller = this.NXR;
        if (scroller != null && !scroller.isFinished()) {
            this.NXR.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.VVE <= 0 || this.kqm == null || this.ebl.size() <= 0 || this.lk == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.VVE / f2;
        int i2 = 0;
        LD ld = this.ebl.get(0);
        float f4 = ld.JXs;
        int size = this.ebl.size();
        int i3 = ld.LD;
        int i4 = this.ebl.get(size - 1).LD;
        while (i3 < i4) {
            while (true) {
                i = ld.LD;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                ld = this.ebl.get(i2);
            }
            if (i3 == i) {
                float f5 = ld.JXs;
                float f6 = ld.ZU;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float fLxb = this.lk.Lxb(i3);
                f = (f4 + fLxb) * f2;
                f4 = fLxb + f3 + f4;
            }
            if (this.VVE + f > scrollX) {
                this.kqm.setBounds(Math.round(f), this.brP, Math.round(this.VVE + f), this.tD);
                this.kqm.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            f3 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            OY();
            return false;
        }
        if (action != 0) {
            if (this.KPU) {
                return true;
            }
            if (this.Ivz) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.le = x;
            this.CG = x;
            float y = motionEvent.getY();
            this.BcA = y;
            this.nJ = y;
            this.rW = motionEvent.getPointerId(0);
            this.Ivz = false;
            this.STP = true;
            this.NXR.computeScrollOffset();
            if (this.MGT != 2 || Math.abs(this.NXR.getFinalX() - this.NXR.getCurrX()) <= this.VU) {
                Lxb(false);
                this.KPU = false;
            } else {
                this.NXR.abortAnimation();
                this.id = false;
                lk();
                this.KPU = true;
                lk(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.rW;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.CG;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.BcA);
                if (f != 0.0f && !Lxb(this.CG, f) && Lxb(this, false, (int) f, (int) x2, (int) y2)) {
                    this.CG = x2;
                    this.nJ = y2;
                    this.Ivz = true;
                    return false;
                }
                int i2 = this.hg;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.KPU = true;
                    lk(true);
                    setScrollState(1);
                    float f2 = this.le;
                    float f3 = this.hg;
                    this.CG = f > 0.0f ? f2 + f3 : f2 - f3;
                    this.nJ = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.Ivz = true;
                }
                if (this.KPU && LD(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            Lxb(motionEvent);
        }
        if (this.Pw == null) {
            this.Pw = VelocityTracker.obtain();
        }
        this.Pw.addMovement(motionEvent);
        return this.KPU;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        LD ldLxb;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0032lk c0032lk = (C0032lk) childAt.getLayoutParams();
                if (c0032lk.Lxb) {
                    int i9 = c0032lk.LD;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C0032lk c0032lk2 = (C0032lk) childAt2.getLayoutParams();
                if (!c0032lk2.Lxb && (ldLxb = Lxb(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (ldLxb.JXs * f)) + paddingLeft;
                    if (c0032lk2.ZU) {
                        c0032lk2.ZU = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0032lk2.lk), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.brP = paddingTop;
        this.tD = i6 - paddingBottom;
        this.Sv = i7;
        if (this.JZE) {
            z2 = false;
            Lxb(this.ZU, false, 0, false);
        } else {
            z2 = false;
        }
        this.JZE = z2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae A[SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0032lk c0032lk;
        C0032lk c0032lk2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.xan = Math.min(measuredWidth / 10, this.nE);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (c0032lk2 = (C0032lk) childAt.getLayoutParams()) != null && c0032lk2.Lxb) {
                int i8 = c0032lk2.LD;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                    i4 = ((ViewGroup.LayoutParams) c0032lk2).width;
                    if (i4 != -2) {
                        if (i4 == -1) {
                            i4 = paddingLeft;
                        }
                        i11 = 1073741824;
                    } else {
                        i4 = paddingLeft;
                    }
                    i5 = ((ViewGroup.LayoutParams) c0032lk2).height;
                    if (i5 != -2) {
                        i5 = measuredHeight;
                        i7 = i3;
                    } else if (i5 == -1) {
                        i5 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                    if (z2) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = ((ViewGroup.LayoutParams) c0032lk2).width;
                if (i4 != -2) {
                    if (i4 == -1) {
                        i4 = paddingLeft;
                    }
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                i5 = ((ViewGroup.LayoutParams) c0032lk2).height;
                if (i5 != -2) {
                    i5 = measuredHeight;
                    i7 = i3;
                } else if (i5 == -1) {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        this.HD = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.eK = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.aH = true;
        lk();
        this.aH = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0032lk = (C0032lk) childAt2.getLayoutParams()) == null || !c0032lk.Lxb)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0032lk.lk), 1073741824), this.eK);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        LD ldLxb;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (ldLxb = Lxb(childAt)) != null && ldLxb.LD == this.ZU && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ebl)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ebl eblVar = (ebl) parcelable;
        super.onRestoreInstanceState(eblVar.Lxb());
        if (this.lk != null) {
            Lxb(eblVar.LD, false, true);
            return;
        }
        this.nBu = eblVar.LD;
        this.JVA = eblVar.lk;
        this.sLN = eblVar.ZU;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ebl eblVar = new ebl(super.onSaveInstanceState());
        eblVar.LD = this.ZU;
        com.bytedance.adsdk.ugeno.OY.LD ld = this.lk;
        if (ld != null) {
            eblVar.lk = ld.LD();
        }
        return eblVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.VVE;
            Lxb(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.OY.LD ld;
        boolean zOY;
        int iFindPointerIndex;
        if (this.sRq) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (ld = this.lk) == null || ld.Lxb() == 0) {
            return false;
        }
        if (this.Pw == null) {
            this.Pw = VelocityTracker.obtain();
        }
        this.Pw.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.NXR.abortAnimation();
            this.id = false;
            lk();
            float x = motionEvent.getX();
            this.le = x;
            this.CG = x;
            float y = motionEvent.getY();
            this.BcA = y;
            this.nJ = y;
            this.rW = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.CG = motionEvent.getX(actionIndex);
                            this.rW = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        Lxb(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.rW);
                        if (iFindPointerIndex2 != -1) {
                            this.CG = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.KPU) {
                    Lxb(this.ZU, true, 0, false);
                    zOY = OY();
                    if (zOY) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (!this.KPU) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.rW);
                if (iFindPointerIndex3 == -1) {
                    zOY = OY();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x2 - this.CG);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y2 - this.nJ);
                    if (fAbs > this.hg && fAbs > fAbs2) {
                        this.KPU = true;
                        lk(true);
                        float f = this.le;
                        this.CG = x2 - f > 0.0f ? f + this.hg : f - this.hg;
                        this.nJ = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.KPU) {
                        zOY = LD(motionEvent.getX(iFindPointerIndex));
                    }
                }
                if (zOY) {
                    postInvalidateOnAnimation();
                }
            } else if (this.KPU && (iFindPointerIndex = motionEvent.findPointerIndex(this.rW)) != -1) {
                zOY = LD(motionEvent.getX(iFindPointerIndex));
                if (zOY) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (this.KPU) {
            VelocityTracker velocityTracker = this.Pw;
            velocityTracker.computeCurrentVelocity(1000, this.NDz);
            int xVelocity = (int) velocityTracker.getXVelocity(this.rW);
            this.id = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            LD ldQAg = QAg();
            float f2 = clientWidth;
            float f3 = this.VVE / f2;
            int i = ldQAg.LD;
            float f4 = ((scrollX / f2) - ldQAg.JXs) / (ldQAg.ZU + f3);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.rW);
            if (iFindPointerIndex4 != -1) {
                Lxb(Lxb(i, f4, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.le)), true, true, xVelocity);
                zOY = OY();
                if (zOY) {
                    postInvalidateOnAnimation();
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.aH) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.OY.LD ld) {
        com.bytedance.adsdk.ugeno.OY.LD ld2 = this.lk;
        if (ld2 != null) {
            ld2.Lxb((DataSetObserver) null);
            for (int i = 0; i < this.ebl.size(); i++) {
                LD ld3 = this.ebl.get(i);
                this.lk.Lxb((ViewGroup) this, ld3.LD, ld3.Lxb);
            }
            this.ebl.clear();
            lc();
            this.ZU = 0;
            scrollTo(0, 0);
        }
        this.lk = ld;
        this.Lxb = 0;
        if (ld != null) {
            if (this.IeN == null) {
                this.IeN = new lc();
            }
            this.lk.Lxb((DataSetObserver) this.IeN);
            this.id = false;
            boolean z = this.JZE;
            this.JZE = true;
            this.Lxb = this.lk.Lxb();
            int i2 = this.nBu;
            if (i2 >= 0) {
                Lxb(i2, false, true);
                this.nBu = -1;
                this.JVA = null;
                this.sLN = null;
            } else if (z) {
                requestLayout();
            } else {
                lk();
            }
        }
        List<Object> list = this.LXE;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.LXE.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.LXE.get(i3);
        }
    }

    public void setCurrentItem(int i) {
        this.id = false;
        Lxb(i, !this.JZE, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.foI) {
            this.foI = i;
            lk();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(ZU zu) {
        this.Nu = zu;
    }

    public void setPageMargin(int i) {
        int i2 = this.VVE;
        this.VVE = i;
        int width = getWidth();
        Lxb(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.kqm = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.MGT == i) {
            return;
        }
        this.MGT = i;
        if (this.wbY != null) {
            LD(i != 0);
        }
        lc(i);
    }

    public void setScroller(Scroller scroller) {
        this.NXR = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.kqm;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.OY.lk$lk, reason: collision with other inner class name */
    public static class C0032lk extends ViewGroup.LayoutParams {
        int JXs;
        public int LD;
        public boolean Lxb;
        boolean ZU;
        int lc;
        float lk;

        public C0032lk() {
            super(-1, -1);
            this.lk = 0.0f;
        }

        public C0032lk(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.lk = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lk.LD);
            this.LD = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean lk(View view) {
        return view.getClass().getAnnotation(Lxb.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0032lk(getContext(), attributeSet);
    }

    private void lk(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    private void lc(int i) {
        List<ZU> list = this.uxf;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.uxf.get(i2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    public boolean lk(int i) {
        boolean zZU;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zZU = ZU();
            } else if (i == 66 || i == 2) {
                zZU = JXs();
            } else {
                zZU = false;
            }
        } else if (i == 17) {
            int i2 = Lxb(this.QAg, viewFindNextFocus).left;
            int i3 = Lxb(this.QAg, viewFindFocus).left;
            if (viewFindFocus != null && i2 >= i3) {
                zZU = ZU();
            } else {
                zZU = viewFindNextFocus.requestFocus();
            }
        } else if (i == 66) {
            int i4 = Lxb(this.QAg, viewFindNextFocus).left;
            int i5 = Lxb(this.QAg, viewFindFocus).left;
            if (viewFindFocus == null || i4 > i5) {
                zZU = viewFindNextFocus.requestFocus();
            } else {
                zZU = JXs();
            }
        } else {
            zZU = false;
        }
        if (zZU) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zZU;
    }

    public boolean JXs() {
        com.bytedance.adsdk.ugeno.OY.LD ld = this.lk;
        if (ld == null || this.ZU >= ld.Lxb() - 1) {
            return false;
        }
        Lxb(this.ZU + 1, true);
        return true;
    }

    public void Lxb(int i, boolean z) {
        this.id = false;
        Lxb(i, z, false);
    }

    public boolean ZU() {
        int i = this.ZU;
        if (i <= 0) {
            return false;
        }
        Lxb(i - 1, true);
        return true;
    }

    public void Lxb(int i, boolean z, boolean z2) {
        Lxb(i, z, z2, 0);
    }

    public void Lxb(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.OY.LD ld = this.lk;
        if (ld != null && ld.Lxb() > 0) {
            if (!z2 && this.ZU == i && this.ebl.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.lk.Lxb()) {
                i = this.lk.Lxb() - 1;
            }
            int i3 = this.foI;
            int i4 = this.ZU;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.ebl.size(); i5++) {
                    this.ebl.get(i5).lk = true;
                }
            }
            boolean z3 = this.ZU != i;
            if (this.JZE) {
                this.ZU = i;
                if (z3) {
                    JXs(i);
                }
                requestLayout();
                return;
            }
            Lxb(i);
            Lxb(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public LD LD(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return Lxb(view);
            }
        }
    }

    public LD LD(int i) {
        for (int i2 = 0; i2 < this.ebl.size(); i2++) {
            LD ld = this.ebl.get(i2);
            if (ld.LD == i) {
                return ld;
            }
        }
        return null;
    }

    private void LD(int i, float f, int i2) {
        ZU zu = this.Nu;
        if (zu != null) {
            zu.Lxb(i, f, i2);
        }
        List<ZU> list = this.uxf;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ZU zu2 = this.uxf.get(i3);
                if (zu2 != null) {
                    zu2.Lxb(i, f, i2);
                }
            }
        }
        ZU zu3 = this.SS;
        if (zu3 != null) {
            zu3.Lxb(i, f, i2);
        }
    }

    private void Lxb(int i, boolean z, int i2, boolean z2) {
        int iMax;
        LD LD2 = LD(i);
        if (LD2 != null) {
            iMax = (int) (Math.max(this.DY, Math.min(LD2.JXs, this.Sfi)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            Lxb(iMax, 0, i2);
            if (z2) {
                JXs(i);
                return;
            }
            return;
        }
        if (z2) {
            JXs(i);
        }
        Lxb(false);
        scrollTo(iMax, 0);
        ZU(iMax);
    }

    private void LD(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.FD : 0, null);
        }
    }

    private boolean LD(float f) {
        boolean z;
        boolean z2;
        float f2 = this.CG - f;
        this.CG = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.DY * clientWidth;
        float f4 = this.Sfi * clientWidth;
        boolean z3 = false;
        LD ld = this.ebl.get(0);
        LD ld2 = (LD) DM.e(this.ebl, 1);
        if (ld.LD != 0) {
            f3 = ld.JXs * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (ld2.LD != this.lk.Lxb() - 1) {
            f4 = ld2.JXs * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.Of.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.Ld.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.CG = (scrollX - i) + this.CG;
        scrollTo(i, getScrollY());
        ZU(i);
        return z3;
    }

    public void Lxb(ZU zu) {
        if (this.uxf == null) {
            this.uxf = new ArrayList();
        }
        this.uxf.add(zu);
    }

    public void Lxb(boolean z, JXs jXs) {
        Lxb(z, jXs, 2);
    }

    public void Lxb(boolean z, JXs jXs, int i) {
        boolean z2 = jXs != null;
        boolean z3 = z2 != (this.wbY != null);
        this.wbY = jXs;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.ae = z ? 2 : 1;
            this.FD = i;
        } else {
            this.ae = 0;
        }
        if (z3) {
            lk();
        }
    }

    public float Lxb(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void Lxb(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.NXR;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.STP ? this.NXR.getCurrX() : this.NXR.getStartX();
            this.NXR.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            Lxb(false);
            lk();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fLxb = (Lxb(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fLxb / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i5) / ((this.lk.Lxb(this.ZU) * f) + this.VVE)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.STP = false;
        this.NXR.startScroll(i4, scrollY, i5, i6, iMin);
        postInvalidateOnAnimation();
    }

    public LD Lxb(int i, int i2) {
        LD ld = new LD();
        ld.LD = i;
        ld.Lxb = this.lk.Lxb((ViewGroup) this, i);
        ld.ZU = this.lk.Lxb(i);
        if (i2 >= 0 && i2 < this.ebl.size()) {
            this.ebl.add(i2, ld);
        } else {
            this.ebl.add(ld);
        }
        return ld;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c5 A[PHI: r7 r10 r14
  0x00c5: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:63:0x00e9, B:60:0x00d3, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00e9, B:60:0x00d3, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00e9, B:60:0x00d3, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    public void Lxb(int i) {
        LD LD2;
        String hexString;
        LD ldLxb;
        LD ldLxb2;
        LD ld;
        int i2 = this.ZU;
        if (i2 != i) {
            LD2 = LD(i2);
            this.ZU = i;
        } else {
            LD2 = null;
        }
        if (this.lk == null) {
            ebl();
            return;
        }
        if (this.id) {
            ebl();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.foI;
        int iMax = Math.max(0, this.ZU - i3);
        int iLxb = this.lk.Lxb();
        int iMin = Math.min(iLxb - 1, this.ZU + i3);
        if (iLxb == this.Lxb) {
            int i4 = 0;
            while (true) {
                if (i4 < this.ebl.size()) {
                    ldLxb = this.ebl.get(i4);
                    int i5 = ldLxb.LD;
                    int i6 = this.ZU;
                    if (i5 >= i6) {
                        if (i5 != i6) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i4++;
                }
                ldLxb = null;
                break;
            }
            if (ldLxb == null && iLxb > 0) {
                ldLxb = Lxb(this.ZU, i4);
            }
            if (ldLxb != null) {
                int i7 = i4 - 1;
                LD ld2 = i7 >= 0 ? this.ebl.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - ldLxb.ZU);
                float f = 0.0f;
                for (int i8 = this.ZU - 1; i8 >= 0; i8--) {
                    if (f >= paddingLeft && i8 < iMax) {
                        if (ld2 == null) {
                            break;
                        }
                        if (i8 == ld2.LD && !ld2.lk) {
                            this.ebl.remove(i7);
                            this.lk.Lxb((ViewGroup) this, i8, ld2.Lxb);
                            i7--;
                            i4--;
                            if (i7 >= 0) {
                                ld = this.ebl.get(i7);
                            } else {
                                ld = null;
                            }
                            ld2 = ld;
                        }
                    } else {
                        if (ld2 != null && i8 == ld2.LD) {
                            f += ld2.ZU;
                            i7--;
                            if (i7 >= 0) {
                                ld = this.ebl.get(i7);
                            } else {
                                ld = null;
                            }
                        } else {
                            f += Lxb(i8, i7 + 1).ZU;
                            i4++;
                            if (i7 >= 0) {
                                ld = this.ebl.get(i7);
                            } else {
                                ld = null;
                            }
                        }
                        ld2 = ld;
                    }
                }
                float f2 = ldLxb.ZU;
                int i9 = i4 + 1;
                if (f2 < 2.0f) {
                    LD ld3 = i9 < this.ebl.size() ? this.ebl.get(i9) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i10 = this.ZU;
                    while (true) {
                        i10++;
                        if (i10 >= iLxb) {
                            break;
                        }
                        if (f2 >= paddingRight && i10 > iMin) {
                            if (ld3 == null) {
                                break;
                            }
                            if (i10 == ld3.LD && !ld3.lk) {
                                this.ebl.remove(i9);
                                this.lk.Lxb((ViewGroup) this, i10, ld3.Lxb);
                                if (i9 < this.ebl.size()) {
                                    ld3 = this.ebl.get(i9);
                                }
                            }
                        } else if (ld3 != null && i10 == ld3.LD) {
                            f2 += ld3.ZU;
                            i9++;
                            if (i9 < this.ebl.size()) {
                                ld3 = this.ebl.get(i9);
                            }
                        } else {
                            LD ldLxb3 = Lxb(i10, i9);
                            i9++;
                            f2 += ldLxb3.ZU;
                            ld3 = i9 < this.ebl.size() ? this.ebl.get(i9) : null;
                        }
                    }
                }
                Lxb(ldLxb, i4, LD2);
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C0032lk c0032lk = (C0032lk) childAt.getLayoutParams();
                c0032lk.lc = i11;
                if (!c0032lk.Lxb && c0032lk.lk == 0.0f && (ldLxb2 = Lxb(childAt)) != null) {
                    c0032lk.lk = ldLxb2.ZU;
                    c0032lk.JXs = ldLxb2.LD;
                }
            }
            ebl();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                LD LD3 = viewFindFocus != null ? LD(viewFindFocus) : null;
                if (LD3 == null || LD3.LD != this.ZU) {
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        View childAt2 = getChildAt(i12);
                        LD ldLxb4 = Lxb(childAt2);
                        if (ldLxb4 != null && ldLxb4.LD == this.ZU && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
        AbstractC3888ke0.t(sb, this.Lxb, ", found: ", iLxb, " Pager id: ");
        sb.append(hexString);
        sb.append(" Pager class: ");
        sb.append(getClass());
        sb.append(" Problematic adapter: ");
        sb.append(this.lk.getClass());
        throw new IllegalStateException(sb.toString());
    }

    private void Lxb(LD ld, int i, LD ld2) {
        int i2;
        int i3;
        LD ld3;
        LD ld4;
        int iLxb = this.lk.Lxb();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.VVE / clientWidth : 0.0f;
        if (ld2 != null) {
            int i4 = ld2.LD;
            int i5 = ld.LD;
            if (i4 < i5) {
                float fLxb = ld2.JXs + ld2.ZU + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= ld.LD && i7 < this.ebl.size()) {
                    LD ld5 = this.ebl.get(i7);
                    while (true) {
                        ld4 = ld5;
                        if (i6 <= ld4.LD || i7 >= this.ebl.size() - 1) {
                            break;
                        }
                        i7++;
                        ld5 = this.ebl.get(i7);
                    }
                    while (i6 < ld4.LD) {
                        fLxb += this.lk.Lxb(i6) + f;
                        i6++;
                    }
                    ld4.JXs = fLxb;
                    fLxb += ld4.ZU + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.ebl.size() - 1;
                float fLxb2 = ld2.JXs;
                while (true) {
                    i4--;
                    if (i4 < ld.LD || size < 0) {
                        break;
                    }
                    LD ld6 = this.ebl.get(size);
                    while (true) {
                        ld3 = ld6;
                        if (i4 >= ld3.LD || size <= 0) {
                            break;
                        }
                        size--;
                        ld6 = this.ebl.get(size);
                    }
                    while (i4 > ld3.LD) {
                        fLxb2 -= this.lk.Lxb(i4) + f;
                        i4--;
                    }
                    fLxb2 -= ld3.ZU + f;
                    ld3.JXs = fLxb2;
                }
            }
        }
        int size2 = this.ebl.size();
        float fLxb3 = ld.JXs;
        int i8 = ld.LD;
        int i9 = i8 - 1;
        this.DY = i8 == 0 ? fLxb3 : -3.4028235E38f;
        int i10 = iLxb - 1;
        this.Sfi = i8 == i10 ? (ld.ZU + fLxb3) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            LD ld7 = this.ebl.get(i11);
            while (true) {
                i3 = ld7.LD;
                if (i9 <= i3) {
                    break;
                }
                fLxb3 -= this.lk.Lxb(i9) + f;
                i9--;
            }
            fLxb3 -= ld7.ZU + f;
            ld7.JXs = fLxb3;
            if (i3 == 0) {
                this.DY = fLxb3;
            }
            i11--;
            i9--;
        }
        float fLxb4 = ld.JXs + ld.ZU + f;
        int i12 = ld.LD + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            LD ld8 = this.ebl.get(i13);
            while (true) {
                i2 = ld8.LD;
                if (i12 >= i2) {
                    break;
                }
                fLxb4 += this.lk.Lxb(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.Sfi = (ld8.ZU + fLxb4) - 1.0f;
            }
            ld8.JXs = fLxb4;
            fLxb4 += ld8.ZU + f;
            i13++;
            i12++;
        }
        this.Lpq = false;
    }

    public LD Lxb(View view) {
        for (int i = 0; i < this.ebl.size(); i++) {
            LD ld = this.ebl.get(i);
            if (this.lk.Lxb(view, ld.Lxb)) {
                return ld;
            }
        }
        return null;
    }

    private void Lxb(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.ebl.isEmpty()) {
            if (!this.NXR.isFinished()) {
                this.NXR.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        LD LD2 = LD(this.ZU);
        int iMin = (int) ((LD2 != null ? Math.min(LD2.JXs, this.Sfi) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            Lxb(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public void Lxb(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.Sv > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0032lk c0032lk = (C0032lk) childAt.getLayoutParams();
                if (c0032lk.Lxb) {
                    int i4 = c0032lk.LD & 7;
                    if (i4 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        LD(i, f, i2);
        if (this.wbY != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((C0032lk) childAt2.getLayoutParams()).Lxb) {
                    this.wbY.Lxb(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.Ns = true;
    }

    private void Lxb(boolean z) {
        boolean z2 = this.MGT == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.NXR.isFinished()) {
                this.NXR.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.NXR.getCurrX();
                int currY = this.NXR.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        ZU(currX);
                    }
                }
            }
        }
        this.id = false;
        for (int i = 0; i < this.ebl.size(); i++) {
            LD ld = this.ebl.get(i);
            if (ld.lk) {
                ld.lk = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.jeq);
            } else {
                this.jeq.run();
            }
        }
    }

    private boolean Lxb(float f, float f2) {
        if (f >= this.xan || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.xan)) && f2 < 0.0f;
        }
        return true;
    }

    private int Lxb(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.JJ || Math.abs(i2) <= this.dR) {
            i += (int) (f + (i >= this.ZU ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.ebl.size() > 0) {
            return Math.max(this.ebl.get(0).LD, Math.min(i, ((LD) DM.e(this.ebl, 1)).LD));
        }
        return i;
    }

    private void Lxb(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.rW) {
            int i = actionIndex == 0 ? 1 : 0;
            this.CG = motionEvent.getX(i);
            this.rW = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.Pw;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean Lxb(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && Lxb(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean Lxb(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return ZU();
                }
                return lk(17);
            }
            if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return JXs();
                }
                return lk(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return lk(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return lk(1);
                }
            }
        }
        return false;
    }

    private Rect Lxb(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}

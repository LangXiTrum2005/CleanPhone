package com.bytedance.adsdk.ugeno.jpc;

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
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.Log;
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
public class lnr extends ViewGroup {
    private float aaj;
    private int ag;
    private VelocityTracker ax;
    private boolean bch;
    private mo bjy;
    private int bqt;
    private List<Object> car;
    private int cx;
    private int dk;
    private int ekw;
    private final Runnable en;
    private int exc;
    private Scroller exu;
    private float fco;
    private ClassLoader fs;
    private EdgeEffect gt;
    private int gy;
    private float hkc;
    private float hzv;
    private ArrayList<View> ijp;
    private boolean irn;
    private boolean jjk;
    private int jl;
    private final ud jpc;
    private int jtx;
    private float jyq;
    private int kdv;
    private boolean koa;
    private int ljh;
    com.bytedance.adsdk.ugeno.jpc.ud lnr;
    private int lte;
    private mzz mlb;
    int mml;
    private float mrf;
    private int nz;
    private int om;
    private int oth;
    private int qdl;
    private int rc;
    private boolean rdp;
    private Parcelable rq;
    private mml sy;
    private List<mml> taz;
    private mml tid;
    private int to;
    private final Rect tvp;
    private boolean uw;
    private boolean vu;
    private EdgeEffect wak;
    private int wc;
    private final ArrayList<ud> wd;
    private boolean xi;
    private boolean xmv;
    private boolean yh;
    private Drawable yt;
    private int zlt;
    static final int[] ud = {R.attr.layout_gravity};
    private static final Comparator<ud> mzz = new Comparator<ud>() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compare(ud udVar, ud udVar2) {
            return udVar.ud - udVar2.ud;
        }
    };
    private static final Interpolator mo = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final jpc zy = new jpc();

    public static class jpc implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0062lnr c0062lnr = (C0062lnr) view.getLayoutParams();
            C0062lnr c0062lnr2 = (C0062lnr) view2.getLayoutParams();
            boolean z2 = c0062lnr.qdl;
            if (z2 != c0062lnr2.qdl) {
                return z2 ? 1 : -1;
            }
            return c0062lnr.mzz - c0062lnr2.mzz;
        }
    }

    public interface mml {
        void fs(int i2);

        void qdl(int i2, float f, int i3);

        void rq(int i2);
    }

    public class mo extends DataSetObserver {
        public mo() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            lnr.this.ud();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            lnr.this.ud();
        }
    }

    public interface mzz {
        void qdl(View view, float f);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface qdl {
    }

    public static class ud {
        boolean lnr;
        float mml;
        float mzz;
        Object qdl;
        int ud;
    }

    public static class wd extends com.bytedance.adsdk.ugeno.jpc.qdl {
        public static final Parcelable.Creator<wd> CREATOR = new Parcelable.ClassLoaderCreator<wd>() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.wd.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public wd createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new wd(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public wd createFromParcel(Parcel parcel) {
                return new wd(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public wd[] newArray(int i2) {
                return new wd[i2];
            }
        };
        Parcelable lnr;
        ClassLoader mml;
        int ud;

        public wd(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return a.i(this.ud, "}", sb);
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.qdl, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.ud);
            parcel.writeParcelable(this.lnr, i2);
        }

        public wd(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.ud = parcel.readInt();
            this.lnr = parcel.readParcelable(classLoader);
            this.mml = classLoader;
        }
    }

    public lnr(Context context) {
        super(context);
        this.wd = new ArrayList<>();
        this.jpc = new ud();
        this.tvp = new Rect();
        this.to = -1;
        this.rq = null;
        this.fs = null;
        this.aaj = -3.4028235E38f;
        this.jyq = Float.MAX_VALUE;
        this.bqt = 1;
        this.gy = -1;
        this.irn = true;
        this.xi = false;
        this.en = new Runnable() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.3
            @Override // java.lang.Runnable
            public void run() {
                lnr.this.setScrollState(0);
                lnr.this.lnr();
            }
        };
        this.nz = 0;
        qdl();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean jpc() {
        this.gy = -1;
        to();
        this.wak.onRelease();
        this.gt.onRelease();
        return this.wak.isFinished() || this.gt.isFinished();
    }

    private boolean mml(int i2) {
        if (this.wd.size() == 0) {
            if (this.irn) {
                return false;
            }
            this.jjk = false;
            qdl(0, 0.0f, 0);
            if (this.jjk) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ud udVarTvp = tvp();
        int clientWidth = getClientWidth();
        int i3 = this.jtx;
        int i4 = clientWidth + i3;
        float f = clientWidth;
        int i5 = udVarTvp.ud;
        float f2 = ((i2 / f) - udVarTvp.mzz) / (udVarTvp.mml + (i3 / f));
        this.jjk = false;
        qdl(i5, f2, (int) (i4 * f2));
        if (this.jjk) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void mo() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((C0062lnr) getChildAt(i2).getLayoutParams()).qdl) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void mzz(int i2) {
        mml mmlVar = this.tid;
        if (mmlVar != null) {
            mmlVar.rq(i2);
        }
        List<mml> list = this.taz;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                mml mmlVar2 = this.taz.get(i3);
                if (mmlVar2 != null) {
                    mmlVar2.rq(i2);
                }
            }
        }
        mml mmlVar3 = this.sy;
        if (mmlVar3 != null) {
            mmlVar3.rq(i2);
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.uw != z2) {
            this.uw = z2;
        }
    }

    private void to() {
        this.koa = false;
        this.vu = false;
        VelocityTracker velocityTracker = this.ax;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ax = null;
        }
    }

    private ud tvp() {
        int i2;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.jtx / clientWidth : 0.0f;
        int i3 = 0;
        boolean z2 = true;
        ud udVar = null;
        int i4 = -1;
        float f3 = 0.0f;
        while (i3 < this.wd.size()) {
            ud udVar2 = this.wd.get(i3);
            if (!z2 && udVar2.ud != (i2 = i4 + 1)) {
                udVar2 = this.jpc;
                udVar2.mzz = f + f3 + f2;
                udVar2.ud = i2;
                udVar2.mml = this.lnr.qdl(i2);
                i3--;
            }
            ud udVar3 = udVar2;
            f = udVar3.mzz;
            float f4 = udVar3.mml + f + f2;
            if (!z2 && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i3 == this.wd.size() - 1) {
                return udVar3;
            }
            int i5 = udVar3.ud;
            float f5 = udVar3.mml;
            i3++;
            i4 = i5;
            f3 = f5;
            udVar = udVar3;
            z2 = false;
        }
        return udVar;
    }

    private void wd() {
        if (this.dk != 0) {
            ArrayList<View> arrayList = this.ijp;
            if (arrayList == null) {
                this.ijp = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.ijp.add(getChildAt(i2));
            }
            Collections.sort(this.ijp, zy);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ud udVarQdl;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.ud == this.mml) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ud udVarQdl;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.ud == this.mml) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0062lnr c0062lnr = (C0062lnr) layoutParams;
        boolean zLnr = c0062lnr.qdl | lnr(view);
        c0062lnr.qdl = zLnr;
        if (!this.bch) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zLnr) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0062lnr.mml = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.lnr == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.aaj));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.jyq));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0062lnr) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.rdp = true;
        if (this.exu.isFinished() || !this.exu.computeScrollOffset()) {
            qdl(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.exu.getCurrX();
        int currY = this.exu.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!mml(currX)) {
                this.exu.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || qdl(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ud udVarQdl;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.ud == this.mml && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (udVar = this.lnr) != null && udVar.qdl() > 1)) {
            if (!this.wak.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.aaj * width);
                this.wak.setSize(height, width);
                zDraw = this.wak.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.gt.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.jyq + 1.0f)) * width2);
                this.gt.setSize(height2, width2);
                zDraw |= this.gt.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.wak.finish();
            this.gt.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.yt;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0062lnr();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.jpc.ud getAdapter() {
        return this.lnr;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.dk == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((C0062lnr) this.ijp.get(i3).getLayoutParams()).mo;
    }

    public int getCurrentItem() {
        return this.mml;
    }

    public int getOffscreenPageLimit() {
        return this.bqt;
    }

    public int getPageMargin() {
        return this.jtx;
    }

    public void lnr() {
        qdl(this.mml);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.irn = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.en);
        Scroller scroller = this.exu;
        if (scroller != null && !scroller.isFinished()) {
            this.exu.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f;
        super.onDraw(canvas);
        if (this.jtx <= 0 || this.yt == null || this.wd.size() <= 0 || this.lnr == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.jtx / f2;
        int i3 = 0;
        ud udVar = this.wd.get(0);
        float f4 = udVar.mzz;
        int size = this.wd.size();
        int i4 = udVar.ud;
        int i5 = this.wd.get(size - 1).ud;
        while (i4 < i5) {
            while (true) {
                i2 = udVar.ud;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                udVar = this.wd.get(i3);
            }
            if (i4 == i2) {
                float f5 = udVar.mzz;
                float f6 = udVar.mml;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float fQdl = this.lnr.qdl(i4);
                f = (f4 + fQdl) * f2;
                f4 = fQdl + f3 + f4;
            }
            if (this.jtx + f > scrollX) {
                this.yt.setBounds(Math.round(f), this.jl, Math.round(this.jtx + f), this.exc);
                this.yt.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i4++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            jpc();
            return false;
        }
        if (action != 0) {
            if (this.koa) {
                return true;
            }
            if (this.vu) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.fco = x;
            this.hkc = x;
            float y = motionEvent.getY();
            this.mrf = y;
            this.hzv = y;
            this.gy = motionEvent.getPointerId(0);
            this.vu = false;
            this.rdp = true;
            this.exu.computeScrollOffset();
            if (this.nz != 2 || Math.abs(this.exu.getFinalX() - this.exu.getCurrX()) <= this.cx) {
                qdl(false);
                this.koa = false;
            } else {
                this.exu.abortAnimation();
                this.xmv = false;
                lnr();
                this.koa = true;
                lnr(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.gy;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.hkc;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.mrf);
                if (f != 0.0f && !qdl(this.hkc, f) && qdl(this, false, (int) f, (int) x2, (int) y2)) {
                    this.hkc = x2;
                    this.hzv = y2;
                    this.vu = true;
                    return false;
                }
                int i3 = this.ekw;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.koa = true;
                    lnr(true);
                    setScrollState(1);
                    this.hkc = f > 0.0f ? this.fco + this.ekw : this.fco - this.ekw;
                    this.hzv = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.vu = true;
                }
                if (this.koa && ud(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            qdl(motionEvent);
        }
        if (this.ax == null) {
            this.ax = VelocityTracker.obtain();
        }
        this.ax.addMovement(motionEvent);
        return this.koa;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        ud udVarQdl;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0062lnr c0062lnr = (C0062lnr) childAt.getLayoutParams();
                if (c0062lnr.qdl) {
                    int i10 = c0062lnr.ud;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i20 = (i6 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                C0062lnr c0062lnr2 = (C0062lnr) childAt2.getLayoutParams();
                if (!c0062lnr2.qdl && (udVarQdl = qdl(childAt2)) != null) {
                    float f = i20;
                    int i22 = ((int) (udVarQdl.mzz * f)) + paddingLeft;
                    if (c0062lnr2.mml) {
                        c0062lnr2.mml = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0062lnr2.lnr), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.jl = paddingTop;
        this.exc = i7 - paddingBottom;
        this.zlt = i8;
        if (this.irn) {
            z3 = false;
            qdl(this.mml, false, 0, false);
        } else {
            z3 = false;
        }
        this.irn = z3;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        C0062lnr c0062lnr;
        C0062lnr c0062lnr2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.kdv = Math.min(measuredWidth / 10, this.rc);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (c0062lnr2 = (C0062lnr) childAt.getLayoutParams()) != null && c0062lnr2.qdl) {
                int i7 = c0062lnr2.ud;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z3 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z2 = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) c0062lnr2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) c0062lnr2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.oth = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.ljh = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.bch = true;
        lnr();
        this.bch = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((c0062lnr = (C0062lnr) childAt2.getLayoutParams()) == null || !c0062lnr.qdl)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0062lnr.lnr), 1073741824), this.ljh);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        ud udVarQdl;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.ud == this.mml && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wd wdVar = (wd) parcelable;
        super.onRestoreInstanceState(wdVar.qdl());
        if (this.lnr != null) {
            qdl(wdVar.ud, false, true);
            return;
        }
        this.to = wdVar.ud;
        this.rq = wdVar.lnr;
        this.fs = wdVar.mml;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        wd wdVar = new wd(super.onSaveInstanceState());
        wdVar.ud = this.mml;
        com.bytedance.adsdk.ugeno.jpc.ud udVar = this.lnr;
        if (udVar != null) {
            wdVar.lnr = udVar.ud();
        }
        return wdVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.jtx;
            qdl(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar;
        int iFindPointerIndex;
        if (this.yh) {
            return true;
        }
        boolean zJpc = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (udVar = this.lnr) == null || udVar.qdl() == 0) {
            return false;
        }
        if (this.ax == null) {
            this.ax = VelocityTracker.obtain();
        }
        this.ax.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.exu.abortAnimation();
            this.xmv = false;
            lnr();
            float x = motionEvent.getX();
            this.fco = x;
            this.hkc = x;
            float y = motionEvent.getY();
            this.mrf = y;
            this.hzv = y;
            this.gy = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.hkc = motionEvent.getX(actionIndex);
                            this.gy = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        qdl(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.gy);
                        if (iFindPointerIndex2 != -1) {
                            this.hkc = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.koa) {
                    qdl(this.mml, true, 0, false);
                    zJpc = jpc();
                }
            } else if (!this.koa) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.gy);
                if (iFindPointerIndex3 == -1) {
                    zJpc = jpc();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x2 - this.hkc);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y2 - this.hzv);
                    if (fAbs > this.ekw && fAbs > fAbs2) {
                        this.koa = true;
                        lnr(true);
                        float f = this.fco;
                        this.hkc = x2 - f > 0.0f ? f + this.ekw : f - this.ekw;
                        this.hzv = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.koa) {
                        zJpc = ud(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.koa && (iFindPointerIndex = motionEvent.findPointerIndex(this.gy)) != -1) {
                zJpc = ud(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.koa) {
            VelocityTracker velocityTracker = this.ax;
            velocityTracker.computeCurrentVelocity(1000, this.wc);
            int xVelocity = (int) velocityTracker.getXVelocity(this.gy);
            this.xmv = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ud udVarTvp = tvp();
            float f2 = clientWidth;
            float f3 = this.jtx / f2;
            int i2 = udVarTvp.ud;
            float f4 = ((scrollX / f2) - udVarTvp.mzz) / (udVarTvp.mml + f3);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.gy);
            if (iFindPointerIndex4 != -1) {
                qdl(qdl(i2, f4, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.fco)), true, true, xVelocity);
                zJpc = jpc();
            }
        }
        if (zJpc) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public void qdl() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.exu = new Scroller(context, mo);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.ekw = viewConfiguration.getScaledPagingTouchSlop();
        this.ag = (int) (400.0f * f);
        this.wc = viewConfiguration.getScaledMaximumFlingVelocity();
        this.wak = new EdgeEffect(context);
        this.gt = new EdgeEffect(context);
        this.om = (int) (25.0f * f);
        this.cx = (int) (2.0f * f);
        this.rc = (int) (f * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.bch) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.jpc.ud udVar) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar2 = this.lnr;
        if (udVar2 != null) {
            udVar2.qdl((DataSetObserver) null);
            for (int i2 = 0; i2 < this.wd.size(); i2++) {
                ud udVar3 = this.wd.get(i2);
                this.lnr.qdl((ViewGroup) this, udVar3.ud, udVar3.qdl);
            }
            this.wd.clear();
            mo();
            this.mml = 0;
            scrollTo(0, 0);
        }
        this.lnr = udVar;
        this.qdl = 0;
        if (udVar != null) {
            if (this.bjy == null) {
                this.bjy = new mo();
            }
            this.lnr.qdl((DataSetObserver) this.bjy);
            this.xmv = false;
            boolean z2 = this.irn;
            this.irn = true;
            this.qdl = this.lnr.qdl();
            int i3 = this.to;
            if (i3 >= 0) {
                qdl(i3, false, true);
                this.to = -1;
                this.rq = null;
                this.fs = null;
            } else if (z2) {
                requestLayout();
            } else {
                lnr();
            }
        }
        List<Object> list = this.car;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.car.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.car.get(i4);
        }
    }

    public void setCurrentItem(int i2) {
        this.xmv = false;
        qdl(i2, !this.irn, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.bqt) {
            this.bqt = i2;
            lnr();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(mml mmlVar) {
        this.tid = mmlVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.jtx;
        this.jtx = i2;
        int width = getWidth();
        qdl(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.yt = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.nz == i2) {
            return;
        }
        this.nz = i2;
        if (this.mlb != null) {
            ud(i2 != 0);
        }
        mo(i2);
    }

    public void setScroller(Scroller scroller) {
        this.exu = scroller;
    }

    public void ud(mml mmlVar) {
        List<mml> list = this.taz;
        if (list != null) {
            list.remove(mmlVar);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.yt;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jpc.lnr$lnr, reason: collision with other inner class name */
    public static class C0062lnr extends ViewGroup.LayoutParams {
        float lnr;
        boolean mml;
        int mo;
        int mzz;
        public boolean qdl;
        public int ud;

        public C0062lnr() {
            super(-1, -1);
            this.lnr = 0.0f;
        }

        public C0062lnr(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.lnr = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lnr.ud);
            this.ud = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean lnr(View view) {
        return view.getClass().getAnnotation(qdl.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0062lnr(getContext(), attributeSet);
    }

    public void ud() {
        int iQdl = this.lnr.qdl();
        this.qdl = iQdl;
        boolean z2 = this.wd.size() < (this.bqt * 2) + 1 && this.wd.size() < iQdl;
        int iMax = this.mml;
        int i2 = 0;
        while (i2 < this.wd.size()) {
            ud udVar = this.wd.get(i2);
            int iQdl2 = this.lnr.qdl(udVar.qdl);
            if (iQdl2 != -1) {
                if (iQdl2 == -2) {
                    this.wd.remove(i2);
                    i2--;
                    this.lnr.qdl((ViewGroup) this, udVar.ud, udVar.qdl);
                    int i3 = this.mml;
                    if (i3 == udVar.ud) {
                        iMax = Math.max(0, Math.min(i3, iQdl - 1));
                    }
                } else {
                    int i4 = udVar.ud;
                    if (i4 != iQdl2) {
                        if (i4 == this.mml) {
                            iMax = iQdl2;
                        }
                        udVar.ud = iQdl2;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        Collections.sort(this.wd, mzz);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0062lnr c0062lnr = (C0062lnr) getChildAt(i5).getLayoutParams();
                if (!c0062lnr.qdl) {
                    c0062lnr.lnr = 0.0f;
                }
            }
            qdl(iMax, false, true);
            requestLayout();
        }
    }

    private void lnr(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    private void mo(int i2) {
        mml mmlVar = this.tid;
        if (mmlVar != null) {
            mmlVar.fs(i2);
        }
        List<mml> list = this.taz;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                mml mmlVar2 = this.taz.get(i3);
                if (mmlVar2 != null) {
                    mmlVar2.fs(i2);
                }
            }
        }
        mml mmlVar3 = this.sy;
        if (mmlVar3 != null) {
            mmlVar3.fs(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    public boolean lnr(int i2) {
        boolean zMml;
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
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zMml = mml();
            } else if (i2 == 66 || i2 == 2) {
                zMml = mzz();
            } else {
                zMml = false;
            }
        } else if (i2 == 17) {
            int i3 = qdl(this.tvp, viewFindNextFocus).left;
            int i4 = qdl(this.tvp, viewFindFocus).left;
            if (viewFindFocus != null && i3 >= i4) {
                zMml = mml();
            } else {
                zMml = viewFindNextFocus.requestFocus();
            }
        } else if (i2 == 66) {
            int i5 = qdl(this.tvp, viewFindNextFocus).left;
            int i6 = qdl(this.tvp, viewFindFocus).left;
            if (viewFindFocus == null || i5 > i6) {
                zMml = viewFindNextFocus.requestFocus();
            } else {
                zMml = mzz();
            }
        } else {
            zMml = false;
        }
        if (zMml) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zMml;
    }

    public boolean mzz() {
        com.bytedance.adsdk.ugeno.jpc.ud udVar = this.lnr;
        if (udVar == null || this.mml >= udVar.qdl() - 1) {
            return false;
        }
        qdl(this.mml + 1, true);
        return true;
    }

    public boolean mml() {
        int i2 = this.mml;
        if (i2 <= 0) {
            return false;
        }
        qdl(i2 - 1, true);
        return true;
    }

    public void qdl(int i2, boolean z2) {
        this.xmv = false;
        qdl(i2, z2, false);
    }

    public void qdl(int i2, boolean z2, boolean z3) {
        qdl(i2, z2, z3, 0);
    }

    public void qdl(int i2, boolean z2, boolean z3, int i3) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar = this.lnr;
        if (udVar != null && udVar.qdl() > 0) {
            if (!z3 && this.mml == i2 && this.wd.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.lnr.qdl()) {
                i2 = this.lnr.qdl() - 1;
            }
            int i4 = this.bqt;
            int i5 = this.mml;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.wd.size(); i6++) {
                    this.wd.get(i6).lnr = true;
                }
            }
            boolean z4 = this.mml != i2;
            if (this.irn) {
                this.mml = i2;
                if (z4) {
                    mzz(i2);
                }
                requestLayout();
                return;
            }
            qdl(i2);
            qdl(i2, z2, i3, z4);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public ud ud(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return qdl(view);
            }
        }
    }

    public ud ud(int i2) {
        for (int i3 = 0; i3 < this.wd.size(); i3++) {
            ud udVar = this.wd.get(i3);
            if (udVar.ud == i2) {
                return udVar;
            }
        }
        return null;
    }

    private void ud(int i2, float f, int i3) {
        mml mmlVar = this.tid;
        if (mmlVar != null) {
            mmlVar.qdl(i2, f, i3);
        }
        List<mml> list = this.taz;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                mml mmlVar2 = this.taz.get(i4);
                if (mmlVar2 != null) {
                    mmlVar2.qdl(i2, f, i3);
                }
            }
        }
        mml mmlVar3 = this.sy;
        if (mmlVar3 != null) {
            mmlVar3.qdl(i2, f, i3);
        }
    }

    private void qdl(int i2, boolean z2, int i3, boolean z3) {
        int iMax;
        ud udVarUd = ud(i2);
        if (udVarUd != null) {
            iMax = (int) (Math.max(this.aaj, Math.min(udVarUd.mzz, this.jyq)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z2) {
            qdl(iMax, 0, i3);
            if (z3) {
                mzz(i2);
                return;
            }
            return;
        }
        if (z3) {
            mzz(i2);
        }
        qdl(false);
        scrollTo(iMax, 0);
        mml(iMax);
    }

    private void ud(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.lte : 0, null);
        }
    }

    private boolean ud(float f) {
        boolean z2;
        boolean z3;
        float f2 = this.hkc - f;
        this.hkc = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.aaj * clientWidth;
        float f4 = this.jyq * clientWidth;
        boolean z4 = false;
        ud udVar = this.wd.get(0);
        ud udVar2 = (ud) a.d(1, this.wd);
        if (udVar.ud != 0) {
            f3 = udVar.mzz * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (udVar2.ud != this.lnr.qdl() - 1) {
            f4 = udVar2.mzz * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f3) {
            if (z2) {
                this.wak.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z3) {
                this.gt.onPull(Math.abs(scrollX - f4) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.hkc = (scrollX - i2) + this.hkc;
        scrollTo(i2, getScrollY());
        mml(i2);
        return z4;
    }

    public void qdl(mml mmlVar) {
        if (this.taz == null) {
            this.taz = new ArrayList();
        }
        this.taz.add(mmlVar);
    }

    public void qdl(boolean z2, mzz mzzVar) {
        qdl(z2, mzzVar, 2);
    }

    public void qdl(boolean z2, mzz mzzVar, int i2) {
        boolean z3 = mzzVar != null;
        boolean z4 = z3 != (this.mlb != null);
        this.mlb = mzzVar;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            this.dk = z2 ? 2 : 1;
            this.lte = i2;
        } else {
            this.dk = 0;
        }
        if (z4) {
            lnr();
        }
    }

    public float qdl(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void qdl(int i2, int i3, int i4) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.exu;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.rdp ? this.exu.getCurrX() : this.exu.getStartX();
            this.exu.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            qdl(false);
            lnr();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i8;
        float fQdl = (qdl(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f)) * f2) + f2;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fQdl / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i6) / ((this.lnr.qdl(this.mml) * f) + this.jtx)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.rdp = false;
        this.exu.startScroll(i5, scrollY, i6, i7, iMin);
        postInvalidateOnAnimation();
    }

    public ud qdl(int i2, int i3) {
        ud udVar = new ud();
        udVar.ud = i2;
        udVar.qdl = this.lnr.qdl((ViewGroup) this, i2);
        udVar.mml = this.lnr.qdl(i2);
        if (i3 >= 0 && i3 < this.wd.size()) {
            this.wd.add(i3, udVar);
            return udVar;
        }
        this.wd.add(udVar);
        return udVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[PHI: r7 r10 r14
  0x00c6: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    public void qdl(int i2) {
        ud udVarUd;
        String hexString;
        ud udVarQdl;
        ud udVarQdl2;
        ud udVar;
        int i3 = this.mml;
        if (i3 != i2) {
            udVarUd = ud(i3);
            this.mml = i2;
        } else {
            udVarUd = null;
        }
        if (this.lnr == null) {
            wd();
            return;
        }
        if (this.xmv) {
            wd();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i4 = this.bqt;
        int iMax = Math.max(0, this.mml - i4);
        int iQdl = this.lnr.qdl();
        int iMin = Math.min(iQdl - 1, this.mml + i4);
        if (iQdl == this.qdl) {
            int i5 = 0;
            while (true) {
                if (i5 < this.wd.size()) {
                    udVarQdl = this.wd.get(i5);
                    int i6 = udVarQdl.ud;
                    int i7 = this.mml;
                    if (i6 >= i7) {
                        if (i6 != i7) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i5++;
                }
                udVarQdl = null;
                break;
            }
            if (udVarQdl == null && iQdl > 0) {
                udVarQdl = qdl(this.mml, i5);
            }
            if (udVarQdl != null) {
                int i8 = i5 - 1;
                ud udVar2 = i8 >= 0 ? this.wd.get(i8) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - udVarQdl.mml);
                float f = 0.0f;
                for (int i9 = this.mml - 1; i9 >= 0; i9--) {
                    if (f >= paddingLeft && i9 < iMax) {
                        if (udVar2 == null) {
                            break;
                        }
                        if (i9 == udVar2.ud && !udVar2.lnr) {
                            this.wd.remove(i8);
                            this.lnr.qdl((ViewGroup) this, i9, udVar2.qdl);
                            i8--;
                            i5--;
                            if (i8 >= 0) {
                                udVar = this.wd.get(i8);
                            } else {
                                udVar = null;
                            }
                            udVar2 = udVar;
                        }
                    } else {
                        if (udVar2 != null && i9 == udVar2.ud) {
                            f += udVar2.mml;
                            i8--;
                            if (i8 >= 0) {
                                udVar = this.wd.get(i8);
                            } else {
                                udVar = null;
                            }
                        } else {
                            f += qdl(i9, i8 + 1).mml;
                            i5++;
                            if (i8 >= 0) {
                                udVar = this.wd.get(i8);
                            } else {
                                udVar = null;
                            }
                        }
                        udVar2 = udVar;
                    }
                }
                float f2 = udVarQdl.mml;
                int i10 = i5 + 1;
                if (f2 < 2.0f) {
                    ud udVar3 = i10 < this.wd.size() ? this.wd.get(i10) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i11 = this.mml;
                    while (true) {
                        i11++;
                        if (i11 >= iQdl) {
                            break;
                        }
                        if (f2 >= paddingRight && i11 > iMin) {
                            if (udVar3 == null) {
                                break;
                            }
                            if (i11 == udVar3.ud && !udVar3.lnr) {
                                this.wd.remove(i10);
                                this.lnr.qdl((ViewGroup) this, i11, udVar3.qdl);
                                if (i10 < this.wd.size()) {
                                    udVar3 = this.wd.get(i10);
                                }
                            }
                        } else if (udVar3 != null && i11 == udVar3.ud) {
                            f2 += udVar3.mml;
                            i10++;
                            if (i10 < this.wd.size()) {
                                udVar3 = this.wd.get(i10);
                            }
                        } else {
                            ud udVarQdl3 = qdl(i11, i10);
                            i10++;
                            f2 += udVarQdl3.mml;
                            udVar3 = i10 < this.wd.size() ? this.wd.get(i10) : null;
                        }
                    }
                }
                qdl(udVarQdl, i5, udVarUd);
            }
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                C0062lnr c0062lnr = (C0062lnr) childAt.getLayoutParams();
                c0062lnr.mo = i12;
                if (!c0062lnr.qdl && c0062lnr.lnr == 0.0f && (udVarQdl2 = qdl(childAt)) != null) {
                    c0062lnr.lnr = udVarQdl2.mml;
                    c0062lnr.mzz = udVarQdl2.ud;
                }
            }
            wd();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                ud udVarUd2 = viewFindFocus != null ? ud(viewFindFocus) : null;
                if (udVarUd2 == null || udVarUd2.ud != this.mml) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt2 = getChildAt(i13);
                        ud udVarQdl4 = qdl(childAt2);
                        if (udVarQdl4 != null && udVarQdl4.ud == this.mml && childAt2.requestFocus(2)) {
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
        androidx.datastore.preferences.protobuf.a.y(sb, this.qdl, ", found: ", iQdl, " Pager id: ");
        sb.append(hexString);
        sb.append(" Pager class: ");
        sb.append(getClass());
        sb.append(" Problematic adapter: ");
        sb.append(this.lnr.getClass());
        throw new IllegalStateException(sb.toString());
    }

    private void qdl(ud udVar, int i2, ud udVar2) {
        int i3;
        int i4;
        ud udVar3;
        ud udVar4;
        int iQdl = this.lnr.qdl();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.jtx / clientWidth : 0.0f;
        if (udVar2 != null) {
            int i5 = udVar2.ud;
            int i6 = udVar.ud;
            if (i5 < i6) {
                float fQdl = udVar2.mzz + udVar2.mml + f;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= udVar.ud && i8 < this.wd.size()) {
                    ud udVar5 = this.wd.get(i8);
                    while (true) {
                        udVar4 = udVar5;
                        if (i7 <= udVar4.ud || i8 >= this.wd.size() - 1) {
                            break;
                        }
                        i8++;
                        udVar5 = this.wd.get(i8);
                    }
                    while (i7 < udVar4.ud) {
                        fQdl += this.lnr.qdl(i7) + f;
                        i7++;
                    }
                    udVar4.mzz = fQdl;
                    fQdl += udVar4.mml + f;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.wd.size() - 1;
                float fQdl2 = udVar2.mzz;
                while (true) {
                    i5--;
                    if (i5 < udVar.ud || size < 0) {
                        break;
                    }
                    ud udVar6 = this.wd.get(size);
                    while (true) {
                        udVar3 = udVar6;
                        if (i5 >= udVar3.ud || size <= 0) {
                            break;
                        }
                        size--;
                        udVar6 = this.wd.get(size);
                    }
                    while (i5 > udVar3.ud) {
                        fQdl2 -= this.lnr.qdl(i5) + f;
                        i5--;
                    }
                    fQdl2 -= udVar3.mml + f;
                    udVar3.mzz = fQdl2;
                }
            }
        }
        int size2 = this.wd.size();
        float fQdl3 = udVar.mzz;
        int i9 = udVar.ud;
        int i10 = i9 - 1;
        this.aaj = i9 == 0 ? fQdl3 : -3.4028235E38f;
        int i11 = iQdl - 1;
        this.jyq = i9 == i11 ? (udVar.mml + fQdl3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            ud udVar7 = this.wd.get(i12);
            while (true) {
                i4 = udVar7.ud;
                if (i10 <= i4) {
                    break;
                }
                fQdl3 -= this.lnr.qdl(i10) + f;
                i10--;
            }
            fQdl3 -= udVar7.mml + f;
            udVar7.mzz = fQdl3;
            if (i4 == 0) {
                this.aaj = fQdl3;
            }
            i12--;
            i10--;
        }
        float fQdl4 = udVar.mzz + udVar.mml + f;
        int i13 = udVar.ud + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            ud udVar8 = this.wd.get(i14);
            while (true) {
                i3 = udVar8.ud;
                if (i13 >= i3) {
                    break;
                }
                fQdl4 += this.lnr.qdl(i13) + f;
                i13++;
            }
            if (i3 == i11) {
                this.jyq = (udVar8.mml + fQdl4) - 1.0f;
            }
            udVar8.mzz = fQdl4;
            fQdl4 += udVar8.mml + f;
            i14++;
            i13++;
        }
        this.xi = false;
    }

    public ud qdl(View view) {
        for (int i2 = 0; i2 < this.wd.size(); i2++) {
            ud udVar = this.wd.get(i2);
            if (this.lnr.qdl(view, udVar.qdl)) {
                return udVar;
            }
        }
        return null;
    }

    private void qdl(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.wd.isEmpty()) {
            if (!this.exu.isFinished()) {
                this.exu.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        ud udVarUd = ud(this.mml);
        int iMin = (int) ((udVarUd != null ? Math.min(udVarUd.mzz, this.jyq) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            qdl(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public void qdl(int i2, float f, int i3) {
        int iMax;
        int width;
        int left;
        if (this.zlt > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C0062lnr c0062lnr = (C0062lnr) childAt.getLayoutParams();
                if (c0062lnr.qdl) {
                    int i5 = c0062lnr.ud & 7;
                    if (i5 == 1) {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
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
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        ud(i2, f, i3);
        if (this.mlb != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C0062lnr) childAt2.getLayoutParams()).qdl) {
                    this.mlb.qdl(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.jjk = true;
    }

    private void qdl(boolean z2) {
        boolean z3 = this.nz == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.exu.isFinished()) {
                this.exu.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.exu.getCurrX();
                int currY = this.exu.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        mml(currX);
                    }
                }
            }
        }
        this.xmv = false;
        for (int i2 = 0; i2 < this.wd.size(); i2++) {
            ud udVar = this.wd.get(i2);
            if (udVar.lnr) {
                udVar.lnr = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z2) {
                postOnAnimation(this.en);
            } else {
                this.en.run();
            }
        }
    }

    private boolean qdl(float f, float f2) {
        if (f >= this.kdv || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.kdv)) && f2 < 0.0f;
        }
        return true;
    }

    private int qdl(int i2, float f, int i3, int i4) {
        if (Math.abs(i4) <= this.om || Math.abs(i3) <= this.ag) {
            i2 += (int) (f + (i2 >= this.mml ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.wd.size() > 0) {
            return Math.max(this.wd.get(0).ud, Math.min(i2, ((ud) a.d(1, this.wd)).ud));
        }
        return i2;
    }

    private void qdl(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.gy) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.hkc = motionEvent.getX(i2);
            this.gy = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.ax;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean qdl(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && qdl(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    public boolean qdl(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return mml();
            }
            return lnr(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return mzz();
            }
            return lnr(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return lnr(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return lnr(1);
        }
        return false;
    }

    private Rect qdl(Rect rect, View view) {
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

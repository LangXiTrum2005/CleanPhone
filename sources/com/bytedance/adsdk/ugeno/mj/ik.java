package com.bytedance.adsdk.ugeno.mj;

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
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ViewGroup {
    private int aac;
    private float ac;
    private Scroller aw;
    private boolean ay;
    private boolean bgr;
    private boolean bnj;
    private Drawable bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ClassLoader f18026co;
    private boolean dw;
    private float dzy;
    private EdgeEffect fe;
    private int feb;
    private boolean fr;
    private ka gcp;
    private int hcw;
    private float ig;
    private int igq;
    private float ihz;
    com.bytedance.adsdk.ugeno.mj.lr ik;
    private final Rect jbs;
    private int jc;
    int ka;
    private int kt;
    private final lr mj;
    private fi nd;
    private int nr;
    private int oh;
    private int ory;
    private int pc;
    private float pv;
    private int qd;
    private ka qh;
    private int qt;
    private int ri;
    private List<ka> rzk;
    private final Runnable saa;
    private Parcelable sf;
    private boolean siy;
    private int slm;
    private VelocityTracker srn;
    private boolean su;
    private EdgeEffect ta;
    private int tan;
    private boolean tnn;
    private List<Object> tw;
    private int uq;
    private di vr;
    private boolean whw;
    private int wjv;
    private float xd;
    private ArrayList<View> xe;
    private final ArrayList<lr> xha;
    private int xm;
    private int zb;
    private boolean zf;
    private int zyn;
    static final int[] lr = {R.attr.layout_gravity};
    private static final Comparator<lr> fi = new Comparator<lr>() { // from class: com.bytedance.adsdk.ugeno.mj.ik.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(lr lrVar, lr lrVar2) {
            return lrVar.lr - lrVar2.lr;
        }
    };
    private static final Interpolator di = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.mj.ik.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final mj yjm = new mj();

    public class di extends DataSetObserver {
        public di() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ik.this.lr();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ik.this.lr();
        }
    }

    public interface fi {
        void ri(View view, float f);
    }

    public interface ka {
        void co(int i);

        void ri(int i, float f, int i2);

        void sf(int i);
    }

    public static class lr {
        float fi;
        boolean ik;
        float ka;
        int lr;
        Object ri;
    }

    public static class mj implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0194ik c0194ik = (C0194ik) view.getLayoutParams();
            C0194ik c0194ik2 = (C0194ik) view2.getLayoutParams();
            boolean z = c0194ik.ri;
            if (z != c0194ik2.ri) {
                return z ? 1 : -1;
            }
            return c0194ik.fi - c0194ik2.fi;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ri {
    }

    public static class xha extends com.bytedance.adsdk.ugeno.mj.ri {
        public static final Parcelable.Creator<xha> CREATOR = new Parcelable.ClassLoaderCreator<xha>() { // from class: com.bytedance.adsdk.ugeno.mj.ik.xha.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public xha createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new xha(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public xha createFromParcel(Parcel parcel) {
                return new xha(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public xha[] newArray(int i) {
                return new xha[i];
            }
        };
        Parcelable ik;
        ClassLoader ka;
        int lr;

        public xha(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.lr + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.mj.ri, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.lr);
            parcel.writeParcelable(this.ik, i);
        }

        public xha(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.lr = parcel.readInt();
            this.ik = parcel.readParcelable(classLoader);
            this.ka = classLoader;
        }
    }

    public ik(Context context) {
        super(context);
        this.xha = new ArrayList<>();
        this.mj = new lr();
        this.jbs = new Rect();
        this.qt = -1;
        this.sf = null;
        this.f18026co = null;
        this.ac = -3.4028235E38f;
        this.ihz = Float.MAX_VALUE;
        this.igq = 1;
        this.qd = -1;
        this.bnj = true;
        this.siy = false;
        this.saa = new Runnable() { // from class: com.bytedance.adsdk.ugeno.mj.ik.3
            @Override // java.lang.Runnable
            public void run() {
                ik.this.setScrollState(0);
                ik.this.ik();
            }
        };
        this.pc = 0;
        ri();
    }

    private void di() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0194ik) getChildAt(i).getLayoutParams()).ri) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void fi(int i) {
        ka kaVar = this.qh;
        if (kaVar != null) {
            kaVar.sf(i);
        }
        List<ka> list = this.rzk;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ka kaVar2 = this.rzk.get(i2);
                if (kaVar2 != null) {
                    kaVar2.sf(i);
                }
            }
        }
        ka kaVar3 = this.gcp;
        if (kaVar3 != null) {
            kaVar3.sf(i);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private lr jbs() {
        int i;
        int clientWidth = getClientWidth();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.slm / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        lr lrVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.xha.size()) {
            lr lrVar2 = this.xha.get(i2);
            if (!z && lrVar2.lr != (i = i3 + 1)) {
                lrVar2 = this.mj;
                lrVar2.fi = f + f3 + f2;
                lrVar2.lr = i;
                lrVar2.ka = this.ik.ri(i);
                i2--;
            }
            lr lrVar3 = lrVar2;
            f = lrVar3.fi;
            float f4 = lrVar3.ka + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.xha.size() - 1) {
                return lrVar3;
            }
            int i4 = lrVar3.lr;
            float f5 = lrVar3.ka;
            i2++;
            i3 = i4;
            f3 = f5;
            lrVar = lrVar3;
            z = false;
        }
        return lrVar;
    }

    private boolean ka(int i) {
        if (this.xha.size() == 0) {
            if (this.bnj) {
                return false;
            }
            this.whw = false;
            ri(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.whw) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        lr lrVarJbs = jbs();
        int clientWidth = getClientWidth();
        int i2 = this.slm;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = lrVarJbs.lr;
        float f2 = ((i / f) - lrVarJbs.fi) / (lrVarJbs.ka + (i2 / f));
        this.whw = false;
        ri(i4, f2, (int) (i3 * f2));
        if (this.whw) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean mj() {
        this.qd = -1;
        qt();
        this.fe.onRelease();
        this.ta.onRelease();
        return this.fe.isFinished() || this.ta.isFinished();
    }

    private void qt() {
        this.zf = false;
        this.dw = false;
        VelocityTracker velocityTracker = this.srn;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.srn = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.fr != z) {
            this.fr = z;
        }
    }

    private void xha() {
        if (this.aac != 0) {
            ArrayList<View> arrayList = this.xe;
            if (arrayList == null) {
                this.xe = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.xe.add(getChildAt(i));
            }
            Collections.sort(this.xe, yjm);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        lr lrVarRi;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (lrVarRi = ri(childAt)) != null && lrVarRi.lr == this.ka) {
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
        lr lrVarRi;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (lrVarRi = ri(childAt)) != null && lrVarRi.lr == this.ka) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0194ik c0194ik = (C0194ik) layoutParams;
        boolean zIk = c0194ik.ri | ik(view);
        c0194ik.ri = zIk;
        if (!this.ay) {
            super.addView(view, i, layoutParams);
        } else {
            if (zIk) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0194ik.ka = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.ik == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.ac));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.ihz));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0194ik) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.bgr = true;
        if (this.aw.isFinished() || !this.aw.computeScrollOffset()) {
            ri(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.aw.getCurrX();
        int currY = this.aw.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!ka(currX)) {
                this.aw.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || ri(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        lr lrVarRi;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (lrVarRi = ri(childAt)) != null && lrVarRi.lr == this.ka && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.mj.lr lrVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (lrVar = this.ik) != null && lrVar.ri() > 1)) {
            if (!this.fe.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.ac * width);
                this.fe.setSize(height, width);
                zDraw = this.fe.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.ta.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.ihz + 1.0f)) * width2);
                this.ta.setSize(height2, width2);
                zDraw |= this.ta.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.fe.finish();
            this.ta.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.bu;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0194ik();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.mj.lr getAdapter() {
        return this.ik;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.aac == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0194ik) this.xe.get(i2).getLayoutParams()).di;
    }

    public int getCurrentItem() {
        return this.ka;
    }

    public int getOffscreenPageLimit() {
        return this.igq;
    }

    public int getPageMargin() {
        return this.slm;
    }

    public void ik() {
        ri(this.ka);
    }

    public void lr(ka kaVar) {
        List<ka> list = this.rzk;
        if (list != null) {
            list.remove(kaVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bnj = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.saa);
        Scroller scroller = this.aw;
        if (scroller != null && !scroller.isFinished()) {
            this.aw.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.slm <= 0 || this.bu == null || this.xha.size() <= 0 || this.ik == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.slm / f2;
        int i2 = 0;
        lr lrVar = this.xha.get(0);
        float f4 = lrVar.fi;
        int size = this.xha.size();
        int i3 = lrVar.lr;
        int i4 = this.xha.get(size - 1).lr;
        while (i3 < i4) {
            while (true) {
                i = lrVar.lr;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                lrVar = this.xha.get(i2);
            }
            if (i3 == i) {
                float f5 = lrVar.fi;
                float f6 = lrVar.ka;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float fRi = this.ik.ri(i3);
                f = (f4 + fRi) * f2;
                f4 += fRi + f3;
            }
            if (this.slm + f > scrollX) {
                this.bu.setBounds(Math.round(f), this.nr, Math.round(this.slm + f), this.tan);
                this.bu.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            mj();
            return false;
        }
        if (action != 0) {
            if (this.zf) {
                return true;
            }
            if (this.dw) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.pv = x;
            this.xd = x;
            float y = motionEvent.getY();
            this.ig = y;
            this.dzy = y;
            this.qd = motionEvent.getPointerId(0);
            this.dw = false;
            this.bgr = true;
            this.aw.computeScrollOffset();
            if (this.pc != 2 || Math.abs(this.aw.getFinalX() - this.aw.getCurrX()) <= this.zyn) {
                ri(false);
                this.zf = false;
            } else {
                this.aw.abortAnimation();
                this.su = false;
                ik();
                this.zf = true;
                ik(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.qd;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.xd;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.ig);
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !ri(this.xd, f) && ri(this, false, (int) f, (int) x2, (int) y2)) {
                    this.xd = x2;
                    this.dzy = y2;
                    this.dw = true;
                    return false;
                }
                int i2 = this.oh;
                if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                    this.zf = true;
                    ik(true);
                    setScrollState(1);
                    this.xd = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.pv + this.oh : this.pv - this.oh;
                    this.dzy = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i2) {
                    this.dw = true;
                }
                if (this.zf && lr(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            ri(motionEvent);
        }
        if (this.srn == null) {
            this.srn = VelocityTracker.obtain();
        }
        this.srn.addMovement(motionEvent);
        return this.zf;
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
        lr lrVarRi;
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
                C0194ik c0194ik = (C0194ik) childAt.getLayoutParams();
                if (c0194ik.ri) {
                    int i9 = c0194ik.lr;
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
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, paddingTop + childAt.getMeasuredHeight());
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
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, paddingTop + childAt.getMeasuredHeight());
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
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, paddingTop + childAt.getMeasuredHeight());
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
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, paddingTop + childAt.getMeasuredHeight());
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
                C0194ik c0194ik2 = (C0194ik) childAt2.getLayoutParams();
                if (!c0194ik2.ri && (lrVarRi = ri(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (lrVarRi.fi * f)) + paddingLeft;
                    if (c0194ik2.ka) {
                        c0194ik2.ka = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c0194ik2.ik), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.nr = paddingTop;
        this.tan = i6 - paddingBottom;
        this.xm = i7;
        if (this.bnj) {
            z2 = false;
            ri(this.ka, false, 0, false);
        } else {
            z2 = false;
        }
        this.bnj = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C0194ik c0194ik;
        C0194ik c0194ik2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.hcw = Math.min(measuredWidth / 10, this.ory);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c0194ik2 = (C0194ik) childAt.getLayoutParams()) != null && c0194ik2.ri) {
                int i6 = c0194ik2.lr;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c0194ik2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c0194ik2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.uq = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.wjv = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.ay = true;
        ik();
        this.ay = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c0194ik = (C0194ik) childAt2.getLayoutParams()) == null || !c0194ik.ri)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0194ik.ik), 1073741824), this.wjv);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        lr lrVarRi;
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
            if (childAt.getVisibility() == 0 && (lrVarRi = ri(childAt)) != null && lrVarRi.lr == this.ka && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xha)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xha xhaVar = (xha) parcelable;
        super.onRestoreInstanceState(xhaVar.ri());
        if (this.ik != null) {
            ri(xhaVar.lr, false, true);
            return;
        }
        this.qt = xhaVar.lr;
        this.sf = xhaVar.ik;
        this.f18026co = xhaVar.ka;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        xha xhaVar = new xha(super.onSaveInstanceState());
        xhaVar.lr = this.ka;
        com.bytedance.adsdk.ugeno.mj.lr lrVar = this.ik;
        if (lrVar != null) {
            xhaVar.ik = lrVar.lr();
        }
        return xhaVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.slm;
            ri(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.mj.lr lrVar;
        int iFindPointerIndex;
        if (this.tnn) {
            return true;
        }
        boolean zMj = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (lrVar = this.ik) == null || lrVar.ri() == 0) {
            return false;
        }
        if (this.srn == null) {
            this.srn = VelocityTracker.obtain();
        }
        this.srn.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.aw.abortAnimation();
            this.su = false;
            ik();
            float x = motionEvent.getX();
            this.pv = x;
            this.xd = x;
            float y = motionEvent.getY();
            this.ig = y;
            this.dzy = y;
            this.qd = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.xd = motionEvent.getX(actionIndex);
                            this.qd = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        ri(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.qd);
                        if (iFindPointerIndex2 != -1) {
                            this.xd = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.zf) {
                    ri(this.ka, true, 0, false);
                    zMj = mj();
                }
            } else if (!this.zf) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.qd);
                if (iFindPointerIndex3 == -1) {
                    zMj = mj();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x2 - this.xd);
                    float y2 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y2 - this.dzy);
                    if (fAbs > this.oh && fAbs > fAbs2) {
                        this.zf = true;
                        ik(true);
                        float f = this.pv;
                        this.xd = x2 - f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f + this.oh : f - this.oh;
                        this.dzy = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.zf) {
                        zMj = lr(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.zf && (iFindPointerIndex = motionEvent.findPointerIndex(this.qd)) != -1) {
                zMj = lr(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.zf) {
            VelocityTracker velocityTracker = this.srn;
            velocityTracker.computeCurrentVelocity(1000, this.kt);
            int xVelocity = (int) velocityTracker.getXVelocity(this.qd);
            this.su = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            lr lrVarJbs = jbs();
            float f2 = clientWidth;
            float f3 = this.slm / f2;
            int i = lrVarJbs.lr;
            float f4 = ((scrollX / f2) - lrVarJbs.fi) / (lrVarJbs.ka + f3);
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.qd);
            if (iFindPointerIndex4 != -1) {
                ri(ri(i, f4, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.pv)), true, true, xVelocity);
                zMj = mj();
            }
        }
        if (zMj) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.ay) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void ri() {
        setWillNotDraw(false);
        setDescendantFocusability(Opcodes.ASM4);
        setFocusable(true);
        Context context = getContext();
        this.aw = new Scroller(context, di);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.oh = viewConfiguration.getScaledPagingTouchSlop();
        this.jc = (int) (400.0f * f);
        this.kt = viewConfiguration.getScaledMaximumFlingVelocity();
        this.fe = new EdgeEffect(context);
        this.ta = new EdgeEffect(context);
        this.feb = (int) (25.0f * f);
        this.zyn = (int) (2.0f * f);
        this.ory = (int) (f * 16.0f);
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.mj.lr lrVar) {
        com.bytedance.adsdk.ugeno.mj.lr lrVar2 = this.ik;
        if (lrVar2 != null) {
            lrVar2.ri((DataSetObserver) null);
            for (int i = 0; i < this.xha.size(); i++) {
                lr lrVar3 = this.xha.get(i);
                this.ik.ri((ViewGroup) this, lrVar3.lr, lrVar3.ri);
            }
            this.xha.clear();
            di();
            this.ka = 0;
            scrollTo(0, 0);
        }
        this.ik = lrVar;
        this.ri = 0;
        if (lrVar != null) {
            if (this.vr == null) {
                this.vr = new di();
            }
            this.ik.ri((DataSetObserver) this.vr);
            this.su = false;
            boolean z = this.bnj;
            this.bnj = true;
            this.ri = this.ik.ri();
            int i2 = this.qt;
            if (i2 >= 0) {
                ri(i2, false, true);
                this.qt = -1;
                this.sf = null;
                this.f18026co = null;
            } else if (z) {
                requestLayout();
            } else {
                ik();
            }
        }
        List<Object> list = this.tw;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.tw.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.tw.get(i3);
        }
    }

    public void setCurrentItem(int i) {
        this.su = false;
        ri(i, !this.bnj, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.igq) {
            this.igq = i;
            ik();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(ka kaVar) {
        this.qh = kaVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.slm;
        this.slm = i;
        int width = getWidth();
        ri(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.bu = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.pc == i) {
            return;
        }
        this.pc = i;
        if (this.nd != null) {
            lr(i != 0);
        }
        di(i);
    }

    public void setScroller(Scroller scroller) {
        this.aw = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.bu;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mj.ik$ik, reason: collision with other inner class name */
    public static class C0194ik extends ViewGroup.LayoutParams {
        int di;
        int fi;
        float ik;
        boolean ka;
        public int lr;
        public boolean ri;

        public C0194ik() {
            super(-1, -1);
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public C0194ik(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ik.lr);
            this.lr = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean ik(View view) {
        return view.getClass().getAnnotation(ri.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0194ik(getContext(), attributeSet);
    }

    public void lr() {
        int iRi = this.ik.ri();
        this.ri = iRi;
        boolean z = this.xha.size() < (this.igq * 2) + 1 && this.xha.size() < iRi;
        int iMax = this.ka;
        int i = 0;
        while (i < this.xha.size()) {
            lr lrVar = this.xha.get(i);
            int iRi2 = this.ik.ri(lrVar.ri);
            if (iRi2 != -1) {
                if (iRi2 == -2) {
                    this.xha.remove(i);
                    i--;
                    this.ik.ri((ViewGroup) this, lrVar.lr, lrVar.ri);
                    int i2 = this.ka;
                    if (i2 == lrVar.lr) {
                        iMax = Math.max(0, Math.min(i2, iRi - 1));
                    }
                } else {
                    int i3 = lrVar.lr;
                    if (i3 != iRi2) {
                        if (i3 == this.ka) {
                            iMax = iRi2;
                        }
                        lrVar.lr = iRi2;
                    }
                }
                z = true;
            }
            i++;
        }
        Collections.sort(this.xha, fi);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C0194ik c0194ik = (C0194ik) getChildAt(i4).getLayoutParams();
                if (!c0194ik.ri) {
                    c0194ik.ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            ri(iMax, false, true);
            requestLayout();
        }
    }

    private void ik(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    private void di(int i) {
        ka kaVar = this.qh;
        if (kaVar != null) {
            kaVar.co(i);
        }
        List<ka> list = this.rzk;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ka kaVar2 = this.rzk.get(i2);
                if (kaVar2 != null) {
                    kaVar2.co(i);
                }
            }
        }
        ka kaVar3 = this.gcp;
        if (kaVar3 != null) {
            kaVar3.co(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    public boolean ik(int i) {
        boolean zKa;
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
                zKa = ka();
            } else if (i == 66 || i == 2) {
                zKa = fi();
            } else {
                zKa = false;
            }
        } else if (i == 17) {
            int i2 = ri(this.jbs, viewFindNextFocus).left;
            int i3 = ri(this.jbs, viewFindFocus).left;
            if (viewFindFocus != null && i2 >= i3) {
                zKa = ka();
            } else {
                zKa = viewFindNextFocus.requestFocus();
            }
        } else if (i == 66) {
            int i4 = ri(this.jbs, viewFindNextFocus).left;
            int i5 = ri(this.jbs, viewFindFocus).left;
            if (viewFindFocus == null || i4 > i5) {
                zKa = viewFindNextFocus.requestFocus();
            } else {
                zKa = fi();
            }
        } else {
            zKa = false;
        }
        if (zKa) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zKa;
    }

    public boolean fi() {
        com.bytedance.adsdk.ugeno.mj.lr lrVar = this.ik;
        if (lrVar == null || this.ka >= lrVar.ri() - 1) {
            return false;
        }
        ri(this.ka + 1, true);
        return true;
    }

    public boolean ka() {
        int i = this.ka;
        if (i <= 0) {
            return false;
        }
        ri(i - 1, true);
        return true;
    }

    public void ri(int i, boolean z) {
        this.su = false;
        ri(i, z, false);
    }

    public void ri(int i, boolean z, boolean z2) {
        ri(i, z, z2, 0);
    }

    public void ri(int i, boolean z, boolean z2, int i2) {
        com.bytedance.adsdk.ugeno.mj.lr lrVar = this.ik;
        if (lrVar != null && lrVar.ri() > 0) {
            if (!z2 && this.ka == i && this.xha.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.ik.ri()) {
                i = this.ik.ri() - 1;
            }
            int i3 = this.igq;
            int i4 = this.ka;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.xha.size(); i5++) {
                    this.xha.get(i5).ik = true;
                }
            }
            boolean z3 = this.ka != i;
            if (this.bnj) {
                this.ka = i;
                if (z3) {
                    fi(i);
                }
                requestLayout();
                return;
            }
            ri(i);
            ri(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public lr lr(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return ri(view);
            }
        }
    }

    public lr lr(int i) {
        for (int i2 = 0; i2 < this.xha.size(); i2++) {
            lr lrVar = this.xha.get(i2);
            if (lrVar.lr == i) {
                return lrVar;
            }
        }
        return null;
    }

    private void lr(int i, float f, int i2) {
        ka kaVar = this.qh;
        if (kaVar != null) {
            kaVar.ri(i, f, i2);
        }
        List<ka> list = this.rzk;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ka kaVar2 = this.rzk.get(i3);
                if (kaVar2 != null) {
                    kaVar2.ri(i, f, i2);
                }
            }
        }
        ka kaVar3 = this.gcp;
        if (kaVar3 != null) {
            kaVar3.ri(i, f, i2);
        }
    }

    private void ri(int i, boolean z, int i2, boolean z2) {
        lr lrVarLr = lr(i);
        int clientWidth = lrVarLr != null ? (int) (getClientWidth() * Math.max(this.ac, Math.min(lrVarLr.fi, this.ihz))) : 0;
        if (z) {
            ri(clientWidth, 0, i2);
            if (z2) {
                fi(i);
                return;
            }
            return;
        }
        if (z2) {
            fi(i);
        }
        ri(false);
        scrollTo(clientWidth, 0);
        ka(clientWidth);
    }

    private void lr(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.zb : 0, null);
        }
    }

    private boolean lr(float f) {
        boolean z;
        boolean z2;
        float f2 = this.xd - f;
        this.xd = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.ac * clientWidth;
        float f4 = this.ihz * clientWidth;
        boolean z3 = false;
        lr lrVar = this.xha.get(0);
        ArrayList<lr> arrayList = this.xha;
        lr lrVar2 = arrayList.get(arrayList.size() - 1);
        if (lrVar.lr != 0) {
            f3 = lrVar.fi * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (lrVar2.lr != this.ik.ri() - 1) {
            f4 = lrVar2.fi * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.fe.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.ta.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.xd += scrollX - i;
        scrollTo(i, getScrollY());
        ka(i);
        return z3;
    }

    public void ri(ka kaVar) {
        if (this.rzk == null) {
            this.rzk = new ArrayList();
        }
        this.rzk.add(kaVar);
    }

    public void ri(boolean z, fi fiVar) {
        ri(z, fiVar, 2);
    }

    public void ri(boolean z, fi fiVar, int i) {
        boolean z2 = fiVar != null;
        boolean z3 = z2 != (this.nd != null);
        this.nd = fiVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.aac = z ? 2 : 1;
            this.zb = i;
        } else {
            this.aac = 0;
        }
        if (z3) {
            ik();
        }
    }

    public float ri(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void ri(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.aw;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.bgr ? this.aw.getCurrX() : this.aw.getStartX();
            this.aw.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            ri(false);
            ik();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fRi = f2 + (ri(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2);
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fRi / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i5) / ((f * this.ik.ri(this.ka)) + this.slm)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.bgr = false;
        this.aw.startScroll(i4, scrollY, i5, i6, iMin);
        postInvalidateOnAnimation();
    }

    public lr ri(int i, int i2) {
        lr lrVar = new lr();
        lrVar.lr = i;
        lrVar.ri = this.ik.ri((ViewGroup) this, i);
        lrVar.ka = this.ik.ri(i);
        if (i2 >= 0 && i2 < this.xha.size()) {
            this.xha.add(i2, lrVar);
            return lrVar;
        }
        this.xha.add(lrVar);
        return lrVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c6 A[PHI: r7 r10 r15
  0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    public void ri(int i) {
        lr lrVarLr;
        String hexString;
        lr lrVarRi;
        lr lrVarRi2;
        lr lrVar;
        int i2 = this.ka;
        if (i2 != i) {
            lrVarLr = lr(i2);
            this.ka = i;
        } else {
            lrVarLr = null;
        }
        if (this.ik == null) {
            xha();
            return;
        }
        if (this.su) {
            xha();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.igq;
        int iMax = Math.max(0, this.ka - i3);
        int iRi = this.ik.ri();
        int iMin = Math.min(iRi - 1, this.ka + i3);
        if (iRi == this.ri) {
            int i4 = 0;
            while (true) {
                if (i4 < this.xha.size()) {
                    lrVarRi = this.xha.get(i4);
                    int i5 = lrVarRi.lr;
                    int i6 = this.ka;
                    if (i5 >= i6) {
                        if (i5 != i6) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i4++;
                }
                lrVarRi = null;
                break;
            }
            if (lrVarRi == null && iRi > 0) {
                lrVarRi = ri(this.ka, i4);
            }
            if (lrVarRi != null) {
                int i7 = i4 - 1;
                lr lrVar2 = i7 >= 0 ? this.xha.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - lrVarRi.ka) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                for (int i8 = this.ka - 1; i8 >= 0; i8--) {
                    if (f >= paddingLeft && i8 < iMax) {
                        if (lrVar2 == null) {
                            break;
                        }
                        if (i8 == lrVar2.lr && !lrVar2.ik) {
                            this.xha.remove(i7);
                            this.ik.ri((ViewGroup) this, i8, lrVar2.ri);
                            i7--;
                            i4--;
                            if (i7 >= 0) {
                                lrVar = this.xha.get(i7);
                            } else {
                                lrVar = null;
                            }
                            lrVar2 = lrVar;
                        }
                    } else {
                        if (lrVar2 != null && i8 == lrVar2.lr) {
                            f += lrVar2.ka;
                            i7--;
                            if (i7 >= 0) {
                                lrVar = this.xha.get(i7);
                            } else {
                                lrVar = null;
                            }
                        } else {
                            f += ri(i8, i7 + 1).ka;
                            i4++;
                            if (i7 >= 0) {
                                lrVar = this.xha.get(i7);
                            } else {
                                lrVar = null;
                            }
                        }
                        lrVar2 = lrVar;
                    }
                }
                float f2 = lrVarRi.ka;
                int i9 = i4 + 1;
                if (f2 < 2.0f) {
                    lr lrVar3 = i9 < this.xha.size() ? this.xha.get(i9) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i10 = this.ka;
                    while (true) {
                        i10++;
                        if (i10 >= iRi) {
                            break;
                        }
                        if (f2 >= paddingRight && i10 > iMin) {
                            if (lrVar3 == null) {
                                break;
                            }
                            if (i10 == lrVar3.lr && !lrVar3.ik) {
                                this.xha.remove(i9);
                                this.ik.ri((ViewGroup) this, i10, lrVar3.ri);
                                if (i9 < this.xha.size()) {
                                    lrVar3 = this.xha.get(i9);
                                }
                            }
                        } else if (lrVar3 != null && i10 == lrVar3.lr) {
                            f2 += lrVar3.ka;
                            i9++;
                            if (i9 < this.xha.size()) {
                                lrVar3 = this.xha.get(i9);
                            }
                        } else {
                            lr lrVarRi3 = ri(i10, i9);
                            i9++;
                            f2 += lrVarRi3.ka;
                            lrVar3 = i9 < this.xha.size() ? this.xha.get(i9) : null;
                        }
                    }
                }
                ri(lrVarRi, i4, lrVarLr);
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C0194ik c0194ik = (C0194ik) childAt.getLayoutParams();
                c0194ik.di = i11;
                if (!c0194ik.ri && c0194ik.ik == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (lrVarRi2 = ri(childAt)) != null) {
                    c0194ik.ik = lrVarRi2.ka;
                    c0194ik.fi = lrVarRi2.lr;
                }
            }
            xha();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                lr lrVarLr2 = viewFindFocus != null ? lr(viewFindFocus) : null;
                if (lrVarLr2 == null || lrVarLr2.lr != this.ka) {
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        View childAt2 = getChildAt(i12);
                        lr lrVarRi4 = ri(childAt2);
                        if (lrVarRi4 != null && lrVarRi4.lr == this.ka && childAt2.requestFocus(2)) {
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
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.ri + ", found: " + iRi + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.ik.getClass());
    }

    private void ri(lr lrVar, int i, lr lrVar2) {
        int i2;
        int i3;
        lr lrVar3;
        lr lrVar4;
        int iRi = this.ik.ri();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.slm / clientWidth : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (lrVar2 != null) {
            int i4 = lrVar2.lr;
            int i5 = lrVar.lr;
            if (i4 < i5) {
                float fRi = lrVar2.fi + lrVar2.ka + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= lrVar.lr && i7 < this.xha.size()) {
                    lr lrVar5 = this.xha.get(i7);
                    while (true) {
                        lrVar4 = lrVar5;
                        if (i6 <= lrVar4.lr || i7 >= this.xha.size() - 1) {
                            break;
                        }
                        i7++;
                        lrVar5 = this.xha.get(i7);
                    }
                    while (i6 < lrVar4.lr) {
                        fRi += this.ik.ri(i6) + f;
                        i6++;
                    }
                    lrVar4.fi = fRi;
                    fRi += lrVar4.ka + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.xha.size() - 1;
                float fRi2 = lrVar2.fi;
                while (true) {
                    i4--;
                    if (i4 < lrVar.lr || size < 0) {
                        break;
                    }
                    lr lrVar6 = this.xha.get(size);
                    while (true) {
                        lrVar3 = lrVar6;
                        if (i4 >= lrVar3.lr || size <= 0) {
                            break;
                        }
                        size--;
                        lrVar6 = this.xha.get(size);
                    }
                    while (i4 > lrVar3.lr) {
                        fRi2 -= this.ik.ri(i4) + f;
                        i4--;
                    }
                    fRi2 -= lrVar3.ka + f;
                    lrVar3.fi = fRi2;
                }
            }
        }
        int size2 = this.xha.size();
        float fRi3 = lrVar.fi;
        int i8 = lrVar.lr;
        int i9 = i8 - 1;
        this.ac = i8 == 0 ? fRi3 : -3.4028235E38f;
        int i10 = iRi - 1;
        this.ihz = i8 == i10 ? (lrVar.ka + fRi3) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            lr lrVar7 = this.xha.get(i11);
            while (true) {
                i3 = lrVar7.lr;
                if (i9 <= i3) {
                    break;
                }
                fRi3 -= this.ik.ri(i9) + f;
                i9--;
            }
            fRi3 -= lrVar7.ka + f;
            lrVar7.fi = fRi3;
            if (i3 == 0) {
                this.ac = fRi3;
            }
            i11--;
            i9--;
        }
        float fRi4 = lrVar.fi + lrVar.ka + f;
        int i12 = lrVar.lr + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            lr lrVar8 = this.xha.get(i13);
            while (true) {
                i2 = lrVar8.lr;
                if (i12 >= i2) {
                    break;
                }
                fRi4 += this.ik.ri(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.ihz = (lrVar8.ka + fRi4) - 1.0f;
            }
            lrVar8.fi = fRi4;
            fRi4 += lrVar8.ka + f;
            i13++;
            i12++;
        }
        this.siy = false;
    }

    public lr ri(View view) {
        for (int i = 0; i < this.xha.size(); i++) {
            lr lrVar = this.xha.get(i);
            if (this.ik.ri(view, lrVar.ri)) {
                return lrVar;
            }
        }
        return null;
    }

    private void ri(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.xha.isEmpty()) {
            if (!this.aw.isFinished()) {
                this.aw.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        lr lrVarLr = lr(this.ka);
        int iMin = (int) ((lrVarLr != null ? Math.min(lrVarLr.fi, this.ihz) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            ri(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    public void ri(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.xm > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C0194ik c0194ik = (C0194ik) childAt.getLayoutParams();
                if (c0194ik.ri) {
                    int i4 = c0194ik.lr & 7;
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
        lr(i, f, i2);
        if (this.nd != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((C0194ik) childAt2.getLayoutParams()).ri) {
                    this.nd.ri(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.whw = true;
    }

    private void ri(boolean z) {
        boolean z2 = this.pc == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.aw.isFinished()) {
                this.aw.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.aw.getCurrX();
                int currY = this.aw.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        ka(currX);
                    }
                }
            }
        }
        this.su = false;
        for (int i = 0; i < this.xha.size(); i++) {
            lr lrVar = this.xha.get(i);
            if (lrVar.ik) {
                lrVar.ik = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.saa);
            } else {
                this.saa.run();
            }
        }
    }

    private boolean ri(float f, float f2) {
        if (f >= this.hcw || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f > ((float) (getWidth() - this.hcw)) && f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private int ri(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.feb || Math.abs(i2) <= this.jc) {
            i += (int) (f + (i >= this.ka ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.xha.size() <= 0) {
            return i;
        }
        lr lrVar = this.xha.get(0);
        ArrayList<lr> arrayList = this.xha;
        return Math.max(lrVar.lr, Math.min(i, arrayList.get(arrayList.size() - 1).lr));
    }

    private void ri(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.qd) {
            int i = actionIndex == 0 ? 1 : 0;
            this.xd = motionEvent.getX(i);
            this.qd = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.srn;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean ri(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && ri(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean ri(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return ka();
            }
            return ik(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return fi();
            }
            return ik(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return ik(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return ik(1);
        }
        return false;
    }

    private Rect ri(Rect rect, View view) {
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
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}

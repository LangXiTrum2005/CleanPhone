package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BuildCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class DropDownListView extends ListView {
    public final Rect e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public GateKeeperDrawable k0;
    public boolean l0;
    public final boolean m0;
    public boolean n0;
    public ListViewAutoScrollHelper o0;
    public ResolveHoverRunnable p0;

    public static class Api21Impl {
        public static void a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    public static class Api30Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f3607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f3608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f3609c;
        public static final boolean d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f3607a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f3608b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f3609c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                d = true;
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class Api33Impl {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z2) {
            absListView.setSelectedChildViewEnabled(z2);
        }
    }

    public static class GateKeeperDrawable extends DrawableWrapperCompat {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f3610Y;

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f3610Y) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f3610Y) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f3610Y) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f3610Y) {
                return this.X.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z2, boolean z3) {
            if (this.f3610Y) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    public static class PreApi33Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f3611a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
            f3611a = declaredField;
        }
    }

    public class ResolveHoverRunnable implements Runnable {
        public ResolveHoverRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.p0 = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.e0 = new Rect();
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.m0 = z2;
        setCacheColorHint(0);
    }

    public int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public boolean b(MotionEvent motionEvent, int i2) {
        boolean z2;
        boolean zA;
        View childAt;
        View childAt2;
        ListViewAutoScrollHelper listViewAutoScrollHelper;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z2 = true;
            } else if (actionMasked != 3) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (z2 || z3) {
                this.n0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.j0 - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z2) {
                if (this.o0 == null) {
                    this.o0 = new ListViewAutoScrollHelper(this);
                }
                ListViewAutoScrollHelper listViewAutoScrollHelper2 = this.o0;
                boolean z4 = listViewAutoScrollHelper2.q0;
                listViewAutoScrollHelper2.q0 = true;
                listViewAutoScrollHelper2.onTouch(this, motionEvent);
            } else {
                listViewAutoScrollHelper = this.o0;
                if (listViewAutoScrollHelper != null) {
                    if (listViewAutoScrollHelper.q0) {
                        listViewAutoScrollHelper.e();
                    }
                    listViewAutoScrollHelper.q0 = false;
                }
            }
            return z2;
        }
        z2 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex < 0) {
            z2 = false;
            z3 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.n0 = true;
                Api21Impl.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.j0;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.j0 = iPointToPosition;
                Api21Impl.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top2 = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.e0;
                rect.set(left, top2, right, bottom);
                rect.left -= this.f0;
                rect.top -= this.g0;
                rect.right += this.h0;
                rect.bottom += this.i0;
                if (BuildCompat.c()) {
                    zA = Api33Impl.a(this);
                } else {
                    Field field = PreApi33Impl.f3611a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z6 = !zA;
                    if (BuildCompat.c()) {
                        Api33Impl.b(this, z6);
                    } else {
                        Field field2 = PreApi33Impl.f3611a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    DrawableCompat.f(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    DrawableCompat.f(selector2, f, f2);
                }
                GateKeeperDrawable gateKeeperDrawable = this.k0;
                if (gateKeeperDrawable != null) {
                    gateKeeperDrawable.f3610Y = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z3 = false;
                z2 = true;
            }
        }
        if (z2) {
            this.n0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.j0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.n0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.j0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z2) {
            if (this.o0 == null) {
                this.o0 = new ListViewAutoScrollHelper(this);
            }
            ListViewAutoScrollHelper listViewAutoScrollHelper3 = this.o0;
            boolean z7 = listViewAutoScrollHelper3.q0;
            listViewAutoScrollHelper3.q0 = true;
            listViewAutoScrollHelper3.onTouch(this, motionEvent);
        } else {
            listViewAutoScrollHelper = this.o0;
            if (listViewAutoScrollHelper != null) {
                if (listViewAutoScrollHelper.q0) {
                    listViewAutoScrollHelper.e();
                }
                listViewAutoScrollHelper.q0 = false;
            }
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.e0;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.p0 != null) {
            return;
        }
        super.drawableStateChanged();
        GateKeeperDrawable gateKeeperDrawable = this.k0;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.f3610Y = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.n0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.m0 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.m0 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.m0 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.m0 && this.l0) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.p0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.p0 == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.p0 = resolveHoverRunnable;
            post(resolveHoverRunnable);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i2 < 30 || !Api30Impl.d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        Api30Impl.f3607a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        Api30Impl.f3608b.invoke(this, Integer.valueOf(iPointToPosition));
                        Api30Impl.f3609c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.n0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.p0;
        if (resolveHoverRunnable != null) {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.p0 = null;
            dropDownListView.removeCallbacks(resolveHoverRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.l0 = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable = null;
        if (drawable != null) {
            GateKeeperDrawable gateKeeperDrawable2 = new GateKeeperDrawable();
            Drawable drawable2 = gateKeeperDrawable2.X;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            gateKeeperDrawable2.X = drawable;
            drawable.setCallback(gateKeeperDrawable2);
            gateKeeperDrawable2.f3610Y = true;
            gateKeeperDrawable = gateKeeperDrawable2;
        }
        this.k0 = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f0 = rect.left;
        this.g0 = rect.top;
        this.h0 = rect.right;
        this.i0 = rect.bottom;
    }
}

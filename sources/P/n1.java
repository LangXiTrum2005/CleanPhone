package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.storage.androidcleaner.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class n1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f47729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l1 f47735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f47737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p0.c f47739k;
    public androidx.lifecycle.a0 l;

    public n1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f47729a = new Rect();
        this.f47730b = 0;
        this.f47731c = 0;
        this.f47732d = 0;
        this.f47733e = 0;
        this.f47737i = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
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
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x014f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x016e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(int i10, MotionEvent motionEvent) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        p0.c cVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z11) {
                this.f47738j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f47734f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.f47739k == null) {
                    this.f47739k = new p0.c(this);
                }
                p0.c cVar2 = this.f47739k;
                boolean z12 = cVar2.f47902p;
                cVar2.f47902p = true;
                cVar2.onTouch(this, motionEvent);
            } else {
                cVar = this.f47739k;
                if (cVar != null) {
                    if (cVar.f47902p) {
                        cVar.d();
                    }
                    cVar.f47902p = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.f47738j = true;
                int i11 = Build.VERSION.SDK_INT;
                i1.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f47734f;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f47734f = iPointToPosition;
                i1.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f47729a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f47730b;
                rect.top -= this.f47731c;
                rect.right += this.f47732d;
                rect.bottom += this.f47733e;
                if (i11 >= 33) {
                    zA = k1.a(this);
                } else {
                    Field field = m1.f47721a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        k1.b(this, z14);
                    } else {
                        Field field2 = m1.f47721a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                l1 l1Var = this.f47735g;
                if (l1Var != null) {
                    l1Var.f47718b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z11 = false;
                z10 = true;
            }
        }
        if (z10) {
            this.f47738j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f47734f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f47738j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f47734f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.f47739k == null) {
                this.f47739k = new p0.c(this);
            }
            p0.c cVar3 = this.f47739k;
            boolean z15 = cVar3.f47902p;
            cVar3.f47902p = true;
            cVar3.onTouch(this, motionEvent);
        } else {
            cVar = this.f47739k;
            if (cVar != null) {
                if (cVar.f47902p) {
                    cVar.d();
                }
                cVar.f47902p = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f47729a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.l != null) {
            return;
        }
        super.drawableStateChanged();
        l1 l1Var = this.f47735g;
        if (l1Var != null) {
            l1Var.f47718b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f47738j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f47737i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f47737i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f47737i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f47737i && this.f47736h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.l == null) {
            androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0(this, 26);
            this.l = a0Var;
            post(a0Var);
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
                if (j1.f47699d) {
                    try {
                        j1.f47696a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        j1.f47697b.invoke(this, Integer.valueOf(iPointToPosition));
                        j1.f47698c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f47738j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f47734f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.lifecycle.a0 a0Var = this.l;
        if (a0Var != null) {
            n1 n1Var = (n1) a0Var.f4524b;
            n1Var.l = null;
            n1Var.removeCallbacks(a0Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f47736h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        l1 l1Var = null;
        if (drawable != null) {
            l1 l1Var2 = new l1();
            Drawable drawable2 = l1Var2.f47717a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            l1Var2.f47717a = drawable;
            drawable.setCallback(l1Var2);
            l1Var2.f47718b = true;
            l1Var = l1Var2;
        }
        this.f47735g = l1Var;
        super.setSelector(l1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f47730b = rect.left;
        this.f47731c = rect.top;
        this.f47732d = rect.right;
        this.f47733e = rect.bottom;
    }
}

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
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.lotta;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: DropDownListView.java */
/* JADX INFO: loaded from: classes.dex */
public class gintrap extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private lotta mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    beachfront mResolveHoverRunnable;
    private androidx.core.widget.cutely mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private wireman mSelector;
    private final Rect mSelectorRect;

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class attabal {
        public static void attabal(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public class beachfront implements Runnable {
        public beachfront() {
        }

        public void attabal() {
            gintrap gintrapVar = gintrap.this;
            gintrapVar.mResolveHoverRunnable = null;
            gintrapVar.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            gintrap gintrapVar = gintrap.this;
            gintrapVar.mResolveHoverRunnable = null;
            gintrapVar.drawableStateChanged();
        }

        public void saneness() {
            gintrap.this.post(this);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class dern {
        public static boolean attabal(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void saneness(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final Field f5451attabal;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f5451attabal = declaredField;
        }

        public static boolean attabal(AbsListView absListView) {
            Field field = f5451attabal;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        public static void saneness(AbsListView absListView, boolean z) {
            Field field = f5451attabal;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static Method f5452attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static Method f5453dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static Method f5454saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static boolean f5455wireman;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f5452attabal = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f5454saneness = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f5453dern = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f5455wireman = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public static boolean attabal() {
            return f5455wireman;
        }

        public static void saneness(gintrap gintrapVar, int i, View view) {
            try {
                f5452attabal.invoke(gintrapVar, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f5454saneness.invoke(gintrapVar, Integer.valueOf(i));
                f5453dern.invoke(gintrapVar, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class wireman extends impromptu.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f5456arytenoidectomy;

        public wireman(Drawable drawable) {
            super(drawable);
            this.f5456arytenoidectomy = true;
        }

        @Override // impromptu.attabal, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f5456arytenoidectomy) {
                super.draw(canvas);
            }
        }

        public void saneness(boolean z) {
            this.f5456arytenoidectomy = z;
        }

        @Override // impromptu.attabal, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f5456arytenoidectomy) {
                super.setHotspot(f, f2);
            }
        }

        @Override // impromptu.attabal, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f5456arytenoidectomy) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // impromptu.attabal, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f5456arytenoidectomy) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // impromptu.attabal, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f5456arytenoidectomy) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public gintrap(Context context, boolean z) {
        super(context, null, beachfront.attabal.dropDownListViewStyle);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = z;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        lotta lottaVar = this.mClickAnimation;
        if (lottaVar != null) {
            lottaVar.dern();
            this.mClickAnimation = null;
        }
    }

    private void clickPressedItem(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void drawSelectorCompat(Canvas canvas) {
        Drawable selector;
        if (this.mSelectorRect.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.mSelectorRect);
        selector.draw(canvas);
    }

    private void positionSelectorCompat(int i, View view) {
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        boolean zSuperIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != zSuperIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!zSuperIsSelectedChildViewEnabled);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    private void positionSelectorLikeFocusCompat(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z) {
            Rect rect = this.mSelectorRect;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            DrawableCompat.setHotspot(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void positionSelectorLikeTouchCompat(int i, View view, float f, float f2) {
        positionSelectorLikeFocusCompat(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        DrawableCompat.setHotspot(selector, f, f2);
    }

    private void setPressedItem(View view, int i, float f, float f2) {
        View childAt;
        this.mDrawsInPressedState = true;
        attabal.attabal(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.mMotionPosition;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.mMotionPosition = i;
        attabal.attabal(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void setSelectorEnabled(boolean z) {
        wireman wiremanVar = this.mSelector;
        if (wiremanVar != null) {
            wiremanVar.saneness(z);
        }
    }

    private boolean superIsSelectedChildViewEnabled() {
        return Build.VERSION.SDK_INT >= 33 ? dern.attabal(this) : marial.attabal(this);
    }

    private void superSetSelectedChildViewEnabled(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            dern.saneness(this, z);
        } else {
            marial.saneness(this, z);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }

    private void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    iMin = Math.max(0, i);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
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
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean onForwardedEvent(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        androidx.core.widget.cutely cutelyVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    clearPressedItem();
                }
                if (z) {
                    cutelyVar = this.mScrollHelper;
                    if (cutelyVar != null) {
                        cutelyVar.impassible(false);
                    }
                    return z;
                }
                if (this.mScrollHelper == null) {
                    this.mScrollHelper = new androidx.core.widget.cutely(this);
                }
                this.mScrollHelper.impassible(true);
                this.mScrollHelper.onTouch(this, motionEvent);
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z2 = false;
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                setPressedItem(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    clickPressedItem(childAt, iPointToPosition);
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            clearPressedItem();
        } else {
            clearPressedItem();
        }
        if (z) {
            cutelyVar = this.mScrollHelper;
            if (cutelyVar != null) {
                cutelyVar.impassible(false);
            }
            return z;
        }
        if (this.mScrollHelper == null) {
            this.mScrollHelper = new androidx.core.widget.cutely(this);
        }
        this.mScrollHelper.impassible(true);
        this.mScrollHelper.onTouch(this, motionEvent);
        return z;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            beachfront beachfrontVar = new beachfront();
            this.mResolveHoverRunnable = beachfrontVar;
            beachfrontVar.saneness();
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
                if (i < 30 || !saneness.attabal()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    saneness.saneness(this, iPointToPosition, childAt);
                }
            }
            updateSelectorStateCompat();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        beachfront beachfrontVar = this.mResolveHoverRunnable;
        if (beachfrontVar != null) {
            beachfrontVar.attabal();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.mListSelectionHidden = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        wireman wiremanVar = drawable != null ? new wireman(drawable) : null;
        this.mSelector = wiremanVar;
        super.setSelector(wiremanVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }
}

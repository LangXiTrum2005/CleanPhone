package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {
    public static final Method B0;
    public static final Method C0;
    public final PopupWindow A0;
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ListAdapter f3613Y;
    public DropDownListView Z;
    public final int e0;
    public int f0;
    public int g0;
    public int h0;
    public final int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public final int n0;
    public DataSetObserver o0;
    public View p0;
    public AdapterView.OnItemClickListener q0;
    public AdapterView.OnItemSelectedListener r0;
    public final ResizePopupRunnable s0;
    public final PopupTouchInterceptor t0;
    public final PopupScrollListener u0;
    public final ListSelectorHider v0;
    public final Handler w0;
    public final Rect x0;
    public Rect y0;
    public boolean z0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$1, reason: invalid class name */
    class AnonymousClass1 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final /* bridge */ /* synthetic */ ShowableListMenu b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class Api24Impl {
        public static int a(PopupWindow popupWindow, View view, int i2, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i2, z2);
        }
    }

    public static class Api29Impl {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.Z;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.A0.isShowing()) {
                listPopupWindow.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (listPopupWindow.A0.getInputMethodMode() == 2 || listPopupWindow.A0.getContentView() == null) {
                    return;
                }
                Handler handler = listPopupWindow.w0;
                ResizePopupRunnable resizePopupRunnable = listPopupWindow.s0;
                handler.removeCallbacks(resizePopupRunnable);
                resizePopupRunnable.run();
            }
        }
    }

    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (popupWindow = listPopupWindow.A0) != null && popupWindow.isShowing() && x >= 0 && x < listPopupWindow.A0.getWidth() && y >= 0 && y < listPopupWindow.A0.getHeight()) {
                listPopupWindow.w0.postDelayed(listPopupWindow.s0, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            listPopupWindow.w0.removeCallbacks(listPopupWindow.s0);
            return false;
        }
    }

    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            DropDownListView dropDownListView = listPopupWindow.Z;
            if (dropDownListView != null) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                if (!dropDownListView.isAttachedToWindow() || listPopupWindow.Z.getCount() <= listPopupWindow.Z.getChildCount() || listPopupWindow.Z.getChildCount() > listPopupWindow.n0) {
                    return;
                }
                listPopupWindow.A0.setInputMethodMode(2);
                listPopupWindow.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean a() {
        return this.A0.isShowing();
    }

    public final int b() {
        return this.g0;
    }

    public final void d(int i2) {
        this.g0 = i2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        PopupWindow popupWindow = this.A0;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.Z = null;
        this.w0.removeCallbacks(this.s0);
    }

    public final void g(int i2) {
        this.h0 = i2;
        this.j0 = true;
    }

    public final Drawable getBackground() {
        return this.A0.getBackground();
    }

    public final int j() {
        if (this.j0) {
            return this.h0;
        }
        return 0;
    }

    public void l(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.o0;
        if (dataSetObserver == null) {
            this.o0 = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.f3613Y;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3613Y = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.o0);
        }
        DropDownListView dropDownListView = this.Z;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f3613Y);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView m() {
        return this.Z;
    }

    public DropDownListView n(Context context, boolean z2) {
        return new DropDownListView(context, z2);
    }

    public final void o(int i2) {
        Drawable background = this.A0.getBackground();
        if (background == null) {
            this.f0 = i2;
            return;
        }
        Rect rect = this.x0;
        background.getPadding(rect);
        this.f0 = rect.left + rect.right + i2;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.A0.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        int i2;
        int iMakeMeasureSpec;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.Z;
        PopupWindow popupWindow = this.A0;
        Context context = this.X;
        if (dropDownListView2 == null) {
            DropDownListView dropDownListViewN = n(context, !this.z0);
            this.Z = dropDownListViewN;
            dropDownListViewN.setAdapter(this.f3613Y);
            this.Z.setOnItemClickListener(this.q0);
            this.Z.setFocusable(true);
            this.Z.setFocusableInTouchMode(true);
            this.Z.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
                    DropDownListView dropDownListView3;
                    if (i3 == -1 || (dropDownListView3 = ListPopupWindow.this.Z) == null) {
                        return;
                    }
                    dropDownListView3.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.Z.setOnScrollListener(this.u0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.r0;
            if (onItemSelectedListener != null) {
                this.Z.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.Z);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.x0;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.j0) {
                this.h0 = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int iA = Api24Impl.a(popupWindow, this.p0, this.h0, popupWindow.getInputMethodMode() == 2);
        int i4 = this.e0;
        if (i4 == -1) {
            paddingBottom = iA + i2;
        } else {
            int i5 = this.f0;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.Z.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.Z.getPaddingBottom() + this.Z.getPaddingTop() + i2 : 0);
        }
        boolean z2 = this.A0.getInputMethodMode() == 2;
        PopupWindowCompat.b(popupWindow, this.i0);
        if (popupWindow.isShowing()) {
            View view = this.p0;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (view.isAttachedToWindow()) {
                int width = this.f0;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.p0.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f0 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f0 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view2 = this.p0;
                int i6 = this.g0;
                int i7 = this.h0;
                if (width < 0) {
                    width = -1;
                }
                popupWindow.update(view2, i6, i7, width, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f0;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.p0.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B0;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.t0);
        if (this.l0) {
            PopupWindowCompat.a(popupWindow, this.k0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C0;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.y0);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            Api29Impl.a(popupWindow, this.y0);
        }
        popupWindow.showAsDropDown(this.p0, this.g0, this.h0, this.m0);
        this.Z.setSelection(-1);
        if ((!this.z0 || this.Z.isInTouchMode()) && (dropDownListView = this.Z) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.z0) {
            return;
        }
        this.w0.post(this.v0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this.e0 = -2;
        this.f0 = -2;
        this.i0 = 1002;
        this.m0 = 0;
        this.n0 = Integer.MAX_VALUE;
        this.s0 = new ResizePopupRunnable();
        this.t0 = new PopupTouchInterceptor();
        this.u0 = new PopupScrollListener();
        this.v0 = new ListSelectorHider();
        this.x0 = new Rect();
        this.X = context;
        this.w0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.o, i2, 0);
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.s, i2, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            PopupWindowCompat.a(appCompatPopupWindow, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        appCompatPopupWindow.setBackgroundDrawable(tintTypedArray.b(0));
        tintTypedArray.f();
        this.A0 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}

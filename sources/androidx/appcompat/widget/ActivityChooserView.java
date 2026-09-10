package androidx.appcompat.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ActionProvider;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    public ActionProvider e0;
    public final DataSetObserver f0;
    public final ViewTreeObserver.OnGlobalLayoutListener g0;
    public ListPopupWindow h0;
    public PopupWindow.OnDismissListener i0;
    public boolean j0;
    public int k0;
    public boolean l0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$3, reason: invalid class name */
    class AnonymousClass3 extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$4, reason: invalid class name */
    class AnonymousClass4 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$5, reason: invalid class name */
    class AnonymousClass5 extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            throw null;
        }
    }

    public class ActivityChooserViewAdapter extends BaseAdapter {
        public ActivityChooserModel X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f3541Y;
        public boolean Z;
        public boolean e0;
        public boolean f0;

        @Override // android.widget.Adapter
        public final int getCount() {
            int size;
            ActivityChooserModel activityChooserModel = this.X;
            synchronized (activityChooserModel.f3533a) {
                activityChooserModel.a();
                size = activityChooserModel.f3534b.size();
            }
            if (!this.Z) {
                this.X.c();
            }
            int iMin = Math.min(size, this.f3541Y);
            return this.f0 ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.Z) {
                this.X.c();
            }
            ActivityChooserModel activityChooserModel = this.X;
            synchronized (activityChooserModel.f3533a) {
                activityChooserModel.a();
                throw null;
            }
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i2) {
            return (this.f0 && i2 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.list_item) {
                    throw null;
                }
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != 1) {
                throw null;
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    public class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
            int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType == 0) {
                throw null;
            }
            if (itemViewType != 1) {
                throw new IllegalArgumentException();
            }
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            throw null;
        }
    }

    public static class InnerLayout extends LinearLayout {
        public static final int[] e0 = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArray = new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, e0));
            setBackgroundDrawable(tintTypedArray.b(0));
            tintTypedArray.f();
        }
    }

    public ActivityChooserView() {
        super(null, null, 0);
        this.f0 = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.getClass();
                throw null;
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.getClass();
                throw null;
            }
        };
        this.g0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActionProvider.SubUiVisibilityListener subUiVisibilityListener;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.b()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.getListPopupWindow().dismiss();
                        return;
                    }
                    activityChooserView.getListPopupWindow().show();
                    ActionProvider actionProvider = activityChooserView.e0;
                    if (actionProvider == null || (subUiVisibilityListener = actionProvider.f4421b) == null) {
                        return;
                    }
                    ((ActionMenuPresenter) subUiVisibilityListener).o(true);
                }
            }
        };
        this.k0 = 4;
        throw null;
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.g0);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().A0.isShowing();
    }

    public final void c(int i2) {
        throw null;
    }

    public ActivityChooserModel getDataModel() {
        throw null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.h0 == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.h0 = listPopupWindow;
            listPopupWindow.l(null);
            ListPopupWindow listPopupWindow2 = this.h0;
            listPopupWindow2.p0 = this;
            listPopupWindow2.z0 = true;
            listPopupWindow2.A0.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.h0;
            listPopupWindow3.q0 = null;
            listPopupWindow3.A0.setOnDismissListener(null);
        }
        return this.h0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        throw null;
    }

    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) {
        throw null;
    }

    public void setDefaultActionButtonContentDescription(int i2) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        getContext().getString(i2);
        throw null;
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        throw null;
    }

    public void setInitialActivityCount(int i2) {
        this.k0 = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.i0 = onDismissListener;
    }

    public void setProvider(ActionProvider actionProvider) {
        this.e0 = actionProvider;
    }
}

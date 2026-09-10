package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    public static final int[] m0 = {R.attr.spinnerMode};
    public final AppCompatBackgroundHelper e0;
    public final Context f0;
    public final ForwardingListener g0;
    public SpinnerAdapter h0;
    public final boolean i0;
    public final SpinnerPopup j0;
    public int k0;
    public final Rect l0;

    public static final class Api16Impl {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class Api17Impl {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i2) {
            view.setTextAlignment(i2);
        }

        public static void d(View view, int i2) {
            view.setTextDirection(i2);
        }
    }

    public static final class Api23Impl {
        public static void a(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {
        public AlertDialog X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ListAdapter f3575Y;
        public CharSequence Z;

        public DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final boolean a() {
            AlertDialog alertDialog = this.X;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void d(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void dismiss() {
            AlertDialog alertDialog = this.X;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.X = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final CharSequence e() {
            return this.Z;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void f(CharSequence charSequence) {
            this.Z = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void g(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void h(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void i(int i2, int i3) {
            if (this.f3575Y == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.Z;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f3575Y;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            AlertController.AlertParams alertParams = builder.f3317a;
            alertParams.m = listAdapter;
            alertParams.f3313n = this;
            alertParams.q = selectedItemPosition;
            alertParams.f3314p = true;
            AlertDialog alertDialogCreate = builder.create();
            this.X = alertDialogCreate;
            AlertController.RecycleListView recycleListViewE = alertDialogCreate.e();
            Api17Impl.d(recycleListViewE, i2);
            Api17Impl.c(recycleListViewE, i3);
            this.X.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final int j() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void l(ListAdapter listAdapter) {
            this.f3575Y = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i2);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i2, this.f3575Y.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    public static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ListAdapter f3576Y;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3576Y;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.X;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f3576Y;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.X;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        public CharSequence D0;
        public ListAdapter E0;
        public final Rect F0;
        public int G0;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.F0 = new Rect();
            this.p0 = AppCompatSpinner.this;
            this.z0 = true;
            this.A0.setFocusable(true);
            this.q0 = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner.this.setSelection(i3);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i3, dropdownPopup.E0.getItemId(i3));
                    }
                    dropdownPopup.dismiss();
                }
            };
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final CharSequence e() {
            return this.D0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void f(CharSequence charSequence) {
            this.D0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void h(int i2) {
            this.G0 = i2;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void i(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            PopupWindow popupWindow = this.A0;
            boolean zIsShowing = popupWindow.isShowing();
            p();
            this.A0.setInputMethodMode(2);
            show();
            DropDownListView dropDownListView = this.Z;
            dropDownListView.setChoiceMode(1);
            Api17Impl.d(dropDownListView, i2);
            Api17Impl.c(dropDownListView, i3);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            DropDownListView dropDownListView2 = this.Z;
            if (popupWindow.isShowing() && dropDownListView2 != null) {
                dropDownListView2.setListSelectionHidden(false);
                dropDownListView2.setSelection(selectedItemPosition);
                if (dropDownListView2.getChoiceMode() != 0) {
                    dropDownListView2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    AppCompatSpinner appCompatSpinner2 = AppCompatSpinner.this;
                    dropdownPopup.getClass();
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(dropdownPopup.F0)) {
                        dropdownPopup.dismiss();
                    } else {
                        dropdownPopup.p();
                        dropdownPopup.show();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            this.A0.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public final void l(ListAdapter listAdapter) {
            super.l(listAdapter);
            this.E0 = listAdapter;
        }

        public final void p() {
            int i2;
            PopupWindow popupWindow = this.A0;
            Drawable background = popupWindow.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.l0);
                i2 = ViewUtils.a(appCompatSpinner) ? appCompatSpinner.l0.right : -appCompatSpinner.l0.left;
            } else {
                Rect rect = appCompatSpinner.l0;
                rect.right = 0;
                rect.left = 0;
                i2 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i3 = appCompatSpinner.k0;
            if (i3 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.E0, popupWindow.getBackground());
                int i4 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.l0;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (iA > i5) {
                    iA = i5;
                }
                o(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                o((width - paddingLeft) - paddingRight);
            } else {
                o(i3);
            }
            this.g0 = ViewUtils.a(appCompatSpinner) ? (((width - paddingRight) - this.f0) - this.G0) + i2 : paddingLeft + this.G0 + i2;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean X;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.X = parcel.readByte() != 0;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.X ? (byte) 1 : (byte) 0);
        }
    }

    public interface SpinnerPopup {
        boolean a();

        int b();

        void d(int i2);

        void dismiss();

        CharSequence e();

        void f(CharSequence charSequence);

        void g(int i2);

        Drawable getBackground();

        void h(int i2);

        void i(int i2, int i3);

        int j();

        void l(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i2);
        this.l0 = new Rect();
        ThemeUtils.a(this, getContext());
        int[] iArr = androidx.appcompat.R.styleable.v;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i2);
        this.e0 = new AppCompatBackgroundHelper(this);
        TypedArray typedArray = tintTypedArrayE.f3646b;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f0 = new ContextThemeWrapper(context, resourceId);
        } else {
            this.f0 = context;
        }
        int i3 = -1;
        TypedArray typedArray2 = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0, i2, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i3 != 0) {
                        DialogPopup dialogPopup = new DialogPopup();
                        this.j0 = dialogPopup;
                        dialogPopup.Z = typedArray.getString(2);
                    } else if (i3 == 1) {
                        final DropdownPopup dropdownPopup = new DropdownPopup(this.f0, attributeSet, i2);
                        TintTypedArray tintTypedArrayE2 = TintTypedArray.e(this.f0, attributeSet, iArr, i2);
                        this.k0 = tintTypedArrayE2.f3646b.getLayoutDimension(3, -2);
                        dropdownPopup.setBackgroundDrawable(tintTypedArrayE2.b(1));
                        dropdownPopup.D0 = typedArray.getString(2);
                        tintTypedArrayE2.f();
                        this.j0 = dropdownPopup;
                        this.g0 = new ForwardingListener(this) { // from class: androidx.appcompat.widget.AppCompatSpinner.1
                            @Override // androidx.appcompat.widget.ForwardingListener
                            public final ShowableListMenu b() {
                                return dropdownPopup;
                            }

                            @Override // androidx.appcompat.widget.ForwardingListener
                            public final boolean c() {
                                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                                if (appCompatSpinner.getInternalPopup().a()) {
                                    return true;
                                }
                                appCompatSpinner.j0.i(Api17Impl.b(appCompatSpinner), Api17Impl.a(appCompatSpinner));
                                return true;
                            }
                        };
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.charging.screenshow.battery.animations.themes.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    tintTypedArrayE.f();
                    this.i0 = true;
                    spinnerAdapter = this.h0;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.h0 = null;
                    }
                    this.e0.d(attributeSet, i2);
                }
            } catch (Exception e3) {
                e = e3;
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th) {
                th = th;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (i3 != 0) {
                DialogPopup dialogPopup2 = new DialogPopup();
                this.j0 = dialogPopup2;
                dialogPopup2.Z = typedArray.getString(2);
            } else if (i3 == 1) {
                final DropdownPopup dropdownPopup2 = new DropdownPopup(this.f0, attributeSet, i2);
                TintTypedArray tintTypedArrayE3 = TintTypedArray.e(this.f0, attributeSet, iArr, i2);
                this.k0 = tintTypedArrayE3.f3646b.getLayoutDimension(3, -2);
                dropdownPopup2.setBackgroundDrawable(tintTypedArrayE3.b(1));
                dropdownPopup2.D0 = typedArray.getString(2);
                tintTypedArrayE3.f();
                this.j0 = dropdownPopup2;
                this.g0 = new ForwardingListener(this) { // from class: androidx.appcompat.widget.AppCompatSpinner.1
                    @Override // androidx.appcompat.widget.ForwardingListener
                    public final ShowableListMenu b() {
                        return dropdownPopup2;
                    }

                    @Override // androidx.appcompat.widget.ForwardingListener
                    public final boolean c() {
                        AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                        if (appCompatSpinner.getInternalPopup().a()) {
                            return true;
                        }
                        appCompatSpinner.j0.i(Api17Impl.b(appCompatSpinner), Api17Impl.a(appCompatSpinner));
                        return true;
                    }
                };
            }
            textArray = typedArray.getTextArray(0);
            if (textArray != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter2.setDropDownViewResource(com.charging.screenshow.battery.animations.themes.R.layout.support_simple_spinner_dropdown_item);
                setAdapter((SpinnerAdapter) arrayAdapter2);
            }
            tintTypedArrayE.f();
            this.i0 = true;
            spinnerAdapter = this.h0;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.h0 = null;
            }
            this.e0.d(attributeSet, i2);
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = typedArrayObtainStyledAttributes;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.l0;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.j0;
        return spinnerPopup != null ? spinnerPopup.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.j0;
        return spinnerPopup != null ? spinnerPopup.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.j0 != null ? this.k0 : super.getDropDownWidth();
    }

    public final SpinnerPopup getInternalPopup() {
        return this.j0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.j0;
        return spinnerPopup != null ? spinnerPopup.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.j0;
        return spinnerPopup != null ? spinnerPopup.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup == null || !spinnerPopup.a()) {
            return;
        }
        spinnerPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.j0 == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.X || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (!appCompatSpinner.getInternalPopup().a()) {
                    appCompatSpinner.j0.i(Api17Impl.b(appCompatSpinner), Api17Impl.a(appCompatSpinner));
                }
                ViewTreeObserver viewTreeObserver2 = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    Api16Impl.a(viewTreeObserver2, this);
                }
            }
        });
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.j0;
        savedState.X = spinnerPopup != null && spinnerPopup.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.g0;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.a()) {
            return true;
        }
        this.j0.i(Api17Impl.b(this), Api17Impl.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            spinnerPopup.h(i2);
            spinnerPopup.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup != null) {
            spinnerPopup.g(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.j0 != null) {
            this.k0 = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup != null) {
            spinnerPopup.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AppCompatResources.a(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup != null) {
            spinnerPopup.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.e0;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i0) {
            this.h0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        SpinnerPopup spinnerPopup = this.j0;
        if (spinnerPopup != null) {
            Context context = this.f0;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            DropDownAdapter dropDownAdapter = new DropDownAdapter();
            dropDownAdapter.X = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dropDownAdapter.f3576Y = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    Api23Impl.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.A();
                    }
                }
            }
            spinnerPopup.l(dropDownAdapter);
        }
    }
}

package com.google.android.material.datepicker;

import A.ViewOnClickListenerC0885d;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public MaterialShapeDrawable A0;
    public Button B0;
    public boolean C0;
    public CharSequence D0;
    public CharSequence E0;
    public final LinkedHashSet X = new LinkedHashSet();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final LinkedHashSet f19259Y = new LinkedHashSet();
    public final LinkedHashSet Z = new LinkedHashSet();
    public final LinkedHashSet e0 = new LinkedHashSet();
    public int f0;
    public DateSelector g0;
    public PickerFragment h0;
    public CalendarConstraints i0;
    public DayViewDecorator j0;
    public MaterialCalendar k0;
    public int l0;
    public CharSequence m0;
    public boolean n0;
    public int o0;
    public int p0;
    public CharSequence q0;
    public int r0;
    public CharSequence s0;
    public int t0;
    public CharSequence u0;
    public int v0;
    public CharSequence w0;
    public TextView x0;
    public TextView y0;
    public CheckableImageButton z0;

    public static final class Builder<S> {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    public static int d(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(UtcDates.f());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i2 = month.e0;
        return ((i2 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i2) + (dimensionPixelOffset * 2);
    }

    public static boolean e(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.c(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    public final DateSelector c() {
        if (this.g0 == null) {
            this.g0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.g0;
    }

    public final void f() {
        Context contextRequireContext = requireContext();
        int iH = this.f0;
        if (iH == 0) {
            iH = c().h(contextRequireContext);
        }
        DateSelector dateSelectorC = c();
        CalendarConstraints calendarConstraints = this.i0;
        DayViewDecorator dayViewDecorator = this.j0;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iH);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelectorC);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.e0);
        materialCalendar.setArguments(bundle);
        this.k0 = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.o0 == 1) {
            DateSelector dateSelectorC2 = c();
            CalendarConstraints calendarConstraints2 = this.i0;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iH);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelectorC2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            materialTextInputPicker.setArguments(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.h0 = pickerFragment;
        this.x0.setText((this.o0 == 1 && getResources().getConfiguration().orientation == 2) ? this.E0 : this.D0);
        String strO = c().o(getContext());
        this.y0.setContentDescription(c().d(requireContext()));
        this.y0.setText(strO);
        FragmentTransaction fragmentTransactionD = getChildFragmentManager().d();
        fragmentTransactionD.h(R.id.mtrl_calendar_frame, this.h0, null, 2);
        fragmentTransactionD.e();
        this.h0.b(new OnSelectionChangedListener<Object>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.4
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void a() {
                MaterialDatePicker.this.B0.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void b(Object obj) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                String strO2 = materialDatePicker.c().o(materialDatePicker.getContext());
                materialDatePicker.y0.setContentDescription(materialDatePicker.c().d(materialDatePicker.requireContext()));
                materialDatePicker.y0.setText(strO2);
                materialDatePicker.B0.setEnabled(materialDatePicker.c().C0());
            }
        });
    }

    public final void g(CheckableImageButton checkableImageButton) {
        this.z0.setContentDescription(this.o0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.g0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.j0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.l0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.m0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.o0 = bundle.getInt("INPUT_MODE_KEY");
        this.p0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.q0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.r0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.s0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.t0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.u0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.v0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.w0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.m0;
        if (text == null) {
            text = requireContext().getResources().getText(this.l0);
        }
        this.D0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), IOUtils.LINE_SEPARATOR_UNIX);
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.E0 = text;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iH = this.f0;
        if (iH == 0) {
            iH = c().h(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iH);
        Context context = dialog.getContext();
        this.n0 = e(context, android.R.attr.windowFullscreen);
        this.A0 = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.f19074p, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.A0.j(context);
        this.A0.l(ColorStateList.valueOf(color));
        this.A0.k(ViewCompat.k(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.n0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.n0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(d(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(d(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.y0 = textView;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        textView.setAccessibilityLiveRegion(1);
        this.z0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.x0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.z0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.z0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.z0.setChecked(this.o0 != 0);
        ViewCompat.z(this.z0, null);
        g(this.z0);
        this.z0.setOnClickListener(new ViewOnClickListenerC0885d(this, 19));
        this.B0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (c().C0()) {
            this.B0.setEnabled(true);
        } else {
            this.B0.setEnabled(false);
        }
        this.B0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.q0;
        if (charSequence != null) {
            this.B0.setText(charSequence);
        } else {
            int i2 = this.p0;
            if (i2 != 0) {
                this.B0.setText(i2);
            }
        }
        CharSequence charSequence2 = this.s0;
        if (charSequence2 != null) {
            this.B0.setContentDescription(charSequence2);
        } else if (this.r0 != 0) {
            this.B0.setContentDescription(getContext().getResources().getText(this.r0));
        }
        this.B0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                for (MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener : materialDatePicker.X) {
                    materialDatePicker.c().getClass();
                    materialPickerOnPositiveButtonClickListener.a();
                }
                materialDatePicker.dismiss();
            }
        });
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.u0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.t0;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        CharSequence charSequence4 = this.w0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.v0 != 0) {
            button.setContentDescription(getContext().getResources().getText(this.v0));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                Iterator it = materialDatePicker.f19259Y.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialDatePicker.dismiss();
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.g0);
        CalendarConstraints calendarConstraints = this.i0;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        int i2 = CalendarConstraints.Builder.f19231c;
        int i3 = CalendarConstraints.Builder.f19231c;
        builder.f19233b = new DateValidatorPointForward(Long.MIN_VALUE);
        long j = calendarConstraints.X.g0;
        long j2 = calendarConstraints.f19230Y.g0;
        builder.f19232a = Long.valueOf(calendarConstraints.e0.g0);
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.Z;
        builder.f19233b = dateValidator;
        MaterialCalendar materialCalendar = this.k0;
        Month month = materialCalendar == null ? null : materialCalendar.g0;
        if (month != null) {
            builder.f19232a = Long.valueOf(month.g0);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthB = Month.b(j);
        Month monthB2 = Month.b(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = builder.f19232a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthB, monthB2, dateValidator2, l2 != null ? Month.b(l2.longValue()) : null, calendarConstraints.f0));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.j0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.l0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.m0);
        bundle.putInt("INPUT_MODE_KEY", this.o0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.p0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.q0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.r0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.s0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.t0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.u0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.v0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.w0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.n0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A0);
            if (!this.C0) {
                final View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListD = DrawableUtils.d(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = numValueOf == null || numValueOf.intValue() == 0;
                int iC = MaterialColors.c(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    numValueOf = Integer.valueOf(iC);
                }
                WindowCompat.a(window, false);
                window.getContext();
                int iE = i2 < 27 ? ColorUtils.e(MaterialColors.c(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                new WindowInsetsControllerCompat(window, window.getDecorView()).d(MaterialColors.d(0) || MaterialColors.d(numValueOf.intValue()));
                boolean zD = MaterialColors.d(iC);
                if (MaterialColors.d(iE) || (iE == 0 && zD)) {
                    z2 = true;
                }
                new WindowInsetsControllerCompat(window, window.getDecorView()).c(z2);
                final int paddingTop = viewFindViewById.getPaddingTop();
                final int i3 = viewFindViewById.getLayoutParams().height;
                ViewCompat.G(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.3
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                        int i4 = windowInsetsCompat.e(7).f4298b;
                        View view2 = viewFindViewById;
                        int i5 = i3;
                        if (i5 >= 0) {
                            view2.getLayoutParams().height = i5 + i4;
                            view2.setLayoutParams(view2.getLayoutParams());
                        }
                        view2.setPadding(view2.getPaddingLeft(), paddingTop + i4, view2.getPaddingRight(), view2.getPaddingBottom());
                        return windowInsetsCompat;
                    }
                });
                this.C0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.h0.X.clear();
        super.onStop();
    }
}

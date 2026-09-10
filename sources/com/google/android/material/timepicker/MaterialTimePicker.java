package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {
    public TimePickerView f0;
    public ViewStub g0;
    public TimePickerClockPresenter h0;
    public TimePickerTextInputPresenter i0;
    public Object j0;
    public int k0;
    public int l0;
    public CharSequence n0;
    public CharSequence p0;
    public CharSequence r0;
    public MaterialButton s0;
    public Button t0;
    public TimeModel v0;
    public final LinkedHashSet X = new LinkedHashSet();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final LinkedHashSet f19541Y = new LinkedHashSet();
    public final LinkedHashSet Z = new LinkedHashSet();
    public final LinkedHashSet e0 = new LinkedHashSet();
    public int m0 = 0;
    public int o0 = 0;
    public int q0 = 0;
    public int u0 = 0;
    public int w0 = 0;

    public static final class Builder {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.material.timepicker.TimePickerPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.timepicker.TimePickerPresenter, java.lang.Object] */
    public final void c(MaterialButton materialButton) {
        TimePickerPresenter timePickerPresenter;
        Pair pair;
        TimePickerClockPresenter timePickerClockPresenter;
        if (materialButton == null || this.f0 == null || this.g0 == null) {
            return;
        }
        ?? r0 = this.j0;
        if (r0 != 0) {
            r0.c();
        }
        int i2 = this.u0;
        TimePickerView timePickerView = this.f0;
        ViewStub viewStub = this.g0;
        if (i2 == 0) {
            TimePickerClockPresenter timePickerClockPresenter2 = this.h0;
            if (timePickerClockPresenter2 == null) {
                timePickerClockPresenter = timePickerClockPresenter2;
                timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.v0);
            }
            timePickerClockPresenter = timePickerClockPresenter2;
            this.h0 = timePickerClockPresenter;
            timePickerPresenter = timePickerClockPresenter;
        } else {
            if (this.i0 == null) {
                this.i0 = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.v0);
            }
            TimePickerTextInputPresenter timePickerTextInputPresenter = this.i0;
            timePickerTextInputPresenter.f0.setChecked(false);
            timePickerTextInputPresenter.g0.setChecked(false);
            timePickerPresenter = this.i0;
        }
        this.j0 = timePickerPresenter;
        timePickerPresenter.show();
        this.j0.a();
        int i3 = this.u0;
        if (i3 == 0) {
            pair = new Pair(Integer.valueOf(this.k0), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException(android.support.v4.media.a.h(i3, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.l0), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
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
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.v0 = timeModel;
        if (timeModel == null) {
            this.v0 = new TimeModel(0, 0, 10, 0);
        }
        this.u0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.v0.Z != 1 ? 0 : 1);
        this.m0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.n0 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.o0 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.p0 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.q0 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.r0 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.w0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i2 = this.w0;
        if (i2 == 0) {
            TypedValue typedValueA = MaterialAttributes.a(requireContext(), R.attr.materialTimePickerTheme);
            i2 = typedValueA == null ? 0 : typedValueA.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i2);
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.material.R.styleable.x, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.l0 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.k0 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.j(context);
        materialShapeDrawable.l(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.k(ViewCompat.k(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f0 = timePickerView;
        timePickerView.m0 = this;
        this.g0 = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.s0 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i2 = this.m0;
        if (i2 != 0) {
            textView.setText(i2);
        } else if (!TextUtils.isEmpty(this.n0)) {
            textView.setText(this.n0);
        }
        c(this.s0);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                Iterator it = materialTimePicker.X.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.dismiss();
            }
        });
        int i3 = this.o0;
        if (i3 != 0) {
            button.setText(i3);
        } else if (!TextUtils.isEmpty(this.p0)) {
            button.setText(this.p0);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.t0 = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                Iterator it = materialTimePicker.f19541Y.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.dismiss();
            }
        });
        int i4 = this.q0;
        if (i4 != 0) {
            this.t0.setText(i4);
        } else if (!TextUtils.isEmpty(this.r0)) {
            this.t0.setText(this.r0);
        }
        Button button3 = this.t0;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.s0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.timepicker.MaterialTimePicker.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                materialTimePicker.u0 = materialTimePicker.u0 == 0 ? 1 : 0;
                materialTimePicker.c(materialTimePicker.s0);
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.j0 = null;
        this.h0 = null;
        this.i0 = null;
        TimePickerView timePickerView = this.f0;
        if (timePickerView != null) {
            timePickerView.m0 = null;
            this.f0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.v0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.u0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.m0);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.n0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.o0);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.p0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.q0);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.r0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.w0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.j0 instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new b(this, 0), 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void setCancelable(boolean z2) {
        super.setCancelable(z2);
        Button button = this.t0;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}

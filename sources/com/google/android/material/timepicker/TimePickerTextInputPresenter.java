package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    public final LinearLayout X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TimeModel f19548Y;
    public final TextWatcher Z;
    public final TextWatcher e0;
    public final ChipTextInputComboView f0;
    public final ChipTextInputComboView g0;
    public final EditText h0;
    public final EditText i0;
    public final MaterialButtonToggleGroup j0;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        TextWatcherAdapter textWatcherAdapter = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(editable);
                    TimePickerTextInputPresenter timePickerTextInputPresenter = TimePickerTextInputPresenter.this;
                    if (zIsEmpty) {
                        timePickerTextInputPresenter.f19548Y.f0 = 0;
                        return;
                    }
                    timePickerTextInputPresenter.f19548Y.f0 = Integer.parseInt(editable.toString()) % 60;
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.Z = textWatcherAdapter;
        TextWatcherAdapter textWatcherAdapter2 = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(editable);
                    TimePickerTextInputPresenter timePickerTextInputPresenter = TimePickerTextInputPresenter.this;
                    if (zIsEmpty) {
                        timePickerTextInputPresenter.f19548Y.c(0);
                    } else {
                        timePickerTextInputPresenter.f19548Y.c(Integer.parseInt(editable.toString()));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.e0 = textWatcherAdapter2;
        this.X = linearLayout;
        this.f19548Y = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f0 = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.g0 = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.Z == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.j0 = materialButtonToggleGroup;
            materialButtonToggleGroup.g0.add(new c(this, 0));
            this.j0.setVisibility(0);
            f();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimePickerTextInputPresenter.this.b(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        MaxInputValidator maxInputValidator = timeModel.f19543Y;
        EditText editText = chipTextInputComboView2.g0;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = maxInputValidator;
        editText.setFilters(inputFilterArr);
        MaxInputValidator maxInputValidator2 = timeModel.X;
        EditText editText2 = chipTextInputComboView.g0;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = maxInputValidator2;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.f0;
        EditText editText3 = textInputLayout.getEditText();
        this.h0 = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f0;
        EditText editText4 = textInputLayout2.getEditText();
        this.i0 = editText4;
        TimePickerTextInputKeyController timePickerTextInputKeyController = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        ViewCompat.z(chipTextInputComboView2.e0, new ClickActionDelegate(linearLayout.getContext()) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                Resources resources2 = view.getResources();
                TimeModel timeModel2 = timeModel;
                accessibilityNodeInfoCompat.m(resources2.getString(timeModel2.Z == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel2.b())));
            }
        });
        ViewCompat.z(chipTextInputComboView.e0, new ClickActionDelegate(linearLayout.getContext()) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.m(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(timeModel.f0)));
            }
        });
        editText3.addTextChangedListener(textWatcherAdapter2);
        editText4.addTextChangedListener(textWatcherAdapter);
        e(timeModel);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(timePickerTextInputKeyController);
        editText5.setOnKeyListener(timePickerTextInputKeyController);
        editText6.setOnKeyListener(timePickerTextInputKeyController);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void a() {
        e(this.f19548Y);
    }

    public final void b(int i2) {
        this.f19548Y.g0 = i2;
        this.f0.setChecked(i2 == 12);
        this.g0.setChecked(i2 == 10);
        f();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void c() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.X;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(focusedChild.getContext(), InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    public final void d() {
        TimeModel timeModel = this.f19548Y;
        this.f0.setChecked(timeModel.g0 == 12);
        this.g0.setChecked(timeModel.g0 == 10);
    }

    public final void e(TimeModel timeModel) {
        TextWatcher textWatcher = this.e0;
        EditText editText = this.h0;
        editText.removeTextChangedListener(textWatcher);
        TextWatcher textWatcher2 = this.Z;
        EditText editText2 = this.i0;
        editText2.removeTextChangedListener(textWatcher2);
        Locale locale = this.X.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f0));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.b()));
        ChipTextInputComboView chipTextInputComboView = this.f0;
        String strA = TimeModel.a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.e0.setText(strA);
        if (!TextUtils.isEmpty(strA)) {
            TextWatcher textWatcher3 = chipTextInputComboView.h0;
            EditText editText3 = chipTextInputComboView.g0;
            editText3.removeTextChangedListener(textWatcher3);
            editText3.setText(strA);
            editText3.addTextChangedListener(textWatcher3);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.g0;
        String strA2 = TimeModel.a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.e0.setText(strA2);
        if (!TextUtils.isEmpty(strA2)) {
            TextWatcher textWatcher4 = chipTextInputComboView2.h0;
            EditText editText4 = chipTextInputComboView2.g0;
            editText4.removeTextChangedListener(textWatcher4);
            editText4.setText(strA2);
            editText4.addTextChangedListener(textWatcher4);
        }
        editText.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher2);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.j0;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.f19548Y.h0 == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void show() {
        this.X.setVisibility(0);
        b(this.f19548Y.g0);
    }
}

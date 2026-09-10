package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public static final /* synthetic */ int i0 = 0;
    public final Chip e0;
    public final TextInputLayout f0;
    public final EditText g0;
    public final TextWatcher h0;

    public class TextFormatter extends TextWatcherAdapter {
        public TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            Chip chip = chipTextInputComboView.e0;
            if (zIsEmpty) {
                chip.setText(TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d"));
                return;
            }
            int i2 = ChipTextInputComboView.i0;
            String strA = TimeModel.a(chipTextInputComboView.getResources(), editable, "%02d");
            if (TextUtils.isEmpty(strA)) {
                strA = TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d");
            }
            chip.setText(strA);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.e0 = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f0 = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.g0 = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.h0 = textFormatter;
        editText.addTextChangedListener(textFormatter);
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.e0.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g0.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z2) {
        Chip chip = this.e0;
        chip.setChecked(z2);
        int i2 = z2 ? 0 : 4;
        EditText editText = this.g0;
        editText.setVisibility(i2);
        chip.setVisibility(z2 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new c0.a(editText, 20));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e0.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i2, Object obj) {
        this.e0.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.e0.toggle();
    }
}

package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.cuirassed;
import com.google.android.material.internal.gintrap;
import java.util.Locale;
import outmarry.rotuma;

/* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public class cutely implements TimePickerView.beachfront, competently {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final impromptu f21370adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final TimeModel f21371arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final EditText f21372dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final EditText f21373gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final ChipTextInputComboView f21374graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final LinearLayout f21375kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final ChipTextInputComboView f21376molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final TextWatcher f21377monoploid = new attabal();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final TextWatcher f21378polloi = new saneness();

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public MaterialButtonToggleGroup f21379rotuma;

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class attabal extends gintrap {
        public attabal() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    cutely.this.f21371arytenoidectomy.cutely(0);
                } else {
                    cutely.this.f21371arytenoidectomy.cutely(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class beachfront extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Resources f21381attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int f21383saneness;

        public beachfront(Resources resources, int i) {
            this.f21381attabal = resources;
            this.f21383saneness = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(this.f21381attabal.getString(this.f21383saneness));
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class dern implements View.OnClickListener {
        public dern() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            cutely.this.dern(((Integer) view.getTag(bubbles.competently.selection_type)).intValue());
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class marial extends com.google.android.material.timepicker.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ TimeModel f21385beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ Resources f21387marial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public marial(Context context, int i, Resources resources, TimeModel timeModel) {
            super(context, i);
            this.f21387marial = resources;
            this.f21385beachfront = timeModel;
        }

        @Override // com.google.android.material.timepicker.attabal, androidx.core.view.attabal
        public void competently(View view, rotuma rotumaVar) {
            super.competently(view, rotumaVar);
            rotumaVar.picketboat(this.f21387marial.getString(bubbles.apical.material_timepicker_minute) + " " + view.getResources().getString(bubbles.apical.material_minute_suffix, String.valueOf(this.f21385beachfront.f21342molybdenite)));
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class saneness extends gintrap {
        public saneness() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    cutely.this.f21371arytenoidectomy.taiyuan(0);
                } else {
                    cutely.this.f21371arytenoidectomy.taiyuan(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    public class wireman extends com.google.android.material.timepicker.attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ TimeModel f21389beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ Resources f21391marial;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wireman(Context context, int i, Resources resources, TimeModel timeModel) {
            super(context, i);
            this.f21391marial = resources;
            this.f21389beachfront = timeModel;
        }

        @Override // com.google.android.material.timepicker.attabal, androidx.core.view.attabal
        public void competently(View view, rotuma rotumaVar) {
            super.competently(view, rotumaVar);
            rotumaVar.picketboat(this.f21391marial.getString(bubbles.apical.material_timepicker_hour) + " " + view.getResources().getString(this.f21389beachfront.dern(), String.valueOf(this.f21389beachfront.wireman())));
        }
    }

    public cutely(LinearLayout linearLayout, TimeModel timeModel) {
        this.f21375kowloon = linearLayout;
        this.f21371arytenoidectomy = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(bubbles.competently.material_minute_text_input);
        this.f21376molybdenite = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(bubbles.competently.material_hour_text_input);
        this.f21374graveside = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(bubbles.competently.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(bubbles.competently.material_label);
        textView.setText(resources.getString(bubbles.apical.material_timepicker_minute));
        textView.setImportantForAccessibility(2);
        textView2.setText(resources.getString(bubbles.apical.material_timepicker_hour));
        textView2.setImportantForAccessibility(2);
        chipTextInputComboView.setTag(bubbles.competently.selection_type, 12);
        chipTextInputComboView2.setTag(bubbles.competently.selection_type, 10);
        if (timeModel.f21343monoploid == 0) {
            formularize();
        }
        dern dernVar = new dern();
        chipTextInputComboView2.setOnClickListener(dernVar);
        chipTextInputComboView.setOnClickListener(dernVar);
        chipTextInputComboView2.dern(timeModel.beachfront());
        chipTextInputComboView.dern(timeModel.competently());
        EditText editText = chipTextInputComboView2.marial().getEditText();
        this.f21372dovishness = editText;
        editText.setAccessibilityDelegate(apical(linearLayout.getResources(), bubbles.apical.material_timepicker_hour));
        EditText editText2 = chipTextInputComboView.marial().getEditText();
        this.f21373gintrap = editText2;
        editText2.setAccessibilityDelegate(apical(linearLayout.getResources(), bubbles.apical.material_timepicker_minute));
        this.f21370adultoid = new impromptu(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.beachfront(new wireman(linearLayout.getContext(), bubbles.apical.material_hour_selection, resources, timeModel));
        chipTextInputComboView.beachfront(new marial(linearLayout.getContext(), bubbles.apical.material_minute_selection, resources, timeModel));
        competently();
    }

    public static /* synthetic */ void attabal(cutely cutelyVar, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        cutelyVar.getClass();
        if (z) {
            cutelyVar.f21371arytenoidectomy.apical(i == bubbles.competently.material_clock_period_pm_button ? 1 : 0);
        }
    }

    public final View.AccessibilityDelegate apical(Resources resources, int i) {
        return new beachfront(resources, i);
    }

    public void beachfront() {
        this.f21376molybdenite.setChecked(false);
        this.f21374graveside.setChecked(false);
    }

    public void competently() {
        wireman();
        cutely(this.f21371arytenoidectomy);
        this.f21370adultoid.attabal();
    }

    public final void cutely(TimeModel timeModel) {
        impromptu();
        Locale locale = this.f21375kowloon.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f21342molybdenite));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.wireman()));
        this.f21376molybdenite.competently(str);
        this.f21374graveside.competently(str2);
        wireman();
        impassible();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.beachfront
    public void dern(int i) {
        this.f21371arytenoidectomy.f21340graveside = i;
        this.f21376molybdenite.setChecked(i == 12);
        this.f21374graveside.setChecked(i == 10);
        impassible();
    }

    public final void formularize() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f21375kowloon.findViewById(bubbles.competently.material_clock_period_toggle);
        this.f21379rotuma = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.saneness() { // from class: com.google.android.material.timepicker.taiyuan
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.saneness
            public final void attabal(MaterialButtonToggleGroup materialButtonToggleGroup2, int i, boolean z) {
                cutely.attabal(this.f21399attabal, materialButtonToggleGroup2, i, z);
            }
        });
        this.f21379rotuma.setVisibility(0);
        impassible();
    }

    public final void impassible() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f21379rotuma;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(this.f21371arytenoidectomy.f21338adultoid == 0 ? bubbles.competently.material_clock_period_am_button : bubbles.competently.material_clock_period_pm_button);
    }

    public final void impromptu() {
        this.f21372dovishness.removeTextChangedListener(this.f21378polloi);
        this.f21373gintrap.removeTextChangedListener(this.f21377monoploid);
    }

    @Override // com.google.android.material.timepicker.competently
    public void invalidate() {
        cutely(this.f21371arytenoidectomy);
    }

    @Override // com.google.android.material.timepicker.competently
    public void marial() {
        View focusedChild = this.f21375kowloon.getFocusedChild();
        if (focusedChild != null) {
            cuirassed.formularize(focusedChild, false);
        }
        this.f21375kowloon.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.competently
    public void show() {
        this.f21375kowloon.setVisibility(0);
        dern(this.f21371arytenoidectomy.f21340graveside);
    }

    public void taiyuan() {
        this.f21376molybdenite.setChecked(this.f21371arytenoidectomy.f21340graveside == 12);
        this.f21374graveside.setChecked(this.f21371arytenoidectomy.f21340graveside == 10);
    }

    public final void wireman() {
        this.f21372dovishness.addTextChangedListener(this.f21378polloi);
        this.f21373gintrap.addTextChangedListener(this.f21377monoploid);
    }
}

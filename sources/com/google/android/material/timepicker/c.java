package com.google.android.material.timepicker;

import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19553b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f19552a = i2;
        this.f19553b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void a(int i2, boolean z2) {
        Object obj = this.f19553b;
        switch (this.f19552a) {
            case 0:
                TimePickerTextInputPresenter timePickerTextInputPresenter = (TimePickerTextInputPresenter) obj;
                timePickerTextInputPresenter.getClass();
                if (z2) {
                    timePickerTextInputPresenter.f19548Y.e(i2 == R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z2) {
                    int i3 = TimePickerView.n0;
                } else {
                    TimePickerClockPresenter timePickerClockPresenter = timePickerView.k0;
                    if (timePickerClockPresenter != null) {
                        timePickerClockPresenter.f19544Y.e(i2 == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
                break;
        }
    }
}

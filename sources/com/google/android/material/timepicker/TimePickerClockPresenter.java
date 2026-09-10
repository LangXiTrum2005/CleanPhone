package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.chip.Chip;
import com.kochava.tracker.BuildConfig;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    public static final String[] g0 = {"12", "1", "2", "3", "4", "5", "6", "7", "8", com.smartdigimkt.f3.b.j, "10", "11"};
    public static final String[] h0 = {"00", "1", "2", "3", "4", "5", "6", "7", "8", com.smartdigimkt.f3.b.j, "10", "11", "12", "13", "14", "15", "16", "17", BuildConfig.SDK_PROTOCOL, "19", "20", "21", "22", "23"};
    public static final String[] i0 = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final TimePickerView X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TimeModel f19544Y;
    public float Z;
    public float e0;
    public boolean f0 = false;

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.X = timePickerView;
        this.f19544Y = timeModel;
        if (timeModel.Z == 0) {
            timePickerView.i0.setVisibility(0);
        }
        timePickerView.g0.n0.add(this);
        timePickerView.l0 = this;
        timePickerView.k0 = this;
        timePickerView.g0.v0 = this;
        String[] strArr = g0;
        for (int i2 = 0; i2 < 12; i2++) {
            strArr[i2] = TimeModel.a(this.X.getResources(), strArr[i2], "%d");
        }
        String[] strArr2 = i0;
        for (int i3 = 0; i3 < 12; i3++) {
            strArr2[i3] = TimeModel.a(this.X.getResources(), strArr2[i3], "%02d");
        }
        a();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void a() {
        TimeModel timeModel = this.f19544Y;
        this.e0 = (timeModel.b() * 30) % 360;
        this.Z = timeModel.f0 * 6;
        d(timeModel.g0, false);
        e();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void b(float f, boolean z2) {
        if (this.f0) {
            return;
        }
        TimeModel timeModel = this.f19544Y;
        int i2 = timeModel.e0;
        int i3 = timeModel.f0;
        int iRound = Math.round(f);
        int i4 = timeModel.g0;
        TimePickerView timePickerView = this.X;
        if (i4 == 12) {
            int i5 = ((iRound + 3) / 6) % 60;
            timeModel.f0 = i5;
            this.Z = (float) Math.floor(i5 * 6);
        } else {
            int i6 = (iRound + 15) / 30;
            if (timeModel.Z == 1) {
                i6 %= 12;
                if (timePickerView.h0.h0.y0 == 2) {
                    i6 += 12;
                }
            }
            timeModel.c(i6);
            this.e0 = (timeModel.b() * 30) % 360;
        }
        if (z2) {
            return;
        }
        e();
        if (timeModel.f0 == i3 && timeModel.e0 == i2) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void c() {
        this.X.setVisibility(8);
    }

    public final void d(int i2, boolean z2) {
        String[] strArr;
        int i3;
        boolean z3 = i2 == 12;
        TimePickerView timePickerView = this.X;
        timePickerView.g0.h0 = z3;
        TimeModel timeModel = this.f19544Y;
        timeModel.g0 = i2;
        int i4 = timeModel.Z;
        if (z3) {
            strArr = i0;
        } else {
            strArr = i4 == 1 ? h0 : g0;
        }
        if (z3) {
            i3 = R.string.material_minute_suffix;
        } else {
            i3 = i4 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        }
        ClockFaceView clockFaceView = timePickerView.h0;
        clockFaceView.q(i3, strArr);
        int i5 = (timeModel.g0 == 10 && i4 == 1 && timeModel.e0 >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.h0;
        clockHandView.y0 = i5;
        clockHandView.invalidate();
        timePickerView.g0.c(z3 ? this.Z : this.e0, z2);
        boolean z4 = i2 == 12;
        Chip chip = timePickerView.e0;
        chip.setChecked(z4);
        int i6 = z4 ? 2 : 0;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        chip.setAccessibilityLiveRegion(i6);
        boolean z5 = i2 == 10;
        Chip chip2 = timePickerView.f0;
        chip2.setChecked(z5);
        chip2.setAccessibilityLiveRegion(z5 ? 2 : 0);
        ViewCompat.z(chip2, new ClickActionDelegate(timePickerView.getContext()) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                Resources resources = view.getResources();
                TimeModel timeModel2 = TimePickerClockPresenter.this.f19544Y;
                accessibilityNodeInfoCompat.m(resources.getString(timeModel2.Z == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel2.b())));
            }
        });
        ViewCompat.z(chip, new ClickActionDelegate(timePickerView.getContext()) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.d(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.m(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.f19544Y.f0)));
            }
        });
    }

    public final void e() {
        TimeModel timeModel = this.f19544Y;
        int i2 = timeModel.h0;
        int iB = timeModel.b();
        int i3 = timeModel.f0;
        TimePickerView timePickerView = this.X;
        timePickerView.getClass();
        timePickerView.i0.b(i2 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i3));
        String str2 = String.format(locale, "%02d", Integer.valueOf(iB));
        Chip chip = timePickerView.e0;
        if (!TextUtils.equals(chip.getText(), str)) {
            chip.setText(str);
        }
        Chip chip2 = timePickerView.f0;
        if (TextUtils.equals(chip2.getText(), str2)) {
            return;
        }
        chip2.setText(str2);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void show() {
        this.X.setVisibility(0);
    }
}

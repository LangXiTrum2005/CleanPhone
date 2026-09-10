package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    public static final int e0;
    public final Calendar X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f19245Y;
    public final int Z;

    static {
        e0 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DaysOfWeekAdapter() {
        Calendar calendarG = UtcDates.g(null);
        this.X = calendarG;
        this.f19245Y = calendarG.getMaximum(7);
        this.Z = calendarG.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f19245Y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        int i3 = this.f19245Y;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.Z;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i3 = i2 + this.Z;
        int i4 = this.f19245Y;
        if (i3 > i4) {
            i3 -= i4;
        }
        Calendar calendar = this.X;
        calendar.set(7, i3);
        textView.setText(calendar.getDisplayName(7, e0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public DaysOfWeekAdapter(int i2) {
        Calendar calendarG = UtcDates.g(null);
        this.X = calendarG;
        this.f19245Y = calendarG.getMaximum(7);
        this.Z = i2;
    }
}

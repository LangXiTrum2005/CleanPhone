package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class MonthAdapter extends BaseAdapter {
    public static final int h0 = UtcDates.g(null).getMaximum(4);
    public static final int i0 = (UtcDates.g(null).getMaximum(7) + UtcDates.g(null).getMaximum(5)) - 1;
    public final Month X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DateSelector f19265Y;
    public Collection Z;
    public CalendarStyle e0;
    public final CalendarConstraints f0;
    public final DayViewDecorator g0;

    public MonthAdapter(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.X = month;
        this.f19265Y = dateSelector;
        this.f0 = calendarConstraints;
        this.g0 = dayViewDecorator;
        this.Z = dateSelector.D0();
    }

    public final int a() {
        int firstDayOfWeek = this.f0.f0;
        Month month = this.X;
        Calendar calendar = month.X;
        int i2 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - firstDayOfWeek;
        return i3 < 0 ? i3 + month.e0 : i3;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < a() || i2 > c()) {
            return null;
        }
        int iA = (i2 - a()) + 1;
        Calendar calendarC = UtcDates.c(this.X.X);
        calendarC.set(5, iA);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.X.f0) - 1;
    }

    public final void d(TextView textView, long j, int i2) {
        boolean z2;
        boolean z3;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = false;
        boolean z5 = UtcDates.f().getTimeInMillis() == j;
        DateSelector dateSelector = this.f19265Y;
        Iterator it = dateSelector.e0().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Object obj = ((Pair) it.next()).f4407a;
            if (obj != null && ((Long) obj).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Iterator it2 = dateSelector.e0().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
            Object obj2 = ((Pair) it2.next()).f4408b;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z3 = true;
                break;
            }
        }
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j);
        String str = calendarF.get(1) == calendarG.get(1) ? UtcDates.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : UtcDates.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z5) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z3) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f0.Z.i(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.D0().iterator();
            while (it3.hasNext()) {
                if (UtcDates.a(j) == UtcDates.a(((Long) it3.next()).longValue())) {
                    z4 = true;
                    break;
                }
            }
            textView.setSelected(z4);
            if (z4) {
                calendarItemStyle = this.e0.f19239b;
            } else {
                calendarItemStyle = UtcDates.f().getTimeInMillis() == j ? this.e0.f19240c : this.e0.f19238a;
            }
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.e0.g;
        }
        if (this.g0 == null || i2 == -1) {
            calendarItemStyle.b(textView);
            return;
        }
        int i3 = this.X.Z;
        calendarItemStyle.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthB = Month.b(j);
        Month month = this.X;
        if (monthB.equals(month)) {
            Calendar calendarC = UtcDates.c(month.X);
            calendarC.setTimeInMillis(j);
            int i2 = calendarC.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i2 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i2);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return i0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.X.e0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        Context context = viewGroup.getContext();
        if (this.e0 == null) {
            this.e0 = new CalendarStyle(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i2 - a();
        if (iA >= 0) {
            Month month = this.X;
            if (iA >= month.f0) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i3 = -1;
            } else {
                i3 = iA + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i3)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i3 = -1;
        }
        Long item = getItem(i2);
        if (item == null) {
            return textView;
        }
        d(textView, item.longValue(), i3);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

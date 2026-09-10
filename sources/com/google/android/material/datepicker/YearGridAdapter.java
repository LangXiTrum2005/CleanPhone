package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MaterialCalendar f19272i;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f19274c;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f19274c = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.f19272i = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f19272i.e0.g0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        MaterialCalendar materialCalendar = this.f19272i;
        final int i3 = materialCalendar.e0.X.Z + i2;
        viewHolder2.f19274c.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        TextView textView = viewHolder2.f19274c;
        Context context = textView.getContext();
        textView.setContentDescription(UtcDates.f().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i3)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i3)));
        CalendarStyle calendarStyle = materialCalendar.i0;
        Calendar calendarF = UtcDates.f();
        CalendarItemStyle calendarItemStyle = calendarF.get(1) == i3 ? calendarStyle.f : calendarStyle.d;
        Iterator it = materialCalendar.Z.D0().iterator();
        while (it.hasNext()) {
            calendarF.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarF.get(1) == i3) {
                calendarItemStyle = calendarStyle.f19241e;
            }
        }
        calendarItemStyle.b(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YearGridAdapter yearGridAdapter = YearGridAdapter.this;
                Month monthA = Month.a(i3, yearGridAdapter.f19272i.g0.f19264Y);
                MaterialCalendar materialCalendar2 = yearGridAdapter.f19272i;
                CalendarConstraints calendarConstraints = materialCalendar2.e0;
                Month month = calendarConstraints.X;
                Calendar calendar = month.X;
                Calendar calendar2 = monthA.X;
                if (calendar2.compareTo(calendar) < 0) {
                    monthA = month;
                } else {
                    Month month2 = calendarConstraints.f19230Y;
                    if (calendar2.compareTo(month2.X) > 0) {
                        monthA = month2;
                    }
                }
                materialCalendar2.c(monthA);
                materialCalendar2.d(MaterialCalendar.CalendarSelector.X);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}

package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.charging.screenshow.battery.animations.themes.R;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CalendarConstraints f19266i;
    public final DateSelector j;
    public final DayViewDecorator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MaterialCalendar.AnonymousClass3 f19267l;
    public final int m;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f19269c;
        public final MaterialCalendarGridView d;

        public ViewHolder(LinearLayout linearLayout, boolean z2) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f19269c = textView;
            ViewCompat.A(textView, true);
            this.d = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z2) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.AnonymousClass3 anonymousClass3) {
        Month month = calendarConstraints.X;
        Month month2 = calendarConstraints.e0;
        if (month.X.compareTo(month2.X) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.X.compareTo(calendarConstraints.f19230Y.X) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.m = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * MonthAdapter.h0) + (MaterialDatePicker.e(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f19266i = calendarConstraints;
        this.j = dateSelector;
        this.k = dayViewDecorator;
        this.f19267l = anonymousClass3;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f19266i.h0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i2) {
        Calendar calendarC = UtcDates.c(this.f19266i.X.X);
        calendarC.add(2, i2);
        return new Month(calendarC).X.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        CalendarConstraints calendarConstraints = this.f19266i;
        Calendar calendarC = UtcDates.c(calendarConstraints.X.X);
        calendarC.add(2, i2);
        Month month = new Month(calendarC);
        viewHolder2.f19269c.setText(month.f());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder2.d.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().X)) {
            MonthAdapter monthAdapter = new MonthAdapter(month, this.j, calendarConstraints, this.k);
            materialCalendarGridView.setNumColumns(month.e0);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter monthAdapterA = materialCalendarGridView.a();
            Iterator it = monthAdapterA.Z.iterator();
            while (it.hasNext()) {
                monthAdapterA.e(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            DateSelector dateSelector = monthAdapterA.f19265Y;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.D0().iterator();
                while (it2.hasNext()) {
                    monthAdapterA.e(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                monthAdapterA.Z = dateSelector.D0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                MonthAdapter monthAdapterA2 = materialCalendarGridView2.a();
                if (i3 < monthAdapterA2.a() || i3 > monthAdapterA2.c()) {
                    return;
                }
                MaterialCalendar.AnonymousClass3 anonymousClass3 = MonthsPagerAdapter.this.f19267l;
                long jLongValue = materialCalendarGridView2.a().getItem(i3).longValue();
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (materialCalendar.e0.Z.i(jLongValue)) {
                    materialCalendar.Z.O0(jLongValue);
                    Iterator it3 = materialCalendar.X.iterator();
                    while (it3.hasNext()) {
                        ((OnSelectionChangedListener) it3.next()).b(materialCalendar.Z.I0());
                    }
                    materialCalendar.k0.getAdapter().notifyDataSetChanged();
                    RecyclerView recyclerView = materialCalendar.j0;
                    if (recyclerView != null) {
                        recyclerView.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.e(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.m));
        return new ViewHolder(linearLayout, true);
    }
}

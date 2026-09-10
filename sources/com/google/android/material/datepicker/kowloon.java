package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.premeiotic;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: MonthsPagerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon extends RecyclerView.Adapter<saneness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CalendarConstraints f20160attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final DayViewDecorator f20161dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f20162marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final DateSelector<?> f20163saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final MaterialCalendar.formularize f20164wireman;

    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public class attabal implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f20166kowloon;

        public attabal(MaterialCalendarGridView materialCalendarGridView) {
            this.f20166kowloon = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f20166kowloon.getAdapter().polloi(i)) {
                kowloon.this.f20164wireman.attabal(this.f20166kowloon.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: MonthsPagerAdapter.java */
    public static class saneness extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final MaterialCalendarGridView f20167dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final TextView f20168saneness;

        public saneness(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(bubbles.competently.month_title);
            this.f20168saneness = textView;
            premeiotic.empress(textView, true);
            this.f20167dern = (MaterialCalendarGridView) linearLayout.findViewById(bubbles.competently.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public kowloon(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.formularize formularizeVar) {
        Month monthImpassible = calendarConstraints.impassible();
        Month monthTaiyuan = calendarConstraints.taiyuan();
        Month monthFormularize = calendarConstraints.formularize();
        if (monthImpassible.compareTo(monthFormularize) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthFormularize.compareTo(monthTaiyuan) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f20162marial = (triweekly.f20194adultoid * MaterialCalendar.graveside(context)) + (MaterialDatePicker.arytenoidectomy(context) ? MaterialCalendar.graveside(context) : 0);
        this.f20160attabal = calendarConstraints;
        this.f20163saneness = dateSelector;
        this.f20161dern = dayViewDecorator;
        this.f20164wireman = formularizeVar;
        setHasStableIds(true);
    }

    public int beachfront(Month month) {
        return this.f20160attabal.impassible().arytenoidectomy(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(saneness sanenessVar, int i) {
        Month monthKowloon = this.f20160attabal.impassible().kowloon(i);
        sanenessVar.f20168saneness.setText(monthKowloon.impassible());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sanenessVar.f20167dern.findViewById(bubbles.competently.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthKowloon.equals(materialCalendarGridView.getAdapter().f20198kowloon)) {
            triweekly triweeklyVar = new triweekly(monthKowloon, this.f20163saneness, this.f20160attabal, this.f20161dern);
            materialCalendarGridView.setNumColumns(monthKowloon.f20119polloi);
            materialCalendarGridView.setAdapter((ListAdapter) triweeklyVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().monoploid(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new attabal(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20160attabal.apical();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f20160attabal.impassible().kowloon(i).triweekly();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public saneness onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(bubbles.taiyuan.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.arytenoidectomy(viewGroup.getContext())) {
            return new saneness(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f20162marial));
        return new saneness(linearLayout, true);
    }

    public CharSequence marial(int i) {
        return wireman(i).impassible();
    }

    public Month wireman(int i) {
        return this.f20160attabal.impassible().kowloon(i);
    }
}

package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: YearGridAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class adultoid extends RecyclerView.Adapter<saneness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MaterialCalendar<?> f20142attabal;

    /* JADX INFO: compiled from: YearGridAdapter.java */
    public class attabal implements View.OnClickListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ int f20144kowloon;

        public attabal(int i) {
            this.f20144kowloon = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            adultoid.this.f20142attabal.cord(adultoid.this.f20142attabal.arytenoidectomy().competently(Month.dern(this.f20144kowloon, adultoid.this.f20142attabal.polloi().f20114arytenoidectomy)));
            adultoid.this.f20142attabal.cuirassed(MaterialCalendar.CalendarSelector.DAY);
            adultoid.this.f20142attabal.preprohormone();
        }
    }

    /* JADX INFO: compiled from: YearGridAdapter.java */
    public static class saneness extends RecyclerView.stratoscope {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final TextView f20145saneness;

        public saneness(TextView textView) {
            super(textView);
            this.f20145saneness = textView;
        }
    }

    public adultoid(MaterialCalendar<?> materialCalendar) {
        this.f20142attabal = materialCalendar;
    }

    public int beachfront(int i) {
        return this.f20142attabal.arytenoidectomy().impassible().f20118monoploid + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(saneness sanenessVar, int i) {
        int iBeachfront = beachfront(i);
        sanenessVar.f20145saneness.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iBeachfront)));
        TextView textView = sanenessVar.f20145saneness;
        textView.setContentDescription(impromptu.apical(textView.getContext(), iBeachfront));
        com.google.android.material.datepicker.saneness sanenessVarMonoploid = this.f20142attabal.monoploid();
        Calendar calendarApical = graveside.apical();
        com.google.android.material.datepicker.attabal attabalVar = calendarApical.get(1) == iBeachfront ? sanenessVarMonoploid.f20183beachfront : sanenessVarMonoploid.f20189wireman;
        Iterator<Long> it = this.f20142attabal.molybdenite().czestochowa().iterator();
        while (it.hasNext()) {
            calendarApical.setTimeInMillis(it.next().longValue());
            if (calendarApical.get(1) == iBeachfront) {
                attabalVar = sanenessVarMonoploid.f20187marial;
            }
        }
        attabalVar.wireman(sanenessVar.f20145saneness);
        sanenessVar.f20145saneness.setSelected(attabalVar == sanenessVarMonoploid.f20187marial);
        sanenessVar.f20145saneness.setOnClickListener(wireman(iBeachfront));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20142attabal.arytenoidectomy().triweekly();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public saneness onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new saneness((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(bubbles.taiyuan.mtrl_calendar_year, viewGroup, false));
    }

    public int marial(int i) {
        return i - this.f20142attabal.arytenoidectomy().impassible().f20118monoploid;
    }

    public final View.OnClickListener wireman(int i) {
        return new attabal(i);
    }
}

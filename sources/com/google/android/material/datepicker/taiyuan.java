package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: DaysOfWeekAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan extends BaseAdapter {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int f20190polloi;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f20191arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Calendar f20192kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f20193monoploid;

    static {
        f20190polloi = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public taiyuan() {
        Calendar calendarImpassible = graveside.impassible();
        this.f20192kowloon = calendarImpassible;
        this.f20191arytenoidectomy = calendarImpassible.getMaximum(7);
        this.f20193monoploid = calendarImpassible.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f20191arytenoidectomy) {
            return null;
        }
        return Integer.valueOf(saneness(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f20191arytenoidectomy;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(bubbles.taiyuan.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f20192kowloon.set(7, saneness(i));
        textView.setText(this.f20192kowloon.getDisplayName(7, f20190polloi, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(bubbles.apical.mtrl_picker_day_of_week_column_header), this.f20192kowloon.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public final int saneness(int i) {
        int i2 = i + this.f20193monoploid;
        int i3 = this.f20191arytenoidectomy;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public taiyuan(int i) {
        Calendar calendarImpassible = graveside.impassible();
        this.f20192kowloon = calendarImpassible;
        this.f20191arytenoidectomy = calendarImpassible.getMaximum(7);
        this.f20193monoploid = i;
    }
}

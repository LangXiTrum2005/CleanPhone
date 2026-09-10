package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: MonthAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly extends BaseAdapter {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final int f20194adultoid = graveside.impassible().getMaximum(4);

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final int f20195dovishness = (graveside.impassible().getMaximum(5) + graveside.impassible().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final DateSelector<?> f20196arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final DayViewDecorator f20197graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Month f20198kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final CalendarConstraints f20199molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Collection<Long> f20200monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public saneness f20201polloi;

    public triweekly(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f20198kowloon = month;
        this.f20196arytenoidectomy = dateSelector;
        this.f20199molybdenite = calendarConstraints;
        this.f20197graveside = dayViewDecorator;
        this.f20200monoploid = dateSelector.czestochowa();
    }

    public boolean apical(long j) {
        Iterator<technofreak.beachfront<Long, Long>> it = this.f20196arytenoidectomy.saran().iterator();
        while (it.hasNext()) {
            Long l = it.next().f38671attabal;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public final void arytenoidectomy(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.wireman(j).equals(this.f20198kowloon)) {
            int iFormularize = this.f20198kowloon.formularize(j);
            kowloon((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().attabal(iFormularize) - materialCalendarGridView.getFirstVisiblePosition()), j, iFormularize);
        }
    }

    public int attabal(int i) {
        return saneness() + (i - 1);
    }

    public final void beachfront(Context context) {
        if (this.f20201polloi == null) {
            this.f20201polloi = new saneness(context);
        }
    }

    public boolean competently(long j) {
        Iterator<technofreak.beachfront<Long, Long>> it = this.f20196arytenoidectomy.saran().iterator();
        while (it.hasNext()) {
            Long l = it.next().f38672saneness;
            if (l != null && l.longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean cutely(long j) {
        Iterator<Long> it = this.f20196arytenoidectomy.czestochowa().iterator();
        while (it.hasNext()) {
            if (graveside.attabal(j) == graveside.attabal(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    public final String dern(Context context, long j) {
        return impromptu.marial(context, j, formularize(j), apical(j), competently(j));
    }

    public final boolean formularize(long j) {
        return graveside.apical().getTimeInMillis() == j;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f20195dovishness;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f20198kowloon.f20119polloi;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int impassible() {
        return (saneness() + this.f20198kowloon.f20117molybdenite) - 1;
    }

    public boolean impromptu(int i) {
        return i % this.f20198kowloon.f20119polloi == 0;
    }

    public final void kowloon(TextView textView, long j, int i) {
        boolean zCutely;
        attabal attabalVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strDern = dern(context, j);
        textView.setContentDescription(strDern);
        boolean zCuirassed = this.f20199molybdenite.impromptu().cuirassed(j);
        if (zCuirassed) {
            textView.setEnabled(true);
            zCutely = cutely(j);
            textView.setSelected(zCutely);
            if (zCutely) {
                attabalVar = this.f20201polloi.f20188saneness;
            } else {
                attabalVar = formularize(j) ? this.f20201polloi.f20185dern : this.f20201polloi.f20182attabal;
            }
        } else {
            zCutely = false;
            textView.setEnabled(false);
            attabalVar = this.f20201polloi.f20184competently;
        }
        boolean z = zCutely;
        DayViewDecorator dayViewDecorator = this.f20197graveside;
        if (dayViewDecorator == null || i == -1) {
            attabalVar.wireman(textView);
            return;
        }
        Month month = this.f20198kowloon;
        int i2 = month.f20118monoploid;
        int i3 = month.f20114arytenoidectomy;
        attabalVar.marial(textView, dayViewDecorator.attabal(context, i2, i3, i, zCuirassed, z), this.f20197graveside.impromptu(context, i2, i3, i, zCuirassed, z));
        textView.setCompoundDrawables(this.f20197graveside.dern(context, i2, i3, i, zCuirassed, z), this.f20197graveside.beachfront(context, i2, i3, i, zCuirassed, z), this.f20197graveside.wireman(context, i2, i3, i, zCuirassed, z), this.f20197graveside.saneness(context, i2, i3, i, zCuirassed, z));
        textView.setContentDescription(this.f20197graveside.competently(context, i2, i3, i, zCuirassed, z, strDern));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        beachfront(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(bubbles.taiyuan.mtrl_calendar_day, viewGroup, false);
        }
        int iSaneness = i - saneness();
        if (iSaneness >= 0) {
            Month month = this.f20198kowloon;
            if (iSaneness >= month.f20117molybdenite) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iSaneness + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i2 = -1;
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        kowloon(textView, item.longValue(), i2);
        return textView;
    }

    public void monoploid(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f20200monoploid.iterator();
        while (it.hasNext()) {
            arytenoidectomy(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f20196arytenoidectomy;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.czestochowa().iterator();
            while (it2.hasNext()) {
                arytenoidectomy(materialCalendarGridView, it2.next().longValue());
            }
            this.f20200monoploid = this.f20196arytenoidectomy.czestochowa();
        }
    }

    public boolean polloi(int i) {
        return i >= saneness() && i <= impassible();
    }

    public int saneness() {
        return this.f20198kowloon.cutely(this.f20199molybdenite.cutely());
    }

    public boolean taiyuan(int i) {
        return (i + 1) % this.f20198kowloon.f20119polloi == 0;
    }

    public int triweekly(int i) {
        return (i - saneness()) + 1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < saneness() || i > impassible()) {
            return null;
        }
        return Long.valueOf(this.f20198kowloon.apical(triweekly(i)));
    }
}

package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar e0;
    public final boolean f0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$1, reason: invalid class name */
    class AnonymousClass1 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
            accessibilityNodeInfoCompat.k(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e0 = UtcDates.g(null);
        if (MaterialDatePicker.e(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.charging.screenshow.battery.animations.themes.R.id.cancel_button);
            setNextFocusRightId(com.charging.screenshow.battery.animations.themes.R.id.confirm_button);
        }
        this.f0 = MaterialDatePicker.e(getContext(), com.charging.screenshow.battery.animations.themes.R.attr.nestedScrollable);
        ViewCompat.z(this, new AnonymousClass1());
    }

    public final MonthAdapter a() {
        return (MonthAdapter) super.getAdapter();
    }

    public final View b(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((MonthAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int i2;
        int width3;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter monthAdapter = (MonthAdapter) super.getAdapter();
        DateSelector dateSelector = monthAdapter.f19265Y;
        CalendarStyle calendarStyle = monthAdapter.e0;
        int iMax = Math.max(monthAdapter.a(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(monthAdapter.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = monthAdapter.getItem(iMax);
        Long item2 = monthAdapter.getItem(iMin);
        Iterator it = dateSelector.e0().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.f4407a;
            if (obj != null) {
                Object obj2 = pair.f4408b;
                if (obj2 != null) {
                    Long l2 = (Long) obj;
                    long jLongValue = l2.longValue();
                    Long l3 = (Long) obj2;
                    long jLongValue2 = l3.longValue();
                    if (item == null || item2 == null || l2.longValue() > item2.longValue() || l3.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        monthAdapter = monthAdapter;
                        it = it;
                    } else {
                        boolean zE = ViewUtils.e(materialCalendarGridView);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.e0;
                        Month month = monthAdapter.X;
                        if (jLongValue < jLongValue3) {
                            if (iMax % month.e0 == 0) {
                                right = 0;
                            } else {
                                right = !zE ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                            }
                            width = right;
                            iA = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iA = monthAdapter.a() + (calendar.get(5) - 1);
                            View viewB = materialCalendarGridView.b(iA);
                            width = (viewB.getWidth() / 2) + viewB.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            if ((iMin + 1) % month.e0 == 0) {
                                width2 = materialCalendarGridView.getWidth();
                            } else {
                                width2 = !zE ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                            }
                            iA2 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iA2 = monthAdapter.a() + (calendar.get(5) - 1);
                            View viewB2 = materialCalendarGridView.b(iA2);
                            width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                        }
                        int itemId = (int) monthAdapter.getItemId(iA);
                        int itemId2 = (int) monthAdapter.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            MonthAdapter monthAdapter2 = monthAdapter;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View viewB3 = materialCalendarGridView.b(numColumns);
                            int top2 = viewB3.getTop() + calendarStyle.f19238a.f19234a.top;
                            Iterator it2 = it;
                            int bottom = viewB3.getBottom() - calendarStyle.f19238a.f19234a.bottom;
                            if (zE) {
                                int i3 = iA2 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iA ? getWidth() : width;
                                i2 = i3;
                                width3 = width4;
                            } else {
                                i2 = numColumns > iA ? 0 : width;
                                width3 = iA2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i2, top2, width3, bottom, calendarStyle.f19242h);
                            itemId++;
                            materialCalendarGridView = this;
                            monthAdapter = monthAdapter2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(((MonthAdapter) super.getAdapter()).c());
        } else if (i2 == 130) {
            setSelection(((MonthAdapter) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((MonthAdapter) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((MonthAdapter) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f0) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((MonthAdapter) super.getAdapter()).a()) {
            super.setSelection(((MonthAdapter) super.getAdapter()).a());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}

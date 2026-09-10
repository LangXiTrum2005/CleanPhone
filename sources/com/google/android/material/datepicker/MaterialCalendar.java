package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19246Y;
    public DateSelector Z;
    public CalendarConstraints e0;
    public DayViewDecorator f0;
    public Month g0;
    public CalendarSelector h0;
    public CalendarStyle i0;
    public RecyclerView j0;
    public RecyclerView k0;
    public View l0;
    public View m0;
    public View n0;
    public View o0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$1, reason: invalid class name */
    class AnonymousClass1 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
            accessibilityNodeInfoCompat.k(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$3, reason: invalid class name */
    class AnonymousClass3 implements OnDayClickListener {
        public AnonymousClass3() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$4, reason: invalid class name */
    class AnonymousClass4 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
            accessibilityNodeInfoCompat.o(false);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CalendarSelector {
        public static final CalendarSelector X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CalendarSelector f19258Y;
        public static final /* synthetic */ CalendarSelector[] Z;

        static {
            CalendarSelector calendarSelector = new CalendarSelector("DAY", 0);
            X = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            f19258Y = calendarSelector2;
            Z = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) Z.clone();
        }
    }

    public interface OnDayClickListener {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void b(OnSelectionChangedListener onSelectionChangedListener) {
        this.X.add(onSelectionChangedListener);
    }

    public final void c(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.k0.getAdapter();
        final int iG = monthsPagerAdapter.f19266i.X.g(month);
        int iG2 = iG - monthsPagerAdapter.f19266i.X.g(this.g0);
        boolean z2 = Math.abs(iG2) > 3;
        boolean z3 = iG2 > 0;
        this.g0 = month;
        if (z2 && z3) {
            this.k0.scrollToPosition(iG - 3);
            this.k0.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialCalendar.this.k0.smoothScrollToPosition(iG);
                }
            });
        } else if (!z2) {
            this.k0.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialCalendar.this.k0.smoothScrollToPosition(iG);
                }
            });
        } else {
            this.k0.scrollToPosition(iG + 3);
            this.k0.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialCalendar.this.k0.smoothScrollToPosition(iG);
                }
            });
        }
    }

    public final void d(CalendarSelector calendarSelector) {
        this.h0 = calendarSelector;
        if (calendarSelector == CalendarSelector.f19258Y) {
            this.j0.getLayoutManager().scrollToPosition(this.g0.Z - ((YearGridAdapter) this.j0.getAdapter()).f19272i.e0.X.Z);
            this.n0.setVisibility(0);
            this.o0.setVisibility(8);
            this.l0.setVisibility(8);
            this.m0.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.X) {
            this.n0.setVisibility(8);
            this.o0.setVisibility(0);
            this.l0.setVisibility(0);
            this.m0.setVisibility(0);
            c(this.g0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f19246Y = bundle.getInt("THEME_RES_ID_KEY");
        this.Z = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.e0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.g0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        final int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f19246Y);
        this.i0 = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.e0.X;
        if (MaterialDatePicker.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            i2 = com.charging.screenshow.battery.animations.themes.R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = com.charging.screenshow.battery.animations.themes.R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_days_of_week_height);
        int i4 = MonthAdapter.h0;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_month_vertical_padding) * (i4 - 1)) + (resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_day_height) * i4) + resources.getDimensionPixelOffset(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.mtrl_calendar_days_of_week);
        ViewCompat.z(gridView, new AnonymousClass1());
        int i5 = this.e0.f0;
        gridView.setAdapter((ListAdapter) (i5 > 0 ? new DaysOfWeekAdapter(i5) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(month.e0);
        gridView.setEnabled(false);
        this.k0 = (RecyclerView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.mtrl_calendar_months);
        getContext();
        this.k0.setLayoutManager(new SmoothCalendarLayoutManager(i3) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                int i6 = i3;
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (i6 == 0) {
                    iArr[0] = materialCalendar.k0.getWidth();
                    iArr[1] = materialCalendar.k0.getWidth();
                } else {
                    iArr[0] = materialCalendar.k0.getHeight();
                    iArr[1] = materialCalendar.k0.getHeight();
                }
            }
        });
        this.k0.setTag("MONTHS_VIEW_GROUP_TAG");
        final MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.Z, this.e0, this.f0, new AnonymousClass3());
        this.k0.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(com.charging.screenshow.battery.animations.themes.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.mtrl_calendar_year_selector_frame);
        this.j0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.j0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.j0.setAdapter(new YearGridAdapter(this));
            this.j0.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Calendar f19251a = UtcDates.g(null);

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Calendar f19252b = UtcDates.g(null);

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public final void onDraw(Canvas canvas, RecyclerView recyclerView2, RecyclerView.State state) {
                    Object obj;
                    if ((recyclerView2.getAdapter() instanceof YearGridAdapter) && (recyclerView2.getLayoutManager() instanceof GridLayoutManager)) {
                        YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView2.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView2.getLayoutManager();
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        for (Pair pair : materialCalendar.Z.e0()) {
                            Object obj2 = pair.f4407a;
                            if (obj2 != null && (obj = pair.f4408b) != null) {
                                long jLongValue = ((Long) obj2).longValue();
                                Calendar calendar = this.f19251a;
                                calendar.setTimeInMillis(jLongValue);
                                long jLongValue2 = ((Long) obj).longValue();
                                Calendar calendar2 = this.f19252b;
                                calendar2.setTimeInMillis(jLongValue2);
                                int i6 = calendar.get(1) - yearGridAdapter.f19272i.e0.X.Z;
                                int i7 = calendar2.get(1) - yearGridAdapter.f19272i.e0.X.Z;
                                View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i6);
                                View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(i7);
                                int i8 = gridLayoutManager.f8054Y;
                                int i9 = i6 / i8;
                                int i10 = i7 / i8;
                                int i11 = i9;
                                while (i11 <= i10) {
                                    View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.f8054Y * i11);
                                    if (viewFindViewByPosition3 != null) {
                                        canvas.drawRect((i11 != i9 || viewFindViewByPosition == null) ? 0 : (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft(), viewFindViewByPosition3.getTop() + materialCalendar.i0.d.f19234a.top, (i11 != i10 || viewFindViewByPosition2 == null) ? recyclerView2.getWidth() : (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft(), viewFindViewByPosition3.getBottom() - materialCalendar.i0.d.f19234a.bottom, materialCalendar.i0.f19242h);
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
            });
        }
        if (viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.month_navigation_fragment_toggle) != null) {
            final MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.z(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    accessibilityNodeInfoCompat.n(materialCalendar.o0.getVisibility() == 0 ? materialCalendar.getString(com.charging.screenshow.battery.animations.themes.R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(com.charging.screenshow.battery.animations.themes.R.string.mtrl_picker_toggle_to_day_selection));
                }
            });
            View viewFindViewById = viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.month_navigation_previous);
            this.l0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.month_navigation_next);
            this.m0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.n0 = viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.mtrl_calendar_year_selector_frame);
            this.o0 = viewInflate.findViewById(com.charging.screenshow.battery.animations.themes.R.id.mtrl_calendar_day_selector_frame);
            d(CalendarSelector.X);
            materialButton.setText(this.g0.f());
            this.k0.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrollStateChanged(RecyclerView recyclerView2, int i6) {
                    if (i6 == 0) {
                        recyclerView2.announceForAccessibility(materialButton.getText());
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void onScrolled(RecyclerView recyclerView2, int i6, int i7) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iFindFirstVisibleItemPosition = i6 < 0 ? ((LinearLayoutManager) materialCalendar.k0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) materialCalendar.k0.getLayoutManager()).findLastVisibleItemPosition();
                    CalendarConstraints calendarConstraints = monthsPagerAdapter.f19266i;
                    Calendar calendarC = UtcDates.c(calendarConstraints.X.X);
                    calendarC.add(2, iFindFirstVisibleItemPosition);
                    materialCalendar.g0 = new Month(calendarC);
                    Calendar calendarC2 = UtcDates.c(calendarConstraints.X.X);
                    calendarC2.add(2, iFindFirstVisibleItemPosition);
                    materialButton.setText(new Month(calendarC2).f());
                }
            });
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    CalendarSelector calendarSelector = materialCalendar.h0;
                    CalendarSelector calendarSelector2 = CalendarSelector.f19258Y;
                    CalendarSelector calendarSelector3 = CalendarSelector.X;
                    if (calendarSelector == calendarSelector2) {
                        materialCalendar.d(calendarSelector3);
                    } else if (calendarSelector == calendarSelector3) {
                        materialCalendar.d(calendarSelector2);
                    }
                }
            });
            this.m0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) materialCalendar.k0.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                    if (iFindFirstVisibleItemPosition < materialCalendar.k0.getAdapter().getItemCount()) {
                        Calendar calendarC = UtcDates.c(monthsPagerAdapter.f19266i.X.X);
                        calendarC.add(2, iFindFirstVisibleItemPosition);
                        materialCalendar.c(new Month(calendarC));
                    }
                }
            });
            this.l0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iFindLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.k0.getLayoutManager()).findLastVisibleItemPosition() - 1;
                    if (iFindLastVisibleItemPosition >= 0) {
                        Calendar calendarC = UtcDates.c(monthsPagerAdapter.f19266i.X.X);
                        calendarC.add(2, iFindLastVisibleItemPosition);
                        materialCalendar.c(new Month(calendarC));
                    }
                }
            });
        }
        if (!MaterialDatePicker.e(contextThemeWrapper, R.attr.windowFullscreen)) {
            new PagerSnapHelper().attachToRecyclerView(this.k0);
        }
        this.k0.scrollToPosition(monthsPagerAdapter.f19266i.X.g(this.g0));
        ViewCompat.z(this.k0, new AnonymousClass4());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f19246Y);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.Z);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.g0);
    }
}

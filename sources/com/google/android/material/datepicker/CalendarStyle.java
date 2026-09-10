package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes4.dex */
final class CalendarStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarItemStyle f19238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CalendarItemStyle f19239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarItemStyle f19240c;
    public final CalendarItemStyle d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CalendarItemStyle f19241e;
    public final CalendarItemStyle f;
    public final CalendarItemStyle g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f19242h;

    public CalendarStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.c(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, com.google.android.material.R.styleable.f19074p);
        this.f19238a = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f19239b = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f19240c = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 7);
        this.d = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f19241e = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f19242h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

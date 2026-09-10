package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: compiled from: CalendarStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f20182attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final attabal f20183beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final attabal f20184competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f20185dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Paint f20186impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final attabal f20187marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f20188saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f20189wireman;

    public saneness(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(mullein.saneness.beachfront(context, bubbles.dern.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), bubbles.impassible.MaterialCalendar);
        this.f20182attabal = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_dayStyle, 0));
        this.f20184competently = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_dayInvalidStyle, 0));
        this.f20188saneness = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_daySelectedStyle, 0));
        this.f20185dern = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListAttabal = mullein.dern.attabal(context, typedArrayObtainStyledAttributes, bubbles.impassible.MaterialCalendar_rangeFillColor);
        this.f20189wireman = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_yearStyle, 0));
        this.f20187marial = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_yearSelectedStyle, 0));
        this.f20183beachfront = attabal.attabal(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f20186impromptu = paint;
        paint.setColor(colorStateListAttabal.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

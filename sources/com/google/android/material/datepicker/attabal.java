package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: compiled from: CalendarItemStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Rect f20147attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final chinny.kowloon f20148beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ColorStateList f20149dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f20150marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ColorStateList f20151saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ColorStateList f20152wireman;

    public attabal(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, chinny.kowloon kowloonVar, Rect rect) {
        technofreak.cutely.wireman(rect.left);
        technofreak.cutely.wireman(rect.top);
        technofreak.cutely.wireman(rect.right);
        technofreak.cutely.wireman(rect.bottom);
        this.f20147attabal = rect;
        this.f20151saneness = colorStateList2;
        this.f20149dern = colorStateList;
        this.f20152wireman = colorStateList3;
        this.f20150marial = i;
        this.f20148beachfront = kowloonVar;
    }

    public static attabal attabal(Context context, int i) {
        technofreak.cutely.saneness(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bubbles.impassible.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(bubbles.impassible.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(bubbles.impassible.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(bubbles.impassible.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(bubbles.impassible.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListAttabal = mullein.dern.attabal(context, typedArrayObtainStyledAttributes, bubbles.impassible.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListAttabal2 = mullein.dern.attabal(context, typedArrayObtainStyledAttributes, bubbles.impassible.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListAttabal3 = mullein.dern.attabal(context, typedArrayObtainStyledAttributes, bubbles.impassible.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(bubbles.impassible.MaterialCalendarItem_itemStrokeWidth, 0);
        chinny.kowloon kowloonVarImpassible = chinny.kowloon.saneness(context, typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(bubbles.impassible.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).impassible();
        typedArrayObtainStyledAttributes.recycle();
        return new attabal(colorStateListAttabal, colorStateListAttabal2, colorStateListAttabal3, dimensionPixelSize, kowloonVarImpassible, rect);
    }

    public int dern() {
        return this.f20147attabal.top;
    }

    public void marial(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        chinny.taiyuan taiyuanVar = new chinny.taiyuan();
        chinny.taiyuan taiyuanVar2 = new chinny.taiyuan();
        taiyuanVar.setShapeAppearanceModel(this.f20148beachfront);
        taiyuanVar2.setShapeAppearanceModel(this.f20148beachfront);
        if (colorStateList == null) {
            colorStateList = this.f20149dern;
        }
        taiyuanVar.nosophobia(colorStateList);
        taiyuanVar.gusty(this.f20150marial, this.f20152wireman);
        if (colorStateList2 == null) {
            colorStateList2 = this.f20151saneness;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f20151saneness.withAlpha(30), taiyuanVar, taiyuanVar2);
        Rect rect = this.f20147attabal;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public int saneness() {
        return this.f20147attabal.bottom;
    }

    public void wireman(TextView textView) {
        marial(textView, null, null);
    }
}

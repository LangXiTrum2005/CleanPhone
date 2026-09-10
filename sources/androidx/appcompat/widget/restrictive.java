package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: compiled from: TintTypedArray.java */
/* JADX INFO: loaded from: classes.dex */
public class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f5549attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public TypedValue f5550dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TypedArray f5551saneness;

    public restrictive(Context context, TypedArray typedArray) {
        this.f5549attabal = context;
        this.f5551saneness = typedArray;
    }

    public static restrictive adultoid(Context context, AttributeSet attributeSet, int[] iArr) {
        return new restrictive(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static restrictive dovishness(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new restrictive(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static restrictive graveside(Context context, int i, int[] iArr) {
        return new restrictive(context, context.obtainStyledAttributes(i, iArr));
    }

    public int apical(int i, int i2) {
        return this.f5551saneness.getInt(i, i2);
    }

    public CharSequence arytenoidectomy(int i) {
        return this.f5551saneness.getText(i);
    }

    public boolean attabal(int i, boolean z) {
        return this.f5551saneness.getBoolean(i, z);
    }

    public int beachfront(int i, int i2) {
        return this.f5551saneness.getDimensionPixelSize(i, i2);
    }

    public Drawable competently(int i) {
        int resourceId;
        return (!this.f5551saneness.hasValue(i) || (resourceId = this.f5551saneness.getResourceId(i, 0)) == 0) ? this.f5551saneness.getDrawable(i) : competently.attabal.saneness(this.f5549attabal, resourceId);
    }

    public Typeface cutely(int i, int i2, lightstruck.impromptu.marial marialVar) {
        int resourceId = this.f5551saneness.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f5550dern == null) {
            this.f5550dern = new TypedValue();
        }
        return lightstruck.impromptu.impromptu(this.f5549attabal, resourceId, this.f5550dern, i2, marialVar);
    }

    public ColorStateList dern(int i) {
        int resourceId;
        ColorStateList colorStateListAttabal;
        return (!this.f5551saneness.hasValue(i) || (resourceId = this.f5551saneness.getResourceId(i, 0)) == 0 || (colorStateListAttabal = competently.attabal.attabal(this.f5549attabal, resourceId)) == null) ? this.f5551saneness.getColorStateList(i) : colorStateListAttabal;
    }

    public int formularize(int i, int i2) {
        return this.f5551saneness.getInteger(i, i2);
    }

    public TypedValue gintrap(int i) {
        return this.f5551saneness.peekValue(i);
    }

    public int impassible(int i, int i2) {
        return this.f5551saneness.getLayoutDimension(i, i2);
    }

    public Drawable impromptu(int i) {
        int resourceId;
        if (!this.f5551saneness.hasValue(i) || (resourceId = this.f5551saneness.getResourceId(i, 0)) == 0) {
            return null;
        }
        return competently.saneness().wireman(this.f5549attabal, resourceId, true);
    }

    public String kowloon(int i) {
        return this.f5551saneness.getString(i);
    }

    public int length() {
        return this.f5551saneness.length();
    }

    public int marial(int i, int i2) {
        return this.f5551saneness.getDimensionPixelOffset(i, i2);
    }

    public boolean molybdenite(int i) {
        return this.f5551saneness.hasValue(i);
    }

    public CharSequence[] monoploid(int i) {
        return this.f5551saneness.getTextArray(i);
    }

    public TypedArray polloi() {
        return this.f5551saneness;
    }

    public void rotuma() {
        this.f5551saneness.recycle();
    }

    public int saneness(int i, int i2) {
        return this.f5551saneness.getColor(i, i2);
    }

    public float taiyuan(int i, float f) {
        return this.f5551saneness.getFloat(i, f);
    }

    public int triweekly(int i, int i2) {
        return this.f5551saneness.getResourceId(i, i2);
    }

    public float wireman(int i, float f) {
        return this.f5551saneness.getDimension(i, f);
    }
}

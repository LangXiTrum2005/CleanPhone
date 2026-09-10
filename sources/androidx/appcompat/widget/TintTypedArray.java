package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes.dex */
public class TintTypedArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f3646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f3647c;

    public static class Api21Impl {
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static int b(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f3645a = context;
        this.f3646b = typedArray;
    }

    public static TintTypedArray e(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public final ColorStateList a(int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f3646b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList(this.f3645a, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateList;
    }

    public final Drawable b(int i2) {
        int resourceId;
        TypedArray typedArray = this.f3646b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AppCompatResources.a(this.f3645a, resourceId);
    }

    public final Drawable c(int i2) {
        int resourceId;
        Drawable drawableE;
        if (!this.f3646b.hasValue(i2) || (resourceId = this.f3646b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        Context context = this.f3645a;
        synchronized (appCompatDrawableManagerA) {
            drawableE = appCompatDrawableManagerA.f3556a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public final Typeface d(int i2, int i3, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f3646b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3647c == null) {
            this.f3647c = new TypedValue();
        }
        TypedValue typedValue = this.f3647c;
        ThreadLocal threadLocal = ResourcesCompat.f4277a;
        Context context = this.f3645a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.d(context, resourceId, typedValue, i3, fontCallback, true, false);
    }

    public final void f() {
        this.f3646b.recycle();
    }
}

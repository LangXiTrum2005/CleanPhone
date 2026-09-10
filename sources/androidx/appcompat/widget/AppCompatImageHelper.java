package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f3566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TintInfo f3567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3568c = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f3566a = imageView;
    }

    public final void a() {
        TintInfo tintInfo;
        ImageView imageView = this.f3566a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableUtils.a(drawable);
        }
        if (drawable == null || (tintInfo = this.f3567b) == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = this.f3566a;
        Context context = imageView.getContext();
        int[] iArr = R.styleable.f;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i2);
        ViewCompat.y(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayE.f3646b, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = tintTypedArrayE.f3646b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AppCompatResources.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                ImageViewCompat.a(imageView, tintTypedArrayE.a(2));
            }
            if (typedArray.hasValue(3)) {
                ImageViewCompat.b(imageView, DrawableUtils.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            tintTypedArrayE.f();
        }
    }
}

package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f47868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l7.z f47869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47870c = 0;

    public y(ImageView imageView) {
        this.f47868a = imageView;
    }

    public final void a() {
        l7.z zVar;
        ImageView imageView = this.f47868a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            h1.a(drawable);
        }
        if (drawable == null || (zVar = this.f47869b) == null) {
            return;
        }
        t.d(drawable, zVar, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = this.f47868a;
        Context context = imageView.getContext();
        int[] iArr = j.a.f43522f;
        g9.k kVarZ = g9.k.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        m0.p0.b(imageView, context2, iArr, attributeSet, typedArray2, i10, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.google.android.gms.internal.auth.o.i(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(kVarZ.q(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(h1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            kVarZ.B();
        }
    }
}

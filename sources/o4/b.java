package o4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f47095a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        Rect rect = this.f47095a;
        ((Drawable) obj).copyBounds(rect);
        return new PointF(rect.left, rect.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f47095a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}

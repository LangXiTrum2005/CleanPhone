package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TintResources.java */
/* JADX INFO: loaded from: classes.dex */
public class supplicat extends stratoscope {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final WeakReference<Context> f5571saneness;

    public supplicat(Context context, Resources resources) {
        super(resources);
        this.f5571saneness = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableAttabal = attabal(i);
        Context context = this.f5571saneness.get();
        if (drawableAttabal != null && context != null) {
            cuirassed.competently().gintrap(context, i, drawableAttabal);
        }
        return drawableAttabal;
    }
}

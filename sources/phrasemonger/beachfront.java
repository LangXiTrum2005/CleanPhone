package phrasemonger;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: DrawableAlphaProperty.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Property<Drawable, Integer> f35296attabal = new beachfront();

    public beachfront() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}

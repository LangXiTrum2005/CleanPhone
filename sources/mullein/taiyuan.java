package mullein;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: compiled from: TypefaceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan {
    public static Typeface attabal(Context context, Typeface typeface) {
        return saneness(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface saneness(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, achondroplasia.attabal.saneness(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}

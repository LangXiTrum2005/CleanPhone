package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Compatibility {

    public static class Api15Impl {
        public static void a(Resources resources, int i2, int i3, TypedValue typedValue, boolean z2) {
            resources.getValueForDensity(i2, i3, typedValue, z2);
        }
    }

    public static class Api18Impl {
        public static void a(ObjectAnimator objectAnimator, boolean z2) {
            objectAnimator.setAutoCancel(z2);
        }
    }

    public static class Api21Impl {
        public static Drawable a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        public static int b(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        public static void c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}

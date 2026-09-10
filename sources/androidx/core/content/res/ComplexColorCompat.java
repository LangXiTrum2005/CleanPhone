package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.R;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ComplexColorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f4264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f4265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4266c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i2) {
        this.f4264a = shader;
        this.f4265b = colorStateList;
        this.f4266c = i2;
    }

    public static ComplexColorCompat a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = ColorStateListInflaterCompat.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new ComplexColorCompat(null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayC = TypedArrayUtils.c(resources, theme, attributeSetAsAttributeSet, R.styleable.d);
        float f3 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayC.getFloat(8, 0.0f);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayC.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayC.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayC.getFloat(11, 0.0f) : 0.0f;
        float f7 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayC.getFloat(3, 0.0f);
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayC.getFloat(4, 0.0f) : 0.0f;
        int i3 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayC.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayC.getColor(0, 0) : 0;
        boolean z2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayC.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayC.getColor(1, 0) : 0;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayC.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayC.getFloat(5, 0.0f) : 0.0f;
        typedArrayC.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayC2 = TypedArrayUtils.c(resources, theme, attributeSetAsAttributeSet, R.styleable.f4163e);
                boolean zHasValue = typedArrayC2.hasValue(0);
                boolean zHasValue2 = typedArrayC2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayC2.getColor(0, 0);
                float f11 = typedArrayC2.getFloat(1, 0.0f);
                typedArrayC2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f4 = f;
            f5 = f2;
        }
        GradientColorInflaterCompat.ColorStops colorStops = arrayList2.size() > 0 ? new GradientColorInflaterCompat.ColorStops(arrayList2, arrayList) : null;
        if (colorStops == null) {
            colorStops = z2 ? new GradientColorInflaterCompat.ColorStops(color, color2, color3) : new GradientColorInflaterCompat.ColorStops(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i4 != 1) {
                    tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f, f2, f6, colorStops.f4275a, colorStops.f4276b, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, colorStops.f4275a, colorStops.f4276b);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i4 != 1) {
                tileMode = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, colorStops.f4275a, colorStops.f4276b, tileMode);
        }
        return new ComplexColorCompat(radialGradient, null, 0);
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f4264a == null && (colorStateList = this.f4265b) != null && colorStateList.isStateful();
    }
}

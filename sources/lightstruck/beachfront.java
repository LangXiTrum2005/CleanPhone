package lightstruck;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: GradientColorInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {
    public static attabal attabal(attabal attabalVar, int i, int i2, boolean z, int i3) {
        if (attabalVar != null) {
            return attabalVar;
        }
        return z ? new attabal(i, i3, i2) : new attabal(i, i2);
    }

    public static attabal dern(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, wostteth.competently.GradientColorItem);
                boolean zHasValue = typedArrayApical.hasValue(wostteth.competently.GradientColorItem_android_color);
                boolean zHasValue2 = typedArrayApical.hasValue(wostteth.competently.GradientColorItem_android_offset);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayApical.getColor(wostteth.competently.GradientColorItem_android_color, 0);
                float f = typedArrayApical.getFloat(wostteth.competently.GradientColorItem_android_offset, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                typedArrayApical.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new attabal(arrayList2, arrayList);
        }
        return null;
    }

    public static Shader saneness(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayApical = apical.apical(resources, theme, attributeSet, wostteth.competently.GradientColor);
        float fBeachfront = apical.beachfront(typedArrayApical, xmlPullParser, "startX", wostteth.competently.GradientColor_android_startX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fBeachfront2 = apical.beachfront(typedArrayApical, xmlPullParser, "startY", wostteth.competently.GradientColor_android_startY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fBeachfront3 = apical.beachfront(typedArrayApical, xmlPullParser, "endX", wostteth.competently.GradientColor_android_endX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fBeachfront4 = apical.beachfront(typedArrayApical, xmlPullParser, "endY", wostteth.competently.GradientColor_android_endY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fBeachfront5 = apical.beachfront(typedArrayApical, xmlPullParser, "centerX", wostteth.competently.GradientColor_android_centerX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float fBeachfront6 = apical.beachfront(typedArrayApical, xmlPullParser, "centerY", wostteth.competently.GradientColor_android_centerY, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int iCompetently = apical.competently(typedArrayApical, xmlPullParser, "type", wostteth.competently.GradientColor_android_type, 0);
        int iSaneness = apical.saneness(typedArrayApical, xmlPullParser, "startColor", wostteth.competently.GradientColor_android_startColor, 0);
        boolean zCutely = apical.cutely(xmlPullParser, "centerColor");
        int iSaneness2 = apical.saneness(typedArrayApical, xmlPullParser, "centerColor", wostteth.competently.GradientColor_android_centerColor, 0);
        int iSaneness3 = apical.saneness(typedArrayApical, xmlPullParser, "endColor", wostteth.competently.GradientColor_android_endColor, 0);
        int iCompetently2 = apical.competently(typedArrayApical, xmlPullParser, "tileMode", wostteth.competently.GradientColor_android_tileMode, 0);
        float fBeachfront7 = apical.beachfront(typedArrayApical, xmlPullParser, "gradientRadius", wostteth.competently.GradientColor_android_gradientRadius, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayApical.recycle();
        attabal attabalVarAttabal = attabal(dern(resources, xmlPullParser, attributeSet, theme), iSaneness, iSaneness3, zCutely, iSaneness2);
        if (iCompetently != 1) {
            return iCompetently != 2 ? new LinearGradient(fBeachfront, fBeachfront2, fBeachfront3, fBeachfront4, attabalVarAttabal.f32958attabal, attabalVarAttabal.f32959saneness, wireman(iCompetently2)) : new SweepGradient(fBeachfront5, fBeachfront6, attabalVarAttabal.f32958attabal, attabalVarAttabal.f32959saneness);
        }
        if (fBeachfront7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new RadialGradient(fBeachfront5, fBeachfront6, fBeachfront7, attabalVarAttabal.f32958attabal, attabalVarAttabal.f32959saneness, wireman(iCompetently2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    public static Shader.TileMode wireman(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: compiled from: GradientColorInflaterCompat.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int[] f32958attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final float[] f32959saneness;

        public attabal(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f32958attabal = new int[size];
            this.f32959saneness = new float[size];
            for (int i = 0; i < size; i++) {
                this.f32958attabal[i] = list.get(i).intValue();
                this.f32959saneness[i] = list2.get(i).floatValue();
            }
        }

        public attabal(int i, int i2) {
            this.f32958attabal = new int[]{i, i2};
            this.f32959saneness = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        }

        public attabal(int i, int i2, int i3) {
            this.f32958attabal = new int[]{i, i2, i3};
            this.f32959saneness = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
        }
    }
}

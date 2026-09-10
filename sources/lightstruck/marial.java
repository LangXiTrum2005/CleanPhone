package lightstruck;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: FontResourcesParserCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static class attabal {
        public static int attabal(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class dern implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final wireman[] f32985attabal;

        public dern(wireman[] wiremanVarArr) {
            this.f32985attabal = wiremanVarArr;
        }

        public wireman[] attabal() {
            return this.f32985attabal;
        }
    }

    /* JADX INFO: renamed from: lightstruck.marial$marial, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class C0721marial implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hardpan.marial f32986attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f32987dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final String f32988marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final hardpan.marial f32989saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f32990wireman;

        public C0721marial(hardpan.marial marialVar, hardpan.marial marialVar2, int i, int i2, String str) {
            this.f32986attabal = marialVar;
            this.f32989saneness = marialVar2;
            this.f32990wireman = i;
            this.f32987dern = i2;
            this.f32988marial = str;
        }

        public hardpan.marial attabal() {
            return this.f32989saneness;
        }

        public hardpan.marial dern() {
            return this.f32986attabal;
        }

        public int marial() {
            return this.f32987dern;
        }

        public int saneness() {
            return this.f32990wireman;
        }

        public String wireman() {
            return this.f32988marial;
        }
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public interface saneness {
    }

    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f32991attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f32992beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f32993dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f32994marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f32995saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final String f32996wireman;

        public wireman(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f32991attabal = str;
            this.f32995saneness = i;
            this.f32993dern = z;
            this.f32996wireman = str2;
            this.f32994marial = i2;
            this.f32992beachfront = i3;
        }

        public String attabal() {
            return this.f32991attabal;
        }

        public boolean beachfront() {
            return this.f32993dern;
        }

        public int dern() {
            return this.f32994marial;
        }

        public int marial() {
            return this.f32995saneness;
        }

        public int saneness() {
            return this.f32992beachfront;
        }

        public String wireman() {
            return this.f32996wireman;
        }
    }

    public static int attabal(TypedArray typedArray, int i) {
        return attabal.attabal(typedArray, i);
    }

    public static wireman beachfront(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), wostteth.competently.FontFamilyFont);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(wostteth.competently.FontFamilyFont_fontWeight) ? wostteth.competently.FontFamilyFont_fontWeight : wostteth.competently.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(wostteth.competently.FontFamilyFont_fontStyle) ? wostteth.competently.FontFamilyFont_fontStyle : wostteth.competently.FontFamilyFont_android_fontStyle, 0);
        int i2 = typedArrayObtainAttributes.hasValue(wostteth.competently.FontFamilyFont_ttcIndex) ? wostteth.competently.FontFamilyFont_ttcIndex : wostteth.competently.FontFamilyFont_android_ttcIndex;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(wostteth.competently.FontFamilyFont_fontVariationSettings) ? wostteth.competently.FontFamilyFont_fontVariationSettings : wostteth.competently.FontFamilyFont_android_fontVariationSettings);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(wostteth.competently.FontFamilyFont_font) ? wostteth.competently.FontFamilyFont_font : wostteth.competently.FontFamilyFont_android_font;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            competently(xmlPullParser);
        }
        return new wireman(string2, i, z, string, i3, resourceId);
    }

    public static void competently(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List<List<byte[]>> dern(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (attabal(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(impromptu(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(impromptu(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static List<byte[]> impromptu(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static saneness marial(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), wostteth.competently.FontFamily);
        String string = typedArrayObtainAttributes.getString(wostteth.competently.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(wostteth.competently.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(wostteth.competently.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(wostteth.competently.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(wostteth.competently.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(wostteth.competently.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(wostteth.competently.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(wostteth.competently.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                competently(xmlPullParser);
            }
            List<List<byte[]>> listDern = dern(resources, resourceId);
            return new C0721marial(new hardpan.marial(string, string2, string3, listDern), string4 != null ? new hardpan.marial(string, string2, string4, listDern) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(beachfront(xmlPullParser, resources));
                } else {
                    competently(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new dern((wireman[]) arrayList.toArray(new wireman[0]));
    }

    public static saneness saneness(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return wireman(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static saneness wireman(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return marial(xmlPullParser, resources);
        }
        competently(xmlPullParser);
        return null;
    }
}

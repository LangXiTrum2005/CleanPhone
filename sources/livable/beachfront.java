package livable;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.saran;
import decarock.triweekly;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: XmpMotionPhotoDescriptionParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String[] f33091attabal = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String[] f33093saneness = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String[] f33092dern = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static dern attabal(String str) throws IOException {
        try {
            return saneness(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            triweekly.impromptu("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static ImmutableList<dern.attabal> beachfront(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (saran.marial(xmlPullParser, str3)) {
                String strAttabal = saran.attabal(xmlPullParser, str2 + ":Mime");
                String strAttabal2 = saran.attabal(xmlPullParser, str2 + ":Semantic");
                String strAttabal3 = saran.attabal(xmlPullParser, str2 + ":Length");
                String strAttabal4 = saran.attabal(xmlPullParser, str2 + ":Padding");
                if (strAttabal == null || strAttabal2 == null) {
                    return ImmutableList.of();
                }
                attabalVarBuilder.attabal(new dern.attabal(strAttabal, strAttabal2, strAttabal3 != null ? Long.parseLong(strAttabal3) : 0L, strAttabal4 != null ? Long.parseLong(strAttabal4) : 0L));
            }
        } while (!saran.dern(xmlPullParser, str4));
        return attabalVarBuilder.impassible();
    }

    public static ImmutableList<dern.attabal> dern(XmlPullParser xmlPullParser) {
        for (String str : f33092dern) {
            String strAttabal = saran.attabal(xmlPullParser, str);
            if (strAttabal != null) {
                return ImmutableList.of(new dern.attabal("image/jpeg", "Primary", 0L, 0L), new dern.attabal(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(strAttabal), 0L));
            }
        }
        return ImmutableList.of();
    }

    public static long marial(XmlPullParser xmlPullParser) {
        for (String str : f33093saneness) {
            String strAttabal = saran.attabal(xmlPullParser, str);
            if (strAttabal != null) {
                long j = Long.parseLong(strAttabal);
                return j == -1 ? C.TIME_UNSET : j;
            }
        }
        return C.TIME_UNSET;
    }

    public static dern saneness(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!saran.marial(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        ImmutableList<dern.attabal> immutableListOf = ImmutableList.of();
        long jMarial = C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (saran.marial(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!wireman(xmlPullParserNewPullParser)) {
                    return null;
                }
                jMarial = marial(xmlPullParserNewPullParser);
                immutableListOf = dern(xmlPullParserNewPullParser);
            } else if (saran.marial(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = beachfront(xmlPullParserNewPullParser, "Container", "Item");
            } else if (saran.marial(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = beachfront(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!saran.dern(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            return null;
        }
        return new dern(jMarial, immutableListOf);
    }

    public static boolean wireman(XmlPullParser xmlPullParser) {
        for (String str : f33091attabal) {
            String strAttabal = saran.attabal(xmlPullParser, str);
            if (strAttabal != null) {
                return Integer.parseInt(strAttabal) == 1;
            }
        }
        return false;
    }
}

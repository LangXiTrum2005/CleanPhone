package androidx.media3.extractor.jpeg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.XmlPullParserUtil;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f6912a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f6913b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f6914c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static MotionPhotoDescription a(String str) throws XmlPullParserException, IOException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!XmlPullParserUtil.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ImmutableList immutableListX = ImmutableList.x();
        long j2 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (XmlPullParserUtil.c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f6912a;
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    String strA = XmlPullParserUtil.a(xmlPullParserNewPullParser, strArr[i3]);
                    if (strA != null) {
                        if (Integer.parseInt(strA) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f6913b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < 4) {
                                String strA2 = XmlPullParserUtil.a(xmlPullParserNewPullParser, strArr2[i4]);
                                if (strA2 != null) {
                                    j = Long.parseLong(strA2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i4++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f6914c;
                        while (true) {
                            if (i2 >= 2) {
                                immutableListX = ImmutableList.x();
                                break;
                            }
                            String strA3 = XmlPullParserUtil.a(xmlPullParserNewPullParser, strArr3[i2]);
                            if (strA3 != null) {
                                immutableListX = ImmutableList.A(new MotionPhotoDescription.ContainerItem("image/jpeg", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", Long.parseLong(strA3), 0L));
                                break;
                            }
                            i2++;
                        }
                        j2 = j;
                    }
                }
                return null;
            }
            if (XmlPullParserUtil.c(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListX = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListX = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!XmlPullParserUtil.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListX.isEmpty()) {
            break loop0;
        }
        return new MotionPhotoDescription(j2, immutableListX);
        return null;
    }

    public static ImmutableList b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builderS = ImmutableList.s();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = XmlPullParserUtil.a(xmlPullParser, strConcat3);
                String strA2 = XmlPullParserUtil.a(xmlPullParser, strConcat4);
                String strA3 = XmlPullParserUtil.a(xmlPullParser, strConcat5);
                String strA4 = XmlPullParserUtil.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return ImmutableList.x();
                }
                builderS.h(new MotionPhotoDescription.ContainerItem(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!XmlPullParserUtil.b(xmlPullParser, strConcat2));
        return builderS.j();
    }
}

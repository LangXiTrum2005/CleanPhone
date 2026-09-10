package v2;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.e0;
import java.io.IOException;
import java.io.StringReader;
import oa.f0;
import oa.j0;
import oa.n1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f52450a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f52451b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f52452c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static androidx.recyclerview.widget.c a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!l1.a.m(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw e0.a(null, "Couldn't find xmp metadata");
        }
        f0 f0Var = j0.f47265b;
        n1 n1VarB = n1.f47281e;
        long j10 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (l1.a.m(xmlPullParserNewPullParser, "rdf:Description")) {
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    String strH = l1.a.h(xmlPullParserNewPullParser, f52450a[i11]);
                    if (strH != null) {
                        if (Integer.parseInt(strH) != 1) {
                            break loop0;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < 4) {
                                String strH2 = l1.a.h(xmlPullParserNewPullParser, f52451b[i12]);
                                if (strH2 != null) {
                                    j10 = Long.parseLong(strH2);
                                    if (j10 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i12++;
                            }
                            j10 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i10 >= 2) {
                                f0 f0Var2 = j0.f47265b;
                                n1VarB = n1.f47281e;
                                break;
                            }
                            String strH3 = l1.a.h(xmlPullParserNewPullParser, f52452c[i10]);
                            if (strH3 != null) {
                                n1VarB = j0.C(new b("image/jpeg", 0L, 0L), new b(MimeTypes.VIDEO_MP4, Long.parseLong(strH3), 0L));
                                break;
                            }
                            i10++;
                        }
                    }
                }
                return null;
            }
            if (l1.a.m(xmlPullParserNewPullParser, "Container:Directory")) {
                n1VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (l1.a.m(xmlPullParserNewPullParser, "GContainer:Directory")) {
                n1VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!l1.a.k(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (n1VarB.isEmpty()) {
            break loop0;
        }
        return new androidx.recyclerview.widget.c(j10, n1VarB, 12);
        return null;
    }

    public static n1 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        oa.e0 e0VarU = j0.u();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (l1.a.m(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strH = l1.a.h(xmlPullParser, strConcat3);
                String strH2 = l1.a.h(xmlPullParser, strConcat4);
                String strH3 = l1.a.h(xmlPullParser, strConcat5);
                String strH4 = l1.a.h(xmlPullParser, strConcat6);
                if (strH == null || strH2 == null) {
                    return n1.f47281e;
                }
                e0VarU.b(new b(strH, strH3 != null ? Long.parseLong(strH3) : 0L, strH4 != null ? Long.parseLong(strH4) : 0L));
            }
        } while (!l1.a.k(xmlPullParser, strConcat2));
        return e0VarU.g();
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.exifinterface.media.ExifInterface;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2728Rk extends DefaultHandler implements LT {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f3674a;

    public C2728Rk() {
        try {
            this.f3674a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = Ug0.f3833a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new C2962a40(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (AbstractC2995aW.Y(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (AbstractC2995aW.Y(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0085 A[PHI: r0
  0x0085: PHI (r0v11 int) = (r0v3 int), (r0v14 int) binds: [B:82:0x00f2, B:43:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static int c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int iK;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int iK2 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                iK = k(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                if (iK > 0 && iK < 33) {
                    iK2 = iK;
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                iK2 = k(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (attributeValue2 != null) {
                    String strH0 = FW.h0(attributeValue2);
                    strH0.getClass();
                    switch (strH0) {
                        case "4000":
                            iK2 = 1;
                            break;
                        case "a000":
                            iK2 = 2;
                            break;
                        case "f801":
                            iK2 = 6;
                            break;
                        case "fa01":
                            iK2 = 8;
                            break;
                    }
                }
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                int iK3 = k(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, -1);
                if (iK3 >= 0) {
                    int[] iArr = e;
                    if (iK3 < iArr.length) {
                        iK2 = iArr[iK3];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (attributeValue3 != null && (iK = Integer.bitCount(Integer.parseInt(attributeValue3, 16))) != 0) {
                    iK2 = iK;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC2995aW.W(xmlPullParser, "AudioChannelConfiguration"));
        return iK2;
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC2995aW.W(xmlPullParser, "BaseURL"));
        if (text != null && FW.I(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC2995aW.d0(new U9(text, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            U9 u9 = (U9) list.get(i3);
            String strV = FW.V(u9.f3813a, text);
            String str = attributeValue3 == null ? strV : attributeValue3;
            if (z) {
                i = u9.c;
                i2 = u9.d;
                str = u9.b;
            }
            arrayList.add(new U9(strV, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static Pair f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? attributeValue2;
        ?? F;
        UUID uuid3;
        String attributeValue3;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue4 != null) {
            String strH0 = FW.h0(attributeValue4);
            strH0.getClass();
            switch (strH0) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = AbstractC4147nc.c;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    F = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = AbstractC4147nc.e;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    F = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = AbstractC4147nc.d;
                    attributeValue = null;
                    uuid2 = null;
                    attributeValue2 = uuid2;
                    F = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue3 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue3 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                        String[] strArrSplit = attributeValue3.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = AbstractC4147nc.b;
                        attributeValue2 = 0;
                        F = FW.f(uuid, uuidArr, null);
                        break;
                    } else {
                        uuid = null;
                        uuid2 = uuid;
                        attributeValue2 = uuid2;
                        F = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    attributeValue2 = uuid2;
                    F = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            attributeValue2 = uuid2;
            F = uuid2;
        }
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                F = F;
                attributeValue2 = xmlPullParser.getText();
            } else if (AbstractC2995aW.Z(xmlPullParser, "ms:laurl")) {
                F = F;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (F == 0 && AbstractC2995aW.Y(xmlPullParser)) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    A70 a70R = FW.R(bArrDecode);
                    UUID uuid4 = a70R == null ? null : (UUID) a70R.c;
                    if (uuid4 == null) {
                        AbstractC4038mJ.f();
                        uuid = uuid4;
                        F = 0;
                        attributeValue2 = attributeValue2;
                    } else {
                        UUID uuid5 = uuid4;
                        F = bArrDecode;
                        uuid = uuid5;
                        attributeValue2 = attributeValue2;
                    }
                } else if (F == 0) {
                    uuid3 = AbstractC4147nc.e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        F = F;
                        attributeValue2 = attributeValue2;
                    } else {
                        b(xmlPullParser);
                        F = F;
                        attributeValue2 = attributeValue2;
                    }
                } else {
                    b(xmlPullParser);
                    F = F;
                    attributeValue2 = attributeValue2;
                }
            } else if (F == 0) {
                uuid3 = AbstractC4147nc.e;
                if (!uuid3.equals(uuid) && AbstractC2995aW.Z(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    F = FW.f(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    b(xmlPullParser);
                    F = F;
                    attributeValue2 = attributeValue2;
                }
            } else {
                b(xmlPullParser);
                F = F;
                attributeValue2 = attributeValue2;
            }
        } while (!AbstractC2995aW.W(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, MimeTypes.VIDEO_MP4, F) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if (MimeTypes.BASE_TYPE_TEXT.equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static C2343Co h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC2995aW.W(xmlPullParser, str));
        return new C2343Co(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Ug0.g.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static float j(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    public static int k(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:240:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:242:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:244:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:245:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:247:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:253:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:255:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:256:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:259:0x0908  */
    /* JADX WARN: Code duplicated, block: B:262:0x0913  */
    /* JADX WARN: Code duplicated, block: B:264:0x0927  */
    /* JADX WARN: Code duplicated, block: B:266:0x092f  */
    /* JADX WARN: Code duplicated, block: B:276:0x094f A[PHI: r0
  0x094f: PHI (r0v78 java.lang.String) = (r0v77 java.lang.String), (r0v107 java.lang.String) binds: [B:258:0x0906, B:274:0x094c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x095b  */
    /* JADX WARN: Code duplicated, block: B:282:0x096f  */
    /* JADX WARN: Code duplicated, block: B:284:0x0973  */
    /* JADX WARN: Code duplicated, block: B:285:0x0976  */
    /* JADX WARN: Code duplicated, block: B:296:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:298:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:303:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:305:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:308:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:310:0x09f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:311:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:312:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:314:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:315:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:318:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:319:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:323:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:326:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:330:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:331:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:334:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:337:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:339:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:341:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:346:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:348:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:352:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:354:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:364:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:365:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:368:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:369:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:372:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:373:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:375:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:376:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:378:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:380:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:383:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:385:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:391:0x0b5f  */
    /* JADX WARN: Code duplicated, block: B:393:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:395:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:398:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:400:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:406:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:408:0x0ba8  */
    /* JADX WARN: Code duplicated, block: B:410:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:412:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:415:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:416:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:419:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:420:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:423:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:425:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:427:0x0c03 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:428:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:429:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:433:0x0c26 A[LOOP:11: B:194:0x0650->B:433:0x0c26, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:467:0x0dc5  */
    /* JADX WARN: Code duplicated, block: B:469:0x0dd5  */
    /* JADX WARN: Code duplicated, block: B:472:0x0ddb  */
    /* JADX WARN: Code duplicated, block: B:475:0x0dea  */
    /* JADX WARN: Code duplicated, block: B:478:0x0df1  */
    /* JADX WARN: Code duplicated, block: B:487:0x0e15  */
    /* JADX WARN: Code duplicated, block: B:490:0x0e1c  */
    /* JADX WARN: Code duplicated, block: B:496:0x0e44  */
    /* JADX WARN: Code duplicated, block: B:500:0x0e54  */
    /* JADX WARN: Code duplicated, block: B:503:0x0e61  */
    /* JADX WARN: Code duplicated, block: B:506:0x0e68  */
    /* JADX WARN: Code duplicated, block: B:517:0x0e93  */
    /* JADX WARN: Code duplicated, block: B:520:0x0eb1  */
    /* JADX WARN: Code duplicated, block: B:521:0x0ec9  */
    /* JADX WARN: Code duplicated, block: B:523:0x0ecd  */
    /* JADX WARN: Code duplicated, block: B:528:0x0f26 A[LOOP:5: B:129:0x03b9->B:528:0x0f26, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:616:0x12ce  */
    /* JADX WARN: Code duplicated, block: B:618:0x12d2  */
    /* JADX WARN: Code duplicated, block: B:619:0x12d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:621:0x12d8  */
    /* JADX WARN: Code duplicated, block: B:625:0x12e6  */
    /* JADX WARN: Code duplicated, block: B:627:0x12f8  */
    /* JADX WARN: Code duplicated, block: B:629:0x1300 A[LOOP:1: B:43:0x00cf->B:629:0x1300, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:631:0x0a9c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0eef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x12ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x0db5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0e0c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x08b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x0944 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0994 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x098b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x09b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x0aba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0ba8 A[SYNTHETIC] */
    public static C2676Pk n(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z;
        long j;
        ArrayList arrayList;
        String str;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList5;
        String str6;
        long j2;
        ArrayList arrayList6;
        String str7;
        ArrayList arrayList7;
        String str8;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        long j3;
        String str9;
        String str10;
        ArrayList arrayList11;
        String str11;
        String str12;
        ArrayList arrayList12;
        int i;
        String str13;
        String str14;
        long j4;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str15;
        int i2;
        char c2;
        String str16;
        String str17;
        ArrayList arrayList16;
        String str18;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        String str19;
        int i3;
        String str20;
        String strE;
        String str21;
        String str22;
        int i4;
        int i5;
        String str23;
        ArrayList arrayList20;
        int i6;
        int iP;
        int i7;
        int i8;
        int i9;
        Pair pairCreate;
        C4531rw c4531rw;
        int iIntValue;
        int iIntValue2;
        int i10;
        C2343Co c2343Co;
        int i11;
        String str24;
        int i12;
        int i13;
        C2343Co c2343Co2;
        int i14;
        String str25;
        AbstractC3139c40 c3051b40;
        ArrayList arrayList21;
        int i15;
        int i16;
        boolean z2;
        C2343Co c2343Co3;
        String str26;
        int i17;
        C2343Co c2343Co4;
        boolean zC;
        String str27;
        byte b2;
        int iP2;
        C2343Co c2343Co5;
        C2343Co c2343Co6;
        String str28;
        int i18;
        int i19;
        String str29;
        boolean zEquals;
        ArrayList arrayList22;
        int i20;
        ArrayList arrayList23;
        C4531rw c4531rwA;
        String str30;
        ArrayList arrayList24;
        String str31;
        ArrayList arrayList25;
        C4619sw c4619sw;
        AbstractC3139c40 abstractC3139c40;
        boolean z3;
        long j5;
        AC ac;
        List list;
        List list2;
        FY dy;
        int i21;
        String str32;
        int i22;
        DrmInitData.SchemeData schemeData;
        int size;
        DrmInitData.SchemeData schemeData2;
        int i23;
        DrmInitData.SchemeData schemeData3;
        DrmInitData.SchemeData schemeData4;
        long jD;
        long jM;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int i24 = 0;
        String[] strArrSplit = new String[0];
        String str33 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArrSplit = attributeValue.split(",");
        }
        int length = strArrSplit.length;
        int i25 = 0;
        while (true) {
            if (i25 >= length) {
                z = false;
                break;
            }
            if (strArrSplit[i25].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i25++;
        }
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "availabilityStartTime");
        long j6 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        long jO = attributeValue2 == null ? -9223372036854775807L : Ug0.O(attributeValue2);
        long jI = i(xmlPullParser2, "mediaPresentationDuration", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        long jI2 = i(xmlPullParser2, "minBufferTime", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        boolean zEquals2 = "dynamic".equals(xmlPullParser2.getAttributeValue(null, "type"));
        long jI3 = zEquals2 ? i(xmlPullParser2, "minimumUpdatePeriod", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) : -9223372036854775807L;
        long jI4 = zEquals2 ? i(xmlPullParser2, "timeShiftBufferDepth", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) : -9223372036854775807L;
        long jI5 = zEquals2 ? i(xmlPullParser2, "suggestedPresentationDelay", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "publishTime");
        long jO2 = attributeValue3 == null ? -9223372036854775807L : Ug0.O(attributeValue3);
        long jD2 = zEquals2 ? 0L : -9223372036854775807L;
        ArrayList arrayListD0 = AbstractC2995aW.d0(new U9(uri.toString(), uri.toString(), z ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList26 = new ArrayList();
        ArrayList arrayList27 = new ArrayList();
        ZV zv = null;
        Ig0 ig0 = null;
        Uri uriX = null;
        C3076bO c3076bO = null;
        long j7 = zEquals2 ? -9223372036854775807L : 0L;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            xmlPullParser.next();
            String str34 = "BaseURL";
            if (AbstractC2995aW.Z(xmlPullParser2, "BaseURL")) {
                if (!z4) {
                    jD2 = d(xmlPullParser2, jD2);
                    z4 = true;
                }
                arrayList27.addAll(e(xmlPullParser2, arrayListD0, z));
                arrayList27 = arrayList27;
                arrayListD0 = arrayListD0;
                arrayList26 = arrayList26;
                j = j6;
                z = z;
                j7 = j7;
            } else {
                String str35 = "lang";
                if (AbstractC2995aW.Z(xmlPullParser2, "ProgramInformation")) {
                    String attributeValue4 = xmlPullParser2.getAttributeValue(str33, "moreInformationURL");
                    String str36 = attributeValue4 == null ? str33 : attributeValue4;
                    String attributeValue5 = xmlPullParser2.getAttributeValue(str33, "lang");
                    String str37 = attributeValue5 == null ? str33 : attributeValue5;
                    String strNextText = str33;
                    String strNextText2 = strNextText;
                    String strNextText3 = strNextText2;
                    do {
                        xmlPullParser.next();
                        if (AbstractC2995aW.Z(xmlPullParser2, "Title")) {
                            strNextText = xmlPullParser.nextText();
                        } else if (AbstractC2995aW.Z(xmlPullParser2, "Source")) {
                            strNextText2 = xmlPullParser.nextText();
                        } else if (AbstractC2995aW.Z(xmlPullParser2, ExifInterface.TAG_COPYRIGHT)) {
                            strNextText3 = xmlPullParser.nextText();
                        } else {
                            b(xmlPullParser);
                        }
                    } while (!AbstractC2995aW.W(xmlPullParser2, "ProgramInformation"));
                    zv = new ZV(strNextText, strNextText2, strNextText3, str36, str37);
                } else {
                    String str38 = "schemeIdUri";
                    if (AbstractC2995aW.Z(xmlPullParser2, "UTCTiming")) {
                        ig0 = new Ig0(xmlPullParser2.getAttributeValue(str33, "schemeIdUri"), xmlPullParser2.getAttributeValue(str33, AppMeasurementSdk.ConditionalUserProperty.VALUE), i24);
                    } else {
                        if (AbstractC2995aW.Z(xmlPullParser2, HttpResponseHeader.Location)) {
                            uriX = FW.X(uri.toString(), xmlPullParser.nextText());
                        } else if (AbstractC2995aW.Z(xmlPullParser2, "ServiceDescription")) {
                            float f = -3.4028235E38f;
                            long j8 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            float f2 = -3.4028235E38f;
                            long j9 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            long jM2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            while (true) {
                                xmlPullParser.next();
                                long j10 = jD2;
                                if (AbstractC2995aW.Z(xmlPullParser2, "Latency")) {
                                    long jM3 = m(xmlPullParser2, "target", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                    jM = m(xmlPullParser2, "min", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                    jM2 = m(xmlPullParser2, "max", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                    j8 = jM3;
                                } else {
                                    if (AbstractC2995aW.Z(xmlPullParser2, "PlaybackRate")) {
                                        String attributeValue6 = xmlPullParser2.getAttributeValue(null, "min");
                                        f = attributeValue6 == null ? -3.4028235E38f : Float.parseFloat(attributeValue6);
                                        String attributeValue7 = xmlPullParser2.getAttributeValue(null, "max");
                                        f2 = attributeValue7 == null ? -3.4028235E38f : Float.parseFloat(attributeValue7);
                                    }
                                    jM = j9;
                                }
                                long j11 = jM2;
                                if (AbstractC2995aW.W(xmlPullParser2, "ServiceDescription")) {
                                    C3076bO c3076bO2 = new C3076bO();
                                    c3076bO2.f4168a = j8;
                                    c3076bO2.b = jM;
                                    c3076bO2.c = j11;
                                    c3076bO2.d = f;
                                    c3076bO2.e = f2;
                                    arrayList27 = arrayList27;
                                    c3076bO = c3076bO2;
                                    arrayListD0 = arrayListD0;
                                    arrayList26 = arrayList26;
                                    jD2 = j10;
                                    j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                } else {
                                    j9 = jM;
                                    jM2 = j11;
                                    arrayListD0 = arrayListD0;
                                    arrayList26 = arrayList26;
                                    jD2 = j10;
                                }
                            }
                        } else {
                            long j12 = jD2;
                            ArrayList arrayList28 = arrayListD0;
                            ArrayList arrayList29 = arrayList26;
                            String str39 = "Period";
                            if (!AbstractC2995aW.Z(xmlPullParser2, "Period") || z5) {
                                arrayList27 = arrayList27;
                                arrayListD0 = arrayList28;
                                z = z;
                                arrayList26 = arrayList29;
                                long j13 = j7;
                                j12 = j12;
                                j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                xmlPullParser2 = xmlPullParser2;
                                b(xmlPullParser);
                                j7 = j13;
                            } else {
                                ArrayList arrayList30 = !arrayList27.isEmpty() ? arrayList27 : arrayList28;
                                String str40 = "id";
                                String attributeValue8 = xmlPullParser2.getAttributeValue(null, "id");
                                long jI6 = i(xmlPullParser2, "start", j7);
                                long j14 = jO != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? jO + jI6 : -9223372036854775807L;
                                long j15 = j7;
                                long jI7 = i(xmlPullParser2, "duration", com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                ArrayList arrayList31 = new ArrayList();
                                String str41 = "duration";
                                ArrayList arrayList32 = new ArrayList();
                                ArrayList arrayList33 = new ArrayList();
                                long j16 = -9223372036854775807L;
                                String str42 = AppMeasurementSdk.ConditionalUserProperty.VALUE;
                                arrayListD0 = arrayList28;
                                long jD3 = j12;
                                AbstractC3139c40 abstractC3139c40T = null;
                                boolean z6 = false;
                                while (true) {
                                    xmlPullParser.next();
                                    if (AbstractC2995aW.Z(xmlPullParser2, str34)) {
                                        if (!z6) {
                                            jD3 = d(xmlPullParser2, jD3);
                                            z6 = true;
                                        }
                                        arrayList33.addAll(e(xmlPullParser2, arrayList30, z));
                                        arrayList27 = arrayList27;
                                        str34 = str34;
                                        str4 = str40;
                                        str6 = str39;
                                        z = z;
                                        arrayList = arrayList29;
                                        arrayList2 = arrayList33;
                                        j12 = j12;
                                        arrayList5 = arrayList32;
                                        arrayListD0 = arrayListD0;
                                        j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                        arrayList4 = arrayList30;
                                        str35 = str35;
                                        xmlPullParser2 = xmlPullParser2;
                                        str5 = str42;
                                        str3 = str41;
                                        arrayList3 = arrayList31;
                                        str2 = str38;
                                    } else {
                                        ArrayList arrayList34 = arrayList31;
                                        arrayList = arrayList29;
                                        jD3 = jD3;
                                        if (AbstractC2995aW.Z(xmlPullParser2, "AdaptationSet")) {
                                            ArrayList arrayList35 = !arrayList33.isEmpty() ? arrayList33 : arrayList30;
                                            int iK = k(xmlPullParser2, str40, -1);
                                            int iG = g(xmlPullParser);
                                            String str43 = "mimeType";
                                            String str44 = "AdaptationSet";
                                            String attributeValue9 = xmlPullParser2.getAttributeValue(null, "mimeType");
                                            arrayList2 = arrayList33;
                                            String str45 = "codecs";
                                            String attributeValue10 = xmlPullParser2.getAttributeValue(null, "codecs");
                                            arrayList27 = arrayList27;
                                            String str46 = "SegmentTemplate";
                                            int iK2 = k(xmlPullParser2, "width", -1);
                                            str = str39;
                                            String str47 = str38;
                                            int iK3 = k(xmlPullParser2, "height", -1);
                                            float fJ = j(xmlPullParser2, -1.0f);
                                            arrayList4 = arrayList30;
                                            String str48 = "SegmentList";
                                            String str49 = "SegmentBase";
                                            int iK4 = k(xmlPullParser2, "audioSamplingRate", -1);
                                            String attributeValue11 = xmlPullParser2.getAttributeValue(null, str35);
                                            String str50 = "audioSamplingRate";
                                            String attributeValue12 = xmlPullParser2.getAttributeValue(null, "label");
                                            ArrayList arrayList36 = new ArrayList();
                                            String text = attributeValue12;
                                            ArrayList arrayList37 = new ArrayList();
                                            ArrayList arrayList38 = new ArrayList();
                                            int i26 = iK4;
                                            ArrayList arrayList39 = new ArrayList();
                                            float f3 = fJ;
                                            ArrayList arrayList40 = new ArrayList();
                                            String str51 = "height";
                                            ArrayList arrayList41 = new ArrayList();
                                            int i27 = iK3;
                                            ArrayList arrayList42 = new ArrayList();
                                            ArrayList arrayList43 = new ArrayList();
                                            String str52 = "width";
                                            String str53 = str40;
                                            ArrayList arrayList44 = arrayList41;
                                            int i28 = iK2;
                                            AbstractC3139c40 abstractC3139c40T2 = abstractC3139c40T;
                                            long jD4 = j16;
                                            long j17 = jD3;
                                            int i29 = iG;
                                            String str54 = attributeValue11;
                                            int iC = -1;
                                            String str55 = null;
                                            boolean z7 = false;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (AbstractC2995aW.Z(xmlPullParser2, str34)) {
                                                    if (z7) {
                                                        jD = j17;
                                                    } else {
                                                        jD = d(xmlPullParser2, j17);
                                                        z7 = true;
                                                    }
                                                    arrayList43.addAll(e(xmlPullParser2, arrayList35, z));
                                                    arrayList40 = arrayList40;
                                                    str34 = str34;
                                                    j17 = jD;
                                                    i29 = i29;
                                                    arrayList8 = arrayList35;
                                                } else {
                                                    arrayList8 = arrayList35;
                                                    if (AbstractC2995aW.Z(xmlPullParser2, "ContentProtection")) {
                                                        Pair pairF = f(xmlPullParser);
                                                        j17 = j17;
                                                        Object obj = pairF.first;
                                                        if (obj != null) {
                                                            str55 = (String) obj;
                                                        }
                                                        Object obj2 = pairF.second;
                                                        if (obj2 != null) {
                                                            arrayList36.add((DrmInitData.SchemeData) obj2);
                                                        }
                                                    } else {
                                                        j17 = j17;
                                                        if (AbstractC2995aW.Z(xmlPullParser2, "ContentComponent")) {
                                                            String attributeValue13 = xmlPullParser2.getAttributeValue(null, str35);
                                                            if (str54 == null) {
                                                                str54 = attributeValue13;
                                                            } else if (attributeValue13 != null) {
                                                                FW.s(str54.equals(attributeValue13));
                                                            }
                                                            int iG2 = g(xmlPullParser);
                                                            if (i29 == -1) {
                                                                i29 = iG2;
                                                            } else if (iG2 != -1) {
                                                                FW.s(i29 == iG2);
                                                            }
                                                        } else {
                                                            if (AbstractC2995aW.Z(xmlPullParser2, "Role")) {
                                                                arrayList39.add(h(xmlPullParser2, "Role"));
                                                            } else {
                                                                String str56 = "AudioChannelConfiguration";
                                                                if (AbstractC2995aW.Z(xmlPullParser2, "AudioChannelConfiguration")) {
                                                                    iC = c(xmlPullParser);
                                                                    arrayList8 = arrayList8;
                                                                    j17 = j17;
                                                                    i29 = i29;
                                                                } else if (AbstractC2995aW.Z(xmlPullParser2, "Accessibility")) {
                                                                    arrayList38.add(h(xmlPullParser2, "Accessibility"));
                                                                } else {
                                                                    String str57 = "EssentialProperty";
                                                                    if (AbstractC2995aW.Z(xmlPullParser2, "EssentialProperty")) {
                                                                        arrayList40.add(h(xmlPullParser2, "EssentialProperty"));
                                                                    } else {
                                                                        ArrayList arrayList45 = arrayList39;
                                                                        if (AbstractC2995aW.Z(xmlPullParser2, "SupplementalProperty")) {
                                                                            ArrayList arrayList46 = arrayList44;
                                                                            arrayList46.add(h(xmlPullParser2, "SupplementalProperty"));
                                                                            arrayList10 = arrayList45;
                                                                            arrayList44 = arrayList46;
                                                                            j3 = jD4;
                                                                            str48 = str48;
                                                                            jD4 = j3;
                                                                            str54 = str54;
                                                                            text = text;
                                                                            j17 = j17;
                                                                            str9 = str44;
                                                                        } else {
                                                                            String str58 = "SupplementalProperty";
                                                                            ArrayList arrayList47 = arrayList44;
                                                                            String str59 = str35;
                                                                            String str60 = "Representation";
                                                                            String str61 = "InbandEventStream";
                                                                            if (AbstractC2995aW.Z(xmlPullParser2, "Representation")) {
                                                                                ArrayList arrayList48 = arrayList38;
                                                                                if (arrayList43.isEmpty()) {
                                                                                    str10 = null;
                                                                                    arrayList11 = arrayList8;
                                                                                } else {
                                                                                    str10 = null;
                                                                                    arrayList11 = arrayList43;
                                                                                }
                                                                                String attributeValue14 = xmlPullParser2.getAttributeValue(str10, str53);
                                                                                int i30 = i29;
                                                                                int iK5 = k(xmlPullParser2, "bandwidth", -1);
                                                                                String attributeValue15 = xmlPullParser2.getAttributeValue(null, str43);
                                                                                String str62 = attributeValue15 == null ? attributeValue9 : attributeValue15;
                                                                                String attributeValue16 = xmlPullParser2.getAttributeValue(null, str45);
                                                                                str45 = str45;
                                                                                if (attributeValue16 == null) {
                                                                                    attributeValue16 = attributeValue10;
                                                                                }
                                                                                String str63 = str52;
                                                                                int i31 = i28;
                                                                                int i32 = iK5;
                                                                                int i33 = i31;
                                                                                int iK6 = k(xmlPullParser2, str63, i33);
                                                                                ArrayList arrayList49 = arrayList43;
                                                                                String str64 = str51;
                                                                                String str65 = "ContentProtection";
                                                                                int i34 = i27;
                                                                                int iK7 = k(xmlPullParser2, str64, i34);
                                                                                String str66 = str53;
                                                                                float f4 = f3;
                                                                                float fJ2 = j(xmlPullParser2, f4);
                                                                                f3 = f4;
                                                                                String str67 = str50;
                                                                                int i35 = i26;
                                                                                String str68 = attributeValue14;
                                                                                int iK8 = k(xmlPullParser2, str67, i35);
                                                                                i26 = i35;
                                                                                ArrayList arrayList50 = new ArrayList();
                                                                                ArrayList arrayList51 = new ArrayList();
                                                                                ArrayList arrayList52 = new ArrayList(arrayList40);
                                                                                ArrayList arrayList53 = new ArrayList(arrayList47);
                                                                                ArrayList arrayList54 = new ArrayList();
                                                                                String str69 = str43;
                                                                                String str70 = str63;
                                                                                ArrayList arrayList55 = arrayList47;
                                                                                int i36 = i34;
                                                                                int iC2 = iC;
                                                                                AbstractC3139c40 abstractC3139c40T3 = abstractC3139c40T2;
                                                                                long j18 = jD4;
                                                                                long jD5 = j17;
                                                                                String str71 = null;
                                                                                boolean z8 = false;
                                                                                while (true) {
                                                                                    xmlPullParser.next();
                                                                                    if (AbstractC2995aW.Z(xmlPullParser2, str34)) {
                                                                                        if (!z8) {
                                                                                            jD5 = d(xmlPullParser2, jD5);
                                                                                            z8 = true;
                                                                                        }
                                                                                        arrayList54.addAll(e(xmlPullParser2, arrayList11, z));
                                                                                    } else {
                                                                                        arrayList40 = arrayList40;
                                                                                        if (AbstractC2995aW.Z(xmlPullParser2, str56)) {
                                                                                            iC2 = c(xmlPullParser);
                                                                                        } else {
                                                                                            String str72 = str49;
                                                                                            if (AbstractC2995aW.Z(xmlPullParser2, str72)) {
                                                                                                str49 = str72;
                                                                                                abstractC3139c40T3 = r(xmlPullParser2, (C3051b40) abstractC3139c40T3);
                                                                                            } else {
                                                                                                String str73 = str48;
                                                                                                if (AbstractC2995aW.Z(xmlPullParser2, str73)) {
                                                                                                    long jD6 = d(xmlPullParser2, j18);
                                                                                                    j12 = j12;
                                                                                                    str43 = str69;
                                                                                                    arrayList14 = arrayList11;
                                                                                                    str11 = str44;
                                                                                                    int i37 = i30;
                                                                                                    str52 = str70;
                                                                                                    str34 = str34;
                                                                                                    str12 = str72;
                                                                                                    arrayList40 = arrayList40;
                                                                                                    arrayList27 = arrayList27;
                                                                                                    arrayList9 = arrayList37;
                                                                                                    str53 = str66;
                                                                                                    i2 = i37;
                                                                                                    arrayList15 = arrayList48;
                                                                                                    arrayListD0 = arrayListD0;
                                                                                                    arrayList4 = arrayList4;
                                                                                                    str50 = str67;
                                                                                                    str51 = str64;
                                                                                                    str = str;
                                                                                                    str47 = str47;
                                                                                                    arrayList12 = arrayList42;
                                                                                                    arrayList43 = arrayList49;
                                                                                                    arrayList44 = arrayList55;
                                                                                                    i27 = i36;
                                                                                                    str14 = str56;
                                                                                                    j4 = jD5;
                                                                                                    str42 = str42;
                                                                                                    str35 = str59;
                                                                                                    arrayList8 = arrayList8;
                                                                                                    arrayList13 = arrayList54;
                                                                                                    str15 = str65;
                                                                                                    z = z;
                                                                                                    String str74 = str46;
                                                                                                    i = i32;
                                                                                                    str13 = str54;
                                                                                                    i28 = i33;
                                                                                                    abstractC3139c40T3 = s(xmlPullParser, (Y30) abstractC3139c40T3, j14, jI7, jD5, jD6, jI4);
                                                                                                    str18 = str57;
                                                                                                    str17 = str61;
                                                                                                    str58 = str58;
                                                                                                    str60 = str60;
                                                                                                    str19 = str71;
                                                                                                    arrayList16 = arrayList50;
                                                                                                    arrayList17 = arrayList51;
                                                                                                    arrayList18 = arrayList52;
                                                                                                    arrayList19 = arrayList53;
                                                                                                    i3 = iC2;
                                                                                                    j18 = jD6;
                                                                                                    c2 = 0;
                                                                                                    str16 = str74;
                                                                                                    str48 = str73;
                                                                                                } else {
                                                                                                    str51 = str64;
                                                                                                    j12 = j12;
                                                                                                    str42 = str42;
                                                                                                    str11 = str44;
                                                                                                    str = str;
                                                                                                    str47 = str47;
                                                                                                    str12 = str72;
                                                                                                    arrayList9 = arrayList37;
                                                                                                    arrayList12 = arrayList42;
                                                                                                    i = i32;
                                                                                                    str35 = str59;
                                                                                                    arrayList8 = arrayList8;
                                                                                                    str13 = str54;
                                                                                                    arrayList43 = arrayList49;
                                                                                                    str53 = str66;
                                                                                                    arrayList44 = arrayList55;
                                                                                                    i27 = i36;
                                                                                                    str43 = str69;
                                                                                                    str52 = str70;
                                                                                                    arrayList40 = arrayList40;
                                                                                                    String str75 = str57;
                                                                                                    str14 = str56;
                                                                                                    j4 = jD5;
                                                                                                    arrayList13 = arrayList54;
                                                                                                    arrayList14 = arrayList11;
                                                                                                    arrayList15 = arrayList48;
                                                                                                    arrayListD0 = arrayListD0;
                                                                                                    arrayList27 = arrayList27;
                                                                                                    String str76 = str46;
                                                                                                    arrayList4 = arrayList4;
                                                                                                    str15 = str65;
                                                                                                    i2 = i30;
                                                                                                    str34 = str34;
                                                                                                    str50 = str67;
                                                                                                    i28 = i33;
                                                                                                    z = z;
                                                                                                    if (AbstractC2995aW.Z(xmlPullParser2, str76)) {
                                                                                                        long jD7 = d(xmlPullParser2, j18);
                                                                                                        c2 = 0;
                                                                                                        str16 = str76;
                                                                                                        str48 = str73;
                                                                                                        abstractC3139c40T3 = t(xmlPullParser, (Z30) abstractC3139c40T3, arrayList44, j14, jI7, j4, jD7, jI4);
                                                                                                        str18 = str75;
                                                                                                        str17 = str61;
                                                                                                        str58 = str58;
                                                                                                        str60 = str60;
                                                                                                        str19 = str71;
                                                                                                        arrayList16 = arrayList50;
                                                                                                        arrayList17 = arrayList51;
                                                                                                        arrayList18 = arrayList52;
                                                                                                        arrayList19 = arrayList53;
                                                                                                        i3 = iC2;
                                                                                                        j18 = jD7;
                                                                                                    } else {
                                                                                                        c2 = 0;
                                                                                                        str16 = str76;
                                                                                                        str48 = str73;
                                                                                                        if (AbstractC2995aW.Z(xmlPullParser2, str15)) {
                                                                                                            Pair pairF2 = f(xmlPullParser);
                                                                                                            Object obj3 = pairF2.first;
                                                                                                            if (obj3 != null) {
                                                                                                                str71 = (String) obj3;
                                                                                                            }
                                                                                                            Object obj4 = pairF2.second;
                                                                                                            if (obj4 != null) {
                                                                                                                arrayList16 = arrayList50;
                                                                                                                arrayList16.add((DrmInitData.SchemeData) obj4);
                                                                                                            } else {
                                                                                                                arrayList16 = arrayList50;
                                                                                                            }
                                                                                                            str18 = str75;
                                                                                                            str17 = str61;
                                                                                                            str58 = str58;
                                                                                                            str19 = str71;
                                                                                                            arrayList17 = arrayList51;
                                                                                                            arrayList18 = arrayList52;
                                                                                                            arrayList19 = arrayList53;
                                                                                                        } else {
                                                                                                            str17 = str61;
                                                                                                            arrayList16 = arrayList50;
                                                                                                            if (AbstractC2995aW.Z(xmlPullParser2, str17)) {
                                                                                                                arrayList17 = arrayList51;
                                                                                                                arrayList17.add(h(xmlPullParser2, str17));
                                                                                                                str18 = str75;
                                                                                                                arrayList18 = arrayList52;
                                                                                                            } else {
                                                                                                                str18 = str75;
                                                                                                                arrayList17 = arrayList51;
                                                                                                                if (AbstractC2995aW.Z(xmlPullParser2, str18)) {
                                                                                                                    arrayList18 = arrayList52;
                                                                                                                    arrayList18.add(h(xmlPullParser2, str18));
                                                                                                                } else {
                                                                                                                    str58 = str58;
                                                                                                                    arrayList18 = arrayList52;
                                                                                                                    if (AbstractC2995aW.Z(xmlPullParser2, str58)) {
                                                                                                                        arrayList19 = arrayList53;
                                                                                                                        arrayList19.add(h(xmlPullParser2, str58));
                                                                                                                    } else {
                                                                                                                        arrayList19 = arrayList53;
                                                                                                                        b(xmlPullParser);
                                                                                                                    }
                                                                                                                }
                                                                                                                str19 = str71;
                                                                                                            }
                                                                                                            arrayList19 = arrayList53;
                                                                                                            str19 = str71;
                                                                                                        }
                                                                                                        i3 = iC2;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (AbstractC2995aW.W(xmlPullParser2, str60)) {
                                                                                                if (AbstractC5011xP.k(str62)) {
                                                                                                    strE = AbstractC5011xP.b(attributeValue16);
                                                                                                } else {
                                                                                                    if (AbstractC5011xP.m(str62)) {
                                                                                                        strE = AbstractC5011xP.j(attributeValue16);
                                                                                                    } else if (AbstractC5011xP.l(str62) && !"image".equals(AbstractC5011xP.h(str62))) {
                                                                                                        str20 = str62;
                                                                                                        if (MimeTypes.APPLICATION_MP4.equals(str20)) {
                                                                                                            strE = AbstractC5011xP.e(attributeValue16);
                                                                                                            if (MimeTypes.TEXT_VTT.equals(strE)) {
                                                                                                                strE = MimeTypes.APPLICATION_MP4VTT;
                                                                                                            }
                                                                                                        } else {
                                                                                                            strE = null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        strE = str62;
                                                                                                        str20 = strE;
                                                                                                    }
                                                                                                    str21 = MimeTypes.AUDIO_E_AC3;
                                                                                                    if (MimeTypes.AUDIO_E_AC3.equals(strE)) {
                                                                                                        i19 = 0;
                                                                                                        while (true) {
                                                                                                            if (i19 < arrayList19.size()) {
                                                                                                                C2343Co c2343Co7 = (C2343Co) arrayList19.get(i19);
                                                                                                                String str77 = c2343Co7.f2943a;
                                                                                                                str29 = str21;
                                                                                                                zEquals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str77);
                                                                                                                String str78 = c2343Co7.b;
                                                                                                                if ((zEquals || !"JOC".equals(str78)) && !("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str77) && "ec+3".equals(str78))) {
                                                                                                                    i19++;
                                                                                                                    str21 = str29;
                                                                                                                } else {
                                                                                                                    strE = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                                }
                                                                                                            } else {
                                                                                                                strE = str21;
                                                                                                            }
                                                                                                        }
                                                                                                        str22 = MimeTypes.AUDIO_E_AC3_JOC.equals(strE) ? "ec+3" : attributeValue16;
                                                                                                    }
                                                                                                    i4 = 0;
                                                                                                    i5 = 0;
                                                                                                    while (true) {
                                                                                                        str23 = "urn:mpeg:dash:role:2011";
                                                                                                        if (i4 < arrayList45.size()) {
                                                                                                            ArrayList arrayList56 = arrayList45;
                                                                                                            c2343Co6 = (C2343Co) arrayList56.get(i4);
                                                                                                            ArrayList arrayList57 = arrayList17;
                                                                                                            if (!FW.C("urn:mpeg:dash:role:2011", c2343Co6.f2943a)) {
                                                                                                                str28 = c2343Co6.b;
                                                                                                                if (str28 == null && (str28.equals("forced_subtitle") || str28.equals("forced-subtitle"))) {
                                                                                                                    i18 = 2;
                                                                                                                } else {
                                                                                                                    i18 = 0;
                                                                                                                }
                                                                                                                i5 |= i18;
                                                                                                            }
                                                                                                            i4++;
                                                                                                            arrayList45 = arrayList56;
                                                                                                            arrayList17 = arrayList57;
                                                                                                        } else {
                                                                                                            ArrayList arrayList58 = arrayList17;
                                                                                                            arrayList20 = arrayList45;
                                                                                                            i6 = 0;
                                                                                                            iP = 0;
                                                                                                            while (i6 < arrayList20.size()) {
                                                                                                                c2343Co5 = (C2343Co) arrayList20.get(i6);
                                                                                                                ArrayList arrayList59 = arrayList20;
                                                                                                                if (FW.C("urn:mpeg:dash:role:2011", c2343Co5.f2943a)) {
                                                                                                                    iP |= p(c2343Co5.b);
                                                                                                                }
                                                                                                                i6++;
                                                                                                                arrayList20 = arrayList59;
                                                                                                            }
                                                                                                            ArrayList arrayList60 = arrayList20;
                                                                                                            i7 = 0;
                                                                                                            i8 = 0;
                                                                                                            while (i7 < arrayList15.size()) {
                                                                                                                ArrayList arrayList61 = arrayList15;
                                                                                                                ArrayList arrayList62 = arrayList16;
                                                                                                                c2343Co4 = (C2343Co) arrayList61.get(i7);
                                                                                                                String str79 = str19;
                                                                                                                zC = FW.C(str23, c2343Co4.f2943a);
                                                                                                                String str80 = str23;
                                                                                                                str27 = c2343Co4.b;
                                                                                                                if (zC) {
                                                                                                                    iP2 = p(str27);
                                                                                                                } else {
                                                                                                                    if (FW.C("urn:tva:metadata:cs:AudioPurposeCS:2007", c2343Co4.f2943a)) {
                                                                                                                        if (str27 == null) {
                                                                                                                            switch (str27.hashCode()) {
                                                                                                                                case 49:
                                                                                                                                    if (str27.equals("1")) {
                                                                                                                                        b2 = 0;
                                                                                                                                    } else {
                                                                                                                                        b2 = -1;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 50:
                                                                                                                                    if (str27.equals("2")) {
                                                                                                                                        b2 = 1;
                                                                                                                                    } else {
                                                                                                                                        b2 = -1;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 51:
                                                                                                                                    if (str27.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                                                                                                                        b2 = 2;
                                                                                                                                    } else {
                                                                                                                                        b2 = -1;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 52:
                                                                                                                                    if (str27.equals("4")) {
                                                                                                                                        b2 = 3;
                                                                                                                                    } else {
                                                                                                                                        b2 = -1;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 53:
                                                                                                                                default:
                                                                                                                                    b2 = -1;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    if (str27.equals("6")) {
                                                                                                                                        b2 = 4;
                                                                                                                                    } else {
                                                                                                                                        b2 = -1;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            switch (b2) {
                                                                                                                                case 0:
                                                                                                                                    iP2 = 512;
                                                                                                                                    break;
                                                                                                                                case 1:
                                                                                                                                    iP2 = 2048;
                                                                                                                                    break;
                                                                                                                                case 2:
                                                                                                                                    iP2 = 4;
                                                                                                                                    break;
                                                                                                                                case 3:
                                                                                                                                    iP2 = 8;
                                                                                                                                    break;
                                                                                                                                case 4:
                                                                                                                                    iP2 = 1;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    iP2 = 0;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            iP2 = 0;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i7++;
                                                                                                                    str19 = str79;
                                                                                                                    str23 = str80;
                                                                                                                    arrayList16 = arrayList62;
                                                                                                                    arrayList15 = arrayList61;
                                                                                                                }
                                                                                                                i8 = iP2 | i8;
                                                                                                                i7++;
                                                                                                                str19 = str79;
                                                                                                                str23 = str80;
                                                                                                                arrayList16 = arrayList62;
                                                                                                                arrayList15 = arrayList61;
                                                                                                            }
                                                                                                            ArrayList arrayList63 = arrayList16;
                                                                                                            arrayList38 = arrayList15;
                                                                                                            String str81 = str19;
                                                                                                            int iQ = iP | i8 | q(arrayList18) | q(arrayList19);
                                                                                                            i9 = 0;
                                                                                                            while (true) {
                                                                                                                if (i9 < arrayList18.size()) {
                                                                                                                    c2343Co3 = (C2343Co) arrayList18.get(i9);
                                                                                                                    if (!FW.C("http://dashif.org/thumbnail_tile", c2343Co3.f2943a) || FW.C("http://dashif.org/guidelines/thumbnail_tile", c2343Co3.f2943a)) {
                                                                                                                        str26 = c2343Co3.b;
                                                                                                                        if (str26 != null) {
                                                                                                                            int i38 = Ug0.f3833a;
                                                                                                                            String[] strArrSplit2 = str26.split("x", -1);
                                                                                                                            if (strArrSplit2.length == 2) {
                                                                                                                                try {
                                                                                                                                } catch (NumberFormatException unused) {
                                                                                                                                    i17 = 1;
                                                                                                                                    i9 += i17;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i17 = 1;
                                                                                                                    } else {
                                                                                                                        i17 = 1;
                                                                                                                    }
                                                                                                                    i9 += i17;
                                                                                                                }
                                                                                                            }
                                                                                                            c4531rw = new C4531rw();
                                                                                                            c4531rw.f4954a = str68;
                                                                                                            c4531rw.j = str20;
                                                                                                            c4531rw.k = strE;
                                                                                                            c4531rw.h = str22;
                                                                                                            c4531rw.g = i;
                                                                                                            c4531rw.d = i5;
                                                                                                            c4531rw.e = iQ;
                                                                                                            String str82 = str13;
                                                                                                            c4531rw.c = str82;
                                                                                                            if (pairCreate != null) {
                                                                                                                iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                            } else {
                                                                                                                iIntValue = -1;
                                                                                                            }
                                                                                                            c4531rw.D = iIntValue;
                                                                                                            if (pairCreate != null) {
                                                                                                                iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                            } else {
                                                                                                                iIntValue2 = -1;
                                                                                                            }
                                                                                                            c4531rw.E = iIntValue2;
                                                                                                            if (AbstractC5011xP.m(strE)) {
                                                                                                                c4531rw.p = iK6;
                                                                                                                c4531rw.q = iK7;
                                                                                                                c4531rw.r = fJ2;
                                                                                                            } else if (AbstractC5011xP.k(strE)) {
                                                                                                                c4531rw.x = i3;
                                                                                                                c4531rw.y = iK8;
                                                                                                            } else if (AbstractC5011xP.l(strE)) {
                                                                                                                if (MimeTypes.APPLICATION_CEA608.equals(strE)) {
                                                                                                                    i13 = 0;
                                                                                                                    while (true) {
                                                                                                                        if (i13 < arrayList38.size()) {
                                                                                                                            c2343Co2 = (C2343Co) arrayList38.get(i13);
                                                                                                                            if ("urn:scte:dash:cc:cea-608:2015".equals(c2343Co2.f2943a) || (str25 = c2343Co2.b) == null) {
                                                                                                                                i14 = 1;
                                                                                                                            } else {
                                                                                                                                Matcher matcher = c.matcher(str25);
                                                                                                                                if (matcher.matches()) {
                                                                                                                                    i12 = Integer.parseInt(matcher.group(1));
                                                                                                                                } else {
                                                                                                                                    i14 = 1;
                                                                                                                                    "Unable to parse CEA-608 channel number from: ".concat(str25);
                                                                                                                                    AbstractC4038mJ.f();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i13 += i14;
                                                                                                                        } else {
                                                                                                                            i12 = -1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else if (MimeTypes.APPLICATION_CEA708.equals(strE)) {
                                                                                                                    i10 = 0;
                                                                                                                    while (true) {
                                                                                                                        if (i10 < arrayList38.size()) {
                                                                                                                            c2343Co = (C2343Co) arrayList38.get(i10);
                                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(c2343Co.f2943a) || (str24 = c2343Co.b) == null) {
                                                                                                                                i11 = 1;
                                                                                                                            } else {
                                                                                                                                Matcher matcher2 = d.matcher(str24);
                                                                                                                                if (matcher2.matches()) {
                                                                                                                                    i12 = Integer.parseInt(matcher2.group(1));
                                                                                                                                } else {
                                                                                                                                    i11 = 1;
                                                                                                                                    "Unable to parse CEA-708 service block number from: ".concat(str24);
                                                                                                                                    AbstractC4038mJ.f();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i10 += i11;
                                                                                                                        } else {
                                                                                                                            i12 = -1;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i12 = -1;
                                                                                                                }
                                                                                                                c4531rw.C = i12;
                                                                                                            } else if ("image".equals(AbstractC5011xP.h(strE))) {
                                                                                                                c4531rw.p = iK6;
                                                                                                                c4531rw.q = iK7;
                                                                                                            }
                                                                                                            C4619sw c4619sw2 = new C4619sw(c4531rw);
                                                                                                            if (abstractC3139c40T3 != null) {
                                                                                                                c3051b40 = abstractC3139c40T3;
                                                                                                            } else {
                                                                                                                c3051b40 = new C3051b40(null, 1L, 0L, 0L, 0L);
                                                                                                            }
                                                                                                            if (arrayList13.isEmpty()) {
                                                                                                                arrayList21 = arrayList14;
                                                                                                            } else {
                                                                                                                arrayList21 = arrayList13;
                                                                                                            }
                                                                                                            C2702Qk c2702Qk = new C2702Qk(c4619sw2, arrayList21, c3051b40, str81, arrayList63, arrayList58, arrayList18, arrayList19);
                                                                                                            i15 = AbstractC5011xP.i(c4619sw2.l);
                                                                                                            i16 = i2;
                                                                                                            if (i16 == -1) {
                                                                                                                i16 = i15;
                                                                                                            } else if (i15 != -1) {
                                                                                                                if (i16 == i15) {
                                                                                                                    z2 = true;
                                                                                                                } else {
                                                                                                                    z2 = false;
                                                                                                                }
                                                                                                                FW.s(z2);
                                                                                                            }
                                                                                                            ArrayList arrayList64 = arrayList12;
                                                                                                            arrayList64.add(c2702Qk);
                                                                                                            xmlPullParser2 = xmlPullParser;
                                                                                                            arrayList42 = arrayList64;
                                                                                                            str54 = str82;
                                                                                                            i29 = i16;
                                                                                                            str46 = str16;
                                                                                                            arrayList10 = arrayList60;
                                                                                                            str9 = str11;
                                                                                                            str49 = str12;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str20 = str62;
                                                                                                str21 = MimeTypes.AUDIO_E_AC3;
                                                                                                if (MimeTypes.AUDIO_E_AC3.equals(strE)) {
                                                                                                    i19 = 0;
                                                                                                    while (true) {
                                                                                                        if (i19 < arrayList19.size()) {
                                                                                                            C2343Co c2343Co8 = (C2343Co) arrayList19.get(i19);
                                                                                                            String str710 = c2343Co8.f2943a;
                                                                                                            str29 = str21;
                                                                                                            zEquals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str710);
                                                                                                            String str711 = c2343Co8.b;
                                                                                                            if (zEquals) {
                                                                                                                i19++;
                                                                                                                str21 = str29;
                                                                                                            } else {
                                                                                                                i19++;
                                                                                                                str21 = str29;
                                                                                                            }
                                                                                                            strE = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                        } else {
                                                                                                            strE = str21;
                                                                                                        }
                                                                                                    }
                                                                                                    if (MimeTypes.AUDIO_E_AC3_JOC.equals(strE)) {
                                                                                                    }
                                                                                                }
                                                                                                i4 = 0;
                                                                                                i5 = 0;
                                                                                                while (true) {
                                                                                                    str23 = "urn:mpeg:dash:role:2011";
                                                                                                    if (i4 < arrayList45.size()) {
                                                                                                        ArrayList arrayList510 = arrayList45;
                                                                                                        c2343Co6 = (C2343Co) arrayList510.get(i4);
                                                                                                        ArrayList arrayList511 = arrayList17;
                                                                                                        if (!FW.C("urn:mpeg:dash:role:2011", c2343Co6.f2943a)) {
                                                                                                            str28 = c2343Co6.b;
                                                                                                            if (str28 == null) {
                                                                                                                i18 = 0;
                                                                                                            } else {
                                                                                                                i18 = 2;
                                                                                                            }
                                                                                                            i5 |= i18;
                                                                                                        }
                                                                                                        i4++;
                                                                                                        arrayList45 = arrayList510;
                                                                                                        arrayList17 = arrayList511;
                                                                                                    } else {
                                                                                                        ArrayList arrayList512 = arrayList17;
                                                                                                        arrayList20 = arrayList45;
                                                                                                        i6 = 0;
                                                                                                        iP = 0;
                                                                                                        while (i6 < arrayList20.size()) {
                                                                                                            c2343Co5 = (C2343Co) arrayList20.get(i6);
                                                                                                            ArrayList arrayList513 = arrayList20;
                                                                                                            if (FW.C("urn:mpeg:dash:role:2011", c2343Co5.f2943a)) {
                                                                                                                iP |= p(c2343Co5.b);
                                                                                                            }
                                                                                                            i6++;
                                                                                                            arrayList20 = arrayList513;
                                                                                                        }
                                                                                                        ArrayList arrayList65 = arrayList20;
                                                                                                        i7 = 0;
                                                                                                        i8 = 0;
                                                                                                        while (i7 < arrayList15.size()) {
                                                                                                            ArrayList arrayList66 = arrayList15;
                                                                                                            ArrayList arrayList67 = arrayList16;
                                                                                                            c2343Co4 = (C2343Co) arrayList66.get(i7);
                                                                                                            String str712 = str19;
                                                                                                            zC = FW.C(str23, c2343Co4.f2943a);
                                                                                                            String str83 = str23;
                                                                                                            str27 = c2343Co4.b;
                                                                                                            if (zC) {
                                                                                                                iP2 = p(str27);
                                                                                                            } else {
                                                                                                                if (FW.C("urn:tva:metadata:cs:AudioPurposeCS:2007", c2343Co4.f2943a)) {
                                                                                                                    if (str27 == null) {
                                                                                                                        switch (str27.hashCode()) {
                                                                                                                            case 49:
                                                                                                                                if (str27.equals("1")) {
                                                                                                                                    b2 = -1;
                                                                                                                                } else {
                                                                                                                                    b2 = 0;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                if (str27.equals("2")) {
                                                                                                                                    b2 = -1;
                                                                                                                                } else {
                                                                                                                                    b2 = 1;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 51:
                                                                                                                                if (str27.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                                                                                                                    b2 = -1;
                                                                                                                                } else {
                                                                                                                                    b2 = 2;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 52:
                                                                                                                                if (str27.equals("4")) {
                                                                                                                                    b2 = -1;
                                                                                                                                } else {
                                                                                                                                    b2 = 3;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                            default:
                                                                                                                                b2 = -1;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                if (str27.equals("6")) {
                                                                                                                                    b2 = -1;
                                                                                                                                } else {
                                                                                                                                    b2 = 4;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        switch (b2) {
                                                                                                                            case 0:
                                                                                                                                iP2 = 512;
                                                                                                                                break;
                                                                                                                            case 1:
                                                                                                                                iP2 = 2048;
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                iP2 = 4;
                                                                                                                                break;
                                                                                                                            case 3:
                                                                                                                                iP2 = 8;
                                                                                                                                break;
                                                                                                                            case 4:
                                                                                                                                iP2 = 1;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                iP2 = 0;
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        iP2 = 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                i7++;
                                                                                                                str19 = str712;
                                                                                                                str23 = str83;
                                                                                                                arrayList16 = arrayList67;
                                                                                                                arrayList15 = arrayList66;
                                                                                                            }
                                                                                                            i8 = iP2 | i8;
                                                                                                            i7++;
                                                                                                            str19 = str712;
                                                                                                            str23 = str83;
                                                                                                            arrayList16 = arrayList67;
                                                                                                            arrayList15 = arrayList66;
                                                                                                        }
                                                                                                        ArrayList arrayList68 = arrayList16;
                                                                                                        arrayList38 = arrayList15;
                                                                                                        String str84 = str19;
                                                                                                        int iQ2 = iP | i8 | q(arrayList18) | q(arrayList19);
                                                                                                        i9 = 0;
                                                                                                        while (true) {
                                                                                                            if (i9 < arrayList18.size()) {
                                                                                                                c2343Co3 = (C2343Co) arrayList18.get(i9);
                                                                                                                if (FW.C("http://dashif.org/thumbnail_tile", c2343Co3.f2943a)) {
                                                                                                                    str26 = c2343Co3.b;
                                                                                                                    if (str26 != null) {
                                                                                                                        int i39 = Ug0.f3833a;
                                                                                                                        String[] strArrSplit3 = str26.split("x", -1);
                                                                                                                        pairCreate = strArrSplit3.length == 2 ? Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit3[c2])), Integer.valueOf(Integer.parseInt(strArrSplit3[1]))) : null;
                                                                                                                    }
                                                                                                                    i17 = 1;
                                                                                                                } else {
                                                                                                                    str26 = c2343Co3.b;
                                                                                                                    if (str26 != null) {
                                                                                                                        int i310 = Ug0.f3833a;
                                                                                                                        String[] strArrSplit4 = str26.split("x", -1);
                                                                                                                        if (strArrSplit4.length == 2) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i17 = 1;
                                                                                                                }
                                                                                                                i9 += i17;
                                                                                                            }
                                                                                                        }
                                                                                                        c4531rw = new C4531rw();
                                                                                                        c4531rw.f4954a = str68;
                                                                                                        c4531rw.j = str20;
                                                                                                        c4531rw.k = strE;
                                                                                                        c4531rw.h = str22;
                                                                                                        c4531rw.g = i;
                                                                                                        c4531rw.d = i5;
                                                                                                        c4531rw.e = iQ2;
                                                                                                        String str85 = str13;
                                                                                                        c4531rw.c = str85;
                                                                                                        if (pairCreate != null) {
                                                                                                            iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                        } else {
                                                                                                            iIntValue = -1;
                                                                                                        }
                                                                                                        c4531rw.D = iIntValue;
                                                                                                        if (pairCreate != null) {
                                                                                                            iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                        } else {
                                                                                                            iIntValue2 = -1;
                                                                                                        }
                                                                                                        c4531rw.E = iIntValue2;
                                                                                                        if (AbstractC5011xP.m(strE)) {
                                                                                                            c4531rw.p = iK6;
                                                                                                            c4531rw.q = iK7;
                                                                                                            c4531rw.r = fJ2;
                                                                                                        } else if (AbstractC5011xP.k(strE)) {
                                                                                                            c4531rw.x = i3;
                                                                                                            c4531rw.y = iK8;
                                                                                                        } else if (AbstractC5011xP.l(strE)) {
                                                                                                            if (MimeTypes.APPLICATION_CEA608.equals(strE)) {
                                                                                                                i13 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i13 < arrayList38.size()) {
                                                                                                                        c2343Co2 = (C2343Co) arrayList38.get(i13);
                                                                                                                        if ("urn:scte:dash:cc:cea-608:2015".equals(c2343Co2.f2943a)) {
                                                                                                                            i14 = 1;
                                                                                                                        } else {
                                                                                                                            i14 = 1;
                                                                                                                        }
                                                                                                                        i13 += i14;
                                                                                                                    } else {
                                                                                                                        i12 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else if (MimeTypes.APPLICATION_CEA708.equals(strE)) {
                                                                                                                i10 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i10 < arrayList38.size()) {
                                                                                                                        c2343Co = (C2343Co) arrayList38.get(i10);
                                                                                                                        if ("urn:scte:dash:cc:cea-708:2015".equals(c2343Co.f2943a)) {
                                                                                                                            i11 = 1;
                                                                                                                        } else {
                                                                                                                            i11 = 1;
                                                                                                                        }
                                                                                                                        i10 += i11;
                                                                                                                    } else {
                                                                                                                        i12 = -1;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                i12 = -1;
                                                                                                            }
                                                                                                            c4531rw.C = i12;
                                                                                                        } else if ("image".equals(AbstractC5011xP.h(strE))) {
                                                                                                            c4531rw.p = iK6;
                                                                                                            c4531rw.q = iK7;
                                                                                                        }
                                                                                                        C4619sw c4619sw3 = new C4619sw(c4531rw);
                                                                                                        if (abstractC3139c40T3 != null) {
                                                                                                            c3051b40 = abstractC3139c40T3;
                                                                                                        } else {
                                                                                                            c3051b40 = new C3051b40(null, 1L, 0L, 0L, 0L);
                                                                                                        }
                                                                                                        if (arrayList13.isEmpty()) {
                                                                                                            arrayList21 = arrayList13;
                                                                                                        } else {
                                                                                                            arrayList21 = arrayList14;
                                                                                                        }
                                                                                                        C2702Qk c2702Qk2 = new C2702Qk(c4619sw3, arrayList21, c3051b40, str84, arrayList68, arrayList512, arrayList18, arrayList19);
                                                                                                        i15 = AbstractC5011xP.i(c4619sw3.l);
                                                                                                        i16 = i2;
                                                                                                        if (i16 == -1) {
                                                                                                            i16 = i15;
                                                                                                        } else if (i15 != -1) {
                                                                                                            if (i16 == i15) {
                                                                                                                z2 = true;
                                                                                                            } else {
                                                                                                                z2 = false;
                                                                                                            }
                                                                                                            FW.s(z2);
                                                                                                        }
                                                                                                        ArrayList arrayList69 = arrayList12;
                                                                                                        arrayList69.add(c2702Qk2);
                                                                                                        xmlPullParser2 = xmlPullParser;
                                                                                                        arrayList42 = arrayList69;
                                                                                                        str54 = str85;
                                                                                                        i29 = i16;
                                                                                                        str46 = str16;
                                                                                                        arrayList10 = arrayList65;
                                                                                                        str9 = str11;
                                                                                                        str49 = str12;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                arrayList50 = arrayList16;
                                                                                                ArrayList arrayList70 = arrayList15;
                                                                                                str61 = str17;
                                                                                                arrayList51 = arrayList17;
                                                                                                str58 = str58;
                                                                                                arrayList52 = arrayList18;
                                                                                                arrayList53 = arrayList19;
                                                                                                iC2 = i3;
                                                                                                str60 = str60;
                                                                                                str64 = str51;
                                                                                                str59 = str35;
                                                                                                arrayList8 = arrayList8;
                                                                                                j12 = j12;
                                                                                                i33 = i28;
                                                                                                arrayList49 = arrayList43;
                                                                                                str71 = str19;
                                                                                                z = z;
                                                                                                str56 = str14;
                                                                                                str34 = str34;
                                                                                                i30 = i2;
                                                                                                jD5 = j4;
                                                                                                arrayList40 = arrayList40;
                                                                                                str44 = str11;
                                                                                                str66 = str53;
                                                                                                arrayList37 = arrayList9;
                                                                                                str47 = str47;
                                                                                                arrayList42 = arrayList12;
                                                                                                str54 = str13;
                                                                                                i32 = i;
                                                                                                arrayList36 = arrayList36;
                                                                                                iK8 = iK8;
                                                                                                str57 = str18;
                                                                                                str65 = str15;
                                                                                                i36 = i27;
                                                                                                arrayList54 = arrayList13;
                                                                                                str46 = str16;
                                                                                                arrayList55 = arrayList44;
                                                                                                str67 = str50;
                                                                                                arrayList27 = arrayList27;
                                                                                                str70 = str52;
                                                                                                str49 = str12;
                                                                                                str = str;
                                                                                                str42 = str42;
                                                                                                arrayList4 = arrayList4;
                                                                                                arrayListD0 = arrayListD0;
                                                                                                arrayList48 = arrayList70;
                                                                                                xmlPullParser2 = xmlPullParser;
                                                                                                String str86 = str48;
                                                                                                str68 = str68;
                                                                                                arrayList11 = arrayList14;
                                                                                                str69 = str43;
                                                                                                str48 = str86;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str51 = str64;
                                                                                    j12 = j12;
                                                                                    str42 = str42;
                                                                                    str11 = str44;
                                                                                    str = str;
                                                                                    str47 = str47;
                                                                                    str12 = str49;
                                                                                    arrayList9 = arrayList37;
                                                                                    arrayList12 = arrayList42;
                                                                                    i = i32;
                                                                                    str17 = str61;
                                                                                    str35 = str59;
                                                                                    arrayList8 = arrayList8;
                                                                                    str13 = str54;
                                                                                    arrayList43 = arrayList49;
                                                                                    str53 = str66;
                                                                                    arrayList44 = arrayList55;
                                                                                    i27 = i36;
                                                                                    arrayList18 = arrayList52;
                                                                                    str52 = str70;
                                                                                    arrayList40 = arrayList40;
                                                                                    c2 = 0;
                                                                                    str14 = str56;
                                                                                    j4 = jD5;
                                                                                    arrayList13 = arrayList54;
                                                                                    arrayList15 = arrayList48;
                                                                                    arrayListD0 = arrayListD0;
                                                                                    arrayList27 = arrayList27;
                                                                                    str16 = str46;
                                                                                    arrayList4 = arrayList4;
                                                                                    str15 = str65;
                                                                                    str58 = str58;
                                                                                    i2 = i30;
                                                                                    str19 = str71;
                                                                                    arrayList19 = arrayList53;
                                                                                    str34 = str34;
                                                                                    str50 = str67;
                                                                                    str18 = str57;
                                                                                    i28 = i33;
                                                                                    z = z;
                                                                                    str60 = str60;
                                                                                    arrayList16 = arrayList50;
                                                                                    arrayList17 = arrayList51;
                                                                                    i3 = iC2;
                                                                                    String str87 = str69;
                                                                                    arrayList14 = arrayList11;
                                                                                    str48 = str48;
                                                                                    str43 = str87;
                                                                                    if (AbstractC2995aW.W(xmlPullParser2, str60)) {
                                                                                        if (AbstractC5011xP.k(str62)) {
                                                                                            strE = AbstractC5011xP.b(attributeValue16);
                                                                                        } else {
                                                                                            if (AbstractC5011xP.m(str62)) {
                                                                                                strE = AbstractC5011xP.j(attributeValue16);
                                                                                            } else if (AbstractC5011xP.l(str62)) {
                                                                                                strE = str62;
                                                                                                str20 = strE;
                                                                                            } else {
                                                                                                str20 = str62;
                                                                                                if (MimeTypes.APPLICATION_MP4.equals(str20)) {
                                                                                                    strE = AbstractC5011xP.e(attributeValue16);
                                                                                                    if (MimeTypes.TEXT_VTT.equals(strE)) {
                                                                                                        strE = MimeTypes.APPLICATION_MP4VTT;
                                                                                                    }
                                                                                                } else {
                                                                                                    strE = null;
                                                                                                }
                                                                                            }
                                                                                            str21 = MimeTypes.AUDIO_E_AC3;
                                                                                            if (MimeTypes.AUDIO_E_AC3.equals(strE)) {
                                                                                                i19 = 0;
                                                                                                while (true) {
                                                                                                    if (i19 < arrayList19.size()) {
                                                                                                        C2343Co c2343Co9 = (C2343Co) arrayList19.get(i19);
                                                                                                        String str713 = c2343Co9.f2943a;
                                                                                                        str29 = str21;
                                                                                                        zEquals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str713);
                                                                                                        String str714 = c2343Co9.b;
                                                                                                        if (zEquals) {
                                                                                                            i19++;
                                                                                                            str21 = str29;
                                                                                                        } else {
                                                                                                            i19++;
                                                                                                            str21 = str29;
                                                                                                        }
                                                                                                        strE = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                    } else {
                                                                                                        strE = str21;
                                                                                                    }
                                                                                                }
                                                                                                if (MimeTypes.AUDIO_E_AC3_JOC.equals(strE)) {
                                                                                                }
                                                                                            }
                                                                                            i4 = 0;
                                                                                            i5 = 0;
                                                                                            while (true) {
                                                                                                str23 = "urn:mpeg:dash:role:2011";
                                                                                                if (i4 < arrayList45.size()) {
                                                                                                    ArrayList arrayList514 = arrayList45;
                                                                                                    c2343Co6 = (C2343Co) arrayList514.get(i4);
                                                                                                    ArrayList arrayList515 = arrayList17;
                                                                                                    if (!FW.C("urn:mpeg:dash:role:2011", c2343Co6.f2943a)) {
                                                                                                        str28 = c2343Co6.b;
                                                                                                        if (str28 == null) {
                                                                                                            i18 = 0;
                                                                                                        } else {
                                                                                                            i18 = 2;
                                                                                                        }
                                                                                                        i5 |= i18;
                                                                                                    }
                                                                                                    i4++;
                                                                                                    arrayList45 = arrayList514;
                                                                                                    arrayList17 = arrayList515;
                                                                                                } else {
                                                                                                    ArrayList arrayList516 = arrayList17;
                                                                                                    arrayList20 = arrayList45;
                                                                                                    i6 = 0;
                                                                                                    iP = 0;
                                                                                                    while (i6 < arrayList20.size()) {
                                                                                                        c2343Co5 = (C2343Co) arrayList20.get(i6);
                                                                                                        ArrayList arrayList517 = arrayList20;
                                                                                                        if (FW.C("urn:mpeg:dash:role:2011", c2343Co5.f2943a)) {
                                                                                                            iP |= p(c2343Co5.b);
                                                                                                        }
                                                                                                        i6++;
                                                                                                        arrayList20 = arrayList517;
                                                                                                    }
                                                                                                    ArrayList arrayList610 = arrayList20;
                                                                                                    i7 = 0;
                                                                                                    i8 = 0;
                                                                                                    while (i7 < arrayList15.size()) {
                                                                                                        ArrayList arrayList611 = arrayList15;
                                                                                                        ArrayList arrayList612 = arrayList16;
                                                                                                        c2343Co4 = (C2343Co) arrayList611.get(i7);
                                                                                                        String str715 = str19;
                                                                                                        zC = FW.C(str23, c2343Co4.f2943a);
                                                                                                        String str88 = str23;
                                                                                                        str27 = c2343Co4.b;
                                                                                                        if (zC) {
                                                                                                            iP2 = p(str27);
                                                                                                        } else {
                                                                                                            if (FW.C("urn:tva:metadata:cs:AudioPurposeCS:2007", c2343Co4.f2943a)) {
                                                                                                                if (str27 == null) {
                                                                                                                    switch (str27.hashCode()) {
                                                                                                                        case 49:
                                                                                                                            if (str27.equals("1")) {
                                                                                                                                b2 = -1;
                                                                                                                            } else {
                                                                                                                                b2 = 0;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            if (str27.equals("2")) {
                                                                                                                                b2 = -1;
                                                                                                                            } else {
                                                                                                                                b2 = 1;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 51:
                                                                                                                            if (str27.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                                                                                                                b2 = -1;
                                                                                                                            } else {
                                                                                                                                b2 = 2;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 52:
                                                                                                                            if (str27.equals("4")) {
                                                                                                                                b2 = -1;
                                                                                                                            } else {
                                                                                                                                b2 = 3;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 53:
                                                                                                                        default:
                                                                                                                            b2 = -1;
                                                                                                                            break;
                                                                                                                        case 54:
                                                                                                                            if (str27.equals("6")) {
                                                                                                                                b2 = -1;
                                                                                                                            } else {
                                                                                                                                b2 = 4;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    switch (b2) {
                                                                                                                        case 0:
                                                                                                                            iP2 = 512;
                                                                                                                            break;
                                                                                                                        case 1:
                                                                                                                            iP2 = 2048;
                                                                                                                            break;
                                                                                                                        case 2:
                                                                                                                            iP2 = 4;
                                                                                                                            break;
                                                                                                                        case 3:
                                                                                                                            iP2 = 8;
                                                                                                                            break;
                                                                                                                        case 4:
                                                                                                                            iP2 = 1;
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            iP2 = 0;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    iP2 = 0;
                                                                                                                }
                                                                                                            }
                                                                                                            i7++;
                                                                                                            str19 = str715;
                                                                                                            str23 = str88;
                                                                                                            arrayList16 = arrayList612;
                                                                                                            arrayList15 = arrayList611;
                                                                                                        }
                                                                                                        i8 = iP2 | i8;
                                                                                                        i7++;
                                                                                                        str19 = str715;
                                                                                                        str23 = str88;
                                                                                                        arrayList16 = arrayList612;
                                                                                                        arrayList15 = arrayList611;
                                                                                                    }
                                                                                                    ArrayList arrayList613 = arrayList16;
                                                                                                    arrayList38 = arrayList15;
                                                                                                    String str89 = str19;
                                                                                                    int iQ3 = iP | i8 | q(arrayList18) | q(arrayList19);
                                                                                                    i9 = 0;
                                                                                                    while (true) {
                                                                                                        if (i9 < arrayList18.size()) {
                                                                                                            c2343Co3 = (C2343Co) arrayList18.get(i9);
                                                                                                            if (FW.C("http://dashif.org/thumbnail_tile", c2343Co3.f2943a)) {
                                                                                                                str26 = c2343Co3.b;
                                                                                                                if (str26 != null) {
                                                                                                                    int i311 = Ug0.f3833a;
                                                                                                                    String[] strArrSplit5 = str26.split("x", -1);
                                                                                                                    if (strArrSplit5.length == 2) {
                                                                                                                    }
                                                                                                                }
                                                                                                                i17 = 1;
                                                                                                            } else {
                                                                                                                str26 = c2343Co3.b;
                                                                                                                if (str26 != null) {
                                                                                                                    int i312 = Ug0.f3833a;
                                                                                                                    String[] strArrSplit6 = str26.split("x", -1);
                                                                                                                    if (strArrSplit6.length == 2) {
                                                                                                                    }
                                                                                                                }
                                                                                                                i17 = 1;
                                                                                                            }
                                                                                                            i9 += i17;
                                                                                                        }
                                                                                                    }
                                                                                                    c4531rw = new C4531rw();
                                                                                                    c4531rw.f4954a = str68;
                                                                                                    c4531rw.j = str20;
                                                                                                    c4531rw.k = strE;
                                                                                                    c4531rw.h = str22;
                                                                                                    c4531rw.g = i;
                                                                                                    c4531rw.d = i5;
                                                                                                    c4531rw.e = iQ3;
                                                                                                    String str810 = str13;
                                                                                                    c4531rw.c = str810;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                    } else {
                                                                                                        iIntValue = -1;
                                                                                                    }
                                                                                                    c4531rw.D = iIntValue;
                                                                                                    if (pairCreate != null) {
                                                                                                        iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                    } else {
                                                                                                        iIntValue2 = -1;
                                                                                                    }
                                                                                                    c4531rw.E = iIntValue2;
                                                                                                    if (AbstractC5011xP.m(strE)) {
                                                                                                        c4531rw.p = iK6;
                                                                                                        c4531rw.q = iK7;
                                                                                                        c4531rw.r = fJ2;
                                                                                                    } else if (AbstractC5011xP.k(strE)) {
                                                                                                        c4531rw.x = i3;
                                                                                                        c4531rw.y = iK8;
                                                                                                    } else if (AbstractC5011xP.l(strE)) {
                                                                                                        if (MimeTypes.APPLICATION_CEA608.equals(strE)) {
                                                                                                            i13 = 0;
                                                                                                            while (true) {
                                                                                                                if (i13 < arrayList38.size()) {
                                                                                                                    c2343Co2 = (C2343Co) arrayList38.get(i13);
                                                                                                                    if ("urn:scte:dash:cc:cea-608:2015".equals(c2343Co2.f2943a)) {
                                                                                                                        i14 = 1;
                                                                                                                    } else {
                                                                                                                        i14 = 1;
                                                                                                                    }
                                                                                                                    i13 += i14;
                                                                                                                } else {
                                                                                                                    i12 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else if (MimeTypes.APPLICATION_CEA708.equals(strE)) {
                                                                                                            i10 = 0;
                                                                                                            while (true) {
                                                                                                                if (i10 < arrayList38.size()) {
                                                                                                                    c2343Co = (C2343Co) arrayList38.get(i10);
                                                                                                                    if ("urn:scte:dash:cc:cea-708:2015".equals(c2343Co.f2943a)) {
                                                                                                                        i11 = 1;
                                                                                                                    } else {
                                                                                                                        i11 = 1;
                                                                                                                    }
                                                                                                                    i10 += i11;
                                                                                                                } else {
                                                                                                                    i12 = -1;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            i12 = -1;
                                                                                                        }
                                                                                                        c4531rw.C = i12;
                                                                                                    } else if ("image".equals(AbstractC5011xP.h(strE))) {
                                                                                                        c4531rw.p = iK6;
                                                                                                        c4531rw.q = iK7;
                                                                                                    }
                                                                                                    C4619sw c4619sw4 = new C4619sw(c4531rw);
                                                                                                    if (abstractC3139c40T3 != null) {
                                                                                                        c3051b40 = abstractC3139c40T3;
                                                                                                    } else {
                                                                                                        c3051b40 = new C3051b40(null, 1L, 0L, 0L, 0L);
                                                                                                    }
                                                                                                    if (arrayList13.isEmpty()) {
                                                                                                        arrayList21 = arrayList13;
                                                                                                    } else {
                                                                                                        arrayList21 = arrayList14;
                                                                                                    }
                                                                                                    C2702Qk c2702Qk3 = new C2702Qk(c4619sw4, arrayList21, c3051b40, str89, arrayList613, arrayList516, arrayList18, arrayList19);
                                                                                                    i15 = AbstractC5011xP.i(c4619sw4.l);
                                                                                                    i16 = i2;
                                                                                                    if (i16 == -1) {
                                                                                                        i16 = i15;
                                                                                                    } else if (i15 != -1) {
                                                                                                        if (i16 == i15) {
                                                                                                            z2 = true;
                                                                                                        } else {
                                                                                                            z2 = false;
                                                                                                        }
                                                                                                        FW.s(z2);
                                                                                                    }
                                                                                                    ArrayList arrayList614 = arrayList12;
                                                                                                    arrayList614.add(c2702Qk3);
                                                                                                    xmlPullParser2 = xmlPullParser;
                                                                                                    arrayList42 = arrayList614;
                                                                                                    str54 = str810;
                                                                                                    i29 = i16;
                                                                                                    str46 = str16;
                                                                                                    arrayList10 = arrayList610;
                                                                                                    str9 = str11;
                                                                                                    str49 = str12;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str20 = str62;
                                                                                        str21 = MimeTypes.AUDIO_E_AC3;
                                                                                        if (MimeTypes.AUDIO_E_AC3.equals(strE)) {
                                                                                            i19 = 0;
                                                                                            while (true) {
                                                                                                if (i19 < arrayList19.size()) {
                                                                                                    C2343Co c2343Co10 = (C2343Co) arrayList19.get(i19);
                                                                                                    String str716 = c2343Co10.f2943a;
                                                                                                    str29 = str21;
                                                                                                    zEquals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str716);
                                                                                                    String str717 = c2343Co10.b;
                                                                                                    if (zEquals) {
                                                                                                        i19++;
                                                                                                        str21 = str29;
                                                                                                    } else {
                                                                                                        i19++;
                                                                                                        str21 = str29;
                                                                                                    }
                                                                                                    strE = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                } else {
                                                                                                    strE = str21;
                                                                                                }
                                                                                            }
                                                                                            if (MimeTypes.AUDIO_E_AC3_JOC.equals(strE)) {
                                                                                            }
                                                                                        }
                                                                                        i4 = 0;
                                                                                        i5 = 0;
                                                                                        while (true) {
                                                                                            str23 = "urn:mpeg:dash:role:2011";
                                                                                            if (i4 < arrayList45.size()) {
                                                                                                ArrayList arrayList518 = arrayList45;
                                                                                                c2343Co6 = (C2343Co) arrayList518.get(i4);
                                                                                                ArrayList arrayList519 = arrayList17;
                                                                                                if (!FW.C("urn:mpeg:dash:role:2011", c2343Co6.f2943a)) {
                                                                                                    str28 = c2343Co6.b;
                                                                                                    if (str28 == null) {
                                                                                                        i18 = 0;
                                                                                                    } else {
                                                                                                        i18 = 2;
                                                                                                    }
                                                                                                    i5 |= i18;
                                                                                                }
                                                                                                i4++;
                                                                                                arrayList45 = arrayList518;
                                                                                                arrayList17 = arrayList519;
                                                                                            } else {
                                                                                                ArrayList arrayList5110 = arrayList17;
                                                                                                arrayList20 = arrayList45;
                                                                                                i6 = 0;
                                                                                                iP = 0;
                                                                                                while (i6 < arrayList20.size()) {
                                                                                                    c2343Co5 = (C2343Co) arrayList20.get(i6);
                                                                                                    ArrayList arrayList5111 = arrayList20;
                                                                                                    if (FW.C("urn:mpeg:dash:role:2011", c2343Co5.f2943a)) {
                                                                                                        iP |= p(c2343Co5.b);
                                                                                                    }
                                                                                                    i6++;
                                                                                                    arrayList20 = arrayList5111;
                                                                                                }
                                                                                                ArrayList arrayList615 = arrayList20;
                                                                                                i7 = 0;
                                                                                                i8 = 0;
                                                                                                while (i7 < arrayList15.size()) {
                                                                                                    ArrayList arrayList616 = arrayList15;
                                                                                                    ArrayList arrayList617 = arrayList16;
                                                                                                    c2343Co4 = (C2343Co) arrayList616.get(i7);
                                                                                                    String str718 = str19;
                                                                                                    zC = FW.C(str23, c2343Co4.f2943a);
                                                                                                    String str811 = str23;
                                                                                                    str27 = c2343Co4.b;
                                                                                                    if (zC) {
                                                                                                        iP2 = p(str27);
                                                                                                    } else {
                                                                                                        if (FW.C("urn:tva:metadata:cs:AudioPurposeCS:2007", c2343Co4.f2943a)) {
                                                                                                            if (str27 == null) {
                                                                                                                switch (str27.hashCode()) {
                                                                                                                    case 49:
                                                                                                                        if (str27.equals("1")) {
                                                                                                                            b2 = -1;
                                                                                                                        } else {
                                                                                                                            b2 = 0;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 50:
                                                                                                                        if (str27.equals("2")) {
                                                                                                                            b2 = -1;
                                                                                                                        } else {
                                                                                                                            b2 = 1;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 51:
                                                                                                                        if (str27.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                                                                                                            b2 = -1;
                                                                                                                        } else {
                                                                                                                            b2 = 2;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 52:
                                                                                                                        if (str27.equals("4")) {
                                                                                                                            b2 = -1;
                                                                                                                        } else {
                                                                                                                            b2 = 3;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 53:
                                                                                                                    default:
                                                                                                                        b2 = -1;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        if (str27.equals("6")) {
                                                                                                                            b2 = -1;
                                                                                                                        } else {
                                                                                                                            b2 = 4;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                                switch (b2) {
                                                                                                                    case 0:
                                                                                                                        iP2 = 512;
                                                                                                                        break;
                                                                                                                    case 1:
                                                                                                                        iP2 = 2048;
                                                                                                                        break;
                                                                                                                    case 2:
                                                                                                                        iP2 = 4;
                                                                                                                        break;
                                                                                                                    case 3:
                                                                                                                        iP2 = 8;
                                                                                                                        break;
                                                                                                                    case 4:
                                                                                                                        iP2 = 1;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        iP2 = 0;
                                                                                                                        break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iP2 = 0;
                                                                                                            }
                                                                                                        }
                                                                                                        i7++;
                                                                                                        str19 = str718;
                                                                                                        str23 = str811;
                                                                                                        arrayList16 = arrayList617;
                                                                                                        arrayList15 = arrayList616;
                                                                                                    }
                                                                                                    i8 = iP2 | i8;
                                                                                                    i7++;
                                                                                                    str19 = str718;
                                                                                                    str23 = str811;
                                                                                                    arrayList16 = arrayList617;
                                                                                                    arrayList15 = arrayList616;
                                                                                                }
                                                                                                ArrayList arrayList618 = arrayList16;
                                                                                                arrayList38 = arrayList15;
                                                                                                String str812 = str19;
                                                                                                int iQ4 = iP | i8 | q(arrayList18) | q(arrayList19);
                                                                                                i9 = 0;
                                                                                                while (true) {
                                                                                                    if (i9 < arrayList18.size()) {
                                                                                                        c2343Co3 = (C2343Co) arrayList18.get(i9);
                                                                                                        if (FW.C("http://dashif.org/thumbnail_tile", c2343Co3.f2943a)) {
                                                                                                            str26 = c2343Co3.b;
                                                                                                            if (str26 != null) {
                                                                                                                int i313 = Ug0.f3833a;
                                                                                                                String[] strArrSplit7 = str26.split("x", -1);
                                                                                                                if (strArrSplit7.length == 2) {
                                                                                                                }
                                                                                                            }
                                                                                                            i17 = 1;
                                                                                                        } else {
                                                                                                            str26 = c2343Co3.b;
                                                                                                            if (str26 != null) {
                                                                                                                int i314 = Ug0.f3833a;
                                                                                                                String[] strArrSplit8 = str26.split("x", -1);
                                                                                                                if (strArrSplit8.length == 2) {
                                                                                                                }
                                                                                                            }
                                                                                                            i17 = 1;
                                                                                                        }
                                                                                                        i9 += i17;
                                                                                                    }
                                                                                                }
                                                                                                c4531rw = new C4531rw();
                                                                                                c4531rw.f4954a = str68;
                                                                                                c4531rw.j = str20;
                                                                                                c4531rw.k = strE;
                                                                                                c4531rw.h = str22;
                                                                                                c4531rw.g = i;
                                                                                                c4531rw.d = i5;
                                                                                                c4531rw.e = iQ4;
                                                                                                String str813 = str13;
                                                                                                c4531rw.c = str813;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue = ((Integer) pairCreate.first).intValue();
                                                                                                } else {
                                                                                                    iIntValue = -1;
                                                                                                }
                                                                                                c4531rw.D = iIntValue;
                                                                                                if (pairCreate != null) {
                                                                                                    iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                                                                } else {
                                                                                                    iIntValue2 = -1;
                                                                                                }
                                                                                                c4531rw.E = iIntValue2;
                                                                                                if (AbstractC5011xP.m(strE)) {
                                                                                                    c4531rw.p = iK6;
                                                                                                    c4531rw.q = iK7;
                                                                                                    c4531rw.r = fJ2;
                                                                                                } else if (AbstractC5011xP.k(strE)) {
                                                                                                    c4531rw.x = i3;
                                                                                                    c4531rw.y = iK8;
                                                                                                } else if (AbstractC5011xP.l(strE)) {
                                                                                                    if (MimeTypes.APPLICATION_CEA608.equals(strE)) {
                                                                                                        i13 = 0;
                                                                                                        while (true) {
                                                                                                            if (i13 < arrayList38.size()) {
                                                                                                                c2343Co2 = (C2343Co) arrayList38.get(i13);
                                                                                                                if ("urn:scte:dash:cc:cea-608:2015".equals(c2343Co2.f2943a)) {
                                                                                                                    i14 = 1;
                                                                                                                } else {
                                                                                                                    i14 = 1;
                                                                                                                }
                                                                                                                i13 += i14;
                                                                                                            } else {
                                                                                                                i12 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if (MimeTypes.APPLICATION_CEA708.equals(strE)) {
                                                                                                        i10 = 0;
                                                                                                        while (true) {
                                                                                                            if (i10 < arrayList38.size()) {
                                                                                                                c2343Co = (C2343Co) arrayList38.get(i10);
                                                                                                                if ("urn:scte:dash:cc:cea-708:2015".equals(c2343Co.f2943a)) {
                                                                                                                    i11 = 1;
                                                                                                                } else {
                                                                                                                    i11 = 1;
                                                                                                                }
                                                                                                                i10 += i11;
                                                                                                            } else {
                                                                                                                i12 = -1;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i12 = -1;
                                                                                                    }
                                                                                                    c4531rw.C = i12;
                                                                                                } else if ("image".equals(AbstractC5011xP.h(strE))) {
                                                                                                    c4531rw.p = iK6;
                                                                                                    c4531rw.q = iK7;
                                                                                                }
                                                                                                C4619sw c4619sw5 = new C4619sw(c4531rw);
                                                                                                if (abstractC3139c40T3 != null) {
                                                                                                    c3051b40 = abstractC3139c40T3;
                                                                                                } else {
                                                                                                    c3051b40 = new C3051b40(null, 1L, 0L, 0L, 0L);
                                                                                                }
                                                                                                if (arrayList13.isEmpty()) {
                                                                                                    arrayList21 = arrayList13;
                                                                                                } else {
                                                                                                    arrayList21 = arrayList14;
                                                                                                }
                                                                                                C2702Qk c2702Qk4 = new C2702Qk(c4619sw5, arrayList21, c3051b40, str812, arrayList618, arrayList5110, arrayList18, arrayList19);
                                                                                                i15 = AbstractC5011xP.i(c4619sw5.l);
                                                                                                i16 = i2;
                                                                                                if (i16 == -1) {
                                                                                                    i16 = i15;
                                                                                                } else if (i15 != -1) {
                                                                                                    if (i16 == i15) {
                                                                                                        z2 = true;
                                                                                                    } else {
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                    FW.s(z2);
                                                                                                }
                                                                                                ArrayList arrayList619 = arrayList12;
                                                                                                arrayList619.add(c2702Qk4);
                                                                                                xmlPullParser2 = xmlPullParser;
                                                                                                arrayList42 = arrayList619;
                                                                                                str54 = str813;
                                                                                                i29 = i16;
                                                                                                str46 = str16;
                                                                                                arrayList10 = arrayList615;
                                                                                                str9 = str11;
                                                                                                str49 = str12;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        arrayList50 = arrayList16;
                                                                                        ArrayList arrayList71 = arrayList15;
                                                                                        str61 = str17;
                                                                                        arrayList51 = arrayList17;
                                                                                        str58 = str58;
                                                                                        arrayList52 = arrayList18;
                                                                                        arrayList53 = arrayList19;
                                                                                        iC2 = i3;
                                                                                        str60 = str60;
                                                                                        str64 = str51;
                                                                                        str59 = str35;
                                                                                        arrayList8 = arrayList8;
                                                                                        j12 = j12;
                                                                                        i33 = i28;
                                                                                        arrayList49 = arrayList43;
                                                                                        str71 = str19;
                                                                                        z = z;
                                                                                        str56 = str14;
                                                                                        str34 = str34;
                                                                                        i30 = i2;
                                                                                        jD5 = j4;
                                                                                        arrayList40 = arrayList40;
                                                                                        str44 = str11;
                                                                                        str66 = str53;
                                                                                        arrayList37 = arrayList9;
                                                                                        str47 = str47;
                                                                                        arrayList42 = arrayList12;
                                                                                        str54 = str13;
                                                                                        i32 = i;
                                                                                        arrayList36 = arrayList36;
                                                                                        iK8 = iK8;
                                                                                        str57 = str18;
                                                                                        str65 = str15;
                                                                                        i36 = i27;
                                                                                        arrayList54 = arrayList13;
                                                                                        str46 = str16;
                                                                                        arrayList55 = arrayList44;
                                                                                        str67 = str50;
                                                                                        arrayList27 = arrayList27;
                                                                                        str70 = str52;
                                                                                        str49 = str12;
                                                                                        str = str;
                                                                                        str42 = str42;
                                                                                        arrayList4 = arrayList4;
                                                                                        arrayListD0 = arrayListD0;
                                                                                        arrayList48 = arrayList71;
                                                                                        xmlPullParser2 = xmlPullParser;
                                                                                        String str814 = str48;
                                                                                        str68 = str68;
                                                                                        arrayList11 = arrayList14;
                                                                                        str69 = str43;
                                                                                        str48 = str814;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                int i40 = i29;
                                                                                arrayList40 = arrayList40;
                                                                                str34 = str34;
                                                                                arrayList36 = arrayList36;
                                                                                str45 = str45;
                                                                                j12 = j12;
                                                                                arrayListD0 = arrayListD0;
                                                                                str42 = str42;
                                                                                str44 = str44;
                                                                                str = str;
                                                                                str47 = str47;
                                                                                arrayList4 = arrayList4;
                                                                                String str90 = str49;
                                                                                str50 = str50;
                                                                                arrayList9 = arrayList37;
                                                                                i26 = i26;
                                                                                f3 = f3;
                                                                                str51 = str51;
                                                                                i27 = i27;
                                                                                arrayList42 = arrayList42;
                                                                                str53 = str53;
                                                                                str35 = str59;
                                                                                arrayList8 = arrayList8;
                                                                                arrayList10 = arrayList45;
                                                                                arrayList43 = arrayList43;
                                                                                arrayList44 = arrayList47;
                                                                                str54 = str54;
                                                                                z = z;
                                                                                XmlPullParser xmlPullParser3 = xmlPullParser2;
                                                                                arrayList27 = arrayList27;
                                                                                String str91 = str46;
                                                                                str48 = str48;
                                                                                i28 = i28;
                                                                                str43 = str43;
                                                                                arrayList38 = arrayList38;
                                                                                if (AbstractC2995aW.Z(xmlPullParser3, str90)) {
                                                                                    abstractC3139c40T2 = r(xmlPullParser3, (C3051b40) abstractC3139c40T2);
                                                                                    str49 = str90;
                                                                                    i29 = i40;
                                                                                    xmlPullParser2 = xmlPullParser3;
                                                                                    str46 = str91;
                                                                                } else if (AbstractC2995aW.Z(xmlPullParser3, str48)) {
                                                                                    jD4 = d(xmlPullParser3, jD4);
                                                                                    str49 = str90;
                                                                                    i29 = i40;
                                                                                    abstractC3139c40T2 = s(xmlPullParser, (Y30) abstractC3139c40T2, j14, jI7, j17, jD4, jI4);
                                                                                    str48 = str48;
                                                                                    str46 = str91;
                                                                                    str54 = str54;
                                                                                    text = text;
                                                                                    j17 = j17;
                                                                                    str9 = str44;
                                                                                    arrayList37 = arrayList9;
                                                                                    xmlPullParser2 = xmlPullParser3;
                                                                                } else {
                                                                                    str49 = str90;
                                                                                    i29 = i40;
                                                                                    j3 = jD4;
                                                                                    if (AbstractC2995aW.Z(xmlPullParser3, str91)) {
                                                                                        jD4 = d(xmlPullParser3, j3);
                                                                                        str46 = str91;
                                                                                        str48 = str48;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        abstractC3139c40T2 = t(xmlPullParser, (Z30) abstractC3139c40T2, arrayList44, j14, jI7, j17, jD4, jI4);
                                                                                    } else {
                                                                                        str46 = str91;
                                                                                        xmlPullParser2 = xmlPullParser3;
                                                                                        if (AbstractC2995aW.Z(xmlPullParser2, "InbandEventStream")) {
                                                                                            str48 = str48;
                                                                                            arrayList37 = arrayList9;
                                                                                            arrayList37.add(h(xmlPullParser2, "InbandEventStream"));
                                                                                        } else {
                                                                                            arrayList37 = arrayList9;
                                                                                            if (AbstractC2995aW.Z(xmlPullParser2, "Label")) {
                                                                                                str48 = str48;
                                                                                                text = "";
                                                                                                do {
                                                                                                    xmlPullParser.next();
                                                                                                    if (xmlPullParser.getEventType() == 4) {
                                                                                                        text = xmlPullParser.getText();
                                                                                                    } else {
                                                                                                        b(xmlPullParser);
                                                                                                    }
                                                                                                } while (!AbstractC2995aW.W(xmlPullParser2, "Label"));
                                                                                                jD4 = j3;
                                                                                                str54 = str54;
                                                                                            } else if (AbstractC2995aW.Y(xmlPullParser)) {
                                                                                                str48 = str48;
                                                                                                b(xmlPullParser);
                                                                                            }
                                                                                            j17 = j17;
                                                                                            str9 = str44;
                                                                                        }
                                                                                        str48 = str48;
                                                                                        jD4 = j3;
                                                                                        str54 = str54;
                                                                                        text = text;
                                                                                        j17 = j17;
                                                                                        str9 = str44;
                                                                                    }
                                                                                }
                                                                                str54 = str54;
                                                                                str9 = str44;
                                                                            }
                                                                            arrayList37 = arrayList9;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            arrayList44 = arrayList44;
                                                            arrayList10 = arrayList39;
                                                            j3 = jD4;
                                                            str48 = str48;
                                                            jD4 = j3;
                                                            str54 = str54;
                                                            text = text;
                                                            j17 = j17;
                                                            str9 = str44;
                                                        }
                                                        if (AbstractC2995aW.W(xmlPullParser2, str9)) {
                                                            arrayList22 = new ArrayList(arrayList42.size());
                                                            i20 = 0;
                                                            while (i20 < arrayList42.size()) {
                                                                arrayList23 = arrayList42;
                                                                C2702Qk c2702Qk5 = (C2702Qk) arrayList23.get(i20);
                                                                c4531rwA = c2702Qk5.f3621a.a();
                                                                if (text != null) {
                                                                    c4531rwA.b = text;
                                                                }
                                                                str30 = c2702Qk5.d;
                                                                if (str30 == null) {
                                                                    str30 = str55;
                                                                }
                                                                arrayList24 = c2702Qk5.e;
                                                                ArrayList arrayList72 = arrayList36;
                                                                arrayList24.addAll(arrayList72);
                                                                if (arrayList24.isEmpty()) {
                                                                    str31 = text;
                                                                    arrayList42 = arrayList23;
                                                                } else {
                                                                    i21 = 0;
                                                                    while (true) {
                                                                        if (i21 < arrayList24.size()) {
                                                                            schemeData4 = (DrmInitData.SchemeData) arrayList24.get(i21);
                                                                            if (AbstractC4147nc.c.equals(schemeData4.uuid) || (str32 = schemeData4.licenseServerUrl) == null) {
                                                                                i21++;
                                                                            } else {
                                                                                arrayList24.remove(i21);
                                                                            }
                                                                        } else {
                                                                            str32 = null;
                                                                        }
                                                                    }
                                                                    if (str32 != null) {
                                                                        i22 = 0;
                                                                        while (i22 < arrayList24.size()) {
                                                                            schemeData = (DrmInitData.SchemeData) arrayList24.get(i22);
                                                                            String str92 = text;
                                                                            if (!AbstractC4147nc.b.equals(schemeData.uuid) && schemeData.licenseServerUrl == null) {
                                                                                arrayList24.set(i22, new DrmInitData.SchemeData(AbstractC4147nc.c, str32, schemeData.mimeType, schemeData.data));
                                                                            }
                                                                            i22++;
                                                                            text = str92;
                                                                            arrayList23 = arrayList23;
                                                                        }
                                                                    }
                                                                    str31 = text;
                                                                    arrayList42 = arrayList23;
                                                                    for (size = arrayList24.size() - 1; size >= 0; size--) {
                                                                        schemeData2 = (DrmInitData.SchemeData) arrayList24.get(size);
                                                                        if (schemeData2.data == null) {
                                                                            for (i23 = 0; i23 < arrayList24.size(); i23++) {
                                                                                schemeData3 = (DrmInitData.SchemeData) arrayList24.get(i23);
                                                                                if (schemeData3.data == null && schemeData2.data == null && schemeData3.b(schemeData2.uuid)) {
                                                                                    arrayList24.remove(size);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    c4531rwA.n = new DrmInitData(str30, arrayList24);
                                                                }
                                                                arrayList25 = c2702Qk5.f;
                                                                arrayList25.addAll(arrayList37);
                                                                c4619sw = new C4619sw(c4531rwA);
                                                                abstractC3139c40 = c2702Qk5.c;
                                                                z3 = abstractC3139c40 instanceof C3051b40;
                                                                j5 = c2702Qk5.g;
                                                                ac = c2702Qk5.b;
                                                                list = c2702Qk5.h;
                                                                list2 = c2702Qk5.i;
                                                                if (z3) {
                                                                    dy = new EY(j5, c4619sw, ac, (C3051b40) abstractC3139c40, arrayList25, list, list2);
                                                                } else {
                                                                    if (abstractC3139c40 instanceof X30) {
                                                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                    }
                                                                    dy = new DY(j5, c4619sw, ac, (X30) abstractC3139c40, arrayList25, list, list2);
                                                                }
                                                                arrayList22.add(dy);
                                                                i20++;
                                                                arrayList36 = arrayList72;
                                                                text = str31;
                                                            }
                                                            arrayList34.add(new X2(iK, i29, arrayList22, arrayList38, arrayList40, arrayList44));
                                                            str3 = str41;
                                                            arrayList5 = arrayList32;
                                                            str4 = str53;
                                                            str2 = str47;
                                                            str5 = str42;
                                                            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                                            arrayList3 = arrayList34;
                                                        } else {
                                                            arrayList37 = arrayList37;
                                                            arrayList38 = arrayList38;
                                                            xmlPullParser2 = xmlPullParser2;
                                                            i27 = i27;
                                                            str35 = str35;
                                                            arrayList35 = arrayList8;
                                                            i29 = i29;
                                                            j12 = j12;
                                                            text = text;
                                                            i28 = i28;
                                                            arrayList44 = arrayList44;
                                                            arrayList43 = arrayList43;
                                                            str50 = str50;
                                                            arrayList27 = arrayList27;
                                                            z = z;
                                                            str34 = str34;
                                                            str45 = str45;
                                                            f3 = f3;
                                                            arrayList40 = arrayList40;
                                                            str53 = str53;
                                                            str47 = str47;
                                                            str = str;
                                                            arrayList42 = arrayList42;
                                                            str42 = str42;
                                                            arrayList36 = arrayList36;
                                                            str46 = str46;
                                                            str49 = str49;
                                                            str51 = str51;
                                                            arrayList4 = arrayList4;
                                                            arrayList39 = arrayList10;
                                                            str44 = str9;
                                                            arrayListD0 = arrayListD0;
                                                            str43 = str43;
                                                            str48 = str48;
                                                            i26 = i26;
                                                        }
                                                    }
                                                    arrayList8 = arrayList8;
                                                    j17 = j17;
                                                    i29 = i29;
                                                }
                                                z = z;
                                                xmlPullParser2 = xmlPullParser2;
                                                str48 = str48;
                                                arrayList37 = arrayList37;
                                                str43 = str43;
                                                arrayList38 = arrayList38;
                                                str9 = str44;
                                                arrayList10 = arrayList39;
                                                str49 = str49;
                                                arrayList27 = arrayList27;
                                                if (AbstractC2995aW.W(xmlPullParser2, str9)) {
                                                    arrayList22 = new ArrayList(arrayList42.size());
                                                    i20 = 0;
                                                    while (i20 < arrayList42.size()) {
                                                        arrayList23 = arrayList42;
                                                        C2702Qk c2702Qk6 = (C2702Qk) arrayList23.get(i20);
                                                        c4531rwA = c2702Qk6.f3621a.a();
                                                        if (text != null) {
                                                            c4531rwA.b = text;
                                                        }
                                                        str30 = c2702Qk6.d;
                                                        if (str30 == null) {
                                                            str30 = str55;
                                                        }
                                                        arrayList24 = c2702Qk6.e;
                                                        ArrayList arrayList73 = arrayList36;
                                                        arrayList24.addAll(arrayList73);
                                                        if (arrayList24.isEmpty()) {
                                                            i21 = 0;
                                                            while (true) {
                                                                if (i21 < arrayList24.size()) {
                                                                    schemeData4 = (DrmInitData.SchemeData) arrayList24.get(i21);
                                                                    if (AbstractC4147nc.c.equals(schemeData4.uuid)) {
                                                                    }
                                                                    i21++;
                                                                } else {
                                                                    str32 = null;
                                                                }
                                                            }
                                                            if (str32 != null) {
                                                                i22 = 0;
                                                                while (i22 < arrayList24.size()) {
                                                                    schemeData = (DrmInitData.SchemeData) arrayList24.get(i22);
                                                                    String str93 = text;
                                                                    if (!AbstractC4147nc.b.equals(schemeData.uuid)) {
                                                                    }
                                                                    i22++;
                                                                    text = str93;
                                                                    arrayList23 = arrayList23;
                                                                }
                                                            }
                                                            str31 = text;
                                                            arrayList42 = arrayList23;
                                                            while (size >= 0) {
                                                                schemeData2 = (DrmInitData.SchemeData) arrayList24.get(size);
                                                                if (schemeData2.data == null) {
                                                                    while (i23 < arrayList24.size()) {
                                                                        schemeData3 = (DrmInitData.SchemeData) arrayList24.get(i23);
                                                                        if (schemeData3.data == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            c4531rwA.n = new DrmInitData(str30, arrayList24);
                                                        } else {
                                                            str31 = text;
                                                            arrayList42 = arrayList23;
                                                        }
                                                        arrayList25 = c2702Qk6.f;
                                                        arrayList25.addAll(arrayList37);
                                                        c4619sw = new C4619sw(c4531rwA);
                                                        abstractC3139c40 = c2702Qk6.c;
                                                        z3 = abstractC3139c40 instanceof C3051b40;
                                                        j5 = c2702Qk6.g;
                                                        ac = c2702Qk6.b;
                                                        list = c2702Qk6.h;
                                                        list2 = c2702Qk6.i;
                                                        if (z3) {
                                                            dy = new EY(j5, c4619sw, ac, (C3051b40) abstractC3139c40, arrayList25, list, list2);
                                                        } else {
                                                            if (abstractC3139c40 instanceof X30) {
                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                            }
                                                            dy = new DY(j5, c4619sw, ac, (X30) abstractC3139c40, arrayList25, list, list2);
                                                        }
                                                        arrayList22.add(dy);
                                                        i20++;
                                                        arrayList36 = arrayList73;
                                                        text = str31;
                                                    }
                                                    arrayList34.add(new X2(iK, i29, arrayList22, arrayList38, arrayList40, arrayList44));
                                                    str3 = str41;
                                                    arrayList5 = arrayList32;
                                                    str4 = str53;
                                                    str2 = str47;
                                                    str5 = str42;
                                                    j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                                    arrayList3 = arrayList34;
                                                } else {
                                                    arrayList37 = arrayList37;
                                                    arrayList38 = arrayList38;
                                                    xmlPullParser2 = xmlPullParser2;
                                                    i27 = i27;
                                                    str35 = str35;
                                                    arrayList35 = arrayList8;
                                                    i29 = i29;
                                                    j12 = j12;
                                                    text = text;
                                                    i28 = i28;
                                                    arrayList44 = arrayList44;
                                                    arrayList43 = arrayList43;
                                                    str50 = str50;
                                                    arrayList27 = arrayList27;
                                                    z = z;
                                                    str34 = str34;
                                                    str45 = str45;
                                                    f3 = f3;
                                                    arrayList40 = arrayList40;
                                                    str53 = str53;
                                                    str47 = str47;
                                                    str = str;
                                                    arrayList42 = arrayList42;
                                                    str42 = str42;
                                                    arrayList36 = arrayList36;
                                                    str46 = str46;
                                                    str49 = str49;
                                                    str51 = str51;
                                                    arrayList4 = arrayList4;
                                                    arrayList39 = arrayList10;
                                                    str44 = str9;
                                                    arrayListD0 = arrayListD0;
                                                    str43 = str43;
                                                    str48 = str48;
                                                    i26 = i26;
                                                }
                                            }
                                        } else {
                                            arrayList27 = arrayList27;
                                            str34 = str34;
                                            String str94 = str40;
                                            str = str39;
                                            str2 = str38;
                                            z = z;
                                            arrayList2 = arrayList33;
                                            j12 = j12;
                                            arrayListD0 = arrayListD0;
                                            String str95 = str42;
                                            arrayList3 = arrayList34;
                                            arrayList4 = arrayList30;
                                            str35 = str35;
                                            xmlPullParser2 = xmlPullParser2;
                                            if (AbstractC2995aW.Z(xmlPullParser2, "EventStream")) {
                                                String str96 = str2;
                                                String attributeValue17 = xmlPullParser2.getAttributeValue(null, str96);
                                                if (attributeValue17 == null) {
                                                    attributeValue17 = "";
                                                }
                                                String attributeValue18 = xmlPullParser2.getAttributeValue(null, str95);
                                                String str97 = attributeValue18 == null ? "" : attributeValue18;
                                                long jM4 = m(xmlPullParser2, "timescale", 1L);
                                                long j19 = 0;
                                                long jM5 = m(xmlPullParser2, "presentationTimeOffset", 0L);
                                                ArrayList arrayList74 = new ArrayList();
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                                                while (true) {
                                                    xmlPullParser.next();
                                                    String str98 = "Event";
                                                    if (AbstractC2995aW.Z(xmlPullParser2, "Event")) {
                                                        String str99 = str94;
                                                        long jM6 = m(xmlPullParser2, str99, j19);
                                                        String str100 = str41;
                                                        long jM7 = m(xmlPullParser2, str100, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                                        long jM8 = m(xmlPullParser2, "presentationTime", j19);
                                                        long jR = Ug0.R(jM7, 1000L, jM4);
                                                        long jR2 = Ug0.R(jM8 - jM5, 1000000L, jM4);
                                                        String attributeValue19 = xmlPullParser2.getAttributeValue(null, "messageData");
                                                        if (attributeValue19 == null) {
                                                            attributeValue19 = null;
                                                        }
                                                        byteArrayOutputStream.reset();
                                                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, AbstractC2333Ce.c.name());
                                                        xmlPullParser.nextToken();
                                                        while (!AbstractC2995aW.W(xmlPullParser2, str98)) {
                                                            switch (xmlPullParser.getEventType()) {
                                                                case 0:
                                                                    str98 = str98;
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                                                                    break;
                                                                case 1:
                                                                    str98 = str98;
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    xmlSerializerNewSerializer.endDocument();
                                                                    break;
                                                                case 2:
                                                                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    int i41 = 0;
                                                                    while (i41 < xmlPullParser.getAttributeCount()) {
                                                                        xmlSerializerNewSerializer.attribute(xmlPullParser2.getAttributeNamespace(i41), xmlPullParser2.getAttributeName(i41), xmlPullParser2.getAttributeValue(i41));
                                                                        i41++;
                                                                        arrayList74 = arrayList74;
                                                                        str96 = str96;
                                                                    }
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 3:
                                                                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 4:
                                                                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 5:
                                                                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 6:
                                                                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 7:
                                                                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 8:
                                                                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 9:
                                                                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                case 10:
                                                                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                                default:
                                                                    arrayList7 = arrayList74;
                                                                    str8 = str96;
                                                                    break;
                                                            }
                                                            xmlPullParser.nextToken();
                                                            str98 = str98;
                                                            arrayList74 = arrayList7;
                                                            str96 = str8;
                                                        }
                                                        ArrayList arrayList75 = arrayList74;
                                                        str7 = str96;
                                                        xmlSerializerNewSerializer.flush();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        Long lValueOf = Long.valueOf(jR2);
                                                        if (attributeValue19 != null) {
                                                            byteArray = attributeValue19.getBytes(AbstractC2333Ce.c);
                                                        }
                                                        str3 = str100;
                                                        str4 = str99;
                                                        j2 = 0;
                                                        arrayList6 = arrayList75;
                                                        arrayList6.add(Pair.create(lValueOf, new EventMessage(attributeValue17, str97, jR, jM6, byteArray)));
                                                    } else {
                                                        j2 = j19;
                                                        arrayList6 = arrayList74;
                                                        str7 = str96;
                                                        str3 = str41;
                                                        str4 = str94;
                                                        b(xmlPullParser);
                                                    }
                                                    if (AbstractC2995aW.W(xmlPullParser2, "EventStream")) {
                                                        long[] jArr = new long[arrayList6.size()];
                                                        EventMessage[] eventMessageArr = new EventMessage[arrayList6.size()];
                                                        for (int i42 = 0; i42 < arrayList6.size(); i42++) {
                                                            Pair pair = (Pair) arrayList6.get(i42);
                                                            jArr[i42] = ((Long) pair.first).longValue();
                                                            eventMessageArr[i42] = (EventMessage) pair.second;
                                                        }
                                                        ArrayList arrayList76 = arrayList32;
                                                        arrayList76.add(new C3650hs(attributeValue17, str97, jArr, eventMessageArr));
                                                        str5 = str95;
                                                        arrayList5 = arrayList76;
                                                        str2 = str7;
                                                        j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                                    } else {
                                                        arrayList74 = arrayList6;
                                                        arrayList3 = arrayList3;
                                                        str41 = str3;
                                                        str94 = str4;
                                                        byteArrayOutputStream = byteArrayOutputStream;
                                                        j19 = j2;
                                                        str96 = str7;
                                                    }
                                                }
                                            } else {
                                                str3 = str41;
                                                str4 = str94;
                                                str5 = str95;
                                                arrayList3 = arrayList3;
                                                arrayList5 = arrayList32;
                                                if (AbstractC2995aW.Z(xmlPullParser2, "SegmentBase")) {
                                                    abstractC3139c40T = r(xmlPullParser2, null);
                                                } else if (AbstractC2995aW.Z(xmlPullParser2, "SegmentList")) {
                                                    long jD8 = d(xmlPullParser2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                                    abstractC3139c40T = s(xmlPullParser, null, j14, jI7, jD3, jD8, jI4);
                                                    j16 = jD8;
                                                } else {
                                                    str5 = str5;
                                                    str2 = str2;
                                                    if (AbstractC2995aW.Z(xmlPullParser2, "SegmentTemplate")) {
                                                        long jD9 = d(xmlPullParser2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                                                        C5086yC c5086yC = AC.b;
                                                        j = -9223372036854775807L;
                                                        arrayList5 = arrayList5;
                                                        abstractC3139c40T = t(xmlPullParser, null, C3965lY.e, j14, jI7, jD3, jD9, jI4);
                                                        j16 = jD9;
                                                    } else {
                                                        arrayList5 = arrayList5;
                                                        j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                                        if (AbstractC2995aW.Z(xmlPullParser2, "AssetIdentifier")) {
                                                            h(xmlPullParser2, "AssetIdentifier");
                                                        } else {
                                                            b(xmlPullParser);
                                                        }
                                                    }
                                                }
                                                str6 = str;
                                                j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                            }
                                        }
                                        jD3 = jD3;
                                        str6 = str;
                                    }
                                    if (AbstractC2995aW.W(xmlPullParser2, str6)) {
                                        Pair pairCreate2 = Pair.create(new C3259dU(attributeValue8, jI6, arrayList3, arrayList5), Long.valueOf(jI7));
                                        C3259dU c3259dU = (C3259dU) pairCreate2.first;
                                        if (c3259dU.b != j) {
                                            long jLongValue = ((Long) pairCreate2.second).longValue();
                                            j7 = jLongValue == j ? j : c3259dU.b + jLongValue;
                                            arrayList26 = arrayList;
                                            arrayList26.add(c3259dU);
                                        } else {
                                            if (!zEquals2) {
                                                throw KT.b("Unable to determine start of period " + arrayList.size(), null);
                                            }
                                            j7 = j15;
                                            arrayList26 = arrayList;
                                            z5 = true;
                                        }
                                    } else {
                                        str39 = str6;
                                        str38 = str2;
                                        arrayList31 = arrayList3;
                                        str35 = str35;
                                        arrayList32 = arrayList5;
                                        arrayList30 = arrayList4;
                                        str41 = str3;
                                        j12 = j12;
                                        str40 = str4;
                                        arrayList29 = arrayList;
                                        arrayList27 = arrayList27;
                                        z = z;
                                        str34 = str34;
                                        str42 = str5;
                                        xmlPullParser2 = xmlPullParser2;
                                        arrayListD0 = arrayListD0;
                                        arrayList33 = arrayList2;
                                    }
                                }
                            }
                            jD2 = j12;
                        }
                        if (AbstractC2995aW.W(xmlPullParser2, "MPD")) {
                            if (jI == j) {
                                if (j7 != j) {
                                    jI = j7;
                                } else if (!zEquals2) {
                                    throw KT.b("Unable to determine duration of static manifest.", null);
                                }
                            }
                            if (arrayList26.isEmpty()) {
                                throw KT.b("No periods found.", null);
                            }
                            return new C2676Pk(jO, jI, jI2, zEquals2, jI3, jI4, jI5, jO2, zv, ig0, c3076bO, uriX, arrayList26);
                        }
                        arrayList26 = arrayList26;
                        xmlPullParser2 = xmlPullParser2;
                        arrayListD0 = arrayListD0;
                        arrayList27 = arrayList27;
                        z = z;
                        str33 = null;
                        i24 = 0;
                        j7 = j7;
                        j6 = j;
                    }
                }
                j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
            xmlPullParser2 = xmlPullParser2;
            if (AbstractC2995aW.W(xmlPullParser2, "MPD")) {
                if (jI == j) {
                    if (j7 != j) {
                        jI = j7;
                    } else if (!zEquals2) {
                        throw KT.b("Unable to determine duration of static manifest.", null);
                    }
                }
                if (arrayList26.isEmpty()) {
                    return new C2676Pk(jO, jI, jI2, zEquals2, jI3, jI4, jI5, jO2, zv, ig0, c3076bO, uriX, arrayList26);
                }
                throw KT.b("No periods found.", null);
            }
            arrayList26 = arrayList26;
            xmlPullParser2 = xmlPullParser2;
            arrayListD0 = arrayListD0;
            arrayList27 = arrayList27;
            z = z;
            str33 = null;
            i24 = 0;
            j7 = j7;
            j6 = j;
        }
    }

    public static C3614hX o(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new C3614hX(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return new C3614hX(attributeValue, j, j2);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (FW.C("http://dashif.org/guidelines/trickmode", ((C2343Co) arrayList.get(i2)).f2943a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static C3051b40 r(XmlPullParser xmlPullParser, C3051b40 c3051b40) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long jM = m(xmlPullParser, "timescale", c3051b40 != null ? c3051b40.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", c3051b40 != null ? c3051b40.c : 0L);
        long j3 = c3051b40 != null ? c3051b40.d : 0L;
        long j4 = c3051b40 != null ? c3051b40.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        C3614hX c3614hXO = c3051b40 != null ? c3051b40.f4203a : null;
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, "Initialization")) {
                c3614hXO = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC2995aW.W(xmlPullParser, "SegmentBase"));
        return new C3051b40(c3614hXO, jM, jM2, j2, j);
    }

    public static Y30 s(XmlPullParser xmlPullParser, Y30 y30, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jM = m(xmlPullParser, "timescale", y30 != null ? y30.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", y30 != null ? y30.c : 0L);
        long jM3 = m(xmlPullParser, "duration", y30 != null ? y30.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", y30 != null ? y30.d : 1L);
        long j6 = j4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        C3614hX c3614hXO = null;
        List listU = null;
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, "Initialization")) {
                c3614hXO = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC2995aW.Z(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else if (AbstractC2995aW.Z(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC2995aW.W(xmlPullParser, "SegmentList"));
        if (y30 != null) {
            if (c3614hXO == null) {
                c3614hXO = y30.f4203a;
            }
            if (listU == null) {
                listU = y30.f;
            }
            if (arrayList == null) {
                arrayList = y30.j;
            }
        }
        return new Y30(c3614hXO, jM, jM2, jM4, jM3, listU, j7, arrayList, Ug0.L(j5), Ug0.L(j));
    }

    public static Z30 t(XmlPullParser xmlPullParser, Z30 z30, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long jM = m(xmlPullParser, "timescale", z30 != null ? z30.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", z30 != null ? z30.c : 0L);
        long jM3 = m(xmlPullParser, "duration", z30 != null ? z30.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", z30 != null ? z30.d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C2343Co c2343Co = (C2343Co) list.get(i);
            if (FW.C("http://dashif.org/guidelines/last-segment-number", c2343Co.f2943a)) {
                j6 = Long.parseLong(c2343Co.b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        C3614hX c3614hXO = null;
        BR brV = v(xmlPullParser, "media", z30 != null ? z30.k : null);
        BR brV2 = v(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, z30 != null ? z30.j : null);
        List listU = null;
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, "Initialization")) {
                c3614hXO = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC2995aW.Z(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC2995aW.W(xmlPullParser, "SegmentTemplate"));
        if (z30 != null) {
            if (c3614hXO == null) {
                c3614hXO = z30.f4203a;
            }
            if (listU == null) {
                listU = z30.f;
            }
        }
        return new Z30(c3614hXO, jM, jM2, jM4, j7, jM3, listU, j9, brV2, brV, Ug0.L(j5), Ug0.L(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long jM = -9223372036854775807L;
        boolean z = false;
        int iK = 0;
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long jM2 = m(xmlPullParser, com.umeng.analytics.pro.bc.aO, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                if (z) {
                    jA = a(arrayList, jA, jM, iK, jM2);
                }
                if (jM2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    jM2 = jA;
                }
                jM = m(xmlPullParser, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                iK = k(xmlPullParser, "r", 0);
                jA = jM2;
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC2995aW.W(xmlPullParser, "SegmentTimeline"));
        if (z) {
            a(arrayList, jA, jM, iK, Ug0.R(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00c6. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.String[]] */
    public static BR v(XmlPullParser xmlPullParser, String str, BR br) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return br;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        ?? r1 = new String[4];
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + attributeValue.substring(length);
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + attributeValue.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                strArr[i] = DM.m(new StringBuilder(), strArr[i], "$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i2);
                String strSubstring2 = attributeValue.substring(i2, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    r1[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return new BR(strArr, iArr, (Serializable) r1, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LT
    public final Object l(Uri uri, C4692tl c4692tl) throws KT {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f3674a.newPullParser();
            xmlPullParserNewPullParser.setInput(c4692tl, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return n(xmlPullParserNewPullParser, uri);
            }
            throw KT.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw KT.b(null, e2);
        }
    }
}

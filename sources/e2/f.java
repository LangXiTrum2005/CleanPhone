package e2;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import i1.e0;
import i1.o;
import i1.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l1.y;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.unity3d.scar.adapter.common.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f39049e;

    public static ArrayList p(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] bArrU = y.u(str);
            byte[] bArr2 = l1.c.f44778a;
            if (bArrU.length > 4) {
                int i10 = 0;
                while (true) {
                    byte[] bArr3 = l1.c.f44778a;
                    if (i10 >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i11));
                            i11 += 4;
                            int length = bArrU.length - 4;
                            while (true) {
                                if (i11 > length) {
                                    i11 = -1;
                                    break;
                                }
                                if (bArrU.length - i11 > 4) {
                                    int i12 = 0;
                                    while (true) {
                                        byte[] bArr4 = l1.c.f44778a;
                                        if (i12 >= 4) {
                                            break;
                                        }
                                        if (bArrU[i11 + i12] != bArr4[i12]) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                                i11++;
                            }
                        } while (i11 != -1);
                        byte[][] bArr5 = new byte[arrayList2.size()][];
                        int i13 = 0;
                        while (i13 < arrayList2.size()) {
                            int iIntValue = ((Integer) arrayList2.get(i13)).intValue();
                            int iIntValue2 = (i13 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i13 + 1)).intValue() : bArrU.length) - iIntValue;
                            byte[] bArr6 = new byte[iIntValue2];
                            System.arraycopy(bArrU, iIntValue, bArr6, 0, iIntValue2);
                            bArr5[i13] = bArr6;
                            i13++;
                        }
                        bArr = bArr5;
                        break;
                    }
                    if (bArrU[i10] != bArr3[i10]) {
                        bArr = null;
                        break;
                    }
                    i10++;
                }
            } else {
                bArr = null;
                break;
            }
            if (bArr == null) {
                arrayList.add(bArrU);
                return arrayList;
            }
            Collections.addAll(arrayList, bArr);
        }
        return arrayList;
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final Object e() {
        return this.f39049e;
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void m(XmlPullParser xmlPullParser) throws e0 {
        String str;
        o oVar = new o();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        int i10 = 0;
        if (attributeValue == null) {
            throw new d("FourCC", 0);
        }
        if (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) {
            str = "video/avc";
        } else if (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) {
            str = MimeTypes.AUDIO_AAC;
        } else if (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) {
            str = MimeTypes.APPLICATION_TTML;
        } else if (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) {
            str = MimeTypes.AUDIO_AC3;
        } else if (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) {
            str = MimeTypes.AUDIO_E_AC3;
        } else if (attributeValue.equalsIgnoreCase("dtsc")) {
            str = MimeTypes.AUDIO_DTS;
        } else if (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) {
            str = MimeTypes.AUDIO_DTS_HD;
        } else if (attributeValue.equalsIgnoreCase("dtse")) {
            str = MimeTypes.AUDIO_DTS_EXPRESS;
        } else {
            str = attributeValue.equalsIgnoreCase("opus") ? MimeTypes.AUDIO_OPUS : null;
        }
        int iIntValue = ((Integer) f("Type")).intValue();
        if (iIntValue == 2) {
            ArrayList arrayListP = p(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            oVar.l = d0.n(MimeTypes.VIDEO_MP4);
            oVar.f42607t = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "MaxWidth");
            oVar.f42608u = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "MaxHeight");
            oVar.f42603p = arrayListP;
        } else if (iIntValue == 1) {
            if (str == null) {
                str = MimeTypes.AUDIO_AAC;
            }
            int iL = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "Channels");
            int iL2 = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "SamplingRate");
            ArrayList arrayListP2 = p(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean zIsEmpty = arrayListP2.isEmpty();
            List listSingletonList = arrayListP2;
            if (zIsEmpty && MimeTypes.AUDIO_AAC.equals(str)) {
                listSingletonList = arrayListP2;
                listSingletonList = Collections.singletonList(n2.b.a(iL2, iL));
            }
            listSingletonList = arrayListP2;
            oVar.l = d0.n(MimeTypes.AUDIO_MP4);
            oVar.E = iL;
            oVar.F = iL2;
            oVar.f42603p = listSingletonList;
        } else if (iIntValue == 3) {
            String str2 = (String) f("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i10 = 64;
                } else if (str2.equals("DESC")) {
                    i10 = 1024;
                }
            }
            oVar.l = d0.n(MimeTypes.APPLICATION_MP4);
            oVar.f42594f = i10;
        } else {
            oVar.l = d0.n(MimeTypes.APPLICATION_MP4);
        }
        oVar.f42589a = xmlPullParser.getAttributeValue(null, "Index");
        oVar.f42590b = (String) f("Name");
        oVar.f42600m = d0.n(str);
        oVar.f42596h = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "Bitrate");
        oVar.f42592d = (String) f("Language");
        this.f39049e = new p(oVar);
    }
}

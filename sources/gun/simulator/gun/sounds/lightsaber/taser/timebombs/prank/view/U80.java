package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class U80 extends S80 {
    public C4619sw e;

    public static ArrayList m(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] bArrQ = Ug0.q(str);
            if (bArrQ.length > 4) {
                int i = 0;
                while (true) {
                    byte[] bArr2 = FW.f3068a;
                    if (i >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i2));
                            i2 += 4;
                            int length = bArrQ.length - 4;
                            while (true) {
                                if (i2 > length) {
                                    i2 = -1;
                                    break;
                                }
                                if (bArrQ.length - i2 > 4) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        if (bArrQ[i2 + i3] != bArr2[i3]) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                i2++;
                            }
                        } while (i2 != -1);
                        byte[][] bArr3 = new byte[arrayList2.size()][];
                        int i4 = 0;
                        while (i4 < arrayList2.size()) {
                            int iIntValue = ((Integer) arrayList2.get(i4)).intValue();
                            int iIntValue2 = (i4 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i4 + 1)).intValue() : bArrQ.length) - iIntValue;
                            byte[] bArr4 = new byte[iIntValue2];
                            System.arraycopy(bArrQ, iIntValue, bArr4, 0, iIntValue2);
                            bArr3[i4] = bArr4;
                            i4++;
                        }
                        bArr = bArr3;
                        break;
                    }
                    if (bArrQ[i] != bArr2[i]) {
                        bArr = null;
                        break;
                    }
                    i++;
                }
            } else {
                bArr = null;
                break;
            }
            if (bArr == null) {
                arrayList.add(bArrQ);
            } else {
                Collections.addAll(arrayList, bArr);
            }
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final Object b() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final void j(XmlPullParser xmlPullParser) throws KT {
        String str;
        int i;
        C4531rw c4531rw = new C4531rw();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new Ua0("FourCC", 1);
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
        int iIntValue = ((Integer) c("Type")).intValue();
        if (iIntValue == 2) {
            ArrayList arrayListM = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            c4531rw.j = MimeTypes.VIDEO_MP4;
            c4531rw.p = S80.i(xmlPullParser, "MaxWidth");
            c4531rw.q = S80.i(xmlPullParser, "MaxHeight");
            c4531rw.m = arrayListM;
        } else if (iIntValue == 1) {
            if (str == null) {
                str = MimeTypes.AUDIO_AAC;
            }
            int i2 = S80.i(xmlPullParser, "Channels");
            int i3 = S80.i(xmlPullParser, "SamplingRate");
            ArrayList arrayListM2 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean zIsEmpty = arrayListM2.isEmpty();
            List listSingletonList = arrayListM2;
            if (zIsEmpty && MimeTypes.AUDIO_AAC.equals(str)) {
                listSingletonList = arrayListM2;
                listSingletonList = Collections.singletonList(AbstractC2845Vx.L(i3, i2));
            }
            listSingletonList = arrayListM2;
            c4531rw.j = MimeTypes.AUDIO_MP4;
            c4531rw.x = i2;
            c4531rw.y = i3;
            c4531rw.m = listSingletonList;
        } else if (iIntValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 == null) {
                i = 0;
            } else if (str2.equals("CAPT")) {
                i = 64;
            } else if (str2.equals("DESC")) {
                i = 1024;
            } else {
                i = 0;
            }
            c4531rw.j = MimeTypes.APPLICATION_MP4;
            c4531rw.e = i;
        } else {
            c4531rw.j = MimeTypes.APPLICATION_MP4;
        }
        c4531rw.f4954a = xmlPullParser.getAttributeValue(null, "Index");
        c4531rw.b = (String) c("Name");
        c4531rw.k = str;
        c4531rw.f = S80.i(xmlPullParser, "Bitrate");
        c4531rw.c = (String) c("Language");
        this.e = new C4619sw(c4531rw);
    }
}

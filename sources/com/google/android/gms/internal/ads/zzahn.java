package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
final class zzahn {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzahm zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzfq.zzb(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzat.zzb("Couldn't find xmp metadata", null);
            }
            zzgtd zzgtdVarZzi = zzgtd.zzi();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzfq.zzb(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i2 = 0;
                    for (int i3 = 0; i3 < 4; i3++) {
                        String strZzc = zzfq.zzc(xmlPullParserNewPullParser, strArr[i3]);
                        if (strZzc != null) {
                            if (Integer.parseInt(strZzc) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i4 = 0;
                            while (true) {
                                if (i4 < 4) {
                                    String strZzc2 = zzfq.zzc(xmlPullParserNewPullParser, strArr2[i4]);
                                    if (strZzc2 != null) {
                                        j = Long.parseLong(strZzc2);
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
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i2 >= 2) {
                                    zzgtdVarZzi = zzgtd.zzi();
                                    break;
                                }
                                String strZzc3 = zzfq.zzc(xmlPullParserNewPullParser, strArr3[i2]);
                                if (strZzc3 != null) {
                                    zzgtdVarZzi = zzgtd.zzk(new zzahl("image/jpeg", "Primary", 0L, 0L), new zzahl("video/mp4", "MotionPhoto", Long.parseLong(strZzc3), 0L));
                                    break;
                                }
                                i2++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzfq.zzb(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgtdVarZzi = zzc(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzfq.zzb(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgtdVarZzi = zzc(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzfq.zza(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgtdVarZzi.isEmpty()) {
                return null;
            }
            return new zzahm(j2, zzgtdVarZzi);
        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
            zzee.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static boolean zzb(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i2 = 0; i2 < 4; i2++) {
            if (str.contains(String.valueOf(strArr[i2]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzgtd zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i2 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfq.zzb(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZzc = zzfq.zzc(xmlPullParser, strConcat2);
                String strZzc2 = zzfq.zzc(xmlPullParser, strConcat3);
                String strZzc3 = zzfq.zzc(xmlPullParser, strConcat4);
                String strZzc4 = zzfq.zzc(xmlPullParser, strConcat5);
                if (strZzc == null || strZzc2 == null) {
                    return zzgtd.zzi();
                }
                zzgtaVar.zzf(new zzahl(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzfq.zza(xmlPullParser, str.concat(":Directory")));
        return zzgtaVar.zzi();
    }
}

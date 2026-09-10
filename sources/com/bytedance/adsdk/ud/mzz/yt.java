package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import com.p004ironsource.dc;
import com.smartdigimkt.y4.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
class yt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.ud.lnr.ud.mo qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.ud.lnr.ud.wd wdVar2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.lnr lnrVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.mo moVarLnr = null;
        com.bytedance.adsdk.ud.lnr.qdl.mo moVarLnr2 = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.ud.jl.qdl qdlVar = null;
        com.bytedance.adsdk.ud.lnr.ud.jl.ud udVar = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVar2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.ud.lnr.qdl.mml mmlVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName.hashCode()) {
                case 100:
                    if (!strNextName.equals("d")) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    break;
                case 101:
                    if (!strNextName.equals("e")) {
                        i2 = -1;
                    } else {
                        i2 = i5;
                    }
                    break;
                case 103:
                    if (!strNextName.equals(g.f40227p)) {
                        i2 = -1;
                    } else {
                        i2 = 2;
                    }
                    break;
                case 111:
                    if (!strNextName.equals("o")) {
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                    break;
                case 115:
                    if (!strNextName.equals("s")) {
                        i2 = -1;
                    } else {
                        i2 = 4;
                    }
                    break;
                case 116:
                    if (!strNextName.equals("t")) {
                        i2 = -1;
                    } else {
                        i2 = 5;
                    }
                    break;
                case 119:
                    if (!strNextName.equals("w")) {
                        i2 = -1;
                    } else {
                        i2 = 6;
                    }
                    break;
                case 3324:
                    if (!strNextName.equals("hd")) {
                        i2 = -1;
                    } else {
                        i2 = 7;
                    }
                    break;
                case 3447:
                    if (!strNextName.equals("lc")) {
                        i2 = -1;
                    } else {
                        i2 = 8;
                    }
                    break;
                case 3454:
                    if (!strNextName.equals("lj")) {
                        i2 = -1;
                    } else {
                        i2 = 9;
                    }
                    break;
                case 3487:
                    if (!strNextName.equals("ml")) {
                        i2 = -1;
                    } else {
                        i2 = 10;
                    }
                    break;
                case 3519:
                    if (!strNextName.equals("nm")) {
                        i2 = -1;
                    } else {
                        i2 = 11;
                    }
                    break;
                default:
                    i2 = -1;
                    break;
            }
            switch (i2) {
                case 0:
                    jsonReader = jsonReader;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals(dc.q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                udVarQdl2 = mml.qdl(jsonReader, wdVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            jsonReader = jsonReader;
                        }
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            udVar2 = udVarQdl2;
                            i5 = 1;
                        } else {
                            if (strNextString2.equals("d") || strNextString2.equals(g.f40227p)) {
                                i4 = 1;
                                wdVar.qdl(true);
                                arrayList.add(udVarQdl2);
                            } else {
                                i4 = 1;
                            }
                            i5 = i4;
                        }
                    }
                    i3 = i5;
                    jsonReader.endArray();
                    if (arrayList.size() == i3) {
                        arrayList.add(arrayList.get(0));
                    }
                    i5 = i3;
                    break;
                case 1:
                    moVarLnr2 = mml.lnr(jsonReader, wdVar);
                    break;
                case 2:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("k")) {
                            lnrVarQdl = mml.qdl(jsonReader, wdVar, iNextInt);
                        } else if (strNextName3.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 3:
                    mmlVar = mml.ud(jsonReader, wdVar);
                    break;
                case 4:
                    moVarLnr = mml.lnr(jsonReader, wdVar);
                    break;
                case 5:
                    wdVar2 = jsonReader.nextInt() == i5 ? com.bytedance.adsdk.ud.lnr.ud.wd.LINEAR : com.bytedance.adsdk.ud.lnr.ud.wd.RADIAL;
                    break;
                case 6:
                    udVarQdl = mml.qdl(jsonReader, wdVar);
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    qdlVar = com.bytedance.adsdk.ud.lnr.ud.jl.qdl.values()[jsonReader.nextInt() - i5];
                    break;
                case 9:
                    udVar = com.bytedance.adsdk.ud.lnr.ud.jl.ud.values()[jsonReader.nextInt() - i5];
                    break;
                case 10:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    i3 = i5;
                    i5 = i3;
                    break;
            }
        }
        if (mmlVar == null) {
            mmlVar = new com.bytedance.adsdk.ud.lnr.qdl.mml(Collections.singletonList(new com.bytedance.adsdk.ud.wd.qdl(100)));
        }
        return new com.bytedance.adsdk.ud.lnr.ud.mo(strNextString, wdVar2, lnrVarQdl, mmlVar, moVarLnr, moVarLnr2, udVarQdl, qdlVar, udVar, fNextDouble, arrayList, udVar2, zNextBoolean);
    }
}

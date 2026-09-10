package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f17642c;
    public long[] d;

    public static Serializable a(int i2, ParsableByteArray parsableByteArray) {
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.o()));
        }
        if (i2 == 1) {
            return Boolean.valueOf(parsableByteArray.u() == 1);
        }
        if (i2 == 2) {
            return c(parsableByteArray);
        }
        if (i2 != 3) {
            if (i2 == 8) {
                return b(parsableByteArray);
            }
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(parsableByteArray.o()));
                parsableByteArray.G(2);
                return date;
            }
            int iX = parsableByteArray.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i3 = 0; i3 < iX; i3++) {
                Serializable serializableA = a(parsableByteArray.u(), parsableByteArray);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC = c(parsableByteArray);
            int iU = parsableByteArray.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableA2 = a(iU, parsableByteArray);
            if (serializableA2 != null) {
                map.put(strC, serializableA2);
            }
        }
    }

    public static HashMap b(ParsableByteArray parsableByteArray) {
        int iX = parsableByteArray.x();
        HashMap map = new HashMap(iX);
        for (int i2 = 0; i2 < iX; i2++) {
            String strC = c(parsableByteArray);
            Serializable serializableA = a(parsableByteArray.u(), parsableByteArray);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(ParsableByteArray parsableByteArray) {
        int iZ = parsableByteArray.z();
        int i2 = parsableByteArray.f18957b;
        parsableByteArray.G(iZ);
        return new String(parsableByteArray.f18956a, i2, iZ);
    }
}

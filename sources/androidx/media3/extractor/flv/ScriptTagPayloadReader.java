package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f6889c;
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
                parsableByteArray.H(2);
                return date;
            }
            int iY = parsableByteArray.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i3 = 0; i3 < iY; i3++) {
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
        int iY = parsableByteArray.y();
        HashMap map = new HashMap(iY);
        for (int i2 = 0; i2 < iY; i2++) {
            String strC = c(parsableByteArray);
            Serializable serializableA = a(parsableByteArray.u(), parsableByteArray);
            if (serializableA != null) {
                map.put(strC, serializableA);
            }
        }
        return map;
    }

    public static String c(ParsableByteArray parsableByteArray) {
        int iA = parsableByteArray.A();
        int i2 = parsableByteArray.f5668b;
        parsableByteArray.H(iA);
        return new String(parsableByteArray.f5667a, i2, iA);
    }
}

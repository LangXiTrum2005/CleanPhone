package androidx.profileinstaller;

import garter.impromptu;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: ProfileTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final byte[] f13189attabal = {112, 114, 111, 0};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final byte[] f13190saneness = {112, 114, 109, 0};

    public static garter.saneness[] adultoid(InputStream inputStream, byte[] bArr, garter.saneness[] sanenessVarArr) throws IOException {
        int iImpromptu = garter.dern.impromptu(inputStream);
        byte[] bArrMarial = garter.dern.marial(inputStream, (int) garter.dern.taiyuan(inputStream), (int) garter.dern.taiyuan(inputStream));
        if (inputStream.read() > 0) {
            throw garter.dern.dern("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrMarial);
        try {
            garter.saneness[] sanenessVarArrDovishness = dovishness(byteArrayInputStream, bArr, iImpromptu, sanenessVarArr);
            byteArrayInputStream.close();
            return sanenessVarArrDovishness;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int apical(int i) {
        return cord(i * 2) / 8;
    }

    public static byte[] arytenoidectomy(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, garter.dern.wireman(inputStream, bArr.length))) {
            return garter.dern.wireman(inputStream, impromptu.f26560saneness.length);
        }
        throw garter.dern.dern("Invalid magic");
    }

    public static int attabal(garter.saneness sanenessVar) {
        Iterator<Map.Entry<Integer, Integer>> it = sanenessVar.f26571taiyuan.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    public static byte[] beachfront(garter.saneness sanenessVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            polder(byteArrayOutputStream, sanenessVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String competently(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static int cord(int i) {
        return (i + 7) & (-8);
    }

    public static void creditor(OutputStream outputStream, garter.saneness[] sanenessVarArr) throws IOException {
        starveling(outputStream, sanenessVarArr);
    }

    public static void cuirassed(byte[] bArr, int i, int i2, garter.saneness sanenessVar) {
        int iImpassible = impassible(i, i2, sanenessVar.f26566competently);
        int i3 = iImpassible / 8;
        bArr[i3] = (byte) ((1 << (iImpassible % 8)) | bArr[i3]);
    }

    public static String cutely(String str, String str2, byte[] bArr) {
        String strAttabal = impromptu.attabal(bArr);
        if (str.length() <= 0) {
            return competently(str2, strAttabal);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return competently(str2, strAttabal);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + impromptu.attabal(bArr) + str2;
    }

    public static beachfront dern(garter.saneness[] sanenessVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < sanenessVarArr.length; i2++) {
            try {
                garter.saneness sanenessVar = sanenessVarArr[i2];
                garter.dern.arytenoidectomy(byteArrayOutputStream, i2);
                garter.dern.arytenoidectomy(byteArrayOutputStream, sanenessVar.f26569marial);
                i = i + 4 + (sanenessVar.f26569marial * 2);
                oilcan(byteArrayOutputStream, sanenessVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            beachfront beachfrontVar = new beachfront(FileSectionType.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return beachfrontVar;
        }
        throw garter.dern.dern("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static garter.saneness[] dovishness(InputStream inputStream, byte[] bArr, int i, garter.saneness[] sanenessVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new garter.saneness[0];
        }
        if (i != sanenessVarArr.length) {
            throw garter.dern.dern("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            garter.dern.impromptu(inputStream);
            String strBeachfront = garter.dern.beachfront(inputStream, garter.dern.impromptu(inputStream));
            long jTaiyuan = garter.dern.taiyuan(inputStream);
            int iImpromptu = garter.dern.impromptu(inputStream);
            garter.saneness sanenessVarTaiyuan = taiyuan(sanenessVarArr, strBeachfront);
            if (sanenessVarTaiyuan == null) {
                throw garter.dern.dern("Missing profile key: " + strBeachfront);
            }
            sanenessVarTaiyuan.f26572wireman = jTaiyuan;
            int[] iArrTriweekly = triweekly(inputStream, iImpromptu);
            if (Arrays.equals(bArr, impromptu.f26559marial)) {
                sanenessVarTaiyuan.f26569marial = iImpromptu;
                sanenessVarTaiyuan.f26568impromptu = iArrTriweekly;
            }
        }
        return sanenessVarArr;
    }

    public static int formularize(int i, int i2) {
        return cord(Integer.bitCount(i & (-2)) * i2) / 8;
    }

    public static void gintrap(InputStream inputStream, garter.saneness sanenessVar) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(garter.dern.wireman(inputStream, garter.dern.attabal(sanenessVar.f26566competently * 2)));
        int i = 0;
        while (true) {
            int i2 = sanenessVar.f26566competently;
            if (i >= i2) {
                return;
            }
            int iKowloon = kowloon(bitSetValueOf, i, i2);
            if (iKowloon != 0) {
                Integer num = sanenessVar.f26571taiyuan.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                sanenessVar.f26571taiyuan.put(Integer.valueOf(i), Integer.valueOf(iKowloon | num.intValue()));
            }
            i++;
        }
    }

    public static garter.saneness[] graveside(InputStream inputStream, int i, garter.saneness[] sanenessVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new garter.saneness[0];
        }
        if (i != sanenessVarArr.length) {
            throw garter.dern.dern("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iImpromptu = garter.dern.impromptu(inputStream);
            iArr[i2] = garter.dern.impromptu(inputStream);
            strArr[i2] = garter.dern.beachfront(inputStream, iImpromptu);
        }
        for (int i3 = 0; i3 < i; i3++) {
            garter.saneness sanenessVar = sanenessVarArr[i3];
            if (!sanenessVar.f26570saneness.equals(strArr[i3])) {
                throw garter.dern.dern("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            sanenessVar.f26569marial = i4;
            sanenessVar.f26568impromptu = triweekly(inputStream, i4);
        }
        return sanenessVarArr;
    }

    public static void grimness(OutputStream outputStream, garter.saneness[] sanenessVarArr) throws IOException {
        garter.dern.polloi(outputStream, sanenessVarArr.length);
        for (garter.saneness sanenessVar : sanenessVarArr) {
            int size = sanenessVar.f26571taiyuan.size() * 4;
            String strCutely = cutely(sanenessVar.f26564attabal, sanenessVar.f26570saneness, impromptu.f26561wireman);
            garter.dern.arytenoidectomy(outputStream, garter.dern.apical(strCutely));
            garter.dern.arytenoidectomy(outputStream, sanenessVar.f26568impromptu.length);
            garter.dern.monoploid(outputStream, size);
            garter.dern.monoploid(outputStream, sanenessVar.f26567dern);
            garter.dern.triweekly(outputStream, strCutely);
            Iterator<Integer> it = sanenessVar.f26571taiyuan.keySet().iterator();
            while (it.hasNext()) {
                garter.dern.arytenoidectomy(outputStream, it.next().intValue());
                garter.dern.arytenoidectomy(outputStream, 0);
            }
            for (int i : sanenessVar.f26568impromptu) {
                garter.dern.arytenoidectomy(outputStream, i);
            }
        }
    }

    public static int impassible(int i, int i2, int i3) {
        if (i == 1) {
            throw garter.dern.dern("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw garter.dern.dern("Unexpected flag: " + i);
    }

    public static String impromptu(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static void kattegat(OutputStream outputStream, garter.saneness sanenessVar) throws IOException {
        polder(outputStream, sanenessVar);
        oilcan(outputStream, sanenessVar);
        restrictive(outputStream, sanenessVar);
    }

    public static int kowloon(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(impassible(2, i, i2)) ? 2 : 0;
        return bitSet.get(impassible(4, i, i2)) ? i3 | 4 : i3;
    }

    public static byte[] marial(int i, garter.saneness sanenessVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            merc(byteArrayOutputStream, i, sanenessVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void merc(OutputStream outputStream, int i, garter.saneness sanenessVar) throws IOException {
        byte[] bArr = new byte[formularize(i, sanenessVar.f26566competently)];
        for (Map.Entry<Integer, Integer> entry : sanenessVar.f26571taiyuan.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & iIntValue2) == i3) {
                        int i4 = (sanenessVar.f26566competently * i2) + iIntValue;
                        int i5 = i4 / 8;
                        bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                    }
                    i2++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static garter.saneness[] molybdenite(InputStream inputStream, byte[] bArr, garter.saneness[] sanenessVarArr) throws IOException {
        if (!Arrays.equals(bArr, impromptu.f26556beachfront)) {
            throw garter.dern.dern("Unsupported meta version");
        }
        int iCutely = garter.dern.cutely(inputStream);
        byte[] bArrMarial = garter.dern.marial(inputStream, (int) garter.dern.taiyuan(inputStream), (int) garter.dern.taiyuan(inputStream));
        if (inputStream.read() > 0) {
            throw garter.dern.dern("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrMarial);
        try {
            garter.saneness[] sanenessVarArrGraveside = graveside(byteArrayInputStream, iCutely, sanenessVarArr);
            byteArrayInputStream.close();
            return sanenessVarArrGraveside;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void monoploid(InputStream inputStream, garter.saneness sanenessVar) throws IOException {
        int iAvailable = inputStream.available() - sanenessVar.f26565beachfront;
        int iImpromptu = 0;
        while (inputStream.available() > iAvailable) {
            iImpromptu += garter.dern.impromptu(inputStream);
            sanenessVar.f26571taiyuan.put(Integer.valueOf(iImpromptu), 1);
            for (int iImpromptu2 = garter.dern.impromptu(inputStream); iImpromptu2 > 0; iImpromptu2--) {
                stratoscope(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw garter.dern.dern("Read too much data during profile line parse");
        }
    }

    public static void oilcan(OutputStream outputStream, garter.saneness sanenessVar) throws IOException {
        int[] iArr = sanenessVar.f26568impromptu;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            garter.dern.arytenoidectomy(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    public static void polder(OutputStream outputStream, garter.saneness sanenessVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : sanenessVar.f26571taiyuan.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                garter.dern.arytenoidectomy(outputStream, iIntValue - i);
                garter.dern.arytenoidectomy(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static garter.saneness[] polloi(InputStream inputStream, byte[] bArr, byte[] bArr2, garter.saneness[] sanenessVarArr) throws IOException {
        if (Arrays.equals(bArr, impromptu.f26556beachfront)) {
            if (Arrays.equals(impromptu.f26555attabal, bArr2)) {
                throw garter.dern.dern("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return molybdenite(inputStream, bArr, sanenessVarArr);
        }
        if (Arrays.equals(bArr, impromptu.f26557competently)) {
            return adultoid(inputStream, bArr2, sanenessVarArr);
        }
        throw garter.dern.dern("Unsupported meta version");
    }

    public static garter.saneness[] preprohormone(InputStream inputStream, String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new garter.saneness[0];
        }
        garter.saneness[] sanenessVarArr = new garter.saneness[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iImpromptu = garter.dern.impromptu(inputStream);
            int iImpromptu2 = garter.dern.impromptu(inputStream);
            sanenessVarArr[i2] = new garter.saneness(str, garter.dern.beachfront(inputStream, iImpromptu), garter.dern.taiyuan(inputStream), 0L, iImpromptu2, (int) garter.dern.taiyuan(inputStream), (int) garter.dern.taiyuan(inputStream), new int[iImpromptu2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            garter.saneness sanenessVar = sanenessVarArr[i3];
            monoploid(inputStream, sanenessVar);
            sanenessVar.f26568impromptu = triweekly(inputStream, sanenessVar.f26569marial);
            gintrap(inputStream, sanenessVar);
        }
        return sanenessVarArr;
    }

    public static void privatdozent(OutputStream outputStream, garter.saneness[] sanenessVarArr) throws IOException {
        byte[] bArrSaneness = saneness(sanenessVarArr, impromptu.f26560saneness);
        garter.dern.polloi(outputStream, sanenessVarArr.length);
        garter.dern.impassible(outputStream, bArrSaneness);
    }

    public static void restrictive(OutputStream outputStream, garter.saneness sanenessVar) throws IOException {
        byte[] bArr = new byte[apical(sanenessVar.f26566competently)];
        for (Map.Entry<Integer, Integer> entry : sanenessVar.f26571taiyuan.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                cuirassed(bArr, 2, iIntValue, sanenessVar);
            }
            if ((iIntValue2 & 4) != 0) {
                cuirassed(bArr, 4, iIntValue, sanenessVar);
            }
        }
        outputStream.write(bArr);
    }

    public static garter.saneness[] rotuma(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, impromptu.f26560saneness)) {
            throw garter.dern.dern("Unsupported version");
        }
        int iCutely = garter.dern.cutely(inputStream);
        byte[] bArrMarial = garter.dern.marial(inputStream, (int) garter.dern.taiyuan(inputStream), (int) garter.dern.taiyuan(inputStream));
        if (inputStream.read() > 0) {
            throw garter.dern.dern("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrMarial);
        try {
            garter.saneness[] sanenessVarArrPreprohormone = preprohormone(byteArrayInputStream, str, iCutely);
            byteArrayInputStream.close();
            return sanenessVarArrPreprohormone;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] saneness(garter.saneness[] sanenessVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int iApical = 0;
        for (garter.saneness sanenessVar : sanenessVarArr) {
            iApical += garter.dern.apical(cutely(sanenessVar.f26564attabal, sanenessVar.f26570saneness, bArr)) + 16 + (sanenessVar.f26569marial * 2) + sanenessVar.f26565beachfront + apical(sanenessVar.f26566competently);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iApical);
        if (Arrays.equals(bArr, impromptu.f26558dern)) {
            int length = sanenessVarArr.length;
            while (i < length) {
                garter.saneness sanenessVar2 = sanenessVarArr[i];
                supplicat(byteArrayOutputStream, sanenessVar2, cutely(sanenessVar2.f26564attabal, sanenessVar2.f26570saneness, bArr));
                kattegat(byteArrayOutputStream, sanenessVar2);
                i++;
            }
        } else {
            for (garter.saneness sanenessVar3 : sanenessVarArr) {
                supplicat(byteArrayOutputStream, sanenessVar3, cutely(sanenessVar3.f26564attabal, sanenessVar3.f26570saneness, bArr));
            }
            int length2 = sanenessVarArr.length;
            while (i < length2) {
                kattegat(byteArrayOutputStream, sanenessVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iApical) {
            return byteArrayOutputStream.toByteArray();
        }
        throw garter.dern.dern("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iApical);
    }

    public static void saran(OutputStream outputStream, garter.saneness[] sanenessVarArr) throws IOException {
        byte[] bArrSaneness = saneness(sanenessVarArr, impromptu.f26558dern);
        garter.dern.polloi(outputStream, sanenessVarArr.length);
        garter.dern.impassible(outputStream, bArrSaneness);
    }

    public static void sealless(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f13189attabal);
        outputStream.write(bArr);
    }

    public static void seminary(OutputStream outputStream, garter.saneness[] sanenessVarArr) throws IOException {
        garter.dern.arytenoidectomy(outputStream, sanenessVarArr.length);
        for (garter.saneness sanenessVar : sanenessVarArr) {
            String strCutely = cutely(sanenessVar.f26564attabal, sanenessVar.f26570saneness, impromptu.f26559marial);
            garter.dern.arytenoidectomy(outputStream, garter.dern.apical(strCutely));
            garter.dern.arytenoidectomy(outputStream, sanenessVar.f26571taiyuan.size());
            garter.dern.arytenoidectomy(outputStream, sanenessVar.f26568impromptu.length);
            garter.dern.monoploid(outputStream, sanenessVar.f26567dern);
            garter.dern.triweekly(outputStream, strCutely);
            Iterator<Integer> it = sanenessVar.f26571taiyuan.keySet().iterator();
            while (it.hasNext()) {
                garter.dern.arytenoidectomy(outputStream, it.next().intValue());
            }
            for (int i : sanenessVar.f26568impromptu) {
                garter.dern.arytenoidectomy(outputStream, i);
            }
        }
    }

    public static void starveling(OutputStream outputStream, garter.saneness[] sanenessVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(yemenite(sanenessVarArr));
        arrayList.add(dern(sanenessVarArr));
        arrayList.add(wireman(sanenessVarArr));
        long length2 = ((long) impromptu.f26555attabal.length) + ((long) f13189attabal.length) + 4 + ((long) (arrayList.size() * 16));
        garter.dern.monoploid(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            beachfront beachfrontVar = (beachfront) arrayList.get(i);
            garter.dern.monoploid(outputStream, beachfrontVar.f13161attabal.getValue());
            garter.dern.monoploid(outputStream, length2);
            if (beachfrontVar.f13164wireman) {
                byte[] bArr = beachfrontVar.f13162dern;
                long length3 = bArr.length;
                byte[] bArrSaneness = garter.dern.saneness(bArr);
                arrayList2.add(bArrSaneness);
                garter.dern.monoploid(outputStream, bArrSaneness.length);
                garter.dern.monoploid(outputStream, length3);
                length = bArrSaneness.length;
            } else {
                arrayList2.add(beachfrontVar.f13162dern);
                garter.dern.monoploid(outputStream, beachfrontVar.f13162dern.length);
                garter.dern.monoploid(outputStream, 0L);
                length = beachfrontVar.f13162dern.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static void stratoscope(InputStream inputStream) throws IOException {
        garter.dern.impromptu(inputStream);
        int iCutely = garter.dern.cutely(inputStream);
        if (iCutely == 6 || iCutely == 7) {
            return;
        }
        while (iCutely > 0) {
            garter.dern.cutely(inputStream);
            for (int iCutely2 = garter.dern.cutely(inputStream); iCutely2 > 0; iCutely2--) {
                garter.dern.impromptu(inputStream);
            }
            iCutely--;
        }
    }

    public static void supplicat(OutputStream outputStream, garter.saneness sanenessVar, String str) throws IOException {
        garter.dern.arytenoidectomy(outputStream, garter.dern.apical(str));
        garter.dern.arytenoidectomy(outputStream, sanenessVar.f26569marial);
        garter.dern.monoploid(outputStream, sanenessVar.f26565beachfront);
        garter.dern.monoploid(outputStream, sanenessVar.f26567dern);
        garter.dern.monoploid(outputStream, sanenessVar.f26566competently);
        garter.dern.triweekly(outputStream, str);
    }

    public static garter.saneness taiyuan(garter.saneness[] sanenessVarArr, String str) {
        if (sanenessVarArr.length <= 0) {
            return null;
        }
        String strImpromptu = impromptu(str);
        for (int i = 0; i < sanenessVarArr.length; i++) {
            if (sanenessVarArr[i].f26570saneness.equals(strImpromptu)) {
                return sanenessVarArr[i];
            }
        }
        return null;
    }

    public static int[] triweekly(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iImpromptu = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iImpromptu += garter.dern.impromptu(inputStream);
            iArr[i2] = iImpromptu;
        }
        return iArr;
    }

    public static boolean trm(OutputStream outputStream, byte[] bArr, garter.saneness[] sanenessVarArr) throws IOException {
        if (Arrays.equals(bArr, impromptu.f26555attabal)) {
            creditor(outputStream, sanenessVarArr);
            return true;
        }
        if (Arrays.equals(bArr, impromptu.f26560saneness)) {
            privatdozent(outputStream, sanenessVarArr);
            return true;
        }
        if (Arrays.equals(bArr, impromptu.f26561wireman)) {
            grimness(outputStream, sanenessVarArr);
            return true;
        }
        if (Arrays.equals(bArr, impromptu.f26558dern)) {
            saran(outputStream, sanenessVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, impromptu.f26559marial)) {
            return false;
        }
        seminary(outputStream, sanenessVarArr);
        return true;
    }

    public static beachfront wireman(garter.saneness[] sanenessVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < sanenessVarArr.length; i2++) {
            try {
                garter.saneness sanenessVar = sanenessVarArr[i2];
                int iAttabal = attabal(sanenessVar);
                byte[] bArrMarial = marial(iAttabal, sanenessVar);
                byte[] bArrBeachfront = beachfront(sanenessVar);
                garter.dern.arytenoidectomy(byteArrayOutputStream, i2);
                int length = bArrMarial.length + 2 + bArrBeachfront.length;
                garter.dern.monoploid(byteArrayOutputStream, length);
                garter.dern.arytenoidectomy(byteArrayOutputStream, iAttabal);
                byteArrayOutputStream.write(bArrMarial);
                byteArrayOutputStream.write(bArrBeachfront);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            beachfront beachfrontVar = new beachfront(FileSectionType.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return beachfrontVar;
        }
        throw garter.dern.dern("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static beachfront yemenite(garter.saneness[] sanenessVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            garter.dern.arytenoidectomy(byteArrayOutputStream, sanenessVarArr.length);
            int i = 2;
            for (garter.saneness sanenessVar : sanenessVarArr) {
                garter.dern.monoploid(byteArrayOutputStream, sanenessVar.f26567dern);
                garter.dern.monoploid(byteArrayOutputStream, sanenessVar.f26572wireman);
                garter.dern.monoploid(byteArrayOutputStream, sanenessVar.f26566competently);
                String strCutely = cutely(sanenessVar.f26564attabal, sanenessVar.f26570saneness, impromptu.f26555attabal);
                int iApical = garter.dern.apical(strCutely);
                garter.dern.arytenoidectomy(byteArrayOutputStream, iApical);
                i = i + 14 + iApical;
                garter.dern.triweekly(byteArrayOutputStream, strCutely);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                beachfront beachfrontVar = new beachfront(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return beachfrontVar;
            }
            throw garter.dern.dern("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

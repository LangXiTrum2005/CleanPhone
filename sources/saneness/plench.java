package saneness;

import ads_mobile_sdk.fh;
import ads_mobile_sdk.hr;
import ads_mobile_sdk.j21;
import ads_mobile_sdk.jf1;
import ads_mobile_sdk.kn;
import ads_mobile_sdk.qc1;
import ads_mobile_sdk.t63;
import ads_mobile_sdk.x81;
import ads_mobile_sdk.xm0;
import ads_mobile_sdk.z43;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class plench {
    public static int adultoid(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        j21 j21Var = (j21) prescientVar;
        j21Var.b(apical(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iMarial = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            j21Var.b(apical(iMarial, bArr));
            i4 = iMarial + 4;
        }
        return i4;
    }

    public static int apical(int i, byte[] bArr) {
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static int arytenoidectomy(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        dehydration dehydrationVar = (dehydration) prescientVar;
        dehydrationVar.saneness(Double.longBitsToDouble(molybdenite(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iMarial = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            dehydrationVar.saneness(Double.longBitsToDouble(molybdenite(iMarial, bArr)));
            i4 = iMarial + 8;
        }
        return i4;
    }

    public static double attabal(int i, byte[] bArr) {
        return Double.longBitsToDouble(molybdenite(i, bArr));
    }

    public static int beachfront(Object obj, attraction attractionVar, byte[] bArr, int i, int i2, int i3, fh fhVar) {
        jf1 jf1Var = (jf1) attractionVar;
        int i4 = fhVar.d + 1;
        fhVar.d = i4;
        if (i4 >= 100) {
            throw new x81("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA = jf1Var.a(obj, bArr, i, i2, i3, fhVar);
        fhVar.d--;
        fhVar.c = obj;
        return iA;
    }

    public static int competently(Object obj, attraction attractionVar, byte[] bArr, int i, int i2, fh fhVar) {
        int iMarial = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iMarial = marial(i3, bArr, iMarial, fhVar);
            i3 = fhVar.a;
        }
        int i4 = iMarial;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = fhVar.d + 1;
        fhVar.d = i5;
        if (i5 >= 100) {
            throw new x81("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        attractionVar.a(obj, bArr, i4, i6, fhVar);
        fhVar.d--;
        fhVar.c = obj;
        return i6;
    }

    public static int cord(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        needler needlerVar = (needler) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        int i3 = iDovishness + i2;
        if (i3 > bArr.length) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        needlerVar.getClass();
        needlerVar.b(i2 / 4);
        while (iDovishness < i3) {
            needlerVar.saneness(Float.intBitsToFloat(apical(iDovishness, bArr)));
            iDovishness += 4;
        }
        if (iDovishness == i3) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int cuirassed(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        needler needlerVar = (needler) prescientVar;
        needlerVar.saneness(Float.intBitsToFloat(apical(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iMarial = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            needlerVar.saneness(Float.intBitsToFloat(apical(iMarial, bArr)));
            i4 = iMarial + 4;
        }
        return i4;
    }

    public static int cutely(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        twybill twybillVar = (twybill) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a + iDovishness;
        while (iDovishness < i2) {
            iDovishness = preprohormone(bArr, iDovishness, fhVar);
            twybillVar.saneness(fhVar.b != 0);
        }
        if (iDovishness == i2) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int dern(int i, byte[] bArr, int i2, int i3, z43 z43Var, fh fhVar) {
        if ((i >>> 3) == 0) {
            throw new x81("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iPreprohormone = preprohormone(bArr, i2, fhVar);
            z43Var.a(i, Long.valueOf(fhVar.b));
            return iPreprohormone;
        }
        if (i4 == 1) {
            z43Var.a(i, Long.valueOf(molybdenite(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iDovishness = dovishness(bArr, i2, fhVar);
            int i5 = fhVar.a;
            if (i5 < 0) {
                throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iDovishness) {
                throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                z43Var.a(i, kn.b);
            } else {
                z43Var.a(i, kn.a(bArr, iDovishness, i5));
            }
            return iDovishness + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new x81("Protocol message contained an invalid tag (zero).");
            }
            z43Var.a(i, Integer.valueOf(apical(i2, bArr)));
            return i2 + 4;
        }
        z43 z43VarB = z43.b();
        int i6 = (i & (-8)) | 4;
        int i7 = fhVar.d + 1;
        fhVar.d = i7;
        if (i7 >= 100) {
            throw new x81("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iDovishness2 = dovishness(bArr, i2, fhVar);
            int i9 = fhVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iDovishness2;
                break;
            }
            i2 = dern(i9, bArr, iDovishness2, i3, z43VarB, fhVar);
            i8 = i9;
        }
        fhVar.d--;
        if (i2 > i3 || i8 != i6) {
            throw new x81("Failed to parse the message.");
        }
        z43Var.a(i, z43VarB);
        return i2;
    }

    public static int dovishness(byte[] bArr, int i, fh fhVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return marial(b, bArr, i2, fhVar);
        }
        fhVar.a = b;
        return i2;
    }

    public static int formularize(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) throws x81 {
        int iDovishness = dovishness(bArr, i2, fhVar);
        int i4 = fhVar.a;
        if (i4 < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - iDovishness) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            prescientVar.add(kn.b);
        } else {
            prescientVar.add(kn.a(bArr, iDovishness, i4));
            iDovishness += i4;
        }
        while (iDovishness < i3) {
            int iMarial = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iDovishness = iMarial + 1;
            byte b2 = bArr[iMarial];
            if (b2 >= 0) {
                fhVar.a = b2;
            } else {
                iDovishness = marial(b2, bArr, iDovishness, fhVar);
            }
            int i5 = fhVar.a;
            if (i5 < 0) {
                throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iDovishness) {
                throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                prescientVar.add(kn.b);
            } else {
                prescientVar.add(kn.a(bArr, iDovishness, i5));
                iDovishness += i5;
            }
        }
        return iDovishness;
    }

    public static int gintrap(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        qc1 qc1Var = (qc1) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        int i3 = iDovishness + i2;
        if (i3 > bArr.length) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        qc1Var.b((i2 / 8) + qc1Var.c);
        while (iDovishness < i3) {
            qc1Var.a(molybdenite(iDovishness, bArr));
            iDovishness += 8;
        }
        if (iDovishness == i3) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static float graveside(int i, byte[] bArr) {
        return Float.intBitsToFloat(apical(i, bArr));
    }

    public static int impassible(attraction attractionVar, int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        xm0 xm0VarA = attractionVar.a();
        attraction attractionVar2 = attractionVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        fh fhVar2 = fhVar;
        int iCompetently = competently(xm0VarA, attractionVar2, bArr2, i2, i4, fhVar2);
        attractionVar2.c(xm0VarA);
        fhVar2.c = xm0VarA;
        prescientVar.add(xm0VarA);
        while (iCompetently < i4) {
            int iMarial = iCompetently + 1;
            byte b = bArr2[iCompetently];
            if (b >= 0) {
                fhVar2.a = b;
            } else {
                iMarial = marial(b, bArr2, iMarial, fhVar2);
            }
            if (i != fhVar2.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            attraction attractionVar3 = attractionVar2;
            xm0 xm0VarA2 = attractionVar3.a();
            fh fhVar3 = fhVar2;
            int i5 = i4;
            iCompetently = competently(xm0VarA2, attractionVar3, bArr3, iMarial, i5, fhVar3);
            attractionVar2 = attractionVar3;
            bArr2 = bArr3;
            i4 = i5;
            fhVar2 = fhVar3;
            attractionVar2.c(xm0VarA2);
            fhVar2.c = xm0VarA2;
            prescientVar.add(xm0VarA2);
        }
        return iCompetently;
    }

    public static int impromptu(attraction attractionVar, int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        int i4 = (i & (-8)) | 4;
        xm0 xm0VarA = attractionVar.a();
        int iBeachfront = beachfront(xm0VarA, attractionVar, bArr, i2, i3, i4, fhVar);
        attractionVar.c(xm0VarA);
        fhVar.c = xm0VarA;
        prescientVar.add(xm0VarA);
        while (iBeachfront < i3) {
            int iDovishness = dovishness(bArr, iBeachfront, fhVar);
            if (i != fhVar.a) {
                break;
            }
            xm0 xm0VarA2 = attractionVar.a();
            iBeachfront = beachfront(xm0VarA2, attractionVar, bArr, iDovishness, i3, i4, fhVar);
            attractionVar.c(xm0VarA2);
            fhVar.c = xm0VarA2;
            prescientVar.add(xm0VarA2);
        }
        return iBeachfront;
    }

    public static int kattegat(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) throws x81 {
        int iDovishness = dovishness(bArr, i2, fhVar);
        int i4 = fhVar.a;
        if (i4 < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            prescientVar.add("");
        } else {
            prescientVar.add(new String(bArr, iDovishness, i4, StandardCharsets.UTF_8));
            iDovishness += i4;
        }
        while (iDovishness < i3) {
            int iMarial = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iDovishness = iMarial + 1;
            byte b2 = bArr[iMarial];
            if (b2 >= 0) {
                fhVar.a = b2;
            } else {
                iDovishness = marial(b2, bArr, iDovishness, fhVar);
            }
            int i5 = fhVar.a;
            if (i5 < 0) {
                throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 == 0) {
                prescientVar.add("");
            } else {
                prescientVar.add(new String(bArr, iDovishness, i5, StandardCharsets.UTF_8));
                iDovishness += i5;
            }
        }
        return iDovishness;
    }

    public static int kowloon(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        dehydration dehydrationVar = (dehydration) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        int i3 = iDovishness + i2;
        if (i3 > bArr.length) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        dehydrationVar.getClass();
        dehydrationVar.b(i2 / 8);
        while (iDovishness < i3) {
            dehydrationVar.saneness(Double.longBitsToDouble(molybdenite(iDovishness, bArr)));
            iDovishness += 8;
        }
        if (iDovishness == i3) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int marial(int i, byte[] bArr, int i2, fh fhVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            fhVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            fhVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            fhVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            fhVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                fhVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int merc(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        j21 j21Var = (j21) prescientVar;
        int iDovishness = dovishness(bArr, i2, fhVar);
        j21Var.b(fhVar.a);
        while (iDovishness < i3) {
            int iMarial = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iDovishness = iMarial + 1;
            byte b2 = bArr[iMarial];
            if (b2 >= 0) {
                fhVar.a = b2;
            } else {
                iDovishness = marial(b2, bArr, iDovishness, fhVar);
            }
            j21Var.b(fhVar.a);
        }
        return iDovishness;
    }

    public static long molybdenite(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int monoploid(byte[] bArr, int i, fh fhVar) {
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        if (i2 < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        String strSaneness = "";
        if (i2 == 0) {
            fhVar.c = "";
            return iDovishness;
        }
        if (i2 == 0) {
            unready unreadyVar = t63.a;
        } else {
            strSaneness = t63.a.saneness(bArr, iDovishness, i2);
        }
        fhVar.c = strSaneness;
        return iDovishness + i2;
    }

    public static int oilcan(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        qc1 qc1Var = (qc1) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a + iDovishness;
        while (iDovishness < i2) {
            iDovishness = preprohormone(bArr, iDovishness, fhVar);
            qc1Var.a(hr.a(fhVar.b));
        }
        if (iDovishness == i2) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int polder(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        qc1 qc1Var = (qc1) prescientVar;
        int iPreprohormone = preprohormone(bArr, i2, fhVar);
        qc1Var.a(fhVar.b);
        while (iPreprohormone < i3) {
            int iMarial = iPreprohormone + 1;
            byte b = bArr[iPreprohormone];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iPreprohormone = preprohormone(bArr, iMarial, fhVar);
            qc1Var.a(fhVar.b);
        }
        return iPreprohormone;
    }

    public static int polloi(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        j21 j21Var = (j21) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        int i3 = iDovishness + i2;
        if (i3 > bArr.length) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        j21Var.c((i2 / 4) + j21Var.c);
        while (iDovishness < i3) {
            j21Var.b(apical(iDovishness, bArr));
            iDovishness += 4;
        }
        if (iDovishness == i3) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int preprohormone(byte[] bArr, int i, fh fhVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            fhVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        fhVar.b = j2;
        return i3;
    }

    public static int restrictive(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) throws x81 {
        int iDovishness = dovishness(bArr, i2, fhVar);
        int i4 = fhVar.a;
        if (i4 < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            prescientVar.add("");
        } else {
            int i5 = iDovishness + i4;
            if (!t63.a.wireman(bArr, iDovishness, i5)) {
                throw new x81("Protocol message had invalid UTF-8.");
            }
            prescientVar.add(new String(bArr, iDovishness, i4, StandardCharsets.UTF_8));
            iDovishness = i5;
        }
        while (iDovishness < i3) {
            int iMarial = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iDovishness = iMarial + 1;
            byte b2 = bArr[iMarial];
            if (b2 >= 0) {
                fhVar.a = b2;
            } else {
                iDovishness = marial(b2, bArr, iDovishness, fhVar);
            }
            int i6 = fhVar.a;
            if (i6 < 0) {
                throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 == 0) {
                prescientVar.add("");
            } else {
                int i7 = iDovishness + i6;
                if (!t63.a.wireman(bArr, iDovishness, i7)) {
                    throw new x81("Protocol message had invalid UTF-8.");
                }
                prescientVar.add(new String(bArr, iDovishness, i6, StandardCharsets.UTF_8));
                iDovishness = i7;
            }
        }
        return iDovishness;
    }

    public static int rotuma(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        qc1 qc1Var = (qc1) prescientVar;
        qc1Var.a(molybdenite(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iMarial = i4 + 1;
            byte b = bArr[i4];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            qc1Var.a(molybdenite(iMarial, bArr));
            i4 = iMarial + 8;
        }
        return i4;
    }

    public static int saneness(int i, byte[] bArr, int i2, int i3, fh fhVar) {
        if ((i >>> 3) == 0) {
            throw new x81("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return preprohormone(bArr, i2, fhVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return dovishness(bArr, i2, fhVar) + fhVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new x81("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = dovishness(bArr, i2, fhVar);
            i6 = fhVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = saneness(i6, bArr, i2, i3, fhVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new x81("Failed to parse the message.");
        }
        return i2;
    }

    public static int sealless(byte[] bArr, int i, prescient prescientVar, fh fhVar) {
        j21 j21Var = (j21) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a + iDovishness;
        while (iDovishness < i2) {
            int i3 = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
                iDovishness = i3;
            } else {
                iDovishness = marial(b, bArr, i3, fhVar);
            }
            j21Var.b(fhVar.a);
        }
        if (iDovishness == i2) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int stratoscope(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        j21 j21Var = (j21) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a + iDovishness;
        while (iDovishness < i2) {
            int i3 = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
                iDovishness = i3;
            } else {
                iDovishness = marial(b, bArr, i3, fhVar);
            }
            j21Var.b(hr.b(fhVar.a));
        }
        if (iDovishness == i2) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int supplicat(byte[] bArr, int i, prescient prescientVar, fh fhVar) throws x81 {
        qc1 qc1Var = (qc1) prescientVar;
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a + iDovishness;
        while (iDovishness < i2) {
            iDovishness = preprohormone(bArr, iDovishness, fhVar);
            qc1Var.a(fhVar.b);
        }
        if (iDovishness == i2) {
            return iDovishness;
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int taiyuan(byte[] bArr, int i, fh fhVar) {
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        if (i2 < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iDovishness) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            fhVar.c = kn.b;
            return iDovishness;
        }
        fhVar.c = kn.a(bArr, iDovishness, i2);
        return iDovishness + i2;
    }

    public static int triweekly(byte[] bArr, int i, fh fhVar) {
        int iDovishness = dovishness(bArr, i, fhVar);
        int i2 = fhVar.a;
        if (i2 < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            fhVar.c = "";
            return iDovishness;
        }
        fhVar.c = new String(bArr, iDovishness, i2, StandardCharsets.UTF_8);
        return iDovishness + i2;
    }

    public static int trm(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        j21 j21Var = (j21) prescientVar;
        int iDovishness = dovishness(bArr, i2, fhVar);
        j21Var.b(hr.b(fhVar.a));
        while (iDovishness < i3) {
            int iMarial = iDovishness + 1;
            byte b = bArr[iDovishness];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iDovishness = iMarial + 1;
            byte b2 = bArr[iMarial];
            if (b2 >= 0) {
                fhVar.a = b2;
            } else {
                iDovishness = marial(b2, bArr, iDovishness, fhVar);
            }
            j21Var.b(hr.b(fhVar.a));
        }
        return iDovishness;
    }

    public static int wireman(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        twybill twybillVar = (twybill) prescientVar;
        int iPreprohormone = preprohormone(bArr, i2, fhVar);
        twybillVar.saneness(fhVar.b != 0);
        while (iPreprohormone < i3) {
            int iMarial = iPreprohormone + 1;
            byte b = bArr[iPreprohormone];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iPreprohormone = preprohormone(bArr, iMarial, fhVar);
            twybillVar.saneness(fhVar.b != 0);
        }
        return iPreprohormone;
    }

    public static int yemenite(int i, byte[] bArr, int i2, int i3, prescient prescientVar, fh fhVar) {
        qc1 qc1Var = (qc1) prescientVar;
        int iPreprohormone = preprohormone(bArr, i2, fhVar);
        qc1Var.a(hr.a(fhVar.b));
        while (iPreprohormone < i3) {
            int iMarial = iPreprohormone + 1;
            byte b = bArr[iPreprohormone];
            if (b >= 0) {
                fhVar.a = b;
            } else {
                iMarial = marial(b, bArr, iMarial, fhVar);
            }
            if (i != fhVar.a) {
                break;
            }
            iPreprohormone = preprohormone(bArr, iMarial, fhVar);
            qc1Var.a(hr.a(fhVar.b));
        }
        return iPreprohormone;
    }
}

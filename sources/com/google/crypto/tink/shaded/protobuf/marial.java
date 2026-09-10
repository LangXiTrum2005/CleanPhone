package com.google.crypto.tink.shaded.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: ArrayDecoders.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static volatile int f22241attabal = 100;

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22242attabal;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f22242attabal = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22242attabal[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22242attabal[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22242attabal[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22242attabal[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22242attabal[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22242attabal[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22242attabal[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22242attabal[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22242attabal[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22242attabal[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22242attabal[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22242attabal[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22242attabal[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22242attabal[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22242attabal[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22242attabal[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22242attabal[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f22243attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Object f22244dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f22245marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f22246saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final kowloon f22247wireman;

        public saneness(kowloon kowloonVar) {
            kowloonVar.getClass();
            this.f22247wireman = kowloonVar;
        }
    }

    public static int adultoid(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        gintrap gintrapVar = (gintrap) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        int i3 = iMerc + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        gintrapVar.beachfront(gintrapVar.size() + (i2 / 4));
        while (iMerc < i3) {
            gintrapVar.addInt(taiyuan(bArr, iMerc));
            iMerc += 4;
        }
        if (iMerc == i3) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static long apical(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int arytenoidectomy(premeiotic<?> premeioticVar, int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<Object> taiyuanVar, saneness sanenessVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iKowloon = kowloon(premeioticVar, bArr, i2, i3, i4, sanenessVar);
        taiyuanVar.add(sanenessVar.f22244dern);
        while (iKowloon < i3) {
            int iMerc = merc(bArr, iKowloon, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iKowloon = kowloon(premeioticVar, bArr, iMerc, i3, i4, sanenessVar);
            taiyuanVar.add(sanenessVar.f22244dern);
        }
        return iKowloon;
    }

    public static void attabal(int i) throws InvalidProtocolBufferException {
        if (i >= f22241attabal) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int beachfront(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        formularize formularizeVar = (formularize) taiyuanVar;
        formularizeVar.addDouble(marial(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iMerc = merc(bArr, i4, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            formularizeVar.addDouble(marial(bArr, iMerc));
            i4 = iMerc + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int competently(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.dern<?, ?> dernVar, GeneratedMessageLite.marial<?, ?> marialVar, lerp<nosophobia, nosophobia> lerpVar, saneness sanenessVar) throws IOException {
        int i4;
        int i5;
        graveside<GeneratedMessageLite.wireman> gravesideVar = dernVar.extensions;
        int i6 = i >>> 3;
        if (marialVar.f22132saneness.isRepeated() && marialVar.f22132saneness.isPacked()) {
            switch (attabal.f22242attabal[marialVar.attabal().ordinal()]) {
                case 1:
                    formularize formularizeVar = new formularize();
                    int iGraveside = graveside(bArr, i2, formularizeVar, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, formularizeVar);
                    return iGraveside;
                case 2:
                    adultoid adultoidVar = new adultoid();
                    int iGintrap = gintrap(bArr, i2, adultoidVar, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, adultoidVar);
                    return iGintrap;
                case 3:
                case 4:
                    kattegat kattegatVar = new kattegat();
                    int iCuirassed = cuirassed(bArr, i2, kattegatVar, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, kattegatVar);
                    return iCuirassed;
                case 5:
                case 6:
                    gintrap gintrapVar = new gintrap();
                    int iCord = cord(bArr, i2, gintrapVar, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, gintrapVar);
                    return iCord;
                case 7:
                case 8:
                    kattegat kattegatVar2 = new kattegat();
                    int iDovishness = dovishness(bArr, i2, kattegatVar2, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, kattegatVar2);
                    return iDovishness;
                case 9:
                case 10:
                    gintrap gintrapVar2 = new gintrap();
                    int iAdultoid = adultoid(bArr, i2, gintrapVar2, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, gintrapVar2);
                    return iAdultoid;
                case 11:
                    beachfront beachfrontVar = new beachfront();
                    int iMolybdenite = molybdenite(bArr, i2, beachfrontVar, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, beachfrontVar);
                    return iMolybdenite;
                case 12:
                    gintrap gintrapVar3 = new gintrap();
                    int iRotuma = rotuma(bArr, i2, gintrapVar3, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, gintrapVar3);
                    return iRotuma;
                case 13:
                    kattegat kattegatVar3 = new kattegat();
                    int iPreprohormone = preprohormone(bArr, i2, kattegatVar3, sanenessVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, kattegatVar3);
                    return iPreprohormone;
                case 14:
                    gintrap gintrapVar4 = new gintrap();
                    int iCord2 = cord(bArr, i2, gintrapVar4, sanenessVar);
                    milliradian.stratoscope(dernVar, i6, gintrapVar4, marialVar.f22132saneness.dern(), null, lerpVar);
                    gravesideVar.rotuma(marialVar.f22132saneness, gintrapVar4);
                    return iCord2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + marialVar.f22132saneness.getLiteType());
            }
        }
        Object objValueOf = null;
        if (marialVar.attabal() == WireFormat.FieldType.ENUM) {
            i2 = merc(bArr, i2, sanenessVar);
            if (marialVar.f22132saneness.dern().findValueByNumber(sanenessVar.f22243attabal) == null) {
                milliradian.seminary(dernVar, i6, sanenessVar.f22243attabal, null, lerpVar);
                return i2;
            }
            objValueOf = Integer.valueOf(sanenessVar.f22243attabal);
        } else {
            switch (attabal.f22242attabal[marialVar.attabal().ordinal()]) {
                case 1:
                    i4 = i2;
                    objValueOf = Double.valueOf(marial(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 2:
                    i5 = i2;
                    objValueOf = Float.valueOf(impassible(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 3:
                case 4:
                    i2 = grimness(bArr, i2, sanenessVar);
                    objValueOf = Long.valueOf(sanenessVar.f22246saneness);
                    break;
                case 5:
                case 6:
                    i2 = merc(bArr, i2, sanenessVar);
                    objValueOf = Integer.valueOf(sanenessVar.f22243attabal);
                    break;
                case 7:
                case 8:
                    i4 = i2;
                    objValueOf = Long.valueOf(apical(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 9:
                case 10:
                    i5 = i2;
                    objValueOf = Integer.valueOf(taiyuan(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 11:
                    i2 = grimness(bArr, i2, sanenessVar);
                    objValueOf = Boolean.valueOf(sanenessVar.f22246saneness != 0);
                    break;
                case 12:
                    i2 = merc(bArr, i2, sanenessVar);
                    objValueOf = Integer.valueOf(taiyuan.wireman(sanenessVar.f22243attabal));
                    break;
                case 13:
                    i2 = grimness(bArr, i2, sanenessVar);
                    objValueOf = Long.valueOf(taiyuan.marial(sanenessVar.f22246saneness));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = dern(bArr, i2, sanenessVar);
                    objValueOf = sanenessVar.f22244dern;
                    break;
                case 16:
                    i2 = oilcan(bArr, i2, sanenessVar);
                    objValueOf = sanenessVar.f22244dern;
                    break;
                case 17:
                    int i7 = (i6 << 3) | 4;
                    premeiotic premeioticVarDern = clubfoot.attabal().dern(marialVar.saneness().getClass());
                    if (marialVar.wireman()) {
                        int iKowloon = kowloon(premeioticVarDern, bArr, i2, i3, i7, sanenessVar);
                        gravesideVar.attabal(marialVar.f22132saneness, sanenessVar.f22244dern);
                        return iKowloon;
                    }
                    Object objTaiyuan = gravesideVar.taiyuan(marialVar.f22132saneness);
                    if (objTaiyuan == null) {
                        objTaiyuan = premeioticVarDern.newInstance();
                        gravesideVar.rotuma(marialVar.f22132saneness, objTaiyuan);
                    }
                    return privatdozent(objTaiyuan, premeioticVarDern, bArr, i2, i3, i7, sanenessVar);
                case 18:
                    premeiotic premeioticVarDern2 = clubfoot.attabal().dern(marialVar.saneness().getClass());
                    if (marialVar.wireman()) {
                        int iMonoploid = monoploid(premeioticVarDern2, bArr, i2, i3, sanenessVar);
                        gravesideVar.attabal(marialVar.f22132saneness, sanenessVar.f22244dern);
                        return iMonoploid;
                    }
                    Object objTaiyuan2 = gravesideVar.taiyuan(marialVar.f22132saneness);
                    if (objTaiyuan2 == null) {
                        objTaiyuan2 = premeioticVarDern2.newInstance();
                        gravesideVar.rotuma(marialVar.f22132saneness, objTaiyuan2);
                    }
                    return creditor(objTaiyuan2, premeioticVarDern2, bArr, i2, i3, sanenessVar);
            }
        }
        if (marialVar.wireman()) {
            gravesideVar.attabal(marialVar.f22132saneness, objValueOf);
            return i2;
        }
        gravesideVar.rotuma(marialVar.f22132saneness, objValueOf);
        return i2;
    }

    public static int cord(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws IOException {
        gintrap gintrapVar = (gintrap) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal + iMerc;
        while (iMerc < i2) {
            iMerc = merc(bArr, iMerc, sanenessVar);
            gintrapVar.addInt(sanenessVar.f22243attabal);
        }
        if (iMerc == i2) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static <T> int creditor(Object obj, premeiotic<T> premeioticVar, byte[] bArr, int i, int i2, saneness sanenessVar) throws IOException {
        int iRestrictive = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iRestrictive = restrictive(i3, bArr, iRestrictive, sanenessVar);
            i3 = sanenessVar.f22243attabal;
        }
        int i4 = iRestrictive;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = sanenessVar.f22245marial + 1;
        sanenessVar.f22245marial = i5;
        attabal(i5);
        int i6 = i4 + i3;
        premeioticVar.attabal(obj, bArr, i4, i6, sanenessVar);
        sanenessVar.f22245marial--;
        sanenessVar.f22244dern = obj;
        return i6;
    }

    public static int cuirassed(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws IOException {
        kattegat kattegatVar = (kattegat) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal + iMerc;
        while (iMerc < i2) {
            iMerc = grimness(bArr, iMerc, sanenessVar);
            kattegatVar.addLong(sanenessVar.f22246saneness);
        }
        if (iMerc == i2) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int cutely(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        gintrap gintrapVar = (gintrap) taiyuanVar;
        gintrapVar.addInt(taiyuan(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iMerc = merc(bArr, i4, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            gintrapVar.addInt(taiyuan(bArr, iMerc));
            i4 = iMerc + 4;
        }
        return i4;
    }

    public static int dern(byte[] bArr, int i, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iMerc) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            sanenessVar.f22244dern = ByteString.EMPTY;
            return iMerc;
        }
        sanenessVar.f22244dern = ByteString.copyFrom(bArr, iMerc, i2);
        return iMerc + i2;
    }

    public static int dovishness(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        kattegat kattegatVar = (kattegat) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        int i3 = iMerc + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        kattegatVar.beachfront(kattegatVar.size() + (i2 / 8));
        while (iMerc < i3) {
            kattegatVar.addLong(apical(bArr, iMerc));
            iMerc += 8;
        }
        if (iMerc == i3) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int formularize(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        kattegat kattegatVar = (kattegat) taiyuanVar;
        kattegatVar.addLong(apical(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iMerc = merc(bArr, i4, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            kattegatVar.addLong(apical(bArr, iMerc));
            i4 = iMerc + 8;
        }
        return i4;
    }

    public static int gintrap(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        adultoid adultoidVar = (adultoid) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        int i3 = iMerc + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        adultoidVar.beachfront(adultoidVar.size() + (i2 / 4));
        while (iMerc < i3) {
            adultoidVar.addFloat(impassible(bArr, iMerc));
            iMerc += 4;
        }
        if (iMerc == i3) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int graveside(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        formularize formularizeVar = (formularize) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        int i3 = iMerc + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        formularizeVar.beachfront(formularizeVar.size() + (i2 / 8));
        while (iMerc < i3) {
            formularizeVar.addDouble(marial(bArr, iMerc));
            iMerc += 8;
        }
        if (iMerc == i3) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int grimness(byte[] bArr, int i, saneness sanenessVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return seminary(j, bArr, i2, sanenessVar);
        }
        sanenessVar.f22246saneness = j;
        return i2;
    }

    public static float impassible(byte[] bArr, int i) {
        return Float.intBitsToFloat(taiyuan(bArr, i));
    }

    public static int impromptu(int i, byte[] bArr, int i2, int i3, Object obj, privatdozent privatdozentVar, lerp<nosophobia, nosophobia> lerpVar, saneness sanenessVar) throws IOException {
        GeneratedMessageLite.marial marialVarAttabal = sanenessVar.f22247wireman.attabal(privatdozentVar, i >>> 3);
        if (marialVarAttabal == null) {
            return supplicat(i, bArr, i2, i3, hydrovane.arytenoidectomy(obj), sanenessVar);
        }
        GeneratedMessageLite.dern dernVar = (GeneratedMessageLite.dern) obj;
        dernVar.starveling();
        return competently(i, bArr, i2, i3, dernVar, marialVarAttabal, lerpVar, sanenessVar);
    }

    public static int kattegat(byte[] bArr, int i, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            sanenessVar.f22244dern = "";
            return iMerc;
        }
        sanenessVar.f22244dern = Utf8.impromptu(bArr, iMerc, i2);
        return iMerc + i2;
    }

    public static <T> int kowloon(premeiotic<T> premeioticVar, byte[] bArr, int i, int i2, int i3, saneness sanenessVar) throws IOException {
        T tNewInstance = premeioticVar.newInstance();
        int iPrivatdozent = privatdozent(tNewInstance, premeioticVar, bArr, i, i2, i3, sanenessVar);
        premeioticVar.makeImmutable(tNewInstance);
        sanenessVar.f22244dern = tNewInstance;
        return iPrivatdozent;
    }

    public static double marial(byte[] bArr, int i) {
        return Double.longBitsToDouble(apical(bArr, i));
    }

    public static int merc(byte[] bArr, int i, saneness sanenessVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return restrictive(b, bArr, i2, sanenessVar);
        }
        sanenessVar.f22243attabal = b;
        return i2;
    }

    public static int molybdenite(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        beachfront beachfrontVar = (beachfront) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal + iMerc;
        while (iMerc < i2) {
            iMerc = grimness(bArr, iMerc, sanenessVar);
            beachfrontVar.addBoolean(sanenessVar.f22246saneness != 0);
        }
        if (iMerc == i2) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static <T> int monoploid(premeiotic<T> premeioticVar, byte[] bArr, int i, int i2, saneness sanenessVar) throws IOException {
        T tNewInstance = premeioticVar.newInstance();
        int iCreditor = creditor(tNewInstance, premeioticVar, bArr, i, i2, sanenessVar);
        premeioticVar.makeImmutable(tNewInstance);
        sanenessVar.f22244dern = tNewInstance;
        return iCreditor;
    }

    public static int oilcan(byte[] bArr, int i, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            sanenessVar.f22244dern = "";
            return iMerc;
        }
        sanenessVar.f22244dern = new String(bArr, iMerc, i2, rotuma.f22277saneness);
        return iMerc + i2;
    }

    public static int polder(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        gintrap gintrapVar = (gintrap) taiyuanVar;
        int iMerc = merc(bArr, i2, sanenessVar);
        gintrapVar.addInt(sanenessVar.f22243attabal);
        while (iMerc < i3) {
            int iMerc2 = merc(bArr, iMerc, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iMerc = merc(bArr, iMerc2, sanenessVar);
            gintrapVar.addInt(sanenessVar.f22243attabal);
        }
        return iMerc;
    }

    public static int polloi(premeiotic<?> premeioticVar, int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws IOException {
        int iMonoploid = monoploid(premeioticVar, bArr, i2, i3, sanenessVar);
        taiyuanVar.add(sanenessVar.f22244dern);
        while (iMonoploid < i3) {
            int iMerc = merc(bArr, iMonoploid, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iMonoploid = monoploid(premeioticVar, bArr, iMerc, i3, sanenessVar);
            taiyuanVar.add(sanenessVar.f22244dern);
        }
        return iMonoploid;
    }

    public static int preprohormone(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        kattegat kattegatVar = (kattegat) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal + iMerc;
        while (iMerc < i2) {
            iMerc = grimness(bArr, iMerc, sanenessVar);
            kattegatVar.addLong(taiyuan.marial(sanenessVar.f22246saneness));
        }
        if (iMerc == i2) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static <T> int privatdozent(Object obj, premeiotic<T> premeioticVar, byte[] bArr, int i, int i2, int i3, saneness sanenessVar) throws IOException {
        int i4 = sanenessVar.f22245marial + 1;
        sanenessVar.f22245marial = i4;
        attabal(i4);
        int iOverspeculate = ((hydrovane) premeioticVar).overspeculate(obj, bArr, i, i2, i3, sanenessVar);
        sanenessVar.f22245marial--;
        sanenessVar.f22244dern = obj;
        return iOverspeculate;
    }

    public static int restrictive(int i, byte[] bArr, int i2, saneness sanenessVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            sanenessVar.f22243attabal = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            sanenessVar.f22243attabal = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            sanenessVar.f22243attabal = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            sanenessVar.f22243attabal = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                sanenessVar.f22243attabal = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int rotuma(byte[] bArr, int i, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        gintrap gintrapVar = (gintrap) taiyuanVar;
        int iMerc = merc(bArr, i, sanenessVar);
        int i2 = sanenessVar.f22243attabal + iMerc;
        while (iMerc < i2) {
            iMerc = merc(bArr, iMerc, sanenessVar);
            gintrapVar.addInt(taiyuan.wireman(sanenessVar.f22243attabal));
        }
        if (iMerc == i2) {
            return iMerc;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int saneness(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        beachfront beachfrontVar = (beachfront) taiyuanVar;
        int iGrimness = grimness(bArr, i2, sanenessVar);
        beachfrontVar.addBoolean(sanenessVar.f22246saneness != 0);
        while (iGrimness < i3) {
            int iMerc = merc(bArr, iGrimness, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iGrimness = grimness(bArr, iMerc, sanenessVar);
            beachfrontVar.addBoolean(sanenessVar.f22246saneness != 0);
        }
        return iGrimness;
    }

    public static int saran(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        kattegat kattegatVar = (kattegat) taiyuanVar;
        int iGrimness = grimness(bArr, i2, sanenessVar);
        kattegatVar.addLong(sanenessVar.f22246saneness);
        while (iGrimness < i3) {
            int iMerc = merc(bArr, iGrimness, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iGrimness = grimness(bArr, iMerc, sanenessVar);
            kattegatVar.addLong(sanenessVar.f22246saneness);
        }
        return iGrimness;
    }

    public static int sealless(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iMerc = merc(bArr, i2, sanenessVar);
        int i4 = sanenessVar.f22243attabal;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            taiyuanVar.add("");
        } else {
            int i5 = iMerc + i4;
            if (!Utf8.molybdenite(bArr, iMerc, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            taiyuanVar.add(new String(bArr, iMerc, i4, rotuma.f22277saneness));
            iMerc = i5;
        }
        while (iMerc < i3) {
            int iMerc2 = merc(bArr, iMerc, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iMerc = merc(bArr, iMerc2, sanenessVar);
            int i6 = sanenessVar.f22243attabal;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                taiyuanVar.add("");
            } else {
                int i7 = iMerc + i6;
                if (!Utf8.molybdenite(bArr, iMerc, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                taiyuanVar.add(new String(bArr, iMerc, i6, rotuma.f22277saneness));
                iMerc = i7;
            }
        }
        return iMerc;
    }

    public static int seminary(long j, byte[] bArr, int i, saneness sanenessVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & 127)) << i3;
            i2 = i4;
            b = b2;
        }
        sanenessVar.f22246saneness = j2;
        return i2;
    }

    public static int starveling(int i, byte[] bArr, int i2, int i3, saneness sanenessVar) throws InvalidProtocolBufferException {
        if (WireFormat.attabal(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iSaneness = WireFormat.saneness(i);
        if (iSaneness == 0) {
            return grimness(bArr, i2, sanenessVar);
        }
        if (iSaneness == 1) {
            return i2 + 8;
        }
        if (iSaneness == 2) {
            return merc(bArr, i2, sanenessVar) + sanenessVar.f22243attabal;
        }
        if (iSaneness != 3) {
            if (iSaneness == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = merc(bArr, i2, sanenessVar);
            i5 = sanenessVar.f22243attabal;
            if (i5 == i4) {
                break;
            }
            i2 = starveling(i5, bArr, i2, i3, sanenessVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static int stratoscope(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        gintrap gintrapVar = (gintrap) taiyuanVar;
        int iMerc = merc(bArr, i2, sanenessVar);
        gintrapVar.addInt(taiyuan.wireman(sanenessVar.f22243attabal));
        while (iMerc < i3) {
            int iMerc2 = merc(bArr, iMerc, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iMerc = merc(bArr, iMerc2, sanenessVar);
            gintrapVar.addInt(taiyuan.wireman(sanenessVar.f22243attabal));
        }
        return iMerc;
    }

    public static int supplicat(int i, byte[] bArr, int i2, int i3, nosophobia nosophobiaVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        if (WireFormat.attabal(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int iSaneness = WireFormat.saneness(i);
        if (iSaneness == 0) {
            int iGrimness = grimness(bArr, i2, sanenessVar);
            nosophobiaVar.triweekly(i, Long.valueOf(sanenessVar.f22246saneness));
            return iGrimness;
        }
        if (iSaneness == 1) {
            nosophobiaVar.triweekly(i, Long.valueOf(apical(bArr, i2)));
            return i2 + 8;
        }
        if (iSaneness == 2) {
            int iMerc = merc(bArr, i2, sanenessVar);
            int i4 = sanenessVar.f22243attabal;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - iMerc) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                nosophobiaVar.triweekly(i, ByteString.EMPTY);
            } else {
                nosophobiaVar.triweekly(i, ByteString.copyFrom(bArr, iMerc, i4));
            }
            return iMerc + i4;
        }
        if (iSaneness != 3) {
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            nosophobiaVar.triweekly(i, Integer.valueOf(taiyuan(bArr, i2)));
            return i2 + 4;
        }
        nosophobia nosophobiaVarApical = nosophobia.apical();
        int i5 = (i & (-8)) | 4;
        int i6 = sanenessVar.f22245marial + 1;
        sanenessVar.f22245marial = i6;
        attabal(i6);
        int i7 = 0;
        while (i2 < i3) {
            int iMerc2 = merc(bArr, i2, sanenessVar);
            i7 = sanenessVar.f22243attabal;
            if (i7 == i5) {
                i2 = iMerc2;
                break;
            }
            i2 = supplicat(i7, bArr, iMerc2, i3, nosophobiaVarApical, sanenessVar);
        }
        sanenessVar.f22245marial--;
        if (i2 > i3 || i7 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        nosophobiaVar.triweekly(i, nosophobiaVarApical);
        return i2;
    }

    public static int taiyuan(byte[] bArr, int i) {
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static int triweekly(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        adultoid adultoidVar = (adultoid) taiyuanVar;
        adultoidVar.addFloat(impassible(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iMerc = merc(bArr, i4, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            adultoidVar.addFloat(impassible(bArr, iMerc));
            i4 = iMerc + 4;
        }
        return i4;
    }

    public static int trm(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) {
        kattegat kattegatVar = (kattegat) taiyuanVar;
        int iGrimness = grimness(bArr, i2, sanenessVar);
        kattegatVar.addLong(taiyuan.marial(sanenessVar.f22246saneness));
        while (iGrimness < i3) {
            int iMerc = merc(bArr, iGrimness, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iGrimness = grimness(bArr, iMerc, sanenessVar);
            kattegatVar.addLong(taiyuan.marial(sanenessVar.f22246saneness));
        }
        return iGrimness;
    }

    public static int wireman(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iMerc = merc(bArr, i2, sanenessVar);
        int i4 = sanenessVar.f22243attabal;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - iMerc) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            taiyuanVar.add(ByteString.EMPTY);
        } else {
            taiyuanVar.add(ByteString.copyFrom(bArr, iMerc, i4));
            iMerc += i4;
        }
        while (iMerc < i3) {
            int iMerc2 = merc(bArr, iMerc, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iMerc = merc(bArr, iMerc2, sanenessVar);
            int i5 = sanenessVar.f22243attabal;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iMerc) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                taiyuanVar.add(ByteString.EMPTY);
            } else {
                taiyuanVar.add(ByteString.copyFrom(bArr, iMerc, i5));
                iMerc += i5;
            }
        }
        return iMerc;
    }

    public static int yemenite(int i, byte[] bArr, int i2, int i3, rotuma.taiyuan<?> taiyuanVar, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iMerc = merc(bArr, i2, sanenessVar);
        int i4 = sanenessVar.f22243attabal;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            taiyuanVar.add("");
        } else {
            taiyuanVar.add(new String(bArr, iMerc, i4, rotuma.f22277saneness));
            iMerc += i4;
        }
        while (iMerc < i3) {
            int iMerc2 = merc(bArr, iMerc, sanenessVar);
            if (i != sanenessVar.f22243attabal) {
                break;
            }
            iMerc = merc(bArr, iMerc2, sanenessVar);
            int i5 = sanenessVar.f22243attabal;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                taiyuanVar.add("");
            } else {
                taiyuanVar.add(new String(bArr, iMerc, i5, rotuma.f22277saneness));
                iMerc += i5;
            }
        }
        return iMerc;
    }
}

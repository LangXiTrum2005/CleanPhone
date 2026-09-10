package ghoulish;

import androidx.media3.common.ParserException;

/* JADX INFO: compiled from: MpeghUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness {

    /* JADX INFO: compiled from: MpeghUtil.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f26874attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f26875dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f26876saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final byte[] f26877wireman;

        public dern(int i, int i2, int i3, byte[] bArr) {
            this.f26874attabal = i;
            this.f26876saneness = i2;
            this.f26875dern = i3;
            this.f26877wireman = bArr;
        }
    }

    /* JADX INFO: compiled from: MpeghUtil.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f26878attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f26879dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f26880saneness;
    }

    public static int apical(decarock.cuirassed cuirassedVar, int i, int i2, int i3) {
        decarock.attabal.attabal(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        moresque.dern.attabal(moresque.dern.attabal(i4, i5), 1 << i3);
        if (cuirassedVar.saneness() < i) {
            return -1;
        }
        int iImpromptu = cuirassedVar.impromptu(i);
        if (iImpromptu != i4) {
            return iImpromptu;
        }
        if (cuirassedVar.saneness() < i2) {
            return -1;
        }
        int iImpromptu2 = cuirassedVar.impromptu(i2);
        int i6 = iImpromptu + iImpromptu2;
        if (iImpromptu2 != i5) {
            return i6;
        }
        if (cuirassedVar.saneness() < i3) {
            return -1;
        }
        return i6 + cuirassedVar.impromptu(i3);
    }

    public static void arytenoidectomy(decarock.cuirassed cuirassedVar) {
        int iImpromptu = cuirassedVar.impromptu(2);
        if (iImpromptu == 0) {
            cuirassedVar.polloi(6);
            return;
        }
        int iApical = apical(cuirassedVar, 5, 8, 16) + 1;
        if (iImpromptu == 1) {
            cuirassedVar.polloi(iApical * 7);
        } else if (iImpromptu == 2) {
            triweekly(cuirassedVar, iApical);
        }
    }

    public static int attabal(int i) throws ParserException {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i);
    }

    public static int beachfront(decarock.cuirassed cuirassedVar) {
        if (!cuirassedVar.competently()) {
            return 0;
        }
        cuirassedVar.polloi(2);
        return cuirassedVar.impromptu(13);
    }

    public static boolean competently(decarock.cuirassed cuirassedVar, saneness sanenessVar) throws ParserException {
        cuirassedVar.wireman();
        int iApical = apical(cuirassedVar, 3, 8, 8);
        sanenessVar.f26878attabal = iApical;
        if (iApical == -1) {
            return false;
        }
        long jFormularize = formularize(cuirassedVar, 2, 8, 32);
        sanenessVar.f26880saneness = jFormularize;
        if (jFormularize == -1) {
            return false;
        }
        if (jFormularize > 16) {
            throw ParserException.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + sanenessVar.f26880saneness);
        }
        if (jFormularize == 0) {
            int i = sanenessVar.f26878attabal;
            if (i == 1) {
                throw ParserException.createForMalformedContainer("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw ParserException.createForMalformedContainer("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw ParserException.createForMalformedContainer("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iApical2 = apical(cuirassedVar, 11, 24, 24);
        sanenessVar.f26879dern = iApical2;
        return iApical2 != -1;
    }

    public static int cutely(decarock.cuirassed cuirassedVar) {
        int iImpromptu = cuirassedVar.impromptu(5);
        int iApical = 0;
        for (int i = 0; i < iImpromptu + 1; i++) {
            int iImpromptu2 = cuirassedVar.impromptu(3);
            iApical += apical(cuirassedVar, 5, 8, 16) + 1;
            if ((iImpromptu2 == 0 || iImpromptu2 == 2) && cuirassedVar.competently()) {
                arytenoidectomy(cuirassedVar);
            }
        }
        return iApical;
    }

    public static int dern(int i) throws ParserException {
        switch (i) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate index " + i);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static long formularize(decarock.cuirassed cuirassedVar, int i, int i2, int i3) {
        decarock.attabal.attabal(Math.max(Math.max(i, i2), i3) <= 63);
        long j = (1 << i) - 1;
        long j2 = (1 << i2) - 1;
        moresque.wireman.attabal(moresque.wireman.attabal(j, j2), 1 << i3);
        if (cuirassedVar.saneness() < i) {
            return -1L;
        }
        long jCutely = cuirassedVar.cutely(i);
        if (jCutely != j) {
            return jCutely;
        }
        if (cuirassedVar.saneness() < i2) {
            return -1L;
        }
        long jCutely2 = cuirassedVar.cutely(i2);
        long j3 = jCutely + jCutely2;
        if (jCutely2 != j2) {
            return j3;
        }
        if (cuirassedVar.saneness() < i3) {
            return -1L;
        }
        return j3 + cuirassedVar.cutely(i3);
    }

    public static void impassible(decarock.cuirassed cuirassedVar, int i, int i2) {
        int iImpromptu;
        int iApical = apical(cuirassedVar, 4, 8, 16) + 1;
        cuirassedVar.monoploid();
        for (int i3 = 0; i3 < iApical; i3++) {
            int iImpromptu2 = cuirassedVar.impromptu(2);
            if (iImpromptu2 == 0) {
                taiyuan(cuirassedVar);
                if (i2 > 0) {
                    kowloon(cuirassedVar);
                }
            } else if (iImpromptu2 == 1) {
                if (taiyuan(cuirassedVar)) {
                    cuirassedVar.monoploid();
                }
                if (i2 > 0) {
                    kowloon(cuirassedVar);
                    iImpromptu = cuirassedVar.impromptu(2);
                } else {
                    iImpromptu = 0;
                }
                if (iImpromptu > 0) {
                    cuirassedVar.polloi(6);
                    int iImpromptu3 = cuirassedVar.impromptu(2);
                    cuirassedVar.polloi(4);
                    if (cuirassedVar.competently()) {
                        cuirassedVar.polloi(5);
                    }
                    if (iImpromptu == 2 || iImpromptu == 3) {
                        cuirassedVar.polloi(6);
                    }
                    if (iImpromptu3 == 2) {
                        cuirassedVar.monoploid();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i - 1) / Math.log(2.0d))) + 1;
                int iImpromptu4 = cuirassedVar.impromptu(2);
                if (iImpromptu4 > 0 && cuirassedVar.competently()) {
                    cuirassedVar.polloi(iFloor);
                }
                if (cuirassedVar.competently()) {
                    cuirassedVar.polloi(iFloor);
                }
                if (i2 == 0 && iImpromptu4 == 0) {
                    cuirassedVar.monoploid();
                }
            } else if (iImpromptu2 == 3) {
                apical(cuirassedVar, 4, 8, 16);
                int iApical2 = apical(cuirassedVar, 4, 8, 16);
                if (cuirassedVar.competently()) {
                    apical(cuirassedVar, 8, 16, 0);
                }
                cuirassedVar.monoploid();
                if (iApical2 > 0) {
                    cuirassedVar.polloi(iApical2 * 8);
                }
            }
        }
    }

    public static dern impromptu(decarock.cuirassed cuirassedVar) throws ParserException {
        int iImpromptu = cuirassedVar.impromptu(8);
        int iImpromptu2 = cuirassedVar.impromptu(5);
        int iImpromptu3 = iImpromptu2 == 31 ? cuirassedVar.impromptu(24) : dern(iImpromptu2);
        int iImpromptu4 = cuirassedVar.impromptu(3);
        int iAttabal = attabal(iImpromptu4);
        int iWireman = wireman(iImpromptu4);
        cuirassedVar.polloi(2);
        arytenoidectomy(cuirassedVar);
        impassible(cuirassedVar, cutely(cuirassedVar), iWireman);
        byte[] bArr = null;
        if (cuirassedVar.competently()) {
            int iApical = apical(cuirassedVar, 2, 4, 8) + 1;
            for (int i = 0; i < iApical; i++) {
                int iApical2 = apical(cuirassedVar, 4, 8, 16);
                int iApical3 = apical(cuirassedVar, 4, 8, 16);
                if (iApical2 == 7) {
                    int iImpromptu5 = cuirassedVar.impromptu(4) + 1;
                    cuirassedVar.polloi(4);
                    byte[] bArr2 = new byte[iImpromptu5];
                    for (int i2 = 0; i2 < iImpromptu5; i2++) {
                        bArr2[i2] = (byte) cuirassedVar.impromptu(8);
                    }
                    bArr = bArr2;
                } else {
                    cuirassedVar.polloi(iApical3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dSaneness = saneness(iImpromptu3);
        return new dern(iImpromptu, (int) (((double) iImpromptu3) * dSaneness), (int) (((double) iAttabal) * dSaneness), bArr3);
    }

    public static void kowloon(decarock.cuirassed cuirassedVar) {
        cuirassedVar.polloi(3);
        cuirassedVar.polloi(8);
        boolean zCompetently = cuirassedVar.competently();
        boolean zCompetently2 = cuirassedVar.competently();
        if (zCompetently) {
            cuirassedVar.polloi(5);
        }
        if (zCompetently2) {
            cuirassedVar.polloi(6);
        }
    }

    public static boolean marial(int i) {
        return (i & 16777215) == 12583333;
    }

    public static double saneness(int i) throws ParserException {
        switch (i) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.createForUnsupportedContainerFeature("Unsupported sampling rate " + i);
        }
    }

    public static boolean taiyuan(decarock.cuirassed cuirassedVar) {
        cuirassedVar.polloi(3);
        boolean zCompetently = cuirassedVar.competently();
        if (zCompetently) {
            cuirassedVar.polloi(13);
        }
        return zCompetently;
    }

    public static void triweekly(decarock.cuirassed cuirassedVar, int i) {
        int iImpromptu;
        boolean zCompetently = cuirassedVar.competently();
        int i2 = zCompetently ? 1 : 5;
        int i3 = zCompetently ? 7 : 5;
        int i4 = zCompetently ? 8 : 6;
        int i5 = 0;
        while (i5 < i) {
            if (cuirassedVar.competently()) {
                cuirassedVar.polloi(7);
                iImpromptu = 0;
            } else {
                if (cuirassedVar.impromptu(2) == 3 && cuirassedVar.impromptu(i3) * i2 != 0) {
                    cuirassedVar.monoploid();
                }
                iImpromptu = cuirassedVar.impromptu(i4) * i2;
                if (iImpromptu != 0 && iImpromptu != 180) {
                    cuirassedVar.monoploid();
                }
                cuirassedVar.monoploid();
            }
            if (iImpromptu != 0 && iImpromptu != 180 && cuirassedVar.competently()) {
                i5++;
            }
            i5++;
        }
    }

    public static int wireman(int i) throws ParserException {
        if (i == 0 || i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                throw ParserException.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i);
            }
        }
        return i2;
    }
}

package cybernatic;

import androidx.media3.common.ParserException;

/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f24601attabal = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f24602saneness = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: AacUtil.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24603attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String f24604dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24605saneness;

        public saneness(int i, int i2, String str) {
            this.f24603attabal = i;
            this.f24605saneness = i2;
            this.f24604dern = str;
        }
    }

    public static byte[] attabal(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static void beachfront(decarock.cuirassed cuirassedVar, int i, int i2) {
        if (cuirassedVar.competently()) {
            decarock.triweekly.impromptu("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (cuirassedVar.competently()) {
            cuirassedVar.polloi(14);
        }
        boolean zCompetently = cuirassedVar.competently();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            cuirassedVar.polloi(3);
        }
        if (zCompetently) {
            if (i == 22) {
                cuirassedVar.polloi(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                cuirassedVar.polloi(3);
            }
            cuirassedVar.polloi(1);
        }
    }

    public static int dern(decarock.cuirassed cuirassedVar) throws ParserException {
        int iImpromptu = cuirassedVar.impromptu(4);
        if (iImpromptu == 15) {
            if (cuirassedVar.saneness() >= 24) {
                return cuirassedVar.impromptu(24);
            }
            throw ParserException.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (iImpromptu < 13) {
            return f24601attabal[iImpromptu];
        }
        throw ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    public static saneness marial(byte[] bArr) throws ParserException {
        return wireman(new decarock.cuirassed(bArr), false);
    }

    public static int saneness(decarock.cuirassed cuirassedVar) {
        int iImpromptu = cuirassedVar.impromptu(5);
        return iImpromptu == 31 ? cuirassedVar.impromptu(6) + 32 : iImpromptu;
    }

    public static saneness wireman(decarock.cuirassed cuirassedVar, boolean z) throws ParserException {
        int iSaneness = saneness(cuirassedVar);
        int iDern = dern(cuirassedVar);
        int iImpromptu = cuirassedVar.impromptu(4);
        String str = "mp4a.40." + iSaneness;
        if (iSaneness == 5 || iSaneness == 29) {
            iDern = dern(cuirassedVar);
            iSaneness = saneness(cuirassedVar);
            if (iSaneness == 22) {
                iImpromptu = cuirassedVar.impromptu(4);
            }
        }
        if (z) {
            if (iSaneness != 1 && iSaneness != 2 && iSaneness != 3 && iSaneness != 4 && iSaneness != 6 && iSaneness != 7 && iSaneness != 17) {
                switch (iSaneness) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + iSaneness);
                }
            }
            beachfront(cuirassedVar, iSaneness, iImpromptu);
            switch (iSaneness) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iImpromptu2 = cuirassedVar.impromptu(2);
                    if (iImpromptu2 == 2 || iImpromptu2 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + iImpromptu2);
                    }
                    break;
            }
        }
        int i = f24602saneness[iImpromptu];
        if (i != -1) {
            return new saneness(iDern, i, str);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }
}

package cybernatic;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: VorbisUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class hydrovane {

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f24653attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24654dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String[] f24655saneness;

        public attabal(String str, String[] strArr, int i) {
            this.f24653attabal = str;
            this.f24655saneness = strArr;
            this.f24654dern = i;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24656attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f24657beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final int f24658competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final byte[] f24659cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24660dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final int f24661impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f24662marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24663saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final boolean f24664taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24665wireman;

        public dern(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f24656attabal = i;
            this.f24663saneness = i2;
            this.f24660dern = i3;
            this.f24665wireman = i4;
            this.f24662marial = i5;
            this.f24657beachfront = i6;
            this.f24658competently = i7;
            this.f24661impromptu = i8;
            this.f24664taiyuan = z;
            this.f24659cutely = bArr;
        }
    }

    /* JADX INFO: compiled from: VorbisUtil.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f24666attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24667dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24668saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24669wireman;

        public saneness(boolean z, int i, int i2, int i3) {
            this.f24666attabal = z;
            this.f24668saneness = i;
            this.f24667dern = i2;
            this.f24669wireman = i3;
        }
    }

    public static attabal apical(decarock.stratoscope stratoscopeVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            kowloon(3, stratoscopeVar, false);
        }
        String strYemenite = stratoscopeVar.yemenite((int) stratoscopeVar.rotuma());
        int length = strYemenite.length();
        long jRotuma = stratoscopeVar.rotuma();
        String[] strArr = new String[(int) jRotuma];
        int length2 = length + 15;
        for (int i = 0; i < jRotuma; i++) {
            String strYemenite2 = stratoscopeVar.yemenite((int) stratoscopeVar.rotuma());
            strArr[i] = strYemenite2;
            length2 = length2 + 4 + strYemenite2.length();
        }
        if (z2 && (stratoscopeVar.supplicat() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new attabal(strYemenite, strArr, length2 + 1);
    }

    public static int[] attabal(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static void beachfront(starveling starvelingVar) throws ParserException {
        int iWireman = starvelingVar.wireman(6) + 1;
        for (int i = 0; i < iWireman; i++) {
            int iWireman2 = starvelingVar.wireman(16);
            if (iWireman2 == 0) {
                starvelingVar.marial(8);
                starvelingVar.marial(16);
                starvelingVar.marial(16);
                starvelingVar.marial(6);
                starvelingVar.marial(8);
                int iWireman3 = starvelingVar.wireman(4) + 1;
                for (int i2 = 0; i2 < iWireman3; i2++) {
                    starvelingVar.marial(8);
                }
            } else {
                if (iWireman2 != 1) {
                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + iWireman2, null);
                }
                int iWireman4 = starvelingVar.wireman(5);
                int[] iArr = new int[iWireman4];
                int i3 = -1;
                for (int i4 = 0; i4 < iWireman4; i4++) {
                    int iWireman5 = starvelingVar.wireman(4);
                    iArr[i4] = iWireman5;
                    if (iWireman5 > i3) {
                        i3 = iWireman5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = starvelingVar.wireman(3) + 1;
                    int iWireman6 = starvelingVar.wireman(2);
                    if (iWireman6 > 0) {
                        starvelingVar.marial(8);
                    }
                    for (int i7 = 0; i7 < (1 << iWireman6); i7++) {
                        starvelingVar.marial(8);
                    }
                }
                starvelingVar.marial(2);
                int iWireman7 = starvelingVar.wireman(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iWireman4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        starvelingVar.marial(iWireman7);
                        i9++;
                    }
                }
            }
        }
    }

    public static void competently(int i, starveling starvelingVar) throws ParserException {
        int iWireman = starvelingVar.wireman(6) + 1;
        for (int i2 = 0; i2 < iWireman; i2++) {
            int iWireman2 = starvelingVar.wireman(16);
            if (iWireman2 != 0) {
                decarock.triweekly.dern("VorbisUtil", "mapping type other than 0 not supported: " + iWireman2);
            } else {
                int iWireman3 = starvelingVar.dern() ? starvelingVar.wireman(4) + 1 : 1;
                if (starvelingVar.dern()) {
                    int iWireman4 = starvelingVar.wireman(8) + 1;
                    for (int i3 = 0; i3 < iWireman4; i3++) {
                        int i4 = i - 1;
                        starvelingVar.marial(saneness(i4));
                        starvelingVar.marial(saneness(i4));
                    }
                }
                if (starvelingVar.wireman(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iWireman3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        starvelingVar.marial(4);
                    }
                }
                for (int i6 = 0; i6 < iWireman3; i6++) {
                    starvelingVar.marial(8);
                    starvelingVar.marial(8);
                    starvelingVar.marial(8);
                }
            }
        }
    }

    public static attabal cutely(decarock.stratoscope stratoscopeVar) throws ParserException {
        return apical(stratoscopeVar, true, true);
    }

    public static long dern(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static dern formularize(decarock.stratoscope stratoscopeVar) throws ParserException {
        kowloon(1, stratoscopeVar, false);
        int iPreprohormone = stratoscopeVar.preprohormone();
        int iSupplicat = stratoscopeVar.supplicat();
        int iPreprohormone2 = stratoscopeVar.preprohormone();
        int iAdultoid = stratoscopeVar.adultoid();
        if (iAdultoid <= 0) {
            iAdultoid = -1;
        }
        int iAdultoid2 = stratoscopeVar.adultoid();
        if (iAdultoid2 <= 0) {
            iAdultoid2 = -1;
        }
        int iAdultoid3 = stratoscopeVar.adultoid();
        if (iAdultoid3 <= 0) {
            iAdultoid3 = -1;
        }
        int iSupplicat2 = stratoscopeVar.supplicat();
        return new dern(iPreprohormone, iSupplicat, iPreprohormone2, iAdultoid, iAdultoid2, iAdultoid3, (int) Math.pow(2.0d, iSupplicat2 & 15), (int) Math.pow(2.0d, (iSupplicat2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (stratoscopeVar.supplicat() & 1) > 0, Arrays.copyOf(stratoscopeVar.marial(), stratoscopeVar.competently()));
    }

    public static saneness[] impassible(decarock.stratoscope stratoscopeVar, int i) throws ParserException {
        kowloon(5, stratoscopeVar, false);
        int iSupplicat = stratoscopeVar.supplicat() + 1;
        starveling starvelingVar = new starveling(stratoscopeVar.marial());
        starvelingVar.marial(stratoscopeVar.beachfront() * 8);
        for (int i2 = 0; i2 < iSupplicat; i2++) {
            triweekly(starvelingVar);
        }
        int iWireman = starvelingVar.wireman(6) + 1;
        for (int i3 = 0; i3 < iWireman; i3++) {
            if (starvelingVar.wireman(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        beachfront(starvelingVar);
        taiyuan(starvelingVar);
        competently(i, starvelingVar);
        saneness[] sanenessVarArrImpromptu = impromptu(starvelingVar);
        if (starvelingVar.dern()) {
            return sanenessVarArrImpromptu;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    public static saneness[] impromptu(starveling starvelingVar) {
        int iWireman = starvelingVar.wireman(6) + 1;
        saneness[] sanenessVarArr = new saneness[iWireman];
        for (int i = 0; i < iWireman; i++) {
            sanenessVarArr[i] = new saneness(starvelingVar.dern(), starvelingVar.wireman(16), starvelingVar.wireman(16), starvelingVar.wireman(8));
        }
        return sanenessVarArr;
    }

    public static boolean kowloon(int i, decarock.stratoscope stratoscopeVar, boolean z) throws ParserException {
        if (stratoscopeVar.attabal() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + stratoscopeVar.attabal(), null);
        }
        if (stratoscopeVar.supplicat() != i) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i), null);
        }
        if (stratoscopeVar.supplicat() == 118 && stratoscopeVar.supplicat() == 111 && stratoscopeVar.supplicat() == 114 && stratoscopeVar.supplicat() == 98 && stratoscopeVar.supplicat() == 105 && stratoscopeVar.supplicat() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static ImmutableList<byte[]> marial(byte[] bArr) {
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(bArr);
        stratoscopeVar.splinterproof(1);
        int i = 0;
        while (stratoscopeVar.attabal() > 0 && stratoscopeVar.cutely() == 255) {
            i += 255;
            stratoscopeVar.splinterproof(1);
        }
        int iSupplicat = i + stratoscopeVar.supplicat();
        int i2 = 0;
        while (stratoscopeVar.attabal() > 0 && stratoscopeVar.cutely() == 255) {
            i2 += 255;
            stratoscopeVar.splinterproof(1);
        }
        int iSupplicat2 = i2 + stratoscopeVar.supplicat();
        byte[] bArr2 = new byte[iSupplicat];
        int iBeachfront = stratoscopeVar.beachfront();
        System.arraycopy(bArr, iBeachfront, bArr2, 0, iSupplicat);
        int i3 = iBeachfront + iSupplicat + iSupplicat2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i3, bArr3, 0, length);
        return ImmutableList.of(bArr2, bArr3);
    }

    public static int saneness(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static void taiyuan(starveling starvelingVar) throws ParserException {
        int iWireman = starvelingVar.wireman(6) + 1;
        for (int i = 0; i < iWireman; i++) {
            if (starvelingVar.wireman(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            starvelingVar.marial(24);
            starvelingVar.marial(24);
            starvelingVar.marial(24);
            int iWireman2 = starvelingVar.wireman(6) + 1;
            starvelingVar.marial(8);
            int[] iArr = new int[iWireman2];
            for (int i2 = 0; i2 < iWireman2; i2++) {
                iArr[i2] = ((starvelingVar.dern() ? starvelingVar.wireman(5) : 0) * 8) + starvelingVar.wireman(3);
            }
            for (int i3 = 0; i3 < iWireman2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        starvelingVar.marial(8);
                    }
                }
            }
        }
    }

    public static void triweekly(starveling starvelingVar) throws ParserException {
        long jDern;
        if (starvelingVar.wireman(24) != 5653314) {
            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + starvelingVar.saneness(), null);
        }
        int iWireman = starvelingVar.wireman(16);
        int iWireman2 = starvelingVar.wireman(24);
        int iWireman3 = 0;
        if (starvelingVar.dern()) {
            starvelingVar.marial(5);
            while (iWireman3 < iWireman2) {
                iWireman3 += starvelingVar.wireman(saneness(iWireman2 - iWireman3));
            }
        } else {
            boolean zDern = starvelingVar.dern();
            while (iWireman3 < iWireman2) {
                if (!zDern) {
                    starvelingVar.marial(5);
                } else if (starvelingVar.dern()) {
                    starvelingVar.marial(5);
                }
                iWireman3++;
            }
        }
        int iWireman4 = starvelingVar.wireman(4);
        if (iWireman4 > 2) {
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + iWireman4, null);
        }
        if (iWireman4 == 1 || iWireman4 == 2) {
            starvelingVar.marial(32);
            starvelingVar.marial(32);
            int iWireman5 = starvelingVar.wireman(4) + 1;
            starvelingVar.marial(1);
            if (iWireman4 == 1) {
                jDern = iWireman != 0 ? dern(iWireman2, iWireman) : 0L;
            } else {
                jDern = ((long) iWireman) * ((long) iWireman2);
            }
            starvelingVar.marial((int) (jDern * ((long) iWireman5)));
        }
    }

    public static Metadata wireman(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrLicking = decarock.grimness.licking(str, X3.j.b);
            if (strArrLicking.length != 2) {
                decarock.triweekly.impromptu("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrLicking[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.attabal(new decarock.stratoscope(Base64.decode(strArrLicking[1], 0))));
                } catch (RuntimeException e) {
                    decarock.triweekly.taiyuan("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrLicking[0], strArrLicking[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}

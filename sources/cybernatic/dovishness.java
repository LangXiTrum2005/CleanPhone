package cybernatic;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;

/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness {

    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f24627attabal;
    }

    public static boolean attabal(decarock.stratoscope stratoscopeVar, preprohormone preprohormoneVar, int i) {
        int iCutely = cutely(stratoscopeVar, i);
        return iCutely != -1 && iCutely <= preprohormoneVar.f24734saneness;
    }

    public static boolean beachfront(int i, preprohormone preprohormoneVar) {
        return i == 0 || i == preprohormoneVar.f24735taiyuan;
    }

    public static boolean competently(int i, preprohormone preprohormoneVar) {
        if (i <= 7) {
            return i == preprohormoneVar.f24728competently - 1;
        }
        return i <= 10 && preprohormoneVar.f24728competently == 2;
    }

    public static int cutely(decarock.stratoscope stratoscopeVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return stratoscopeVar.supplicat() + 1;
            case 7:
                return stratoscopeVar.saran() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean dern(decarock.stratoscope stratoscopeVar, preprohormone preprohormoneVar, boolean z, attabal attabalVar) {
        try {
            long jPrivatdozent = stratoscopeVar.privatdozent();
            if (!z) {
                jPrivatdozent *= (long) preprohormoneVar.f24734saneness;
            }
            attabalVar.f24627attabal = jPrivatdozent;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean impromptu(monoploid monoploidVar, preprohormone preprohormoneVar, int i, attabal attabalVar) throws IOException {
        long peekPosition = monoploidVar.getPeekPosition();
        byte[] bArr = new byte[2];
        monoploidVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i) {
            monoploidVar.resetPeekPosition();
            monoploidVar.advancePeekPosition((int) (peekPosition - monoploidVar.getPosition()));
            return false;
        }
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(16);
        System.arraycopy(bArr, 0, stratoscopeVar.marial(), 0, 2);
        stratoscopeVar.peridotite(molybdenite.dern(monoploidVar, stratoscopeVar.marial(), 2, 14));
        monoploidVar.resetPeekPosition();
        monoploidVar.advancePeekPosition((int) (peekPosition - monoploidVar.getPosition()));
        return wireman(stratoscopeVar, preprohormoneVar, i, attabalVar);
    }

    public static boolean marial(decarock.stratoscope stratoscopeVar, preprohormone preprohormoneVar, int i) {
        int i2 = preprohormoneVar.f24733marial;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == preprohormoneVar.f24727beachfront;
        }
        if (i == 12) {
            return stratoscopeVar.supplicat() * 1000 == i2;
        }
        if (i <= 14) {
            int iSaran = stratoscopeVar.saran();
            if (i == 14) {
                iSaran *= 10;
            }
            if (iSaran == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean saneness(decarock.stratoscope stratoscopeVar, int i) {
        return stratoscopeVar.supplicat() == decarock.grimness.rotuma(stratoscopeVar.marial(), i, stratoscopeVar.beachfront() - 1, 0);
    }

    public static long taiyuan(monoploid monoploidVar, preprohormone preprohormoneVar) throws IOException {
        monoploidVar.resetPeekPosition();
        monoploidVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        monoploidVar.peekFully(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        monoploidVar.advancePeekPosition(2);
        int i = z ? 7 : 6;
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(i);
        stratoscopeVar.peridotite(molybdenite.dern(monoploidVar, stratoscopeVar.marial(), 0, i));
        monoploidVar.resetPeekPosition();
        attabal attabalVar = new attabal();
        if (dern(stratoscopeVar, preprohormoneVar, z, attabalVar)) {
            return attabalVar.f24627attabal;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static boolean wireman(decarock.stratoscope stratoscopeVar, preprohormone preprohormoneVar, int i, attabal attabalVar) {
        int iBeachfront = stratoscopeVar.beachfront();
        long jMerc = stratoscopeVar.merc();
        long j = jMerc >>> 16;
        if (j != i) {
            return false;
        }
        return competently((int) ((jMerc >> 4) & 15), preprohormoneVar) && beachfront((int) ((jMerc >> 1) & 7), preprohormoneVar) && !(((jMerc & 1) > 1L ? 1 : ((jMerc & 1) == 1L ? 0 : -1)) == 0) && dern(stratoscopeVar, preprohormoneVar, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, attabalVar) && attabal(stratoscopeVar, preprohormoneVar, (int) ((jMerc >> 12) & 15)) && marial(stratoscopeVar, preprohormoneVar, (int) ((jMerc >> 8) & 15)) && saneness(stratoscopeVar, iBeachfront);
    }
}

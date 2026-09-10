package cybernatic;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap {

    /* JADX INFO: compiled from: FlacMetadataReader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public preprohormone f24650attabal;

        public attabal(preprohormone preprohormoneVar) {
            this.f24650attabal = preprohormoneVar;
        }
    }

    public static boolean attabal(monoploid monoploidVar) throws IOException {
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(4);
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, 4);
        return stratoscopeVar.merc() == 1716281667;
    }

    public static preprohormone.attabal beachfront(monoploid monoploidVar, int i) throws IOException {
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(i);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, i);
        return competently(stratoscopeVar);
    }

    public static preprohormone.attabal competently(decarock.stratoscope stratoscopeVar) {
        stratoscopeVar.splinterproof(1);
        int iPolder = stratoscopeVar.polder();
        long jBeachfront = ((long) stratoscopeVar.beachfront()) + ((long) iPolder);
        int i = iPolder / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jCuirassed = stratoscopeVar.cuirassed();
            if (jCuirassed == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jCuirassed;
            jArrCopyOf2[i2] = stratoscopeVar.cuirassed();
            stratoscopeVar.splinterproof(2);
        }
        stratoscopeVar.splinterproof((int) (jBeachfront - ((long) stratoscopeVar.beachfront())));
        return new preprohormone.attabal(jArrCopyOf, jArrCopyOf2);
    }

    public static List<String> cutely(monoploid monoploidVar, int i) throws IOException {
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(i);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, i);
        stratoscopeVar.splinterproof(4);
        return Arrays.asList(hydrovane.apical(stratoscopeVar, false, false).f24655saneness);
    }

    public static Metadata dern(monoploid monoploidVar, boolean z) throws Throwable {
        Metadata metadataAttabal = new oilcan().attabal(monoploidVar, z ? null : imparkation.saneness.f28458saneness);
        if (metadataAttabal == null || metadataAttabal.length() == 0) {
            return null;
        }
        return metadataAttabal;
    }

    public static preprohormone impromptu(monoploid monoploidVar) throws IOException {
        byte[] bArr = new byte[38];
        monoploidVar.readFully(bArr, 0, 38);
        return new preprohormone(bArr, 4);
    }

    public static boolean marial(monoploid monoploidVar, attabal attabalVar) throws IOException {
        monoploidVar.resetPeekPosition();
        decarock.cuirassed cuirassedVar = new decarock.cuirassed(new byte[4]);
        monoploidVar.peekFully(cuirassedVar.f25071attabal, 0, 4);
        boolean zCompetently = cuirassedVar.competently();
        int iImpromptu = cuirassedVar.impromptu(7);
        int iImpromptu2 = cuirassedVar.impromptu(24) + 4;
        if (iImpromptu == 0) {
            attabalVar.f24650attabal = impromptu(monoploidVar);
            return zCompetently;
        }
        preprohormone preprohormoneVar = attabalVar.f24650attabal;
        if (preprohormoneVar == null) {
            throw new IllegalArgumentException();
        }
        if (iImpromptu == 3) {
            attabalVar.f24650attabal = preprohormoneVar.saneness(beachfront(monoploidVar, iImpromptu2));
            return zCompetently;
        }
        if (iImpromptu == 4) {
            attabalVar.f24650attabal = preprohormoneVar.dern(cutely(monoploidVar, iImpromptu2));
            return zCompetently;
        }
        if (iImpromptu != 6) {
            monoploidVar.skipFully(iImpromptu2);
            return zCompetently;
        }
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(iImpromptu2);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, iImpromptu2);
        stratoscopeVar.splinterproof(4);
        attabalVar.f24650attabal = preprohormoneVar.attabal(ImmutableList.of(PictureFrame.attabal(stratoscopeVar)));
        return zCompetently;
    }

    public static int saneness(monoploid monoploidVar) throws IOException {
        monoploidVar.resetPeekPosition();
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(2);
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, 2);
        int iSaran = stratoscopeVar.saran();
        if ((iSaran >> 2) == 16382) {
            monoploidVar.resetPeekPosition();
            return iSaran;
        }
        monoploidVar.resetPeekPosition();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    public static void taiyuan(monoploid monoploidVar) throws IOException {
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(4);
        monoploidVar.readFully(stratoscopeVar.marial(), 0, 4);
        if (stratoscopeVar.merc() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    public static Metadata wireman(monoploid monoploidVar, boolean z) throws Throwable {
        monoploidVar.resetPeekPosition();
        long peekPosition = monoploidVar.getPeekPosition();
        Metadata metadataDern = dern(monoploidVar, z);
        monoploidVar.skipFully((int) (monoploidVar.getPeekPosition() - peekPosition));
        return metadataDern;
    }
}

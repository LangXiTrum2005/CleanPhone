package mef;

import android.util.Pair;
import androidx.media3.common.ParserException;
import cybernatic.monoploid;
import decarock.grimness;
import decarock.stratoscope;
import decarock.triweekly;
import java.io.IOException;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: compiled from: WavHeaderReader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f33289attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f33290saneness;

        public attabal(int i, long j) {
            this.f33289attabal = i;
            this.f33290saneness = j;
        }

        public static attabal attabal(monoploid monoploidVar, stratoscope stratoscopeVar) throws IOException {
            monoploidVar.peekFully(stratoscopeVar.marial(), 0, 8);
            stratoscopeVar.mathsort(0);
            return new attabal(stratoscopeVar.monoploid(), stratoscopeVar.rotuma());
        }
    }

    public static boolean attabal(monoploid monoploidVar) throws IOException {
        stratoscope stratoscopeVar = new stratoscope(8);
        int i = attabal.attabal(monoploidVar, stratoscopeVar).f33289attabal;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, 4);
        stratoscopeVar.mathsort(0);
        int iMonoploid = stratoscopeVar.monoploid();
        if (iMonoploid == 1463899717) {
            return true;
        }
        triweekly.dern("WavHeaderReader", "Unsupported form type: " + iMonoploid);
        return false;
    }

    public static long dern(monoploid monoploidVar) throws IOException {
        stratoscope stratoscopeVar = new stratoscope(8);
        attabal attabalVarAttabal = attabal.attabal(monoploidVar, stratoscopeVar);
        if (attabalVarAttabal.f33289attabal != 1685272116) {
            monoploidVar.resetPeekPosition();
            return -1L;
        }
        monoploidVar.advancePeekPosition(8);
        stratoscopeVar.mathsort(0);
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, 8);
        long jDovishness = stratoscopeVar.dovishness();
        monoploidVar.skipFully(((int) attabalVarAttabal.f33290saneness) + 8);
        return jDovishness;
    }

    public static Pair<Long, Long> marial(monoploid monoploidVar) throws IOException {
        monoploidVar.resetPeekPosition();
        attabal attabalVarWireman = wireman(1684108385, monoploidVar, new stratoscope(8));
        monoploidVar.skipFully(8);
        return Pair.create(Long.valueOf(monoploidVar.getPosition()), Long.valueOf(attabalVarWireman.f33290saneness));
    }

    public static dern saneness(monoploid monoploidVar) throws IOException {
        byte[] bArr;
        stratoscope stratoscopeVar = new stratoscope(16);
        attabal attabalVarWireman = wireman(1718449184, monoploidVar, stratoscopeVar);
        decarock.attabal.competently(attabalVarWireman.f33290saneness >= 16);
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, 16);
        stratoscopeVar.mathsort(0);
        int iCord = stratoscopeVar.cord();
        int iCord2 = stratoscopeVar.cord();
        int iPreprohormone = stratoscopeVar.preprohormone();
        int iPreprohormone2 = stratoscopeVar.preprohormone();
        int iCord3 = stratoscopeVar.cord();
        int iCord4 = stratoscopeVar.cord();
        int i = ((int) attabalVarWireman.f33290saneness) - 16;
        if (i > 0) {
            bArr = new byte[i];
            monoploidVar.peekFully(bArr, 0, i);
        } else {
            bArr = grimness.f25081beachfront;
        }
        byte[] bArr2 = bArr;
        monoploidVar.skipFully((int) (monoploidVar.getPeekPosition() - monoploidVar.getPosition()));
        return new dern(iCord, iCord2, iPreprohormone, iPreprohormone2, iCord3, iCord4, bArr2);
    }

    public static attabal wireman(int i, monoploid monoploidVar, stratoscope stratoscopeVar) throws IOException {
        attabal attabalVarAttabal = attabal.attabal(monoploidVar, stratoscopeVar);
        while (attabalVarAttabal.f33289attabal != i) {
            triweekly.impromptu("WavHeaderReader", "Ignoring unknown WAV chunk: " + attabalVarAttabal.f33289attabal);
            long j = attabalVarAttabal.f33290saneness;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + attabalVarAttabal.f33289attabal);
            }
            monoploidVar.skipFully((int) j2);
            attabalVarAttabal = attabal.attabal(monoploidVar, stratoscopeVar);
        }
        return attabalVarAttabal;
    }
}

package bavaria;

import com.inmobi.media.core.config.models.AdConfig;
import cybernatic.dovishness;
import cybernatic.gintrap;
import cybernatic.merc;
import cybernatic.monoploid;
import cybernatic.preprohormone;
import cybernatic.rotuma;
import decarock.grimness;
import decarock.stratoscope;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends taiyuan {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public attabal f15003kowloon;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public preprohormone f15004triweekly;

    /* JADX INFO: compiled from: FlacReader.java */
    public static final class attabal implements competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public preprohormone f15005attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public preprohormone.attabal f15007saneness;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f15006dern = -1;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f15008wireman = -1;

        public attabal(preprohormone preprohormoneVar, preprohormone.attabal attabalVar) {
            this.f15005attabal = preprohormoneVar;
            this.f15007saneness = attabalVar;
        }

        @Override // bavaria.competently
        public long attabal(monoploid monoploidVar) {
            long j = this.f15008wireman;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f15008wireman = -1L;
            return j2;
        }

        @Override // bavaria.competently
        public merc createSeekMap() {
            decarock.attabal.competently(this.f15006dern != -1);
            return new rotuma(this.f15005attabal, this.f15006dern);
        }

        public void saneness(long j) {
            this.f15006dern = j;
        }

        @Override // bavaria.competently
        public void startSeek(long j) {
            long[] jArr = this.f15007saneness.f24737attabal;
            this.f15008wireman = jArr[grimness.competently(jArr, j, true, true)];
        }
    }

    public static boolean arytenoidectomy(stratoscope stratoscopeVar) {
        return stratoscopeVar.attabal() >= 5 && stratoscopeVar.supplicat() == 127 && stratoscopeVar.merc() == 1179402563;
    }

    public static boolean kowloon(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // bavaria.taiyuan
    public long beachfront(stratoscope stratoscopeVar) {
        if (kowloon(stratoscopeVar.marial())) {
            return triweekly(stratoscopeVar);
        }
        return -1L;
    }

    @Override // bavaria.taiyuan
    public void formularize(boolean z) {
        super.formularize(z);
        if (z) {
            this.f15004triweekly = null;
            this.f15003kowloon = null;
        }
    }

    @Override // bavaria.taiyuan
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean taiyuan(stratoscope stratoscopeVar, long j, taiyuan.saneness sanenessVar) {
        byte[] bArrMarial = stratoscopeVar.marial();
        preprohormone preprohormoneVar = this.f15004triweekly;
        if (preprohormoneVar == null) {
            preprohormone preprohormoneVar2 = new preprohormone(bArrMarial, 17);
            this.f15004triweekly = preprohormoneVar2;
            sanenessVar.f15022attabal = preprohormoneVar2.competently(Arrays.copyOfRange(bArrMarial, 9, stratoscopeVar.competently()), null);
            return true;
        }
        if ((bArrMarial[0] & 127) == 3) {
            preprohormone.attabal attabalVarCompetently = gintrap.competently(stratoscopeVar);
            preprohormone preprohormoneVarSaneness = preprohormoneVar.saneness(attabalVarCompetently);
            this.f15004triweekly = preprohormoneVarSaneness;
            this.f15003kowloon = new attabal(preprohormoneVarSaneness, attabalVarCompetently);
            return true;
        }
        if (!kowloon(bArrMarial)) {
            return true;
        }
        attabal attabalVar = this.f15003kowloon;
        if (attabalVar != null) {
            attabalVar.saneness(j);
            sanenessVar.f15023saneness = this.f15003kowloon;
        }
        decarock.attabal.marial(sanenessVar.f15022attabal);
        return false;
    }

    public final int triweekly(stratoscope stratoscopeVar) {
        int i = (stratoscopeVar.marial()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i == 6 || i == 7) {
            stratoscopeVar.splinterproof(4);
            stratoscopeVar.privatdozent();
        }
        int iCutely = dovishness.cutely(stratoscopeVar, i);
        stratoscopeVar.mathsort(0);
        return iCutely;
    }
}

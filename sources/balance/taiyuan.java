package balance;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.sealless;
import decarock.grimness;
import decarock.stratoscope;

/* JADX INFO: compiled from: XingFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final sealless.attabal f14900attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long[] f14901beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f14902dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f14903marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f14904saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f14905wireman;

    public taiyuan(sealless.attabal attabalVar, long j, long j2, long[] jArr, int i, int i2) {
        this.f14900attabal = new sealless.attabal(attabalVar);
        this.f14904saneness = j;
        this.f14902dern = j2;
        this.f14901beachfront = jArr;
        this.f14905wireman = i;
        this.f14903marial = i2;
    }

    public static taiyuan saneness(sealless.attabal attabalVar, stratoscope stratoscopeVar) {
        long[] jArr;
        int i;
        int i2;
        int iMonoploid = stratoscopeVar.monoploid();
        int iSeminary = (iMonoploid & 1) != 0 ? stratoscopeVar.seminary() : -1;
        long jMerc = (iMonoploid & 2) != 0 ? stratoscopeVar.merc() : -1L;
        if ((iMonoploid & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = stratoscopeVar.supplicat();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iMonoploid & 8) != 0) {
            stratoscopeVar.splinterproof(4);
        }
        if (stratoscopeVar.attabal() >= 24) {
            stratoscopeVar.splinterproof(21);
            int iPolder = stratoscopeVar.polder();
            i2 = iPolder & 4095;
            i = (16773120 & iPolder) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new taiyuan(attabalVar, iSeminary, jMerc, jArr2, i, i2);
    }

    public long attabal() {
        long j = this.f14904saneness;
        if (j == -1 || j == 0) {
            return C.TIME_UNSET;
        }
        sealless.attabal attabalVar = this.f14900attabal;
        return grimness.libyan((j * ((long) attabalVar.f24768competently)) - 1, attabalVar.f24772wireman);
    }
}

package hydromechanics;

import android.util.Pair;
import androidx.media3.common.yemenite;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.libyan;
import decarock.grimness;
import ethene.restrictive;
import java.util.Arrays;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class cord extends trm {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public attabal f28160dern;

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28161attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int[][][] f28162beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final restrictive f28163competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int[] f28164dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int[] f28165marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String[] f28166saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final restrictive[] f28167wireman;

        public attabal(String[] strArr, int[] iArr, restrictive[] restrictiveVarArr, int[] iArr2, int[][][] iArr3, restrictive restrictiveVar) {
            this.f28166saneness = strArr;
            this.f28164dern = iArr;
            this.f28167wireman = restrictiveVarArr;
            this.f28162beachfront = iArr3;
            this.f28165marial = iArr2;
            this.f28163competently = restrictiveVar;
            this.f28161attabal = iArr.length;
        }

        public int attabal(int i, int i2, boolean z) {
            int i3 = this.f28167wireman[i].saneness(i2).f11332attabal;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iCompetently = competently(i, i2, i5);
                if (iCompetently == 4 || (z && iCompetently == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return saneness(i, i2, Arrays.copyOf(iArr, i4));
        }

        public restrictive beachfront(int i) {
            return this.f28167wireman[i];
        }

        public int competently(int i, int i2, int i3) {
            return lampshade.cuirassed(dern(i, i2, i3));
        }

        public int dern(int i, int i2, int i3) {
            return this.f28162beachfront[i][i2][i3];
        }

        public restrictive impromptu() {
            return this.f28163competently;
        }

        public int marial(int i) {
            return this.f28164dern[i];
        }

        public int saneness(int i, int i2, int[] iArr) {
            int i3 = 0;
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i4 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f28167wireman[i].saneness(i2).attabal(iArr[i3]).f11218triweekly;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !grimness.dern(str, str2);
                }
                iMin = Math.min(iMin, lampshade.apical(this.f28162beachfront[i][i2][i3]));
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f28165marial[i]) : iMin;
        }

        public int wireman() {
            return this.f28161attabal;
        }
    }

    public static int formularize(lampshade[] lampshadeVarArr, yemenite yemeniteVar, int[] iArr, boolean z) throws ExoPlaybackException {
        int length = lampshadeVarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < lampshadeVarArr.length; i2++) {
            lampshade lampshadeVar = lampshadeVarArr[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < yemeniteVar.f11332attabal; i3++) {
                iMax = Math.max(iMax, lampshade.cuirassed(lampshadeVar.attabal(yemeniteVar.attabal(i3))));
            }
            boolean z3 = iArr[i2] == 0;
            if (iMax > i || (iMax == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = iMax;
            }
        }
        return length;
    }

    public static int[] impassible(lampshade lampshadeVar, yemenite yemeniteVar) throws ExoPlaybackException {
        int[] iArr = new int[yemeniteVar.f11332attabal];
        for (int i = 0; i < yemeniteVar.f11332attabal; i++) {
            iArr[i] = lampshadeVar.attabal(yemeniteVar.attabal(i));
        }
        return iArr;
    }

    public static int[] triweekly(lampshade[] lampshadeVarArr) throws ExoPlaybackException {
        int length = lampshadeVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = lampshadeVarArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Override // hydromechanics.trm
    public final oilcan cutely(lampshade[] lampshadeVarArr, restrictive restrictiveVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan oilcanVar) throws ExoPlaybackException {
        int[] iArr = new int[lampshadeVarArr.length + 1];
        int length = lampshadeVarArr.length + 1;
        yemenite[][] yemeniteVarArr = new yemenite[length][];
        int[][][] iArr2 = new int[lampshadeVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = restrictiveVar.f26059attabal;
            yemeniteVarArr[i] = new yemenite[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrTriweekly = triweekly(lampshadeVarArr);
        for (int i3 = 0; i3 < restrictiveVar.f26059attabal; i3++) {
            yemenite yemeniteVarSaneness = restrictiveVar.saneness(i3);
            int iFormularize = formularize(lampshadeVarArr, yemeniteVarSaneness, iArr, yemeniteVarSaneness.f11333dern == 5);
            int[] iArrImpassible = iFormularize == lampshadeVarArr.length ? new int[yemeniteVarSaneness.f11332attabal] : impassible(lampshadeVarArr[iFormularize], yemeniteVarSaneness);
            int i4 = iArr[iFormularize];
            yemeniteVarArr[iFormularize][i4] = yemeniteVarSaneness;
            iArr2[iFormularize][i4] = iArrImpassible;
            iArr[iFormularize] = i4 + 1;
        }
        restrictive[] restrictiveVarArr = new restrictive[lampshadeVarArr.length];
        String[] strArr = new String[lampshadeVarArr.length];
        int[] iArr3 = new int[lampshadeVarArr.length];
        for (int i5 = 0; i5 < lampshadeVarArr.length; i5++) {
            int i6 = iArr[i5];
            restrictiveVarArr[i5] = new restrictive((yemenite[]) grimness.mastfed(yemeniteVarArr[i5], i6));
            iArr2[i5] = (int[][]) grimness.mastfed(iArr2[i5], i6);
            strArr[i5] = lampshadeVarArr[i5].getName();
            iArr3[i5] = lampshadeVarArr[i5].getTrackType();
        }
        attabal attabalVar = new attabal(strArr, iArr3, restrictiveVarArr, iArrTriweekly, iArr2, new restrictive((yemenite[]) grimness.mastfed(yemeniteVarArr[lampshadeVarArr.length], iArr[lampshadeVarArr.length])));
        Pair<libyan[], rotuma[]> pairKowloon = kowloon(attabalVar, iArr2, iArrTriweekly, sanenessVar, oilcanVar);
        return new oilcan((libyan[]) pairKowloon.first, (rotuma[]) pairKowloon.second, stratoscope.attabal(attabalVar, (cuirassed[]) pairKowloon.second), attabalVar);
    }

    @Override // hydromechanics.trm
    public final void impromptu(Object obj) {
        this.f28160dern = (attabal) obj;
    }

    public abstract Pair<libyan[], rotuma[]> kowloon(attabal attabalVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, androidx.media3.common.oilcan oilcanVar) throws ExoPlaybackException;
}

package hydromechanics;

import androidx.media3.common.supplicat;
import androidx.media3.common.yemenite;
import com.google.common.collect.ImmutableList;
import ethene.restrictive;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: TrackSelectionUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class stratoscope {
    public static supplicat attabal(cord.attabal attabalVar, cuirassed[] cuirassedVarArr) {
        List[] listArr = new List[cuirassedVarArr.length];
        for (int i = 0; i < cuirassedVarArr.length; i++) {
            cuirassed cuirassedVar = cuirassedVarArr[i];
            listArr[i] = cuirassedVar != null ? ImmutableList.of(cuirassedVar) : ImmutableList.of();
        }
        return saneness(attabalVar, listArr);
    }

    public static supplicat saneness(cord.attabal attabalVar, List<? extends cuirassed>[] listArr) {
        boolean z;
        ImmutableList.attabal attabalVar2 = new ImmutableList.attabal();
        for (int i = 0; i < attabalVar.wireman(); i++) {
            restrictive restrictiveVarBeachfront = attabalVar.beachfront(i);
            List<? extends cuirassed> list = listArr[i];
            for (int i2 = 0; i2 < restrictiveVarBeachfront.f26059attabal; i2++) {
                yemenite yemeniteVarSaneness = restrictiveVarBeachfront.saneness(i2);
                boolean z2 = attabalVar.attabal(i, i2, false) != 0;
                int i3 = yemeniteVarSaneness.f11332attabal;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                for (int i4 = 0; i4 < yemeniteVarSaneness.f11332attabal; i4++) {
                    iArr[i4] = attabalVar.competently(i, i2, i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            z = false;
                            break;
                        }
                        cuirassed cuirassedVar = list.get(i5);
                        if (cuirassedVar.getTrackGroup().equals(yemeniteVarSaneness) && cuirassedVar.indexOf(i4) != -1) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                    zArr[i4] = z;
                }
                attabalVar2.attabal(new supplicat.attabal(yemeniteVarSaneness, z2, iArr, zArr));
            }
        }
        restrictive restrictiveVarImpromptu = attabalVar.impromptu();
        for (int i6 = 0; i6 < restrictiveVarImpromptu.f26059attabal; i6++) {
            yemenite yemeniteVarSaneness2 = restrictiveVarImpromptu.saneness(i6);
            int[] iArr2 = new int[yemeniteVarSaneness2.f11332attabal];
            Arrays.fill(iArr2, 0);
            attabalVar2.attabal(new supplicat.attabal(yemeniteVarSaneness2, false, iArr2, new boolean[yemeniteVarSaneness2.f11332attabal]));
        }
        return new supplicat(attabalVar2.impassible());
    }
}

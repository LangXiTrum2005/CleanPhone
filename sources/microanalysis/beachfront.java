package microanalysis;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.achondroplasia;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* JADX INFO: compiled from: ReplacingCuesResolver.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<strother.marial> f33319attabal = new ArrayList<>();

    @Override // microanalysis.attabal
    public ImmutableList<libya.attabal> attabal(long j) {
        int iBeachfront = beachfront(j);
        if (iBeachfront == 0) {
            return ImmutableList.of();
        }
        strother.marial marialVar = this.f33319attabal.get(iBeachfront - 1);
        long j2 = marialVar.f38197wireman;
        return (j2 == C.TIME_UNSET || j < j2) ? marialVar.f38194attabal : ImmutableList.of();
    }

    public final int beachfront(long j) {
        for (int i = 0; i < this.f33319attabal.size(); i++) {
            if (j < this.f33319attabal.get(i).f38196saneness) {
                return i;
            }
        }
        return this.f33319attabal.size();
    }

    @Override // microanalysis.attabal
    public void clear() {
        this.f33319attabal.clear();
    }

    @Override // microanalysis.attabal
    public long dern(long j) {
        if (this.f33319attabal.isEmpty() || j < this.f33319attabal.get(0).f38196saneness) {
            return C.TIME_UNSET;
        }
        for (int i = 1; i < this.f33319attabal.size(); i++) {
            long j2 = this.f33319attabal.get(i).f38196saneness;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                strother.marial marialVar = this.f33319attabal.get(i - 1);
                long j3 = marialVar.f38197wireman;
                return (j3 == C.TIME_UNSET || j3 > j) ? marialVar.f38196saneness : j3;
            }
        }
        strother.marial marialVar2 = (strother.marial) achondroplasia.beachfront(this.f33319attabal);
        long j4 = marialVar2.f38197wireman;
        return (j4 == C.TIME_UNSET || j < j4) ? marialVar2.f38196saneness : j4;
    }

    @Override // microanalysis.attabal
    public void marial(long j) {
        int iBeachfront = beachfront(j);
        if (iBeachfront > 0) {
            this.f33319attabal.subList(0, iBeachfront).clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // microanalysis.attabal
    public boolean saneness(strother.marial marialVar, long j) {
        boolean z;
        decarock.attabal.attabal(marialVar.f38196saneness != C.TIME_UNSET);
        if (marialVar.f38196saneness <= j) {
            long j2 = marialVar.f38197wireman;
            if (j2 == C.TIME_UNSET || j < j2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = this.f33319attabal.size() - 1; size >= 0; size--) {
            if (marialVar.f38196saneness >= this.f33319attabal.get(size).f38196saneness) {
                this.f33319attabal.add(size + 1, marialVar);
                return z;
            }
            if (this.f33319attabal.get(size).f38196saneness <= j) {
                z = false;
            }
        }
        this.f33319attabal.add(0, marialVar);
        return z;
    }

    @Override // microanalysis.attabal
    public long wireman(long j) {
        if (this.f33319attabal.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.f33319attabal.get(0).f38196saneness) {
            return this.f33319attabal.get(0).f38196saneness;
        }
        for (int i = 1; i < this.f33319attabal.size(); i++) {
            strother.marial marialVar = this.f33319attabal.get(i);
            if (j < marialVar.f38196saneness) {
                long j2 = this.f33319attabal.get(i - 1).f38197wireman;
                return (j2 == C.TIME_UNSET || j2 <= j || j2 >= marialVar.f38196saneness) ? marialVar.f38196saneness : j2;
            }
        }
        long j3 = ((strother.marial) achondroplasia.beachfront(this.f33319attabal)).f38197wireman;
        if (j3 == C.TIME_UNSET || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }
}

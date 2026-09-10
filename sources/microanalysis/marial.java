package microanalysis;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MergingCuesResolver.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Ordering<strother.marial> f33322saneness = Ordering.natural().onResultOf(new com.google.common.base.marial() { // from class: microanalysis.dern
        @Override // com.google.common.base.marial
        public final Object apply(Object obj) {
            return Long.valueOf(((strother.marial) obj).f38196saneness);
        }
    }).compound(Ordering.natural().reverse().onResultOf(new com.google.common.base.marial() { // from class: microanalysis.wireman
        @Override // com.google.common.base.marial
        public final Object apply(Object obj) {
            return Long.valueOf(((strother.marial) obj).f38195dern);
        }
    }));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<strother.marial> f33323attabal = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // microanalysis.attabal
    public ImmutableList<libya.attabal> attabal(long j) {
        if (!this.f33323attabal.isEmpty()) {
            if (j >= this.f33323attabal.get(0).f38196saneness) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f33323attabal.size(); i++) {
                    strother.marial marialVar = this.f33323attabal.get(i);
                    if (j >= marialVar.f38196saneness && j < marialVar.f38197wireman) {
                        arrayList.add(marialVar);
                    }
                    if (j < marialVar.f38196saneness) {
                        break;
                    }
                }
                ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(f33322saneness, arrayList);
                ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
                for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
                    attabalVarBuilder.apical(((strother.marial) immutableListSortedCopyOf.get(i2)).f38194attabal);
                }
                return attabalVarBuilder.impassible();
            }
        }
        return ImmutableList.of();
    }

    @Override // microanalysis.attabal
    public void clear() {
        this.f33323attabal.clear();
    }

    @Override // microanalysis.attabal
    public long dern(long j) {
        if (this.f33323attabal.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j < this.f33323attabal.get(0).f38196saneness) {
            return C.TIME_UNSET;
        }
        long jMax = this.f33323attabal.get(0).f38196saneness;
        for (int i = 0; i < this.f33323attabal.size(); i++) {
            long j2 = this.f33323attabal.get(i).f38196saneness;
            long j3 = this.f33323attabal.get(i).f38197wireman;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // microanalysis.attabal
    public void marial(long j) {
        int i = 0;
        while (i < this.f33323attabal.size()) {
            long j2 = this.f33323attabal.get(i).f38196saneness;
            if (j > j2 && j > this.f33323attabal.get(i).f38197wireman) {
                this.f33323attabal.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // microanalysis.attabal
    public boolean saneness(strother.marial marialVar, long j) {
        decarock.attabal.attabal(marialVar.f38196saneness != C.TIME_UNSET);
        decarock.attabal.attabal(marialVar.f38195dern != C.TIME_UNSET);
        boolean z = marialVar.f38196saneness <= j && j < marialVar.f38197wireman;
        for (int size = this.f33323attabal.size() - 1; size >= 0; size--) {
            if (marialVar.f38196saneness >= this.f33323attabal.get(size).f38196saneness) {
                this.f33323attabal.add(size + 1, marialVar);
                return z;
            }
        }
        this.f33323attabal.add(0, marialVar);
        return z;
    }

    @Override // microanalysis.attabal
    public long wireman(long j) {
        long jMin = -9223372036854775807L;
        for (int i = 0; i < this.f33323attabal.size(); i++) {
            long j2 = this.f33323attabal.get(i).f38196saneness;
            long j3 = this.f33323attabal.get(i).f38197wireman;
            if (j < j2) {
                if (jMin != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == C.TIME_UNSET ? j3 : Math.min(jMin, j3);
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }
}

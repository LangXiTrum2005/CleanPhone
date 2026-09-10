package androidx.media3.exoplayer.source;

import androidx.media3.common.yemenite;
import androidx.media3.exoplayer.molet;
import androidx.media3.exoplayer.sensatory;
import com.google.common.collect.Lists;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ethene.restrictive;
import ethene.trm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: MergingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class kowloon implements apical, apical.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public restrictive f12585adultoid;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public adultoid f12588gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public apical.attabal f12589graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final apical[] f12590kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final ethene.marial f12592monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final ArrayList<apical> f12593polloi = new ArrayList<>();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final HashMap<yemenite, yemenite> f12591molybdenite = new HashMap<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final IdentityHashMap<trm, Integer> f12586arytenoidectomy = new IdentityHashMap<>();

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public apical[] f12587dovishness = new apical[0];

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class attabal implements hydromechanics.rotuma {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hydromechanics.rotuma f12594attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final yemenite f12595saneness;

        public attabal(hydromechanics.rotuma rotumaVar, yemenite yemeniteVar) {
            this.f12594attabal = rotumaVar;
            this.f12595saneness = yemeniteVar;
        }

        @Override // hydromechanics.rotuma
        public void attabal() {
            this.f12594attabal.attabal();
        }

        @Override // hydromechanics.rotuma
        public void dern() {
            this.f12594attabal.dern();
        }

        @Override // hydromechanics.rotuma
        public void disable() {
            this.f12594attabal.disable();
        }

        @Override // hydromechanics.rotuma
        public void enable() {
            this.f12594attabal.enable();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return this.f12594attabal.equals(attabalVar.f12594attabal) && this.f12595saneness.equals(attabalVar.f12595saneness);
        }

        @Override // hydromechanics.cuirassed
        public androidx.media3.common.polloi getFormat(int i) {
            return this.f12595saneness.attabal(this.f12594attabal.getIndexInTrackGroup(i));
        }

        @Override // hydromechanics.cuirassed
        public int getIndexInTrackGroup(int i) {
            return this.f12594attabal.getIndexInTrackGroup(i);
        }

        @Override // hydromechanics.rotuma
        public androidx.media3.common.polloi getSelectedFormat() {
            return this.f12595saneness.attabal(this.f12594attabal.getSelectedIndexInTrackGroup());
        }

        @Override // hydromechanics.rotuma
        public int getSelectedIndexInTrackGroup() {
            return this.f12594attabal.getSelectedIndexInTrackGroup();
        }

        @Override // hydromechanics.cuirassed
        public yemenite getTrackGroup() {
            return this.f12595saneness;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12595saneness.hashCode()) * 31) + this.f12594attabal.hashCode();
        }

        @Override // hydromechanics.cuirassed
        public int indexOf(int i) {
            return this.f12594attabal.indexOf(i);
        }

        @Override // hydromechanics.rotuma, hydromechanics.cuirassed
        public int length() {
            return this.f12594attabal.length();
        }

        @Override // hydromechanics.rotuma
        public void onPlaybackSpeed(float f) {
            this.f12594attabal.onPlaybackSpeed(f);
        }

        @Override // hydromechanics.rotuma
        public void saneness(boolean z) {
            this.f12594attabal.saneness(z);
        }
    }

    public kowloon(ethene.marial marialVar, long[] jArr, apical... apicalVarArr) {
        this.f12592monoploid = marialVar;
        this.f12590kowloon = apicalVarArr;
        this.f12588gintrap = marialVar.empty();
        for (int i = 0; i < apicalVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f12590kowloon[i] = new rotuma(apicalVarArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        if (this.f12593polloi.isEmpty()) {
            return this.f12588gintrap.attabal(sensatoryVar);
        }
        int size = this.f12593polloi.size();
        for (int i = 0; i < size; i++) {
            this.f12593polloi.get(i).attabal(sensatoryVar);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void competently(apical.attabal attabalVar, long j) {
        this.f12589graveside = attabalVar;
        Collections.addAll(this.f12593polloi, this.f12590kowloon);
        for (apical apicalVar : this.f12590kowloon) {
            apicalVar.competently(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.apical.attabal
    public void dern(apical apicalVar) {
        this.f12593polloi.remove(apicalVar);
        if (!this.f12593polloi.isEmpty()) {
            return;
        }
        int i = 0;
        for (apical apicalVar2 : this.f12590kowloon) {
            i += apicalVar2.getTrackGroups().f26059attabal;
        }
        yemenite[] yemeniteVarArr = new yemenite[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            apical[] apicalVarArr = this.f12590kowloon;
            if (i2 >= apicalVarArr.length) {
                this.f12585adultoid = new restrictive(yemeniteVarArr);
                ((apical.attabal) decarock.attabal.marial(this.f12589graveside)).dern(this);
                return;
            }
            restrictive trackGroups = apicalVarArr[i2].getTrackGroups();
            int i4 = trackGroups.f26059attabal;
            int i5 = 0;
            while (i5 < i4) {
                yemenite yemeniteVarSaneness = trackGroups.saneness(i5);
                androidx.media3.common.polloi[] polloiVarArr = new androidx.media3.common.polloi[yemeniteVarSaneness.f11332attabal];
                for (int i6 = 0; i6 < yemeniteVarSaneness.f11332attabal; i6++) {
                    androidx.media3.common.polloi polloiVarAttabal = yemeniteVarSaneness.attabal(i6);
                    androidx.media3.common.polloi.saneness sanenessVarAttabal = polloiVarAttabal.attabal();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append(":");
                    String str = polloiVarAttabal.f11187attabal;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    polloiVarArr[i6] = sanenessVarAttabal.cultivated(sb.toString()).polder();
                }
                yemenite yemeniteVar = new yemenite(i2 + ":" + yemeniteVarSaneness.f11335saneness, polloiVarArr);
                this.f12591molybdenite.put(yemeniteVar, yemeniteVarSaneness);
                yemeniteVarArr[i3] = yemeniteVar;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void discardBuffer(long j, boolean z) {
        for (apical apicalVar : this.f12587dovishness) {
            apicalVar.discardBuffer(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        return this.f12588gintrap.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        return this.f12588gintrap.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public restrictive getTrackGroups() {
        return (restrictive) decarock.attabal.marial(this.f12585adultoid);
    }

    public apical impromptu(int i) {
        apical apicalVar = this.f12590kowloon[i];
        return apicalVar instanceof rotuma ? ((rotuma) apicalVar).beachfront() : apicalVar;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        return this.f12588gintrap.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long marial(long j, molet moletVar) {
        apical[] apicalVarArr = this.f12587dovishness;
        return (apicalVarArr.length > 0 ? apicalVarArr[0] : this.f12590kowloon[0]).marial(j, moletVar);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public void maybeThrowPrepareError() throws IOException {
        for (apical apicalVar : this.f12590kowloon) {
            apicalVar.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (apical apicalVar : this.f12587dovishness) {
            long discontinuity = apicalVar.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j != C.TIME_UNSET && apicalVar.seekToUs(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == C.TIME_UNSET) {
                for (apical apicalVar2 : this.f12587dovishness) {
                    if (apicalVar2 == apicalVar) {
                        break;
                    }
                    if (apicalVar2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = discontinuity;
            } else if (discontinuity != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.apical, androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
        this.f12588gintrap.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long saneness(hydromechanics.rotuma[] rotumaVarArr, boolean[] zArr, trm[] trmVarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[rotumaVarArr.length];
        int[] iArr2 = new int[rotumaVarArr.length];
        int i = 0;
        for (int i2 = 0; i2 < rotumaVarArr.length; i2++) {
            trm trmVar = trmVarArr[i2];
            Integer num = trmVar == null ? null : this.f12586arytenoidectomy.get(trmVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            hydromechanics.rotuma rotumaVar = rotumaVarArr[i2];
            if (rotumaVar != null) {
                String str = rotumaVar.getTrackGroup().f11335saneness;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
        }
        this.f12586arytenoidectomy.clear();
        int length = rotumaVarArr.length;
        trm[] trmVarArr2 = new trm[length];
        trm[] trmVarArr3 = new trm[rotumaVarArr.length];
        hydromechanics.rotuma[] rotumaVarArr2 = new hydromechanics.rotuma[rotumaVarArr.length];
        ArrayList arrayList = new ArrayList(this.f12590kowloon.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f12590kowloon.length) {
            for (int i4 = i; i4 < rotumaVarArr.length; i4++) {
                trmVarArr3[i4] = iArr[i4] == i3 ? trmVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    hydromechanics.rotuma rotumaVar2 = (hydromechanics.rotuma) decarock.attabal.marial(rotumaVarArr[i4]);
                    rotumaVarArr2[i4] = new attabal(rotumaVar2, (yemenite) decarock.attabal.marial(this.f12591molybdenite.get(rotumaVar2.getTrackGroup())));
                } else {
                    rotumaVarArr2[i4] = null;
                }
            }
            int i5 = i3;
            long jSaneness = this.f12590kowloon[i3].saneness(rotumaVarArr2, zArr, trmVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jSaneness;
            } else if (jSaneness != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < rotumaVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    trm trmVar2 = (trm) decarock.attabal.marial(trmVarArr3[i6]);
                    trmVarArr2[i6] = trmVarArr3[i6];
                    this.f12586arytenoidectomy.put(trmVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    decarock.attabal.competently(trmVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(this.f12590kowloon[i5]);
            }
            i3 = i5 + 1;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(trmVarArr2, i7, trmVarArr, i7, length);
        this.f12587dovishness = (apical[]) arrayList.toArray(new apical[i7]);
        this.f12588gintrap = this.f12592monoploid.attabal(arrayList, Lists.apical(arrayList, new com.google.common.base.marial() { // from class: ethene.dovishness
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return ((androidx.media3.exoplayer.source.apical) obj).getTrackGroups().dern();
            }
        }));
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.apical
    public long seekToUs(long j) {
        long jSeekToUs = this.f12587dovishness[0].seekToUs(j);
        int i = 1;
        while (true) {
            apical[] apicalVarArr = this.f12587dovishness;
            if (i >= apicalVarArr.length) {
                return jSeekToUs;
            }
            if (apicalVarArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.adultoid.attabal
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public void wireman(apical apicalVar) {
        ((apical.attabal) decarock.attabal.marial(this.f12589graveside)).wireman(this);
    }
}

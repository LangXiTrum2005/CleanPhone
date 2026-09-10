package cybernatic;

import java.util.Arrays;

/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24606attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f24607beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long[] f24608dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long[] f24609marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int[] f24610saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long[] f24611wireman;

    public competently(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f24610saneness = iArr;
        this.f24608dern = jArr;
        this.f24611wireman = jArr2;
        this.f24609marial = jArr3;
        int length = iArr.length;
        this.f24606attabal = length;
        if (length > 0) {
            this.f24607beachfront = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f24607beachfront = 0L;
        }
    }

    public int attabal(long j) {
        return decarock.grimness.competently(this.f24609marial, j, true, true);
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f24607beachfront;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        int iAttabal = attabal(j);
        polder polderVar = new polder(this.f24609marial[iAttabal], this.f24608dern[iAttabal]);
        if (polderVar.f24722attabal >= j || iAttabal == this.f24606attabal - 1) {
            return new merc.attabal(polderVar);
        }
        int i = iAttabal + 1;
        return new merc.attabal(polderVar, new polder(this.f24609marial[i], this.f24608dern[i]));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f24606attabal + ", sizes=" + Arrays.toString(this.f24610saneness) + ", offsets=" + Arrays.toString(this.f24608dern) + ", timeUs=" + Arrays.toString(this.f24609marial) + ", durationsUs=" + Arrays.toString(this.f24611wireman) + ")";
    }
}

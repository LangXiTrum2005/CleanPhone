package ethene;

import androidx.media3.exoplayer.sensatory;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements androidx.media3.exoplayer.source.adultoid {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long f26072arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ImmutableList<attabal> f26073kowloon;

    /* JADX INFO: compiled from: CompositeSequenceableLoader.java */
    public static final class attabal implements androidx.media3.exoplayer.source.adultoid {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final ImmutableList<Integer> f26074arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.adultoid f26075kowloon;

        public attabal(androidx.media3.exoplayer.source.adultoid adultoidVar, List<Integer> list) {
            this.f26075kowloon = adultoidVar;
            this.f26074arytenoidectomy = ImmutableList.copyOf((Collection) list);
        }

        @Override // androidx.media3.exoplayer.source.adultoid
        public boolean attabal(sensatory sensatoryVar) {
            return this.f26075kowloon.attabal(sensatoryVar);
        }

        public ImmutableList<Integer> dern() {
            return this.f26074arytenoidectomy;
        }

        @Override // androidx.media3.exoplayer.source.adultoid
        public long getBufferedPositionUs() {
            return this.f26075kowloon.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.adultoid
        public long getNextLoadPositionUs() {
            return this.f26075kowloon.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.adultoid
        public boolean isLoading() {
            return this.f26075kowloon.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.adultoid
        public void reevaluateBuffer(long j) {
            this.f26075kowloon.reevaluateBuffer(j);
        }
    }

    public wireman(List<? extends androidx.media3.exoplayer.source.adultoid> list, List<List<Integer>> list2) {
        ImmutableList.attabal attabalVarBuilder = ImmutableList.builder();
        decarock.attabal.attabal(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            attabalVarBuilder.attabal(new attabal(list.get(i), list2.get(i)));
        }
        this.f26073kowloon = attabalVarBuilder.impassible();
        this.f26072arytenoidectomy = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.adultoid
    public boolean attabal(sensatory sensatoryVar) {
        boolean zAttabal;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z;
            }
            zAttabal = false;
            for (int i = 0; i < this.f26073kowloon.size(); i++) {
                long nextLoadPositionUs2 = this.f26073kowloon.get(i).getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= sensatoryVar.f12396attabal;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zAttabal |= this.f26073kowloon.get(i).attabal(sensatoryVar);
                }
            }
            z |= zAttabal;
        } while (zAttabal);
        return z;
    }

    @Override // androidx.media3.exoplayer.source.adultoid
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.f26073kowloon.size(); i++) {
            attabal attabalVar = this.f26073kowloon.get(i);
            long bufferedPositionUs = attabalVar.getBufferedPositionUs();
            if ((attabalVar.dern().contains(1) || attabalVar.dern().contains(2) || attabalVar.dern().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f26072arytenoidectomy = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f26072arytenoidectomy;
        return j != C.TIME_UNSET ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.adultoid
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.f26073kowloon.size(); i++) {
            long nextLoadPositionUs = this.f26073kowloon.get(i).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.adultoid
    public boolean isLoading() {
        for (int i = 0; i < this.f26073kowloon.size(); i++) {
            if (this.f26073kowloon.get(i).isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.adultoid
    public void reevaluateBuffer(long j) {
        for (int i = 0; i < this.f26073kowloon.size(); i++) {
            this.f26073kowloon.get(i).reevaluateBuffer(j);
        }
    }
}

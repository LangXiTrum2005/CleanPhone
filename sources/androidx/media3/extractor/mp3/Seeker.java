package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes.dex */
interface Seeker extends SeekMap {

    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        @Override // androidx.media3.extractor.mp3.Seeker
        public final long a() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public final int g() {
            return -2147483647;
        }

        @Override // androidx.media3.extractor.mp3.Seeker
        public final long getTimeUs(long j) {
            return 0L;
        }
    }

    long a();

    int g();

    long getTimeUs(long j);
}

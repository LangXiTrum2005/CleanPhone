package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface MediaSourceFactory extends MediaSource.Factory {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.MediaSourceFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MediaSourceFactory {
        @Override // com.google.android.exoplayer2.source.MediaSource.Factory
        public final MediaSource a(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }
    }
}

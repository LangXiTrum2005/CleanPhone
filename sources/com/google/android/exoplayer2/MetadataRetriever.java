package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SequenceableLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class MetadataRetriever {

    public static final class MetadataRetrieverInternal {

        public final class MediaSourceHandlerCallback implements Handler.Callback {
            /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
            
                throw null;
             */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 0
                    if (r0 == 0) goto L17
                    r3 = 1
                    if (r0 == r3) goto L14
                    r3 = 2
                    if (r0 == r3) goto L12
                    r3 = 3
                    if (r0 == r3) goto L10
                    r3 = 0
                    return r3
                L10:
                    r3 = 0
                    throw r3
                L12:
                    r3 = 0
                    throw r3
                L14:
                    r3 = 0
                    throw r3     // Catch: java.lang.Exception -> L16
                L16:
                    throw r1
                L17:
                    java.lang.Object r3 = r3.obj
                    com.google.android.exoplayer2.MediaItem r3 = (com.google.android.exoplayer2.MediaItem) r3
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.MetadataRetriever.MetadataRetrieverInternal.MediaSourceHandlerCallback.handleMessage(android.os.Message):boolean");
            }

            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {

                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    public final void a(SequenceableLoader sequenceableLoader) {
                        throw null;
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    public final void f(MediaPeriod mediaPeriod) {
                        throw null;
                    }
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                public final void F(BaseMediaSource baseMediaSource, Timeline timeline) {
                }
            }
        }
    }
}

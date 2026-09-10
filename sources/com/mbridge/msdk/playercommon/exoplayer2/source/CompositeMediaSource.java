package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, MediaSourceAndListener> childSources = new HashMap<>();
    private Handler eventHandler;
    private ExoPlayer player;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class ForwardingEventListener implements MediaSourceEventListener {
        private MediaSourceEventListener.EventDispatcher eventDispatcher;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @Nullable
        private final T f35137id;

        public ForwardingEventListener(T t10) {
            this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(null);
            this.f35137id = t10;
        }

        private boolean maybeUpdateEventDispatcher(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.f35137id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.f35137id, i10);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.eventDispatcher = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId, 0L);
            return true;
        }

        private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f35137id, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.f35137id, mediaLoadData.mediaEndTimeMs);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaSourceEventListener.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData), iOException, z10);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData));
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onMediaPeriodCreated(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.mediaPeriodCreated();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onMediaPeriodReleased(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.mediaPeriodReleased();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onReadingStarted(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.readingStarted();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i10, mediaPeriodId)) {
                this.eventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class MediaSourceAndListener {
        public final MediaSourceEventListener eventListener;
        public final MediaSource.SourceInfoRefreshListener listener;
        public final MediaSource mediaSource;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener, MediaSourceEventListener mediaSourceEventListener) {
            this.mediaSource = mediaSource;
            this.listener = sourceInfoRefreshListener;
            this.eventListener = mediaSourceEventListener;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    public abstract void onChildSourceInfoRefreshed(@Nullable T t10, MediaSource mediaSource, Timeline timeline, @Nullable Object obj);

    public final void prepareChildSource(@Nullable final T t10, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t10));
        MediaSource.SourceInfoRefreshListener sourceInfoRefreshListener = new MediaSource.SourceInfoRefreshListener() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.CompositeMediaSource.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource.SourceInfoRefreshListener
            public void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline, @Nullable Object obj) {
                CompositeMediaSource.this.onChildSourceInfoRefreshed(t10, mediaSource2, timeline, obj);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t10);
        this.childSources.put(t10, new MediaSourceAndListener(mediaSource, sourceInfoRefreshListener, forwardingEventListener));
        mediaSource.addEventListener(this.eventHandler, forwardingEventListener);
        mediaSource.prepareSource(this.player, false, sourceInfoRefreshListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z10) {
        this.player = exoPlayer;
        this.eventHandler = new Handler();
    }

    public final void releaseChildSource(@Nullable T t10) {
        MediaSourceAndListener mediaSourceAndListenerRemove = this.childSources.remove(t10);
        mediaSourceAndListenerRemove.mediaSource.releaseSource(mediaSourceAndListenerRemove.listener);
        mediaSourceAndListenerRemove.mediaSource.removeEventListener(mediaSourceAndListenerRemove.eventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        for (MediaSourceAndListener mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.listener);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
        this.player = null;
    }

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@Nullable T t10, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(@Nullable T t10, long j10) {
        return j10;
    }

    public int getWindowIndexForChildWindowIndex(@Nullable T t10, int i10) {
        return i10;
    }
}

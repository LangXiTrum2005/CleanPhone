package com.google.android.exoplayer2.analytics;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.analytics.p;
import androidx.media3.exoplayer.analytics.q;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.UnmodifiableListIterator;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f17235A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultPlaybackSessionManager f17237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f17238c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17241i;
    public PlaybackMetrics.Builder j;
    public int k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PlaybackException f17243n;
    public PendingFormatUpdate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PendingFormatUpdate f17244p;
    public PendingFormatUpdate q;
    public Format r;
    public Format s;
    public Format t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17245u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17246w;
    public int x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f17247z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Timeline.Window f17239e = new Timeline.Window();
    public final Timeline.Period f = new Timeline.Period();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f17240h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17242l = 0;
    public int m = 0;

    public static final class ErrorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17249b;

        public ErrorInfo(int i2, int i3) {
            this.f17248a = i2;
            this.f17249b = i3;
        }
    }

    public static final class PendingFormatUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f17250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17252c;

        public PendingFormatUpdate(Format format, int i2, String str) {
            this.f17250a = format;
            this.f17251b = i2;
            this.f17252c = str;
        }
    }

    public MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.f17236a = context.getApplicationContext();
        this.f17238c = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.f17237b = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.d = this;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void B(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        PendingFormatUpdate pendingFormatUpdate = this.o;
        if (pendingFormatUpdate != null) {
            Format format = pendingFormatUpdate.f17250a;
            if (format.s0 == -1) {
                Format.Builder builderA = format.a();
                builderA.f17089p = videoSize.X;
                builderA.q = videoSize.f19026Y;
                this.o = new PendingFormatUpdate(new Format(builderA), pendingFormatUpdate.f17251b, pendingFormatUpdate.f17252c);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId == null) {
            return;
        }
        Format format = mediaLoadData.f18344c;
        format.getClass();
        mediaPeriodId.getClass();
        PendingFormatUpdate pendingFormatUpdate = new PendingFormatUpdate(format, mediaLoadData.d, this.f17237b.b(eventTime.f17214b, mediaPeriodId));
        int i2 = mediaLoadData.f18343b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f17244p = pendingFormatUpdate;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.q = pendingFormatUpdate;
                return;
            }
        }
        this.o = pendingFormatUpdate;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void I(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        if (i2 == 1) {
            this.f17245u = true;
        }
        this.k = i2;
    }

    public final boolean M(PendingFormatUpdate pendingFormatUpdate) {
        String str;
        if (pendingFormatUpdate == null) {
            return false;
        }
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.f17237b;
        synchronized (defaultPlaybackSessionManager) {
            str = defaultPlaybackSessionManager.f;
        }
        return pendingFormatUpdate.f17252c.equals(str);
    }

    public final void N() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f17235A) {
            builder.setAudioUnderrunCount(this.f17247z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l2 = (Long) this.g.get(this.f17241i);
            this.j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f17240h.get(this.f17241i);
            this.j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f17238c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.f17241i = null;
        this.f17247z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.f17235A = false;
    }

    public final void O(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        int iB;
        PlaybackMetrics.Builder builder = this.j;
        if (mediaPeriodId == null || (iB = timeline.b(mediaPeriodId.f18347a)) == -1) {
            return;
        }
        Timeline.Period period = this.f;
        int i2 = 0;
        timeline.f(iB, period, false);
        int i3 = period.Z;
        Timeline.Window window = this.f17239e;
        timeline.n(i3, window);
        MediaItem.PlaybackProperties playbackProperties = window.Z.f17095Y;
        if (playbackProperties != null) {
            int iX = Util.x(playbackProperties.f17112a, playbackProperties.f17113b);
            if (iX == 0) {
                i2 = 3;
            } else if (iX != 1) {
                i2 = iX != 2 ? 1 : 4;
            } else {
                i2 = 5;
            }
        }
        builder.setStreamType(i2);
        if (window.n0 != -9223372036854775807L && !window.l0 && !window.i0 && !window.a()) {
            builder.setMediaDurationMillis(Util.J(window.n0));
        }
        builder.setPlaybackType(window.a() ? 2 : 1);
        this.f17235A = true;
    }

    public final void P(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if ((mediaPeriodId == null || !mediaPeriodId.a()) && str.equals(this.f17241i)) {
            N();
        }
        this.g.remove(str);
        this.f17240h.remove(str);
    }

    public final void Q(int i2, long j, Format format, int i3) {
        int i4;
        TrackChangeEvent.Builder timeSinceCreatedMillis = q.k(i2).setTimeSinceCreatedMillis(j - this.d);
        if (format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i3 != 1) {
                i4 = 3;
                if (i3 != 2) {
                    i4 = i3 != 3 ? 1 : 4;
                }
            } else {
                i4 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i4);
            String str = format.l0;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.m0;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.j0;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = format.i0;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = format.r0;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = format.s0;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = format.z0;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = format.A0;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = format.Z;
            if (str4 != null) {
                int i10 = Util.f18979a;
                String[] strArrSplit = str4.split(TokenBuilder.TOKEN_DELIMITER, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = format.t0;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f17235A = true;
        this.f17238c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void g(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
        this.v = mediaLoadData.f18342a;
    }

    /* JADX WARN: Code duplicated, block: B:263:0x045d  */
    /* JADX WARN: Code duplicated, block: B:360:0x0594 A[PHI: r7
  0x0594: PHI (r7v37 int) = (r7v34 int), (r7v36 int), (r7v35 int), (r7v35 int) binds: [B:359:0x0592, B:383:0x05c8, B:367:0x05a1, B:368:0x05a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void j(Player player, AnalyticsListener.Events events) {
        DefaultPlaybackSessionManager defaultPlaybackSessionManager;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ErrorInfo errorInfo;
        ErrorInfo errorInfo2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        PendingFormatUpdate pendingFormatUpdate;
        int i14;
        int i15;
        int i16;
        MediaMetricsListener mediaMetricsListener;
        Format format;
        DrmInitData drmInitData;
        int i17;
        if (events.f17219a.f18903a.size() == 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            int size = events.f17219a.f18903a.size();
            defaultPlaybackSessionManager = this.f17237b;
            if (i18 >= size) {
                break;
            }
            int iA = events.f17219a.a(i18);
            AnalyticsListener.EventTime eventTimeB = events.b(iA);
            if (iA == 0) {
                synchronized (defaultPlaybackSessionManager) {
                    try {
                        defaultPlaybackSessionManager.d.getClass();
                        Timeline timeline = defaultPlaybackSessionManager.f17230e;
                        defaultPlaybackSessionManager.f17230e = eventTimeB.f17214b;
                        Iterator it = defaultPlaybackSessionManager.f17229c.values().iterator();
                        while (it.hasNext()) {
                            DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = (DefaultPlaybackSessionManager.SessionDescriptor) it.next();
                            if (!sessionDescriptor.b(timeline, defaultPlaybackSessionManager.f17230e) || sessionDescriptor.a(eventTimeB)) {
                                it.remove();
                                if (sessionDescriptor.f17234e) {
                                    if (sessionDescriptor.f17231a.equals(defaultPlaybackSessionManager.f)) {
                                        defaultPlaybackSessionManager.f = null;
                                    }
                                    defaultPlaybackSessionManager.d.P(eventTimeB, sessionDescriptor.f17231a);
                                }
                            }
                        }
                        defaultPlaybackSessionManager.c(eventTimeB);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA == 11) {
                int i19 = this.k;
                synchronized (defaultPlaybackSessionManager) {
                    try {
                        defaultPlaybackSessionManager.d.getClass();
                        boolean z3 = i19 == 0;
                        Iterator it2 = defaultPlaybackSessionManager.f17229c.values().iterator();
                        while (it2.hasNext()) {
                            DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 = (DefaultPlaybackSessionManager.SessionDescriptor) it2.next();
                            if (sessionDescriptor2.a(eventTimeB)) {
                                it2.remove();
                                if (sessionDescriptor2.f17234e) {
                                    boolean zEquals = sessionDescriptor2.f17231a.equals(defaultPlaybackSessionManager.f);
                                    if (z3 && zEquals) {
                                        boolean z4 = sessionDescriptor2.f;
                                    }
                                    if (zEquals) {
                                        defaultPlaybackSessionManager.f = null;
                                    }
                                    defaultPlaybackSessionManager.d.P(eventTimeB, sessionDescriptor2.f17231a);
                                }
                            }
                        }
                        defaultPlaybackSessionManager.c(eventTimeB);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                defaultPlaybackSessionManager.d(eventTimeB);
            }
            i18++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (events.a(0)) {
            AnalyticsListener.EventTime eventTimeB2 = events.b(0);
            if (this.j != null) {
                O(eventTimeB2.f17214b, eventTimeB2.d);
            }
        }
        if (events.a(2) && this.j != null) {
            UnmodifiableListIterator unmodifiableListIteratorListIterator = player.d().X.listIterator(0);
            loop3: while (true) {
                if (!unmodifiableListIteratorListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                Tracks.Group group = (Tracks.Group) unmodifiableListIteratorListIterator.next();
                for (int i20 = 0; i20 < group.X; i20++) {
                    if (group.f0[i20] && (drmInitData = group.f17211Y.e0[i20].p0) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.j;
                int i21 = Util.f18979a;
                PlaybackMetrics.Builder builderJ = p.j(builder);
                int i22 = 0;
                while (true) {
                    if (i22 >= drmInitData.e0) {
                        i17 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.X[i22].f17475Y;
                    if (uuid.equals(C.d)) {
                        i17 = 3;
                        break;
                    } else if (uuid.equals(C.f17000e)) {
                        i17 = 2;
                        break;
                    } else {
                        if (uuid.equals(C.f16999c)) {
                            i17 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builderJ.setDrmType(i17);
            }
        }
        if (events.a(1011)) {
            this.f17247z++;
        }
        PlaybackException playbackException = this.f17243n;
        Context context = this.f17236a;
        long j = this.d;
        if (playbackException == null) {
            i13 = 1;
            i7 = 13;
            i3 = 8;
            i4 = 7;
            i5 = 6;
            i6 = 9;
        } else {
            boolean z5 = this.v == 4;
            int i23 = playbackException.X;
            if (i23 == 1001) {
                errorInfo = new ErrorInfo(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z2 = exoPlaybackException.Z == 1;
                    i2 = exoPlaybackException.h0;
                } else {
                    i2 = 0;
                    z2 = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i24 = 24;
                    i3 = 8;
                    i4 = 7;
                    i5 = 6;
                    i6 = 9;
                    if (z2 && (i2 == 0 || i2 == 1)) {
                        errorInfo = new ErrorInfo(35, 0);
                    } else if (z2 && i2 == 3) {
                        errorInfo = new ErrorInfo(15, 0);
                    } else if (z2 && i2 == 2) {
                        errorInfo = new ErrorInfo(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            i7 = 13;
                            errorInfo2 = new ErrorInfo(13, Util.p(((MediaCodecRenderer.DecoderInitializationException) cause).e0));
                        } else {
                            i7 = 13;
                            if (cause instanceof MediaCodecDecoderException) {
                                errorInfo = new ErrorInfo(14, Util.p(((MediaCodecDecoderException) cause).X));
                            } else if (cause instanceof OutOfMemoryError) {
                                errorInfo = new ErrorInfo(14, 0);
                            } else if (cause instanceof AudioSink.InitializationException) {
                                errorInfo = new ErrorInfo(17, ((AudioSink.InitializationException) cause).X);
                            } else if (cause instanceof AudioSink.WriteException) {
                                errorInfo = new ErrorInfo(18, ((AudioSink.WriteException) cause).X);
                            } else if (Util.f18979a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                errorInfo = new ErrorInfo(22, 0);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (Util.o(errorCode)) {
                                    case 6002:
                                        break;
                                    case 6003:
                                        i24 = 28;
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                    default:
                                        i24 = 27;
                                        break;
                                }
                                errorInfo2 = new ErrorInfo(i24, errorCode);
                            }
                        }
                        errorInfo = errorInfo2;
                    }
                    i7 = 13;
                } else if (cause instanceof HttpDataSource.InvalidResponseCodeException) {
                    errorInfo = new ErrorInfo(5, ((HttpDataSource.InvalidResponseCodeException) cause).e0);
                } else {
                    if ((cause instanceof HttpDataSource.InvalidContentTypeException) || (cause instanceof ParserException)) {
                        i8 = 9;
                        i9 = 7;
                        i10 = 6;
                        i11 = 8;
                        errorInfo = new ErrorInfo(z5 ? 10 : 11, 0);
                    } else {
                        boolean z6 = cause instanceof HttpDataSource.HttpDataSourceException;
                        if (z6 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                            i8 = 9;
                            if (NetworkTypeObserver.b(context).c() == 1) {
                                errorInfo = new ErrorInfo(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    errorInfo = new ErrorInfo(6, 0);
                                    i6 = 9;
                                    i5 = 6;
                                    i7 = 13;
                                    i3 = 8;
                                    i4 = 7;
                                } else {
                                    i10 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i9 = 7;
                                        errorInfo = new ErrorInfo(7, 0);
                                    } else {
                                        i9 = 7;
                                        if (z6 && ((HttpDataSource.HttpDataSourceException) cause).Z == 1) {
                                            errorInfo = new ErrorInfo(4, 0);
                                        } else {
                                            i11 = 8;
                                            errorInfo = new ErrorInfo(8, 0);
                                        }
                                    }
                                    i6 = 9;
                                    i4 = i9;
                                    i5 = 6;
                                    i7 = 13;
                                    i3 = 8;
                                }
                            }
                        } else if (i23 == 1002) {
                            errorInfo = new ErrorInfo(21, 0);
                        } else if (cause instanceof DrmSession.DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i25 = Util.f18979a;
                            if (i25 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iP = Util.p(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (Util.o(iP)) {
                                    case 6002:
                                        i12 = 24;
                                        break;
                                    case 6003:
                                        i12 = 28;
                                        break;
                                    case 6004:
                                        i12 = 25;
                                        break;
                                    case 6005:
                                        i12 = 26;
                                        break;
                                    default:
                                        i12 = 27;
                                        break;
                                }
                                errorInfo = new ErrorInfo(i12, iP);
                            } else if (i25 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                errorInfo = new ErrorInfo(27, 0);
                            } else if (i25 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                errorInfo = new ErrorInfo(24, 0);
                            } else if (i25 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                errorInfo = new ErrorInfo(29, 0);
                            } else if (cause3 instanceof UnsupportedDrmException) {
                                errorInfo = new ErrorInfo(23, 0);
                            } else {
                                errorInfo = cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new ErrorInfo(28, 0) : new ErrorInfo(30, 0);
                            }
                        } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            errorInfo = (Util.f18979a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new ErrorInfo(32, 0) : new ErrorInfo(31, 0);
                        } else {
                            i8 = 9;
                            errorInfo = new ErrorInfo(9, 0);
                        }
                        i6 = i8;
                        i7 = 13;
                        i3 = 8;
                        i4 = 7;
                        i5 = 6;
                    }
                    i6 = i8;
                    i4 = i9;
                    i5 = i10;
                    i3 = i11;
                    i7 = 13;
                }
                this.f17238c.reportPlaybackErrorEvent(q.g().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(errorInfo.f17248a).setSubErrorCode(errorInfo.f17249b).setException(playbackException).build());
                i13 = 1;
                this.f17235A = true;
                this.f17243n = null;
            }
            i7 = 13;
            i3 = 8;
            i4 = 7;
            i5 = 6;
            i6 = 9;
            this.f17238c.reportPlaybackErrorEvent(q.g().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(errorInfo.f17248a).setSubErrorCode(errorInfo.f17249b).setException(playbackException).build());
            i13 = 1;
            this.f17235A = true;
            this.f17243n = null;
        }
        if (events.a(2)) {
            Tracks tracksD = player.d();
            boolean zA = tracksD.a(2);
            boolean zA2 = tracksD.a(i13);
            boolean zA3 = tracksD.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    format = null;
                } else {
                    format = null;
                    if (!Util.a(this.r, null)) {
                        int i26 = this.r == null ? 1 : 0;
                        this.r = null;
                        Q(1, jElapsedRealtime, null, i26);
                    }
                }
                if (!zA2 && !Util.a(this.s, format)) {
                    int i27 = this.s == null ? 1 : 0;
                    this.s = format;
                    Q(0, jElapsedRealtime, format, i27);
                }
                if (!zA3 && !Util.a(this.t, format)) {
                    int i28 = this.t == null ? 1 : 0;
                    this.t = format;
                    Q(2, jElapsedRealtime, format, i28);
                }
                pendingFormatUpdate = format;
            } else {
                pendingFormatUpdate = 0;
            }
        } else {
            pendingFormatUpdate = 0;
        }
        if (M(this.o)) {
            PendingFormatUpdate pendingFormatUpdate2 = this.o;
            Format format2 = pendingFormatUpdate2.f17250a;
            if (format2.s0 != -1) {
                int i29 = pendingFormatUpdate2.f17251b;
                if (!Util.a(this.r, format2)) {
                    int i30 = (this.r == null && i29 == 0) ? 1 : i29;
                    this.r = format2;
                    Q(1, jElapsedRealtime, format2, i30);
                }
                this.o = pendingFormatUpdate;
            }
        }
        if (M(this.f17244p)) {
            PendingFormatUpdate pendingFormatUpdate3 = this.f17244p;
            Format format3 = pendingFormatUpdate3.f17250a;
            int i31 = pendingFormatUpdate3.f17251b;
            if (!Util.a(this.s, format3)) {
                int i32 = (this.s == null && i31 == 0) ? 1 : i31;
                this.s = format3;
                Q(0, jElapsedRealtime, format3, i32);
            }
            this.f17244p = pendingFormatUpdate;
        }
        if (M(this.q)) {
            PendingFormatUpdate pendingFormatUpdate4 = this.q;
            Format format4 = pendingFormatUpdate4.f17250a;
            int i33 = pendingFormatUpdate4.f17251b;
            if (!Util.a(this.t, format4)) {
                int i34 = (this.t == null && i33 == 0) ? 1 : i33;
                this.t = format4;
                Q(2, jElapsedRealtime, format4, i34);
            }
            this.q = pendingFormatUpdate;
        }
        switch (NetworkTypeObserver.b(context).c()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i6;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = 4;
                break;
            case 4:
                i14 = 5;
                break;
            case 5:
                i14 = i5;
                break;
            case 6:
            case 8:
            default:
                i14 = 1;
                break;
            case 7:
                i14 = 3;
                break;
            case 9:
                i14 = i3;
                break;
            case 10:
                i14 = i4;
                break;
        }
        if (i14 != this.m) {
            this.m = i14;
            this.f17238c.reportNetworkEvent(q.f().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
        }
        if (player.getPlaybackState() != 2) {
            this.f17245u = false;
        }
        if (player.a() == null) {
            this.f17246w = false;
            i15 = 10;
        } else {
            i15 = 10;
            if (events.a(10)) {
                this.f17246w = true;
            }
        }
        int playbackState = player.getPlaybackState();
        if (this.f17245u) {
            i16 = 5;
        } else if (this.f17246w) {
            i16 = i7;
        } else {
            i16 = 4;
            if (playbackState == 4) {
                i16 = 11;
            } else {
                i7 = 2;
                if (playbackState == 2) {
                    int i35 = this.f17242l;
                    if (i35 == 0 || i35 == 2) {
                        i16 = i7;
                    } else if (player.getPlayWhenReady()) {
                        i16 = player.e() != 0 ? i15 : i5;
                    } else {
                        i16 = i4;
                    }
                } else {
                    i7 = 3;
                    if (playbackState != 3) {
                        i16 = (playbackState != 1 || this.f17242l == 0) ? this.f17242l : 12;
                    } else if (player.getPlayWhenReady()) {
                        if (player.e() != 0) {
                            i16 = i6;
                        } else {
                            i16 = i7;
                        }
                    }
                }
            }
        }
        if (this.f17242l != i16) {
            this.f17242l = i16;
            this.f17235A = true;
            this.f17238c.reportPlaybackStateEvent(q.i().setState(this.f17242l).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
        }
        if (events.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            AnalyticsListener.EventTime eventTimeB3 = events.b(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
            synchronized (defaultPlaybackSessionManager) {
                defaultPlaybackSessionManager.f = null;
                Iterator it3 = defaultPlaybackSessionManager.f17229c.values().iterator();
                while (it3.hasNext()) {
                    DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = (DefaultPlaybackSessionManager.SessionDescriptor) it3.next();
                    it3.remove();
                    if (sessionDescriptor3.f17234e && (mediaMetricsListener = defaultPlaybackSessionManager.d) != null) {
                        mediaMetricsListener.P(eventTimeB3, sessionDescriptor3.f17231a);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void s(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.x += decoderCounters.g;
        this.y += decoderCounters.f17429e;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void u(int i2, long j, AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            String strB = this.f17237b.b(eventTime.f17214b, mediaPeriodId);
            HashMap map = this.f17240h;
            Long l2 = (Long) map.get(strB);
            HashMap map2 = this.g;
            Long l3 = (Long) map2.get(strB);
            map.put(strB, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strB, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i2)));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void v(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.f17243n = playbackException;
    }
}

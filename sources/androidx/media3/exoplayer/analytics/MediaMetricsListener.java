package androidx.media3.exoplayer.analytics;

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
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
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

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6013A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultPlaybackSessionManager f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f6016c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6019i;
    public PlaybackMetrics.Builder j;
    public int k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PlaybackException f6021n;
    public PendingFormatUpdate o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PendingFormatUpdate f6022p;
    public PendingFormatUpdate q;
    public Format r;
    public Format s;
    public Format t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6023u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6024w;
    public int x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6025z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Timeline.Window f6017e = new Timeline.Window();
    public final Timeline.Period f = new Timeline.Period();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f6018h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6020l = 0;
    public int m = 0;

    public static final class ErrorInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6027b;

        public ErrorInfo(int i2, int i3) {
            this.f6026a = i2;
            this.f6027b = i3;
        }
    }

    public static final class PendingFormatUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f6028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f6030c;

        public PendingFormatUpdate(Format format, int i2, String str) {
            this.f6028a = format;
            this.f6029b = i2;
            this.f6030c = str;
        }
    }

    public MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.f6014a = context.getApplicationContext();
        this.f6016c = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.f6015b = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.d = this;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void F(int i2, long j, AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            String strC = this.f6015b.c(eventTime.f5991b, mediaPeriodId);
            HashMap map = this.f6018h;
            Long l2 = (Long) map.get(strC);
            HashMap map2 = this.g;
            Long l3 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            map2.put(strC, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i2)));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void L(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        PendingFormatUpdate pendingFormatUpdate = this.o;
        if (pendingFormatUpdate != null) {
            Format format = pendingFormatUpdate.f6028a;
            if (format.t == -1) {
                Format.Builder builderA = format.a();
                builderA.r = videoSize.f5553a;
                builderA.s = videoSize.f5554b;
                this.o = new PendingFormatUpdate(new Format(builderA), pendingFormatUpdate.f6029b, pendingFormatUpdate.f6030c);
            }
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void M(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId == null) {
            return;
        }
        Format format = mediaLoadData.f6380c;
        format.getClass();
        mediaPeriodId.getClass();
        PendingFormatUpdate pendingFormatUpdate = new PendingFormatUpdate(format, mediaLoadData.d, this.f6015b.c(eventTime.f5991b, mediaPeriodId));
        int i2 = mediaLoadData.f6379b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f6022p = pendingFormatUpdate;
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

    /* JADX WARN: Code duplicated, block: B:258:0x0473  */
    /* JADX WARN: Code duplicated, block: B:276:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:277:0x04be  */
    /* JADX WARN: Code duplicated, block: B:285:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:372:0x05ed A[PHI: r7
  0x05ed: PHI (r7v26 int) = (r7v25 int), (r7v24 int) binds: [B:381:0x0603, B:371:0x05eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:391:0x0616  */
    /* JADX WARN: Code duplicated, block: B:394:0x063a  */
    /* JADX WARN: Code duplicated, block: B:398:0x0643 A[Catch: all -> 0x0652, TryCatch #0 {all -> 0x0652, blocks: (B:396:0x063f, B:398:0x0643, B:401:0x0654, B:402:0x065e, B:404:0x0664, B:406:0x0671, B:408:0x0675), top: B:415:0x063f }] */
    /* JADX WARN: Code duplicated, block: B:404:0x0664 A[Catch: all -> 0x0652, TryCatch #0 {all -> 0x0652, blocks: (B:396:0x063f, B:398:0x0643, B:401:0x0654, B:402:0x065e, B:404:0x0664, B:406:0x0671, B:408:0x0675), top: B:415:0x063f }] */
    /* JADX WARN: Code duplicated, block: B:414:0x067f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:415:0x063f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void N(Player player, AnalyticsListener.Events events) {
        DefaultPlaybackSessionManager defaultPlaybackSessionManager;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ErrorInfo errorInfo;
        ErrorInfo errorInfo2;
        ErrorInfo errorInfo3;
        int i10;
        int i11;
        int i12;
        PendingFormatUpdate pendingFormatUpdate;
        int i13;
        int i14;
        int i15;
        boolean z3;
        String str;
        Iterator it;
        DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor;
        MediaMetricsListener mediaMetricsListener;
        Format format;
        int i16;
        int i17;
        DrmInitData drmInitData;
        int i18;
        if (events.f5996a.f5397a.size() == 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            int size = events.f5996a.f5397a.size();
            defaultPlaybackSessionManager = this.f6015b;
            i2 = 1;
            if (i19 >= size) {
                break;
            }
            int iA = events.f5996a.a(i19);
            AnalyticsListener.EventTime eventTimeB = events.b(iA);
            if (iA == 0) {
                synchronized (defaultPlaybackSessionManager) {
                    try {
                        defaultPlaybackSessionManager.d.getClass();
                        Timeline timeline = defaultPlaybackSessionManager.f6008e;
                        defaultPlaybackSessionManager.f6008e = eventTimeB.f5991b;
                        Iterator it2 = defaultPlaybackSessionManager.f6007c.values().iterator();
                        while (it2.hasNext()) {
                            DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 = (DefaultPlaybackSessionManager.SessionDescriptor) it2.next();
                            if (!sessionDescriptor2.b(timeline, defaultPlaybackSessionManager.f6008e) || sessionDescriptor2.a(eventTimeB)) {
                                it2.remove();
                                if (sessionDescriptor2.f6012e) {
                                    if (sessionDescriptor2.f6009a.equals(defaultPlaybackSessionManager.f)) {
                                        defaultPlaybackSessionManager.a(sessionDescriptor2);
                                    }
                                    defaultPlaybackSessionManager.d.T(eventTimeB, sessionDescriptor2.f6009a);
                                }
                            }
                        }
                        defaultPlaybackSessionManager.d(eventTimeB);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA == 11) {
                int i20 = this.k;
                synchronized (defaultPlaybackSessionManager) {
                    try {
                        defaultPlaybackSessionManager.d.getClass();
                        if (i20 != 0) {
                            i2 = 0;
                        }
                        Iterator it3 = defaultPlaybackSessionManager.f6007c.values().iterator();
                        while (it3.hasNext()) {
                            DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = (DefaultPlaybackSessionManager.SessionDescriptor) it3.next();
                            if (sessionDescriptor3.a(eventTimeB)) {
                                it3.remove();
                                if (sessionDescriptor3.f6012e) {
                                    boolean zEquals = sessionDescriptor3.f6009a.equals(defaultPlaybackSessionManager.f);
                                    if (i2 != 0 && zEquals) {
                                        boolean z4 = sessionDescriptor3.f;
                                    }
                                    if (zEquals) {
                                        defaultPlaybackSessionManager.a(sessionDescriptor3);
                                    }
                                    defaultPlaybackSessionManager.d.T(eventTimeB, sessionDescriptor3.f6009a);
                                }
                            }
                        }
                        defaultPlaybackSessionManager.d(eventTimeB);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                defaultPlaybackSessionManager.e(eventTimeB);
            }
            i19++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (events.a(0)) {
            AnalyticsListener.EventTime eventTimeB2 = events.b(0);
            if (this.j != null) {
                S(eventTimeB2.f5991b, eventTimeB2.d);
            }
        }
        if (events.a(2) && this.j != null) {
            UnmodifiableListIterator unmodifiableListIteratorListIterator = player.d().f5547a.listIterator(0);
            loop3: while (true) {
                if (!unmodifiableListIteratorListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                Tracks.Group group = (Tracks.Group) unmodifiableListIteratorListIterator.next();
                for (int i21 = 0; i21 < group.f5548a; i21++) {
                    if (group.f5551e[i21] && (drmInitData = group.a(i21).q) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builderJ = p.j(this.j);
                int i22 = 0;
                while (true) {
                    if (i22 >= drmInitData.e0) {
                        i18 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.X[i22].f5396Y;
                    if (uuid.equals(C.d)) {
                        i18 = 3;
                        break;
                    } else if (uuid.equals(C.f5381e)) {
                        i18 = 2;
                        break;
                    } else {
                        if (uuid.equals(C.f5380c)) {
                            i18 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builderJ.setDrmType(i18);
            }
        }
        if (events.a(1011)) {
            this.f6025z++;
        }
        PlaybackException playbackException = this.f6021n;
        Context context = this.f6014a;
        long j = this.d;
        if (playbackException == null) {
            i7 = 4;
            i9 = 13;
            i4 = 8;
            i5 = 7;
            i6 = 6;
            i8 = 9;
        } else {
            boolean z5 = this.v == 4;
            int i23 = playbackException.X;
            if (i23 == 1001) {
                errorInfo = new ErrorInfo(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z2 = exoPlaybackException.Z == 1;
                    i3 = exoPlaybackException.h0;
                } else {
                    z2 = false;
                    i3 = 0;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i24 = 27;
                    i4 = 8;
                    i5 = 7;
                    i6 = 6;
                    i7 = 4;
                    i8 = 9;
                    if (z2 && (i3 == 0 || i3 == 1)) {
                        errorInfo3 = new ErrorInfo(35, 0);
                    } else if (z2 && i3 == 3) {
                        errorInfo3 = new ErrorInfo(15, 0);
                    } else if (z2 && i3 == 2) {
                        errorInfo = new ErrorInfo(23, 0);
                        i9 = 13;
                    } else if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                        i9 = 13;
                        errorInfo = new ErrorInfo(13, Util.t(((MediaCodecRenderer.DecoderInitializationException) cause).e0));
                    } else {
                        i9 = 13;
                        if (cause instanceof MediaCodecDecoderException) {
                            errorInfo2 = new ErrorInfo(14, ((MediaCodecDecoderException) cause).X);
                        } else if (cause instanceof OutOfMemoryError) {
                            errorInfo2 = new ErrorInfo(14, 0);
                        } else if (cause instanceof AudioSink.InitializationException) {
                            errorInfo = new ErrorInfo(17, ((AudioSink.InitializationException) cause).X);
                        } else if (cause instanceof AudioSink.WriteException) {
                            errorInfo = new ErrorInfo(18, ((AudioSink.WriteException) cause).X);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (Util.s(errorCode)) {
                                case 6002:
                                    i24 = 24;
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
                            }
                            errorInfo = new ErrorInfo(i24, errorCode);
                        } else {
                            errorInfo = new ErrorInfo(22, 0);
                        }
                        errorInfo = errorInfo2;
                    }
                    errorInfo = errorInfo3;
                    i9 = 13;
                } else if (cause instanceof HttpDataSource.InvalidResponseCodeException) {
                    errorInfo = new ErrorInfo(5, ((HttpDataSource.InvalidResponseCodeException) cause).e0);
                } else {
                    if ((cause instanceof HttpDataSource.InvalidContentTypeException) || (cause instanceof ParserException)) {
                        i5 = 7;
                        i6 = 6;
                        errorInfo = new ErrorInfo(z5 ? 10 : 11, 0);
                        i8 = 9;
                        i7 = 4;
                        i4 = 8;
                    } else {
                        boolean z6 = cause instanceof HttpDataSource.HttpDataSourceException;
                        if (z6 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                            i10 = 9;
                            if (NetworkTypeObserver.b(context).c() == 1) {
                                errorInfo = new ErrorInfo(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    errorInfo = new ErrorInfo(6, 0);
                                    i8 = 9;
                                    i6 = 6;
                                    i9 = 13;
                                    i4 = 8;
                                    i5 = 7;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    errorInfo = new ErrorInfo(7, 0);
                                    i8 = 9;
                                    i5 = 7;
                                    i6 = 6;
                                    i9 = 13;
                                    i4 = 8;
                                } else {
                                    i5 = 7;
                                    if (z6 && ((HttpDataSource.HttpDataSourceException) cause).Z == 1) {
                                        errorInfo = new ErrorInfo(4, 0);
                                        i8 = 9;
                                        i7 = 4;
                                        i6 = 6;
                                        i9 = 13;
                                        i4 = 8;
                                    } else {
                                        errorInfo = new ErrorInfo(8, 0);
                                        i8 = 9;
                                        i7 = 4;
                                        i4 = 8;
                                        i6 = 6;
                                    }
                                }
                                i7 = 4;
                            }
                        } else if (i23 == 1002) {
                            errorInfo = new ErrorInfo(21, 0);
                        } else if (cause instanceof DrmSession.DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i25 = Util.f5683a;
                            if (i25 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iT = Util.t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (Util.s(iT)) {
                                    case 6002:
                                        i11 = 24;
                                        break;
                                    case 6003:
                                        i11 = 28;
                                        break;
                                    case 6004:
                                        i11 = 25;
                                        break;
                                    case 6005:
                                        i11 = 26;
                                        break;
                                    default:
                                        i11 = 27;
                                        break;
                                }
                                errorInfo = new ErrorInfo(i11, iT);
                            } else if (i25 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                errorInfo = new ErrorInfo(27, 0);
                            } else if (cause3 instanceof NotProvisionedException) {
                                errorInfo = new ErrorInfo(24, 0);
                            } else if (cause3 instanceof DeniedByServerException) {
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
                            errorInfo = (Util.f5683a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new ErrorInfo(32, 0) : new ErrorInfo(31, 0);
                        } else {
                            i10 = 9;
                            errorInfo = new ErrorInfo(9, 0);
                        }
                        i8 = i10;
                        i9 = 13;
                        i4 = 8;
                        i5 = 7;
                        i6 = 6;
                        i7 = 4;
                    }
                    i9 = 13;
                }
                this.f6016c.reportPlaybackErrorEvent(q.g().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(errorInfo.f6026a).setSubErrorCode(errorInfo.f6027b).setException(playbackException).build());
                i2 = 1;
                this.f6013A = true;
                this.f6021n = null;
            }
            i9 = 13;
            i4 = 8;
            i5 = 7;
            i6 = 6;
            i7 = 4;
            i8 = 9;
            this.f6016c.reportPlaybackErrorEvent(q.g().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(errorInfo.f6026a).setSubErrorCode(errorInfo.f6027b).setException(playbackException).build());
            i2 = 1;
            this.f6013A = true;
            this.f6021n = null;
        }
        if (events.a(2)) {
            Tracks tracksD = player.d();
            boolean zA = tracksD.a(2);
            boolean zA2 = tracksD.a(i2);
            boolean zA3 = tracksD.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    format = null;
                } else {
                    format = null;
                    if (!Util.a(this.r, null)) {
                        int i26 = this.r == null ? 1 : 0;
                        this.r = null;
                        i9 = i9;
                        i7 = i7;
                        i12 = 10;
                        i13 = 5;
                        U(1, jElapsedRealtime, null, i26);
                    }
                    if (!zA2 && !Util.a(this.s, format)) {
                        if (this.s == null) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        this.s = format;
                        U(0, jElapsedRealtime, format, i17);
                    }
                    if (!zA3 && !Util.a(this.t, format)) {
                        if (this.t == null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        this.t = format;
                        U(2, jElapsedRealtime, format, i16);
                    }
                    pendingFormatUpdate = format;
                }
                i12 = 10;
                i13 = 5;
                if (!zA2) {
                    if (this.s == null) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                    this.s = format;
                    U(0, jElapsedRealtime, format, i17);
                }
                if (!zA3) {
                    if (this.t == null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    this.t = format;
                    U(2, jElapsedRealtime, format, i16);
                }
                pendingFormatUpdate = format;
            } else {
                i9 = i9;
                i7 = i7;
                i12 = 10;
                pendingFormatUpdate = 0;
                i13 = 5;
            }
        } else {
            i9 = i9;
            i7 = i7;
            i12 = 10;
            pendingFormatUpdate = 0;
            i13 = 5;
        }
        if (Q(this.o)) {
            PendingFormatUpdate pendingFormatUpdate2 = this.o;
            Format format2 = pendingFormatUpdate2.f6028a;
            if (format2.t != -1) {
                int i27 = pendingFormatUpdate2.f6029b;
                if (!Util.a(this.r, format2)) {
                    int i28 = (this.r == null && i27 == 0) ? 1 : i27;
                    this.r = format2;
                    U(1, jElapsedRealtime, format2, i28);
                }
                this.o = pendingFormatUpdate;
            }
        }
        if (Q(this.f6022p)) {
            PendingFormatUpdate pendingFormatUpdate3 = this.f6022p;
            Format format3 = pendingFormatUpdate3.f6028a;
            int i29 = pendingFormatUpdate3.f6029b;
            if (!Util.a(this.s, format3)) {
                int i30 = (this.s == null && i29 == 0) ? 1 : i29;
                this.s = format3;
                U(0, jElapsedRealtime, format3, i30);
            }
            this.f6022p = pendingFormatUpdate;
        }
        if (Q(this.q)) {
            PendingFormatUpdate pendingFormatUpdate4 = this.q;
            Format format4 = pendingFormatUpdate4.f6028a;
            int i31 = pendingFormatUpdate4.f6029b;
            if (!Util.a(this.t, format4)) {
                int i32 = (this.t == null && i31 == 0) ? 1 : i31;
                this.t = format4;
                U(2, jElapsedRealtime, format4, i32);
            }
            this.q = pendingFormatUpdate;
        }
        switch (NetworkTypeObserver.b(context).c()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i8;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = i7;
                break;
            case 4:
                i14 = i13;
                break;
            case 5:
                i14 = i6;
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
                i14 = i4;
                break;
            case 10:
                i14 = i5;
                break;
        }
        if (i14 != this.m) {
            this.m = i14;
            this.f6016c.reportNetworkEvent(q.f().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
        }
        if (player.getPlaybackState() != 2) {
            this.f6023u = false;
        }
        if (player.a() == null) {
            this.f6024w = false;
        } else if (events.a(i12)) {
            this.f6024w = true;
        }
        int playbackState = player.getPlaybackState();
        if (this.f6023u) {
            i15 = i13;
        } else {
            if (!this.f6024w) {
                if (playbackState == i7) {
                    z3 = true;
                    i15 = 11;
                } else {
                    i15 = 12;
                    if (playbackState == 2) {
                        int i33 = this.f6020l;
                        if (i33 == 0 || i33 == 2 || i33 == 12) {
                            i15 = 2;
                        } else if (!player.getPlayWhenReady()) {
                            i15 = i5;
                        } else if (player.e() != 0) {
                            i15 = i12;
                        } else {
                            i15 = i6;
                        }
                    } else {
                        i12 = 3;
                        if (playbackState != 3) {
                            z3 = true;
                            if (playbackState != 1 || this.f6020l == 0) {
                                i15 = this.f6020l;
                            }
                        } else if (!player.getPlayWhenReady()) {
                            i15 = i7;
                        } else if (player.e() != 0) {
                            i15 = i8;
                        } else {
                            i15 = i12;
                        }
                    }
                }
                if (this.f6020l != i15) {
                    this.f6020l = i15;
                    this.f6013A = z3;
                    this.f6016c.reportPlaybackStateEvent(q.i().setState(this.f6020l).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
                }
                if (events.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
                    AnalyticsListener.EventTime eventTimeB3 = events.b(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
                    synchronized (defaultPlaybackSessionManager) {
                        try {
                            str = defaultPlaybackSessionManager.f;
                            if (str != null) {
                                DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor4 = (DefaultPlaybackSessionManager.SessionDescriptor) defaultPlaybackSessionManager.f6007c.get(str);
                                sessionDescriptor4.getClass();
                                defaultPlaybackSessionManager.a(sessionDescriptor4);
                            }
                            it = defaultPlaybackSessionManager.f6007c.values().iterator();
                            while (it.hasNext()) {
                                sessionDescriptor = (DefaultPlaybackSessionManager.SessionDescriptor) it.next();
                                it.remove();
                                if (!sessionDescriptor.f6012e && (mediaMetricsListener = defaultPlaybackSessionManager.d) != null) {
                                    mediaMetricsListener.T(eventTimeB3, sessionDescriptor.f6009a);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            i15 = i9;
        }
        z3 = true;
        if (this.f6020l != i15) {
            this.f6020l = i15;
            this.f6013A = z3;
            this.f6016c.reportPlaybackStateEvent(q.i().setState(this.f6020l).setTimeSinceCreatedMillis(jElapsedRealtime - j).build());
        }
        if (events.a(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            AnalyticsListener.EventTime eventTimeB4 = events.b(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
            synchronized (defaultPlaybackSessionManager) {
                str = defaultPlaybackSessionManager.f;
                if (str != null) {
                    DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor5 = (DefaultPlaybackSessionManager.SessionDescriptor) defaultPlaybackSessionManager.f6007c.get(str);
                    sessionDescriptor5.getClass();
                    defaultPlaybackSessionManager.a(sessionDescriptor5);
                }
                it = defaultPlaybackSessionManager.f6007c.values().iterator();
                while (it.hasNext()) {
                    sessionDescriptor = (DefaultPlaybackSessionManager.SessionDescriptor) it.next();
                    it.remove();
                    if (!sessionDescriptor.f6012e) {
                    }
                }
            }
        }
    }

    public final boolean Q(PendingFormatUpdate pendingFormatUpdate) {
        String str;
        if (pendingFormatUpdate == null) {
            return false;
        }
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.f6015b;
        synchronized (defaultPlaybackSessionManager) {
            str = defaultPlaybackSessionManager.f;
        }
        return pendingFormatUpdate.f6030c.equals(str);
    }

    public final void R() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f6013A) {
            builder.setAudioUnderrunCount(this.f6025z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l2 = (Long) this.g.get(this.f6019i);
            this.j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f6018h.get(this.f6019i);
            this.j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f6016c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.f6019i = null;
        this.f6025z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.f6013A = false;
    }

    public final void S(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        int iB;
        PlaybackMetrics.Builder builder = this.j;
        if (mediaPeriodId == null || (iB = timeline.b(mediaPeriodId.f6384a)) == -1) {
            return;
        }
        Timeline.Period period = this.f;
        int i2 = 0;
        timeline.f(iB, period, false);
        int i3 = period.f5510c;
        Timeline.Window window = this.f6017e;
        timeline.n(i3, window);
        MediaItem.LocalConfiguration localConfiguration = window.f5515c.f5438b;
        if (localConfiguration != null) {
            int iC = Util.C(localConfiguration.f5458a, localConfiguration.f5459b);
            if (iC == 0) {
                i2 = 3;
            } else if (iC != 1) {
                i2 = iC != 2 ? 1 : 4;
            } else {
                i2 = 5;
            }
        }
        builder.setStreamType(i2);
        if (window.f5519l != -9223372036854775807L && !window.j && !window.f5517h && !window.a()) {
            builder.setMediaDurationMillis(Util.T(window.f5519l));
        }
        builder.setPlaybackType(window.a() ? 2 : 1);
        this.f6013A = true;
    }

    public final void T(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if ((mediaPeriodId == null || !mediaPeriodId.b()) && str.equals(this.f6019i)) {
            R();
        }
        this.g.remove(str);
        this.f6018h.remove(str);
    }

    public final void U(int i2, long j, Format format, int i3) {
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
            String str = format.f5412l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = format.f5411i;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = format.s;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = format.t;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = format.f5400A;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = format.f5401B;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = format.d;
            if (str4 != null) {
                int i10 = Util.f5683a;
                String[] strArrSplit = str4.split(TokenBuilder.TOKEN_DELIMITER, -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = format.f5415u;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f6013A = true;
        this.f6016c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void g(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.f6021n = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void j(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.x += decoderCounters.g;
        this.y += decoderCounters.f5826e;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void n(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
        this.v = mediaLoadData.f6378a;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void s(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        if (i2 == 1) {
            this.f6023u = true;
        }
        this.k = i2;
    }
}

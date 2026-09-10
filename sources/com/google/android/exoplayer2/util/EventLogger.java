package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class EventLogger implements AnalyticsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NumberFormat f18902a;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f18902a = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String M(AnalyticsListener.EventTime eventTime, String str, String str2, Exception exc) {
        String str3;
        StringBuilder sbX = android.support.v4.media.a.x(str, " [");
        sbX.append(N(eventTime));
        String string = sbX.toString();
        if (exc instanceof PlaybackException) {
            StringBuilder sbX2 = android.support.v4.media.a.x(string, ", errorCode=");
            int i2 = ((PlaybackException) exc).X;
            if (i2 == 5001) {
                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            } else if (i2 != 5002) {
                switch (i2) {
                    case 1000:
                        str3 = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case 1001:
                        str3 = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case 1003:
                        str3 = "ERROR_CODE_TIMEOUT";
                        break;
                    case 1004:
                        str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i2) {
                            case 2000:
                                str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i2) {
                                    case 3001:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i2) {
                                            case 4001:
                                                str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str3 = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 6000:
                                                        str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                        break;
                                                    case 6001:
                                                        str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break;
                                                    case 6002:
                                                        str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break;
                                                    case 6003:
                                                        str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break;
                                                    case 6004:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break;
                                                    case 6005:
                                                        str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break;
                                                    case 6006:
                                                        str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break;
                                                    case 6007:
                                                        str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                        break;
                                                    case 6008:
                                                        str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                        break;
                                                    default:
                                                        str3 = i2 < 1000000 ? "invalid error code" : "custom error code";
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            }
            sbX2.append(str3);
            string = sbX2.toString();
        }
        if (str2 != null) {
            string = android.support.v4.media.a.D(string, ", ", str2);
        }
        String strE = Log.e(exc);
        if (!TextUtils.isEmpty(strE)) {
            StringBuilder sbX3 = android.support.v4.media.a.x(string, "\n  ");
            sbX3.append(strE.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  "));
            sbX3.append('\n');
            string = sbX3.toString();
        }
        return android.support.v4.media.a.m(string, d9.i.f24752e);
    }

    public static String N(AnalyticsListener.EventTime eventTime) {
        String string = "window=" + eventTime.f17215c;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            StringBuilder sbX = android.support.v4.media.a.x(string, ", period=");
            sbX.append(eventTime.f17214b.b(mediaPeriodId.f18347a));
            string = sbX.toString();
            if (mediaPeriodId.a()) {
                StringBuilder sbX2 = android.support.v4.media.a.x(string, ", adGroup=");
                sbX2.append(mediaPeriodId.f18348b);
                StringBuilder sbX3 = android.support.v4.media.a.x(sbX2.toString(), ", ad=");
                sbX3.append(mediaPeriodId.f18349c);
                string = sbX3.toString();
            }
        }
        StringBuilder sb = new StringBuilder("eventTime=");
        long j = eventTime.f17213a;
        NumberFormat numberFormat = f18902a;
        sb.append(j == -9223372036854775807L ? "?" : numberFormat.format(j / 1000.0f));
        sb.append(", mediaPos=");
        long j2 = eventTime.f17216e;
        return android.support.v4.media.a.s(sb, j2 != -9223372036854775807L ? numberFormat.format(j2 / 1000.0f) : "?", ", ", string);
    }

    public static void O(AnalyticsListener.EventTime eventTime, String str) {
        Log.b(null, M(eventTime, str, null, null));
    }

    public static void P(AnalyticsListener.EventTime eventTime, String str, String str2) {
        Log.b(null, M(eventTime, str, str2, null));
    }

    public static void Q(Metadata metadata, String str) {
        for (int i2 = 0; i2 < metadata.X.length; i2++) {
            StringBuilder sbW = android.support.v4.media.a.w(str);
            sbW.append(metadata.X[i2]);
            Log.b(null, sbW.toString());
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void A(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(N(eventTime));
        sb.append(", reason=");
        if (i2 == 0) {
            str = "REPEAT";
        } else if (i2 == 1) {
            str = "AUTO";
        } else if (i2 != 2) {
            str = i2 != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        sb.append(str);
        sb.append(d9.i.f24752e);
        Log.b(null, sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void B(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        P(eventTime, "videoSize", videoSize.X + ", " + videoSize.f19026Y);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void C(AnalyticsListener.EventTime eventTime, Format format) {
        P(eventTime, "audioInputFormat", Format.c(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void D(AnalyticsListener.EventTime eventTime) {
        O(eventTime, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void E(AnalyticsListener.EventTime eventTime, Object obj) {
        P(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void F(AnalyticsListener.EventTime eventTime, float f) {
        P(eventTime, "volume", Float.toString(f));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void G(AnalyticsListener.EventTime eventTime, boolean z2) {
        P(eventTime, "isPlaying", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        P(eventTime, "downstreamFormat", Format.c(mediaLoadData.f18344c));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void I(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        if (i2 == 0) {
            str = "AUTO_TRANSITION";
        } else if (i2 == 1) {
            str = "SEEK";
        } else if (i2 == 2) {
            str = "SEEK_ADJUSTMENT";
        } else if (i2 == 3) {
            str = "SKIP";
        } else if (i2 != 4) {
            str = i2 != 5 ? "?" : "INTERNAL";
        } else {
            str = "REMOVE";
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(positionInfo.f17188Y);
        sb.append(", period=");
        sb.append(positionInfo.f0);
        sb.append(", pos=");
        sb.append(positionInfo.g0);
        int i3 = positionInfo.i0;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo.h0);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(positionInfo.j0);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(positionInfo2.f17188Y);
        sb.append(", period=");
        sb.append(positionInfo2.f0);
        sb.append(", pos=");
        sb.append(positionInfo2.g0);
        int i4 = positionInfo2.i0;
        if (i4 != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo2.h0);
            sb.append(", adGroup=");
            sb.append(i4);
            sb.append(", ad=");
            sb.append(positionInfo2.j0);
        }
        sb.append(d9.i.f24752e);
        P(eventTime, "positionDiscontinuity", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void J(AnalyticsListener.EventTime eventTime, String str) {
        P(eventTime, "audioDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void K(AnalyticsListener.EventTime eventTime, boolean z2) {
        P(eventTime, "loading", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void L(AnalyticsListener.EventTime eventTime, int i2) {
        P(eventTime, "droppedFrames", Integer.toString(i2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void a(AnalyticsListener.EventTime eventTime) {
        O(eventTime, "audioDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void b(AnalyticsListener.EventTime eventTime, String str) {
        P(eventTime, "videoDecoderReleased", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void c(AnalyticsListener.EventTime eventTime, int i2) {
        P(eventTime, "drmSessionAcquired", "state=" + i2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void d(AnalyticsListener.EventTime eventTime, Exception exc) {
        Log.c(null, M(eventTime, "internalError", "drmSessionManagerError", exc));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void e(AnalyticsListener.EventTime eventTime) {
        O(eventTime, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void f(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        if (i2 != 0) {
            str = i2 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else {
            str = "NONE";
        }
        P(eventTime, "playbackSuppressionReason", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void g(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
        Log.c(null, M(eventTime, "internalError", "loadError", iOException));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void h(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        Log.b(null, "metadata [" + N(eventTime));
        Q(metadata, "  ");
        Log.b(null, d9.i.f24752e);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void i(AnalyticsListener.EventTime eventTime, String str) {
        P(eventTime, "videoDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void k(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        if (i2 == 1) {
            str = "IDLE";
        } else if (i2 == 2) {
            str = "BUFFERING";
        } else if (i2 != 3) {
            str = i2 != 4 ? "?" : "ENDED";
        } else {
            str = "READY";
        }
        P(eventTime, "state", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void l(AnalyticsListener.EventTime eventTime, String str) {
        P(eventTime, "audioDecoderInitialized", str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void m(AnalyticsListener.EventTime eventTime, Format format) {
        P(eventTime, "videoInputFormat", Format.c(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void n(AnalyticsListener.EventTime eventTime, int i2, int i3) {
        P(eventTime, "surfaceSize", i2 + ", " + i3);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void o(AnalyticsListener.EventTime eventTime, boolean z2) {
        P(eventTime, "skipSilenceEnabled", Boolean.toString(z2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void p(AnalyticsListener.EventTime eventTime, int i2, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z2);
        sb.append(", ");
        if (i2 == 1) {
            str = "USER_REQUEST";
        } else if (i2 == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i2 == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i2 != 4) {
            str = i2 != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        sb.append(str);
        P(eventTime, "playWhenReady", sb.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void q(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        Timeline timeline = eventTime.f17214b;
        int iH = timeline.h();
        int iO = timeline.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(N(eventTime));
        sb.append(", periodCount=");
        sb.append(iH);
        sb.append(", windowCount=");
        sb.append(iO);
        sb.append(", reason=");
        if (i2 != 0) {
            str = i2 != 1 ? "?" : "SOURCE_UPDATE";
        } else {
            str = "PLAYLIST_CHANGED";
        }
        sb.append(str);
        Log.b(null, sb.toString());
        if (Math.min(iH, 3) > 0) {
            timeline.f(0, null, false);
            throw null;
        }
        if (iH > 3) {
            Log.b(null, "  ...");
        }
        if (Math.min(iO, 3) > 0) {
            timeline.n(0, null);
            throw null;
        }
        if (iO > 3) {
            Log.b(null, "  ...");
        }
        Log.b(null, d9.i.f24752e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void r(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        Log.b(null, "tracks [" + N(eventTime));
        ImmutableList immutableList = tracks.X;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            Tracks.Group group = (Tracks.Group) immutableList.get(i2);
            Log.b(null, "  group [");
            for (int i3 = 0; i3 < group.X; i3++) {
                String str = group.f0[i3] ? "[X]" : "[ ]";
                String strQ = Util.q(group.e0[i3]);
                StringBuilder sbZ = android.support.v4.media.a.z("    ", str, " Track:", i3, ", ");
                sbZ.append(Format.c(group.f17211Y.e0[i3]));
                sbZ.append(", supported=");
                sbZ.append(strQ);
                Log.b(null, sbZ.toString());
            }
            Log.b(null, "  ]");
        }
        boolean z2 = false;
        for (int i4 = 0; !z2 && i4 < immutableList.size(); i4++) {
            Tracks.Group group2 = (Tracks.Group) immutableList.get(i4);
            for (int i5 = 0; !z2 && i5 < group2.X; i5++) {
                if (group2.f0[i5] && (metadata = group2.f17211Y.e0[i5].k0) != null && metadata.X.length > 0) {
                    Log.b(null, "  Metadata [");
                    Q(metadata, "    ");
                    Log.b(null, "  ]");
                    z2 = true;
                }
            }
        }
        Log.b(null, d9.i.f24752e);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void s(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        O(eventTime, "videoDisabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void t(AnalyticsListener.EventTime eventTime) {
        O(eventTime, "videoEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void v(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        Log.c(null, M(eventTime, "playerFailed", null, playbackException));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void w(AnalyticsListener.EventTime eventTime) {
        O(eventTime, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void x(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        P(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void y(AnalyticsListener.EventTime eventTime, int i2, long j, long j2) {
        Log.c(null, M(eventTime, "audioTrackUnderrun", i2 + ", " + j + ", " + j2, null));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void z(AnalyticsListener.EventTime eventTime) {
        O(eventTime, "audioEnabled");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void u(int i2, long j, AnalyticsListener.EventTime eventTime) {
    }
}

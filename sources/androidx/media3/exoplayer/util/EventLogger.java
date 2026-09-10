package androidx.media3.exoplayer.util;

import android.support.v4.media.a;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class EventLogger implements AnalyticsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NumberFormat f6594a;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f6594a = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String Q(AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.f6082a + "," + audioTrackConfig.f6084c + "," + audioTrackConfig.f6083b + "," + audioTrackConfig.d + "," + audioTrackConfig.f6085e + "," + audioTrackConfig.f;
    }

    public static String R(AnalyticsListener.EventTime eventTime, String str, String str2, Exception exc) {
        StringBuilder sbX = a.x(str, " [");
        sbX.append(S(eventTime));
        String string = sbX.toString();
        if (exc instanceof PlaybackException) {
            StringBuilder sbX2 = a.x(string, ", errorCode=");
            sbX2.append(((PlaybackException) exc).d());
            string = sbX2.toString();
        }
        if (str2 != null) {
            string = a.D(string, ", ", str2);
        }
        String strE = Log.e(exc);
        if (!TextUtils.isEmpty(strE)) {
            StringBuilder sbX3 = a.x(string, "\n  ");
            sbX3.append(strE.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  "));
            sbX3.append('\n');
            string = sbX3.toString();
        }
        return a.m(string, d9.i.f24752e);
    }

    public static String S(AnalyticsListener.EventTime eventTime) {
        String string = "window=" + eventTime.f5992c;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            StringBuilder sbX = a.x(string, ", period=");
            sbX.append(eventTime.f5991b.b(mediaPeriodId.f6384a));
            string = sbX.toString();
            if (mediaPeriodId.b()) {
                StringBuilder sbX2 = a.x(string, ", adGroup=");
                sbX2.append(mediaPeriodId.f6385b);
                StringBuilder sbX3 = a.x(sbX2.toString(), ", ad=");
                sbX3.append(mediaPeriodId.f6386c);
                string = sbX3.toString();
            }
        }
        StringBuilder sb = new StringBuilder("eventTime=");
        long j = eventTime.f5990a;
        NumberFormat numberFormat = f6594a;
        sb.append(j == -9223372036854775807L ? "?" : numberFormat.format(j / 1000.0f));
        sb.append(", mediaPos=");
        long j2 = eventTime.f5993e;
        return a.s(sb, j2 != -9223372036854775807L ? numberFormat.format(j2 / 1000.0f) : "?", ", ", string);
    }

    public static void T(AnalyticsListener.EventTime eventTime, String str) {
        Log.b(null, R(eventTime, str, null, null));
    }

    public static void U(AnalyticsListener.EventTime eventTime, String str, String str2) {
        Log.b(null, R(eventTime, str, str2, null));
    }

    public static void V(Metadata metadata, String str) {
        for (int i2 = 0; i2 < metadata.X.length; i2++) {
            StringBuilder sbW = a.w(str);
            sbW.append(metadata.X[i2]);
            Log.b(null, sbW.toString());
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void A(AnalyticsListener.EventTime eventTime, String str) {
        U(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void B(AnalyticsListener.EventTime eventTime, String str) {
        U(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void C(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        U(eventTime, "audioTrackReleased", Q(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void D(AnalyticsListener.EventTime eventTime, String str) {
        U(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void E(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        if (i2 != 0) {
            str = i2 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else {
            str = "NONE";
        }
        U(eventTime, "playbackSuppressionReason", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void G(AnalyticsListener.EventTime eventTime, int i2) {
        U(eventTime, "droppedFrames", Integer.toString(i2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime) {
        T(eventTime, "drmKeysRestored");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void I(AnalyticsListener.EventTime eventTime) {
        T(eventTime, "audioEnabled");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void J(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        Log.b(null, "tracks [" + S(eventTime));
        ImmutableList immutableList = tracks.f5547a;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            Tracks.Group group = (Tracks.Group) immutableList.get(i2);
            Log.b(null, "  group [");
            for (int i3 = 0; i3 < group.f5548a; i3++) {
                String str = group.f5551e[i3] ? "[X]" : "[ ]";
                String strU = Util.u(group.d[i3]);
                StringBuilder sbZ = a.z("    ", str, " Track:", i3, ", ");
                sbZ.append(Format.c(group.a(i3)));
                sbZ.append(", supported=");
                sbZ.append(strU);
                Log.b(null, sbZ.toString());
            }
            Log.b(null, "  ]");
        }
        boolean z2 = false;
        for (int i4 = 0; !z2 && i4 < immutableList.size(); i4++) {
            Tracks.Group group2 = (Tracks.Group) immutableList.get(i4);
            for (int i5 = 0; !z2 && i5 < group2.f5548a; i5++) {
                if (group2.f5551e[i5] && (metadata = group2.a(i5).k) != null && metadata.X.length > 0) {
                    Log.b(null, "  Metadata [");
                    V(metadata, "    ");
                    Log.b(null, "  ]");
                    z2 = true;
                }
            }
        }
        Log.b(null, d9.i.f24752e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void K(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        if (i2 == 0) {
            str = "OFF";
        } else if (i2 != 1) {
            str = i2 != 2 ? "?" : "ALL";
        } else {
            str = "ONE";
        }
        U(eventTime, "repeatMode", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void L(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        U(eventTime, "videoSize", videoSize.f5553a + ", " + videoSize.f5554b);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void M(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        U(eventTime, "downstreamFormat", Format.c(mediaLoadData.f6380c));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void O(AnalyticsListener.EventTime eventTime) {
        T(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void P(AnalyticsListener.EventTime eventTime, String str) {
        U(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void a(AnalyticsListener.EventTime eventTime, boolean z2) {
        U(eventTime, "loading", Boolean.toString(z2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void b(AnalyticsListener.EventTime eventTime, Object obj) {
        U(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void c(AnalyticsListener.EventTime eventTime) {
        T(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void d(AnalyticsListener.EventTime eventTime, boolean z2) {
        U(eventTime, "isPlaying", Boolean.toString(z2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void e(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        Log.b(null, "metadata [" + S(eventTime));
        V(metadata, "  ");
        Log.b(null, d9.i.f24752e);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void f(AnalyticsListener.EventTime eventTime, boolean z2) {
        U(eventTime, "skipSilenceEnabled", Boolean.toString(z2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void g(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        Log.c(null, R(eventTime, "playerFailed", null, playbackException));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void h(AnalyticsListener.EventTime eventTime, boolean z2, int i2) {
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
        U(eventTime, "playWhenReady", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void i(AnalyticsListener.EventTime eventTime, Format format) {
        U(eventTime, "audioInputFormat", Format.c(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void j(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        T(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void k(AnalyticsListener.EventTime eventTime) {
        T(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void l(AnalyticsListener.EventTime eventTime) {
        T(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void m(AnalyticsListener.EventTime eventTime, Format format) {
        U(eventTime, "videoInputFormat", Format.c(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void n(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
        Log.c(null, R(eventTime, "internalError", "loadError", iOException));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void o(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        Timeline timeline = eventTime.f5991b;
        int iH = timeline.h();
        int iO = timeline.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(S(eventTime));
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void p(AnalyticsListener.EventTime eventTime, Exception exc) {
        Log.c(null, R(eventTime, "internalError", "drmSessionManagerError", exc));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void q(AnalyticsListener.EventTime eventTime, int i2) {
        String str;
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(S(eventTime));
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

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void r(AnalyticsListener.EventTime eventTime, int i2, int i3) {
        U(eventTime, "surfaceSize", i2 + ", " + i3);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void s(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i2) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(positionInfo.f5501b);
        sb.append(", period=");
        sb.append(positionInfo.f5503e);
        sb.append(", pos=");
        sb.append(positionInfo.f);
        int i3 = positionInfo.f5504h;
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(positionInfo.f5505i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(positionInfo2.f5501b);
        sb.append(", period=");
        sb.append(positionInfo2.f5503e);
        sb.append(", pos=");
        sb.append(positionInfo2.f);
        int i4 = positionInfo2.f5504h;
        if (i4 != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo2.g);
            sb.append(", adGroup=");
            sb.append(i4);
            sb.append(", ad=");
            sb.append(positionInfo2.f5505i);
        }
        sb.append(d9.i.f24752e);
        U(eventTime, "positionDiscontinuity", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void t(AnalyticsListener.EventTime eventTime, int i2) {
        U(eventTime, "drmSessionAcquired", "state=" + i2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void u(AnalyticsListener.EventTime eventTime, float f) {
        U(eventTime, "volume", Float.toString(f));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void v(AnalyticsListener.EventTime eventTime, boolean z2) {
        U(eventTime, "shuffleModeEnabled", Boolean.toString(z2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void w(AnalyticsListener.EventTime eventTime, int i2) {
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
        U(eventTime, "state", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void x(AnalyticsListener.EventTime eventTime, int i2, long j, long j2) {
        Log.c(null, R(eventTime, "audioTrackUnderrun", i2 + ", " + j + ", " + j2, null));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void y(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        U(eventTime, "audioTrackInit", Q(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void z(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        U(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void F(int i2, long j, AnalyticsListener.EventTime eventTime) {
    }
}

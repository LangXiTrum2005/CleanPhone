package incorrectly;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: MediaMetricsListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class hyalinization implements incorrectly.saneness, puffin.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f28699adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f28700apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public saneness f28701arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f28702attabal;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f28705cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f28706cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public PlaybackMetrics.Builder f28707cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PlaybackSession f28708dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f28709dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f28711gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public androidx.media3.common.polloi f28712graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public saneness f28715kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public androidx.media3.common.polloi f28717molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public saneness f28718monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public androidx.media3.common.polloi f28719polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f28720preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f28721rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final puffin f28722saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public String f28723taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public PlaybackException f28724triweekly;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final androidx.media3.common.oilcan.dern f28716marial = new androidx.media3.common.oilcan.dern();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final androidx.media3.common.oilcan.saneness f28703beachfront = new androidx.media3.common.oilcan.saneness();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final HashMap<String, Long> f28714impromptu = new HashMap<>();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final HashMap<String, Long> f28704competently = new HashMap<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f28725wireman = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f28710formularize = 0;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f28713impassible = 0;

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f28726attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f28727saneness;

        public attabal(int i, int i2) {
            this.f28726attabal = i;
            this.f28727saneness = i2;
        }
    }

    /* JADX INFO: compiled from: MediaMetricsListener.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final androidx.media3.common.polloi f28728attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String f28729dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f28730saneness;

        public saneness(androidx.media3.common.polloi polloiVar, int i, String str) {
            this.f28728attabal = polloiVar;
            this.f28730saneness = i;
            this.f28729dern = str;
        }
    }

    public hyalinization(Context context, PlaybackSession playbackSession) {
        this.f28702attabal = context.getApplicationContext();
        this.f28708dern = playbackSession;
        czestochowa czestochowaVar = new czestochowa();
        this.f28722saneness = czestochowaVar;
        czestochowaVar.competently(this);
    }

    public static int claque(androidx.media3.common.adultoid adultoidVar) {
        androidx.media3.common.adultoid.impromptu impromptuVar = adultoidVar.f10619saneness;
        if (impromptuVar == null) {
            return 0;
        }
        int iPreterite = decarock.grimness.preterite(impromptuVar.f10706attabal, impromptuVar.f10712saneness);
        if (iPreterite == 0) {
            return 3;
        }
        if (iPreterite != 1) {
            return iPreterite != 2 ? 1 : 4;
        }
        return 5;
    }

    public static int hardpan(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    public static hyalinization igbo(Context context) {
        MediaMetricsManager mediaMetricsManagerAttabal = liable.attabal(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerAttabal == null) {
            return null;
        }
        return new hyalinization(context, mediaMetricsManagerAttabal.createPlaybackSession());
    }

    public static Pair<String, String> julian(String str) {
        String[] strArrOsteal = decarock.grimness.osteal(str, "-");
        return Pair.create(strArrOsteal[0], strArrOsteal.length >= 2 ? strArrOsteal[1] : null);
    }

    public static int lightstruck(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.f10583polloi; i++) {
            UUID uuid = drmInitData.dern(i).f10584arytenoidectomy;
            if (uuid.equals(androidx.media3.common.competently.f10816wireman)) {
                return 3;
            }
            if (uuid.equals(androidx.media3.common.competently.f10814marial)) {
                return 2;
            }
            if (uuid.equals(androidx.media3.common.competently.f10813dern)) {
                return 6;
            }
        }
        return 1;
    }

    public static attabal monroe(PlaybackException playbackException, Context context, boolean z) {
        int i;
        boolean z2;
        if (playbackException.errorCode == 1001) {
            return new attabal(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z2 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) decarock.attabal.marial(playbackException.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new attabal(35, 0);
            }
            if (z2 && i == 3) {
                return new attabal(15, 0);
            }
            if (z2 && i == 2) {
                return new attabal(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new attabal(13, decarock.grimness.mathsort(((MediaCodecRenderer.DecoderInitializationException) th).diagnosticInfo));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new attabal(14, ((MediaCodecDecoderException) th).errorCode);
            }
            if (th instanceof OutOfMemoryError) {
                return new attabal(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new attabal(17, ((AudioSink.InitializationException) th).audioTrackState);
            }
            if (th instanceof AudioSink.WriteException) {
                return new attabal(18, ((AudioSink.WriteException) th).errorCode);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new attabal(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new attabal(picketboat(errorCode), errorCode);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            return new attabal(5, ((HttpDataSource$InvalidResponseCodeException) th).responseCode);
        }
        if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
            return new attabal(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof HttpDataSource$HttpDataSourceException;
        if (z3 || (th instanceof UdpDataSource.UdpDataSourceException)) {
            if (decarock.molybdenite.wireman(context).beachfront() == 1) {
                return new attabal(3, 0);
            }
            Throwable cause = th.getCause();
            if (cause instanceof UnknownHostException) {
                return new attabal(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new attabal(7, 0);
            }
            return (z3 && ((HttpDataSource$HttpDataSourceException) th).type == 1) ? new attabal(4, 0) : new attabal(8, 0);
        }
        if (playbackException.errorCode == 1002) {
            return new attabal(21, 0);
        }
        if (!(th instanceof DrmSession.DrmSessionException)) {
            if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
                return new attabal(9, 0);
            }
            Throwable cause2 = ((Throwable) decarock.attabal.marial(th.getCause())).getCause();
            return (decarock.grimness.f25080attabal >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new attabal(32, 0) : new attabal(31, 0);
        }
        Throwable th2 = (Throwable) decarock.attabal.marial(th.getCause());
        int i2 = decarock.grimness.f25080attabal;
        if (i2 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
            int iMathsort = decarock.grimness.mathsort(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new attabal(picketboat(iMathsort), iMathsort);
        }
        if (i2 >= 23 && (th2 instanceof MediaDrmResetException)) {
            return new attabal(27, 0);
        }
        if (th2 instanceof NotProvisionedException) {
            return new attabal(24, 0);
        }
        if (th2 instanceof DeniedByServerException) {
            return new attabal(29, 0);
        }
        if (th2 instanceof UnsupportedDrmException) {
            return new attabal(23, 0);
        }
        return th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new attabal(28, 0) : new attabal(30, 0);
    }

    public static DrmInitData palmyra(ImmutableList<androidx.media3.common.supplicat.attabal> immutableList) {
        DrmInitData drmInitData;
        com.google.common.collect.immediately<androidx.media3.common.supplicat.attabal> it = immutableList.iterator();
        while (it.hasNext()) {
            androidx.media3.common.supplicat.attabal next = it.next();
            for (int i = 0; i < next.f11299attabal; i++) {
                if (next.marial(i) && (drmInitData = next.saneness(i).f11208polloi) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    public static int picketboat(int i) {
        switch (decarock.grimness.peridotite(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    public static int unconsolidated(Context context) {
        switch (decarock.molybdenite.wireman(context).beachfront()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public LogSessionId achondroplasia() {
        return this.f28708dern.getSessionId();
    }

    public final void attendance(long j, androidx.media3.common.polloi polloiVar, int i) {
        if (decarock.grimness.dern(this.f28712graveside, polloiVar)) {
            return;
        }
        if (this.f28712graveside == null && i == 0) {
            i = 1;
        }
        this.f28712graveside = polloiVar;
        libyan(2, j, polloiVar, i);
    }

    @Override // incorrectly.saneness
    public void clubfoot(incorrectly.saneness.attabal attabalVar, androidx.media3.common.polder polderVar) {
        saneness sanenessVar = this.f28715kowloon;
        if (sanenessVar != null) {
            androidx.media3.common.polloi polloiVar = sanenessVar.f28728attabal;
            if (polloiVar.f11184adultoid == -1) {
                this.f28715kowloon = new saneness(polloiVar.attabal().palmyra(polderVar.f11146attabal).dent(polderVar.f11148saneness).polder(), sanenessVar.f28730saneness, sanenessVar.f28729dern);
            }
        }
    }

    @Override // incorrectly.puffin.attabal
    public void competently(incorrectly.saneness.attabal attabalVar, String str, boolean z) {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = attabalVar.f28799wireman;
        if ((sanenessVar == null || !sanenessVar.saneness()) && str.equals(this.f28723taiyuan)) {
            gusty();
        }
        this.f28704competently.remove(str);
        this.f28714impromptu.remove(str);
    }

    public final int deadwork(androidx.media3.common.cord cordVar) {
        int playbackState = cordVar.getPlaybackState();
        if (this.f28699adultoid) {
            return 5;
        }
        if (this.f28711gintrap) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.f28710formularize;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (cordVar.getPlayWhenReady()) {
                return cordVar.apical() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (cordVar.getPlayWhenReady()) {
                return cordVar.apical() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.f28710formularize == 0) {
            return this.f28710formularize;
        }
        return 12;
    }

    public final void dhss(androidx.media3.common.cord cordVar, incorrectly.saneness.C0651saneness c0651saneness, long j) {
        if (cordVar.getPlaybackState() != 2) {
            this.f28699adultoid = false;
        }
        if (cordVar.marial() == null) {
            this.f28711gintrap = false;
        } else if (c0651saneness.attabal(10)) {
            this.f28711gintrap = true;
        }
        int iDeadwork = deadwork(cordVar);
        if (this.f28710formularize != iDeadwork) {
            this.f28710formularize = iDeadwork;
            this.f28706cuirassed = true;
            this.f28708dern.reportPlaybackStateEvent(stupefactive.attabal().setState(this.f28710formularize).setTimeSinceCreatedMillis(j - this.f28725wireman).build());
        }
    }

    @Override // incorrectly.saneness
    public void dovishness(incorrectly.saneness.attabal attabalVar, ethene.arytenoidectomy arytenoidectomyVar) {
        if (attabalVar.f28799wireman == null) {
            return;
        }
        saneness sanenessVar = new saneness((androidx.media3.common.polloi) decarock.attabal.marial(arytenoidectomyVar.f26009dern), arytenoidectomyVar.f26012wireman, this.f28722saneness.dern(attabalVar.f28797saneness, (androidx.media3.exoplayer.source.formularize.saneness) decarock.attabal.marial(attabalVar.f28799wireman)));
        int i = arytenoidectomyVar.f26011saneness;
        if (i != 0) {
            if (i == 1) {
                this.f28701arytenoidectomy = sanenessVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f28718monoploid = sanenessVar;
                return;
            }
        }
        this.f28715kowloon = sanenessVar;
    }

    public final void gusty() {
        PlaybackMetrics.Builder builder = this.f28707cutely;
        if (builder != null && this.f28706cuirassed) {
            builder.setAudioUnderrunCount(this.f28705cord);
            this.f28707cutely.setVideoFramesDropped(this.f28721rotuma);
            this.f28707cutely.setVideoFramesPlayed(this.f28720preprohormone);
            Long l = this.f28704competently.get(this.f28723taiyuan);
            this.f28707cutely.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.f28714impromptu.get(this.f28723taiyuan);
            this.f28707cutely.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.f28707cutely.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f28708dern.reportPlaybackMetrics(this.f28707cutely.build());
        }
        this.f28707cutely = null;
        this.f28723taiyuan = null;
        this.f28705cord = 0;
        this.f28721rotuma = 0;
        this.f28720preprohormone = 0;
        this.f28719polloi = null;
        this.f28717molybdenite = null;
        this.f28712graveside = null;
        this.f28706cuirassed = false;
    }

    public final void herdbook(incorrectly.saneness.C0651saneness c0651saneness) {
        for (int i = 0; i < c0651saneness.wireman(); i++) {
            int iSaneness = c0651saneness.saneness(i);
            incorrectly.saneness.attabal attabalVarDern = c0651saneness.dern(iSaneness);
            if (iSaneness == 0) {
                this.f28722saneness.marial(attabalVarDern);
            } else if (iSaneness == 11) {
                this.f28722saneness.wireman(attabalVarDern, this.f28700apical);
            } else {
                this.f28722saneness.beachfront(attabalVarDern);
            }
        }
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void homozygous(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        int iSaneness;
        PlaybackMetrics.Builder builder = this.f28707cutely;
        if (sanenessVar == null || (iSaneness = oilcanVar.saneness(sanenessVar.f12518attabal)) == -1) {
            return;
        }
        oilcanVar.beachfront(iSaneness, this.f28703beachfront);
        oilcanVar.triweekly(this.f28703beachfront.f11137dern, this.f28716marial);
        builder.setStreamType(claque(this.f28716marial.f11119dern));
        androidx.media3.common.oilcan.dern dernVar = this.f28716marial;
        if (dernVar.f11121impassible != C.TIME_UNSET && !dernVar.f11113apical && !dernVar.f11126taiyuan && !dernVar.beachfront()) {
            builder.setMediaDurationMillis(this.f28716marial.wireman());
        }
        builder.setPlaybackType(this.f28716marial.beachfront() ? 2 : 1);
        this.f28706cuirassed = true;
    }

    @Override // incorrectly.puffin.attabal
    public void hydrovane(incorrectly.saneness.attabal attabalVar, String str) {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = attabalVar.f28799wireman;
        if (sanenessVar == null || !sanenessVar.saneness()) {
            gusty();
            this.f28723taiyuan = str;
            this.f28707cutely = attendance.attabal().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
            homozygous(attabalVar.f28797saneness, attabalVar.f28799wireman);
        }
    }

    @Override // incorrectly.saneness
    public void impromptu(incorrectly.saneness.attabal attabalVar, ethene.kowloon kowloonVar, ethene.arytenoidectomy arytenoidectomyVar, IOException iOException, boolean z) {
        this.f28709dovishness = arytenoidectomyVar.f26006attabal;
    }

    public final void lampshade(long j, androidx.media3.common.polloi polloiVar, int i) {
        if (decarock.grimness.dern(this.f28719polloi, polloiVar)) {
            return;
        }
        if (this.f28719polloi == null && i == 0) {
            i = 1;
        }
        this.f28719polloi = polloiVar;
        libyan(1, j, polloiVar, i);
    }

    public final void libyan(int i, long j, androidx.media3.common.polloi polloiVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = sensatory.attabal(i).setTimeSinceCreatedMillis(j - this.f28725wireman);
        if (polloiVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(hardpan(i2));
            String str = polloiVar.f11198impassible;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = polloiVar.f11218triweekly;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = polloiVar.f11192cutely;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = polloiVar.f11217taiyuan;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = polloiVar.f11197graveside;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = polloiVar.f11184adultoid;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = polloiVar.f11215stratoscope;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = polloiVar.f11219trm;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = polloiVar.f11220wireman;
            if (str4 != null) {
                Pair<String, String> pairJulian = julian(str4);
                timeSinceCreatedMillis.setLanguage((String) pairJulian.first);
                Object obj = pairJulian.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = polloiVar.f11194dovishness;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f28706cuirassed = true;
        this.f28708dern.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public final void mastfed(androidx.media3.common.cord cordVar, incorrectly.saneness.C0651saneness c0651saneness) {
        DrmInitData drmInitDataPalmyra;
        if (c0651saneness.attabal(0)) {
            incorrectly.saneness.attabal attabalVarDern = c0651saneness.dern(0);
            if (this.f28707cutely != null) {
                homozygous(attabalVarDern.f28797saneness, attabalVarDern.f28799wireman);
            }
        }
        if (c0651saneness.attabal(2) && this.f28707cutely != null && (drmInitDataPalmyra = palmyra(cordVar.beachfront().attabal())) != null) {
            vesuvio.attabal(decarock.grimness.impromptu(this.f28707cutely)).setDrmType(lightstruck(drmInitDataPalmyra));
        }
        if (c0651saneness.attabal(1011)) {
            this.f28705cord++;
        }
    }

    public final void outmarry(long j) {
        PlaybackException playbackException = this.f28724triweekly;
        if (playbackException == null) {
            return;
        }
        attabal attabalVarMonroe = monroe(playbackException, this.f28702attabal, this.f28709dovishness == 4);
        this.f28708dern.reportPlaybackErrorEvent(osteal.attabal().setTimeSinceCreatedMillis(j - this.f28725wireman).setErrorCode(attabalVarMonroe.f28726attabal).setSubErrorCode(attabalVarMonroe.f28727saneness).setException(playbackException).build());
        this.f28706cuirassed = true;
        this.f28724triweekly = null;
    }

    @Override // incorrectly.saneness
    public void preprohormone(incorrectly.saneness.attabal attabalVar, androidx.media3.exoplayer.kowloon kowloonVar) {
        this.f28721rotuma += kowloonVar.f11948competently;
        this.f28720preprohormone += kowloonVar.f11953marial;
    }

    @Override // incorrectly.saneness
    public void privatdozent(incorrectly.saneness.attabal attabalVar, int i, long j, long j2) {
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = attabalVar.f28799wireman;
        if (sanenessVar != null) {
            String strDern = this.f28722saneness.dern(attabalVar.f28797saneness, (androidx.media3.exoplayer.source.formularize.saneness) decarock.attabal.marial(sanenessVar));
            Long l = this.f28714impromptu.get(strDern);
            Long l2 = this.f28704competently.get(strDern);
            this.f28714impromptu.put(strDern, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.f28704competently.put(strDern, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    public final void setterwort(long j, androidx.media3.common.polloi polloiVar, int i) {
        if (decarock.grimness.dern(this.f28717molybdenite, polloiVar)) {
            return;
        }
        if (this.f28717molybdenite == null && i == 0) {
            i = 1;
        }
        this.f28717molybdenite = polloiVar;
        libyan(0, j, polloiVar, i);
    }

    public final void technofreak(long j) {
        int iUnconsolidated = unconsolidated(this.f28702attabal);
        if (iUnconsolidated != this.f28713impassible) {
            this.f28713impassible = iUnconsolidated;
            this.f28708dern.reportNetworkEvent(achondroplasia.attabal().setNetworkType(iUnconsolidated).setTimeSinceCreatedMillis(j - this.f28725wireman).build());
        }
    }

    @Override // incorrectly.saneness
    public void timberyard(incorrectly.saneness.attabal attabalVar, PlaybackException playbackException) {
        this.f28724triweekly = playbackException;
    }

    @Override // incorrectly.saneness
    public void underbelly(androidx.media3.common.cord cordVar, incorrectly.saneness.C0651saneness c0651saneness) {
        if (c0651saneness.wireman() == 0) {
            return;
        }
        herdbook(c0651saneness);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        mastfed(cordVar, c0651saneness);
        outmarry(jElapsedRealtime);
        vesuvio(cordVar, c0651saneness, jElapsedRealtime);
        technofreak(jElapsedRealtime);
        dhss(cordVar, c0651saneness, jElapsedRealtime);
        if (c0651saneness.attabal(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED)) {
            this.f28722saneness.saneness(c0651saneness.dern(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED));
        }
    }

    public final void vesuvio(androidx.media3.common.cord cordVar, incorrectly.saneness.C0651saneness c0651saneness, long j) {
        if (c0651saneness.attabal(2)) {
            androidx.media3.common.supplicat supplicatVarBeachfront = cordVar.beachfront();
            boolean zSaneness = supplicatVarBeachfront.saneness(2);
            boolean zSaneness2 = supplicatVarBeachfront.saneness(1);
            boolean zSaneness3 = supplicatVarBeachfront.saneness(3);
            if (zSaneness || zSaneness2 || zSaneness3) {
                if (!zSaneness) {
                    lampshade(j, null, 0);
                }
                if (!zSaneness2) {
                    setterwort(j, null, 0);
                }
                if (!zSaneness3) {
                    attendance(j, null, 0);
                }
            }
        }
        if (wostteth(this.f28715kowloon)) {
            saneness sanenessVar = this.f28715kowloon;
            androidx.media3.common.polloi polloiVar = sanenessVar.f28728attabal;
            if (polloiVar.f11184adultoid != -1) {
                lampshade(j, polloiVar, sanenessVar.f28730saneness);
                this.f28715kowloon = null;
            }
        }
        if (wostteth(this.f28701arytenoidectomy)) {
            saneness sanenessVar2 = this.f28701arytenoidectomy;
            setterwort(j, sanenessVar2.f28728attabal, sanenessVar2.f28730saneness);
            this.f28701arytenoidectomy = null;
        }
        if (wostteth(this.f28718monoploid)) {
            saneness sanenessVar3 = this.f28718monoploid;
            attendance(j, sanenessVar3.f28728attabal, sanenessVar3.f28730saneness);
            this.f28718monoploid = null;
        }
    }

    @Override // incorrectly.saneness
    public void walach(incorrectly.saneness.attabal attabalVar, androidx.media3.common.cord.marial marialVar, androidx.media3.common.cord.marial marialVar2, int i) {
        if (i == 1) {
            this.f28699adultoid = true;
        }
        this.f28700apical = i;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public final boolean wostteth(saneness sanenessVar) {
        return sanenessVar != null && sanenessVar.f28729dern.equals(this.f28722saneness.attabal());
    }

    @Override // incorrectly.puffin.attabal
    public void beachfront(incorrectly.saneness.attabal attabalVar, String str) {
    }

    @Override // incorrectly.puffin.attabal
    public void premeiotic(incorrectly.saneness.attabal attabalVar, String str, String str2) {
    }
}

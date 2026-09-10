package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.polloi;
import androidx.media3.common.preprohormone;
import androidx.media3.common.rotuma;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.arytenoidectomy;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.homozygous;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.underbelly;
import com.google.common.collect.ImmutableList;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import cybernatic.hydrovane;
import decarock.grimness;
import decarock.monoploid;
import decarock.triweekly;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class competently extends MediaCodecRenderer implements underbelly {

    /* JADX INFO: renamed from: cig, reason: collision with root package name */
    public polloi f11692cig;

    /* JADX INFO: renamed from: cosy, reason: collision with root package name */
    public boolean f11693cosy;

    /* JADX INFO: renamed from: decarock, reason: collision with root package name */
    public boolean f11694decarock;

    /* JADX INFO: renamed from: demilitarize, reason: collision with root package name */
    public long f11695demilitarize;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name */
    public int f11696fastrack;

    /* JADX INFO: renamed from: libya, reason: collision with root package name */
    public int f11697libya;

    /* JADX INFO: renamed from: licking, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.dern.attabal f11698licking;

    /* JADX INFO: renamed from: linendraper, reason: collision with root package name */
    public boolean f11699linendraper;

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name */
    public final AudioSink f11700microchemistry;

    /* JADX INFO: renamed from: osteal, reason: collision with root package name */
    public final Context f11701osteal;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name */
    public boolean f11702pruinose;

    /* JADX INFO: renamed from: stupefactive, reason: collision with root package name */
    public boolean f11703stupefactive;

    /* JADX INFO: renamed from: sultanate, reason: collision with root package name */
    public boolean f11704sultanate;

    /* JADX INFO: renamed from: tailoring, reason: collision with root package name */
    public long f11705tailoring;

    /* JADX INFO: renamed from: tarboosh, reason: collision with root package name */
    public polloi f11706tarboosh;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class dern implements AudioSink.saneness {
        public dern() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void attabal(AudioSink.attabal attabalVar) {
            competently.this.f11698licking.kowloon(attabalVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void beachfront() {
            homozygous.attabal attabalVarAttendance = competently.this.attendance();
            if (attabalVarAttendance != null) {
                attabalVarAttendance.attabal();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void competently() {
            competently.this.starveling();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void dern(Exception exc) {
            triweekly.wireman("MediaCodecAudioRenderer", "Audio sink error", exc);
            competently.this.f11698licking.triweekly(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void impromptu() {
            homozygous.attabal attabalVarAttendance = competently.this.attendance();
            if (attabalVarAttendance != null) {
                attabalVarAttendance.saneness();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void marial() {
            competently.this.f11703stupefactive = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void onPositionDiscontinuity() {
            competently.this.bleacherite();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void onSkipSilenceEnabledChanged(boolean z) {
            competently.this.f11698licking.gintrap(z);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void onUnderrun(int i, long j, long j2) {
            competently.this.f11698licking.rotuma(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void saneness(AudioSink.attabal attabalVar) {
            competently.this.f11698licking.arytenoidectomy(attabalVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.saneness
        public void wireman(long j) {
            competently.this.f11698licking.dovishness(j);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public static final class saneness {
        public static void attabal(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    public competently(Context context, androidx.media3.exoplayer.mediacodec.wireman.saneness sanenessVar, androidx.media3.exoplayer.mediacodec.competently competentlyVar, boolean z, Handler handler, androidx.media3.exoplayer.audio.dern dernVar, AudioSink audioSink) {
        super(1, sanenessVar, competentlyVar, z, 44100.0f);
        this.f11701osteal = context.getApplicationContext();
        this.f11700microchemistry = audioSink;
        this.f11697libya = -1000;
        this.f11698licking = new androidx.media3.exoplayer.audio.dern.attabal(handler, dernVar);
        this.f11705tailoring = C.TIME_UNSET;
        audioSink.marial(new dern());
    }

    public static boolean brighton() {
        if (grimness.f25080attabal != 23) {
            return false;
        }
        String str = grimness.f25094wireman;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    public static boolean imparkation(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    public static List<androidx.media3.exoplayer.mediacodec.marial> nattier(androidx.media3.exoplayer.mediacodec.competently competentlyVar, polloi polloiVar, boolean z, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        androidx.media3.exoplayer.mediacodec.marial marialVarRotuma;
        if (polloiVar.f11218triweekly == null) {
            return ImmutableList.of();
        }
        return (!audioSink.attabal(polloiVar) || (marialVarRotuma = MediaCodecUtil.rotuma()) == null) ? MediaCodecUtil.dovishness(competentlyVar, polloiVar, z, false) : ImmutableList.of(marialVarRotuma);
    }

    private int polliwog(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(marialVar.name) || (i = grimness.f25080attabal) >= 24 || (i == 23 && grimness.unconsolidated(this.f11701osteal))) {
            return polloiVar.f11201kowloon;
        }
        return -1;
    }

    public static boolean untruth(String str) {
        if (grimness.f25080attabal >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(grimness.f25084dern)) {
            return false;
        }
        String str2 = grimness.f25091saneness;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    public int balance(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar, polloi[] polloiVarArr) {
        int iPolliwog = polliwog(marialVar, polloiVar);
        if (polloiVarArr.length == 1) {
            return iPolliwog;
        }
        for (polloi polloiVar2 : polloiVarArr) {
            if (marialVar.marial(polloiVar, polloiVar2).f11535wireman != 0) {
                iPolliwog = Math.max(iPolliwog, polliwog(marialVar, polloiVar2));
            }
        }
        return iPolliwog;
    }

    public MediaFormat bavaria(polloi polloiVar, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", polloiVar.f11215stratoscope);
        mediaFormat.setInteger("sample-rate", polloiVar.f11219trm);
        monoploid.marial(mediaFormat, polloiVar.f11205monoploid);
        monoploid.wireman(mediaFormat, "max-input-size", i);
        int i2 = grimness.f25080attabal;
        if (i2 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f && !brighton()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(polloiVar.f11218triweekly)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f11700microchemistry.triweekly(grimness.timberyard(4, polloiVar.f11215stratoscope, polloiVar.f11219trm)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f11697libya));
        }
        return mediaFormat;
    }

    public void bleacherite() {
        this.f11704sultanate = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public arytenoidectomy cig(empress empressVar) throws ExoPlaybackException {
        polloi polloiVar = (polloi) decarock.attabal.marial(empressVar.f11879saneness);
        this.f11706tarboosh = polloiVar;
        arytenoidectomy arytenoidectomyVarCig = super.cig(empressVar);
        this.f11698licking.adultoid(polloiVar, arytenoidectomyVarCig);
        return arytenoidectomyVarCig;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float claque(float f, polloi polloiVar, polloi[] polloiVarArr) {
        int iMax = -1;
        for (polloi polloiVar2 : polloiVarArr) {
            int i = polloiVar2.f11219trm;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean collection(polloi polloiVar) {
        if (yemenite().f11959attabal != 0) {
            int iInfiltration = infiltration(polloiVar);
            if ((iInfiltration & 512) != 0) {
                if (yemenite().f11959attabal == 2 || (iInfiltration & 1024) != 0) {
                    return true;
                }
                if (polloiVar.f11221yemenite == 0 && polloiVar.f11213sealless == 0) {
                    return true;
                }
            }
        }
        return this.f11700microchemistry.attabal(polloiVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void cosy(Exception exc) {
        triweekly.wireman("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f11698licking.impassible(exc);
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void creditor() {
        this.f11700microchemistry.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void demilitarize(polloi polloiVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iPremeiotic;
        int i;
        polloi polloiVar2 = this.f11692cig;
        int[] iArrAttabal = null;
        if (polloiVar2 != null) {
            polloiVar = polloiVar2;
        } else if (monroe() != null) {
            decarock.attabal.marial(mediaFormat);
            if (MimeTypes.AUDIO_RAW.equals(polloiVar.f11218triweekly)) {
                iPremeiotic = polloiVar.f11206oilcan;
            } else if (grimness.f25080attabal < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iPremeiotic = mediaFormat.containsKey("v-bits-per-sample") ? grimness.premeiotic(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iPremeiotic = mediaFormat.getInteger("pcm-encoding");
            }
            polloi polloiVarPolder = new polloi.saneness().sensatory(MimeTypes.AUDIO_RAW).nosophobia(iPremeiotic).splinterproof(polloiVar.f11221yemenite).overspeculate(polloiVar.f11213sealless).lerp(polloiVar.f11185apical).peridotite(polloiVar.f11195formularize).cultivated(polloiVar.f11187attabal).timberyard(polloiVar.f11212saneness).milliradian(polloiVar.f11193dern).treadless(polloiVar.f11220wireman).preterite(polloiVar.f11202marial).coi(polloiVar.f11188beachfront).saran(mediaFormat.getInteger("channel-count")).underbelly(mediaFormat.getInteger("sample-rate")).polder();
            if (this.f11693cosy && polloiVarPolder.f11215stratoscope == 6 && (i = polloiVar.f11215stratoscope) < 6) {
                iArrAttabal = new int[i];
                for (int i2 = 0; i2 < polloiVar.f11215stratoscope; i2++) {
                    iArrAttabal[i2] = i2;
                }
            } else if (this.f11702pruinose) {
                iArrAttabal = hydrovane.attabal(polloiVarPolder.f11215stratoscope);
            }
            polloiVar = polloiVarPolder;
        }
        try {
            if (grimness.f25080attabal >= 29) {
                if (!immediately() || yemenite().f11959attabal == 0) {
                    this.f11700microchemistry.beachfront(0);
                } else {
                    this.f11700microchemistry.beachfront(yemenite().f11959attabal);
                }
            }
            this.f11700microchemistry.cutely(polloiVar, 0, iArrAttabal);
        } catch (AudioSink.ConfigurationException e) {
            throw stratoscope(e, e.format, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public androidx.media3.exoplayer.mediacodec.wireman.attabal dhss(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar, MediaCrypto mediaCrypto, float f) {
        this.f11696fastrack = balance(marialVar, polloiVar, merc());
        this.f11693cosy = untruth(marialVar.name);
        this.f11702pruinose = imparkation(marialVar.name);
        MediaFormat mediaFormatBavaria = bavaria(polloiVar, marialVar.f12086saneness, this.f11696fastrack, f);
        this.f11692cig = (!MimeTypes.AUDIO_RAW.equals(marialVar.f12079attabal) || MimeTypes.AUDIO_RAW.equals(polloiVar.f11218triweekly)) ? null : polloiVar;
        return androidx.media3.exoplayer.mediacodec.wireman.attabal.attabal(marialVar, mediaFormatBavaria, polloiVar, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.homozygous, androidx.media3.exoplayer.lampshade
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.underbelly
    public preprohormone getPlaybackParameters() {
        return this.f11700microchemistry.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.underbelly
    public long getPositionUs() {
        if (getState() == 2) {
            philabeg();
        }
        return this.f11695demilitarize;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void grimness(boolean z, boolean z2) throws ExoPlaybackException {
        super.grimness(z, z2);
        this.f11698licking.graveside(this.f12030sakeen);
        if (yemenite().f11960saneness) {
            this.f11700microchemistry.impassible();
        } else {
            this.f11700microchemistry.disableTunneling();
        }
        this.f11700microchemistry.taiyuan(restrictive());
        this.f11700microchemistry.competently(oilcan());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly, androidx.media3.exoplayer.mastfed.saneness
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f11700microchemistry.setVolume(((Float) decarock.attabal.marial(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.f11700microchemistry.dern((androidx.media3.common.saneness) decarock.attabal.marial((androidx.media3.common.saneness) obj));
            return;
        }
        if (i == 6) {
            this.f11700microchemistry.arytenoidectomy((androidx.media3.common.marial) decarock.attabal.marial((androidx.media3.common.marial) obj));
            return;
        }
        if (i == 12) {
            if (grimness.f25080attabal >= 23) {
                saneness.attabal(this.f11700microchemistry, obj);
            }
        } else if (i == 16) {
            this.f11697libya = ((Integer) decarock.attabal.marial(obj)).intValue();
            strother();
        } else if (i == 9) {
            this.f11700microchemistry.kowloon(((Boolean) decarock.attabal.marial(obj)).booleanValue());
        } else if (i != 10) {
            super.handleMessage(i, obj);
        } else {
            this.f11700microchemistry.setAudioSessionId(((Integer) decarock.attabal.marial(obj)).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<androidx.media3.exoplayer.mediacodec.marial> herdbook(androidx.media3.exoplayer.mediacodec.competently competentlyVar, polloi polloiVar, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.gintrap(nattier(competentlyVar, polloiVar, z, this.f11700microchemistry), polloiVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void homozygous(DecoderInputBuffer decoderInputBuffer) {
        polloi polloiVar;
        if (grimness.f25080attabal < 29 || (polloiVar = decoderInputBuffer.f11477arytenoidectomy) == null || !Objects.equals(polloiVar.f11218triweekly, MimeTypes.AUDIO_OPUS) || !immediately()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) decarock.attabal.marial(decoderInputBuffer.f11476adultoid);
        int i = ((polloi) decarock.attabal.marial(decoderInputBuffer.f11477arytenoidectomy)).f11221yemenite;
        if (byteBuffer.remaining() == 8) {
            this.f11700microchemistry.apical(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void hyalinization() throws ExoPlaybackException {
        try {
            this.f11700microchemistry.playToEndOfStream();
            if (outmarry() != C.TIME_UNSET) {
                this.f11705tailoring = outmarry();
            }
        } catch (AudioSink.WriteException e) {
            throw trm(e, e.format, e.isRecoverable, immediately() ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void hydrovane() {
        this.f11703stupefactive = false;
        try {
            super.hydrovane();
        } finally {
            if (this.f11699linendraper) {
                this.f11699linendraper = false;
                this.f11700microchemistry.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.underbelly
    public boolean impassible() {
        boolean z = this.f11703stupefactive;
        this.f11703stupefactive = false;
        return z;
    }

    public final int infiltration(polloi polloiVar) {
        androidx.media3.exoplayer.audio.saneness sanenessVarWireman = this.f11700microchemistry.wireman(polloiVar);
        if (!sanenessVarWireman.f11713attabal) {
            return 0;
        }
        int i = sanenessVarWireman.f11715saneness ? 1536 : 512;
        return sanenessVarWireman.f11714dern ? i | 2048 : i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.homozygous
    public boolean isEnded() {
        return super.isEnded() && this.f11700microchemistry.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.homozygous
    public boolean isReady() {
        return this.f11700microchemistry.hasPendingData() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean liable(long j, long j2, androidx.media3.exoplayer.mediacodec.wireman wiremanVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, polloi polloiVar) throws ExoPlaybackException {
        decarock.attabal.marial(byteBuffer);
        this.f11705tailoring = C.TIME_UNSET;
        if (this.f11692cig != null && (i2 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.wireman) decarock.attabal.marial(wiremanVar)).impassible(i, false);
            return true;
        }
        if (z) {
            if (wiremanVar != null) {
                wiremanVar.impassible(i, false);
            }
            this.f12030sakeen.f11947beachfront += i3;
            this.f11700microchemistry.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.f11700microchemistry.impromptu(byteBuffer, j3, i3)) {
                this.f11705tailoring = j3;
                return false;
            }
            if (wiremanVar != null) {
                wiremanVar.impassible(i, false);
            }
            this.f12030sakeen.f11953marial += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw trm(e, this.f11706tarboosh, e.isRecoverable, (!immediately() || yemenite().f11959attabal == 0) ? 5001 : 5004);
        } catch (AudioSink.WriteException e2) {
            throw trm(e2, polloiVar, e2.isRecoverable, (!immediately() || yemenite().f11959attabal == 0) ? 5002 : 5003);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int likeable(androidx.media3.exoplayer.mediacodec.competently competentlyVar, polloi polloiVar) throws MediaCodecUtil.DecoderQueryException {
        int i;
        boolean z;
        if (!rotuma.impromptu(polloiVar.f11218triweekly)) {
            return lampshade.formularize(0);
        }
        int i2 = grimness.f25080attabal >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = polloiVar.f11207polder != 0;
        boolean zHomophylic = MediaCodecRenderer.homophylic(polloiVar);
        int i3 = 8;
        if (!zHomophylic || (z3 && MediaCodecUtil.rotuma() == null)) {
            i = 0;
        } else {
            int iInfiltration = infiltration(polloiVar);
            if (this.f11700microchemistry.attabal(polloiVar)) {
                return lampshade.taiyuan(4, 8, i2, iInfiltration);
            }
            i = iInfiltration;
        }
        if (MimeTypes.AUDIO_RAW.equals(polloiVar.f11218triweekly) && !this.f11700microchemistry.attabal(polloiVar)) {
            return lampshade.formularize(1);
        }
        if (!this.f11700microchemistry.attabal(grimness.timberyard(2, polloiVar.f11215stratoscope, polloiVar.f11219trm))) {
            return lampshade.formularize(1);
        }
        List<androidx.media3.exoplayer.mediacodec.marial> listNattier = nattier(competentlyVar, polloiVar, false, this.f11700microchemistry);
        if (listNattier.isEmpty()) {
            return lampshade.formularize(1);
        }
        if (!zHomophylic) {
            return lampshade.formularize(2);
        }
        androidx.media3.exoplayer.mediacodec.marial marialVar = listNattier.get(0);
        boolean zImpassible = marialVar.impassible(polloiVar);
        if (!zImpassible) {
            int i4 = 1;
            while (true) {
                if (i4 >= listNattier.size()) {
                    z = true;
                    z2 = zImpassible;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.marial marialVar2 = listNattier.get(i4);
                if (marialVar2.impassible(polloiVar)) {
                    z = false;
                    marialVar = marialVar2;
                    break;
                }
                i4++;
            }
        } else {
            z = true;
            z2 = zImpassible;
            break;
        }
        int i5 = z2 ? 4 : 3;
        if (z2 && marialVar.arytenoidectomy(polloiVar)) {
            i3 = 16;
        }
        return lampshade.polloi(i5, i3, i2, marialVar.f12081competently ? 64 : 0, z ? 128 : 0, i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void peridotite() {
        philabeg();
        this.f11694decarock = false;
        this.f11700microchemistry.pause();
        super.peridotite();
    }

    public final void philabeg() {
        long currentPositionUs = this.f11700microchemistry.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.f11704sultanate) {
                currentPositionUs = Math.max(this.f11695demilitarize, currentPositionUs);
            }
            this.f11695demilitarize = currentPositionUs;
            this.f11704sultanate = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void privatdozent(long j, boolean z) throws ExoPlaybackException {
        super.privatdozent(j, z);
        this.f11700microchemistry.flush();
        this.f11695demilitarize = j;
        this.f11703stupefactive = false;
        this.f11704sultanate = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void pruinose(String str, androidx.media3.exoplayer.mediacodec.wireman.attabal attabalVar, long j, long j2) {
        this.f11698licking.monoploid(str, j, j2);
    }

    @Override // androidx.media3.exoplayer.underbelly
    public void saneness(preprohormone preprohormoneVar) {
        this.f11700microchemistry.saneness(preprohormoneVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void seminary() {
        this.f11699linendraper = true;
        this.f11706tarboosh = null;
        try {
            this.f11700microchemistry.flush();
            try {
                super.seminary();
            } finally {
                this.f11698licking.molybdenite(this.f12030sakeen);
            }
        } catch (Throwable th) {
            try {
                super.seminary();
                throw th;
            } finally {
                this.f11698licking.molybdenite(this.f12030sakeen);
            }
        }
    }

    public final void strother() {
        androidx.media3.exoplayer.mediacodec.wireman wiremanVarMonroe = monroe();
        if (wiremanVarMonroe != null && grimness.f25080attabal >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f11697libya));
            wiremanVarMonroe.dern(bundle);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void stupefactive() {
        super.stupefactive();
        this.f11700microchemistry.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void sultanate(long j) {
        this.f11700microchemistry.formularize(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void tarboosh(String str) {
        this.f11698licking.polloi(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long technofreak(boolean z, long j, long j2) {
        long j3 = this.f11705tailoring;
        if (j3 == C.TIME_UNSET) {
            return super.technofreak(z, j, j2);
        }
        long jOutmarry = (long) (((j3 - j) / (getPlaybackParameters() != null ? getPlaybackParameters().f11261attabal : 1.0f)) / 2.0f);
        if (this.f11694decarock) {
            jOutmarry -= grimness.outmarry(oilcan().elapsedRealtime()) - j2;
        }
        return Math.max(Ua.s, jOutmarry);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public arytenoidectomy timberyard(androidx.media3.exoplayer.mediacodec.marial marialVar, polloi polloiVar, polloi polloiVar2) {
        arytenoidectomy arytenoidectomyVarMarial = marialVar.marial(polloiVar, polloiVar2);
        int i = arytenoidectomyVarMarial.f11533marial;
        if (basify(polloiVar2)) {
            i |= 32768;
        }
        if (polliwog(marialVar, polloiVar2) > this.f11696fastrack) {
            i |= 64;
        }
        int i2 = i;
        return new arytenoidectomy(marialVar.name, polloiVar, polloiVar2, i2 != 0 ? 0 : arytenoidectomyVarMarial.f11535wireman, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.triweekly
    public void walach() {
        super.walach();
        this.f11700microchemistry.play();
        this.f11694decarock = true;
    }

    @Override // androidx.media3.exoplayer.triweekly, androidx.media3.exoplayer.homozygous
    public underbelly getMediaClock() {
        return this;
    }
}

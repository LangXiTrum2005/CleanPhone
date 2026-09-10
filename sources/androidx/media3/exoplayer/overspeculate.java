package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Metadata;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import incorrectly.ctenidium;
import incorrectly.hyalinization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ExoPlayerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class overspeculate extends androidx.media3.common.beachfront implements adultoid {

    /* JADX INFO: renamed from: unconsolidated, reason: collision with root package name */
    public static final /* synthetic */ int f12177unconsolidated = 0;

    /* JADX INFO: renamed from: achondroplasia, reason: collision with root package name */
    public long f12178achondroplasia;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final long f12179adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final sayid f12180apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final boolean f12181arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final androidx.media3.common.cord f12182beachfront;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public Object f12183clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public kowloon f12184coffeecake;

    /* JADX INFO: renamed from: coi, reason: collision with root package name */
    public libya.saneness f12185coi;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final homozygous[] f12186competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final marial f12187cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public adultoid.dern f12188creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final androidx.media3.exoplayer.saneness f12189cuirassed;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public SphericalGLSurfaceView f12190cultivated;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final sayid.beachfront f12191cutely;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
    public boolean f12192czestochowa;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public Surface f12193dent;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.common.cord.saneness f12194dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final long f12195dovishness;

    /* JADX INFO: renamed from: empress, reason: collision with root package name */
    public boolean f12196empress;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final decarock.impassible<androidx.media3.common.cord.wireman> f12197formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final long f12198gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final polyfoil.wireman f12199graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public boolean f12200grimness;

    /* JADX INFO: renamed from: gusty, reason: collision with root package name */
    public androidx.media3.common.formularize f12201gusty;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public androidx.media3.common.cord.saneness f12202hydrovane;

    /* JADX INFO: renamed from: igbo, reason: collision with root package name */
    public boolean f12203igbo;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final CopyOnWriteArraySet<adultoid.attabal> f12204impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final hydromechanics.trm f12205impromptu;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public decarock.trm f12206itchy;

    /* JADX INFO: renamed from: julian, reason: collision with root package name */
    public int f12207julian;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public AudioManager f12208kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<beachfront> f12209kowloon;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public kowloon f12210lerp;

    /* JADX INFO: renamed from: lightstruck, reason: collision with root package name */
    public setterwort f12211lightstruck;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name */
    public androidx.media3.common.saneness f12212lotta;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Context f12213marial;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public androidx.media3.common.polloi f12214mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public boolean f12215merc;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public int f12216milliradian;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Looper f12217molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.formularize.attabal f12218monoploid;

    /* JADX INFO: renamed from: monroe, reason: collision with root package name */
    public int f12219monroe;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public int f12220nosophobia;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final tectonization f12221oilcan;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public AudioTrack f12222overspeculate;

    /* JADX INFO: renamed from: palmyra, reason: collision with root package name */
    public androidx.media3.common.gintrap f12223palmyra;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public androidx.media3.common.gintrap f12224peridotite;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public SurfaceHolder f12225permissivist;

    /* JADX INFO: renamed from: picketboat, reason: collision with root package name */
    public androidx.media3.common.polder f12226picketboat;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public int f12227polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final incorrectly.attabal f12228polloi;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public boolean f12229premeiotic;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final wireman f12230preprohormone;

    /* JADX INFO: renamed from: preterite, reason: collision with root package name */
    public PriorityTaskManager f12231preterite;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public ethene.oilcan f12232privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f12233restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final decarock.wireman f12234rotuma;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final hydromechanics.oilcan f12235saneness;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public molet f12236saran;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public float f12237sayid;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final long f12238sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public int f12239seminary;

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
    public boolean f12240sensatory;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public androidx.media3.common.polloi f12241splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public boolean f12242starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final impassible f12243stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final boolean f12244supplicat;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final decarock.cutely f12245taiyuan;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public TextureView f12246timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public int f12247treadless;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final androidx.media3.common.oilcan.saneness f12248triweekly;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final immediately f12249trm;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
    public int f12250underbelly;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public androidx.media3.common.gintrap f12251walach;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final decarock.competently f12252wireman;

    /* JADX INFO: renamed from: wostteth, reason: collision with root package name */
    public boolean f12253wostteth;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public final prefect f12254yemenite;

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class beachfront implements picketboat {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Object f12255attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public androidx.media3.common.oilcan f12256dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.formularize f12257saneness;

        public beachfront(Object obj, androidx.media3.exoplayer.source.cutely cutelyVar) {
            this.f12255attabal = obj;
            this.f12257saneness = cutelyVar;
            this.f12256dern = cutelyVar.peridotite();
        }

        @Override // androidx.media3.exoplayer.picketboat
        public Object attabal() {
            return this.f12255attabal;
        }

        public void dern(androidx.media3.common.oilcan oilcanVar) {
            this.f12256dern = oilcanVar;
        }

        @Override // androidx.media3.exoplayer.picketboat
        public androidx.media3.common.oilcan saneness() {
            return this.f12256dern;
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public final class competently extends AudioDeviceCallback {
        public competently() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (overspeculate.this.basify() && overspeculate.this.f12211lightstruck.f12421triweekly == 3) {
                overspeculate overspeculateVar = overspeculate.this;
                overspeculateVar.incorrectly(overspeculateVar.f12211lightstruck.f12410formularize, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (overspeculate.this.basify()) {
                return;
            }
            overspeculate overspeculateVar = overspeculate.this;
            overspeculateVar.incorrectly(overspeculateVar.f12211lightstruck.f12410formularize, 1, 3);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class dern {
        public static ctenidium attabal(Context context, overspeculate overspeculateVar, boolean z, String str) {
            hyalinization hyalinizationVarIgbo = hyalinization.igbo(context);
            if (hyalinizationVarIgbo == null) {
                decarock.triweekly.impromptu("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new ctenidium(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z) {
                overspeculateVar.monroe(hyalinizationVarIgbo);
            }
            return new ctenidium(hyalinizationVarIgbo.achondroplasia(), str);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class marial implements bluecoat.apical, harlequinade.attabal, mastfed.saneness {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public harlequinade.attabal f12259arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public bluecoat.apical f12260kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public bluecoat.apical f12261monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public harlequinade.attabal f12262polloi;

        public marial() {
        }

        @Override // harlequinade.attabal
        public void attabal(long j, float[] fArr) {
            harlequinade.attabal attabalVar = this.f12262polloi;
            if (attabalVar != null) {
                attabalVar.attabal(j, fArr);
            }
            harlequinade.attabal attabalVar2 = this.f12259arytenoidectomy;
            if (attabalVar2 != null) {
                attabalVar2.attabal(j, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.mastfed.saneness
        public void handleMessage(int i, Object obj) {
            if (i == 7) {
                this.f12260kowloon = (bluecoat.apical) obj;
                return;
            }
            if (i == 8) {
                this.f12259arytenoidectomy = (harlequinade.attabal) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f12261monoploid = null;
                this.f12262polloi = null;
            } else {
                this.f12261monoploid = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f12262polloi = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // harlequinade.attabal
        public void saneness() {
            harlequinade.attabal attabalVar = this.f12262polloi;
            if (attabalVar != null) {
                attabalVar.saneness();
            }
            harlequinade.attabal attabalVar2 = this.f12259arytenoidectomy;
            if (attabalVar2 != null) {
                attabalVar2.saneness();
            }
        }

        @Override // bluecoat.apical
        public void wireman(long j, long j2, androidx.media3.common.polloi polloiVar, MediaFormat mediaFormat) {
            long j3;
            long j4;
            androidx.media3.common.polloi polloiVar2;
            MediaFormat mediaFormat2;
            bluecoat.apical apicalVar = this.f12261monoploid;
            if (apicalVar != null) {
                apicalVar.wireman(j, j2, polloiVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                polloiVar2 = polloiVar;
                j4 = j2;
                j3 = j;
            } else {
                j3 = j;
                j4 = j2;
                polloiVar2 = polloiVar;
                mediaFormat2 = mediaFormat;
            }
            bluecoat.apical apicalVar2 = this.f12260kowloon;
            if (apicalVar2 != null) {
                apicalVar2.wireman(j3, j4, polloiVar2, mediaFormat2);
            }
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public static final class saneness {
        public static boolean attabal(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!decarock.grimness.claque(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i = decarock.grimness.f25080attabal;
                if (i >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void saneness(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* JADX INFO: compiled from: ExoPlayerImpl.java */
    public final class wireman implements androidx.media3.exoplayer.video.marial, androidx.media3.exoplayer.audio.dern, microanalysis.impromptu, tout.saneness, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.saneness, impassible.saneness, androidx.media3.exoplayer.saneness.InterfaceC0088saneness, immediately.saneness, adultoid.attabal {
        public wireman() {
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void apical(kowloon kowloonVar) {
            overspeculate.this.f12228polloi.apical(kowloonVar);
            overspeculate.this.f12241splinterproof = null;
            overspeculate.this.f12210lerp = null;
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void arytenoidectomy(int i, long j, long j2) {
            overspeculate.this.f12228polloi.arytenoidectomy(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void attabal(AudioSink.attabal attabalVar) {
            overspeculate.this.f12228polloi.attabal(attabalVar);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void beachfront(kowloon kowloonVar) {
            overspeculate.this.f12210lerp = kowloonVar;
            overspeculate.this.f12228polloi.beachfront(kowloonVar);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void competently(kowloon kowloonVar) {
            overspeculate.this.f12184coffeecake = kowloonVar;
            overspeculate.this.f12228polloi.competently(kowloonVar);
        }

        @Override // androidx.media3.exoplayer.impassible.saneness
        public void cord(int i) {
            overspeculate.this.twybill(overspeculate.this.getPlayWhenReady(), i, overspeculate.lampshade(i));
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void cutely(Exception exc) {
            overspeculate.this.f12228polloi.cutely(exc);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void dern(Exception exc) {
            overspeculate.this.f12228polloi.dern(exc);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.saneness
        public void dovishness(Surface surface) {
            overspeculate.this.tailoring(surface);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void formularize(Object obj, long j) {
            overspeculate.this.f12228polloi.formularize(obj, j);
            if (overspeculate.this.f12183clubfoot == obj) {
                overspeculate.this.f12197formularize.apical(26, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.itchy
                    @Override // decarock.impassible.attabal
                    public final void invoke(Object obj2) {
                        ((androidx.media3.common.cord.wireman) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.immediately.saneness
        public void gintrap(final int i, final boolean z) {
            overspeculate.this.f12197formularize.apical(30, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.milliradian
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onDeviceVolumeChanged(i, z);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.saneness
        public void graveside(Surface surface) {
            overspeculate.this.tailoring(null);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void impassible(androidx.media3.common.polloi polloiVar, arytenoidectomy arytenoidectomyVar) {
            overspeculate.this.f12214mathsort = polloiVar;
            overspeculate.this.f12228polloi.impassible(polloiVar, arytenoidectomyVar);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void impromptu(long j) {
            overspeculate.this.f12228polloi.impromptu(j);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void kowloon(Exception exc) {
            overspeculate.this.f12228polloi.kowloon(exc);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void marial(String str) {
            overspeculate.this.f12228polloi.marial(str);
        }

        @Override // androidx.media3.exoplayer.saneness.InterfaceC0088saneness
        public void molybdenite() {
            overspeculate.this.twybill(false, -1, 3);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void monoploid(long j, int i) {
            overspeculate.this.f12228polloi.monoploid(j, i);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void onAudioDecoderInitialized(String str, long j, long j2) {
            overspeculate.this.f12228polloi.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // microanalysis.impromptu
        public void onCues(final List<libya.attabal> list) {
            overspeculate.this.f12197formularize.apical(27, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.premeiotic
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onCues((List<libya.attabal>) list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void onDroppedFrames(int i, long j) {
            overspeculate.this.f12228polloi.onDroppedFrames(i, j);
        }

        @Override // tout.saneness
        public void onMetadata(final Metadata metadata) {
            overspeculate overspeculateVar = overspeculate.this;
            overspeculateVar.f12223palmyra = overspeculateVar.f12223palmyra.attabal().seminary(metadata).restrictive();
            androidx.media3.common.gintrap gintrapVarUnconsolidated = overspeculate.this.unconsolidated();
            if (!gintrapVarUnconsolidated.equals(overspeculate.this.f12251walach)) {
                overspeculate.this.f12251walach = gintrapVarUnconsolidated;
                overspeculate.this.f12197formularize.impromptu(14, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.permissivist
                    @Override // decarock.impassible.attabal
                    public final void invoke(Object obj) {
                        ((androidx.media3.common.cord.wireman) obj).onMediaMetadataChanged(overspeculate.this.f12251walach);
                    }
                });
            }
            overspeculate.this.f12197formularize.impromptu(28, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.cultivated
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onMetadata(metadata);
                }
            });
            overspeculate.this.f12197formularize.beachfront();
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void onSkipSilenceEnabledChanged(final boolean z) {
            if (overspeculate.this.f12196empress == z) {
                return;
            }
            overspeculate.this.f12196empress = z;
            overspeculate.this.f12197formularize.apical(23, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.coffeecake
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            overspeculate.this.decarock(surfaceTexture);
            overspeculate.this.microchemistry(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            overspeculate.this.tailoring(null);
            overspeculate.this.microchemistry(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            overspeculate.this.microchemistry(i, i2);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void onVideoDecoderInitialized(String str, long j, long j2) {
            overspeculate.this.f12228polloi.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void onVideoSizeChanged(final androidx.media3.common.polder polderVar) {
            overspeculate.this.f12226picketboat = polderVar;
            overspeculate.this.f12197formularize.apical(25, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.treadless
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onVideoSizeChanged(polderVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.immediately.saneness
        public void polloi(int i) {
            final androidx.media3.common.formularize formularizeVarHardpan = overspeculate.hardpan(overspeculate.this.f12249trm);
            if (formularizeVarHardpan.equals(overspeculate.this.f12201gusty)) {
                return;
            }
            overspeculate.this.f12201gusty = formularizeVarHardpan;
            overspeculate.this.f12197formularize.apical(29, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.timberyard
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onDeviceInfoChanged(formularizeVarHardpan);
                }
            });
        }

        @Override // androidx.media3.exoplayer.impassible.saneness
        public void preprohormone(float f) {
            overspeculate.this.sultanate();
        }

        @Override // androidx.media3.exoplayer.adultoid.attabal
        public void rotuma(boolean z) {
            overspeculate.this.puffin();
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void saneness(AudioSink.attabal attabalVar) {
            overspeculate.this.f12228polloi.saneness(attabalVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            overspeculate.this.microchemistry(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (overspeculate.this.f12229premeiotic) {
                overspeculate.this.tailoring(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (overspeculate.this.f12229premeiotic) {
                overspeculate.this.tailoring(null);
            }
            overspeculate.this.microchemistry(0, 0);
        }

        @Override // androidx.media3.exoplayer.audio.dern
        public void taiyuan(androidx.media3.common.polloi polloiVar, arytenoidectomy arytenoidectomyVar) {
            overspeculate.this.f12241splinterproof = polloiVar;
            overspeculate.this.f12228polloi.taiyuan(polloiVar, arytenoidectomyVar);
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void triweekly(kowloon kowloonVar) {
            overspeculate.this.f12228polloi.triweekly(kowloonVar);
            overspeculate.this.f12214mathsort = null;
            overspeculate.this.f12184coffeecake = null;
        }

        @Override // androidx.media3.exoplayer.video.marial
        public void wireman(String str) {
            overspeculate.this.f12228polloi.wireman(str);
        }

        @Override // microanalysis.impromptu
        public void onCues(final libya.saneness sanenessVar) {
            overspeculate.this.f12185coi = sanenessVar;
            overspeculate.this.f12197formularize.apical(27, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.dent
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onCues(sanenessVar);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    static {
        androidx.media3.common.dovishness.attabal("media3.exoplayer");
    }

    public overspeculate(adultoid.saneness sanenessVar, androidx.media3.common.cord cordVar) {
        decarock.competently competentlyVar = new decarock.competently();
        this.f12252wireman = competentlyVar;
        try {
            decarock.triweekly.beachfront("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + decarock.grimness.f25089marial + X3.j.e);
            Context applicationContext = sanenessVar.f11499attabal.getApplicationContext();
            this.f12213marial = applicationContext;
            incorrectly.attabal attabalVarApply = sanenessVar.f11526taiyuan.apply(sanenessVar.f11522saneness);
            this.f12228polloi = attabalVarApply;
            this.f12250underbelly = sanenessVar.f11497apical;
            this.f12231preterite = sanenessVar.f11507formularize;
            this.f12212lotta = sanenessVar.f11510impassible;
            this.f12216milliradian = sanenessVar.f11515molybdenite;
            this.f12247treadless = sanenessVar.f11509graveside;
            this.f12196empress = sanenessVar.f11516monoploid;
            this.f12238sealless = sanenessVar.f11524stratoscope;
            wireman wiremanVar = new wireman();
            this.f12230preprohormone = wiremanVar;
            marial marialVar = new marial();
            this.f12187cord = marialVar;
            Handler handler = new Handler(sanenessVar.f11504cutely);
            homozygous[] homozygousVarArrAttabal = sanenessVar.f11529wireman.get().attabal(handler, wiremanVar, wiremanVar, wiremanVar, wiremanVar);
            this.f12186competently = homozygousVarArrAttabal;
            decarock.attabal.competently(homozygousVarArrAttabal.length > 0);
            hydromechanics.trm trmVar = sanenessVar.f11500beachfront.get();
            this.f12205impromptu = trmVar;
            this.f12218monoploid = sanenessVar.f11514marial.get();
            polyfoil.wireman wiremanVar2 = sanenessVar.f11511impromptu.get();
            this.f12199graveside = wiremanVar2;
            this.f12181arytenoidectomy = sanenessVar.f11496adultoid;
            this.f12236saran = sanenessVar.f11506dovishness;
            this.f12179adultoid = sanenessVar.f11508gintrap;
            this.f12195dovishness = sanenessVar.f11521rotuma;
            this.f12198gintrap = sanenessVar.f11519preprohormone;
            this.f12242starveling = sanenessVar.f11528trm;
            Looper looper = sanenessVar.f11504cutely;
            this.f12217molybdenite = looper;
            decarock.wireman wiremanVar3 = sanenessVar.f11522saneness;
            this.f12234rotuma = wiremanVar3;
            androidx.media3.common.cord cordVar2 = cordVar == null ? this : cordVar;
            this.f12182beachfront = cordVar2;
            boolean z = sanenessVar.f11512kattegat;
            this.f12244supplicat = z;
            this.f12197formularize = new decarock.impassible<>(looper, wiremanVar3, new decarock.impassible.saneness() { // from class: androidx.media3.exoplayer.merc
                @Override // decarock.impassible.saneness
                public final void attabal(Object obj, androidx.media3.common.kowloon kowloonVar) {
                    ((androidx.media3.common.cord.wireman) obj).onEvents(this.f12110attabal.f12182beachfront, new androidx.media3.common.cord.dern(kowloonVar));
                }
            });
            this.f12204impassible = new CopyOnWriteArraySet<>();
            this.f12209kowloon = new ArrayList();
            this.f12232privatdozent = new ethene.oilcan.attabal(0);
            this.f12188creditor = adultoid.dern.f11494saneness;
            hydromechanics.oilcan oilcanVar = new hydromechanics.oilcan(new libyan[homozygousVarArrAttabal.length], new hydromechanics.rotuma[homozygousVarArrAttabal.length], androidx.media3.common.supplicat.f11293saneness, null);
            this.f12235saneness = oilcanVar;
            this.f12248triweekly = new androidx.media3.common.oilcan.saneness();
            androidx.media3.common.cord.saneness sanenessVarMarial = new androidx.media3.common.cord.saneness.attabal().dern(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).wireman(29, trmVar.competently()).wireman(23, sanenessVar.f11518polloi).wireman(25, sanenessVar.f11518polloi).wireman(33, sanenessVar.f11518polloi).wireman(26, sanenessVar.f11518polloi).wireman(34, sanenessVar.f11518polloi).marial();
            this.f12194dern = sanenessVarMarial;
            this.f12202hydrovane = new androidx.media3.common.cord.saneness.attabal().saneness(sanenessVarMarial).attabal(4).attabal(10).marial();
            this.f12245taiyuan = wiremanVar3.createHandler(looper, null);
            sayid.beachfront beachfrontVar = new sayid.beachfront() { // from class: androidx.media3.exoplayer.polder
                @Override // androidx.media3.exoplayer.sayid.beachfront
                public final void attabal(sayid.marial marialVar2) {
                    overspeculate overspeculateVar = this.f12267attabal;
                    overspeculateVar.f12245taiyuan.post(new Runnable() { // from class: androidx.media3.exoplayer.seminary
                        @Override // java.lang.Runnable
                        public final void run() {
                            overspeculateVar.immediately(marialVar2);
                        }
                    });
                }
            };
            this.f12191cutely = beachfrontVar;
            this.f12211lightstruck = setterwort.apical(oilcanVar);
            attabalVarApply.sealless(cordVar2, looper);
            int i = decarock.grimness.f25080attabal;
            sayid sayidVar = new sayid(homozygousVarArrAttabal, trmVar, oilcanVar, sanenessVar.f11501competently.get(), wiremanVar2, this.f12233restrictive, this.f12215merc, attabalVarApply, this.f12236saran, sanenessVar.f11502cord, sanenessVar.f11503cuirassed, this.f12242starveling, sanenessVar.f11520restrictive, looper, wiremanVar3, beachfrontVar, i < 31 ? new ctenidium(sanenessVar.f11525supplicat) : dern.attabal(applicationContext, this, sanenessVar.f11517oilcan, sanenessVar.f11525supplicat), sanenessVar.f11530yemenite, this.f12188creditor);
            this.f12180apical = sayidVar;
            this.f12237sayid = 1.0f;
            this.f12233restrictive = 0;
            androidx.media3.common.gintrap gintrapVar = androidx.media3.common.gintrap.f10885supplicat;
            this.f12251walach = gintrapVar;
            this.f12224peridotite = gintrapVar;
            this.f12223palmyra = gintrapVar;
            this.f12219monroe = -1;
            if (i < 21) {
                this.f12220nosophobia = tectonization(0);
            } else {
                this.f12220nosophobia = decarock.grimness.restrictive(applicationContext);
            }
            this.f12185coi = libya.saneness.f32942dern;
            this.f12192czestochowa = true;
            cutely(attabalVarApply);
            wiremanVar2.marial(new Handler(looper), attabalVarApply);
            julian(wiremanVar);
            long j = sanenessVar.f11505dern;
            if (j > 0) {
                sayidVar.rotuma(j);
            }
            androidx.media3.exoplayer.saneness sanenessVar2 = new androidx.media3.exoplayer.saneness(sanenessVar.f11499attabal, handler, wiremanVar);
            this.f12189cuirassed = sanenessVar2;
            sanenessVar2.saneness(sanenessVar.f11498arytenoidectomy);
            impassible impassibleVar = new impassible(sanenessVar.f11499attabal, handler, wiremanVar);
            this.f12243stratoscope = impassibleVar;
            impassibleVar.impassible(sanenessVar.f11527triweekly ? this.f12212lotta : null);
            if (z && i >= 23) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.f12208kattegat = audioManager;
                saneness.saneness(audioManager, new competently(), new Handler(looper));
            }
            if (sanenessVar.f11518polloi) {
                immediately immediatelyVar = new immediately(sanenessVar.f11499attabal, handler, wiremanVar);
                this.f12249trm = immediatelyVar;
                immediatelyVar.impromptu(decarock.grimness.lerp(this.f12212lotta.f11278dern));
            } else {
                this.f12249trm = null;
            }
            tectonization tectonizationVar = new tectonization(sanenessVar.f11499attabal);
            this.f12221oilcan = tectonizationVar;
            tectonizationVar.attabal(sanenessVar.f11513kowloon != 0);
            prefect prefectVar = new prefect(sanenessVar.f11499attabal);
            this.f12254yemenite = prefectVar;
            prefectVar.attabal(sanenessVar.f11513kowloon == 2);
            this.f12201gusty = hardpan(this.f12249trm);
            this.f12226picketboat = androidx.media3.common.polder.f11144marial;
            this.f12206itchy = decarock.trm.f25148dern;
            trmVar.apical(this.f12212lotta);
            cig(1, 10, Integer.valueOf(this.f12220nosophobia));
            cig(2, 10, Integer.valueOf(this.f12220nosophobia));
            cig(1, 3, this.f12212lotta);
            cig(2, 4, Integer.valueOf(this.f12216milliradian));
            cig(2, 5, Integer.valueOf(this.f12247treadless));
            cig(1, 9, Boolean.valueOf(this.f12196empress));
            cig(2, 7, marialVar);
            cig(6, 8, marialVar);
            demilitarize(16, Integer.valueOf(this.f12250underbelly));
            competentlyVar.marial();
        } catch (Throwable th) {
            this.f12252wireman.marial();
            throw th;
        }
    }

    public static androidx.media3.common.formularize hardpan(immediately immediatelyVar) {
        return new androidx.media3.common.formularize.saneness(0).competently(immediatelyVar != null ? immediatelyVar.wireman() : 0).beachfront(immediatelyVar != null ? immediatelyVar.dern() : 0).marial();
    }

    public static int lampshade(int i) {
        return i == -1 ? 2 : 1;
    }

    public static /* synthetic */ void restrictive(setterwort setterwortVar, androidx.media3.common.cord.wireman wiremanVar) {
        wiremanVar.onLoadingChanged(setterwortVar.f12407competently);
        wiremanVar.onIsLoadingChanged(setterwortVar.f12407competently);
    }

    public static long sakeen(setterwort setterwortVar) {
        androidx.media3.common.oilcan.dern dernVar = new androidx.media3.common.oilcan.dern();
        androidx.media3.common.oilcan.saneness sanenessVar = new androidx.media3.common.oilcan.saneness();
        setterwortVar.f12405attabal.impromptu(setterwortVar.f12419saneness.f12518attabal, sanenessVar);
        return setterwortVar.f12409dern == C.TIME_UNSET ? setterwortVar.f12405attabal.triweekly(sanenessVar.f11137dern, dernVar).dern() : sanenessVar.triweekly() + setterwortVar.f12409dern;
    }

    public static /* synthetic */ void stratoscope(int i, androidx.media3.common.cord.marial marialVar, androidx.media3.common.cord.marial marialVar2, androidx.media3.common.cord.wireman wiremanVar) {
        wiremanVar.onPositionDiscontinuity(i);
        wiremanVar.onPositionDiscontinuity(marialVar, marialVar2, i);
    }

    public final List<vesuvio.dern> achondroplasia(int i, List<androidx.media3.exoplayer.source.formularize> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            vesuvio.dern dernVar = new vesuvio.dern(list.get(i2), this.f12181arytenoidectomy);
            arrayList.add(dernVar);
            this.f12209kowloon.add(i2 + i, new beachfront(dernVar.f12820saneness, dernVar.f12817attabal));
        }
        this.f12232privatdozent = this.f12232privatdozent.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    @Override // androidx.media3.common.cord
    public int apical() {
        ctenidium();
        return this.f12211lightstruck.f12421triweekly;
    }

    @Override // androidx.media3.common.cord
    public int arytenoidectomy() {
        ctenidium();
        int iAttendance = attendance(this.f12211lightstruck);
        if (iAttendance == -1) {
            return 0;
        }
        return iAttendance;
    }

    @Override // androidx.media3.common.cord
    public void attabal() {
        ctenidium();
        boolean playWhenReady = getPlayWhenReady();
        int iArytenoidectomy = this.f12243stratoscope.arytenoidectomy(playWhenReady, 2);
        twybill(playWhenReady, iArytenoidectomy, lampshade(iArytenoidectomy));
        setterwort setterwortVar = this.f12211lightstruck;
        if (setterwortVar.f12415marial != 1) {
            return;
        }
        setterwort setterwortVarBeachfront = setterwortVar.beachfront(null);
        setterwort setterwortVarImpromptu = setterwortVarBeachfront.impromptu(setterwortVarBeachfront.f12405attabal.monoploid() ? 4 : 2);
        this.f12227polder++;
        this.f12180apical.empress();
        miliaria(setterwortVarImpromptu, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    public final int attendance(setterwort setterwortVar) {
        return setterwortVar.f12405attabal.monoploid() ? this.f12219monroe : setterwortVar.f12405attabal.impromptu(setterwortVar.f12419saneness.f12518attabal, this.f12248triweekly).f11137dern;
    }

    public final boolean basify() {
        AudioManager audioManager = this.f12208kattegat;
        if (audioManager == null || decarock.grimness.f25080attabal < 23) {
            return true;
        }
        return saneness.attabal(this.f12213marial, audioManager.getDevices(2));
    }

    @Override // androidx.media3.common.cord
    public androidx.media3.common.supplicat beachfront() {
        ctenidium();
        return this.f12211lightstruck.f12420taiyuan.f28181wireman;
    }

    public final void cig(int i, int i2, Object obj) {
        for (homozygous homozygousVar : this.f12186competently) {
            if (i == -1 || homozygousVar.getTrackType() == i) {
                technofreak(homozygousVar).triweekly(i2).impassible(obj).formularize();
            }
        }
    }

    public final int claque(boolean z, int i) {
        if (i == 0) {
            return 1;
        }
        if (!this.f12244supplicat) {
            return 0;
        }
        if (!z || basify()) {
            return (z || this.f12211lightstruck.f12421triweekly != 3) ? 0 : 3;
        }
        return 3;
    }

    @Override // androidx.media3.common.cord
    public void clearVideoSurface() {
        ctenidium();
        tarboosh();
        tailoring(null);
        microchemistry(0, 0);
    }

    public final setterwort cosy(setterwort setterwortVar, int i, int i2) {
        int iAttendance = attendance(setterwortVar);
        long j = setterwort(setterwortVar);
        androidx.media3.common.oilcan oilcanVar = setterwortVar.f12405attabal;
        int size = this.f12209kowloon.size();
        this.f12227polder++;
        pruinose(i, i2);
        androidx.media3.common.oilcan oilcanVarHerdbook = herdbook();
        setterwort setterwortVarOsteal = osteal(setterwortVar, oilcanVarHerdbook, homozygous(oilcanVar, oilcanVarHerdbook, iAttendance, j));
        int i3 = setterwortVarOsteal.f12415marial;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && iAttendance >= setterwortVarOsteal.f12405attabal.arytenoidectomy()) {
            setterwortVarOsteal = setterwortVarOsteal.impromptu(4);
        }
        this.f12180apical.wostteth(i, i2, this.f12232privatdozent);
        return setterwortVarOsteal;
    }

    public final void ctenidium() {
        this.f12252wireman.saneness();
        if (Thread.currentThread() != dhss().getThread()) {
            String strSealless = decarock.grimness.sealless("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), dhss().getThread().getName());
            if (this.f12192czestochowa) {
                throw new IllegalStateException(strSealless);
            }
            decarock.triweekly.taiyuan("ExoPlayerImpl", strSealless, this.f12240sensatory ? null : new IllegalStateException());
            this.f12240sensatory = true;
        }
    }

    @Override // androidx.media3.common.cord
    public void cutely(androidx.media3.common.cord.wireman wiremanVar) {
        this.f12197formularize.dern((androidx.media3.common.cord.wireman) decarock.attabal.marial(wiremanVar));
    }

    public final androidx.media3.common.cord.marial deadwork(long j) {
        Object obj;
        int iSaneness;
        androidx.media3.common.adultoid adultoidVar;
        Object obj2;
        int iArytenoidectomy = arytenoidectomy();
        if (this.f12211lightstruck.f12405attabal.monoploid()) {
            obj = null;
            iSaneness = -1;
            adultoidVar = null;
            obj2 = null;
        } else {
            setterwort setterwortVar = this.f12211lightstruck;
            Object obj3 = setterwortVar.f12419saneness.f12518attabal;
            setterwortVar.f12405attabal.impromptu(obj3, this.f12248triweekly);
            iSaneness = this.f12211lightstruck.f12405attabal.saneness(obj3);
            obj2 = obj3;
            obj = this.f12211lightstruck.f12405attabal.triweekly(iArytenoidectomy, this.f10811attabal).f11115attabal;
            adultoidVar = this.f10811attabal.f11119dern;
        }
        int i = iSaneness;
        long jSultanate = decarock.grimness.sultanate(j);
        long jSultanate2 = this.f12211lightstruck.f12419saneness.saneness() ? decarock.grimness.sultanate(sakeen(this.f12211lightstruck)) : jSultanate;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = this.f12211lightstruck.f12419saneness;
        return new androidx.media3.common.cord.marial(obj, iArytenoidectomy, adultoidVar, obj2, i, jSultanate, jSultanate2, sanenessVar.f12521saneness, sanenessVar.f12519dern);
    }

    public final void decarock(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        tailoring(surface);
        this.f12193dent = surface;
    }

    public final void demilitarize(int i, Object obj) {
        cig(-1, i, obj);
    }

    public Looper dhss() {
        return this.f12217molybdenite;
    }

    @Override // androidx.media3.common.beachfront
    public void dovishness(int i, long j, int i2, boolean z) {
        ctenidium();
        if (i == -1) {
            return;
        }
        decarock.attabal.attabal(i >= 0);
        androidx.media3.common.oilcan oilcanVar = this.f12211lightstruck.f12405attabal;
        if (oilcanVar.monoploid() || i < oilcanVar.arytenoidectomy()) {
            this.f12228polloi.graveside();
            this.f12227polder++;
            if (isPlayingAd()) {
                decarock.triweekly.impromptu("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                sayid.marial marialVar = new sayid.marial(this.f12211lightstruck);
                marialVar.saneness(1);
                this.f12191cutely.attabal(marialVar);
                return;
            }
            setterwort setterwortVarImpromptu = this.f12211lightstruck;
            int i3 = setterwortVarImpromptu.f12415marial;
            if (i3 == 3 || (i3 == 4 && !oilcanVar.monoploid())) {
                setterwortVarImpromptu = this.f12211lightstruck.impromptu(2);
            }
            int iArytenoidectomy = arytenoidectomy();
            setterwort setterwortVarOsteal = osteal(setterwortVarImpromptu, oilcanVar, licking(oilcanVar, i, j));
            this.f12180apical.outmarry(oilcanVar, i, decarock.grimness.outmarry(j));
            miliaria(setterwortVarOsteal, 0, true, 1, mastfed(setterwortVarOsteal), iArytenoidectomy, z);
        }
    }

    public final long fastrack(androidx.media3.common.oilcan oilcanVar, androidx.media3.exoplayer.source.formularize.saneness sanenessVar, long j) {
        oilcanVar.impromptu(sanenessVar.f12518attabal, this.f12248triweekly);
        return j + this.f12248triweekly.triweekly();
    }

    @Override // androidx.media3.common.cord
    public androidx.media3.common.polder formularize() {
        ctenidium();
        return this.f12226picketboat;
    }

    @Override // androidx.media3.common.cord
    public long getBufferedPosition() {
        ctenidium();
        if (!isPlayingAd()) {
            return vesuvio();
        }
        setterwort setterwortVar = this.f12211lightstruck;
        return setterwortVar.f12403apical.equals(setterwortVar.f12419saneness) ? decarock.grimness.sultanate(this.f12211lightstruck.f12417monoploid) : getDuration();
    }

    @Override // androidx.media3.common.cord
    public long getContentPosition() {
        ctenidium();
        return setterwort(this.f12211lightstruck);
    }

    @Override // androidx.media3.common.cord
    public int getCurrentAdGroupIndex() {
        ctenidium();
        if (isPlayingAd()) {
            return this.f12211lightstruck.f12419saneness.f12521saneness;
        }
        return -1;
    }

    @Override // androidx.media3.common.cord
    public int getCurrentAdIndexInAdGroup() {
        ctenidium();
        if (isPlayingAd()) {
            return this.f12211lightstruck.f12419saneness.f12519dern;
        }
        return -1;
    }

    @Override // androidx.media3.common.cord
    public int getCurrentPeriodIndex() {
        ctenidium();
        if (this.f12211lightstruck.f12405attabal.monoploid()) {
            return this.f12207julian;
        }
        setterwort setterwortVar = this.f12211lightstruck;
        return setterwortVar.f12405attabal.saneness(setterwortVar.f12419saneness.f12518attabal);
    }

    @Override // androidx.media3.common.cord
    public long getCurrentPosition() {
        ctenidium();
        return decarock.grimness.sultanate(mastfed(this.f12211lightstruck));
    }

    @Override // androidx.media3.common.cord
    public androidx.media3.common.oilcan getCurrentTimeline() {
        ctenidium();
        return this.f12211lightstruck.f12405attabal;
    }

    @Override // androidx.media3.common.cord
    public long getDuration() {
        ctenidium();
        if (!isPlayingAd()) {
            return polloi();
        }
        setterwort setterwortVar = this.f12211lightstruck;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = setterwortVar.f12419saneness;
        setterwortVar.f12405attabal.impromptu(sanenessVar.f12518attabal, this.f12248triweekly);
        return decarock.grimness.sultanate(this.f12248triweekly.saneness(sanenessVar.f12521saneness, sanenessVar.f12519dern));
    }

    @Override // androidx.media3.common.cord
    public boolean getPlayWhenReady() {
        ctenidium();
        return this.f12211lightstruck.f12410formularize;
    }

    @Override // androidx.media3.common.cord
    public int getPlaybackState() {
        ctenidium();
        return this.f12211lightstruck.f12415marial;
    }

    @Override // androidx.media3.common.cord
    public int getRepeatMode() {
        ctenidium();
        return this.f12233restrictive;
    }

    @Override // androidx.media3.common.cord
    public boolean getShuffleModeEnabled() {
        ctenidium();
        return this.f12215merc;
    }

    public final androidx.media3.common.oilcan herdbook() {
        return new attendance(this.f12209kowloon, this.f12232privatdozent);
    }

    public final Pair<Object, Long> homozygous(androidx.media3.common.oilcan oilcanVar, androidx.media3.common.oilcan oilcanVar2, int i, long j) {
        boolean zMonoploid = oilcanVar.monoploid();
        long j2 = C.TIME_UNSET;
        if (zMonoploid || oilcanVar2.monoploid()) {
            boolean z = !oilcanVar.monoploid() && oilcanVar2.monoploid();
            int i2 = z ? -1 : i;
            if (!z) {
                j2 = j;
            }
            return licking(oilcanVar2, i2, j2);
        }
        Pair<Object, Long> pairCutely = oilcanVar.cutely(this.f10811attabal, this.f12248triweekly, i, decarock.grimness.outmarry(j));
        Object obj = ((Pair) decarock.grimness.impromptu(pairCutely)).first;
        if (oilcanVar2.saneness(obj) != -1) {
            return pairCutely;
        }
        int iHerdbook = sayid.herdbook(this.f10811attabal, this.f12248triweekly, this.f12233restrictive, this.f12215merc, obj, oilcanVar, oilcanVar2);
        return iHerdbook != -1 ? licking(oilcanVar2, iHerdbook, oilcanVar2.triweekly(iHerdbook, this.f10811attabal).saneness()) : licking(oilcanVar2, -1, C.TIME_UNSET);
    }

    public final void hyalinization(boolean z) {
        PriorityTaskManager priorityTaskManager = this.f12231preterite;
        if (priorityTaskManager != null) {
            if (z && !this.f12253wostteth) {
                priorityTaskManager.attabal(this.f12250underbelly);
                this.f12253wostteth = true;
            } else {
                if (z || !this.f12253wostteth) {
                    return;
                }
                priorityTaskManager.dern(this.f12250underbelly);
                this.f12253wostteth = false;
            }
        }
    }

    public final void immediately(sayid.marial marialVar) {
        boolean z;
        long jFastrack;
        int i = this.f12227polder - marialVar.f12380dern;
        this.f12227polder = i;
        boolean z2 = true;
        if (marialVar.f12383wireman) {
            this.f12239seminary = marialVar.f12381marial;
            this.f12200grimness = true;
        }
        if (i == 0) {
            androidx.media3.common.oilcan oilcanVar = marialVar.f12382saneness.f12405attabal;
            if (!this.f12211lightstruck.f12405attabal.monoploid() && oilcanVar.monoploid()) {
                this.f12219monroe = -1;
                this.f12178achondroplasia = 0L;
                this.f12207julian = 0;
            }
            if (!oilcanVar.monoploid()) {
                List<androidx.media3.common.oilcan> listSealless = ((attendance) oilcanVar).sealless();
                decarock.attabal.competently(listSealless.size() == this.f12209kowloon.size());
                for (int i2 = 0; i2 < listSealless.size(); i2++) {
                    this.f12209kowloon.get(i2).dern(listSealless.get(i2));
                }
            }
            boolean z3 = this.f12200grimness;
            long j = C.TIME_UNSET;
            if (z3) {
                if (marialVar.f12382saneness.f12419saneness.equals(this.f12211lightstruck.f12419saneness) && marialVar.f12382saneness.f12422wireman == this.f12211lightstruck.f12416molybdenite) {
                    z2 = false;
                }
                if (z2) {
                    if (oilcanVar.monoploid() || marialVar.f12382saneness.f12419saneness.saneness()) {
                        jFastrack = marialVar.f12382saneness.f12422wireman;
                    } else {
                        setterwort setterwortVar = marialVar.f12382saneness;
                        jFastrack = fastrack(oilcanVar, setterwortVar.f12419saneness, setterwortVar.f12422wireman);
                    }
                    j = jFastrack;
                }
                z = z2;
            } else {
                z = false;
            }
            this.f12200grimness = false;
            miliaria(marialVar.f12382saneness, 1, z, this.f12239seminary, j, -1, false);
        }
    }

    @Override // androidx.media3.common.cord
    public void impromptu(androidx.media3.common.cord.wireman wiremanVar) {
        ctenidium();
        this.f12197formularize.cutely((androidx.media3.common.cord.wireman) decarock.attabal.marial(wiremanVar));
    }

    public final void incorrectly(boolean z, int i, int i2) {
        this.f12227polder++;
        setterwort setterwortVarAttabal = this.f12211lightstruck;
        if (setterwortVarAttabal.f12404arytenoidectomy) {
            setterwortVarAttabal = setterwortVarAttabal.attabal();
        }
        setterwort setterwortVarMarial = setterwortVarAttabal.marial(z, i, i2);
        this.f12180apical.osteal(z, i, i2);
        miliaria(setterwortVarMarial, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.cord
    public boolean isPlayingAd() {
        ctenidium();
        return this.f12211lightstruck.f12419saneness.saneness();
    }

    public void julian(adultoid.attabal attabalVar) {
        this.f12204impassible.add(attabalVar);
    }

    @Override // androidx.media3.exoplayer.adultoid
    public void kowloon(androidx.media3.exoplayer.source.formularize formularizeVar) {
        ctenidium();
        linendraper(Collections.singletonList(formularizeVar));
    }

    public final void liable(ExoPlaybackException exoPlaybackException) {
        setterwort setterwortVar = this.f12211lightstruck;
        setterwort setterwortVarDern = setterwortVar.dern(setterwortVar.f12419saneness);
        setterwortVarDern.f12417monoploid = setterwortVarDern.f12416molybdenite;
        setterwortVarDern.f12418polloi = 0L;
        setterwort setterwortVarImpromptu = setterwortVarDern.impromptu(1);
        if (exoPlaybackException != null) {
            setterwortVarImpromptu = setterwortVarImpromptu.beachfront(exoPlaybackException);
        }
        this.f12227polder++;
        this.f12180apical.liable();
        miliaria(setterwortVarImpromptu, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    public final void libya(List<androidx.media3.exoplayer.source.formularize> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        setterwort setterwortVarImpromptu;
        boolean z2;
        int iAttabal = i;
        int iAttendance = attendance(this.f12211lightstruck);
        long currentPosition = getCurrentPosition();
        this.f12227polder++;
        if (!this.f12209kowloon.isEmpty()) {
            pruinose(0, this.f12209kowloon.size());
        }
        List<vesuvio.dern> listAchondroplasia = achondroplasia(0, list);
        androidx.media3.common.oilcan oilcanVarHerdbook = herdbook();
        if (!oilcanVarHerdbook.monoploid() && iAttabal >= oilcanVarHerdbook.arytenoidectomy()) {
            throw new IllegalSeekPositionException(oilcanVarHerdbook, iAttabal, j);
        }
        if (!z) {
            if (iAttabal == -1) {
                i2 = iAttendance;
                j2 = currentPosition;
            } else {
                j2 = j;
            }
            setterwort setterwortVarOsteal = osteal(this.f12211lightstruck, oilcanVarHerdbook, licking(oilcanVarHerdbook, i2, j2));
            i3 = setterwortVarOsteal.f12415marial;
            if (i2 != -1 && i3 != 1) {
                if (!oilcanVarHerdbook.monoploid() || i2 >= oilcanVarHerdbook.arytenoidectomy()) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            setterwortVarImpromptu = setterwortVarOsteal.impromptu(i3);
            this.f12180apical.basify(listAchondroplasia, i2, decarock.grimness.outmarry(j2), this.f12232privatdozent);
            if (!this.f12211lightstruck.f12419saneness.f12518attabal.equals(setterwortVarImpromptu.f12419saneness.f12518attabal) || this.f12211lightstruck.f12405attabal.monoploid()) {
                z2 = false;
            } else {
                z2 = true;
            }
            miliaria(setterwortVarImpromptu, 0, z2, 4, mastfed(setterwortVarImpromptu), -1, false);
        }
        iAttabal = oilcanVarHerdbook.attabal(this.f12215merc);
        j2 = C.TIME_UNSET;
        i2 = iAttabal;
        setterwort setterwortVarOsteal2 = osteal(this.f12211lightstruck, oilcanVarHerdbook, licking(oilcanVarHerdbook, i2, j2));
        i3 = setterwortVarOsteal2.f12415marial;
        if (i2 != -1) {
            if (oilcanVarHerdbook.monoploid()) {
                i3 = 4;
            } else {
                i3 = 4;
            }
        }
        setterwortVarImpromptu = setterwortVarOsteal2.impromptu(i3);
        this.f12180apical.basify(listAchondroplasia, i2, decarock.grimness.outmarry(j2), this.f12232privatdozent);
        if (this.f12211lightstruck.f12419saneness.f12518attabal.equals(setterwortVarImpromptu.f12419saneness.f12518attabal)) {
            z2 = false;
        } else {
            z2 = false;
        }
        miliaria(setterwortVarImpromptu, 0, z2, 4, mastfed(setterwortVarImpromptu), -1, false);
    }

    @Override // androidx.media3.common.cord
    /* JADX INFO: renamed from: libyan, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException marial() {
        ctenidium();
        return this.f12211lightstruck.f12406beachfront;
    }

    public final Pair<Object, Long> licking(androidx.media3.common.oilcan oilcanVar, int i, long j) {
        if (oilcanVar.monoploid()) {
            this.f12219monroe = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.f12178achondroplasia = j;
            this.f12207julian = 0;
            return null;
        }
        if (i == -1 || i >= oilcanVar.arytenoidectomy()) {
            i = oilcanVar.attabal(this.f12215merc);
            j = oilcanVar.triweekly(i, this.f10811attabal).saneness();
        }
        return oilcanVar.cutely(this.f10811attabal, this.f12248triweekly, i, decarock.grimness.outmarry(j));
    }

    public void linendraper(List<androidx.media3.exoplayer.source.formularize> list) {
        ctenidium();
        stupefactive(list, true);
    }

    public final long mastfed(setterwort setterwortVar) {
        if (setterwortVar.f12405attabal.monoploid()) {
            return decarock.grimness.outmarry(this.f12178achondroplasia);
        }
        long jImpassible = setterwortVar.f12404arytenoidectomy ? setterwortVar.impassible() : setterwortVar.f12416molybdenite;
        return setterwortVar.f12419saneness.saneness() ? jImpassible : fastrack(setterwortVar.f12405attabal, setterwortVar.f12419saneness, jImpassible);
    }

    public final void microchemistry(final int i, final int i2) {
        if (i == this.f12206itchy.saneness() && i2 == this.f12206itchy.attabal()) {
            return;
        }
        this.f12206itchy = new decarock.trm(i, i2);
        this.f12197formularize.apical(24, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.supplicat
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((androidx.media3.common.cord.wireman) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        cig(2, 14, new decarock.trm(i, i2));
    }

    public final void miliaria(final setterwort setterwortVar, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        setterwort setterwortVar2 = this.f12211lightstruck;
        this.f12211lightstruck = setterwortVar;
        boolean zEquals = setterwortVar2.f12405attabal.equals(setterwortVar.f12405attabal);
        Pair<Boolean, Integer> pairOutmarry = outmarry(setterwortVar, setterwortVar2, z, i2, !zEquals, z2);
        boolean zBooleanValue = ((Boolean) pairOutmarry.first).booleanValue();
        final int iIntValue = ((Integer) pairOutmarry.second).intValue();
        final androidx.media3.common.adultoid adultoidVar = null;
        if (zBooleanValue) {
            if (!setterwortVar.f12405attabal.monoploid()) {
                adultoidVar = setterwortVar.f12405attabal.triweekly(setterwortVar.f12405attabal.impromptu(setterwortVar.f12419saneness.f12518attabal, this.f12248triweekly).f11137dern, this.f10811attabal).f11119dern;
            }
            this.f12223palmyra = androidx.media3.common.gintrap.f10885supplicat;
        }
        if (zBooleanValue || !setterwortVar2.f12408cutely.equals(setterwortVar.f12408cutely)) {
            this.f12223palmyra = this.f12223palmyra.attabal().grimness(setterwortVar.f12408cutely).restrictive();
        }
        androidx.media3.common.gintrap gintrapVarUnconsolidated = unconsolidated();
        boolean zEquals2 = gintrapVarUnconsolidated.equals(this.f12251walach);
        this.f12251walach = gintrapVarUnconsolidated;
        boolean z3 = setterwortVar2.f12410formularize != setterwortVar.f12410formularize;
        boolean z4 = setterwortVar2.f12415marial != setterwortVar.f12415marial;
        if (z4 || z3) {
            puffin();
        }
        boolean z5 = setterwortVar2.f12407competently;
        boolean z6 = setterwortVar.f12407competently;
        boolean z7 = z5 != z6;
        if (z7) {
            hyalinization(z6);
        }
        if (!zEquals) {
            this.f12197formularize.impromptu(0, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.stratoscope
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    androidx.media3.common.cord.wireman wiremanVar = (androidx.media3.common.cord.wireman) obj;
                    wiremanVar.onTimelineChanged(setterwortVar.f12405attabal, i);
                }
            });
        }
        if (z) {
            final androidx.media3.common.cord.marial marialVarMolet = molet(i2, setterwortVar2, i3);
            final androidx.media3.common.cord.marial marialVarDeadwork = deadwork(j);
            this.f12197formularize.impromptu(11, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.hydrovane
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    overspeculate.stratoscope(i2, marialVarMolet, marialVarDeadwork, (androidx.media3.common.cord.wireman) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f12197formularize.impromptu(1, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.walach
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onMediaItemTransition(adultoidVar, iIntValue);
                }
            });
        }
        if (setterwortVar2.f12406beachfront != setterwortVar.f12406beachfront) {
            this.f12197formularize.impromptu(10, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.peridotite
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onPlayerErrorChanged(setterwortVar.f12406beachfront);
                }
            });
            if (setterwortVar.f12406beachfront != null) {
                this.f12197formularize.impromptu(10, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.mathsort
                    @Override // decarock.impassible.attabal
                    public final void invoke(Object obj) {
                        ((androidx.media3.common.cord.wireman) obj).onPlayerError(setterwortVar.f12406beachfront);
                    }
                });
            }
        }
        hydromechanics.oilcan oilcanVar = setterwortVar2.f12420taiyuan;
        hydromechanics.oilcan oilcanVar2 = setterwortVar.f12420taiyuan;
        if (oilcanVar != oilcanVar2) {
            this.f12205impromptu.impromptu(oilcanVar2.f28179marial);
            this.f12197formularize.impromptu(2, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.splinterproof
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onTracksChanged(setterwortVar.f12420taiyuan.f28181wireman);
                }
            });
        }
        if (!zEquals2) {
            final androidx.media3.common.gintrap gintrapVar = this.f12251walach;
            this.f12197formularize.impromptu(14, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.trm
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onMediaMetadataChanged(gintrapVar);
                }
            });
        }
        if (z7) {
            this.f12197formularize.impromptu(3, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.oilcan
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    overspeculate.restrictive(setterwortVar, (androidx.media3.common.cord.wireman) obj);
                }
            });
        }
        if (z4 || z3) {
            this.f12197formularize.impromptu(-1, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.yemenite
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    setterwort setterwortVar3 = setterwortVar;
                    ((androidx.media3.common.cord.wireman) obj).onPlayerStateChanged(setterwortVar3.f12410formularize, setterwortVar3.f12415marial);
                }
            });
        }
        if (z4) {
            this.f12197formularize.impromptu(4, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.sealless
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onPlaybackStateChanged(setterwortVar.f12415marial);
                }
            });
        }
        if (z3 || setterwortVar2.f12412impassible != setterwortVar.f12412impassible) {
            this.f12197formularize.impromptu(5, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.grimness
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    setterwort setterwortVar3 = setterwortVar;
                    ((androidx.media3.common.cord.wireman) obj).onPlayWhenReadyChanged(setterwortVar3.f12410formularize, setterwortVar3.f12412impassible);
                }
            });
        }
        if (setterwortVar2.f12421triweekly != setterwortVar.f12421triweekly) {
            this.f12197formularize.impromptu(6, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.privatdozent
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onPlaybackSuppressionReasonChanged(setterwortVar.f12421triweekly);
                }
            });
        }
        if (setterwortVar2.triweekly() != setterwortVar.triweekly()) {
            this.f12197formularize.impromptu(7, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.creditor
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onIsPlayingChanged(setterwortVar.triweekly());
                }
            });
        }
        if (!setterwortVar2.f12414kowloon.equals(setterwortVar.f12414kowloon)) {
            this.f12197formularize.impromptu(12, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.starveling
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onPlaybackParametersChanged(setterwortVar.f12414kowloon);
                }
            });
        }
        vir();
        this.f12197formularize.beachfront();
        if (setterwortVar2.f12404arytenoidectomy != setterwortVar.f12404arytenoidectomy) {
            Iterator<adultoid.attabal> it = this.f12204impassible.iterator();
            while (it.hasNext()) {
                it.next().rotuma(setterwortVar.f12404arytenoidectomy);
            }
        }
    }

    public final androidx.media3.common.cord.marial molet(int i, setterwort setterwortVar, int i2) {
        int i3;
        Object obj;
        androidx.media3.common.adultoid adultoidVar;
        Object obj2;
        int i4;
        long jSakeen;
        long jSakeen2;
        androidx.media3.common.oilcan.saneness sanenessVar = new androidx.media3.common.oilcan.saneness();
        if (setterwortVar.f12405attabal.monoploid()) {
            i3 = i2;
            obj = null;
            adultoidVar = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = setterwortVar.f12419saneness.f12518attabal;
            setterwortVar.f12405attabal.impromptu(obj3, sanenessVar);
            int i5 = sanenessVar.f11137dern;
            int iSaneness = setterwortVar.f12405attabal.saneness(obj3);
            Object obj4 = setterwortVar.f12405attabal.triweekly(i5, this.f10811attabal).f11115attabal;
            adultoidVar = this.f10811attabal.f11119dern;
            obj2 = obj3;
            i4 = iSaneness;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (setterwortVar.f12419saneness.saneness()) {
                androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = setterwortVar.f12419saneness;
                jSakeen = sanenessVar.saneness(sanenessVar2.f12521saneness, sanenessVar2.f12519dern);
                jSakeen2 = sakeen(setterwortVar);
            } else {
                jSakeen = setterwortVar.f12419saneness.f12520marial != -1 ? sakeen(this.f12211lightstruck) : sanenessVar.f11138marial + sanenessVar.f11140wireman;
                jSakeen2 = jSakeen;
            }
        } else if (setterwortVar.f12419saneness.saneness()) {
            jSakeen = setterwortVar.f12416molybdenite;
            jSakeen2 = sakeen(setterwortVar);
        } else {
            jSakeen = sanenessVar.f11138marial + setterwortVar.f12416molybdenite;
            jSakeen2 = jSakeen;
        }
        long jSultanate = decarock.grimness.sultanate(jSakeen);
        long jSultanate2 = decarock.grimness.sultanate(jSakeen2);
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = setterwortVar.f12419saneness;
        return new androidx.media3.common.cord.marial(obj, i3, adultoidVar, obj2, i4, jSultanate, jSultanate2, sanenessVar3.f12521saneness, sanenessVar3.f12519dern);
    }

    public void monroe(incorrectly.saneness sanenessVar) {
        this.f12228polloi.stratoscope((incorrectly.saneness) decarock.attabal.marial(sanenessVar));
    }

    public final setterwort osteal(setterwort setterwortVar, androidx.media3.common.oilcan oilcanVar, Pair<Object, Long> pair) {
        decarock.attabal.attabal(oilcanVar.monoploid() || pair != null);
        androidx.media3.common.oilcan oilcanVar2 = setterwortVar.f12405attabal;
        long j = setterwort(setterwortVar);
        setterwort setterwortVarCutely = setterwortVar.cutely(oilcanVar);
        if (oilcanVar.monoploid()) {
            androidx.media3.exoplayer.source.formularize.saneness sanenessVarFormularize = setterwort.formularize();
            long jOutmarry = decarock.grimness.outmarry(this.f12178achondroplasia);
            setterwort setterwortVarDern = setterwortVarCutely.wireman(sanenessVarFormularize, jOutmarry, jOutmarry, jOutmarry, 0L, ethene.restrictive.f26058wireman, this.f12235saneness, ImmutableList.of()).dern(sanenessVarFormularize);
            setterwortVarDern.f12417monoploid = setterwortVarDern.f12416molybdenite;
            return setterwortVarDern;
        }
        Object obj = setterwortVarCutely.f12419saneness.f12518attabal;
        boolean zEquals = obj.equals(((Pair) decarock.grimness.impromptu(pair)).first);
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar = !zEquals ? new androidx.media3.exoplayer.source.formularize.saneness(pair.first) : setterwortVarCutely.f12419saneness;
        long jLongValue = ((Long) pair.second).longValue();
        long jOutmarry2 = decarock.grimness.outmarry(j);
        if (!oilcanVar2.monoploid()) {
            jOutmarry2 -= oilcanVar2.impromptu(obj, this.f12248triweekly).triweekly();
        }
        if (!zEquals || jLongValue < jOutmarry2) {
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar2 = sanenessVar;
            decarock.attabal.competently(!sanenessVar2.saneness());
            setterwort setterwortVarDern2 = setterwortVarCutely.wireman(sanenessVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? ethene.restrictive.f26058wireman : setterwortVarCutely.f12413impromptu, !zEquals ? this.f12235saneness : setterwortVarCutely.f12420taiyuan, !zEquals ? ImmutableList.of() : setterwortVarCutely.f12408cutely).dern(sanenessVar2);
            setterwortVarDern2.f12417monoploid = jLongValue;
            return setterwortVarDern2;
        }
        if (jLongValue != jOutmarry2) {
            androidx.media3.exoplayer.source.formularize.saneness sanenessVar3 = sanenessVar;
            decarock.attabal.competently(!sanenessVar3.saneness());
            long jMax = Math.max(0L, setterwortVarCutely.f12418polloi - (jLongValue - jOutmarry2));
            long j2 = setterwortVarCutely.f12417monoploid;
            if (setterwortVarCutely.f12403apical.equals(setterwortVarCutely.f12419saneness)) {
                j2 = jLongValue + jMax;
            }
            setterwort setterwortVarWireman = setterwortVarCutely.wireman(sanenessVar3, jLongValue, jLongValue, jLongValue, jMax, setterwortVarCutely.f12413impromptu, setterwortVarCutely.f12420taiyuan, setterwortVarCutely.f12408cutely);
            setterwortVarWireman.f12417monoploid = j2;
            return setterwortVarWireman;
        }
        int iSaneness = oilcanVar.saneness(setterwortVarCutely.f12403apical.f12518attabal);
        if (iSaneness != -1 && oilcanVar.beachfront(iSaneness, this.f12248triweekly).f11137dern == oilcanVar.impromptu(sanenessVar.f12518attabal, this.f12248triweekly).f11137dern) {
            return setterwortVarCutely;
        }
        oilcanVar.impromptu(sanenessVar.f12518attabal, this.f12248triweekly);
        long jSaneness = sanenessVar.saneness() ? this.f12248triweekly.saneness(sanenessVar.f12521saneness, sanenessVar.f12519dern) : this.f12248triweekly.f11140wireman;
        androidx.media3.exoplayer.source.formularize.saneness sanenessVar4 = sanenessVar;
        setterwort setterwortVarDern3 = setterwortVarCutely.wireman(sanenessVar4, setterwortVarCutely.f12416molybdenite, setterwortVarCutely.f12416molybdenite, setterwortVarCutely.f12422wireman, jSaneness - setterwortVarCutely.f12416molybdenite, setterwortVarCutely.f12413impromptu, setterwortVarCutely.f12420taiyuan, setterwortVarCutely.f12408cutely).dern(sanenessVar4);
        setterwortVarDern3.f12417monoploid = jSaneness;
        return setterwortVarDern3;
    }

    public final Pair<Boolean, Integer> outmarry(setterwort setterwortVar, setterwort setterwortVar2, boolean z, int i, boolean z2, boolean z3) {
        androidx.media3.common.oilcan oilcanVar = setterwortVar2.f12405attabal;
        androidx.media3.common.oilcan oilcanVar2 = setterwortVar.f12405attabal;
        if (oilcanVar2.monoploid() && oilcanVar.monoploid()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (oilcanVar2.monoploid() != oilcanVar.monoploid()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (oilcanVar.triweekly(oilcanVar.impromptu(setterwortVar2.f12419saneness.f12518attabal, this.f12248triweekly).f11137dern, this.f10811attabal).f11115attabal.equals(oilcanVar2.triweekly(oilcanVar2.impromptu(setterwortVar.f12419saneness.f12518attabal, this.f12248triweekly).f11137dern, this.f10811attabal).f11115attabal)) {
            if (z && i == 0 && setterwortVar2.f12419saneness.f12522wireman < setterwortVar.f12419saneness.f12522wireman) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return (z && i == 1 && z3) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    public boolean prefect() {
        ctenidium();
        return this.f12211lightstruck.f12404arytenoidectomy;
    }

    public final void pruinose(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f12209kowloon.remove(i3);
        }
        this.f12232privatdozent = this.f12232privatdozent.attabal(i, i2);
    }

    public final void puffin() {
        int playbackState = getPlaybackState();
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zPrefect = prefect();
                tectonization tectonizationVar = this.f12221oilcan;
                if (getPlayWhenReady() && !zPrefect) {
                    z = true;
                }
                tectonizationVar.saneness(z);
                this.f12254yemenite.saneness(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.f12221oilcan.saneness(false);
        this.f12254yemenite.saneness(false);
    }

    @Override // androidx.media3.exoplayer.adultoid
    public void release() {
        AudioTrack audioTrack;
        decarock.triweekly.beachfront("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + decarock.grimness.f25089marial + "] [" + androidx.media3.common.dovishness.saneness() + X3.j.e);
        ctenidium();
        if (decarock.grimness.f25080attabal < 21 && (audioTrack = this.f12222overspeculate) != null) {
            audioTrack.release();
            this.f12222overspeculate = null;
        }
        this.f12189cuirassed.saneness(false);
        immediately immediatelyVar = this.f12249trm;
        if (immediatelyVar != null) {
            immediatelyVar.competently();
        }
        this.f12221oilcan.saneness(false);
        this.f12254yemenite.saneness(false);
        this.f12243stratoscope.taiyuan();
        if (!this.f12180apical.czestochowa()) {
            this.f12197formularize.apical(10, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.restrictive
                @Override // decarock.impassible.attabal
                public final void invoke(Object obj) {
                    ((androidx.media3.common.cord.wireman) obj).onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.f12197formularize.taiyuan();
        this.f12245taiyuan.removeCallbacksAndMessages(null);
        this.f12199graveside.wireman(this.f12228polloi);
        setterwort setterwortVar = this.f12211lightstruck;
        if (setterwortVar.f12404arytenoidectomy) {
            this.f12211lightstruck = setterwortVar.attabal();
        }
        setterwort setterwortVarImpromptu = this.f12211lightstruck.impromptu(1);
        this.f12211lightstruck = setterwortVarImpromptu;
        setterwort setterwortVarDern = setterwortVarImpromptu.dern(setterwortVarImpromptu.f12419saneness);
        this.f12211lightstruck = setterwortVarDern;
        setterwortVarDern.f12417monoploid = setterwortVarDern.f12416molybdenite;
        this.f12211lightstruck.f12418polloi = 0L;
        this.f12228polloi.release();
        this.f12205impromptu.taiyuan();
        tarboosh();
        Surface surface = this.f12193dent;
        if (surface != null) {
            surface.release();
            this.f12193dent = null;
        }
        if (this.f12253wostteth) {
            ((PriorityTaskManager) decarock.attabal.marial(this.f12231preterite)).dern(this.f12250underbelly);
            this.f12253wostteth = false;
        }
        this.f12185coi = libya.saneness.f32942dern;
        this.f12203igbo = true;
    }

    @Override // androidx.media3.common.cord
    public long saneness() {
        ctenidium();
        return decarock.grimness.sultanate(this.f12211lightstruck.f12418polloi);
    }

    @Override // androidx.media3.common.cord
    public void setPlayWhenReady(boolean z) {
        ctenidium();
        int iArytenoidectomy = this.f12243stratoscope.arytenoidectomy(z, getPlaybackState());
        twybill(z, iArytenoidectomy, lampshade(iArytenoidectomy));
    }

    @Override // androidx.media3.common.cord
    public void setVideoSurface(Surface surface) {
        ctenidium();
        tarboosh();
        tailoring(surface);
        int i = surface == null ? 0 : -1;
        microchemistry(i, i);
    }

    @Override // androidx.media3.common.cord
    public void setVolume(float f) {
        ctenidium();
        final float fTriweekly = decarock.grimness.triweekly(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (this.f12237sayid == fTriweekly) {
            return;
        }
        this.f12237sayid = fTriweekly;
        sultanate();
        this.f12197formularize.apical(22, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.kattegat
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((androidx.media3.common.cord.wireman) obj).onVolumeChanged(fTriweekly);
            }
        });
    }

    public final long setterwort(setterwort setterwortVar) {
        if (!setterwortVar.f12419saneness.saneness()) {
            return decarock.grimness.sultanate(mastfed(setterwortVar));
        }
        setterwortVar.f12405attabal.impromptu(setterwortVar.f12419saneness.f12518attabal, this.f12248triweekly);
        return setterwortVar.f12409dern == C.TIME_UNSET ? setterwortVar.f12405attabal.triweekly(attendance(setterwortVar), this.f10811attabal).saneness() : this.f12248triweekly.impassible() + decarock.grimness.sultanate(setterwortVar.f12409dern);
    }

    @Override // androidx.media3.common.cord
    public void stop() {
        ctenidium();
        this.f12243stratoscope.arytenoidectomy(getPlayWhenReady(), 1);
        liable(null);
        this.f12185coi = new libya.saneness(ImmutableList.of(), this.f12211lightstruck.f12416molybdenite);
    }

    public void stupefactive(List<androidx.media3.exoplayer.source.formularize> list, boolean z) {
        ctenidium();
        libya(list, -1, C.TIME_UNSET, z);
    }

    public final void sultanate() {
        cig(1, 2, Float.valueOf(this.f12237sayid * this.f12243stratoscope.competently()));
    }

    public final void tailoring(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (homozygous homozygousVar : this.f12186competently) {
            if (homozygousVar.getTrackType() == 2) {
                arrayList.add(technofreak(homozygousVar).triweekly(1).impassible(obj).formularize());
            }
        }
        Object obj2 = this.f12183clubfoot;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((mastfed) it.next()).attabal(this.f12238sealless);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f12183clubfoot;
            Surface surface = this.f12193dent;
            if (obj3 == surface) {
                surface.release();
                this.f12193dent = null;
            }
        }
        this.f12183clubfoot = obj;
        if (z) {
            liable(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    public final void tarboosh() {
        if (this.f12190cultivated != null) {
            technofreak(this.f12187cord).triweekly(10000).impassible(null).formularize();
            this.f12190cultivated.beachfront(this.f12230preprohormone);
            this.f12190cultivated = null;
        }
        TextureView textureView = this.f12246timberyard;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f12230preprohormone) {
                decarock.triweekly.impromptu("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f12246timberyard.setSurfaceTextureListener(null);
            }
            this.f12246timberyard = null;
        }
        SurfaceHolder surfaceHolder = this.f12225permissivist;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f12230preprohormone);
            this.f12225permissivist = null;
        }
    }

    public final mastfed technofreak(mastfed.saneness sanenessVar) {
        int iAttendance = attendance(this.f12211lightstruck);
        sayid sayidVar = this.f12180apical;
        androidx.media3.common.oilcan oilcanVar = this.f12211lightstruck.f12405attabal;
        if (iAttendance == -1) {
            iAttendance = 0;
        }
        return new mastfed(sayidVar, sanenessVar, oilcanVar, iAttendance, this.f12234rotuma, sayidVar.yemenite());
    }

    public final int tectonization(int i) {
        AudioTrack audioTrack = this.f12222overspeculate;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.f12222overspeculate.release();
            this.f12222overspeculate = null;
        }
        if (this.f12222overspeculate == null) {
            this.f12222overspeculate = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f12222overspeculate.getAudioSessionId();
    }

    public final void twybill(boolean z, int i, int i2) {
        boolean z2 = z && i != -1;
        int iClaque = claque(z2, i);
        setterwort setterwortVar = this.f12211lightstruck;
        if (setterwortVar.f12410formularize == z2 && setterwortVar.f12421triweekly == iClaque && setterwortVar.f12412impassible == i2) {
            return;
        }
        incorrectly(z2, i2, iClaque);
    }

    public final androidx.media3.common.gintrap unconsolidated() {
        androidx.media3.common.oilcan currentTimeline = getCurrentTimeline();
        if (currentTimeline.monoploid()) {
            return this.f12223palmyra;
        }
        return this.f12223palmyra.attabal().polder(currentTimeline.triweekly(arytenoidectomy(), this.f10811attabal).f11119dern.f10618marial).restrictive();
    }

    public long vesuvio() {
        ctenidium();
        if (this.f12211lightstruck.f12405attabal.monoploid()) {
            return this.f12178achondroplasia;
        }
        setterwort setterwortVar = this.f12211lightstruck;
        if (setterwortVar.f12403apical.f12522wireman != setterwortVar.f12419saneness.f12522wireman) {
            return setterwortVar.f12405attabal.triweekly(arytenoidectomy(), this.f10811attabal).wireman();
        }
        long j = setterwortVar.f12417monoploid;
        if (this.f12211lightstruck.f12403apical.saneness()) {
            setterwort setterwortVar2 = this.f12211lightstruck;
            androidx.media3.common.oilcan.saneness sanenessVarImpromptu = setterwortVar2.f12405attabal.impromptu(setterwortVar2.f12403apical.f12518attabal, this.f12248triweekly);
            long jBeachfront = sanenessVarImpromptu.beachfront(this.f12211lightstruck.f12403apical.f12521saneness);
            j = jBeachfront == Long.MIN_VALUE ? sanenessVarImpromptu.f11140wireman : jBeachfront;
        }
        setterwort setterwortVar3 = this.f12211lightstruck;
        return decarock.grimness.sultanate(fastrack(setterwortVar3.f12405attabal, setterwortVar3.f12403apical, j));
    }

    public final void vir() {
        androidx.media3.common.cord.saneness sanenessVar = this.f12202hydrovane;
        androidx.media3.common.cord.saneness sanenessVarGrimness = decarock.grimness.grimness(this.f12182beachfront, this.f12194dern);
        this.f12202hydrovane = sanenessVarGrimness;
        if (sanenessVarGrimness.equals(sanenessVar)) {
            return;
        }
        this.f12197formularize.impromptu(13, new decarock.impassible.attabal() { // from class: androidx.media3.exoplayer.saran
            @Override // decarock.impassible.attabal
            public final void invoke(Object obj) {
                ((androidx.media3.common.cord.wireman) obj).onAvailableCommandsChanged(this.f12314attabal.f12202hydrovane);
            }
        });
    }

    @Override // androidx.media3.common.cord
    public void wireman(int i, int i2) {
        ctenidium();
        decarock.attabal.attabal(i >= 0 && i2 >= i);
        int size = this.f12209kowloon.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        setterwort setterwortVarCosy = cosy(this.f12211lightstruck, i, iMin);
        miliaria(setterwortVarCosy, 0, !setterwortVarCosy.f12419saneness.f12518attabal.equals(this.f12211lightstruck.f12419saneness.f12518attabal), 4, mastfed(setterwortVarCosy), -1, false);
    }
}

package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.cuirassed;
import androidx.media3.common.impassible;
import androidx.media3.common.merc;
import androidx.media3.common.molybdenite;
import androidx.media3.common.polder;
import androidx.media3.common.polloi;
import androidx.media3.common.restrictive;
import androidx.media3.exoplayer.ExoPlaybackException;
import bluecoat.apical;
import bluecoat.rotuma;
import com.google.common.base.Suppliers;
import com.google.common.base.arytenoidectomy;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.cutely;
import decarock.grimness;
import decarock.trm;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements rotuma, merc.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Executor f12852arytenoidectomy = new Executor() { // from class: bluecoat.saneness
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.attabal.wireman(runnable);
        }
    };

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public cuirassed f12853apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f12854attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final decarock.wireman f12855beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final CopyOnWriteArraySet<wireman> f12856competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public cutely f12857cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.dern f12858dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Pair<Surface, trm> f12859formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f12860impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public polloi f12861impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public long f12862kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final cuirassed.attabal f12863marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final impromptu f12864saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public apical f12865taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f12866triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.wireman f12867wireman;

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public static final class beachfront implements cuirassed.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final restrictive.attabal f12868attabal;

        public beachfront(restrictive.attabal attabalVar) {
            this.f12868attabal = attabalVar;
        }

        @Override // androidx.media3.common.cuirassed.attabal
        public cuirassed attabal(Context context, androidx.media3.common.impromptu impromptuVar, androidx.media3.common.apical apicalVar, merc.attabal attabalVar, Executor executor, List<impassible> list, long j) throws VideoFrameProcessingException {
            try {
                return ((cuirassed.attabal) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(restrictive.attabal.class).newInstance(this.f12868attabal)).attabal(context, impromptuVar, apicalVar, attabalVar, executor, list, j);
            } catch (Exception e) {
                throw VideoFrameProcessingException.from(e);
            }
        }
    }

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static Constructor<?> f12869attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static Method f12870dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static Method f12871saneness;

        public static impassible attabal(float f) {
            try {
                saneness();
                Object objNewInstance = f12869attabal.newInstance(null);
                f12871saneness.invoke(objNewInstance, Float.valueOf(f));
                return (impassible) decarock.attabal.marial(f12870dern.invoke(objNewInstance, null));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod"})
        public static void saneness() throws NoSuchMethodException, ClassNotFoundException {
            if (f12869attabal == null || f12871saneness == null || f12870dern == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f12869attabal = cls.getConstructor(null);
                f12871saneness = cls.getMethod("setRotationDegrees", Float.TYPE);
                f12870dern = cls.getMethod("build", null);
            }
        }
    }

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public final class dern implements androidx.media3.exoplayer.video.wireman.attabal {
        public dern() {
        }

        @Override // androidx.media3.exoplayer.video.wireman.attabal
        public void attabal() {
            Iterator it = attabal.this.f12856competently.iterator();
            while (it.hasNext()) {
                ((wireman) it.next()).kowloon(attabal.this);
            }
            ((cuirassed) decarock.attabal.taiyuan(attabal.this.f12853apical)).saneness(-2L);
        }

        @Override // androidx.media3.exoplayer.video.wireman.attabal
        public void onVideoSizeChanged(polder polderVar) {
            attabal.this.f12861impromptu = new polloi.saneness().palmyra(polderVar.f11146attabal).dent(polderVar.f11148saneness).sensatory("video/raw").polder();
            Iterator it = attabal.this.f12856competently.iterator();
            while (it.hasNext()) {
                ((wireman) it.next()).saneness(attabal.this, polderVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.wireman.attabal
        public void saneness(long j, long j2, long j3, boolean z) {
            if (z && attabal.this.f12859formularize != null) {
                Iterator it = attabal.this.f12856competently.iterator();
                while (it.hasNext()) {
                    ((wireman) it.next()).molybdenite(attabal.this);
                }
            }
            if (attabal.this.f12865taiyuan != null) {
                attabal.this.f12865taiyuan.wireman(j2, attabal.this.f12855beachfront.nanoTime(), attabal.this.f12861impromptu == null ? new polloi.saneness().polder() : attabal.this.f12861impromptu, null);
            }
            ((cuirassed) decarock.attabal.taiyuan(attabal.this.f12853apical)).saneness(j);
        }
    }

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public final class impromptu implements VideoSink, wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f12875attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public polloi f12876beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f12877competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public boolean f12878cutely;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public boolean f12881impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public long f12882impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public restrictive f12884marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f12886saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public long f12887taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public long f12888triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public impassible f12889wireman;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final ArrayList<impassible> f12879dern = new ArrayList<>();

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public long f12873apical = C.TIME_UNSET;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public long f12880formularize = C.TIME_UNSET;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public VideoSink.attabal f12883kowloon = VideoSink.attabal.f12851attabal;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public Executor f12874arytenoidectomy = attabal.f12852arytenoidectomy;

        public impromptu(Context context) {
            this.f12875attabal = context;
            this.f12886saneness = grimness.dent(context);
        }

        public static /* synthetic */ void dovishness(impromptu impromptuVar, VideoSink.attabal attabalVar) {
            impromptuVar.getClass();
            attabalVar.dern((VideoSink) decarock.attabal.taiyuan(impromptuVar));
        }

        public static /* synthetic */ void gintrap(impromptu impromptuVar, VideoSink.attabal attabalVar) {
            impromptuVar.getClass();
            attabalVar.attabal(impromptuVar);
        }

        public static /* synthetic */ void rotuma(impromptu impromptuVar, VideoSink.attabal attabalVar, polder polderVar) {
            impromptuVar.getClass();
            attabalVar.saneness(impromptuVar, polderVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void adultoid(VideoSink.attabal attabalVar, Executor executor) {
            this.f12883kowloon = attabalVar;
            this.f12874arytenoidectomy = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean apical() {
            return grimness.monroe(this.f12875attabal);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void arytenoidectomy() {
            attabal.this.f12858dern.competently();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface attabal() {
            decarock.attabal.competently(isInitialized());
            return ((restrictive) decarock.attabal.taiyuan(this.f12884marial)).attabal();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public long beachfront(long j, boolean z) {
            decarock.attabal.competently(isInitialized());
            decarock.attabal.competently(this.f12886saneness != -1);
            long j2 = this.f12888triweekly;
            if (j2 != C.TIME_UNSET) {
                if (!attabal.this.cuirassed(j2)) {
                    return C.TIME_UNSET;
                }
                preprohormone();
                this.f12888triweekly = C.TIME_UNSET;
            }
            if (((restrictive) decarock.attabal.taiyuan(this.f12884marial)).wireman() >= this.f12886saneness || !((restrictive) decarock.attabal.taiyuan(this.f12884marial)).dern()) {
                return C.TIME_UNSET;
            }
            long j3 = j - this.f12887taiyuan;
            cord(j3);
            this.f12880formularize = j3;
            if (z) {
                this.f12873apical = j3;
            }
            return j * 1000;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void competently() {
            attabal.this.f12858dern.formularize();
        }

        public final void cord(long j) {
            if (this.f12878cutely) {
                attabal.this.sealless(this.f12887taiyuan, j, this.f12882impromptu);
                this.f12878cutely = false;
            }
        }

        public void cuirassed(List<impassible> list) {
            this.f12879dern.clear();
            this.f12879dern.addAll(list);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void cutely(long j, long j2) {
            this.f12878cutely |= (this.f12882impromptu == j && this.f12887taiyuan == j2) ? false : true;
            this.f12882impromptu = j;
            this.f12887taiyuan = j2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void dern() {
            attabal.this.f12858dern.attabal();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void formularize(polloi polloiVar) throws VideoSink.VideoSinkException {
            decarock.attabal.competently(!isInitialized());
            this.f12884marial = attabal.this.stratoscope(polloiVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void graveside(boolean z) {
            if (isInitialized()) {
                this.f12884marial.flush();
            }
            this.f12881impassible = false;
            this.f12873apical = C.TIME_UNSET;
            this.f12880formularize = C.TIME_UNSET;
            attabal.this.rotuma();
            if (z) {
                attabal.this.f12858dern.impassible();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void impassible(boolean z) {
            attabal.this.f12858dern.impromptu(z);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void impromptu(List<impassible> list) {
            if (this.f12879dern.equals(list)) {
                return;
            }
            cuirassed(list);
            preprohormone();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (!isInitialized()) {
                return false;
            }
            long j = this.f12873apical;
            return j != C.TIME_UNSET && attabal.this.cuirassed(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        @EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
        public boolean isInitialized() {
            return this.f12884marial != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return isInitialized() && attabal.this.oilcan();
        }

        @Override // androidx.media3.exoplayer.video.attabal.wireman
        public void kowloon(attabal attabalVar) {
            final VideoSink.attabal attabalVar2 = this.f12883kowloon;
            this.f12874arytenoidectomy.execute(new Runnable() { // from class: bluecoat.beachfront
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.video.attabal.impromptu.dovishness(this.f15065kowloon, attabalVar2);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void marial(Surface surface, trm trmVar) {
            attabal.this.restrictive(surface, trmVar);
        }

        @Override // androidx.media3.exoplayer.video.attabal.wireman
        public void molybdenite(attabal attabalVar) {
            final VideoSink.attabal attabalVar2 = this.f12883kowloon;
            this.f12874arytenoidectomy.execute(new Runnable() { // from class: bluecoat.competently
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.video.attabal.impromptu.gintrap(this.f15067kowloon, attabalVar2);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void monoploid(float f) {
            attabal.this.merc(f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void polloi() {
            attabal.this.gintrap();
        }

        public final void preprohormone() {
            if (this.f12876beachfront == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            impassible impassibleVar = this.f12889wireman;
            if (impassibleVar != null) {
                arrayList.add(impassibleVar);
            }
            arrayList.addAll(this.f12879dern);
            polloi polloiVar = (polloi) decarock.attabal.marial(this.f12876beachfront);
            ((restrictive) decarock.attabal.taiyuan(this.f12884marial)).saneness(this.f12877competently, arrayList, new molybdenite.saneness(attabal.cord(polloiVar.f11191cuirassed), polloiVar.f11197graveside, polloiVar.f11184adultoid).saneness(polloiVar.f11211rotuma).attabal());
            this.f12873apical = C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            attabal.this.kattegat();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) throws VideoSink.VideoSinkException {
            try {
                attabal.this.supplicat(j, j2);
            } catch (ExoPlaybackException e) {
                polloi polloiVarPolder = this.f12876beachfront;
                if (polloiVarPolder == null) {
                    polloiVarPolder = new polloi.saneness().polder();
                }
                throw new VideoSink.VideoSinkException(e, polloiVarPolder);
            }
        }

        @Override // androidx.media3.exoplayer.video.attabal.wireman
        public void saneness(attabal attabalVar, final polder polderVar) {
            final VideoSink.attabal attabalVar2 = this.f12883kowloon;
            this.f12874arytenoidectomy.execute(new Runnable() { // from class: bluecoat.marial
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.video.attabal.impromptu.rotuma(this.f15117kowloon, attabalVar2, polderVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void taiyuan(int i, polloi polloiVar) {
            int i2;
            polloi polloiVar2;
            decarock.attabal.competently(isInitialized());
            if (i != 1 && i != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i);
            }
            attabal.this.f12858dern.arytenoidectomy(polloiVar.f11194dovishness);
            if (i != 1 || grimness.f25080attabal >= 21 || (i2 = polloiVar.f11196gintrap) == -1 || i2 == 0) {
                this.f12889wireman = null;
            } else if (this.f12889wireman == null || (polloiVar2 = this.f12876beachfront) == null || polloiVar2.f11196gintrap != i2) {
                this.f12889wireman = competently.attabal(i2);
            }
            this.f12877competently = i;
            this.f12876beachfront = polloiVar;
            if (this.f12881impassible) {
                decarock.attabal.competently(this.f12880formularize != C.TIME_UNSET);
                this.f12888triweekly = this.f12880formularize;
            } else {
                preprohormone();
                this.f12881impassible = true;
                this.f12888triweekly = C.TIME_UNSET;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void triweekly() {
            attabal.this.f12858dern.apical();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void wireman(apical apicalVar) {
            attabal.this.polder(apicalVar);
        }
    }

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public static final class marial implements restrictive.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final arytenoidectomy<restrictive.attabal> f12890attabal = Suppliers.attabal(new arytenoidectomy() { // from class: bluecoat.wireman
            @Override // com.google.common.base.arytenoidectomy
            public final Object get() {
                return androidx.media3.exoplayer.video.attabal.marial.attabal();
            }
        });

        public marial() {
        }

        public static /* synthetic */ restrictive.attabal attabal() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (restrictive.attabal) decarock.attabal.marial(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f12891attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f12892beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public restrictive.attabal f12893dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public decarock.wireman f12894marial = decarock.wireman.f25152attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final androidx.media3.exoplayer.video.dern f12895saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public cuirassed.attabal f12896wireman;

        public saneness(Context context, androidx.media3.exoplayer.video.dern dernVar) {
            this.f12891attabal = context.getApplicationContext();
            this.f12895saneness = dernVar;
        }

        public saneness beachfront(decarock.wireman wiremanVar) {
            this.f12894marial = wiremanVar;
            return this;
        }

        public attabal marial() {
            decarock.attabal.competently(!this.f12892beachfront);
            if (this.f12896wireman == null) {
                if (this.f12893dern == null) {
                    this.f12893dern = new marial();
                }
                this.f12896wireman = new beachfront(this.f12893dern);
            }
            attabal attabalVar = new attabal(this);
            this.f12892beachfront = true;
            return attabalVar;
        }
    }

    /* JADX INFO: compiled from: CompositingVideoSinkProvider.java */
    public interface wireman {
        void kowloon(attabal attabalVar);

        void molybdenite(attabal attabalVar);

        void saneness(attabal attabalVar, polder polderVar);
    }

    public static androidx.media3.common.impromptu cord(androidx.media3.common.impromptu impromptuVar) {
        return (impromptuVar == null || !impromptuVar.impromptu()) ? androidx.media3.common.impromptu.f10962impromptu : impromptuVar;
    }

    @Override // bluecoat.rotuma
    public androidx.media3.exoplayer.video.dern attabal() {
        return this.f12858dern;
    }

    public final boolean cuirassed(long j) {
        return this.f12860impassible == 0 && this.f12867wireman.wireman(j);
    }

    public void dovishness(wireman wiremanVar) {
        this.f12856competently.add(wiremanVar);
    }

    public void gintrap() {
        trm trmVar = trm.f25148dern;
        yemenite(null, trmVar.saneness(), trmVar.attabal());
        this.f12859formularize = null;
    }

    public void kattegat() {
        if (this.f12866triweekly == 2) {
            return;
        }
        cutely cutelyVar = this.f12857cutely;
        if (cutelyVar != null) {
            cutelyVar.removeCallbacksAndMessages(null);
        }
        cuirassed cuirassedVar = this.f12853apical;
        if (cuirassedVar != null) {
            cuirassedVar.release();
        }
        this.f12859formularize = null;
        this.f12866triweekly = 2;
    }

    public final void merc(float f) {
        this.f12867wireman.apical(f);
    }

    public final boolean oilcan() {
        return this.f12860impassible == 0 && this.f12867wireman.marial();
    }

    public final void polder(apical apicalVar) {
        this.f12865taiyuan = apicalVar;
    }

    public final void preprohormone() {
        int i = this.f12860impassible - 1;
        this.f12860impassible = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(this.f12860impassible));
        }
        this.f12867wireman.saneness();
    }

    public void restrictive(Surface surface, trm trmVar) {
        Pair<Surface, trm> pair = this.f12859formularize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((trm) this.f12859formularize.second).equals(trmVar)) {
            return;
        }
        this.f12859formularize = Pair.create(surface, trmVar);
        yemenite(surface, trmVar.saneness(), trmVar.attabal());
    }

    public final void rotuma() {
        if (trm()) {
            this.f12860impassible++;
            this.f12867wireman.saneness();
            ((cutely) decarock.attabal.taiyuan(this.f12857cutely)).post(new Runnable() { // from class: bluecoat.dern
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15068kowloon.preprohormone();
                }
            });
        }
    }

    @Override // bluecoat.rotuma
    public VideoSink saneness() {
        return this.f12864saneness;
    }

    public final void sealless(long j, long j2, long j3) {
        this.f12862kowloon = j;
        this.f12867wireman.impromptu(j2, j3);
    }

    public final restrictive stratoscope(polloi polloiVar) throws VideoSink.VideoSinkException {
        decarock.attabal.competently(this.f12866triweekly == 0);
        androidx.media3.common.impromptu impromptuVarCord = cord(polloiVar.f11191cuirassed);
        if (impromptuVarCord.f10969dern == 7 && grimness.f25080attabal < 34) {
            impromptuVarCord = impromptuVarCord.attabal().marial(6).attabal();
        }
        androidx.media3.common.impromptu impromptuVar = impromptuVarCord;
        final cutely cutelyVarCreateHandler = this.f12855beachfront.createHandler((Looper) decarock.attabal.taiyuan(Looper.myLooper()), null);
        this.f12857cutely = cutelyVarCreateHandler;
        try {
            cuirassed.attabal attabalVar = this.f12863marial;
            Context context = this.f12854attabal;
            androidx.media3.common.apical apicalVar = androidx.media3.common.apical.f10746attabal;
            Objects.requireNonNull(cutelyVarCreateHandler);
            try {
                this.f12853apical = attabalVar.attabal(context, impromptuVar, apicalVar, this, new Executor() { // from class: bluecoat.attabal
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        cutelyVarCreateHandler.post(runnable);
                    }
                }, ImmutableList.of(), 0L);
                Pair<Surface, trm> pair = this.f12859formularize;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    trm trmVar = (trm) pair.second;
                    yemenite(surface, trmVar.saneness(), trmVar.attabal());
                }
                this.f12853apical.dern(0);
                this.f12866triweekly = 1;
                return this.f12853apical.attabal(0);
            } catch (VideoFrameProcessingException e) {
                e = e;
                throw new VideoSink.VideoSinkException(e, polloiVar);
            }
        } catch (VideoFrameProcessingException e2) {
            e = e2;
        }
    }

    public void supplicat(long j, long j2) throws ExoPlaybackException {
        if (this.f12860impassible == 0) {
            this.f12867wireman.taiyuan(j, j2);
        }
    }

    public final boolean trm() {
        return this.f12866triweekly == 1;
    }

    public final void yemenite(Surface surface, int i, int i2) {
        if (this.f12853apical != null) {
            this.f12853apical.wireman(surface != null ? new androidx.media3.common.trm(surface, i, i2) : null);
            this.f12858dern.monoploid(surface);
        }
    }

    public attabal(saneness sanenessVar) {
        Context context = sanenessVar.f12891attabal;
        this.f12854attabal = context;
        impromptu impromptuVar = new impromptu(context);
        this.f12864saneness = impromptuVar;
        decarock.wireman wiremanVar = sanenessVar.f12894marial;
        this.f12855beachfront = wiremanVar;
        androidx.media3.exoplayer.video.dern dernVar = sanenessVar.f12895saneness;
        this.f12858dern = dernVar;
        dernVar.kowloon(wiremanVar);
        this.f12867wireman = new androidx.media3.exoplayer.video.wireman(new dern(), dernVar);
        this.f12863marial = (cuirassed.attabal) decarock.attabal.taiyuan(sanenessVar.f12896wireman);
        this.f12856competently = new CopyOnWriteArraySet<>();
        this.f12866triweekly = 0;
        dovishness(impromptuVar);
    }

    public static /* synthetic */ void wireman(Runnable runnable) {
    }
}

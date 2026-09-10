package ctenidium;

import android.graphics.Bitmap;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.polloi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.triweekly;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.supplicat;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: ImageRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront extends triweekly {

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public int f24215clubfoot;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public polloi f24216creditor;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public long f24217grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public DecoderInputBuffer f24218hydrovane;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final DecoderInputBuffer f24219kattegat;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public boolean f24220mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public boolean f24221merc;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public saneness f24222overspeculate;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public Bitmap f24223peridotite;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public attabal f24224polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public int f24225privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public boolean f24226restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public int f24227saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final dern.attabal f24228sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public long f24229seminary;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public saneness f24230splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public dern f24231starveling;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public final ArrayDeque<attabal> f24232supplicat;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public wireman f24233walach;

    /* JADX INFO: compiled from: ImageRenderer.java */
    public static final class attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final attabal f24234dern = new attabal(C.TIME_UNSET, C.TIME_UNSET);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final long f24235attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f24236saneness;

        public attabal(long j, long j2) {
            this.f24235attabal = j;
            this.f24236saneness = j2;
        }
    }

    /* JADX INFO: compiled from: ImageRenderer.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f24237attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Bitmap f24238dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f24239saneness;

        public saneness(int i, long j) {
            this.f24237attabal = i;
            this.f24239saneness = j;
        }

        public long attabal() {
            return this.f24239saneness;
        }

        public int dern() {
            return this.f24237attabal;
        }

        public void marial(Bitmap bitmap) {
            this.f24238dern = bitmap;
        }

        public Bitmap saneness() {
            return this.f24238dern;
        }

        public boolean wireman() {
            return this.f24238dern != null;
        }
    }

    public beachfront(dern.attabal attabalVar, wireman wiremanVar) {
        super(4);
        this.f24228sealless = attabalVar;
        this.f24233walach = milliradian(wiremanVar);
        this.f24219kattegat = DecoderInputBuffer.polloi();
        this.f24224polder = attabal.f24234dern;
        this.f24232supplicat = new ArrayDeque<>();
        this.f24217grimness = C.TIME_UNSET;
        this.f24229seminary = C.TIME_UNSET;
        this.f24227saran = 0;
        this.f24225privatdozent = 1;
    }

    public static wireman milliradian(wireman wiremanVar) {
        return wiremanVar == null ? wireman.f24242attabal : wiremanVar;
    }

    private void nosophobia(long j) {
        this.f24229seminary = j;
        while (!this.f24232supplicat.isEmpty() && j >= this.f24232supplicat.peek().f24235attabal) {
            this.f24224polder = this.f24232supplicat.removeFirst();
        }
    }

    @Override // androidx.media3.exoplayer.lampshade
    public int attabal(polloi polloiVar) {
        return this.f24228sealless.attabal(polloiVar);
    }

    public final void coffeecake(int i) {
        this.f24225privatdozent = Math.min(this.f24225privatdozent, i);
    }

    public final boolean coi() {
        boolean z = getState() == 2;
        int i = this.f24225privatdozent;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void creditor() {
        sayid();
    }

    public final Bitmap cultivated(int i) {
        decarock.attabal.taiyuan(this.f24223peridotite);
        int width = this.f24223peridotite.getWidth() / ((polloi) decarock.attabal.taiyuan(this.f24216creditor)).f11210restrictive;
        int height = this.f24223peridotite.getHeight() / ((polloi) decarock.attabal.taiyuan(this.f24216creditor)).f11203merc;
        int i2 = this.f24216creditor.f11210restrictive;
        return Bitmap.createBitmap(this.f24223peridotite, (i % i2) * width, (i / i2) * height, width, height);
    }

    public final void empress(wireman wiremanVar) {
        this.f24233walach = milliradian(wiremanVar);
    }

    @Override // androidx.media3.exoplayer.homozygous, androidx.media3.exoplayer.lampshade
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void grimness(boolean z, boolean z2) throws ExoPlaybackException {
        this.f24225privatdozent = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.triweekly, androidx.media3.exoplayer.mastfed.saneness
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i != 15) {
            super.handleMessage(i, obj);
        } else {
            empress(obj instanceof wireman ? (wireman) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void hydrovane() {
        sayid();
        coffeecake(1);
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isEnded() {
        return this.f24221merc;
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isReady() {
        int i = this.f24225privatdozent;
        if (i != 3) {
            return i == 0 && this.f24220mathsort;
        }
        return true;
    }

    public final boolean itchy(saneness sanenessVar) {
        return ((polloi) decarock.attabal.taiyuan(this.f24216creditor)).f11210restrictive == -1 || this.f24216creditor.f11203merc == -1 || sanenessVar.dern() == (((polloi) decarock.attabal.taiyuan(this.f24216creditor)).f11203merc * this.f24216creditor.f11210restrictive) - 1;
    }

    public final void lerp(long j, DecoderInputBuffer decoderInputBuffer) {
        boolean z = true;
        if (decoderInputBuffer.taiyuan()) {
            this.f24220mathsort = true;
            return;
        }
        saneness sanenessVar = new saneness(this.f24215clubfoot, decoderInputBuffer.f11480graveside);
        this.f24222overspeculate = sanenessVar;
        this.f24215clubfoot++;
        if (!this.f24220mathsort) {
            long jAttabal = sanenessVar.attabal();
            boolean z2 = jAttabal - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL <= j && j <= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL + jAttabal;
            saneness sanenessVar2 = this.f24230splinterproof;
            boolean z3 = sanenessVar2 != null && sanenessVar2.attabal() <= j && j < jAttabal;
            boolean zItchy = itchy((saneness) decarock.attabal.taiyuan(this.f24222overspeculate));
            if (!z2 && !z3 && !zItchy) {
                z = false;
            }
            this.f24220mathsort = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.f24230splinterproof = this.f24222overspeculate;
        this.f24222overspeculate = null;
    }

    public boolean lotta(long j, long j2, Bitmap bitmap, long j3) throws ExoPlaybackException {
        long j4 = j3 - j;
        if (!coi() && j4 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return false;
        }
        this.f24233walach.saneness(j3 - this.f24224polder.f24236saneness, bitmap);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.triweekly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mathsort(androidx.media3.common.polloi[] r5, long r6, long r8, androidx.media3.exoplayer.source.formularize.saneness r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            super.mathsort(r5, r6, r8, r10)
            r5 = r4
            ctenidium.beachfront$attabal r6 = r5.f24224polder
            long r6 = r6.f24236saneness
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque<ctenidium.beachfront$attabal> r6 = r5.f24232supplicat
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f24217grimness
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f24229seminary
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<ctenidium.beachfront$attabal> r6 = r5.f24232supplicat
            ctenidium.beachfront$attabal r7 = new ctenidium.beachfront$attabal
            long r0 = r5.f24217grimness
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            ctenidium.beachfront$attabal r6 = new ctenidium.beachfront$attabal
            r6.<init>(r0, r8)
            r5.f24224polder = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ctenidium.beachfront.mathsort(androidx.media3.common.polloi[], long, long, androidx.media3.exoplayer.source.formularize$saneness):void");
    }

    public final boolean permissivist(polloi polloiVar) {
        int iAttabal = this.f24228sealless.attabal(polloiVar);
        return iAttabal == lampshade.formularize(4) || iAttabal == lampshade.formularize(3);
    }

    public final boolean premeiotic(long j, long j2) throws ExoPlaybackException, ImageDecoderException {
        if (this.f24223peridotite != null && this.f24230splinterproof == null) {
            return false;
        }
        if (this.f24225privatdozent == 0 && getState() != 2) {
            return false;
        }
        if (this.f24223peridotite == null) {
            decarock.attabal.taiyuan(this.f24231starveling);
            marial marialVarDequeueOutputBuffer = this.f24231starveling.dequeueOutputBuffer();
            if (marialVarDequeueOutputBuffer == null) {
                return false;
            }
            if (((marial) decarock.attabal.taiyuan(marialVarDequeueOutputBuffer)).taiyuan()) {
                if (this.f24227saran == 3) {
                    sayid();
                    decarock.attabal.taiyuan(this.f24216creditor);
                    treadless();
                } else {
                    ((marial) decarock.attabal.taiyuan(marialVarDequeueOutputBuffer)).triweekly();
                    if (this.f24232supplicat.isEmpty()) {
                        this.f24221merc = true;
                    }
                }
                return false;
            }
            decarock.attabal.cutely(marialVarDequeueOutputBuffer.f24241molybdenite, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f24223peridotite = marialVarDequeueOutputBuffer.f24241molybdenite;
            ((marial) decarock.attabal.taiyuan(marialVarDequeueOutputBuffer)).triweekly();
        }
        if (!this.f24220mathsort || this.f24223peridotite == null || this.f24230splinterproof == null) {
            return false;
        }
        decarock.attabal.taiyuan(this.f24216creditor);
        polloi polloiVar = this.f24216creditor;
        int i = polloiVar.f11210restrictive;
        boolean z = ((i == 1 && polloiVar.f11203merc == 1) || i == -1 || polloiVar.f11203merc == -1) ? false : true;
        if (!this.f24230splinterproof.wireman()) {
            saneness sanenessVar = this.f24230splinterproof;
            sanenessVar.marial(z ? cultivated(sanenessVar.dern()) : (Bitmap) decarock.attabal.taiyuan(this.f24223peridotite));
        }
        if (!lotta(j, j2, (Bitmap) decarock.attabal.taiyuan(this.f24230splinterproof.saneness()), this.f24230splinterproof.attabal())) {
            return false;
        }
        nosophobia(((saneness) decarock.attabal.taiyuan(this.f24230splinterproof)).attabal());
        this.f24225privatdozent = 3;
        if (!z || ((saneness) decarock.attabal.taiyuan(this.f24230splinterproof)).dern() == (((polloi) decarock.attabal.taiyuan(this.f24216creditor)).f11203merc * ((polloi) decarock.attabal.taiyuan(this.f24216creditor)).f11210restrictive) - 1) {
            this.f24223peridotite = null;
        }
        this.f24230splinterproof = this.f24222overspeculate;
        this.f24222overspeculate = null;
        return true;
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void privatdozent(long j, boolean z) throws ExoPlaybackException {
        coffeecake(1);
        this.f24221merc = false;
        this.f24226restrictive = false;
        this.f24223peridotite = null;
        this.f24230splinterproof = null;
        this.f24222overspeculate = null;
        this.f24220mathsort = false;
        this.f24218hydrovane = null;
        dern dernVar = this.f24231starveling;
        if (dernVar != null) {
            dernVar.flush();
        }
        this.f24232supplicat.clear();
    }

    @Override // androidx.media3.exoplayer.homozygous
    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.f24221merc) {
            return;
        }
        if (this.f24216creditor == null) {
            empress empressVarSealless = sealless();
            this.f24219kattegat.dern();
            int iOverspeculate = overspeculate(empressVarSealless, this.f24219kattegat, 2);
            if (iOverspeculate != -5) {
                if (iOverspeculate == -4) {
                    decarock.attabal.competently(this.f24219kattegat.taiyuan());
                    this.f24226restrictive = true;
                    this.f24221merc = true;
                    return;
                }
                return;
            }
            this.f24216creditor = (polloi) decarock.attabal.taiyuan(empressVarSealless.f11879saneness);
            treadless();
        }
        try {
            supplicat.attabal("drainAndFeedDecoder");
            while (premeiotic(j, j2)) {
            }
            while (timberyard(j)) {
            }
            supplicat.saneness();
        } catch (ImageDecoderException e) {
            throw stratoscope(e, null, PlaybackException.ERROR_CODE_DECODING_FAILED);
        }
    }

    public final void sayid() {
        this.f24218hydrovane = null;
        this.f24227saran = 0;
        this.f24217grimness = C.TIME_UNSET;
        dern dernVar = this.f24231starveling;
        if (dernVar != null) {
            dernVar.release();
            this.f24231starveling = null;
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void seminary() {
        this.f24216creditor = null;
        this.f24224polder = attabal.f24234dern;
        this.f24232supplicat.clear();
        sayid();
        this.f24233walach.attabal();
    }

    public final boolean timberyard(long j) throws DecoderException {
        if (this.f24220mathsort && this.f24230splinterproof != null) {
            return false;
        }
        empress empressVarSealless = sealless();
        dern dernVar = this.f24231starveling;
        if (dernVar == null || this.f24227saran == 3 || this.f24226restrictive) {
            return false;
        }
        if (this.f24218hydrovane == null) {
            DecoderInputBuffer decoderInputBufferDequeueInputBuffer = dernVar.dequeueInputBuffer();
            this.f24218hydrovane = decoderInputBufferDequeueInputBuffer;
            if (decoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.f24227saran == 2) {
            decarock.attabal.taiyuan(this.f24218hydrovane);
            this.f24218hydrovane.impassible(4);
            ((dern) decarock.attabal.taiyuan(this.f24231starveling)).saneness(this.f24218hydrovane);
            this.f24218hydrovane = null;
            this.f24227saran = 3;
            return false;
        }
        int iOverspeculate = overspeculate(empressVarSealless, this.f24218hydrovane, 0);
        if (iOverspeculate == -5) {
            this.f24216creditor = (polloi) decarock.attabal.taiyuan(empressVarSealless.f11879saneness);
            this.f24227saran = 2;
            return true;
        }
        if (iOverspeculate != -4) {
            if (iOverspeculate == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f24218hydrovane.arytenoidectomy();
        boolean z = ((ByteBuffer) decarock.attabal.taiyuan(this.f24218hydrovane.f11483polloi)).remaining() > 0 || ((DecoderInputBuffer) decarock.attabal.taiyuan(this.f24218hydrovane)).taiyuan();
        if (z) {
            ((dern) decarock.attabal.taiyuan(this.f24231starveling)).saneness((DecoderInputBuffer) decarock.attabal.taiyuan(this.f24218hydrovane));
            this.f24215clubfoot = 0;
        }
        lerp(j, (DecoderInputBuffer) decarock.attabal.taiyuan(this.f24218hydrovane));
        if (((DecoderInputBuffer) decarock.attabal.taiyuan(this.f24218hydrovane)).taiyuan()) {
            this.f24226restrictive = true;
            this.f24218hydrovane = null;
            return false;
        }
        this.f24217grimness = Math.max(this.f24217grimness, ((DecoderInputBuffer) decarock.attabal.taiyuan(this.f24218hydrovane)).f11480graveside);
        if (z) {
            this.f24218hydrovane = null;
        } else {
            ((DecoderInputBuffer) decarock.attabal.taiyuan(this.f24218hydrovane)).dern();
        }
        return !this.f24220mathsort;
    }

    @EnsuresNonNull({"decoder"})
    @RequiresNonNull({"inputFormat"})
    public final void treadless() throws ExoPlaybackException {
        if (!permissivist(this.f24216creditor)) {
            throw stratoscope(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f24216creditor, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
        }
        dern dernVar = this.f24231starveling;
        if (dernVar != null) {
            dernVar.release();
        }
        this.f24231starveling = this.f24228sealless.saneness();
    }
}

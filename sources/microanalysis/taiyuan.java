package microanalysis;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.polloi;
import androidx.media3.common.rotuma;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.empress;
import androidx.media3.exoplayer.lampshade;
import androidx.media3.exoplayer.triweekly;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import decarock.grimness;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;
import strother.arytenoidectomy;
import strother.formularize;
import strother.kowloon;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan extends triweekly implements Handler.Callback {

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public long f33325clubfoot;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public int f33326creditor;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public long f33327dent;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public kowloon f33328grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final impromptu f33329hydrovane;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public final DecoderInputBuffer f33330kattegat;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public boolean f33331mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public boolean f33332merc;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public long f33333overspeculate;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public boolean f33334peridotite;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public boolean f33335permissivist;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public int f33336polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public arytenoidectomy f33337privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public final competently f33338restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public arytenoidectomy f33339saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public final strother.saneness f33340sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public formularize f33341seminary;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public polloi f33342splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public final Handler f33343starveling;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public attabal f33344supplicat;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final empress f33345walach;

    public taiyuan(impromptu impromptuVar, Looper looper) {
        this(impromptuVar, looper, competently.f33320attabal);
    }

    @SideEffectFree
    public static boolean lerp(polloi polloiVar) {
        return Objects.equals(polloiVar.f11218triweekly, "application/x-media3-cues");
    }

    @SideEffectFree
    private long milliradian(long j) {
        decarock.attabal.competently(j != C.TIME_UNSET);
        decarock.attabal.competently(this.f33333overspeculate != C.TIME_UNSET);
        return j - this.f33333overspeculate;
    }

    @Override // androidx.media3.exoplayer.lampshade
    public int attabal(polloi polloiVar) {
        if (lerp(polloiVar) || this.f33338restrictive.attabal(polloiVar)) {
            return lampshade.formularize(polloiVar.f11207polder == 0 ? 4 : 2);
        }
        return rotuma.cutely(polloiVar.f11218triweekly) ? lampshade.formularize(1) : lampshade.formularize(0);
    }

    public final void coffeecake(libya.saneness sanenessVar) {
        this.f33329hydrovane.onCues(sanenessVar.f32945attabal);
        this.f33329hydrovane.onCues(sanenessVar);
    }

    public final void coi(long j) throws DecoderException {
        boolean z;
        this.f33325clubfoot = j;
        if (this.f33337privatdozent == null) {
            ((formularize) decarock.attabal.marial(this.f33341seminary)).setPositionUs(j);
            try {
                this.f33337privatdozent = ((formularize) decarock.attabal.marial(this.f33341seminary)).dequeueOutputBuffer();
            } catch (SubtitleDecoderException e) {
                treadless(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f33339saran != null) {
            long jTimberyard = timberyard();
            z = false;
            while (jTimberyard <= j) {
                this.f33326creditor++;
                jTimberyard = timberyard();
                z = true;
            }
        } else {
            z = false;
        }
        arytenoidectomy arytenoidectomyVar = this.f33337privatdozent;
        if (arytenoidectomyVar != null) {
            if (arytenoidectomyVar.taiyuan()) {
                if (!z && timberyard() == Long.MAX_VALUE) {
                    if (this.f33336polder == 2) {
                        czestochowa();
                    } else {
                        lotta();
                        this.f33331mathsort = true;
                    }
                }
            } else if (arytenoidectomyVar.f33454arytenoidectomy <= j) {
                arytenoidectomy arytenoidectomyVar2 = this.f33339saran;
                if (arytenoidectomyVar2 != null) {
                    arytenoidectomyVar2.triweekly();
                }
                this.f33326creditor = arytenoidectomyVar.getNextEventTimeIndex(j);
                this.f33339saran = arytenoidectomyVar;
                this.f33337privatdozent = null;
                z = true;
            }
        }
        if (z) {
            decarock.attabal.marial(this.f33339saran);
            underbelly(new libya.saneness(this.f33339saran.getCues(j), milliradian(premeiotic(j))));
        }
        if (this.f33336polder == 2) {
            return;
        }
        while (!this.f33334peridotite) {
            try {
                kowloon kowloonVarDequeueInputBuffer = this.f33328grimness;
                if (kowloonVarDequeueInputBuffer == null) {
                    kowloonVarDequeueInputBuffer = ((formularize) decarock.attabal.marial(this.f33341seminary)).dequeueInputBuffer();
                    if (kowloonVarDequeueInputBuffer == null) {
                        return;
                    } else {
                        this.f33328grimness = kowloonVarDequeueInputBuffer;
                    }
                }
                if (this.f33336polder == 1) {
                    kowloonVarDequeueInputBuffer.impassible(4);
                    ((formularize) decarock.attabal.marial(this.f33341seminary)).queueInputBuffer(kowloonVarDequeueInputBuffer);
                    this.f33328grimness = null;
                    this.f33336polder = 2;
                    return;
                }
                int iOverspeculate = overspeculate(this.f33345walach, kowloonVarDequeueInputBuffer, 0);
                if (iOverspeculate == -4) {
                    if (kowloonVarDequeueInputBuffer.taiyuan()) {
                        this.f33334peridotite = true;
                        this.f33332merc = false;
                    } else {
                        polloi polloiVar = this.f33345walach.f11879saneness;
                        if (polloiVar == null) {
                            return;
                        }
                        kowloonVarDequeueInputBuffer.f38193rotuma = polloiVar.f11204molybdenite;
                        kowloonVarDequeueInputBuffer.arytenoidectomy();
                        this.f33332merc &= !kowloonVarDequeueInputBuffer.apical();
                    }
                    if (!this.f33332merc) {
                        ((formularize) decarock.attabal.marial(this.f33341seminary)).queueInputBuffer(kowloonVarDequeueInputBuffer);
                        this.f33328grimness = null;
                    }
                } else if (iOverspeculate == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                treadless(e2);
                return;
            }
        }
    }

    public final void cultivated() {
        underbelly(new libya.saneness(ImmutableList.of(), milliradian(this.f33325clubfoot)));
    }

    public final void czestochowa() {
        sayid();
        itchy();
    }

    @RequiresNonNull({"this.cuesResolver"})
    public final void empress(long j) {
        boolean zNosophobia = nosophobia(j);
        long jWireman = this.f33344supplicat.wireman(this.f33325clubfoot);
        if (jWireman == Long.MIN_VALUE && this.f33334peridotite && !zNosophobia) {
            this.f33331mathsort = true;
        }
        if (jWireman != Long.MIN_VALUE && jWireman <= j) {
            zNosophobia = true;
        }
        if (zNosophobia) {
            ImmutableList<libya.attabal> immutableListAttabal = this.f33344supplicat.attabal(j);
            long jDern = this.f33344supplicat.dern(j);
            underbelly(new libya.saneness(immutableListAttabal, milliradian(jDern)));
            this.f33344supplicat.marial(jDern);
        }
        this.f33325clubfoot = j;
    }

    @Override // androidx.media3.exoplayer.homozygous, androidx.media3.exoplayer.lampshade
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        coffeecake((libya.saneness) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isEnded() {
        return this.f33331mathsort;
    }

    @Override // androidx.media3.exoplayer.homozygous
    public boolean isReady() {
        return true;
    }

    public final void itchy() {
        this.f33332merc = true;
        formularize formularizeVarSaneness = this.f33338restrictive.saneness((polloi) decarock.attabal.marial(this.f33342splinterproof));
        this.f33341seminary = formularizeVarSaneness;
        formularizeVarSaneness.attabal(supplicat());
    }

    public final void lotta() {
        this.f33328grimness = null;
        this.f33326creditor = -1;
        arytenoidectomy arytenoidectomyVar = this.f33339saran;
        if (arytenoidectomyVar != null) {
            arytenoidectomyVar.triweekly();
            this.f33339saran = null;
        }
        arytenoidectomy arytenoidectomyVar2 = this.f33337privatdozent;
        if (arytenoidectomyVar2 != null) {
            arytenoidectomyVar2.triweekly();
            this.f33337privatdozent = null;
        }
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void mathsort(polloi[] polloiVarArr, long j, long j2, androidx.media3.exoplayer.source.formularize.saneness sanenessVar) {
        this.f33333overspeculate = j2;
        polloi polloiVar = polloiVarArr[0];
        this.f33342splinterproof = polloiVar;
        if (lerp(polloiVar)) {
            this.f33344supplicat = this.f33342splinterproof.f11216supplicat == 1 ? new marial() : new beachfront();
            return;
        }
        permissivist();
        if (this.f33341seminary != null) {
            this.f33336polder = 1;
        } else {
            itchy();
        }
    }

    @RequiresNonNull({"this.cuesResolver"})
    public final boolean nosophobia(long j) {
        if (this.f33334peridotite || overspeculate(this.f33345walach, this.f33330kattegat, 0) != -4) {
            return false;
        }
        if (this.f33330kattegat.taiyuan()) {
            this.f33334peridotite = true;
            return false;
        }
        this.f33330kattegat.arytenoidectomy();
        ByteBuffer byteBuffer = (ByteBuffer) decarock.attabal.marial(this.f33330kattegat.f11483polloi);
        strother.marial marialVarAttabal = this.f33340sealless.attabal(this.f33330kattegat.f11480graveside, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f33330kattegat.dern();
        return this.f33344supplicat.saneness(marialVarAttabal, j);
    }

    @RequiresNonNull({"streamFormat"})
    public final void permissivist() {
        decarock.attabal.impromptu(this.f33335permissivist || Objects.equals(this.f33342splinterproof.f11218triweekly, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.f33342splinterproof.f11218triweekly, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.f33342splinterproof.f11218triweekly, MimeTypes.APPLICATION_CEA708), "Legacy decoding is disabled, can't handle " + this.f33342splinterproof.f11218triweekly + " samples (expected application/x-media3-cues).");
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    public final long premeiotic(long j) {
        int nextEventTimeIndex = this.f33339saran.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == 0 || this.f33339saran.getEventTimeCount() == 0) {
            return this.f33339saran.f33454arytenoidectomy;
        }
        if (nextEventTimeIndex != -1) {
            return this.f33339saran.getEventTime(nextEventTimeIndex - 1);
        }
        arytenoidectomy arytenoidectomyVar = this.f33339saran;
        return arytenoidectomyVar.getEventTime(arytenoidectomyVar.getEventTimeCount() - 1);
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void privatdozent(long j, boolean z) {
        this.f33325clubfoot = j;
        attabal attabalVar = this.f33344supplicat;
        if (attabalVar != null) {
            attabalVar.clear();
        }
        cultivated();
        this.f33334peridotite = false;
        this.f33331mathsort = false;
        this.f33327dent = C.TIME_UNSET;
        polloi polloiVar = this.f33342splinterproof;
        if (polloiVar == null || lerp(polloiVar)) {
            return;
        }
        if (this.f33336polder != 0) {
            czestochowa();
            return;
        }
        lotta();
        formularize formularizeVar = (formularize) decarock.attabal.marial(this.f33341seminary);
        formularizeVar.flush();
        formularizeVar.attabal(supplicat());
    }

    @Override // androidx.media3.exoplayer.homozygous
    public void render(long j, long j2) throws DecoderException {
        if (isCurrentStreamFinal()) {
            long j3 = this.f33327dent;
            if (j3 != C.TIME_UNSET && j >= j3) {
                lotta();
                this.f33331mathsort = true;
            }
        }
        if (this.f33331mathsort) {
            return;
        }
        if (lerp((polloi) decarock.attabal.marial(this.f33342splinterproof))) {
            decarock.attabal.marial(this.f33344supplicat);
            empress(j);
        } else {
            permissivist();
            coi(j);
        }
    }

    public final void sayid() {
        lotta();
        ((formularize) decarock.attabal.marial(this.f33341seminary)).release();
        this.f33341seminary = null;
        this.f33336polder = 0;
    }

    @Override // androidx.media3.exoplayer.triweekly
    public void seminary() {
        this.f33342splinterproof = null;
        this.f33327dent = C.TIME_UNSET;
        cultivated();
        this.f33333overspeculate = C.TIME_UNSET;
        this.f33325clubfoot = C.TIME_UNSET;
        if (this.f33341seminary != null) {
            sayid();
        }
    }

    public void sensatory(long j) {
        decarock.attabal.competently(isCurrentStreamFinal());
        this.f33327dent = j;
    }

    public final long timberyard() {
        if (this.f33326creditor == -1) {
            return Long.MAX_VALUE;
        }
        decarock.attabal.marial(this.f33339saran);
        if (this.f33326creditor >= this.f33339saran.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f33339saran.getEventTime(this.f33326creditor);
    }

    public final void treadless(SubtitleDecoderException subtitleDecoderException) {
        decarock.triweekly.wireman("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f33342splinterproof, subtitleDecoderException);
        cultivated();
        czestochowa();
    }

    public final void underbelly(libya.saneness sanenessVar) {
        Handler handler = this.f33343starveling;
        if (handler != null) {
            handler.obtainMessage(1, sanenessVar).sendToTarget();
        } else {
            coffeecake(sanenessVar);
        }
    }

    public taiyuan(impromptu impromptuVar, Looper looper, competently competentlyVar) {
        super(3);
        this.f33329hydrovane = (impromptu) decarock.attabal.marial(impromptuVar);
        this.f33343starveling = looper == null ? null : grimness.preprohormone(looper, this);
        this.f33338restrictive = competentlyVar;
        this.f33340sealless = new strother.saneness();
        this.f33330kattegat = new DecoderInputBuffer(1);
        this.f33345walach = new empress();
        this.f33327dent = C.TIME_UNSET;
        this.f33333overspeculate = C.TIME_UNSET;
        this.f33325clubfoot = C.TIME_UNSET;
        this.f33335permissivist = false;
    }
}

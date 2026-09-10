package philabeg;

import androidx.media3.extractor.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import strother.apical;
import strother.arytenoidectomy;
import strother.formularize;
import strother.kowloon;

/* JADX INFO: compiled from: CeaDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class marial implements formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayDeque<saneness> f35268attabal = new ArrayDeque<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f35269beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f35270competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PriorityQueue<saneness> f35271dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f35272marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayDeque<arytenoidectomy> f35273saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public saneness f35274wireman;

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class dern extends arytenoidectomy {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public miliaria.marial.attabal<dern> f35275adultoid;

        public dern(miliaria.marial.attabal<dern> attabalVar) {
            this.f35275adultoid = attabalVar;
        }

        @Override // miliaria.marial
        public final void triweekly() {
            this.f35275adultoid.attabal(this);
        }
    }

    /* JADX INFO: compiled from: CeaDecoder.java */
    public static final class saneness extends kowloon implements Comparable<saneness> {

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public long f35276preprohormone;

        public saneness() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
        public int compareTo(saneness sanenessVar) {
            if (taiyuan() != sanenessVar.taiyuan()) {
                return taiyuan() ? 1 : -1;
            }
            long j = this.f11480graveside - sanenessVar.f11480graveside;
            if (j == 0) {
                j = this.f35276preprohormone - sanenessVar.f35276preprohormone;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public marial() {
        for (int i = 0; i < 10; i++) {
            this.f35268attabal.add(new saneness());
        }
        this.f35273saneness = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f35273saneness.add(new dern(new miliaria.marial.attabal() { // from class: philabeg.wireman
                @Override // miliaria.marial.attabal
                public final void attabal(miliaria.marial marialVar) {
                    this.f35277attabal.formularize((marial.dern) marialVar);
                }
            }));
        }
        this.f35271dern = new PriorityQueue<>();
        this.f35270competently = C.TIME_UNSET;
    }

    public final void apical(saneness sanenessVar) {
        sanenessVar.dern();
        this.f35268attabal.add(sanenessVar);
    }

    @Override // miliaria.wireman
    public final void attabal(long j) {
        this.f35270competently = j;
    }

    @Override // miliaria.wireman, ctenidium.dern
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public arytenoidectomy dequeueOutputBuffer() throws SubtitleDecoderException {
        if (this.f35273saneness.isEmpty()) {
            return null;
        }
        while (!this.f35271dern.isEmpty() && ((saneness) grimness.impromptu(this.f35271dern.peek())).f11480graveside <= this.f35272marial) {
            saneness sanenessVar = (saneness) grimness.impromptu(this.f35271dern.poll());
            if (sanenessVar.taiyuan()) {
                arytenoidectomy arytenoidectomyVar = (arytenoidectomy) grimness.impromptu(this.f35273saneness.pollFirst());
                arytenoidectomyVar.attabal(4);
                apical(sanenessVar);
                return arytenoidectomyVar;
            }
            wireman(sanenessVar);
            if (taiyuan()) {
                apical apicalVarDern = dern();
                arytenoidectomy arytenoidectomyVar2 = (arytenoidectomy) grimness.impromptu(this.f35273saneness.pollFirst());
                arytenoidectomyVar2.kowloon(sanenessVar.f11480graveside, apicalVarDern, Long.MAX_VALUE);
                apical(sanenessVar);
                return arytenoidectomyVar2;
            }
            apical(sanenessVar);
        }
        return null;
    }

    public final arytenoidectomy competently() {
        return this.f35273saneness.pollFirst();
    }

    @Override // miliaria.wireman
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public void queueInputBuffer(kowloon kowloonVar) throws SubtitleDecoderException {
        decarock.attabal.attabal(kowloonVar == this.f35274wireman);
        saneness sanenessVar = (saneness) kowloonVar;
        long j = this.f35270competently;
        if (j == C.TIME_UNSET || sanenessVar.f11480graveside >= j) {
            long j2 = this.f35269beachfront;
            this.f35269beachfront = 1 + j2;
            sanenessVar.f35276preprohormone = j2;
            this.f35271dern.add(sanenessVar);
        } else {
            apical(sanenessVar);
        }
        this.f35274wireman = null;
    }

    public abstract apical dern();

    @Override // miliaria.wireman
    public void flush() {
        this.f35269beachfront = 0L;
        this.f35272marial = 0L;
        while (!this.f35271dern.isEmpty()) {
            apical((saneness) grimness.impromptu(this.f35271dern.poll()));
        }
        saneness sanenessVar = this.f35274wireman;
        if (sanenessVar != null) {
            apical(sanenessVar);
            this.f35274wireman = null;
        }
    }

    public void formularize(arytenoidectomy arytenoidectomyVar) {
        arytenoidectomyVar.dern();
        this.f35273saneness.add(arytenoidectomyVar);
    }

    public final long impromptu() {
        return this.f35272marial;
    }

    @Override // miliaria.wireman
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public kowloon dequeueInputBuffer() throws SubtitleDecoderException {
        decarock.attabal.competently(this.f35274wireman == null);
        if (this.f35268attabal.isEmpty()) {
            return null;
        }
        saneness sanenessVarPollFirst = this.f35268attabal.pollFirst();
        this.f35274wireman = sanenessVarPollFirst;
        return sanenessVarPollFirst;
    }

    @Override // strother.formularize
    public void setPositionUs(long j) {
        this.f35272marial = j;
    }

    public abstract boolean taiyuan();

    public abstract void wireman(kowloon kowloonVar);

    @Override // miliaria.wireman
    public void release() {
    }
}

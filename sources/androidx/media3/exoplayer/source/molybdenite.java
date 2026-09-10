package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import cybernatic.privatdozent;
import decarock.grimness;
import decarock.stratoscope;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes.dex */
public class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final polyfoil.saneness f12597attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public attabal f12598beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f12599competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final stratoscope f12600dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public attabal f12601marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f12602saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public attabal f12603wireman;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class attabal implements polyfoil.saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f12604attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public polyfoil.attabal f12605dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f12606saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public attabal f12607wireman;

        public attabal(long j, int i) {
            wireman(j, i);
        }

        @Override // polyfoil.saneness.attabal
        public polyfoil.attabal attabal() {
            return (polyfoil.attabal) decarock.attabal.marial(this.f12605dern);
        }

        public void dern(polyfoil.attabal attabalVar, attabal attabalVar2) {
            this.f12605dern = attabalVar;
            this.f12607wireman = attabalVar2;
        }

        public int marial(long j) {
            return ((int) (j - this.f12604attabal)) + this.f12605dern.f35568saneness;
        }

        @Override // polyfoil.saneness.attabal
        public polyfoil.saneness.attabal next() {
            attabal attabalVar = this.f12607wireman;
            if (attabalVar == null || attabalVar.f12605dern == null) {
                return null;
            }
            return attabalVar;
        }

        public attabal saneness() {
            this.f12605dern = null;
            attabal attabalVar = this.f12607wireman;
            this.f12607wireman = null;
            return attabalVar;
        }

        public void wireman(long j, int i) {
            decarock.attabal.competently(this.f12605dern == null);
            this.f12604attabal = j;
            this.f12606saneness = j + ((long) i);
        }
    }

    public molybdenite(polyfoil.saneness sanenessVar) {
        this.f12597attabal = sanenessVar;
        int individualAllocationLength = sanenessVar.getIndividualAllocationLength();
        this.f12602saneness = individualAllocationLength;
        this.f12600dern = new stratoscope(32);
        attabal attabalVar = new attabal(0L, individualAllocationLength);
        this.f12603wireman = attabalVar;
        this.f12601marial = attabalVar;
        this.f12598beachfront = attabalVar;
    }

    public static attabal apical(attabal attabalVar, DecoderInputBuffer decoderInputBuffer, graveside.saneness sanenessVar, stratoscope stratoscopeVar) {
        if (decoderInputBuffer.monoploid()) {
            attabalVar = cutely(attabalVar, decoderInputBuffer, sanenessVar, stratoscopeVar);
        }
        if (!decoderInputBuffer.marial()) {
            decoderInputBuffer.kowloon(sanenessVar.f12572attabal);
            return impromptu(attabalVar, sanenessVar.f12574saneness, decoderInputBuffer.f11483polloi, sanenessVar.f12572attabal);
        }
        stratoscopeVar.starveling(4);
        attabal attabalVarTaiyuan = taiyuan(attabalVar, sanenessVar.f12574saneness, stratoscopeVar.marial(), 4);
        int iSeminary = stratoscopeVar.seminary();
        sanenessVar.f12574saneness += 4;
        sanenessVar.f12572attabal -= 4;
        decoderInputBuffer.kowloon(iSeminary);
        attabal attabalVarImpromptu = impromptu(attabalVarTaiyuan, sanenessVar.f12574saneness, decoderInputBuffer.f11483polloi, iSeminary);
        sanenessVar.f12574saneness += (long) iSeminary;
        int i = sanenessVar.f12572attabal - iSeminary;
        sanenessVar.f12572attabal = i;
        decoderInputBuffer.molybdenite(i);
        return impromptu(attabalVarImpromptu, sanenessVar.f12574saneness, decoderInputBuffer.f11476adultoid, sanenessVar.f12572attabal);
    }

    public static attabal cutely(attabal attabalVar, DecoderInputBuffer decoderInputBuffer, graveside.saneness sanenessVar, stratoscope stratoscopeVar) {
        long j = sanenessVar.f12574saneness;
        int iSaran = 1;
        stratoscopeVar.starveling(1);
        attabal attabalVarTaiyuan = taiyuan(attabalVar, j, stratoscopeVar.marial(), 1);
        long j2 = j + 1;
        byte b = stratoscopeVar.marial()[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        miliaria.dern dernVar = decoderInputBuffer.f11482monoploid;
        byte[] bArr = dernVar.f33442attabal;
        if (bArr == null) {
            dernVar.f33442attabal = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        attabal attabalVarTaiyuan2 = taiyuan(attabalVarTaiyuan, j2, dernVar.f33442attabal, i);
        long j3 = j2 + ((long) i);
        if (z) {
            stratoscopeVar.starveling(2);
            attabalVarTaiyuan2 = taiyuan(attabalVarTaiyuan2, j3, stratoscopeVar.marial(), 2);
            j3 += 2;
            iSaran = stratoscopeVar.saran();
        }
        int i2 = iSaran;
        int[] iArr = dernVar.f33451wireman;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = dernVar.f33448marial;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            stratoscopeVar.starveling(i3);
            attabalVarTaiyuan2 = taiyuan(attabalVarTaiyuan2, j3, stratoscopeVar.marial(), i3);
            j3 += (long) i3;
            stratoscopeVar.mathsort(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = stratoscopeVar.saran();
                iArr4[i4] = stratoscopeVar.seminary();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sanenessVar.f12572attabal - ((int) (j3 - sanenessVar.f12574saneness));
        }
        privatdozent.attabal attabalVar2 = (privatdozent.attabal) grimness.impromptu(sanenessVar.f12573dern);
        dernVar.dern(i2, iArr2, iArr4, attabalVar2.f24741saneness, dernVar.f33442attabal, attabalVar2.f24739attabal, attabalVar2.f24740dern, attabalVar2.f24742wireman);
        long j4 = sanenessVar.f12574saneness;
        int i5 = (int) (j3 - j4);
        sanenessVar.f12574saneness = j4 + ((long) i5);
        sanenessVar.f12572attabal -= i5;
        return attabalVarTaiyuan2;
    }

    public static attabal dern(attabal attabalVar, long j) {
        while (j >= attabalVar.f12606saneness) {
            attabalVar = attabalVar.f12607wireman;
        }
        return attabalVar;
    }

    public static attabal impromptu(attabal attabalVar, long j, ByteBuffer byteBuffer, int i) {
        attabal attabalVarDern = dern(attabalVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (attabalVarDern.f12606saneness - j));
            byteBuffer.put(attabalVarDern.f12605dern.f35567attabal, attabalVarDern.marial(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == attabalVarDern.f12606saneness) {
                attabalVarDern = attabalVarDern.f12607wireman;
            }
        }
        return attabalVarDern;
    }

    public static attabal taiyuan(attabal attabalVar, long j, byte[] bArr, int i) {
        attabal attabalVarDern = dern(attabalVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (attabalVarDern.f12606saneness - j));
            System.arraycopy(attabalVarDern.f12605dern.f35567attabal, attabalVarDern.marial(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == attabalVarDern.f12606saneness) {
                attabalVarDern = attabalVarDern.f12607wireman;
            }
        }
        return attabalVarDern;
    }

    public void arytenoidectomy(stratoscope stratoscopeVar, int i) {
        while (i > 0) {
            int iCompetently = competently(i);
            attabal attabalVar = this.f12598beachfront;
            stratoscopeVar.formularize(attabalVar.f12605dern.f35567attabal, attabalVar.marial(this.f12599competently), iCompetently);
            i -= iCompetently;
            beachfront(iCompetently);
        }
    }

    public final void attabal(attabal attabalVar) {
        if (attabalVar.f12605dern == null) {
            return;
        }
        this.f12597attabal.attabal(attabalVar);
        attabalVar.saneness();
    }

    public final void beachfront(int i) {
        long j = this.f12599competently + ((long) i);
        this.f12599competently = j;
        attabal attabalVar = this.f12598beachfront;
        if (j == attabalVar.f12606saneness) {
            this.f12598beachfront = attabalVar.f12607wireman;
        }
    }

    public final int competently(int i) {
        attabal attabalVar = this.f12598beachfront;
        if (attabalVar.f12605dern == null) {
            attabalVar.dern(this.f12597attabal.allocate(), new attabal(this.f12598beachfront.f12606saneness, this.f12602saneness));
        }
        return Math.min(i, (int) (this.f12598beachfront.f12606saneness - this.f12599competently));
    }

    public void formularize(DecoderInputBuffer decoderInputBuffer, graveside.saneness sanenessVar) {
        this.f12601marial = apical(this.f12601marial, decoderInputBuffer, sanenessVar, this.f12600dern);
    }

    public void impassible() {
        attabal(this.f12603wireman);
        this.f12603wireman.wireman(0L, this.f12602saneness);
        attabal attabalVar = this.f12603wireman;
        this.f12601marial = attabalVar;
        this.f12598beachfront = attabalVar;
        this.f12599competently = 0L;
        this.f12597attabal.trim();
    }

    public int kowloon(androidx.media3.common.taiyuan taiyuanVar, int i, boolean z) throws IOException {
        int iCompetently = competently(i);
        attabal attabalVar = this.f12598beachfront;
        int i2 = taiyuanVar.read(attabalVar.f12605dern.f35567attabal, attabalVar.marial(this.f12599competently), iCompetently);
        if (i2 != -1) {
            beachfront(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void marial(DecoderInputBuffer decoderInputBuffer, graveside.saneness sanenessVar) {
        apical(this.f12601marial, decoderInputBuffer, sanenessVar, this.f12600dern);
    }

    public void saneness(long j) {
        attabal attabalVar;
        if (j == -1) {
            return;
        }
        while (true) {
            attabalVar = this.f12603wireman;
            if (j < attabalVar.f12606saneness) {
                break;
            }
            this.f12597attabal.saneness(attabalVar.f12605dern);
            this.f12603wireman = this.f12603wireman.saneness();
        }
        if (this.f12601marial.f12604attabal < attabalVar.f12604attabal) {
            this.f12601marial = attabalVar;
        }
    }

    public void triweekly() {
        this.f12601marial = this.f12603wireman;
    }

    public long wireman() {
        return this.f12599competently;
    }
}

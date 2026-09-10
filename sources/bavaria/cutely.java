package bavaria;

import androidx.media3.common.ParserException;
import androidx.media3.common.polloi;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.hydrovane;
import decarock.stratoscope;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely extends taiyuan {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f14985arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f14986kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public hydrovane.dern f14987monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public hydrovane.attabal f14988polloi;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public attabal f14989triweekly;

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final hydrovane.dern f14990attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final byte[] f14991dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f14992marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final hydrovane.attabal f14993saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final hydrovane.saneness[] f14994wireman;

        public attabal(hydrovane.dern dernVar, hydrovane.attabal attabalVar, byte[] bArr, hydrovane.saneness[] sanenessVarArr, int i) {
            this.f14990attabal = dernVar;
            this.f14993saneness = attabalVar;
            this.f14991dern = bArr;
            this.f14994wireman = sanenessVarArr;
            this.f14992marial = i;
        }
    }

    public static int arytenoidectomy(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int kowloon(byte b, attabal attabalVar) {
        return !attabalVar.f14994wireman[arytenoidectomy(b, attabalVar.f14992marial, 1)].f24666attabal ? attabalVar.f14990attabal.f24658competently : attabalVar.f14990attabal.f24661impromptu;
    }

    public static boolean polloi(stratoscope stratoscopeVar) {
        try {
            return hydrovane.kowloon(1, stratoscopeVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    public static void triweekly(stratoscope stratoscopeVar, long j) {
        if (stratoscopeVar.saneness() < stratoscopeVar.competently() + 4) {
            stratoscopeVar.hydrovane(Arrays.copyOf(stratoscopeVar.marial(), stratoscopeVar.competently() + 4));
        } else {
            stratoscopeVar.peridotite(stratoscopeVar.competently() + 4);
        }
        byte[] bArrMarial = stratoscopeVar.marial();
        bArrMarial[stratoscopeVar.competently() - 4] = (byte) (j & 255);
        bArrMarial[stratoscopeVar.competently() - 3] = (byte) ((j >>> 8) & 255);
        bArrMarial[stratoscopeVar.competently() - 2] = (byte) ((j >>> 16) & 255);
        bArrMarial[stratoscopeVar.competently() - 1] = (byte) ((j >>> 24) & 255);
    }

    @Override // bavaria.taiyuan
    public long beachfront(stratoscope stratoscopeVar) {
        if ((stratoscopeVar.marial()[0] & 1) == 1) {
            return -1L;
        }
        int iKowloon = kowloon(stratoscopeVar.marial()[0], (attabal) decarock.attabal.taiyuan(this.f14989triweekly));
        long j = this.f14985arytenoidectomy ? (this.f14986kowloon + iKowloon) / 4 : 0;
        triweekly(stratoscopeVar, j);
        this.f14985arytenoidectomy = true;
        this.f14986kowloon = iKowloon;
        return j;
    }

    @Override // bavaria.taiyuan
    public void formularize(boolean z) {
        super.formularize(z);
        if (z) {
            this.f14989triweekly = null;
            this.f14987monoploid = null;
            this.f14988polloi = null;
        }
        this.f14986kowloon = 0;
        this.f14985arytenoidectomy = false;
    }

    @Override // bavaria.taiyuan
    public void marial(long j) {
        super.marial(j);
        this.f14985arytenoidectomy = j != 0;
        hydrovane.dern dernVar = this.f14987monoploid;
        this.f14986kowloon = dernVar != null ? dernVar.f24658competently : 0;
    }

    public attabal monoploid(stratoscope stratoscopeVar) throws IOException {
        hydrovane.dern dernVar = this.f14987monoploid;
        if (dernVar == null) {
            this.f14987monoploid = hydrovane.formularize(stratoscopeVar);
            return null;
        }
        hydrovane.attabal attabalVar = this.f14988polloi;
        if (attabalVar == null) {
            this.f14988polloi = hydrovane.cutely(stratoscopeVar);
            return null;
        }
        byte[] bArr = new byte[stratoscopeVar.competently()];
        System.arraycopy(stratoscopeVar.marial(), 0, bArr, 0, stratoscopeVar.competently());
        hydrovane.saneness[] sanenessVarArrImpassible = hydrovane.impassible(stratoscopeVar, dernVar.f24663saneness);
        return new attabal(dernVar, attabalVar, bArr, sanenessVarArrImpassible, hydrovane.saneness(sanenessVarArrImpassible.length - 1));
    }

    @Override // bavaria.taiyuan
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean taiyuan(stratoscope stratoscopeVar, long j, taiyuan.saneness sanenessVar) throws IOException {
        if (this.f14989triweekly != null) {
            decarock.attabal.marial(sanenessVar.f15022attabal);
            return false;
        }
        attabal attabalVarMonoploid = monoploid(stratoscopeVar);
        this.f14989triweekly = attabalVarMonoploid;
        if (attabalVarMonoploid == null) {
            return true;
        }
        hydrovane.dern dernVar = attabalVarMonoploid.f14990attabal;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dernVar.f24659cutely);
        arrayList.add(attabalVarMonoploid.f14991dern);
        sanenessVar.f15022attabal = new polloi.saneness().sensatory(MimeTypes.AUDIO_VORBIS).grimness(dernVar.f24662marial).lotta(dernVar.f24665wireman).saran(dernVar.f24663saneness).underbelly(dernVar.f24660dern).premeiotic(arrayList).lerp(hydrovane.wireman(ImmutableList.copyOf(attabalVarMonoploid.f14993saneness.f24655saneness))).polder();
        return true;
    }
}

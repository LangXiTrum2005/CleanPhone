package ghoulish;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: AdtsReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan implements impassible {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final byte[] f27081gintrap = {73, 68, 51};

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public privatdozent f27082adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f27083apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f27084arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f27085attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public String f27086beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public privatdozent f27087competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f27088cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final decarock.stratoscope f27089dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public long f27090dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f27091formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f27092graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f27093impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public privatdozent f27094impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f27095kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f27096marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f27097molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f27098monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public long f27099polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.cuirassed f27100saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f27101taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f27102triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f27103wireman;

    public taiyuan(boolean z) {
        this(z, null, 0);
    }

    public static boolean formularize(int i) {
        return (i & 65526) == 65520;
    }

    private boolean impromptu(decarock.stratoscope stratoscopeVar, byte[] bArr, int i) {
        int iMin = Math.min(stratoscopeVar.attabal(), i - this.f27088cutely);
        stratoscopeVar.formularize(bArr, this.f27088cutely, iMin);
        int i2 = this.f27088cutely + iMin;
        this.f27088cutely = i2;
        return i2 == i;
    }

    public final void adultoid(privatdozent privatdozentVar, long j, int i, int i2) {
        this.f27101taiyuan = 4;
        this.f27088cutely = i;
        this.f27082adultoid = privatdozentVar;
        this.f27090dovishness = j;
        this.f27097molybdenite = i2;
    }

    public final boolean apical(byte b, byte b2) {
        return formularize(((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public final void arytenoidectomy() {
        this.f27093impassible = false;
        polloi();
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) throws ParserException {
        marial();
        while (stratoscopeVar.attabal() > 0) {
            int i = this.f27101taiyuan;
            if (i == 0) {
                taiyuan(stratoscopeVar);
            } else if (i == 1) {
                beachfront(stratoscopeVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (impromptu(stratoscopeVar, this.f27100saneness.f25071attabal, this.f27091formularize ? 7 : 5)) {
                        impassible();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    kowloon(stratoscopeVar);
                }
            } else if (impromptu(stratoscopeVar, this.f27089dern.marial(), 10)) {
                triweekly();
            }
        }
    }

    public final void beachfront(decarock.stratoscope stratoscopeVar) {
        if (stratoscopeVar.attabal() == 0) {
            return;
        }
        this.f27100saneness.f25071attabal[0] = stratoscopeVar.marial()[stratoscopeVar.beachfront()];
        this.f27100saneness.arytenoidectomy(2);
        int iImpromptu = this.f27100saneness.impromptu(4);
        int i = this.f27095kowloon;
        if (i != -1 && iImpromptu != i) {
            arytenoidectomy();
            return;
        }
        if (!this.f27093impassible) {
            this.f27093impassible = true;
            this.f27102triweekly = this.f27084arytenoidectomy;
            this.f27095kowloon = iImpromptu;
        }
        molybdenite();
    }

    public final boolean competently(decarock.stratoscope stratoscopeVar, int i) {
        stratoscopeVar.mathsort(i + 1);
        if (!dovishness(stratoscopeVar, this.f27100saneness.f25071attabal, 1)) {
            return false;
        }
        this.f27100saneness.arytenoidectomy(4);
        int iImpromptu = this.f27100saneness.impromptu(1);
        int i2 = this.f27102triweekly;
        if (i2 != -1 && iImpromptu != i2) {
            return false;
        }
        if (this.f27095kowloon != -1) {
            if (!dovishness(stratoscopeVar, this.f27100saneness.f25071attabal, 1)) {
                return true;
            }
            this.f27100saneness.arytenoidectomy(2);
            if (this.f27100saneness.impromptu(4) != this.f27095kowloon) {
                return false;
            }
            stratoscopeVar.mathsort(i + 2);
        }
        if (!dovishness(stratoscopeVar, this.f27100saneness.f25071attabal, 4)) {
            return true;
        }
        this.f27100saneness.arytenoidectomy(14);
        int iImpromptu2 = this.f27100saneness.impromptu(13);
        if (iImpromptu2 < 7) {
            return false;
        }
        byte[] bArrMarial = stratoscopeVar.marial();
        int iCompetently = stratoscopeVar.competently();
        int i3 = i + iImpromptu2;
        if (i3 >= iCompetently) {
            return true;
        }
        byte b = bArrMarial[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == iCompetently) {
                return true;
            }
            return apical((byte) -1, bArrMarial[i4]) && ((bArrMarial[i4] & 8) >> 3) == iImpromptu;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == iCompetently) {
            return true;
        }
        if (bArrMarial[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == iCompetently || bArrMarial[i6] == 51;
    }

    public long cutely() {
        return this.f27099polloi;
    }

    public final boolean dovishness(decarock.stratoscope stratoscopeVar, byte[] bArr, int i) {
        if (stratoscopeVar.attabal() < i) {
            return false;
        }
        stratoscopeVar.formularize(bArr, 0, i);
        return true;
    }

    public final void graveside() {
        this.f27101taiyuan = 2;
        this.f27088cutely = f27081gintrap.length;
        this.f27097molybdenite = 0;
        this.f27089dern.mathsort(0);
    }

    @RequiresNonNull({AgentOptions.OUTPUT})
    public final void impassible() throws ParserException {
        this.f27100saneness.arytenoidectomy(0);
        if (this.f27098monoploid) {
            this.f27100saneness.polloi(10);
        } else {
            int i = 2;
            int iImpromptu = this.f27100saneness.impromptu(2) + 1;
            if (iImpromptu != 2) {
                decarock.triweekly.impromptu("AdtsReader", "Detected audio object type: " + iImpromptu + ", but assuming AAC LC.");
            } else {
                i = iImpromptu;
            }
            this.f27100saneness.polloi(5);
            byte[] bArrAttabal = cybernatic.attabal.attabal(i, this.f27095kowloon, this.f27100saneness.impromptu(3));
            cybernatic.attabal.saneness sanenessVarMarial = cybernatic.attabal.marial(bArrAttabal);
            androidx.media3.common.polloi polloiVarPolder = new androidx.media3.common.polloi.saneness().cultivated(this.f27086beachfront).sensatory(MimeTypes.AUDIO_AAC).privatdozent(sanenessVarMarial.f24604dern).saran(sanenessVarMarial.f24605saneness).underbelly(sanenessVarMarial.f24603attabal).premeiotic(Collections.singletonList(bArrAttabal)).treadless(this.f27103wireman).coi(this.f27096marial).polder();
            this.f27099polloi = 1024000000 / ((long) polloiVarPolder.f11219trm);
            this.f27087competently.dern(polloiVarPolder);
            this.f27098monoploid = true;
        }
        this.f27100saneness.polloi(4);
        int iImpromptu2 = this.f27100saneness.impromptu(13);
        int i2 = iImpromptu2 - 7;
        if (this.f27091formularize) {
            i2 = iImpromptu2 - 9;
        }
        adultoid(this.f27087competently, this.f27099polloi, 0, i2);
    }

    @RequiresNonNull({"currentOutput"})
    public final void kowloon(decarock.stratoscope stratoscopeVar) {
        int iMin = Math.min(stratoscopeVar.attabal(), this.f27097molybdenite - this.f27088cutely);
        this.f27082adultoid.saneness(stratoscopeVar, iMin);
        int i = this.f27088cutely + iMin;
        this.f27088cutely = i;
        if (i == this.f27097molybdenite) {
            decarock.attabal.competently(this.f27092graveside != C.TIME_UNSET);
            this.f27082adultoid.wireman(this.f27092graveside, 1, this.f27097molybdenite, 0, null);
            this.f27092graveside += this.f27090dovishness;
            polloi();
        }
    }

    @EnsuresNonNull({AgentOptions.OUTPUT, "currentOutput", "id3Output"})
    public final void marial() {
        decarock.attabal.marial(this.f27087competently);
        decarock.grimness.impromptu(this.f27082adultoid);
        decarock.grimness.impromptu(this.f27094impromptu);
    }

    public final void molybdenite() {
        this.f27101taiyuan = 3;
        this.f27088cutely = 0;
    }

    public final void monoploid() {
        this.f27101taiyuan = 1;
        this.f27088cutely = 0;
    }

    public final void polloi() {
        this.f27101taiyuan = 0;
        this.f27088cutely = 0;
        this.f27083apical = 256;
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        this.f27086beachfront = wiremanVar.saneness();
        privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 1);
        this.f27087competently = privatdozentVarTrack;
        this.f27082adultoid = privatdozentVarTrack;
        if (!this.f27085attabal) {
            this.f27094impromptu = new cybernatic.impassible();
            return;
        }
        wiremanVar.attabal();
        privatdozent privatdozentVarTrack2 = polloiVar.track(wiremanVar.dern(), 5);
        this.f27094impromptu = privatdozentVarTrack2;
        privatdozentVarTrack2.dern(new androidx.media3.common.polloi.saneness().cultivated(wiremanVar.saneness()).sensatory(MimeTypes.APPLICATION_ID3).polder());
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f27092graveside = C.TIME_UNSET;
        arytenoidectomy();
    }

    public final void taiyuan(decarock.stratoscope stratoscopeVar) {
        byte[] bArrMarial = stratoscopeVar.marial();
        int iBeachfront = stratoscopeVar.beachfront();
        int iCompetently = stratoscopeVar.competently();
        while (iBeachfront < iCompetently) {
            int i = iBeachfront + 1;
            byte b = bArrMarial[iBeachfront];
            int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.f27083apical == 512 && apical((byte) -1, (byte) i2) && (this.f27093impassible || competently(stratoscopeVar, iBeachfront - 1))) {
                this.f27084arytenoidectomy = (b & 8) >> 3;
                this.f27091formularize = (b & 1) == 0;
                if (this.f27093impassible) {
                    molybdenite();
                } else {
                    monoploid();
                }
                stratoscopeVar.mathsort(i);
                return;
            }
            int i3 = this.f27083apical;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.f27083apical = 768;
            } else if (i4 == 511) {
                this.f27083apical = 512;
            } else if (i4 == 836) {
                this.f27083apical = 1024;
            } else if (i4 == 1075) {
                graveside();
                stratoscopeVar.mathsort(i);
                return;
            } else if (i3 != 256) {
                this.f27083apical = 256;
            }
            iBeachfront = i;
        }
        stratoscopeVar.mathsort(iBeachfront);
    }

    @RequiresNonNull({"id3Output"})
    public final void triweekly() {
        this.f27094impromptu.saneness(this.f27089dern, 10);
        this.f27089dern.mathsort(6);
        adultoid(this.f27094impromptu, 0L, 10, this.f27089dern.kattegat() + 10);
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        this.f27092graveside = j;
    }

    public taiyuan(boolean z, String str, int i) {
        this.f27100saneness = new decarock.cuirassed(new byte[7]);
        this.f27089dern = new decarock.stratoscope(Arrays.copyOf(f27081gintrap, 10));
        polloi();
        this.f27102triweekly = -1;
        this.f27095kowloon = -1;
        this.f27099polloi = C.TIME_UNSET;
        this.f27092graveside = C.TIME_UNSET;
        this.f27085attabal = z;
        this.f27103wireman = str;
        this.f27096marial = i;
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
    }
}

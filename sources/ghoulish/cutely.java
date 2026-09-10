package ghoulish;

import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely implements polder.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f26859attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<androidx.media3.common.polloi> f26860saneness;

    public cutely(int i) {
        this(i, ImmutableList.of());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    @Override // ghoulish.polder.dern
    public polder attabal(int i, polder.saneness sanenessVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new preprohormone(new graveside(sanenessVar.f27038saneness, sanenessVar.attabal()));
            }
            if (i == 21) {
                return new preprohormone(new polloi());
            }
            if (i == 27) {
                if (marial(4)) {
                    return null;
                }
                return new preprohormone(new arytenoidectomy(saneness(sanenessVar), marial(1), marial(8)));
            }
            if (i == 36) {
                return new preprohormone(new monoploid(saneness(sanenessVar)));
            }
            if (i == 45) {
                return new preprohormone(new adultoid());
            }
            if (i == 89) {
                return new preprohormone(new formularize(sanenessVar.f27039wireman));
            }
            if (i == 172) {
                return new preprohormone(new beachfront(sanenessVar.f27038saneness, sanenessVar.attabal()));
            }
            if (i == 257) {
                return new yemenite(new rotuma("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new preprohormone(new apical(sanenessVar.f27038saneness, sanenessVar.attabal(), 5408));
                }
                switch (i) {
                    case 15:
                        if (marial(2)) {
                            return null;
                        }
                        return new preprohormone(new taiyuan(false, sanenessVar.f27038saneness, sanenessVar.attabal()));
                    case 16:
                        return new preprohormone(new kowloon(dern(sanenessVar)));
                    case 17:
                        if (marial(2)) {
                            return null;
                        }
                        return new preprohormone(new molybdenite(sanenessVar.f27038saneness, sanenessVar.attabal()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new preprohormone(new dern(sanenessVar.f27038saneness, sanenessVar.attabal()));
                            case 130:
                                if (!marial(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (marial(16)) {
                                            return null;
                                        }
                                        return new yemenite(new rotuma(MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        return new preprohormone(new dern(sanenessVar.f27038saneness, sanenessVar.attabal()));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new preprohormone(new apical(sanenessVar.f27038saneness, sanenessVar.attabal(), 4096));
        }
        return new preprohormone(new triweekly(dern(sanenessVar)));
    }

    @Override // ghoulish.polder.dern
    public SparseArray<polder> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    public final grimness dern(polder.saneness sanenessVar) {
        return new grimness(wireman(sanenessVar));
    }

    public final boolean marial(int i) {
        return (i & this.f26859attabal) != 0;
    }

    public final sealless saneness(polder.saneness sanenessVar) {
        return new sealless(wireman(sanenessVar));
    }

    public final List<androidx.media3.common.polloi> wireman(polder.saneness sanenessVar) {
        String str;
        int i;
        if (marial(32)) {
            return this.f26860saneness;
        }
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(sanenessVar.f27037marial);
        List<androidx.media3.common.polloi> arrayList = this.f26860saneness;
        while (stratoscopeVar.attabal() > 0) {
            int iSupplicat = stratoscopeVar.supplicat();
            int iBeachfront = stratoscopeVar.beachfront() + stratoscopeVar.supplicat();
            if (iSupplicat == 134) {
                arrayList = new ArrayList<>();
                int iSupplicat2 = stratoscopeVar.supplicat() & 31;
                for (int i2 = 0; i2 < iSupplicat2; i2++) {
                    String strYemenite = stratoscopeVar.yemenite(3);
                    int iSupplicat3 = stratoscopeVar.supplicat();
                    boolean z = (iSupplicat3 & 128) != 0;
                    if (z) {
                        i = iSupplicat3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bSupplicat = (byte) stratoscopeVar.supplicat();
                    stratoscopeVar.splinterproof(1);
                    arrayList.add(new androidx.media3.common.polloi.saneness().sensatory(str).treadless(strYemenite).seminary(i).premeiotic(z ? decarock.marial.saneness((bSupplicat & RemoteControlWriter.BLOCK_CMDDUMP) != 0) : null).polder());
                }
            }
            stratoscopeVar.mathsort(iBeachfront);
        }
        return arrayList;
    }

    public cutely(int i, List<androidx.media3.common.polloi> list) {
        this.f26859attabal = i;
        this.f26860saneness = list;
    }
}

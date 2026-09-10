package estragon;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import decarock.stratoscope;
import java.util.ArrayList;
import strother.polloi;

/* JADX INFO: compiled from: WebvttParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f25948attabal = new stratoscope();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f25949saneness = new saneness();

    public static void marial(stratoscope stratoscopeVar) {
        while (!TextUtils.isEmpty(stratoscopeVar.molybdenite())) {
        }
    }

    public static int wireman(stratoscope stratoscopeVar) {
        int i = -1;
        int iBeachfront = 0;
        while (i == -1) {
            iBeachfront = stratoscopeVar.beachfront();
            String strMolybdenite = stratoscopeVar.molybdenite();
            if (strMolybdenite == null) {
                i = 0;
            } else if ("STYLE".equals(strMolybdenite)) {
                i = 2;
            } else {
                i = strMolybdenite.startsWith("NOTE") ? 1 : 3;
            }
        }
        stratoscopeVar.mathsort(iBeachfront);
        return i;
    }

    @Override // strother.polloi
    public int dern() {
        return 1;
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, decarock.impromptu<strother.marial> impromptuVar) {
        wireman wiremanVarImpassible;
        this.f25948attabal.walach(bArr, i2 + i);
        this.f25948attabal.mathsort(i);
        ArrayList arrayList = new ArrayList();
        try {
            impromptu.wireman(this.f25948attabal);
            while (!TextUtils.isEmpty(this.f25948attabal.molybdenite())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iWireman = wireman(this.f25948attabal);
                if (iWireman == 0) {
                    strother.taiyuan.dern(new cutely(arrayList2), sanenessVar, impromptuVar);
                    return;
                }
                if (iWireman == 1) {
                    marial(this.f25948attabal);
                } else if (iWireman == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f25948attabal.molybdenite();
                    arrayList.addAll(this.f25949saneness.wireman(this.f25948attabal));
                } else if (iWireman == 3 && (wiremanVarImpassible = marial.impassible(this.f25948attabal, arrayList)) != null) {
                    arrayList2.add(wiremanVarImpassible);
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

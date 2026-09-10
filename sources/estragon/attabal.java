package estragon;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import decarock.stratoscope;
import java.util.ArrayList;
import java.util.Collections;
import strother.polloi;

/* JADX INFO: compiled from: Mp4WebvttParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f25947attabal = new stratoscope();

    public static libya.attabal wireman(stratoscope stratoscopeVar, int i) {
        CharSequence charSequenceMonoploid = null;
        libya.attabal.saneness sanenessVarKowloon = null;
        while (i > 0) {
            decarock.attabal.saneness(i >= 8, "Incomplete vtt cue box header found.");
            int iMonoploid = stratoscopeVar.monoploid();
            int iMonoploid2 = stratoscopeVar.monoploid();
            int i2 = iMonoploid - 8;
            String strSupplicat = grimness.supplicat(stratoscopeVar.marial(), stratoscopeVar.beachfront(), i2);
            stratoscopeVar.splinterproof(i2);
            i = (i - 8) - i2;
            if (iMonoploid2 == 1937011815) {
                sanenessVarKowloon = marial.kowloon(strSupplicat);
            } else if (iMonoploid2 == 1885436268) {
                charSequenceMonoploid = marial.monoploid(null, strSupplicat.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceMonoploid == null) {
            charSequenceMonoploid = "";
        }
        return sanenessVarKowloon != null ? sanenessVarKowloon.kowloon(charSequenceMonoploid).attabal() : marial.formularize(charSequenceMonoploid);
    }

    @Override // strother.polloi
    public int dern() {
        return 2;
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, decarock.impromptu<strother.marial> impromptuVar) {
        this.f25947attabal.walach(bArr, i2 + i);
        this.f25947attabal.mathsort(i);
        ArrayList arrayList = new ArrayList();
        while (this.f25947attabal.attabal() > 0) {
            decarock.attabal.saneness(this.f25947attabal.attabal() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iMonoploid = this.f25947attabal.monoploid();
            if (this.f25947attabal.monoploid() == 1987343459) {
                arrayList.add(wireman(this.f25947attabal, iMonoploid - 8));
            } else {
                this.f25947attabal.splinterproof(iMonoploid - 8);
            }
        }
        impromptuVar.accept(new strother.marial(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}

package cybernatic;

import androidx.media3.common.Metadata;
import java.io.EOFException;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.stratoscope f24720attabal = new decarock.stratoscope(10);

    public Metadata attabal(monoploid monoploidVar, imparkation.saneness.attabal attabalVar) throws Throwable {
        Metadata metadataMarial = null;
        int i = 0;
        while (true) {
            try {
                monoploidVar.peekFully(this.f24720attabal.marial(), 0, 10);
                this.f24720attabal.mathsort(0);
                if (this.f24720attabal.polder() != 4801587) {
                    break;
                }
                this.f24720attabal.splinterproof(3);
                int iKattegat = this.f24720attabal.kattegat();
                int i2 = iKattegat + 10;
                if (metadataMarial == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f24720attabal.marial(), 0, bArr, 0, 10);
                    monoploidVar.peekFully(bArr, 10, iKattegat);
                    metadataMarial = new imparkation.saneness(attabalVar).marial(bArr, i2);
                } else {
                    monoploidVar.advancePeekPosition(iKattegat);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        monoploidVar.resetPeekPosition();
        monoploidVar.advancePeekPosition(i);
        return metadataMarial;
    }
}

package cybernatic;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AvcConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final float f24809apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<byte[]> f24810attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f24811beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f24812competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int f24813cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24814dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final String f24815formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f24816impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f24817marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24818saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f24819taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f24820wireman;

    public wireman(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f24810attabal = list;
        this.f24818saneness = i;
        this.f24814dern = i2;
        this.f24820wireman = i3;
        this.f24817marial = i4;
        this.f24811beachfront = i5;
        this.f24812competently = i6;
        this.f24816impromptu = i7;
        this.f24819taiyuan = i8;
        this.f24813cutely = i9;
        this.f24809apical = f;
        this.f24815formularize = str;
    }

    public static byte[] attabal(decarock.stratoscope stratoscopeVar) {
        int iSaran = stratoscopeVar.saran();
        int iBeachfront = stratoscopeVar.beachfront();
        stratoscopeVar.splinterproof(iSaran);
        return decarock.marial.wireman(stratoscopeVar.marial(), iBeachfront, iSaran);
    }

    public static wireman saneness(decarock.stratoscope stratoscopeVar) throws ParserException {
        String strAttabal;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            stratoscopeVar.splinterproof(4);
            int iSupplicat = (stratoscopeVar.supplicat() & 3) + 1;
            if (iSupplicat == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iSupplicat2 = stratoscopeVar.supplicat() & 31;
            for (int i9 = 0; i9 < iSupplicat2; i9++) {
                arrayList.add(attabal(stratoscopeVar));
            }
            int iSupplicat3 = stratoscopeVar.supplicat();
            for (int i10 = 0; i10 < iSupplicat3; i10++) {
                arrayList.add(attabal(stratoscopeVar));
            }
            if (iSupplicat2 > 0) {
                tailoring.attabal.dern dernVarFormularize = tailoring.attabal.formularize((byte[]) arrayList.get(0), iSupplicat, ((byte[]) arrayList.get(0)).length);
                int i11 = dernVarFormularize.f38572beachfront;
                int i12 = dernVarFormularize.f38573competently;
                int i13 = dernVarFormularize.f38586taiyuan + 8;
                int i14 = dernVarFormularize.f38574cutely + 8;
                int i15 = dernVarFormularize.f38583monoploid;
                int i16 = dernVarFormularize.f38584polloi;
                int i17 = dernVarFormularize.f38582molybdenite;
                int i18 = dernVarFormularize.f38577graveside;
                float f2 = dernVarFormularize.f38579impromptu;
                strAttabal = decarock.marial.attabal(dernVarFormularize.f38571attabal, dernVarFormularize.f38585saneness, dernVarFormularize.f38575dern);
                i5 = i17;
                i6 = i18;
                f = f2;
                i4 = i14;
                i7 = i15;
                i8 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                strAttabal = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new wireman(arrayList, iSupplicat, i, i2, i3, i4, i7, i8, i5, i6, f, strAttabal);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}

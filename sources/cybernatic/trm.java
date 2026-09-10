package cybernatic;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class trm {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final int f24797apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<byte[]> f24798attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f24799beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f24800competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final float f24801cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24802dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final String f24803formularize;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f24804impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f24805marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24806saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f24807taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f24808wireman;

    public trm(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, int i9, String str) {
        this.f24798attabal = list;
        this.f24806saneness = i;
        this.f24802dern = i2;
        this.f24808wireman = i3;
        this.f24805marial = i4;
        this.f24799beachfront = i5;
        this.f24800competently = i6;
        this.f24804impromptu = i7;
        this.f24807taiyuan = i8;
        this.f24801cutely = f;
        this.f24797apical = i9;
        this.f24803formularize = str;
    }

    public static trm attabal(decarock.stratoscope stratoscopeVar) throws ParserException {
        boolean z;
        try {
            stratoscopeVar.splinterproof(21);
            int iSupplicat = stratoscopeVar.supplicat() & 3;
            int iSupplicat2 = stratoscopeVar.supplicat();
            int iBeachfront = stratoscopeVar.beachfront();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                z = true;
                if (i2 >= iSupplicat2) {
                    break;
                }
                stratoscopeVar.splinterproof(1);
                int iSaran = stratoscopeVar.saran();
                for (int i4 = 0; i4 < iSaran; i4++) {
                    int iSaran2 = stratoscopeVar.saran();
                    i3 += iSaran2 + 4;
                    stratoscopeVar.splinterproof(iSaran2);
                }
                i2++;
            }
            stratoscopeVar.mathsort(iBeachfront);
            byte[] bArr = new byte[i3];
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            float f = 1.0f;
            String strDern = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 < iSupplicat2) {
                int iSupplicat3 = stratoscopeVar.supplicat() & 63;
                int iSaran3 = stratoscopeVar.saran();
                int i15 = i;
                while (i15 < iSaran3) {
                    int iSaran4 = stratoscopeVar.saran();
                    boolean z2 = z;
                    byte[] bArr2 = tailoring.attabal.f38548attabal;
                    int i16 = iSupplicat;
                    System.arraycopy(bArr2, i, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(stratoscopeVar.marial(), stratoscopeVar.beachfront(), bArr, length, iSaran4);
                    if (iSupplicat3 == 33 && i15 == 0) {
                        tailoring.attabal.C0805attabal c0805attabalImpromptu = tailoring.attabal.impromptu(bArr, length, length + iSaran4);
                        i5 = c0805attabalImpromptu.f38552apical;
                        i6 = c0805attabalImpromptu.f38559formularize;
                        i7 = c0805attabalImpromptu.f38555beachfront + 8;
                        i8 = c0805attabalImpromptu.f38556competently + 8;
                        int i17 = c0805attabalImpromptu.f38562kowloon;
                        int i18 = c0805attabalImpromptu.f38553arytenoidectomy;
                        int i19 = c0805attabalImpromptu.f38564monoploid;
                        float f2 = c0805attabalImpromptu.f38560impassible;
                        int i20 = c0805attabalImpromptu.f38567triweekly;
                        strDern = decarock.marial.dern(c0805attabalImpromptu.f38554attabal, c0805attabalImpromptu.f38565saneness, c0805attabalImpromptu.f38558dern, c0805attabalImpromptu.f38568wireman, c0805attabalImpromptu.f38561impromptu, c0805attabalImpromptu.f38566taiyuan);
                        f = f2;
                        i12 = i20;
                        i10 = i18;
                        i11 = i19;
                        i9 = i17;
                    }
                    i14 = length + iSaran4;
                    stratoscopeVar.splinterproof(iSaran4);
                    i15++;
                    z = z2;
                    iSupplicat = i16;
                    iSupplicat2 = iSupplicat2;
                    i = 0;
                }
                i13++;
                i = 0;
            }
            return new trm(i3 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iSupplicat + 1, i5, i6, i7, i8, i9, i10, i11, f, i12, strDern);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }
}

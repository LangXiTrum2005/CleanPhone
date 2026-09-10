package electropaint;

import android.graphics.Bitmap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import decarock.impromptu;
import decarock.stratoscope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import strother.marial;
import strother.polloi;

/* JADX INFO: compiled from: PgsParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements polloi {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Inflater f25604wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f25601attabal = new stratoscope();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final stratoscope f25603saneness = new stratoscope();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final C0595attabal f25602dern = new C0595attabal();

    /* JADX INFO: renamed from: electropaint.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsParser.java */
    public static final class C0595attabal {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f25606beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f25607competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f25608dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f25609impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f25610marial;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f25612taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f25613wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final stratoscope f25605attabal = new stratoscope();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int[] f25611saneness = new int[256];

        public final void beachfront(stratoscope stratoscopeVar, int i) {
            if (i < 19) {
                return;
            }
            this.f25613wireman = stratoscopeVar.saran();
            this.f25610marial = stratoscopeVar.saran();
            stratoscopeVar.splinterproof(11);
            this.f25606beachfront = stratoscopeVar.saran();
            this.f25607competently = stratoscopeVar.saran();
        }

        public final void competently(stratoscope stratoscopeVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            stratoscopeVar.splinterproof(2);
            Arrays.fill(this.f25611saneness, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iSupplicat = stratoscopeVar.supplicat();
                int iSupplicat2 = stratoscopeVar.supplicat();
                int iSupplicat3 = stratoscopeVar.supplicat();
                int iSupplicat4 = stratoscopeVar.supplicat();
                double d = iSupplicat2;
                double d2 = iSupplicat3 - 128;
                double d3 = iSupplicat4 - 128;
                this.f25611saneness[iSupplicat] = (grimness.kowloon((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (stratoscopeVar.supplicat() << 24) | (grimness.kowloon((int) ((1.402d * d2) + d), 0, 255) << 16) | grimness.kowloon((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f25608dern = true;
        }

        public void impromptu() {
            this.f25613wireman = 0;
            this.f25610marial = 0;
            this.f25606beachfront = 0;
            this.f25607competently = 0;
            this.f25609impromptu = 0;
            this.f25612taiyuan = 0;
            this.f25605attabal.starveling(0);
            this.f25608dern = false;
        }

        public final void marial(stratoscope stratoscopeVar, int i) {
            int iPolder;
            if (i < 4) {
                return;
            }
            stratoscopeVar.splinterproof(3);
            int i2 = i - 4;
            if ((stratoscopeVar.supplicat() & 128) != 0) {
                if (i2 < 7 || (iPolder = stratoscopeVar.polder()) < 4) {
                    return;
                }
                this.f25609impromptu = stratoscopeVar.saran();
                this.f25612taiyuan = stratoscopeVar.saran();
                this.f25605attabal.starveling(iPolder - 4);
                i2 = i - 11;
            }
            int iBeachfront = this.f25605attabal.beachfront();
            int iCompetently = this.f25605attabal.competently();
            if (iBeachfront >= iCompetently || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iCompetently - iBeachfront);
            stratoscopeVar.formularize(this.f25605attabal.marial(), iBeachfront, iMin);
            this.f25605attabal.mathsort(iBeachfront + iMin);
        }

        public libya.attabal wireman() {
            int iSupplicat;
            if (this.f25613wireman == 0 || this.f25610marial == 0 || this.f25609impromptu == 0 || this.f25612taiyuan == 0 || this.f25605attabal.competently() == 0 || this.f25605attabal.beachfront() != this.f25605attabal.competently() || !this.f25608dern) {
                return null;
            }
            this.f25605attabal.mathsort(0);
            int i = this.f25609impromptu * this.f25612taiyuan;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iSupplicat2 = this.f25605attabal.supplicat();
                if (iSupplicat2 != 0) {
                    iSupplicat = i2 + 1;
                    iArr[i2] = this.f25611saneness[iSupplicat2];
                } else {
                    int iSupplicat3 = this.f25605attabal.supplicat();
                    if (iSupplicat3 != 0) {
                        iSupplicat = ((iSupplicat3 & 64) == 0 ? iSupplicat3 & 63 : ((iSupplicat3 & 63) << 8) | this.f25605attabal.supplicat()) + i2;
                        Arrays.fill(iArr, i2, iSupplicat, (iSupplicat3 & 128) == 0 ? this.f25611saneness[0] : this.f25611saneness[this.f25605attabal.supplicat()]);
                    }
                }
                i2 = iSupplicat;
            }
            return new libya.attabal.saneness().beachfront(Bitmap.createBitmap(iArr, this.f25609impromptu, this.f25612taiyuan, Bitmap.Config.ARGB_8888)).apical(this.f25606beachfront / this.f25613wireman).formularize(0).impromptu(this.f25607competently / this.f25610marial, 0).taiyuan(0).triweekly(this.f25609impromptu / this.f25613wireman).competently(this.f25612taiyuan / this.f25610marial).attabal();
        }
    }

    public static libya.attabal marial(stratoscope stratoscopeVar, C0595attabal c0595attabal) {
        int iCompetently = stratoscopeVar.competently();
        int iSupplicat = stratoscopeVar.supplicat();
        int iSaran = stratoscopeVar.saran();
        int iBeachfront = stratoscopeVar.beachfront() + iSaran;
        libya.attabal attabalVarWireman = null;
        if (iBeachfront > iCompetently) {
            stratoscopeVar.mathsort(iCompetently);
            return null;
        }
        if (iSupplicat != 128) {
            switch (iSupplicat) {
                case 20:
                    c0595attabal.competently(stratoscopeVar, iSaran);
                    break;
                case 21:
                    c0595attabal.marial(stratoscopeVar, iSaran);
                    break;
                case 22:
                    c0595attabal.beachfront(stratoscopeVar, iSaran);
                    break;
            }
        } else {
            attabalVarWireman = c0595attabal.wireman();
            c0595attabal.impromptu();
        }
        stratoscopeVar.mathsort(iBeachfront);
        return attabalVarWireman;
    }

    @Override // strother.polloi
    public int dern() {
        return 2;
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, impromptu<marial> impromptuVar) {
        this.f25601attabal.walach(bArr, i2 + i);
        this.f25601attabal.mathsort(i);
        wireman(this.f25601attabal);
        this.f25602dern.impromptu();
        ArrayList arrayList = new ArrayList();
        while (this.f25601attabal.attabal() >= 3) {
            libya.attabal attabalVarMarial = marial(this.f25601attabal, this.f25602dern);
            if (attabalVarMarial != null) {
                arrayList.add(attabalVarMarial);
            }
        }
        impromptuVar.accept(new marial(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    public final void wireman(stratoscope stratoscopeVar) {
        if (stratoscopeVar.attabal() <= 0 || stratoscopeVar.cutely() != 120) {
            return;
        }
        if (this.f25604wireman == null) {
            this.f25604wireman = new Inflater();
        }
        if (grimness.wostteth(stratoscopeVar, this.f25603saneness, this.f25604wireman)) {
            stratoscopeVar.walach(this.f25603saneness.marial(), this.f25603saneness.competently());
        }
    }
}

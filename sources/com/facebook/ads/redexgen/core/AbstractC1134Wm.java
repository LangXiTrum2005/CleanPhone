package com.facebook.ads.redexgen.core;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1134Wm {
    public static String[] A0D = {"HPWZtVbIVIv7NhlMfvWdlwrxJOBQLxR2", "MS8KEcuae32mHEVehfVwjzPP0", "xqrEUnYldJ", "HVhmg0s9wfOjubG1QBqt6hLJaYNHLJYL", "cTs5g5yU", "9Ay3NwmMy3ee8V86z1LXEjjIQGOV3uMK", "EBUG7fhZvi9lZLIq15yTs9CMo8bC70Z2", "Rud80EK5Wird9k8ck86OnsA8WPgbc3aW"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public UL A06;
    public InterfaceC1086Uo A07;
    public InterfaceC1131Wj A08;
    public boolean A0A;
    public boolean A0B;
    public final C1129Wh A0C = new C1129Wh();
    public C1133Wl A09 = new C1133Wl();

    public abstract long A0E(C1576fq c1576fq);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean A0J(C1576fq c1576fq, long j, C1133Wl c1133Wl) throws IOException;

    @RequiresNonNull({"trackOutput"})
    private int A07(WJ wj) throws IOException {
        if (A0A(wj)) {
            this.A00 = this.A09.A00.A0G;
            if (!this.A0A) {
                InterfaceC1086Uo interfaceC1086Uo = this.A07;
                if (A0D[4].length() != 8) {
                    throw new RuntimeException();
                }
                String[] strArr = A0D;
                strArr[0] = "H5wmklMFKrXioLJK0CS0PEogE4piaaci";
                strArr[3] = "H6WlsKa28f5dkAYJGO00veFDHINWj6F5";
                interfaceC1086Uo.A6U(this.A09.A00);
                this.A0A = true;
            }
            if (this.A09.A01 != null) {
                this.A08 = this.A09.A01;
            } else {
                long jA8E = wj.A8E();
                String[] strArr2 = A0D;
                if (strArr2[0].charAt(0) != strArr2[3].charAt(0)) {
                    throw new RuntimeException();
                }
                A0D[6] = "wwLuaHgmxinwGFCpzHwkM6Ayi80IOa7r";
                if (jA8E == -1) {
                    this.A08 = new TS();
                } else {
                    C1130Wi c1130WiA01 = this.A0C.A01();
                    this.A08 = new TY(this, this.A04, wj.A8E(), c1130WiA01.A01 + c1130WiA01.A00, c1130WiA01.A05, (c1130WiA01.A04 & 4) != 0);
                }
            }
            this.A01 = 2;
            this.A0C.A04();
            return 0;
        }
        return -1;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int A08(WJ wj, C1081Ug c1081Ug) throws IOException {
        long position = this.A08.AGV(wj);
        if (position >= 0) {
            c1081Ug.A00 = position;
            return 1;
        }
        if (position < -1) {
            A0F(-(2 + position));
        }
        if (!this.A0B) {
            this.A06.AID((Uj) AbstractC1517es.A02(this.A08.A5P()));
            this.A0B = true;
        }
        if (this.A03 <= 0) {
            boolean zA05 = this.A0C.A05(wj);
            if (A0D[7].charAt(22) != 'A') {
                throw new RuntimeException();
            }
            A0D[2] = "R7alFcnaKg";
            if (!zA05) {
                this.A01 = 3;
                return -1;
            }
        }
        this.A03 = 0L;
        C1576fq c1576fqA02 = this.A0C.A02();
        long jA0E = A0E(c1576fqA02);
        if (jA0E >= 0 && this.A02 + jA0E >= this.A05) {
            long jA0C = A0C(this.A02);
            this.A07.AHx(c1576fqA02, c1576fqA02.A0A());
            this.A07.AI0(jA0C, 1, c1576fqA02.A0A(), 0, null);
            this.A05 = -1L;
        }
        this.A02 += jA0E;
        return 0;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void A09() {
        AbstractC1517es.A02(this.A07);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    private boolean A0A(WJ wj) throws IOException {
        while (this.A0C.A05(wj)) {
            this.A03 = wj.A8d() - this.A04;
            if (A0J(this.A0C.A02(), this.A04, this.A09)) {
                this.A04 = wj.A8d();
            } else {
                return true;
            }
        }
        this.A01 = 3;
        return false;
    }

    public final int A0B(WJ wj, C1081Ug c1081Ug) throws IOException {
        A09();
        switch (this.A01) {
            case 0:
                return A07(wj);
            case 1:
                wj.AJ9((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A08(wj, c1081Ug);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A0C(long j) {
        return (1000000 * j) / ((long) this.A00);
    }

    public final long A0D(long j) {
        return (((long) this.A00) * j) / 1000000;
    }

    public void A0F(long j) {
        this.A02 = j;
    }

    public final void A0G(long j, long j2) {
        this.A0C.A03();
        if (j == 0) {
            A0I(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = A0D(j2);
            ((InterfaceC1131Wj) AbstractC1600gE.A0f(this.A08)).AJH(this.A05);
            this.A01 = 2;
        }
    }

    public final void A0H(UL ul, InterfaceC1086Uo interfaceC1086Uo) {
        this.A06 = ul;
        this.A07 = interfaceC1086Uo;
        A0I(true);
    }

    public void A0I(boolean z) {
        if (z) {
            this.A09 = new C1133Wl();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        if (A0D[2].length() != 10) {
            throw new RuntimeException();
        }
        A0D[2] = "P5DwEntFdi";
        this.A05 = -1L;
        this.A02 = 0L;
    }
}

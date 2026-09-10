package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1678hV extends JK {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ C0665Dn A00;

    public C1678hV(C0665Dn c0665Dn) {
        this.A00 = c0665Dn;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        if (this.A00.A07 == null || this.A00.A07.A0D()) {
            this.A00.A09.A0V();
            if (!this.A00.A05.A07()) {
                this.A00.A05.A05();
            }
            InterfaceC0664Dm listener = (InterfaceC0664Dm) this.A00.A0B.get();
            if (listener != null) {
                listener.ADP();
            }
            C0665Dn c0665Dn = this.A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
            strArr2[3] = "nqXy6qNf0NylKakjBUJ";
            c0665Dn.A09.A0V();
            return;
        }
        this.A00.A09.A0T();
    }
}

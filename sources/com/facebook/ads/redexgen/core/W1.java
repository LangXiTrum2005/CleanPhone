package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class W1 extends AbstractC2244fo {
    public static String[] A01 = {"hExgTQdw1kv5p4SGmSicbF82985LCpum", "OSM8v", "iL8QA6bjiVhv7y8TzYON6pF30CxXc7Eu", "LpLF7ms2E8gIcrW5L7jBJg3HcpVfC8m9", "nyKyIbOxza05szDl5mK4c2SMRynlWefb", "BGGrZQbo3jXV4aVW1zlLDKwbTLCVQORY", "wI7v5HbNskmPwObzpny5FWr5GhKQDnFZ", "gz5SetHbJQqiE2gsx67H3auEs"};
    public final /* synthetic */ C1784Vz A00;

    public W1(C1784Vz c1784Vz) {
        this.A00 = c1784Vz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2244fo
    public final void A00() {
        if (this.A00.A07 == null) {
            return;
        }
        C1784Vz c1784Vz = this.A00;
        if (A01[4].charAt(24) != 'R') {
            throw new RuntimeException();
        }
        A01[0] = "oRBMgw8vkLwlbJMhgBKrYszA0eyE8H4t";
        c1784Vz.A07.A0X();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    @Override // com.facebook.ads.redexgen.core.AbstractC2244fo
    public final void A03() {
        if (this.A00.A07 != null) {
            if (!this.A00.A0E) {
                if (this.A00.A0D) {
                    this.A00.A0R(EnumC2187et.A02);
                } else {
                    C1784Vz c1784Vz = this.A00;
                    if (A01[4].charAt(24) != 'R') {
                        throw new RuntimeException();
                    }
                    A01[5] = "C0qKRDQoQScpUymuNxw7FdDIXXvcdKLa";
                    if (c1784Vz.A0T()) {
                        this.A00.A0R(EnumC2187et.A02);
                    }
                }
            }
            this.A00.A0D = false;
            this.A00.A0E = false;
        }
    }
}

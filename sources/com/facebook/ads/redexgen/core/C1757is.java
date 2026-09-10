package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1757is extends JK {
    public static String[] A01 = {"hExgTQdw1kv5p4SGmSicbF82985LCpum", "OSM8v", "iL8QA6bjiVhv7y8TzYON6pF30CxXc7Eu", "LpLF7ms2E8gIcrW5L7jBJg3HcpVfC8m9", "nyKyIbOxza05szDl5mK4c2SMRynlWefb", "BGGrZQbo3jXV4aVW1zlLDKwbTLCVQORY", "wI7v5HbNskmPwObzpny5FWr5GhKQDnFZ", "gz5SetHbJQqiE2gsx67H3auEs"};
    public final /* synthetic */ C1755iq A00;

    public C1757is(C1755iq c1755iq) {
        this.A00 = c1755iq;
    }

    @Override // com.facebook.ads.redexgen.core.JK
    public final void A00() {
        if (this.A00.A04 == null) {
            return;
        }
        C1755iq c1755iq = this.A00;
        if (A01[4].charAt(24) != 'R') {
            throw new RuntimeException();
        }
        A01[0] = "oRBMgw8vkLwlbJMhgBKrYszA0eyE8H4t";
        c1755iq.A04.A0Z();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    @Override // com.facebook.ads.redexgen.core.JK
    public final void A03() {
        if (this.A00.A04 != null) {
            if (!this.A00.A0B) {
                if (this.A00.A0A) {
                    this.A00.A0J(IP.A02);
                } else {
                    C1755iq c1755iq = this.A00;
                    if (A01[4].charAt(24) != 'R') {
                        throw new RuntimeException();
                    }
                    A01[5] = "C0qKRDQoQScpUymuNxw7FdDIXXvcdKLa";
                    if (c1755iq.A0K()) {
                        this.A00.A0J(IP.A02);
                    }
                }
            }
            this.A00.A0A = false;
            this.A00.A0B = false;
        }
    }
}

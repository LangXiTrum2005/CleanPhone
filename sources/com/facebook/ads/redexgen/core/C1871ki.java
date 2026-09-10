package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1871ki extends BL {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C1867ke A00;
    public final /* synthetic */ C0597Ag A01;

    public C1871ki(C1867ke c1867ke, C0597Ag c0597Ag) {
        this.A00 = c1867ke;
        this.A01 = c0597Ag;
    }

    @Override // com.facebook.ads.redexgen.core.BL
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            AdListener adListenerA06 = this.A00.A01.A06();
            C04936d c04936d = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            adListenerA06.onError(c04936d.A07(), C8.A00(this.A01));
        }
    }
}

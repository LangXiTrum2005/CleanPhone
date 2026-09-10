package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3268a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final List f;

    public JW(int i, String str, String str2, int i2, int i3, ArrayList arrayList) {
        this.f3268a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = arrayList;
    }

    public final String toString() {
        return "Extra{flag=" + this.f3268a + ", rawKey='" + this.b + "', key='" + this.c + "', from=" + this.d + ", to=" + this.e + ", urls=" + this.f + '}';
    }
}

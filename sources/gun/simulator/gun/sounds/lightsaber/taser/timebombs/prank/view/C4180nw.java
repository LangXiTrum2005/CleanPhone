package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4180nw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4767a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public C4180nw(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f4767a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + DM.d(str, c * 31, 31);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}

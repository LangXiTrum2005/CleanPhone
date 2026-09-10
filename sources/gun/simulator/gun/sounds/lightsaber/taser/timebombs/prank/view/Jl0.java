package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Jl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3281a;
    public String b;
    public Set c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public boolean q;

    public static int a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2321Bs extends CU {
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int h;
    public final String i;
    public final int j;
    public final C4619sw k;
    public final int l;
    public final C4570sO m;
    public final boolean n;

    static {
        int i = Ug0.f3833a;
        o = Integer.toString(1001, 36);
        p = Integer.toString(1002, 36);
        q = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        r = Integer.toString(1004, 36);
        s = Integer.toString(1005, 36);
        t = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
    }

    public C2321Bs(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public final C2321Bs a(C5186zO c5186zO) {
        String message = getMessage();
        int i = Ug0.f3833a;
        return new C2321Bs(message, getCause(), this.f2923a, this.h, this.i, this.j, this.k, this.l, c5186zO, this.b, this.n);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CU, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(o, this.h);
        bundle.putString(p, this.i);
        bundle.putInt(q, this.j);
        C4619sw c4619sw = this.k;
        if (c4619sw != null) {
            bundle.putBundle(r, c4619sw.d(false));
        }
        bundle.putInt(s, this.l);
        bundle.putBoolean(t, this.n);
        return bundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2321Bs(int i, Throwable th, int i2, String str, int i3, C4619sw c4619sw, int i4, boolean z) {
        String string;
        String str2;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    string = "Unexpected runtime error";
                } else {
                    string = "Remote error";
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" error, index=");
                sb.append(i3);
                sb.append(", format=");
                sb.append(c4619sw);
                sb.append(", format_supported=");
                int i5 = Ug0.f3833a;
                if (i4 == 0) {
                    str2 = "NO";
                } else if (i4 == 1) {
                    str2 = "NO_UNSUPPORTED_TYPE";
                } else if (i4 == 2) {
                    str2 = "NO_UNSUPPORTED_DRM";
                } else if (i4 == 3) {
                    str2 = "NO_EXCEEDS_CAPABILITIES";
                } else if (i4 == 4) {
                    str2 = "YES";
                } else {
                    throw new IllegalStateException();
                }
                sb.append(str2);
                string = sb.toString();
            }
        } else {
            string = "Source error";
        }
        this(TextUtils.isEmpty(null) ? string : DM.h(string, ": null"), th, i2, i, str, i3, c4619sw, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public C2321Bs(String str, Throwable th, int i, int i2, String str2, int i3, C4619sw c4619sw, int i4, C5186zO c5186zO, long j, boolean z) {
        super(str, th, i, j);
        FW.h(!z || i2 == 1);
        FW.h(th != null || i2 == 3);
        this.h = i2;
        this.i = str2;
        this.j = i3;
        this.k = c4619sw;
        this.l = i4;
        this.m = c5186zO;
        this.n = z;
    }
}

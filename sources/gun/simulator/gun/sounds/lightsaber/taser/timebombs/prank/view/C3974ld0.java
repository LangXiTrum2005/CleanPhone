package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ld0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3974ld0 implements InterfaceC2538Kb {
    public static final String f;
    public static final String g;
    public static final C2911Yl h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4655a;
    public final String b;
    public final int c;
    public final C4619sw[] d;
    public int e;

    static {
        int i = Ug0.f3833a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = new C2911Yl(11);
    }

    public C3974ld0(C4619sw... c4619swArr) {
        this("", c4619swArr);
    }

    public static void b(int i, String str, String str2, String str3) {
        StringBuilder sbR = DM.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbR.append(str3);
        sbR.append("' (track ");
        sbR.append(i);
        sbR.append(")");
        AbstractC4038mJ.d("", new IllegalStateException(sbR.toString()));
    }

    public final int a(C4619sw c4619sw) {
        int i = 0;
        while (true) {
            C4619sw[] c4619swArr = this.d;
            if (i >= c4619swArr.length) {
                return -1;
            }
            if (c4619sw == c4619swArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3974ld0.class != obj.getClass()) {
            return false;
        }
        C3974ld0 c3974ld0 = (C3974ld0) obj;
        return this.b.equals(c3974ld0.b) && Arrays.equals(this.d, c3974ld0.d);
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = DM.d(this.b, 527, 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        C4619sw[] c4619swArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c4619swArr.length);
        for (C4619sw c4619sw : c4619swArr) {
            arrayList.add(c4619sw.d(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public C3974ld0(String str, C4619sw... c4619swArr) {
        FW.h(c4619swArr.length > 0);
        this.b = str;
        this.d = c4619swArr;
        this.f4655a = c4619swArr.length;
        int i = AbstractC5011xP.i(c4619swArr[0].l);
        this.c = i == -1 ? AbstractC5011xP.i(c4619swArr[0].k) : i;
        String str2 = c4619swArr[0].c;
        str2 = (str2 == null || str2.equals(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) ? "" : str2;
        int i2 = c4619swArr[0].e | 16384;
        for (int i3 = 1; i3 < c4619swArr.length; i3++) {
            String str3 = c4619swArr[i3].c;
            if (!str2.equals((str3 == null || str3.equals(com.mbridge.msdk.playercommon.exoplayer2.C.LANGUAGE_UNDETERMINED)) ? "" : str3)) {
                b(i3, "languages", c4619swArr[0].c, c4619swArr[i3].c);
                return;
            } else {
                if (i2 != (c4619swArr[i3].e | 16384)) {
                    b(i3, "role flags", Integer.toBinaryString(c4619swArr[0].e), Integer.toBinaryString(c4619swArr[i3].e));
                    return;
                }
            }
        }
    }
}

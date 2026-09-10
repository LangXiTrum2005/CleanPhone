package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2972a90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4112a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public C2972a90(int i, int i2, int i3, int i4, int i5) {
        this.f4112a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public static C2972a90 a(String str) {
        FW.h(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strH0 = FW.h0(strArrSplit[i5].trim());
            strH0.getClass();
            switch (strH0) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new C2972a90(i, i2, i3, i4, strArrSplit.length);
    }
}

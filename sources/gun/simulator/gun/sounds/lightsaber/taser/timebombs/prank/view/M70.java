package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class M70 {
    public static final P70 h = new P70(20);
    public static final P70 i = new P70(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3394a;
    public int e;
    public int f;
    public int g;
    public final L70[] c = new L70[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public M70(int i2) {
        this.f3394a = i2;
    }

    public final void a(int i2, float f) {
        L70 l70;
        int i3 = this.d;
        ArrayList arrayList = this.b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        L70[] l70Arr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            l70 = l70Arr[i5];
        } else {
            l70 = new L70();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        l70.f3340a = i6;
        l70.b = i2;
        l70.c = f;
        arrayList.add(l70);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.f3394a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            L70 l71 = (L70) arrayList.get(0);
            int i10 = l71.b;
            if (i10 <= i9) {
                this.f -= i10;
                arrayList.remove(0);
                int i11 = this.g;
                if (i11 < 5) {
                    this.g = i11 + 1;
                    l70Arr[i11] = l71;
                }
            } else {
                l71.b = i10 - i9;
                this.f -= i9;
            }
        }
    }

    public final float b() {
        int i2 = this.d;
        ArrayList arrayList = this.b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            L70 l70 = (L70) arrayList.get(i4);
            i3 += l70.b;
            if (i3 >= f) {
                return l70.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((L70) DM.e(arrayList, 1)).c;
    }
}

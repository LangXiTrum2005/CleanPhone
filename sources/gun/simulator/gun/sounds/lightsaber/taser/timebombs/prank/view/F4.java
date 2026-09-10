package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F4 extends AbstractC3413f9 {
    public final /* synthetic */ int c;

    public /* synthetic */ F4(int i) {
        this.c = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O4
    public AbstractC5170z9 d() {
        int i = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new C2905Yf((List) obj);
            case 1:
                return new C4270oy((List) obj, 0);
            case 2:
                return new BD((List) obj);
            case 3:
                return new C4270oy((List) obj, 1);
            case 4:
                return new C4270oy((List) obj, 2);
            case 5:
                return new C3584h60((List) obj);
            default:
                return new Sb0((List) obj);
        }
    }

    public InterfaceC4226oV i() {
        switch (this.c) {
            case 0:
                return new V6(this);
            case 1:
                return new C4303pK(this);
            default:
                return new C4727u70(this);
        }
    }

    public F4(ArrayList arrayList) {
        this.c = 1;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C5090yG c5090yG = (C5090yG) arrayList.get(i2);
            C4182ny c4182ny = (C4182ny) c5090yG.b;
            C4182ny c4182ny2 = (C4182ny) c5090yG.c;
            if (c4182ny != null && c4182ny2 != null) {
                float[] fArr = c4182ny.f4768a;
                int length = fArr.length;
                float[] fArr2 = c4182ny2.f4768a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    c5090yG = new C5090yG(c4182ny.b(fArrCopyOfRange), c4182ny2.b(fArrCopyOfRange));
                }
            }
            arrayList.set(i2, c5090yG);
        }
        super(arrayList, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F4(List list, int i) {
        super(list, 0);
        this.c = i;
    }
}

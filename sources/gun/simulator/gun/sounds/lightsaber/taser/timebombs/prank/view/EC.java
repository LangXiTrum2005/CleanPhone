package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class EC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f3014a;
    public int b = 0;
    public DC c;

    public EC(int i) {
        this.f3014a = new Object[i * 2];
    }

    public final C4405qY a() {
        DC dc = this.c;
        if (dc != null) {
            throw dc.a();
        }
        C4405qY c4405qYG = C4405qY.g(this.b, this.f3014a, this);
        DC dc2 = this.c;
        if (dc2 == null) {
            return c4405qYG;
        }
        throw dc2.a();
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.f3014a;
        if (i > objArr.length) {
            this.f3014a = Arrays.copyOf(objArr, AbstractC2995aW.y(objArr.length, i));
        }
        FW.k(obj, obj2);
        Object[] objArr2 = this.f3014a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }
}

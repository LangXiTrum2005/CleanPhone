package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3563gt implements InterfaceC4583sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2443Gk f4436a = new C2443Gk(0);
    public final C4935wa0 b = new C4935wa0(1);
    public final ArrayDeque c = new ArrayDeque();
    public int d;
    public boolean e;

    public C3563gt() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new C3387et(this, 0));
        }
        this.d = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void a(C4935wa0 c4935wa0) {
        FW.s(!this.e);
        FW.s(this.d == 1);
        FW.h(this.b == c4935wa0);
        this.d = 2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final Object dequeueInputBuffer() {
        FW.s(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final Object dequeueOutputBuffer() {
        FW.s(!this.e);
        if (this.d == 2) {
            ArrayDeque arrayDeque = this.c;
            if (!arrayDeque.isEmpty()) {
                AbstractC5023xa0 abstractC5023xa0 = (AbstractC5023xa0) arrayDeque.removeFirst();
                C4935wa0 c4935wa0 = this.b;
                if (c4935wa0.c(4)) {
                    abstractC5023xa0.a(4);
                } else {
                    long j = c4935wa0.f;
                    ByteBuffer byteBuffer = c4935wa0.d;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    this.f4436a.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.umeng.analytics.pro.bc.aL);
                    parcelableArrayList.getClass();
                    abstractC5023xa0.f(c4935wa0.f, new C3475ft(j, FW.E(C2417Fk.J, parcelableArrayList)), 0L);
                }
                c4935wa0.e();
                this.d = 0;
                return abstractC5023xa0;
            }
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void flush() {
        FW.s(!this.e);
        this.b.e();
        this.d = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2574Ll
    public final void release() {
        this.e = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4583sa0
    public final void setPositionUs(long j) {
    }
}

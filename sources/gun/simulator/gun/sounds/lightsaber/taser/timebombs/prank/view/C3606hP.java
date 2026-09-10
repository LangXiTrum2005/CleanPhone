package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3606hP implements InterfaceC4395qO, InterfaceC4307pO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4395qO[] f4455a;
    public final IdentityHashMap b;
    public final C4710tz c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public InterfaceC4307pO f;
    public C4062md0 g;
    public InterfaceC4395qO[] h;
    public Wm0 i;

    public C3606hP(C4710tz c4710tz, long[] jArr, InterfaceC4395qO... interfaceC4395qOArr) {
        this.c = c4710tz;
        this.f4455a = interfaceC4395qOArr;
        c4710tz.getClass();
        this.i = C4710tz.i(new InterfaceC4985x40[0]);
        this.b = new IdentityHashMap();
        this.h = new InterfaceC4395qO[0];
        for (int i = 0; i < interfaceC4395qOArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f4455a[i] = new C3430fP(interfaceC4395qOArr[i], j);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long b(long j, P30 p30) {
        InterfaceC4395qO[] interfaceC4395qOArr = this.h;
        return (interfaceC4395qOArr.length > 0 ? interfaceC4395qOArr[0] : this.f4455a[0]).b(j, p30);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.continueLoading(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC4395qO) arrayList.get(i)).continueLoading(j);
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        return this.i.getBufferedPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        return this.i.getNextLoadPositionUs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final C4062md0 getTrackGroups() {
        C4062md0 c4062md0 = this.g;
        c4062md0.getClass();
        return c4062md0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.i.isLoading();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long k(InterfaceC3299dt[] interfaceC3299dtArr, boolean[] zArr, W20[] w20Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[interfaceC3299dtArr.length];
        int[] iArr2 = new int[interfaceC3299dtArr.length];
        int i = 0;
        while (true) {
            int length = interfaceC3299dtArr.length;
            identityHashMap = this.b;
            if (i >= length) {
                break;
            }
            W20 w20 = w20Arr[i];
            Integer num = w20 == null ? null : (Integer) identityHashMap.get(w20);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC3299dt interfaceC3299dt = interfaceC3299dtArr[i];
            if (interfaceC3299dt != null) {
                String str = interfaceC3299dt.getTrackGroup().b;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC3299dtArr.length;
        W20[] w20Arr2 = new W20[length2];
        W20[] w20Arr3 = new W20[interfaceC3299dtArr.length];
        InterfaceC3299dt[] interfaceC3299dtArr2 = new InterfaceC3299dt[interfaceC3299dtArr.length];
        InterfaceC4395qO[] interfaceC4395qOArr = this.f4455a;
        ArrayList arrayList = new ArrayList(interfaceC4395qOArr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC4395qOArr.length) {
            int i3 = 0;
            while (i3 < interfaceC3299dtArr.length) {
                w20Arr3[i3] = iArr[i3] == i2 ? w20Arr[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC3299dt interfaceC3299dt2 = interfaceC3299dtArr[i3];
                    interfaceC3299dt2.getClass();
                    C3974ld0 c3974ld0 = (C3974ld0) this.e.get(interfaceC3299dt2.getTrackGroup());
                    c3974ld0.getClass();
                    interfaceC3299dtArr2[i3] = new C3342eP(interfaceC3299dt2, c3974ld0);
                } else {
                    interfaceC3299dtArr2[i3] = null;
                }
                i3++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            InterfaceC4395qO[] interfaceC4395qOArr2 = interfaceC4395qOArr;
            InterfaceC3299dt[] interfaceC3299dtArr3 = interfaceC3299dtArr2;
            long jK = interfaceC4395qOArr[i2].k(interfaceC3299dtArr2, zArr, w20Arr3, zArr2, j2);
            if (i4 == 0) {
                j2 = jK;
            } else if (jK != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC3299dtArr.length; i5++) {
                if (iArr2[i5] == i4) {
                    W20 w21 = w20Arr3[i5];
                    w21.getClass();
                    w20Arr2[i5] = w20Arr3[i5];
                    identityHashMap.put(w21, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    FW.s(w20Arr3[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(interfaceC4395qOArr2[i4]);
            }
            i2 = i4 + 1;
            arrayList = arrayList2;
            interfaceC4395qOArr = interfaceC4395qOArr2;
            interfaceC3299dtArr2 = interfaceC3299dtArr3;
        }
        System.arraycopy(w20Arr2, 0, w20Arr, 0, length2);
        InterfaceC4395qO[] interfaceC4395qOArr3 = (InterfaceC4395qO[]) arrayList.toArray(new InterfaceC4395qO[0]);
        this.h = interfaceC4395qOArr3;
        this.c.getClass();
        this.i = C4710tz.i(interfaceC4395qOArr3);
        return j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void maybeThrowPrepareError() {
        for (InterfaceC4395qO interfaceC4395qO : this.f4455a) {
            interfaceC4395qO.maybeThrowPrepareError();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4897w40
    public final void o(InterfaceC4985x40 interfaceC4985x40) {
        InterfaceC4307pO interfaceC4307pO = this.f;
        interfaceC4307pO.getClass();
        interfaceC4307pO.o(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4307pO
    public final void p(InterfaceC4395qO interfaceC4395qO) {
        ArrayList arrayList = this.d;
        arrayList.remove(interfaceC4395qO);
        if (arrayList.isEmpty()) {
            InterfaceC4395qO[] interfaceC4395qOArr = this.f4455a;
            int i = 0;
            for (InterfaceC4395qO interfaceC4395qO2 : interfaceC4395qOArr) {
                i += interfaceC4395qO2.getTrackGroups().f4703a;
            }
            C3974ld0[] c3974ld0Arr = new C3974ld0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC4395qOArr.length; i3++) {
                C4062md0 trackGroups = interfaceC4395qOArr[i3].getTrackGroups();
                int i4 = trackGroups.f4703a;
                int i5 = 0;
                while (i5 < i4) {
                    C3974ld0 c3974ld0A = trackGroups.a(i5);
                    C3974ld0 c3974ld0 = new C3974ld0(i3 + ":" + c3974ld0A.b, c3974ld0A.d);
                    this.e.put(c3974ld0, c3974ld0A);
                    c3974ld0Arr[i2] = c3974ld0;
                    i5++;
                    i2++;
                }
            }
            this.g = new C4062md0(c3974ld0Arr);
            InterfaceC4307pO interfaceC4307pO = this.f;
            interfaceC4307pO.getClass();
            interfaceC4307pO.p(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void q(long j) {
        for (InterfaceC4395qO interfaceC4395qO : this.h) {
            interfaceC4395qO.q(j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final void r(InterfaceC4307pO interfaceC4307pO, long j) {
        this.f = interfaceC4307pO;
        ArrayList arrayList = this.d;
        InterfaceC4395qO[] interfaceC4395qOArr = this.f4455a;
        Collections.addAll(arrayList, interfaceC4395qOArr);
        for (InterfaceC4395qO interfaceC4395qO : interfaceC4395qOArr) {
            interfaceC4395qO.r(this, j);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long readDiscontinuity() {
        long j = -9223372036854775807L;
        for (InterfaceC4395qO interfaceC4395qO : this.h) {
            long discontinuity = interfaceC4395qO.readDiscontinuity();
            if (discontinuity == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && interfaceC4395qO.seekToUs(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                for (InterfaceC4395qO interfaceC4395qO2 : this.h) {
                    if (interfaceC4395qO2 == interfaceC4395qO) {
                        break;
                    }
                    if (interfaceC4395qO2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = discontinuity;
            } else if (discontinuity != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        this.i.reevaluateBuffer(j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4395qO
    public final long seekToUs(long j) {
        long jSeekToUs = this.h[0].seekToUs(j);
        int i = 1;
        while (true) {
            InterfaceC4395qO[] interfaceC4395qOArr = this.h;
            if (i >= interfaceC4395qOArr.length) {
                return jSeekToUs;
            }
            if (interfaceC4395qOArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }
}

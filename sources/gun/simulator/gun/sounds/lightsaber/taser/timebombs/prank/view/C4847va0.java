package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.va0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4847va0 implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4583sa0 f5138a;
    public final C2498In b = new C2498In(1);
    public final JT c = new JT();
    public final C4619sw d;
    public final ArrayList e;
    public final ArrayList f;
    public InterfaceC4353pt g;
    public InterfaceC4326pd0 h;
    public int i;
    public int j;
    public long k;

    public C4847va0(InterfaceC4583sa0 interfaceC4583sa0, C4619sw c4619sw) {
        this.f5138a = interfaceC4583sa0;
        C4531rw c4531rwA = c4619sw.a();
        c4531rwA.k = "text/x-exoplayer-cues";
        c4531rwA.h = c4619sw.l;
        this.d = new C4619sw(c4531rwA);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.j = 0;
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT, InterruptedIOException {
        int i = this.j;
        FW.s((i == 0 || i == 5) ? false : true);
        int i2 = this.j;
        JT jt = this.c;
        if (i2 == 1) {
            jt.B(interfaceC4265ot.getLength() != -1 ? AbstractC2995aW.r(interfaceC4265ot.getLength()) : 1024);
            this.i = 0;
            this.j = 2;
        }
        if (this.j == 2) {
            int length = jt.f3266a.length;
            int i3 = this.i;
            if (length == i3) {
                jt.b(i3 + 1024);
            }
            byte[] bArr = jt.f3266a;
            int i4 = this.i;
            int i5 = interfaceC4265ot.read(bArr, i4, bArr.length - i4);
            if (i5 != -1) {
                this.i += i5;
            }
            long length2 = interfaceC4265ot.getLength();
            if ((length2 != -1 && this.i == length2) || i5 == -1) {
                InterfaceC4583sa0 interfaceC4583sa0 = this.f5138a;
                try {
                    C4935wa0 c4935wa0 = (C4935wa0) interfaceC4583sa0.dequeueInputBuffer();
                    while (c4935wa0 == null) {
                        Thread.sleep(5L);
                        c4935wa0 = (C4935wa0) interfaceC4583sa0.dequeueInputBuffer();
                    }
                    c4935wa0.g(this.i);
                    c4935wa0.d.put(jt.f3266a, 0, this.i);
                    c4935wa0.d.limit(this.i);
                    interfaceC4583sa0.a(c4935wa0);
                    AbstractC5023xa0 abstractC5023xa0 = (AbstractC5023xa0) interfaceC4583sa0.dequeueOutputBuffer();
                    while (abstractC5023xa0 == null) {
                        Thread.sleep(5L);
                        abstractC5023xa0 = (AbstractC5023xa0) interfaceC4583sa0.dequeueOutputBuffer();
                    }
                    for (int i6 = 0; i6 < abstractC5023xa0.getEventTimeCount(); i6++) {
                        List cues = abstractC5023xa0.getCues(abstractC5023xa0.getEventTime(i6));
                        this.b.getClass();
                        byte[] bArrC = C2498In.c(cues);
                        this.e.add(Long.valueOf(abstractC5023xa0.getEventTime(i6)));
                        this.f.add(new JT(bArrC));
                    }
                    abstractC5023xa0.e();
                    c();
                    this.j = 4;
                } catch (C4671ta0 e) {
                    throw KT.a("SubtitleDecoder failed.", e);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        if (this.j == 3) {
            if (interfaceC4265ot.skip(interfaceC4265ot.getLength() != -1 ? AbstractC2995aW.r(interfaceC4265ot.getLength()) : 1024) == -1) {
                c();
                this.j = 4;
            }
        }
        return this.j == 4 ? -1 : 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return true;
    }

    public final void c() {
        FW.t(this.h);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        FW.s(size == arrayList2.size());
        long j = this.k;
        for (int iD = j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? 0 : Ug0.d(arrayList, Long.valueOf(j), true); iD < arrayList2.size(); iD++) {
            JT jt = (JT) arrayList2.get(iD);
            jt.E(0);
            int length = jt.f3266a.length;
            this.h.d(length, jt);
            this.h.a(((Long) arrayList.get(iD)).longValue(), 1, length, 0, null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        FW.s(this.j == 0);
        this.g = interfaceC4353pt;
        this.h = interfaceC4353pt.track(0, 3);
        this.g.endTracks();
        this.g.a(new C2976aD(new long[]{0}, new long[]{0}, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        this.h.e(this.d);
        this.j = 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.f5138a.release();
        this.j = 5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        int i = this.j;
        FW.s((i == 0 || i == 5) ? false : true);
        this.k = j2;
        if (this.j == 2) {
            this.j = 1;
        }
        if (this.j == 4) {
            this.j = 3;
        }
    }
}

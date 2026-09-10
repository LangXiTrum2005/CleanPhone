package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.VVE;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class FG implements com.bytedance.sdk.component.LD.Lxb.lk, InterfaceC3021al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3061a;
    public Object b;

    public /* synthetic */ FG(Object obj, long j) {
        this.b = obj;
        this.f3061a = j;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0238 A[Catch: all -> 0x023d, TryCatch #9 {all -> 0x023d, blocks: (B:82:0x021c, B:84:0x022d, B:86:0x0238, B:89:0x023f), top: B:111:0x021c }] */
    @Override // com.bytedance.sdk.component.LD.Lxb.lk
    public final void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IeN ieN) {
        InputStream inputStreamLk;
        RandomAccessFile randomAccessFile;
        int iLk;
        VVE vveLc;
        long jLxb;
        long j = this.f3061a;
        Closeable closeable = null;
        if (ieN != null) {
            try {
                boolean zZU = ieN.ZU();
                if (!zZU) {
                    Object obj = this.b;
                    MG.a((MG) obj, ((MG) obj).b, ieN.lk(), ieN.JXs());
                    MG.b((MG) this.b, null);
                    MG.b((MG) this.b, null);
                    MG.b((MG) this.b, null);
                    MG.b((MG) this.b, ieN);
                    ((MG) this.b).b.NXR();
                    ((MG) this.b).b.lk();
                    Po0.a(((MG) this.b).b);
                    return;
                }
                vveLc = ieN.lc();
                try {
                    vveLc = ieN.lc();
                    if (!zZU || vveLc == null) {
                        inputStreamLk = null;
                        jLxb = 0;
                    } else {
                        jLxb = this.f3061a + vveLc.Lxb();
                        inputStreamLk = vveLc.lk();
                    }
                    try {
                        if (inputStreamLk == null) {
                            Object obj2 = this.b;
                            MG.a((MG) obj2, ((MG) obj2).b, ieN.lk(), ieN.JXs());
                            MG.b((MG) this.b, null);
                            MG.b((MG) this.b, inputStreamLk);
                            MG.b((MG) this.b, vveLc);
                            MG.b((MG) this.b, ieN);
                            ((MG) this.b).b.NXR();
                            ((MG) this.b).b.lk();
                            Po0.a(((MG) this.b).b);
                            return;
                        }
                        randomAccessFile = new RandomAccessFile(((MG) this.b).d, "rw");
                        try {
                            byte[] bArr = new byte[8192];
                            long j2 = 0;
                            loop0: while (true) {
                                int i = 0;
                                do {
                                    int i2 = inputStreamLk.read(bArr, i, 8192 - i);
                                    if (i2 == -1) {
                                        if (((MG) this.b).b.nBu() && jLxb == ((MG) this.b).d.length()) {
                                            MG.e((MG) this.b);
                                        }
                                        Object obj3 = this.b;
                                        ((MG) obj3).d(((MG) obj3).b, ieN.lk());
                                        closeable = randomAccessFile;
                                        break loop0;
                                    }
                                    if (((MG) this.b).c) {
                                        Object obj4 = this.b;
                                        MG mg = (MG) obj4;
                                        Uo0 uo0 = ((MG) obj4).b;
                                        int iLk2 = ieN.lk();
                                        mg.getClass();
                                        synchronized (InterfaceC5182zK.class) {
                                            try {
                                                for (InterfaceC5182zK interfaceC5182zK : mg.f) {
                                                    if (interfaceC5182zK != null) {
                                                        interfaceC5182zK.LD(uo0, iLk2);
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        MG.b((MG) this.b, randomAccessFile);
                                        MG.b((MG) this.b, inputStreamLk);
                                        MG.b((MG) this.b, vveLc);
                                        MG.b((MG) this.b, ieN);
                                        ((MG) this.b).b.NXR();
                                        ((MG) this.b).b.lk();
                                        Po0.a(((MG) this.b).b);
                                        return;
                                    }
                                    i += i2;
                                    j2 += (long) i2;
                                    if (j2 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0) {
                                        break;
                                    }
                                } while (j2 != jLxb - this.f3061a);
                                int iIntValue = Long.valueOf(j).intValue();
                                ((MG) this.b).b.STP();
                                try {
                                    randomAccessFile.seek(iIntValue);
                                    try {
                                        randomAccessFile.write(bArr, 0, i);
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable unused2) {
                                }
                                j += (long) i;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = vveLc;
                            iLk = 601;
                            try {
                                MG mg2 = (MG) this.b;
                                mg2.getClass();
                                try {
                                    mg2.e.delete();
                                    mg2.d.delete();
                                } catch (Throwable unused3) {
                                }
                                Object obj5 = this.b;
                                MG mg3 = (MG) obj5;
                                Uo0 uo1 = ((MG) obj5).b;
                                if (ieN != null) {
                                    iLk = ieN.lk();
                                }
                                MG.a(mg3, uo1, iLk, th.getMessage());
                                return;
                            } finally {
                                MG.b((MG) this.b, randomAccessFile);
                                MG.b((MG) this.b, inputStreamLk);
                                MG.b((MG) this.b, closeable);
                                MG.b((MG) this.b, ieN);
                                ((MG) this.b).b.NXR();
                                ((MG) this.b).b.lk();
                                Po0.a(((MG) this.b).b);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamLk = null;
                    randomAccessFile = null;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamLk = null;
                randomAccessFile = null;
            }
        } else {
            try {
                Object obj6 = this.b;
                iLk = 601;
                try {
                    MG.a((MG) obj6, ((MG) obj6).b, 601, "Network link failed.");
                    vveLc = null;
                    inputStreamLk = null;
                } catch (Throwable th6) {
                    th = th6;
                    inputStreamLk = null;
                    randomAccessFile = null;
                    MG mg4 = (MG) this.b;
                    mg4.getClass();
                    mg4.e.delete();
                    mg4.d.delete();
                    Object obj7 = this.b;
                    MG mg5 = (MG) obj7;
                    Uo0 uo2 = ((MG) obj7).b;
                    if (ieN != null) {
                        iLk = ieN.lk();
                    }
                    MG.a(mg5, uo2, iLk, th.getMessage());
                    return;
                }
            } catch (Throwable th7) {
                th = th7;
                iLk = 601;
            }
        }
        MG.b((MG) this.b, closeable);
        MG.b((MG) this.b, inputStreamLk);
        MG.b((MG) this.b, vveLc);
        MG.b((MG) this.b, ieN);
        ((MG) this.b).b.NXR();
        ((MG) this.b).b.lk();
        Po0.a(((MG) this.b).b);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long c(long j, long j2) {
        return ((C2644Oe) this.b).d[(int) j];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long e(long j, long j2) {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long f(long j, long j2) {
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final C3614hX g(long j) {
        C2644Oe c2644Oe = (C2644Oe) this.b;
        int i = (int) j;
        return new C3614hX(null, c2644Oe.c[i], c2644Oe.b[i]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long getTimeUs(long j) {
        return ((C2644Oe) this.b).e[(int) j] - this.f3061a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long h(long j, long j2) {
        return Ug0.f(((C2644Oe) this.b).e, j + this.f3061a, true);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long m(long j) {
        return ((C2644Oe) this.b).f3511a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final boolean t() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long u() {
        return 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3021al
    public final long v(long j, long j2) {
        return ((C2644Oe) this.b).f3511a;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.lk
    public final void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IOException iOException) {
        Object obj = this.b;
        MG.a((MG) obj, ((MG) obj).b, 601, iOException.getMessage());
        Po0.a(((MG) this.b).b);
    }
}

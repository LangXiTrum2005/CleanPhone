package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4237od implements InterfaceC4495ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4797a;
    public final List b;

    public /* synthetic */ C4237od(List list, int i) {
        this.f4797a = i;
        this.b = list;
    }

    public InterfaceC4503re0 a(int i, BR br) {
        if (i != 2) {
            Object obj = br.b;
            if (i == 3 || i == 4) {
                return new C3785jU(new QP((String) obj));
            }
            if (i == 21) {
                return new C3785jU(new C2319Bq());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new C3785jU(new C2924Yy(new C3491g4(b(br)), c(1), c(8)));
            }
            if (i == 36) {
                return new C3785jU(new C3040az(new C3491g4(b(br))));
            }
            if (i == 89) {
                return new C3785jU(new C2319Bq((List) br.c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C3785jU(new C3395f0((String) obj));
                }
                if (i == 257) {
                    return new M30(new C4568sM("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new M30(new C4568sM(MimeTypes.APPLICATION_SCTE35));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (c(2)) {
                                return null;
                            }
                            return new C3785jU(new K3(false, (String) obj));
                        case 16:
                            return new C3785jU(new C2846Vy(new Fg0(b(br))));
                        case 17:
                            if (c(2)) {
                                return null;
                            }
                            return new C3785jU(new YG((String) obj));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!c(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new C3785jU(new C3130c0((String) obj));
            }
            return new C3785jU(new C4086mq((String) obj));
        }
        return new C3785jU(new C2768Sy(new Fg0(b(br))));
    }

    public List b(BR br) {
        String str;
        int i;
        boolean zC = c(32);
        List list = this.b;
        if (zC) {
            return list;
        }
        JT jt = new JT((byte[]) br.d);
        while (jt.a() > 0) {
            int iT = jt.t();
            int iT2 = jt.b + jt.t();
            if (iT == 134) {
                ArrayList arrayList = new ArrayList();
                int iT3 = jt.t() & 31;
                for (int i2 = 0; i2 < iT3; i2++) {
                    String strR = jt.r(3, AbstractC2333Ce.c);
                    int iT4 = jt.t();
                    boolean z = (iT4 & 128) != 0;
                    if (z) {
                        i = iT4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bT = (byte) jt.t();
                    jt.F(1);
                    List listSingletonList = z ? Collections.singletonList((bT & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C4531rw c4531rw = new C4531rw();
                    c4531rw.k = str;
                    c4531rw.c = strR;
                    c4531rw.C = i;
                    c4531rw.m = listSingletonList;
                    arrayList.add(new C4619sw(c4531rw));
                }
                list = arrayList;
            }
            jt.E(iT2);
        }
        return list;
    }

    public boolean c(int i) {
        return (i & this.f4797a) != 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public List getCues(long j) {
        int i = this.f4797a;
        List list = this.b;
        switch (i) {
            case 0:
                return j >= 0 ? list : Collections.emptyList();
            case 1:
            case 2:
                return list;
            default:
                return j >= 0 ? list : Collections.emptyList();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public long getEventTime(int i) {
        switch (this.f4797a) {
            case 0:
                FW.h(i == 0);
                return 0L;
            default:
                FW.h(i == 0);
            case 1:
            case 2:
                return 0L;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public int getEventTimeCount() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public int getNextEventTimeIndex(long j) {
        switch (this.f4797a) {
            case 0:
                return j < 0 ? 0 : -1;
            case 1:
            case 2:
                return -1;
            default:
                return j < 0 ? 0 : -1;
        }
    }

    public C4237od(ArrayList arrayList) {
        this.f4797a = 3;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public C4237od(int i, List list) {
        this.f4797a = i;
        this.b = list;
    }
}

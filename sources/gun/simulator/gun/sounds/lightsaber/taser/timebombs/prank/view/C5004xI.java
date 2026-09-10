package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5004xI implements InterfaceC4552s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AC f5216a;
    public final int b;

    public C5004xI(int i, C3965lY c3965lY) {
        this.b = i;
        this.f5216a = c3965lY;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C5004xI b(int i, JT jt) {
        String str;
        String str2;
        InterfaceC4552s8 c4816v8;
        int i2 = 4;
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = jt.c;
        int i4 = 0;
        int i5 = -2;
        int i6 = 0;
        while (jt.a() > 8) {
            int iH = jt.h();
            int iH2 = jt.b + jt.h();
            jt.D(iH2);
            if (iH != 1414744396) {
                G90 g90 = null;
                switch (iH) {
                    case 1718776947:
                        if (i5 == 2) {
                            jt.F(i2);
                            int iH3 = jt.h();
                            int iH4 = jt.h();
                            jt.F(i2);
                            switch (jt.h()) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC4038mJ.f();
                            } else {
                                C4531rw c4531rw = new C4531rw();
                                c4531rw.p = iH3;
                                c4531rw.q = iH4;
                                c4531rw.k = str2;
                                g90 = new G90(new C4619sw(c4531rw));
                            }
                        } else if (i5 == 1) {
                            int iM = jt.m();
                            if (iM == 1) {
                                str = MimeTypes.AUDIO_RAW;
                            } else if (iM == 85) {
                                str = MimeTypes.AUDIO_MPEG;
                            } else if (iM == 255) {
                                str = MimeTypes.AUDIO_AAC;
                            } else if (iM != 8192) {
                                str = iM != 8193 ? null : MimeTypes.AUDIO_DTS;
                            } else {
                                str = MimeTypes.AUDIO_AC3;
                            }
                            if (str == null) {
                                AbstractC4038mJ.f();
                            } else {
                                int iM2 = jt.m();
                                int iH5 = jt.h();
                                jt.F(6);
                                int iY = Ug0.y(jt.y());
                                int iM3 = jt.m();
                                byte[] bArr = new byte[iM3];
                                jt.d(bArr, i4, iM3);
                                C4531rw c4531rw2 = new C4531rw();
                                c4531rw2.k = str;
                                c4531rw2.x = iM2;
                                c4531rw2.y = iH5;
                                if (MimeTypes.AUDIO_RAW.equals(str) && iY != 0) {
                                    c4531rw2.z = iY;
                                }
                                if (MimeTypes.AUDIO_AAC.equals(str) && iM3 > 0) {
                                    c4531rw2.m = AC.p(bArr);
                                }
                                g90 = new G90(new C4619sw(c4531rw2));
                            }
                        } else {
                            Ug0.F(i5);
                            AbstractC4038mJ.f();
                        }
                        c4816v8 = g90;
                        break;
                    case 1751742049:
                        int iH6 = jt.h();
                        jt.F(8);
                        int iH7 = jt.h();
                        int iH8 = jt.h();
                        jt.F(i2);
                        jt.h();
                        jt.F(12);
                        c4816v8 = new C4816v8(iH6, iH7, iH8);
                        break;
                    case 1752331379:
                        int iH9 = jt.h();
                        jt.F(12);
                        jt.h();
                        int iH10 = jt.h();
                        int iH11 = jt.h();
                        jt.F(i2);
                        int iH12 = jt.h();
                        int iH13 = jt.h();
                        jt.F(8);
                        c4816v8 = new C4904w8(iH9, iH10, iH11, iH12, iH13);
                        break;
                    case 1852994675:
                        c4816v8 = new J90(jt.r(jt.a(), AbstractC2333Ce.c));
                        break;
                    default:
                        c4816v8 = g90;
                        break;
                }
            } else {
                c4816v8 = b(jt.h(), jt);
            }
            if (c4816v8 != null) {
                if (c4816v8.getType() == 1752331379) {
                    int i7 = ((C4904w8) c4816v8).f5170a;
                    if (i7 == 1935960438) {
                        i5 = 2;
                    } else if (i7 == 1935963489) {
                        i5 = 1;
                    } else if (i7 != 1937012852) {
                        Integer.toHexString(i7);
                        AbstractC4038mJ.f();
                        i5 = -1;
                    } else {
                        i5 = 3;
                    }
                }
                int i8 = i6 + 1;
                if (objArrCopyOf.length < i8) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i8));
                }
                objArrCopyOf[i6] = c4816v8;
                i6 = i8;
            }
            jt.E(iH2);
            jt.D(i3);
            i2 = 4;
            i4 = 0;
        }
        return new C5004xI(i, AC.h(i6, objArrCopyOf));
    }

    public final InterfaceC4552s8 a(Class cls) {
        C5086yC c5086yCListIterator = this.f5216a.listIterator(0);
        while (c5086yCListIterator.hasNext()) {
            InterfaceC4552s8 interfaceC4552s8 = (InterfaceC4552s8) c5086yCListIterator.next();
            if (interfaceC4552s8.getClass() == cls) {
                return interfaceC4552s8;
            }
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4552s8
    public final int getType() {
        return this.b;
    }
}

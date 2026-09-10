package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2443Gk implements InterfaceC4759ua0 {
    public final /* synthetic */ int b;

    public /* synthetic */ C2443Gk(int i) {
        this.b = i;
    }

    public static void b(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC3888ke0.h("index: ", i, ", size: ", i2));
        }
    }

    public static void c(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC3888ke0.h("index: ", i, ", size: ", i2));
        }
    }

    public static C4387qG e(Be0 be0) {
        return new C4387qG(EnumC4474rG.f4924a, be0);
    }

    public final float a(int i, int i2) {
        switch (this.b) {
            case 5:
                if (i2 <= 0 || i <= 0) {
                    return 0.0f;
                }
                float f = i / i2;
                if (f > 1.0f) {
                    return 1.0f;
                }
                return f;
            case 6:
            default:
                if (i2 <= 0 || i <= 0) {
                    return 0.0f;
                }
                float f2 = i / i2;
                if (f2 > 1.0f) {
                    return 1.0f;
                }
                return f2;
            case 7:
                if (i2 <= 0 || i <= 0) {
                    return 0.0f;
                }
                float f3 = i / i2;
                if (f3 > 1.0f) {
                    return 1.0f;
                }
                return f3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final InterfaceC4583sa0 d(C4619sw c4619sw) {
        String str = c4619sw.l;
        if (str != null) {
            byte b = -1;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        b = 0;
                    }
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        b = 1;
                    }
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        b = 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        b = 3;
                    }
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        b = 4;
                    }
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        b = 5;
                    }
                    break;
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        b = 6;
                    }
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        b = 7;
                    }
                    break;
                case 1566015601:
                    if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        b = 8;
                    }
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        b = 9;
                    }
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        b = 10;
                    }
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        b = 11;
                    }
                    break;
            }
            int i = c4619sw.D;
            List list = c4619sw.n;
            switch (b) {
                case 0:
                    return new C4701tq(list);
                case 1:
                    return new C3961lU();
                case 2:
                    return new C4701tq();
                case 3:
                    return new Ql0();
                case 4:
                    return new C5207ze0(list);
                case 5:
                    return new Z80(list);
                case 6:
                case 8:
                    return new C3623hd(str, i);
                case 7:
                    return new C3563gt();
                case 9:
                    return new C3885kd(i, list);
                case 10:
                    return new C3880ka0();
                case 11:
                    return new C4679te0();
            }
        }
        throw new IllegalArgumentException(AbstractC3888ke0.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean f(C4619sw c4619sw) {
        String str = c4619sw.l;
        return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2443Gk(int i, int i2) {
        this(11);
        this.b = i;
        switch (i) {
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
            case 15:
            default:
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}

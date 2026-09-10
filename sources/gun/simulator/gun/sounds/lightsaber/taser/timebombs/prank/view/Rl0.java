package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Rl0 implements InterfaceC4177nt {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3677a;
    public final Mc0 b;
    public InterfaceC4353pt d;
    public int f;
    public final JT c = new JT();
    public byte[] e = new byte[1024];

    public Rl0(String str, Mc0 mc0) {
        this.f3677a = str;
        this.b = mc0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        String strG;
        this.d.getClass();
        int length = (int) interfaceC4265ot.getLength();
        int i = this.f;
        byte[] bArr = this.e;
        if (i == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        int i3 = interfaceC4265ot.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f + i3;
            this.f = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        JT jt = new JT(this.e);
        Sl0.d(jt);
        String strG2 = jt.g(AbstractC2333Ce.c);
        long j = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strG2)) {
                while (true) {
                    String strG3 = jt.g(AbstractC2333Ce.c);
                    if (strG3 == null) {
                        break;
                    }
                    if (Sl0.f3734a.matcher(strG3).matches()) {
                        do {
                            strG = jt.g(AbstractC2333Ce.c);
                            if (strG == null) {
                                break;
                            }
                        } while (!strG.isEmpty());
                    } else {
                        Matcher matcher2 = Pl0.f3571a.matcher(strG3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    c(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = Sl0.c(strGroup);
                long jB = this.b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                InterfaceC4326pd0 interfaceC4326pd0C = c(jB - jC2);
                byte[] bArr3 = this.e;
                int i5 = this.f;
                JT jt2 = this.c;
                jt2.C(bArr3, i5);
                interfaceC4326pd0C.d(this.f, jt2);
                interfaceC4326pd0C.a(jB, 1, this.f, 0, null);
                return -1;
            }
            if (strG2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(strG2);
                if (!matcher3.find()) {
                    throw KT.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strG2), null);
                }
                Matcher matcher4 = h.matcher(strG2);
                if (!matcher4.find()) {
                    throw KT.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strG2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = Sl0.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strG2 = jt.g(AbstractC2333Ce.c);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
        c2938Zm.peekFully(this.e, 0, 6, false);
        byte[] bArr = this.e;
        JT jt = this.c;
        jt.C(bArr, 6);
        if (Sl0.a(jt)) {
            return true;
        }
        c2938Zm.peekFully(this.e, 6, 3, false);
        jt.C(this.e, 9);
        return Sl0.a(jt);
    }

    public final InterfaceC4326pd0 c(long j) {
        InterfaceC4326pd0 interfaceC4326pd0Track = this.d.track(0, 3);
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.TEXT_VTT;
        c4531rw.c = this.f3677a;
        c4531rw.o = j;
        interfaceC4326pd0Track.e(c4531rw.a());
        this.d.endTracks();
        return interfaceC4326pd0Track;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.d = interfaceC4353pt;
        interfaceC4353pt.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}

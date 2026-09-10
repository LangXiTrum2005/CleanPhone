package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3415fA implements InterfaceC4326pd0 {
    public static final C4619sw g;
    public static final C4619sw h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3386es f4358a = new C3386es();
    public final InterfaceC4326pd0 b;
    public final C4619sw c;
    public C4619sw d;
    public byte[] e;
    public int f;

    static {
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.APPLICATION_ID3;
        g = c4531rw.a();
        C4531rw c4531rw2 = new C4531rw();
        c4531rw2.k = MimeTypes.APPLICATION_EMSG;
        h = c4531rw2.a();
    }

    public C3415fA(InterfaceC4326pd0 interfaceC4326pd0, int i) {
        this.b = interfaceC4326pd0;
        if (i == 1) {
            this.c = g;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC3950lJ.p("Unknown metadataType: ", i));
            }
            this.c = h;
        }
        this.e = new byte[0];
        this.f = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void a(long j, int i, int i2, int i3, C4238od0 c4238od0) {
        this.d.getClass();
        int i4 = this.f - i3;
        JT jt = new JT(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.l;
        C4619sw c4619sw = this.c;
        if (!Ug0.a(str, c4619sw.l)) {
            if (!MimeTypes.APPLICATION_EMSG.equals(this.d.l)) {
                String str2 = this.d.l;
                AbstractC4038mJ.f();
                return;
            }
            this.f4358a.getClass();
            EventMessage eventMessageK0 = C3386es.k0(jt);
            C4619sw c4619swK = eventMessageK0.k();
            if (c4619swK == null || !Ug0.a(c4619sw.l, c4619swK.l)) {
                Objects.toString(eventMessageK0.k());
                AbstractC4038mJ.f();
                return;
            } else {
                byte[] bArrN = eventMessageK0.n();
                bArrN.getClass();
                jt = new JT(bArrN);
            }
        }
        int iA = jt.a();
        this.b.d(iA, jt);
        this.b.a(j, i, iA, i3, c4238od0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void b(int i, JT jt) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        jt.d(this.e, this.f, i);
        this.f += i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final int c(InterfaceC3813jl interfaceC3813jl, int i, boolean z) {
        return f(interfaceC3813jl, i, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final /* synthetic */ void d(int i, JT jt) {
        AbstractC3950lJ.a(this, jt, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void e(C4619sw c4619sw) {
        this.d = c4619sw;
        this.b.e(this.c);
    }

    public final int f(InterfaceC3813jl interfaceC3813jl, int i, boolean z) throws EOFException {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = interfaceC3813jl.read(this.e, this.f, i);
        if (i3 != -1) {
            this.f += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}

package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class TU implements InterfaceC4326pd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V20 f3772a;
    public final C3692iN b = new C3692iN(28);
    public final C4747uP c = new C4747uP(1);
    public long d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public final /* synthetic */ UU e;

    public TU(UU uu, C2833Vl c2833Vl) {
        this.e = uu;
        this.f3772a = new V20(c2833Vl, null, null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void a(long j, int i, int i2, int i3, C4238od0 c4238od0) {
        long jG;
        long jO;
        this.f3772a.a(j, i, i2, i3, c4238od0);
        while (this.f3772a.v(false)) {
            C4747uP c4747uP = this.c;
            c4747uP.e();
            if (this.f3772a.A(this.b, c4747uP, 0, false) == -4) {
                c4747uP.h();
            } else {
                c4747uP = null;
            }
            if (c4747uP != null) {
                long j2 = c4747uP.f;
                Metadata metadataY = this.e.c.y(c4747uP);
                if (metadataY != null) {
                    EventMessage eventMessage = (EventMessage) metadataY.e(0);
                    String str = eventMessage.schemeIdUri;
                    String str2 = eventMessage.value;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || ExifInterface.GPS_MEASUREMENT_3D.equals(str2))) {
                        try {
                            jO = Ug0.O(Ug0.o(eventMessage.messageData));
                        } catch (KT unused) {
                            jO = -9223372036854775807L;
                        }
                        if (jO != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            SU su = new SU(j2, jO);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, su));
                        }
                    }
                }
            }
        }
        V20 v20 = this.f3772a;
        R20 r20 = v20.f3856a;
        synchronized (v20) {
            int i4 = v20.s;
            jG = i4 == 0 ? -1L : v20.g(i4);
        }
        r20.b(jG);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void b(int i, JT jt) {
        V20 v20 = this.f3772a;
        v20.getClass();
        v20.b(i, jt);
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
        this.f3772a.e(c4619sw);
    }

    public final int f(InterfaceC3813jl interfaceC3813jl, int i, boolean z) {
        V20 v20 = this.f3772a;
        v20.getClass();
        return v20.E(interfaceC3813jl, i, z);
    }
}

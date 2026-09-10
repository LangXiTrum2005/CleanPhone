package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4481rN extends AbstractC5097yN implements InterfaceC4042mN {
    public final Context C0;
    public final C3491g4 D0;
    public final InterfaceC4726u7 E0;
    public int F0;
    public boolean G0;
    public C4619sw H0;
    public long I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public C2788Ts M0;

    public C4481rN(Context context, G7 g7, Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os, C2315Bm c2315Bm) {
        super(1, g7, 44100.0f);
        this.C0 = context.getApplicationContext();
        this.E0 = c2315Bm;
        this.D0 = new C3491g4(handler, surfaceHolderCallbackC2658Os);
        c2315Bm.r = new Wm0(this);
    }

    public static AC o0(InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw, boolean z, InterfaceC4726u7 interfaceC4726u7) {
        String str = c4619sw.l;
        if (str == null) {
            C5086yC c5086yC = AC.b;
            return C3965lY.e;
        }
        if (((C2315Bm) interfaceC4726u7).f(c4619sw) != 0) {
            List listE = GN.e(MimeTypes.AUDIO_RAW, false, false);
            C4745uN c4745uN = listE.isEmpty() ? null : (C4745uN) listE.get(0);
            if (c4745uN != null) {
                return AC.p(c4745uN);
            }
        }
        ((C2297Au) interfaceC5185zN).getClass();
        List listE2 = GN.e(str, z, false);
        String strB = GN.b(c4619sw);
        if (strB == null) {
            return AC.j(listE2);
        }
        List listE3 = GN.e(strB, z, false);
        C5086yC c5086yC2 = AC.b;
        C4998xC c4998xC = new C4998xC();
        c4998xC.I0(listE2);
        c4998xC.I0(listE3);
        return c4998xC.J0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final float H(float f, C4619sw[] c4619swArr) {
        int iMax = -1;
        for (C4619sw c4619sw : c4619swArr) {
            int i = c4619sw.z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final ArrayList I(InterfaceC5185zN interfaceC5185zN, C4619sw c4619sw, boolean z) {
        AC acO0 = o0(interfaceC5185zN, c4619sw, z, this.E0);
        Pattern pattern = GN.f3119a;
        ArrayList arrayList = new ArrayList(acO0);
        Collections.sort(arrayList, new BN(new AN(c4619sw)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C4130nN K(C4745uN c4745uN, C4619sw c4619sw, MediaCrypto mediaCrypto, float f) {
        boolean z;
        C4619sw[] c4619swArr = this.h;
        c4619swArr.getClass();
        int iN0 = n0(c4619sw, c4745uN);
        if (c4619swArr.length != 1) {
            for (C4619sw c4619sw2 : c4619swArr) {
                if (c4745uN.b(c4619sw, c4619sw2).d != 0) {
                    iN0 = Math.max(iN0, n0(c4619sw2, c4745uN));
                }
            }
        }
        this.F0 = iN0;
        int i = Ug0.f3833a;
        if (i < 24 && "OMX.SEC.aac.dec".equals(c4745uN.f5075a) && "samsung".equals(Ug0.c)) {
            String str = Ug0.b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.G0 = z;
        int i2 = this.F0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c4745uN.c);
        mediaFormat.setInteger("channel-count", c4619sw.y);
        int i3 = c4619sw.z;
        mediaFormat.setInteger("sample-rate", i3);
        FW.Y(mediaFormat, c4619sw.n);
        FW.N(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str2 = Ug0.d;
                    if (!"ZTE B2017G".equals(str2) && !"AXON 7 mini".equals(str2)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        String str3 = c4619sw.l;
        if (i <= 28 && "audio/ac4".equals(str3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            C4531rw c4531rw = new C4531rw();
            c4531rw.k = MimeTypes.AUDIO_RAW;
            c4531rw.x = c4619sw.y;
            c4531rw.y = i3;
            c4531rw.z = 4;
            if (((C2315Bm) this.E0).f(new C4619sw(c4531rw)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.H0 = (!MimeTypes.AUDIO_RAW.equals(c4745uN.b) || MimeTypes.AUDIO_RAW.equals(str3)) ? null : c4619sw;
        return new C4130nN(c4745uN, mediaFormat, c4619sw, null, mediaCrypto);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void P(Exception exc) {
        AbstractC4038mJ.d("Audio codec error", exc);
        C3491g4 c3491g4 = this.D0;
        Handler handler = (Handler) c3491g4.b;
        if (handler != null) {
            handler.post(new RunnableC3935l7(c3491g4, exc, 0));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void Q(String str, long j, long j2) {
        C3491g4 c3491g4 = this.D0;
        Handler handler = (Handler) c3491g4.b;
        if (handler != null) {
            handler.post(new RunnableC3847k7(c3491g4, str, j, j2, 0));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void R(String str) {
        C3491g4 c3491g4 = this.D0;
        Handler handler = (Handler) c3491g4.b;
        if (handler != null) {
            handler.post(new RunnableC3976le0(11, c3491g4, str));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C2729Rl S(C3692iN c3692iN) {
        C2729Rl c2729RlS = super.S(c3692iN);
        C4619sw c4619sw = (C4619sw) c3692iN.c;
        C3491g4 c3491g4 = this.D0;
        Handler handler = (Handler) c3491g4.b;
        if (handler != null) {
            handler.post(new RunnableC4746uO(c3491g4, c4619sw, c2729RlS, 2));
        }
        return c2729RlS;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void T(C4619sw c4619sw, MediaFormat mediaFormat) throws C2321Bs {
        int iY;
        int i;
        C4619sw c4619sw2 = this.H0;
        int[] iArr = null;
        if (c4619sw2 != null) {
            c4619sw = c4619sw2;
        } else if (this.G != null) {
            if (MimeTypes.AUDIO_RAW.equals(c4619sw.l)) {
                iY = c4619sw.A;
            } else if (Ug0.f3833a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iY = mediaFormat.containsKey("v-bits-per-sample") ? Ug0.y(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iY = mediaFormat.getInteger("pcm-encoding");
            }
            C4531rw c4531rw = new C4531rw();
            c4531rw.k = MimeTypes.AUDIO_RAW;
            c4531rw.z = iY;
            c4531rw.A = c4619sw.B;
            c4531rw.B = c4619sw.C;
            c4531rw.x = mediaFormat.getInteger("channel-count");
            c4531rw.y = mediaFormat.getInteger("sample-rate");
            C4619sw c4619sw3 = new C4619sw(c4531rw);
            if (this.G0 && c4619sw3.y == 6 && (i = c4619sw.y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
            c4619sw = c4619sw3;
        }
        try {
            ((C2315Bm) this.E0).b(c4619sw, iArr);
        } catch (C4375q7 e) {
            throw b(5001, e.f4870a, e, false);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void U() {
        this.E0.getClass();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void W() {
        ((C2315Bm) this.E0).G = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void X(C2677Pl c2677Pl) {
        if (!this.J0 || c2677Pl.c(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(c2677Pl.f - this.I0) > 500000) {
            this.I0 = c2677Pl.f;
        }
        this.J0 = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final boolean Z(long j, long j2, InterfaceC4306pN interfaceC4306pN, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C4619sw c4619sw) throws C2321Bs {
        byteBuffer.getClass();
        if (this.H0 != null && (i2 & 2) != 0) {
            interfaceC4306pN.getClass();
            interfaceC4306pN.j(i, false);
            return true;
        }
        InterfaceC4726u7 interfaceC4726u7 = this.E0;
        if (z) {
            if (interfaceC4306pN != null) {
                interfaceC4306pN.j(i, false);
            }
            this.x0.f += i3;
            ((C2315Bm) interfaceC4726u7).G = true;
            return true;
        }
        try {
            if (!((C2315Bm) interfaceC4726u7).j(byteBuffer, j3, i3)) {
                return false;
            }
            if (interfaceC4306pN != null) {
                interfaceC4306pN.j(i, false);
            }
            this.x0.e += i3;
            return true;
        } catch (C4462r7 e) {
            throw b(5001, e.c, e, e.b);
        } catch (C4638t7 e2) {
            throw b(5002, c4619sw, e2, e2.b);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final void a(EU eu) {
        C2315Bm c2315Bm = (C2315Bm) this.E0;
        c2315Bm.getClass();
        EU eu2 = new EU(Ug0.i(eu.f3024a, 0.1f, 8.0f), Ug0.i(eu.b, 0.1f, 8.0f));
        if (!c2315Bm.k || Ug0.f3833a < 23) {
            c2315Bm.r(eu2, c2315Bm.g().b);
        } else {
            c2315Bm.s(eu2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final void c0() throws C2321Bs {
        try {
            C2315Bm c2315Bm = (C2315Bm) this.E0;
            if (!c2315Bm.S && c2315Bm.m() && c2315Bm.c()) {
                c2315Bm.o();
                c2315Bm.S = true;
            }
        } catch (C4638t7 e) {
            throw b(5002, e.c, e, e.b);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final String e() {
        return "MediaCodecAudioRenderer";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean g() {
        if (this.t0) {
            C2315Bm c2315Bm = (C2315Bm) this.E0;
            if (!c2315Bm.m() || (c2315Bm.S && !c2315Bm.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final EU getPlaybackParameters() {
        C2315Bm c2315Bm = (C2315Bm) this.E0;
        return c2315Bm.k ? c2315Bm.y : c2315Bm.g().f5152a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4042mN
    public final long getPositionUs() {
        if (this.f == 2) {
            p0();
        }
        return this.I0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean h() {
        return ((C2315Bm) this.E0).k() || super.h();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YU
    public final void handleMessage(int i, Object obj) {
        InterfaceC4726u7 interfaceC4726u7 = this.E0;
        if (i == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            C2315Bm c2315Bm = (C2315Bm) interfaceC4726u7;
            if (c2315Bm.J != fFloatValue) {
                c2315Bm.J = fFloatValue;
                if (c2315Bm.m()) {
                    if (Ug0.f3833a >= 21) {
                        c2315Bm.u.setVolume(c2315Bm.J);
                        return;
                    }
                    AudioTrack audioTrack = c2315Bm.u;
                    float f = c2315Bm.J;
                    audioTrack.setStereoVolume(f, f);
                }
                return;
            }
            return;
        }
        if (i == 3) {
            Z6 z6 = (Z6) obj;
            C2315Bm c2315Bm2 = (C2315Bm) interfaceC4726u7;
            if (c2315Bm2.v.equals(z6)) {
                return;
            }
            c2315Bm2.v = z6;
            if (c2315Bm2.Z) {
                return;
            }
            c2315Bm2.d();
            return;
        }
        if (i == 6) {
            C4377q8 c4377q8 = (C4377q8) obj;
            C2315Bm c2315Bm3 = (C2315Bm) interfaceC4726u7;
            if (c2315Bm3.X.equals(c4377q8)) {
                return;
            }
            c4377q8.getClass();
            if (c2315Bm3.u != null) {
                c2315Bm3.X.getClass();
            }
            c2315Bm3.X = c4377q8;
            return;
        }
        switch (i) {
            case 9:
                C2315Bm c2315Bm4 = (C2315Bm) interfaceC4726u7;
                c2315Bm4.r(c2315Bm4.g().f5152a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                C2315Bm c2315Bm5 = (C2315Bm) interfaceC4726u7;
                if (c2315Bm5.W != iIntValue) {
                    c2315Bm5.W = iIntValue;
                    c2315Bm5.V = iIntValue != 0;
                    c2315Bm5.d();
                }
                break;
            case 11:
                this.M0 = (C2788Ts) obj;
                break;
            case 12:
                if (Ug0.f3833a >= 23) {
                    AbstractC4394qN.a(interfaceC4726u7, obj);
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void i() {
        C3491g4 c3491g4 = this.D0;
        this.L0 = true;
        try {
            ((C2315Bm) this.E0).d();
            try {
                super.i();
            } finally {
                c3491g4.u(this.x0);
            }
        } catch (Throwable th) {
            try {
                super.i();
                throw th;
            } finally {
                c3491g4.u(this.x0);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final boolean i0(C4619sw c4619sw) {
        return ((C2315Bm) this.E0).f(c4619sw) != 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void j(boolean z, boolean z2) {
        C2599Ml c2599Ml = new C2599Ml();
        this.x0 = c2599Ml;
        C3491g4 c3491g4 = this.D0;
        Handler handler = (Handler) c3491g4.b;
        byte b = 0;
        if (handler != null) {
            handler.post(new RunnableC4111n7(c3491g4, c2599Ml, b == true ? 1 : 0));
        }
        C5196zY c5196zY = this.c;
        c5196zY.getClass();
        boolean z3 = c5196zY.f5328a;
        InterfaceC4726u7 interfaceC4726u7 = this.E0;
        if (z3) {
            C2315Bm c2315Bm = (C2315Bm) interfaceC4726u7;
            c2315Bm.getClass();
            FW.s(Ug0.f3833a >= 21);
            FW.s(c2315Bm.V);
            if (!c2315Bm.Z) {
                c2315Bm.Z = true;
                c2315Bm.d();
            }
        } else {
            C2315Bm c2315Bm2 = (C2315Bm) interfaceC4726u7;
            if (c2315Bm2.Z) {
                c2315Bm2.Z = false;
                c2315Bm2.d();
            }
        }
        WU wu = this.e;
        wu.getClass();
        ((C2315Bm) interfaceC4726u7).q = wu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if ((r4.isEmpty() ? null : (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4745uN) r4.get(0)) != null) goto L30;
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j0(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5185zN r12, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4481rN.j0(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sw):int");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void k(long j, boolean z) {
        super.k(j, z);
        ((C2315Bm) this.E0).d();
        this.I0 = j;
        this.J0 = true;
        this.K0 = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void l() {
        InterfaceC4726u7 interfaceC4726u7 = this.E0;
        try {
            try {
                z();
                b0();
                InterfaceC2889Xp interfaceC2889Xp = this.A;
                if (interfaceC2889Xp != null) {
                    interfaceC2889Xp.b(null);
                }
                this.A = null;
                if (this.L0) {
                    this.L0 = false;
                    ((C2315Bm) interfaceC4726u7).q();
                }
            } catch (Throwable th) {
                InterfaceC2889Xp interfaceC2889Xp2 = this.A;
                if (interfaceC2889Xp2 != null) {
                    interfaceC2889Xp2.b(null);
                }
                this.A = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.L0) {
                this.L0 = false;
                ((C2315Bm) interfaceC4726u7).q();
            }
            throw th2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void m() {
        C2315Bm c2315Bm = (C2315Bm) this.E0;
        c2315Bm.U = true;
        if (c2315Bm.m()) {
            C4990x7 c4990x7 = c2315Bm.i.f;
            c4990x7.getClass();
            c4990x7.a();
            c2315Bm.u.play();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void n() {
        p0();
        C2315Bm c2315Bm = (C2315Bm) this.E0;
        c2315Bm.U = false;
        if (c2315Bm.m()) {
            C5078y7 c5078y7 = c2315Bm.i;
            c5078y7.c();
            if (c5078y7.y == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                C4990x7 c4990x7 = c5078y7.f;
                c4990x7.getClass();
                c4990x7.a();
                c2315Bm.u.pause();
            }
        }
    }

    public final int n0(C4619sw c4619sw, C4745uN c4745uN) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c4745uN.f5075a) || (i = Ug0.f3833a) >= 24 || (i == 23 && Ug0.K(this.C0))) {
            return c4619sw.m;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e5 A[Catch: Exception -> 0x01ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ee, blocks: (B:88:0x01b8, B:90:0x01e5), top: B:161:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f4  */
    public final void p0() {
        long j;
        long jMax;
        boolean z;
        C5046xm c5046xm;
        long jA;
        ArrayDeque arrayDeque;
        long jW;
        long jR;
        C4902w7 c4902w7;
        Method method;
        long jMax2;
        boolean z2;
        boolean zG = g();
        C2315Bm c2315Bm = (C2315Bm) this.E0;
        if (!c2315Bm.m() || c2315Bm.H) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            C5078y7 c5078y7 = c2315Bm.i;
            AudioTrack audioTrack = c5078y7.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            C5046xm c5046xm2 = c5078y7.f5262a;
            if (playState == 3) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - c5078y7.m >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long jA2 = (c5078y7.a() * 1000000) / ((long) c5078y7.g);
                    if (jA2 == 0) {
                        z = zG;
                        c5046xm = c5046xm2;
                    } else {
                        int i = c5078y7.w;
                        long jA3 = Ug0.A(jA2, c5078y7.j) - jNanoTime;
                        long[] jArr = c5078y7.b;
                        jArr[i] = jA3;
                        c5078y7.w = (c5078y7.w + 1) % 10;
                        int i2 = c5078y7.x;
                        if (i2 < 10) {
                            c5078y7.x = i2 + 1;
                        }
                        c5078y7.m = jNanoTime;
                        c5078y7.l = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = c5078y7.x;
                            if (i3 >= i4) {
                                break;
                            }
                            c5078y7.l = (jArr[i3] / ((long) i4)) + c5078y7.l;
                            i3++;
                        }
                        if (c5078y7.h) {
                            z = zG;
                            c5046xm = c5046xm2;
                        } else {
                            C4990x7 c4990x7 = c5078y7.f;
                            c4990x7.getClass();
                            c4902w7 = c4990x7.f5207a;
                            if (c4902w7 != null || jNanoTime - c4990x7.e < c4990x7.d) {
                                z = zG;
                                c5046xm = c5046xm2;
                            } else {
                                c4990x7.e = jNanoTime;
                                AudioTrack audioTrack2 = c4902w7.f5169a;
                                AudioTimestamp audioTimestamp = c4902w7.b;
                                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                                if (timestamp) {
                                    long j2 = audioTimestamp.framePosition;
                                    if (c4902w7.d > j2) {
                                        c4902w7.c++;
                                    }
                                    c4902w7.d = j2;
                                    c4902w7.e = j2 + (c4902w7.c << 32);
                                }
                                int i5 = c4990x7.b;
                                if (i5 == 0) {
                                    z2 = timestamp;
                                    if (z2) {
                                        if (audioTimestamp.nanoTime / 1000 >= c4990x7.c) {
                                            c4990x7.f = c4902w7.e;
                                            c4990x7.b(1);
                                        } else {
                                            z = zG;
                                            c5046xm = c5046xm2;
                                        }
                                    } else if (jNanoTime - c4990x7.c > 500000) {
                                        c4990x7.b(3);
                                    }
                                } else if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            c4990x7.a();
                                        }
                                    } else if (!timestamp) {
                                        c4990x7.a();
                                    }
                                    z2 = timestamp;
                                } else if (timestamp) {
                                    z2 = timestamp;
                                    if (c4902w7.e > c4990x7.f) {
                                        c4990x7.b(2);
                                    }
                                } else {
                                    z2 = timestamp;
                                    c4990x7.a();
                                }
                                if (z2) {
                                    long j3 = c4902w7 != null ? c4902w7.b.nanoTime / 1000 : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                    long j4 = c4902w7 != null ? c4902w7.e : -1L;
                                    z = zG;
                                    long jA4 = (c5078y7.a() * 1000000) / ((long) c5078y7.g);
                                    if (Math.abs(j3 - jNanoTime) > 5000000) {
                                        c5046xm2.getClass();
                                        c5046xm = c5046xm2;
                                        C2315Bm c2315Bm2 = c5046xm.f5243a;
                                        c2315Bm2.h();
                                        c2315Bm2.i();
                                        AbstractC4038mJ.f();
                                        c4990x7.b(4);
                                    } else {
                                        c5046xm = c5046xm2;
                                        if (Math.abs(((j4 * 1000000) / ((long) c5078y7.g)) - jA4) > 5000000) {
                                            c5046xm.getClass();
                                            C2315Bm c2315Bm3 = c5046xm.f5243a;
                                            c2315Bm3.h();
                                            c2315Bm3.i();
                                            AbstractC4038mJ.f();
                                            c4990x7.b(4);
                                        } else if (c4990x7.b == 4) {
                                            c4990x7.a();
                                        }
                                    }
                                } else {
                                    z = zG;
                                    c5046xm = c5046xm2;
                                }
                            }
                            if (c5078y7.q && (method = c5078y7.n) != null && jNanoTime - c5078y7.r >= 500000) {
                                try {
                                    AudioTrack audioTrack3 = c5078y7.c;
                                    audioTrack3.getClass();
                                    Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                                    int i6 = Ug0.f3833a;
                                    long jIntValue = (((long) num.intValue()) * 1000) - c5078y7.i;
                                    c5078y7.o = jIntValue;
                                    jMax2 = Math.max(jIntValue, 0L);
                                    c5078y7.o = jMax2;
                                    if (jMax2 > 5000000) {
                                        c5046xm.getClass();
                                        AbstractC4038mJ.f();
                                        c5078y7.o = 0L;
                                    }
                                } catch (Exception unused) {
                                    c5078y7.n = null;
                                }
                                c5078y7.r = jNanoTime;
                            }
                        }
                    }
                } else if (c5078y7.h) {
                    z = zG;
                    c5046xm = c5046xm2;
                } else {
                    C4990x7 c4990x8 = c5078y7.f;
                    c4990x8.getClass();
                    c4902w7 = c4990x8.f5207a;
                    if (c4902w7 != null) {
                        z = zG;
                        c5046xm = c5046xm2;
                    } else {
                        z = zG;
                        c5046xm = c5046xm2;
                    }
                    if (c5078y7.q) {
                        AudioTrack audioTrack4 = c5078y7.c;
                        audioTrack4.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack4, new Object[0]);
                        int i7 = Ug0.f3833a;
                        long jIntValue2 = (((long) num2.intValue()) * 1000) - c5078y7.i;
                        c5078y7.o = jIntValue2;
                        jMax2 = Math.max(jIntValue2, 0L);
                        c5078y7.o = jMax2;
                        if (jMax2 > 5000000) {
                            c5046xm.getClass();
                            AbstractC4038mJ.f();
                            c5078y7.o = 0L;
                        }
                        c5078y7.r = jNanoTime;
                    }
                }
            } else {
                z = zG;
                c5046xm = c5046xm2;
            }
            long jNanoTime2 = System.nanoTime() / 1000;
            C4990x7 c4990x9 = c5078y7.f;
            c4990x9.getClass();
            boolean z3 = c4990x9.b == 2;
            if (z3) {
                C4902w7 c4902w8 = c4990x9.f5207a;
                jA = Ug0.w(jNanoTime2 - (c4902w8 != null ? c4902w8.b.nanoTime / 1000 : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), c5078y7.j) + (((c4902w8 != null ? c4902w8.e : -1L) * 1000000) / ((long) c5078y7.g));
            } else {
                jA = c5078y7.x == 0 ? (c5078y7.a() * 1000000) / ((long) c5078y7.g) : Ug0.w(c5078y7.l + jNanoTime2, c5078y7.j);
                if (!z) {
                    jA = Math.max(0L, jA - c5078y7.o);
                }
            }
            if (c5078y7.E != z3) {
                c5078y7.G = c5078y7.D;
                c5078y7.F = c5078y7.C;
            }
            long j5 = jNanoTime2 - c5078y7.G;
            if (j5 < 1000000) {
                long jW2 = Ug0.w(j5, c5078y7.j) + c5078y7.F;
                long j6 = (j5 * 1000) / 1000000;
                jA = (((1000 - j6) * jW2) + (jA * j6)) / 1000;
            }
            if (!c5078y7.k) {
                long j7 = c5078y7.C;
                if (jA > j7) {
                    c5078y7.k = true;
                    long jCurrentTimeMillis = System.currentTimeMillis() - Ug0.W(Ug0.A(Ug0.W(jA - j7), c5078y7.j));
                    Wm0 wm0 = c5046xm.f5243a.r;
                    if (wm0 != null) {
                        C3491g4 c3491g4 = ((C4481rN) wm0.b).D0;
                        Handler handler = (Handler) c3491g4.b;
                        if (handler != null) {
                            handler.post(new RunnableC4023m7(c3491g4, jCurrentTimeMillis, 0));
                        }
                    }
                }
            }
            c5078y7.D = jNanoTime2;
            c5078y7.C = jA;
            c5078y7.E = z3;
            long jMin = Math.min(jA, (c2315Bm.i() * 1000000) / ((long) c2315Bm.t.e));
            while (true) {
                arrayDeque = c2315Bm.j;
                if (arrayDeque.isEmpty() || jMin < ((C4870vm) arrayDeque.getFirst()).d) {
                    break;
                } else {
                    c2315Bm.x = (C4870vm) arrayDeque.remove();
                }
            }
            C4870vm c4870vm = c2315Bm.x;
            long j8 = jMin - c4870vm.d;
            boolean zEquals = c4870vm.f5152a.equals(EU.d);
            C4568sM c4568sM = c2315Bm.b;
            if (zEquals) {
                jW = c2315Bm.x.c + j8;
            } else if (arrayDeque.isEmpty()) {
                C3500g80 c3500g80 = (C3500g80) c4568sM.d;
                if (c3500g80.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    long j9 = c3500g80.n;
                    C3412f80 c3412f80 = c3500g80.j;
                    c3412f80.getClass();
                    long j10 = j9 - ((long) ((c3412f80.k * c3412f80.b) * 2));
                    int i8 = c3500g80.h.f4446a;
                    int i9 = c3500g80.g.f4446a;
                    jR = i8 == i9 ? Ug0.R(j8, j10, c3500g80.o) : Ug0.R(j8, j10 * ((long) i8), c3500g80.o * ((long) i9));
                } else {
                    jR = (long) (((double) c3500g80.c) * j8);
                }
                jW = jR + c2315Bm.x.c;
            } else {
                C4870vm c4870vm2 = (C4870vm) arrayDeque.getFirst();
                jW = c4870vm2.c - Ug0.w(c4870vm2.d - jMin, c2315Bm.x.f5152a.f3024a);
            }
            jMax = ((((P60) c4568sM.c).t * 1000000) / ((long) c2315Bm.t.e)) + jW;
            j = Long.MIN_VALUE;
        }
        if (jMax != j) {
            if (!this.K0) {
                jMax = Math.max(this.I0, jMax);
            }
            this.I0 = jMax;
            this.K0 = false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5097yN
    public final C2729Rl x(C4745uN c4745uN, C4619sw c4619sw, C4619sw c4619sw2) {
        C2729Rl c2729RlB = c4745uN.b(c4619sw, c4619sw2);
        int iN0 = n0(c4619sw2, c4745uN);
        int i = this.F0;
        int i2 = c2729RlB.e;
        if (iN0 > i) {
            i2 |= 64;
        }
        int i3 = i2;
        return new C2729Rl(c4745uN.f5075a, c4619sw, c4619sw2, i3 != 0 ? 0 : c2729RlB.d, i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final InterfaceC4042mN d() {
        return this;
    }
}

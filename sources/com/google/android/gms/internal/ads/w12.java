package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends s22 implements cz1 {
    public final iw0 A0;
    public final u12 B0;
    public final l22 C0;
    public int D0;
    public boolean E0;
    public g22 F0;
    public g22 G0;
    public long H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public long O0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Context f21375z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public w12(Context context, zl zlVar, Handler handler, jy1 jy1Var, u12 u12Var) {
        b02 b02Var = b02.f12591h;
        l22 l22Var = Build.VERSION.SDK_INT >= 35 ? new l22() : null;
        super(context.getApplicationContext(), 1, zlVar, b02Var, 44100.0f);
        this.f21375z0 = context.getApplicationContext();
        this.B0 = u12Var;
        this.C0 = l22Var;
        this.M0 = -1000;
        this.A0 = new iw0(15, handler, jy1Var);
        this.O0 = C.TIME_UNSET;
        u12Var.l = new uo0(this, 18);
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void A(boolean z10, boolean z11) {
        xx1 xx1Var = new xx1(0);
        this.f19796p0 = xx1Var;
        iw0 iw0Var = this.A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new x02(iw0Var, xx1Var, 8));
        }
        i();
        j02 j02Var = this.f20946f;
        j02Var.getClass();
        u12 u12Var = this.B0;
        u12Var.f20581k = j02Var;
        s6 s6Var = this.f20947g;
        s6Var.getClass();
        u12Var.f20585p.f16270d = s6Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    @Override // com.google.android.gms.internal.ads.s22
    public final int Q(b02 b02Var, g22 g22Var) {
        int i10;
        ya1 ya1VarB;
        boolean z10;
        String str = g22Var.f14678o;
        if (!"audio".equals(na.i(str))) {
            return 128;
        }
        int i11 = g22Var.O;
        int i12 = 1;
        boolean z11 = i11 == 0;
        u12 u12Var = this.B0;
        if (z11) {
            if (i11 != 0) {
                List listA = z22.a(MimeTypes.AUDIO_RAW, false, false);
                if ((listA.isEmpty() ? null : (p22) listA.get(0)) == null) {
                    i10 = 0;
                }
            }
            u12Var.getClass();
            u02 u02VarA = u12Var.f20585p.a(u12Var.n(g22Var));
            f6 f6Var = new f6();
            f6Var.f14258a = u02VarA.f20561a;
            f6Var.f14259b = u02VarA.f20562b;
            f6Var.f14260c = u02VarA.f20563c;
            p02 p02VarC = f6Var.c();
            if (p02VarC.f18421a) {
                i10 = true != p02VarC.f18422b ? 512 : 1536;
                if (p02VarC.f18423c) {
                    i10 |= com.ironsource.mediationsdk.metadata.a.f29616n;
                }
            } else {
                i10 = 0;
            }
            if (u12Var.p(g22Var) != 0) {
                return i10 | 172;
            }
        } else {
            i10 = 0;
        }
        if (!MimeTypes.AUDIO_RAW.equals(str) || u12Var.p(g22Var) != 0) {
            int i13 = g22Var.G;
            int i14 = g22Var.I;
            i12 i12Var = new i12();
            i12Var.e(MimeTypes.AUDIO_RAW);
            i12Var.F = i13;
            i12Var.H = i14;
            i12Var.I = 2;
            if (u12Var.p(new g22(i12Var)) != 0) {
                if (g22Var.f14678o == null) {
                    ya1VarB = ya1.f22208e;
                } else if (u12Var.p(g22Var) != 0) {
                    List listA2 = z22.a(MimeTypes.AUDIO_RAW, false, false);
                    p22 p22Var = listA2.isEmpty() ? null : (p22) listA2.get(0);
                    if (p22Var != null) {
                        ya1VarB = ca1.u(p22Var);
                    } else {
                        ya1VarB = z22.b(b02Var, g22Var, false, false);
                    }
                } else {
                    ya1VarB = z22.b(b02Var, g22Var, false, false);
                }
                if (!ya1VarB.isEmpty()) {
                    if (z11) {
                        p22 p22Var2 = (p22) ya1VarB.get(0);
                        Context context = this.f21375z0;
                        boolean zB = p22Var2.b(context, g22Var);
                        if (!zB) {
                            int i15 = 1;
                            while (true) {
                                if (i15 >= ya1VarB.f22210d) {
                                    z10 = true;
                                    break;
                                }
                                p22 p22Var3 = (p22) ya1VarB.get(i15);
                                if (p22Var3.b(context, g22Var)) {
                                    z10 = false;
                                    zB = true;
                                    p22Var2 = p22Var3;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                        int i16 = true != zB ? 3 : 4;
                        int i17 = 8;
                        if (zB && p22Var2.c(g22Var)) {
                            i17 = 16;
                        }
                        return i16 | i17 | 32 | (true != p22Var2.f18458g ? 0 : 64) | (true != z10 ? 0 : 128) | i10;
                    }
                    i12 = 2;
                }
            }
        }
        return i12 | 128;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // com.google.android.gms.internal.ads.s22
    public final ArrayList R(b02 b02Var, g22 g22Var) {
        ya1 ya1VarB;
        if (g22Var.f14678o == null) {
            ya1VarB = ya1.f22208e;
        } else if (this.B0.p(g22Var) != 0) {
            List listA = z22.a(MimeTypes.AUDIO_RAW, false, false);
            p22 p22Var = listA.isEmpty() ? null : (p22) listA.get(0);
            if (p22Var != null) {
                ya1VarB = ca1.u(p22Var);
            } else {
                ya1VarB = z22.b(b02Var, g22Var, false, false);
            }
        } else {
            ya1VarB = z22.b(b02Var, g22Var, false, false);
        }
        HashMap map = z22.f22480a;
        ArrayList arrayList = new ArrayList(ya1VarB);
        Collections.sort(arrayList, new x22(new iw0(16, this.f21375z0, g22Var)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final boolean S(g22 g22Var) {
        i();
        return this.B0.p(g22Var) != 0;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final o8 T(p22 p22Var, g22 g22Var, float f10) {
        int iIntValue;
        Integer num;
        Pair pairB;
        g22[] g22VarArr = this.f20950j;
        g22VarArr.getClass();
        int length = g22VarArr.length;
        String str = p22Var.f18452a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = g22Var.f14679p;
        int i10 = 0;
        boolean z10 = true;
        if (length != 1) {
            for (g22 g22Var2 : g22VarArr) {
                if (p22Var.d(g22Var, g22Var2).f22398d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, g22Var2.f14679p);
                }
            }
        }
        this.D0 = iMax;
        int i11 = Build.VERSION.SDK_INT;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z10 = false;
        }
        this.E0 = z10;
        String str2 = p22Var.f18454c;
        int i12 = this.D0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i13 = g22Var.G;
        mediaFormat.setInteger("channel-count", i13);
        int i14 = g22Var.I;
        mediaFormat.setInteger("sample-rate", i14);
        pi1.i(mediaFormat, g22Var.f14681r);
        pi1.t(mediaFormat, "max-input-size", i12);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        String str3 = g22Var.f14678o;
        if ("audio/ac4".equals(str3) && (pairB = re0.b(g22Var)) != null) {
            pi1.t(mediaFormat, "profile", ((Integer) pairB.first).intValue());
            pi1.t(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) pairB.second).intValue());
        }
        i12 i12Var = new i12();
        i12Var.e(MimeTypes.AUDIO_RAW);
        i12Var.F = i13;
        i12Var.H = i14;
        i12Var.I = 4;
        g22 g22Var3 = new g22(i12Var);
        u12 u12Var = this.B0;
        if (u12Var.p(g22Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.M0));
        }
        g22 g22Var4 = null;
        if (Objects.equals(str3, "audio/iamf")) {
            k12 k12Var = u12Var.f20585p;
            l02 l02Var = k12Var != null ? k12Var.f16271e : null;
            int i15 = 12;
            if (l02Var == null) {
                v71.y("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                ia1 ia1Var = v12.f21002a;
                Iterator it = l02Var.f16626d.iterator();
                do {
                    v81 v81Var = (v81) it;
                    if (!v81Var.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) v81Var.next();
                    iIntValue = num.intValue();
                } while (!v12.f21002a.contains(num));
                if (iIntValue != 0) {
                    i15 = iIntValue;
                } else {
                    Iterator it2 = l02Var.f16625c.iterator();
                    while (true) {
                        v81 v81Var2 = (v81) it2;
                        if (!v81Var2.hasNext()) {
                            break;
                        }
                        Integer num2 = (Integer) v81Var2.next();
                        int iIntValue2 = num2.intValue();
                        if (v12.f21002a.contains(num2)) {
                            i10 = iIntValue2;
                            break;
                        }
                    }
                    if (i10 != 0) {
                        i15 = i10;
                    }
                }
                int iBitCount = Integer.bitCount(i15);
                mediaFormat.setInteger("channel-mask", i15);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        k0(mediaFormat);
        if (MimeTypes.AUDIO_RAW.equals(p22Var.f18453b) && !MimeTypes.AUDIO_RAW.equals(str3)) {
            g22Var4 = g22Var;
        }
        this.G0 = g22Var4;
        return new o8(p22Var, mediaFormat, g22Var, null, this.C0, 9, false);
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final yx1 U(p22 p22Var, g22 g22Var, g22 g22Var2, boolean z10) {
        int i10;
        int i11;
        yx1 yx1VarD = p22Var.d(g22Var, g22Var2);
        int i12 = yx1VarD.f22399e;
        if (this.I == null && S(g22Var2)) {
            i12 |= 32768;
        }
        "OMX.google.raw.decoder".equals(p22Var.f18452a);
        if (g22Var2.f14679p > this.D0) {
            i12 |= 64;
        }
        String str = p22Var.f18452a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = yx1VarD.f22398d;
        }
        return new yx1(str, g22Var, g22Var2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final long V(long j10) {
        long jV;
        u12 u12Var = this.B0;
        boolean z10 = u12Var.t() && this.O0 != C.TIME_UNSET;
        if (this.N0) {
            if (!u12Var.l()) {
                jV = -9223372036854775807L;
            } else if (u12Var.f20583n.c()) {
                jV = uu0.u(((w02) u12Var.f20583n.f18884e).f21355b, u12Var.f20587r.f15917a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = u12Var.f20587r.f15917a.getBufferSizeInFrames();
                int iG = v71.G(((w02) u12Var.f20583n.f18884e).f21354a);
                ps1.c0(iG != -2147483647);
                jV = uu0.v(bufferSizeInFrames, 1000000L, iG, RoundingMode.DOWN);
            }
            if (this.L0 && z10 && jV != C.TIME_UNSET) {
                float fMin = Math.min(jV, this.O0 - j10);
                cc ccVar = u12Var.f20591v;
                return Math.max(Xa.f27908s, (long) ((fMin / (ccVar != null ? ccVar.f13130a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.f19794n0) {
            return 1000000L;
        }
        return Xa.f27908s;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final float W(float f10, g22 g22Var, g22[] g22VarArr) {
        int iMax = -1;
        for (g22 g22Var2 : g22VarArr) {
            int i10 = g22Var2.I;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void X(long j10, long j11, String str) {
        iw0 iw0Var = this.A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new x02(iw0Var, str, j10, j11));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void Y(String str) {
        iw0 iw0Var = this.A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new x02(iw0Var, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void Z(Exception exc) {
        v71.J("MediaCodecAudioRenderer", "Audio codec error", exc);
        iw0 iw0Var = this.A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new x02(iw0Var, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void a(long j10, boolean z10, boolean z11) {
        super.a(j10, z10, z11);
        this.B0.a();
        this.H0 = j10;
        this.O0 = C.TIME_UNSET;
        this.K0 = false;
        this.L0 = false;
        this.I0 = true;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final yx1 a0(f81 f81Var) {
        g22 g22Var = (g22) f81Var.f14318c;
        g22Var.getClass();
        this.F0 = g22Var;
        yx1 yx1VarA0 = super.a0(f81Var);
        iw0 iw0Var = this.A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new o1(iw0Var, g22Var, yx1VarA0, 16));
        }
        return yx1VarA0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0047  */
    @Override // com.google.android.gms.internal.ads.pz1
    public final void b(int i10, Object obj) {
        l22 l22Var;
        u12 u12Var = this.B0;
        if (i10 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (u12Var.G != fFloatValue) {
                u12Var.G = fFloatValue;
                if (u12Var.l()) {
                    u12Var.f20587r.f15917a.setVolume(u12Var.G);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            z80 z80Var = (z80) obj;
            z80Var.getClass();
            if (u12Var.f20588s.equals(z80Var)) {
                return;
            }
            u12Var.f20588s = z80Var;
            u12Var.j();
            return;
        }
        if (i10 == 6) {
            ei0 ei0Var = (ei0) obj;
            ei0Var.getClass();
            if (u12Var.Q.equals(ei0Var)) {
                return;
            }
            if (u12Var.f20587r != null) {
                u12Var.Q.getClass();
            }
            u12Var.Q = ei0Var;
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            u12Var.R = audioDeviceInfo;
            j12 j12Var = u12Var.f20587r;
            if (j12Var != null) {
                j12Var.f15917a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.M0 = ((Integer) obj).intValue();
            m22 m22Var = this.N;
            if (m22Var == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.M0));
            m22Var.h(bundle);
            return;
        }
        if (i10 == 19) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            int i11 = u12Var.S;
            if (iIntValue == 0 || iIntValue == -1) {
                iIntValue = -1;
            }
            if (i11 == iIntValue) {
                return;
            }
            u12Var.S = iIntValue;
            u12Var.j();
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            u12Var.f20592w = ((Boolean) obj).booleanValue();
            s12 s12Var = new s12(u12Var.f20591v, C.TIME_UNSET, C.TIME_UNSET);
            if (u12Var.l()) {
                u12Var.f20589t = s12Var;
                return;
            } else {
                u12Var.f20590u = s12Var;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 != 11) {
                return;
            }
            sy1 sy1Var = (sy1) obj;
            sy1Var.getClass();
            this.J = sy1Var;
            return;
        }
        obj.getClass();
        int iIntValue2 = ((Integer) obj).intValue();
        if (u12Var.P) {
            if (u12Var.O == iIntValue2) {
                u12Var.P = false;
                if (u12Var.O != iIntValue2) {
                    u12Var.O = iIntValue2;
                    u12Var.j();
                }
            }
        } else if (u12Var.O != iIntValue2) {
            u12Var.O = iIntValue2;
            u12Var.j();
        }
        if (Build.VERSION.SDK_INT < 35 || (l22Var = this.C0) == null) {
            return;
        }
        l22Var.b(iIntValue2);
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void b0(g22 g22Var, MediaFormat mediaFormat) throws dy1 {
        int iB;
        int integer;
        r32 r32Var;
        g22 g22Var2 = this.G0;
        dc1 dc1Var = null;
        if (g22Var2 != null) {
            g22Var = g22Var2;
        } else if (this.N != null) {
            mediaFormat.getClass();
            if (MimeTypes.AUDIO_RAW.equals(g22Var.f14678o)) {
                iB = g22Var.J;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iB = mediaFormat.getInteger("pcm-encoding");
            } else {
                iB = mediaFormat.containsKey("v-bits-per-sample") ? uu0.b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i10 = g22Var.H;
            if (i10 == -1 || g22Var.G != integer2) {
                i10 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i10 = integer;
            }
            i12 i12Var = new i12();
            i12Var.e(MimeTypes.AUDIO_RAW);
            i12Var.I = iB;
            i12Var.J = g22Var.K;
            i12Var.K = g22Var.L;
            i12Var.f15509k = g22Var.l;
            i12Var.f15499a = g22Var.f14665a;
            i12Var.f15500b = g22Var.f14666b;
            i12Var.f15501c = ca1.y(g22Var.f14667c);
            i12Var.f15502d = g22Var.f14668d;
            i12Var.f15503e = g22Var.f14669e;
            i12Var.f15504f = g22Var.f14670f;
            i12Var.F = integer2;
            i12Var.G = i10;
            i12Var.H = mediaFormat.getInteger("sample-rate");
            g22Var = new g22(i12Var);
            if (this.E0) {
                int i11 = g22Var.G;
                if (i11 == 3) {
                    dc1Var = j3.f15942a;
                } else if (i11 == 5) {
                    dc1Var = j3.f15943b;
                } else if (i11 == 6) {
                    dc1Var = j3.f15944c;
                } else if (i11 == 7) {
                    dc1Var = j3.f15945d;
                } else if (i11 != 8) {
                    dc1 dc1Var2 = j3.f15942a;
                } else {
                    dc1Var = j3.f15946e;
                }
            }
        }
        try {
            if (this.f19783b0) {
                i();
            }
            u12 u12Var = this.B0;
            hz hzVar = new hz(g22Var);
            hzVar.f15434c = dc1Var;
            ci ciVar = this.f20955p;
            hzVar.f15435d = ciVar;
            hzVar.f15436e = this.f20956q;
            if (!ciVar.g() && (r32Var = (r32) hzVar.f15436e) != null) {
                ps1.v(((ci) hzVar.f15435d).e(r32Var.f19359a) != -1);
            }
            u12Var.q(new y02(hzVar));
        } catch (a12 e10) {
            throw j(e10, e10.f11797a, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final void c(cc ccVar) {
        u12 u12Var = this.B0;
        u12Var.getClass();
        float f10 = ccVar.f13130a;
        String str = uu0.f20901a;
        cc ccVar2 = new cc(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(ccVar.f13131b, 8.0f)));
        u12Var.f20591v = ccVar2;
        s12 s12Var = new s12(ccVar2, C.TIME_UNSET, C.TIME_UNSET);
        if (u12Var.l()) {
            u12Var.f20589t = s12Var;
        } else {
            u12Var.f20590u = s12Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void c0() {
        this.B0.C = true;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void d() {
        this.B0.r();
        this.N0 = true;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final boolean d0(long j10, long j11, m22 m22Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, g22 g22Var) throws dy1 {
        byteBuffer.getClass();
        this.O0 = C.TIME_UNSET;
        if (this.G0 != null && (i11 & 2) != 0) {
            m22Var.getClass();
            m22Var.zzc(i10);
            return true;
        }
        u12 u12Var = this.B0;
        if (z10) {
            if (m22Var != null) {
                m22Var.zzc(i10);
            }
            this.f19796p0.f22028g += i12;
            u12Var.C = true;
            return true;
        }
        try {
            if (!u12Var.s(j12, byteBuffer, i12)) {
                this.O0 = j12;
                return false;
            }
            if (m22Var != null) {
                m22Var.zzc(i10);
            }
            this.f19796p0.f22027f += i12;
            return true;
        } catch (b12 e10) {
            g22 g22Var2 = this.F0;
            if (this.f19783b0) {
                i();
            }
            throw j(e10, g22Var2, false, IronSourceConstants.errorCode_biddingDataException);
        } catch (c12 e11) {
            if (this.f19783b0) {
                i();
            }
            throw j(e11, g22Var, e11.f12991b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void e() {
        s0();
        this.N0 = false;
        u12 u12Var = this.B0;
        u12Var.N = false;
        if (u12Var.l()) {
            j12 j12Var = u12Var.f20587r;
            l12 l12Var = j12Var.f15921e;
            l12Var.f16656k = 0L;
            l12Var.f16664t = 0;
            l12Var.f16663s = 0;
            l12Var.l = 0L;
            l12Var.f16669y = C.TIME_UNSET;
            l12Var.f16670z = C.TIME_UNSET;
            if (l12Var.f16665u == C.TIME_UNSET) {
                l12Var.f16653h.b(0);
            }
            l12Var.f16667w = l12Var.d();
            if (!j12Var.f15926j || j12Var.b()) {
                j12Var.f15917a.pause();
            }
        }
        this.L0 = false;
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void e0(wx1 wx1Var) {
        iw0 iw0Var = this.A0;
        Handler handler = (Handler) iw0Var.f15864b;
        if (handler != null) {
            handler.post(new gm0(27, iw0Var, wx1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1
    public final void f() {
        xx1 xx1Var;
        iw0 iw0Var = this.A0;
        this.J0 = true;
        this.F0 = null;
        this.O0 = C.TIME_UNSET;
        this.L0 = false;
        try {
            try {
                this.B0.a();
                super.f();
                xx1Var = this.f19796p0;
                iw0Var.getClass();
                synchronized (xx1Var) {
                }
            } finally {
                super.f();
                xx1Var = this.f19796p0;
                iw0Var.getClass();
                synchronized (xx1Var) {
                    Handler handler = (Handler) iw0Var.f15864b;
                    if (handler != null) {
                        handler.post(new gm0(28, iw0Var, xx1Var));
                    }
                }
            }
        } catch (Throwable th2) {
            xx1 xx1Var2 = this.f19796p0;
            iw0Var.getClass();
            synchronized (xx1Var2) {
                Handler handler2 = (Handler) iw0Var.f15864b;
                if (handler2 != null) {
                    handler2.post(new gm0(28, iw0Var, xx1Var2));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void f0() throws dy1 {
        try {
            u12 u12Var = this.B0;
            if (!u12Var.K && u12Var.l() && u12Var.g()) {
                u12Var.o();
                u12Var.K = true;
            }
            long j10 = this.f19797q0.f19310f;
            if (j10 != C.TIME_UNSET) {
                this.O0 = j10;
            }
        } catch (c12 e10) {
            throw j(e10, e10.f12992c, e10.f12991b, true != this.f19783b0 ? IronSourceConstants.errorCode_isReadyException : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void g() {
        u12 u12Var = this.B0;
        this.K0 = false;
        this.L0 = false;
        this.O0 = C.TIME_UNSET;
        try {
            try {
                this.f19783b0 = false;
                i0();
                G();
                this.I = null;
                if (this.J0) {
                    this.J0 = false;
                    u12Var.b();
                }
            } catch (Throwable th2) {
                this.I = null;
                throw th2;
            }
        } catch (Throwable th3) {
            if (this.J0) {
                this.J0 = false;
                u12Var.b();
            }
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void g0(long j10) {
        this.B0.F = j10;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final void h() {
        l22 l22Var;
        j0 j0Var;
        k12 k12Var = this.B0.f20585p;
        mk0 mk0Var = k12Var.f16269c;
        if (mk0Var != null) {
            mk0Var.k();
        }
        zw zwVar = k12Var.f16272f;
        if (zwVar != null && zwVar.f22729b) {
            zwVar.f22736i = null;
            Context context = zwVar.f22728a;
            x10.b(context).unregisterAudioDeviceCallback((m02) zwVar.f22732e);
            if (Build.VERSION.SDK_INT >= 32 && (j0Var = (j0) zwVar.f22735h) != null) {
                j0Var.e();
                zwVar.f22735h = null;
            }
            context.unregisterReceiver((q7.c) zwVar.f22733f);
            n02 n02Var = (n02) zwVar.f22734g;
            if (n02Var != null) {
                n02Var.f17607b.unregisterContentObserver(n02Var);
            }
            zwVar.f22729b = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (l22Var = this.C0) == null) {
            return;
        }
        l22Var.j();
    }

    @Override // com.google.android.gms.internal.ads.s22
    public final void h0(tx1 tx1Var) {
        g22 g22Var = tx1Var.f20521c;
        if (g22Var != null && Objects.equals(g22Var.f14678o, MimeTypes.AUDIO_OPUS) && this.f19783b0) {
            ByteBuffer byteBuffer = tx1Var.f20525g;
            byteBuffer.getClass();
            tx1Var.f20521c.getClass();
            if (byteBuffer.remaining() == 8) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
                j12 j12Var = this.B0.f20587r;
                if (j12Var != null) {
                    j12Var.b();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final boolean q() {
        return this.B0.t();
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final boolean r() {
        if (!this.f19794n0) {
            return false;
        }
        u12 u12Var = this.B0;
        if (u12Var.l()) {
            return u12Var.K && !u12Var.t();
        }
        return true;
    }

    public final void s0() {
        long j10;
        long jMax;
        ArrayDeque arrayDeque;
        long j11;
        r();
        u12 u12Var = this.B0;
        ay0 ay0Var = u12Var.X;
        if (!u12Var.l() || u12Var.D) {
            j10 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(u12Var.f20587r.f15921e.a(), uu0.u(((w02) u12Var.f20583n.f18884e).f21355b, u12Var.m()));
            while (true) {
                arrayDeque = u12Var.f20577g;
                if (arrayDeque.isEmpty() || jMin < ((s12) arrayDeque.getFirst()).f19766c) {
                    break;
                } else {
                    u12Var.f20590u = (s12) arrayDeque.remove();
                }
            }
            s12 s12Var = u12Var.f20590u;
            long jV = jMin - s12Var.f19766c;
            long jX = uu0.x(jV, s12Var.f19764a.f13130a);
            if (arrayDeque.isEmpty()) {
                i70 i70Var = (i70) ay0Var.f12539d;
                if (!i70Var.zzc()) {
                    j10 = Long.MIN_VALUE;
                } else if (i70Var.f15642n >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                    long j12 = i70Var.f15641m;
                    t60 t60Var = i70Var.f15639j;
                    t60Var.getClass();
                    long jZza = j12 - ((long) (((x50) t60Var.f20214q).zza() * (t60Var.f20207i * t60Var.f20200b)));
                    int i10 = i70Var.f15637h.f22472a;
                    int i11 = i70Var.f15636g.f22472a;
                    if (i10 == i11) {
                        jV = uu0.v(jV, jZza, i70Var.f15642n, RoundingMode.DOWN);
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = Long.MIN_VALUE;
                        jV = uu0.v(jV, jZza * ((long) i10), i70Var.f15642n * ((long) i11), RoundingMode.DOWN);
                    }
                } else {
                    j10 = Long.MIN_VALUE;
                    jV = (long) (((double) i70Var.f15632c) * jV);
                }
                s12 s12Var2 = u12Var.f20590u;
                j11 = s12Var2.f19765b + jV;
                s12Var2.f19767d = jV - jX;
            } else {
                j10 = Long.MIN_VALUE;
                s12 s12Var3 = u12Var.f20590u;
                j11 = s12Var3.f19765b + jX + s12Var3.f19767d;
            }
            long j13 = ((x12) ay0Var.f12538c).l;
            jMax = uu0.u(((w02) u12Var.f20583n.f18884e).f21355b, j13) + j11;
            long j14 = u12Var.U;
            if (j13 > j14) {
                long jU = uu0.u(((w02) u12Var.f20583n.f18884e).f21355b, j13 - j14);
                u12Var.U = j13;
                u12Var.V += jU;
                if (u12Var.W == null) {
                    u12Var.W = new Handler(Looper.myLooper());
                }
                u12Var.W.removeCallbacksAndMessages(null);
                u12Var.W.postDelayed(new ry0(u12Var, 18), 100L);
            }
        }
        if (jMax != j10) {
            if (!this.I0) {
                jMax = Math.max(this.H0, jMax);
            }
            this.H0 = jMax;
            this.I0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final long zzg() {
        if (this.f20948h == 2) {
            s0();
        }
        return this.H0;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final boolean zzh() {
        boolean z10 = this.K0;
        this.K0 = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public final cc zzj() {
        return this.B0.f20591v;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final cz1 y() {
        return this;
    }
}

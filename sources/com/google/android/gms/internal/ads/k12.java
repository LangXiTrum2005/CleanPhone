package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wv0 f16268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mk0 f16269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s6 f16270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l02 f16271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zw f16272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f16273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f16274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n12 f16275i;

    public /* synthetic */ k12(ay0 ay0Var) {
        Context context = (Context) ay0Var.f12537b;
        this.f16267a = context;
        n12 n12Var = (n12) ay0Var.f12539d;
        n12Var.getClass();
        this.f16275i = n12Var;
        this.f16271e = (l02) ay0Var.f12538c;
        this.f16268b = context == null ? null : new wv0(this, 13);
        this.f16270d = s6.f19862f;
    }

    public final u02 a(s02 s02Var) {
        d(s02Var);
        g22 g22Var = s02Var.f19751a;
        z80 z80Var = s02Var.f19752b;
        p02 p02VarA = this.f16275i.a(z80Var, g22Var);
        androidx.recyclerview.widget.x xVar = new androidx.recyclerview.widget.x();
        int i10 = 0;
        if (!Objects.equals(g22Var.f14678o, MimeTypes.AUDIO_RAW) ? this.f16271e.b(z80Var, g22Var) != null : g22Var.J == 2) {
            i10 = 2;
        }
        xVar.f4956d = i10;
        xVar.f4953a = p02VarA.f18421a;
        xVar.f4954b = p02VarA.f18422b;
        xVar.f4955c = p02VarA.f18423c;
        return xVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    public final w02 b(s02 s02Var) {
        int iIntValue;
        int iIntValue2;
        char c4;
        int iF;
        int iMax;
        int i10;
        int iG;
        boolean z10;
        d(s02Var);
        g22 g22Var = s02Var.f19751a;
        z80 z80Var = s02Var.f19752b;
        String str = g22Var.f14678o;
        int i11 = g22Var.G;
        int i12 = g22Var.I;
        if (Objects.equals(str, MimeTypes.AUDIO_RAW)) {
            iIntValue = g22Var.J;
            ps1.v(uu0.d(iIntValue));
            iIntValue2 = g22Var.H;
            if (iIntValue2 == -1) {
                iIntValue2 = uu0.e(i11);
            }
            iF = uu0.f(iIntValue) * i11;
            c4 = 0;
        } else {
            p02 p02Var = p02.f18420d;
            Pair pairB = this.f16271e.b(z80Var, g22Var);
            if (pairB == null) {
                throw new r02("Unable to configure passthrough for: ".concat(String.valueOf(g22Var)));
            }
            iIntValue = ((Integer) pairB.first).intValue();
            iIntValue2 = ((Integer) pairB.second).intValue();
            c4 = 2;
            iF = -1;
        }
        int i13 = g22Var.f14674j;
        if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS) && i13 == -1) {
            i13 = 768000;
        }
        int iMax2 = s02Var.f19756f;
        if (iMax2 != -1) {
            i12 = i12;
            iIntValue2 = iIntValue2;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i12, iIntValue2, iIntValue);
            ps1.c0(minBufferSize != -2);
            if (iF == -1) {
                iF = 1;
            }
            int i14 = 250000;
            if (c4 == 0) {
                long j10 = i12;
                long j11 = iF;
                int iA = gc1.a(((((long) 250000) * j10) * j11) / 1000000);
                int iA2 = gc1.a(((((long) 750000) * j10) * j11) / 1000000);
                String str2 = uu0.f20901a;
                iMax = Math.max(iA, Math.min(minBufferSize * 4, iA2));
            } else if (c4 != 1) {
                if (iIntValue == 5) {
                    i14 = 500000;
                } else {
                    if (iIntValue == 8) {
                        i14 = 1000000;
                        i10 = 8;
                    }
                    if (i13 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iG = v71.o(i13, 8);
                    } else {
                        iG = v71.G(i10);
                        if (iG != -2147483647) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ps1.c0(z10);
                    }
                    iMax = gc1.a((((long) i14) * ((long) iG)) / 1000000);
                }
                i10 = iIntValue;
                if (i13 != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iG = v71.o(i13, 8);
                } else {
                    iG = v71.G(i10);
                    if (iG != -2147483647) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ps1.c0(z10);
                }
                iMax = gc1.a((((long) i14) * ((long) iG)) / 1000000);
            } else {
                int iG2 = v71.G(iIntValue);
                ps1.c0(iG2 != -2147483647);
                iMax = gc1.a((((long) iG2) * 50000000) / 1000000);
            }
            iMax2 = (((Math.max(minBufferSize, iMax) + iF) - 1) / iF) * iF;
        }
        if1 if1Var = new if1();
        z80 z80Var2 = z80.f22559b;
        if1Var.f15728b = i12;
        if1Var.f15729c = iIntValue2;
        if1Var.f15727a = iIntValue;
        if1Var.f15730d = iMax2;
        if1Var.f15731e = s02Var.f19754d;
        if1Var.f15733g = z80Var;
        if1Var.f15732f = s02Var.f19755e;
        return new w02(if1Var);
    }

    public final j12 c(w02 w02Var) throws v02 {
        Context context;
        try {
            int i10 = w02Var.f21359f;
            int i11 = w02Var.f21360g;
            Context context2 = null;
            if (i11 != -1 && (context = this.f16267a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f16274h;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f16274h = context.createDeviceContext(i11);
                }
                context2 = this.f16274h;
                i10 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(w02Var.f21358e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(w02Var.f21355b).setChannelMask(w02Var.f21356c).setEncoding(w02Var.f21354a).build()).setTransferMode(1).setBufferSizeInBytes(w02Var.f21357d).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            sessionId.setOffloadedPlayback(false);
            if (i12 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new j12(audioTrackBuild, w02Var, this.f16268b, this.f16270d);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new v02();
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new v02(e10);
        }
    }

    public final void d(s02 s02Var) {
        Context context;
        l02 l02VarA;
        AudioDeviceInfo audioDeviceInfo = s02Var.f19753c;
        z80 z80Var = s02Var.f19752b;
        e();
        zw zwVar = this.f16272f;
        if (zwVar == null && (context = this.f16267a) != null) {
            zw zwVar2 = new zw(context, new at0(this, 15), z80Var, audioDeviceInfo);
            this.f16272f = zwVar2;
            if (zwVar2.f22729b) {
                l02VarA = (l02) zwVar2.f22736i;
                l02VarA.getClass();
            } else {
                zwVar2.f22729b = true;
                n02 n02Var = (n02) zwVar2.f22734g;
                if (n02Var != null) {
                    n02Var.f17607b.registerContentObserver(n02Var.f17608c, false, n02Var);
                }
                m02 m02Var = (m02) zwVar2.f22732e;
                Handler handler = (Handler) zwVar2.f22731d;
                Context context2 = zwVar2.f22728a;
                x10.b(context2).registerAudioDeviceCallback(m02Var, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((j0) zwVar2.f22735h) == null) {
                    zwVar2.f22735h = new j0(context2, new ry0(zwVar2, 17), Boolean.valueOf(uu0.j(context2)));
                }
                l02VarA = l02.a(context2, context2.registerReceiver((q7.c) zwVar2.f22733f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (z80) zwVar2.f22738k, (AudioDeviceInfo) zwVar2.f22737j, zwVar2.j());
                zwVar2.f22736i = l02VarA;
            }
            this.f16271e = l02VarA;
        } else if (zwVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) zwVar.f22737j)) {
                zwVar.f22737j = audioDeviceInfo;
                Context context3 = zwVar.f22728a;
                z80 z80Var2 = (z80) zwVar.f22738k;
                List listJ = zwVar.j();
                ya1 ya1Var = l02.f16619e;
                zwVar.k(l02.a(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), z80Var2, audioDeviceInfo, listJ));
            }
            zw zwVar3 = this.f16272f;
            if (!Objects.equals(z80Var, (z80) zwVar3.f22738k)) {
                zwVar3.f22738k = z80Var;
                Context context4 = zwVar3.f22728a;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) zwVar3.f22737j;
                List listJ2 = zwVar3.j();
                ya1 ya1Var2 = l02.f16619e;
                zwVar3.k(l02.a(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), z80Var, audioDeviceInfo2, listJ2));
            }
        }
        this.f16271e.getClass();
    }

    public final void e() {
        if (this.f16267a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f16273g;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z10) {
            throw new IllegalStateException(dv.B("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f16273g = looperMyLooper;
    }
}

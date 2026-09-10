package r1;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import cc.a2;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.internal.ads.m02;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.ads.n02;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Objects;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f49359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f49360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.g f49361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mk0 f49362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l1.u f49363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f49364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ln0 f49365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Looper f49366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f49367j;

    public u(zc.u uVar) {
        Context context = (Context) uVar.f54879b;
        this.f49358a = context;
        s1 s1Var = (s1) uVar.f54880c;
        s1Var.getClass();
        this.f49360c = s1Var;
        this.f49359b = (b0) uVar.f54881d;
        this.f49364g = (b) uVar.f54882e;
        this.f49361d = context == null ? null : new na.g(this, 8);
        this.f49363f = l1.u.f44822a;
    }

    public final t a(j jVar) throws h {
        Context context;
        Context context2;
        try {
            int i10 = jVar.f49317h;
            int i11 = jVar.f49318i;
            if (i11 == -1 || (context2 = this.f49358a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.f49367j;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f49367j = context2.createDeviceContext(i11);
                }
                context = this.f49367j;
                i10 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(jVar.f49313d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : jVar.f49316g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(jVar.f49311b).setChannelMask(jVar.f49312c).setEncoding(jVar.f49310a).build()).setTransferMode(1).setBufferSizeInBytes(jVar.f49315f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            sessionId.setOffloadedPlayback(jVar.f49314e);
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new t(audioTrackBuild, jVar, this.f49361d, this.f49363f);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new h();
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new h(e10);
        }
    }

    public final g b(f fVar) {
        e(fVar);
        i1.p pVar = fVar.f49280a;
        i1.e eVar = fVar.f49281b;
        c cVarK = this.f49360c.k(eVar, pVar);
        androidx.recyclerview.widget.x xVar = new androidx.recyclerview.widget.x();
        String str = pVar.f42643n;
        int i10 = pVar.H;
        int i11 = 0;
        if (!Objects.equals(str, MimeTypes.AUDIO_RAW) ? this.f49364g.d(eVar, pVar) != null : i10 == 2) {
            i11 = 2;
        }
        xVar.f4956d = i11;
        xVar.f4953a = cVarK.f49257a;
        xVar.f4954b = cVarK.f49258b;
        xVar.f4955c = cVarK.f49259c;
        return xVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0168  */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    public final j c(f fVar) {
        int iIntValue;
        char c4;
        int iT;
        boolean z10;
        boolean z11;
        int i10;
        int iMax;
        int minBufferSize;
        boolean z12;
        double d10;
        int i11;
        boolean z13;
        int iJ;
        int iM;
        boolean z14;
        int iM2;
        boolean z15;
        boolean z16;
        boolean z17;
        i1.p pVar = fVar.f49280a;
        boolean z18 = fVar.f49283d;
        i1.e eVar = fVar.f49281b;
        e(fVar);
        String str = pVar.f42643n;
        int i12 = pVar.G;
        int iIntValue2 = pVar.H;
        int i13 = pVar.F;
        if (!Objects.equals(str, MimeTypes.AUDIO_RAW)) {
            c cVarK = z18 ? this.f49360c.k(eVar, pVar) : c.f49256d;
            if (z18 && cVarK.f49257a) {
                str.getClass();
                int iC = i1.d0.c(str, pVar.f42641k);
                int iS = l1.y.s(i13);
                boolean z19 = cVarK.f49258b;
                iIntValue2 = iC;
                iIntValue = iS;
                z10 = z19;
                iT = -1;
                c4 = 1;
                z11 = true;
            } else {
                Pair pairD = this.f49364g.d(eVar, pVar);
                if (pairD == null) {
                    String str2 = "Unable to configure passthrough for: " + pVar;
                    str2.getClass();
                    throw new e(str2);
                }
                iIntValue2 = ((Integer) pairD.first).intValue();
                iIntValue = ((Integer) pairD.second).intValue();
                c4 = 2;
                iT = -1;
                z10 = false;
            }
            i10 = pVar.f42640j;
            if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS) && i10 == -1) {
                i10 = 768000;
            }
            iMax = fVar.f49287h;
            if (iMax != -1) {
                z13 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i12, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                go.k.t(z12);
                if (iT == -1) {
                    iT = 1;
                }
                if (z11) {
                    d10 = 8.0d;
                } else {
                    d10 = 1.0d;
                }
                this.f49359b.getClass();
                i11 = 250000;
                if (c4 != 0) {
                    z13 = true;
                    long j10 = i12;
                    long j11 = iT;
                    iJ = l1.y.j(minBufferSize * 4, com.bumptech.glide.c.c(((((long) 250000) * j10) * j11) / 1000000), com.bumptech.glide.c.c(((((long) 750000) * j10) * j11) / 1000000));
                } else if (c4 != 1) {
                    z13 = true;
                    iM = n2.b.m(iIntValue2);
                    if (iM != -2147483647) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    go.k.t(z14);
                    iJ = com.bumptech.glide.c.c((((long) 50000000) * ((long) iM)) / 1000000);
                } else {
                    if (c4 == 2) {
                        throw new IllegalArgumentException();
                    }
                    z13 = true;
                    if (iIntValue2 == 5) {
                        i11 = 500000;
                    } else if (iIntValue2 == 8) {
                        i11 = 1000000;
                    }
                    if (i10 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iM2 = a2.k(i10, 8);
                    } else {
                        iM2 = n2.b.m(iIntValue2);
                        if (iM2 != -2147483647) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        go.k.t(z15);
                    }
                    iJ = com.bumptech.glide.c.c((((long) i11) * ((long) iM2)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d10)) + iT) - 1) / iT) * iT;
            }
            i iVar = new i();
            i1.e eVar2 = i1.e.f42531c;
            iVar.f49307i = -1;
            iVar.f49300b = i12;
            iVar.f49301c = iIntValue;
            iVar.f49299a = iIntValue2;
            iVar.f49304f = iMax;
            iVar.f49306h = fVar.f49284e;
            iVar.f49305g = eVar;
            z16 = z13;
            if (c4 == z16) {
                z17 = z16;
            } else {
                z17 = false;
            }
            iVar.f49303e = z17;
            iVar.f49302d = fVar.f49286g;
            iVar.f49308j = z11;
            iVar.f49309k = z10;
            iVar.f49307i = fVar.f49285f;
            return new j(iVar);
        }
        go.k.i(l1.y.H(iIntValue2));
        iIntValue = l1.y.s(i13);
        iT = l1.y.t(iIntValue2) * i13;
        z10 = false;
        c4 = 0;
        z11 = false;
        i10 = pVar.f42640j;
        if (Objects.equals(str, MimeTypes.AUDIO_DTS_EXPRESS)) {
            i10 = 768000;
        }
        iMax = fVar.f49287h;
        if (iMax != -1) {
            z13 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i12, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z12 = true;
            } else {
                z12 = false;
            }
            go.k.t(z12);
            if (iT == -1) {
                iT = 1;
            }
            if (z11) {
                d10 = 8.0d;
            } else {
                d10 = 1.0d;
            }
            this.f49359b.getClass();
            i11 = 250000;
            if (c4 != 0) {
                z13 = true;
                long j12 = i12;
                long j13 = iT;
                iJ = l1.y.j(minBufferSize * 4, com.bumptech.glide.c.c(((((long) 250000) * j12) * j13) / 1000000), com.bumptech.glide.c.c(((((long) 750000) * j12) * j13) / 1000000));
            } else if (c4 != 1) {
                z13 = true;
                iM = n2.b.m(iIntValue2);
                if (iM != -2147483647) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                go.k.t(z14);
                iJ = com.bumptech.glide.c.c((((long) 50000000) * ((long) iM)) / 1000000);
            } else {
                if (c4 == 2) {
                    throw new IllegalArgumentException();
                }
                z13 = true;
                if (iIntValue2 == 5) {
                    i11 = 500000;
                } else if (iIntValue2 == 8) {
                    i11 = 1000000;
                }
                if (i10 != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iM2 = a2.k(i10, 8);
                } else {
                    iM2 = n2.b.m(iIntValue2);
                    if (iM2 != -2147483647) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    go.k.t(z15);
                }
                iJ = com.bumptech.glide.c.c((((long) i11) * ((long) iM2)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iJ) * d10)) + iT) - 1) / iT) * iT;
        }
        i iVar2 = new i();
        i1.e eVar3 = i1.e.f42531c;
        iVar2.f49307i = -1;
        iVar2.f49300b = i12;
        iVar2.f49301c = iIntValue;
        iVar2.f49299a = iIntValue2;
        iVar2.f49304f = iMax;
        iVar2.f49306h = fVar.f49284e;
        iVar2.f49305g = eVar;
        z16 = z13;
        if (c4 == z16) {
            z17 = z16;
        } else {
            z17 = false;
        }
        iVar2.f49303e = z17;
        iVar2.f49302d = fVar.f49286g;
        iVar2.f49308j = z11;
        iVar2.f49309k = z10;
        iVar2.f49307i = fVar.f49285f;
        return new j(iVar2);
    }

    public final void d() {
        mk0 mk0Var = this.f49362e;
        if (mk0Var != null) {
            mk0Var.d();
        }
        ln0 ln0Var = this.f49365h;
        if (ln0Var != null) {
            Context context = (Context) ln0Var.f17071b;
            if (ln0Var.f17070a) {
                ln0Var.f17077h = null;
                j1.f.u(context).unregisterAudioDeviceCallback((m02) ln0Var.f17074e);
                context.unregisterReceiver((q7.c) ln0Var.f17075f);
                n02 n02Var = (n02) ln0Var.f17076g;
                if (n02Var != null) {
                    n02Var.f17607b.unregisterContentObserver(n02Var);
                }
                ln0Var.f17070a = false;
            }
        }
    }

    public final void e(f fVar) {
        Context context;
        b bVarB;
        AudioDeviceInfo audioDeviceInfo = fVar.f49282c;
        i1.e eVar = fVar.f49281b;
        f();
        ln0 ln0Var = this.f49365h;
        if (ln0Var == null && (context = this.f49358a) != null) {
            ln0 ln0Var2 = new ln0(context, new k3.j(this, 26), eVar, audioDeviceInfo);
            this.f49365h = ln0Var2;
            Handler handler = (Handler) ln0Var2.f17073d;
            Context context2 = (Context) ln0Var2.f17071b;
            if (ln0Var2.f17070a) {
                bVarB = (b) ln0Var2.f17077h;
                bVarB.getClass();
            } else {
                ln0Var2.f17070a = true;
                n02 n02Var = (n02) ln0Var2.f17076g;
                if (n02Var != null) {
                    n02Var.f17607b.registerContentObserver(n02Var.f17608c, false, n02Var);
                }
                j1.f.u(context2).registerAudioDeviceCallback((m02) ln0Var2.f17074e, handler);
                bVarB = b.b(context2, context2.registerReceiver((q7.c) ln0Var2.f17075f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (i1.e) ln0Var2.f17079j, (AudioDeviceInfo) ln0Var2.f17078i);
                ln0Var2.f17077h = bVarB;
            }
            this.f49364g = bVarB;
        } else if (ln0Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) ln0Var.f17078i)) {
                ln0Var.f17078i = audioDeviceInfo;
                ln0Var.e(b.c((Context) ln0Var.f17071b, (i1.e) ln0Var.f17079j, audioDeviceInfo));
            }
            ln0 ln0Var3 = this.f49365h;
            if (!Objects.equals(eVar, (i1.e) ln0Var3.f17079j)) {
                ln0Var3.f17079j = eVar;
                ln0Var3.e(b.c((Context) ln0Var3.f17071b, eVar, (AudioDeviceInfo) ln0Var3.f17078i));
            }
        }
        this.f49364g.getClass();
    }

    public final void f() {
        if (this.f49358a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f49366i;
        boolean z10 = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z10) {
            throw new IllegalStateException(j1.f.B("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f49366i = looperMyLooper;
    }
}

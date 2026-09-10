package r1;

import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.internal.ads.d12;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.internal.ads.mk0;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f49341p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static ScheduledExecutorService f49342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f49343r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f49344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f49345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.g f49346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k5.g f49347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f49348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f49351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mk0 f49352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f49354k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f49355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49357o;

    public t(AudioTrack audioTrack, j jVar, na.g gVar, l1.u uVar) {
        this.f49344a = audioTrack;
        this.f49345b = jVar;
        this.f49346c = gVar;
        mk0 mk0Var = new mk0(Thread.currentThread(), 2);
        this.f49352i = mk0Var;
        mk0Var.f17460b = false;
        boolean zH = l1.y.H(jVar.f49310a);
        this.f49349f = zH;
        if (zH) {
            this.f49350g = l1.y.t(jVar.f49310a) * Integer.bitCount(jVar.f49312c);
        } else {
            this.f49350g = -1;
        }
        this.f49348e = new v(new k0(this, 5), uVar, audioTrack, jVar.f49310a, this.f49350g, jVar.f49315f);
        if (gVar != null) {
            final k5.g gVar2 = new k5.g();
            gVar2.f44325a = audioTrack;
            gVar2.f44326b = gVar;
            Handler handlerQ = l1.y.q(null);
            gVar2.f44327c = handlerQ;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: r1.r
                @Override // android.media.AudioRouting.OnRoutingChangedListener
                public final void onRoutingChanged(AudioRouting audioRouting) {
                    k5.g gVar3 = gVar2;
                    if (((r) gVar3.f44328d) == null) {
                        return;
                    }
                    l1.a.g().execute(new l2.u(19, gVar3, audioRouting));
                }
            };
            gVar2.f44328d = onRoutingChangedListener;
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerQ);
            this.f49347d = gVar2;
        }
        this.f49351h = c() ? new s(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:111:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x031b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0328  */
    /* JADX WARN: Code duplicated, block: B:116:0x032a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0332  */
    /* JADX WARN: Code duplicated, block: B:124:0x0340  */
    /* JADX WARN: Code duplicated, block: B:126:0x0359  */
    /* JADX WARN: Code duplicated, block: B:130:0x0375  */
    /* JADX WARN: Code duplicated, block: B:132:0x0378  */
    public final long a() {
        long j10;
        long j11;
        boolean z10;
        long jNanoTime;
        boolean z11;
        v vVar;
        long jB;
        int playState;
        long j12;
        long j13;
        long jA;
        long j14;
        int i10;
        boolean z12;
        AudioTimestamp audioTimestamp;
        float f10;
        p pVar;
        int i11;
        long j15;
        Method method;
        long j16;
        Method method2;
        v vVar2 = this.f49348e;
        l1.u uVar = vVar2.f49369b;
        d12 d12Var = vVar2.f49375h;
        AudioTrack audioTrack = vVar2.f49371d;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = vVar2.f49370c;
            uVar.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - vVar2.l >= 30000) {
                j10 = 1000;
                long jS = l1.y.S(vVar2.f49372e, vVar2.a());
                if (jS != 0) {
                    jArr[vVar2.f49385s] = l1.y.D(jS, vVar2.f49376i) - jNanoTime2;
                    vVar2.f49385s = (vVar2.f49385s + 1) % 10;
                    int i12 = vVar2.f49386t;
                    if (i12 < 10) {
                        vVar2.f49386t = i12 + 1;
                    }
                    vVar2.l = jNanoTime2;
                    vVar2.f49378k = 0L;
                    int i13 = 0;
                    while (true) {
                        int i14 = vVar2.f49386t;
                        if (i13 >= i14) {
                            break;
                        }
                        int i15 = i13;
                        vVar2.f49378k = (jArr[i15] / ((long) i14)) + vVar2.f49378k;
                        i13 = i15 + 1;
                    }
                }
            } else {
                j10 = 1000;
            }
            long j17 = vVar2.f49380n;
            if (vVar2.f49374g && (method = vVar2.f49379m) != null && jNanoTime2 - vVar2.f49381o >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = l1.y.f44830a;
                    j16 = jNanoTime2;
                    try {
                        long jIntValue = (((long) num.intValue()) * j10) - vVar2.f49373f;
                        vVar2.f49380n = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        vVar2.f49380n = jMax;
                        if (jMax > 10000000) {
                            l1.a.s("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                            vVar2.f49380n = 0L;
                        }
                    } catch (Exception unused) {
                        method2 = null;
                        vVar2.f49379m = method2;
                    }
                } catch (Exception unused2) {
                    j16 = jNanoTime2;
                    method2 = null;
                }
                jNanoTime2 = j16;
                vVar2.f49381o = jNanoTime2;
            }
            boolean z13 = j17 != vVar2.f49380n;
            float f11 = vVar2.f49376i;
            long jB2 = vVar2.b(jNanoTime2);
            p pVar2 = (p) d12Var.f13359h;
            p pVar3 = (p) d12Var.f13359h;
            j11 = 0;
            int i16 = d12Var.f13352a;
            if (z13 || jNanoTime2 - d12Var.f13356e >= d12Var.f13355d) {
                d12Var.f13356e = jNanoTime2;
                AudioTrack audioTrack2 = pVar2.f49328a;
                AudioTimestamp audioTimestamp2 = pVar2.f49329b;
                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j18 = audioTimestamp2.framePosition;
                    long j19 = pVar2.f49331d;
                    if (j19 > j18) {
                        if (pVar2.f49333f) {
                            pVar2.f49334g += j19;
                            pVar2.f49333f = false;
                        } else {
                            pVar2.f49330c++;
                        }
                    }
                    pVar2.f49331d = j18;
                    pVar2.f49332e = j18 + pVar2.f49334g + (pVar2.f49330c << 32);
                }
                if (timestamp) {
                    k0 k0Var = (k0) d12Var.f13360i;
                    long j20 = audioTimestamp2.nanoTime / j10;
                    audioTrack = audioTrack;
                    pVar = pVar3;
                    long jA2 = l1.y.A(jNanoTime2 - (pVar3.f49329b.nanoTime / j10), f11) + l1.y.S(i16, pVar3.f49332e);
                    if (Math.abs(j20 - jNanoTime2) > 5000000) {
                        long j21 = pVar2.f49332e;
                        k0Var.getClass();
                        StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                        sb2.append(j21);
                        sb2.append(", ");
                        sb2.append(j20);
                        q4.a.r(sb2, ", ", jNanoTime2, ", ");
                        sb2.append(jB2);
                        sb2.append(", ");
                        sb2.append(((t) k0Var.f47269b).b());
                        l1.a.s("AudioTrackAudioOutput", sb2.toString());
                        i11 = 4;
                        d12Var.a(4);
                        z12 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f10 = f11;
                    } else if (Math.abs(jA2 - jB2) > 5000000) {
                        z12 = timestamp;
                        long j22 = pVar2.f49332e;
                        k0Var.getClass();
                        audioTimestamp = audioTimestamp2;
                        f10 = f11;
                        StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                        sb3.append(j22);
                        sb3.append(", ");
                        sb3.append(j20);
                        q4.a.r(sb3, ", ", jNanoTime2, ", ");
                        sb3.append(jB2);
                        sb3.append(", ");
                        sb3.append(((t) k0Var.f47269b).b());
                        l1.a.s("AudioTrackAudioOutput", sb3.toString());
                        i11 = 4;
                        d12Var.a(4);
                    } else {
                        z12 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f10 = f11;
                        i11 = 4;
                        if (d12Var.f13353b == 4) {
                            d12Var.a(0);
                        }
                    }
                } else {
                    z12 = timestamp;
                    audioTimestamp = audioTimestamp2;
                    f10 = f11;
                    audioTrack = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0225: MOVE (r31v4 'audioTrack' android.media.AudioTrack) = (r9v6 android.media.AudioTrack) (LINE:550) in method: r1.t.a():long, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v6 android.media.AudioTrack
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 892
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: r1.t.a():long");
                }

                public final long b() {
                    if (!this.f49349f) {
                        return this.l;
                    }
                    long j10 = this.f49354k;
                    long j11 = this.f49350g;
                    String str = l1.y.f44830a;
                    return ((j10 + j11) - 1) / j11;
                }

                public final boolean c() {
                    return this.f49344a.isOffloadedPlayback();
                }

                public final void d(q1.j jVar) {
                    if (Build.VERSION.SDK_INT < 31) {
                        return;
                    }
                    LogSessionId logSessionIdA = jVar.a();
                    if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                        return;
                    }
                    this.f49344a.setLogSessionId(logSessionIdA);
                }

                public final boolean e(long j10, ByteBuffer byteBuffer, int i10) {
                    int iWrite;
                    boolean z10;
                    na.g gVar;
                    u uVar;
                    ln0 ln0Var;
                    j jVar = this.f49345b;
                    boolean z11 = this.f49349f;
                    if (!z11 && this.f49356n == 0) {
                        this.f49356n = a0.i(jVar.f49310a, byteBuffer);
                    }
                    b();
                    AudioTrack audioTrack = this.f49344a;
                    int underrunCount = audioTrack.getUnderrunCount();
                    boolean z12 = underrunCount > this.f49357o;
                    this.f49357o = underrunCount;
                    if (z12) {
                        this.f49352i.e(-1, new q1.d(29));
                    }
                    int iRemaining = byteBuffer.remaining();
                    if (jVar.f49313d) {
                        if (j10 == Long.MIN_VALUE) {
                            j10 = this.f49355m;
                        } else {
                            this.f49355m = j10;
                        }
                        iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j10 * 1000);
                    } else {
                        iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
                    }
                    if (iWrite >= 0) {
                        z10 = iWrite == iRemaining;
                        if (z11) {
                            this.f49354k += (long) iWrite;
                            return z10;
                        }
                        if (z10) {
                            this.l = (((long) this.f49356n) * ((long) i10)) + this.l;
                        }
                        return z10;
                    }
                    z10 = iWrite == -6 || iWrite == -32;
                    if (z10 && (gVar = this.f49346c) != null && (ln0Var = (uVar = (u) gVar.f46631b).f49365h) != null) {
                        b bVar = b.f49250c;
                        uVar.f49364g = bVar;
                        ln0Var.e(bVar);
                    }
                    throw new d(iWrite, z10);
                }
            }

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s22 extends ux1 {
    public final j22 A;
    public final MediaCodec.BufferInfo B;
    public final ArrayDeque C;
    public final q5 D;
    public final AtomicInteger E;
    public g22 F;
    public g22 G;
    public z61 H;
    public z61 I;
    public sy1 J;
    public final long K;
    public float L;
    public float M;
    public m22 N;
    public g22 O;
    public MediaFormat P;
    public boolean Q;
    public float R;
    public ArrayDeque S;
    public q22 T;
    public p22 U;
    public boolean V;
    public long W;
    public long X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ByteBuffer f19782a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f19783b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f19784c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f19785d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f19786e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f19787f0;
    public int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f19788h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f19789i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f19790j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f19791k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f19792l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f19793m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f19794n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f19795o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public xx1 f19796p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public r22 f19797q0;
    public long r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f19798s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f19799t;
    public boolean t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zl f19800u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f19801u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b02 f19802v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f19803v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f19804w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final wx1 f19805w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tx1 f19806x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public wx1 f19807x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tx1 f19808y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final eb1 f19809y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final tx1 f19810z;

    public s22(Context context, int i10, zl zlVar, b02 b02Var, float f10) {
        super(i10);
        this.f19799t = context.getApplicationContext();
        this.f19800u = zlVar;
        b02Var.getClass();
        this.f19802v = b02Var;
        this.f19804w = f10;
        this.E = new AtomicInteger();
        this.f19806x = new tx1(0);
        this.f19808y = new tx1(0);
        this.f19810z = new tx1(2);
        j22 j22Var = new j22(2);
        j22Var.f15941k = 32;
        this.A = j22Var;
        this.B = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.M = 1.0f;
        this.K = C.TIME_UNSET;
        this.C = new ArrayDeque();
        this.f19797q0 = r22.f19304g;
        j22Var.h(0);
        j22Var.f20523e.order(ByteOrder.nativeOrder());
        q5 q5Var = new q5();
        q5Var.f18934c = x40.f21739a;
        q5Var.f18933b = 0;
        q5Var.f18932a = 2;
        this.D = q5Var;
        this.R = -1.0f;
        this.f19787f0 = 0;
        this.Y = -1;
        this.Z = -1;
        this.X = C.TIME_UNSET;
        this.f19791k0 = C.TIME_UNSET;
        this.f19792l0 = C.TIME_UNSET;
        this.r0 = C.TIME_UNSET;
        this.W = C.TIME_UNSET;
        this.g0 = 0;
        this.f19788h0 = 0;
        this.f19796p0 = new xx1(0);
        this.f19801u0 = false;
        this.f19803v0 = 0L;
        int i11 = ia1.f15692c;
        this.f19809y0 = eb1.f13923j;
        wx1 wx1Var = wx1.f21618b;
        this.f19805w0 = wx1Var;
        this.f19807x0 = wx1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.ux1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(com.google.android.gms.internal.ads.g22[] r12, long r13, long r15, com.google.android.gms.internal.ads.r32 r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.r22 r12 = r11.f19797q0
            long r0 = r12.f19307c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.r22 r4 = new com.google.android.gms.internal.ads.r22
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.p0(r4)
            boolean r12 = r11.t0
            if (r12 == 0) goto L56
            r11.c0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.C
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f19791k0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.r22 r4 = new com.google.android.gms.internal.ads.r22
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.p0(r4)
            com.google.android.gms.internal.ads.r22 r12 = r11.f19797q0
            long r12 = r12.f19307c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.c0()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.r22 r0 = new com.google.android.gms.internal.ads.r22
            long r1 = r11.f19791k0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s22.B(com.google.android.gms.internal.ads.g22[], long, long, com.google.android.gms.internal.ads.r32):void");
    }

    public final void C() {
        try {
            m22 m22Var = this.N;
            if (m22Var == null) {
                throw null;
            }
            m22Var.zzk();
            J();
        } catch (Throwable th2) {
            J();
            throw th2;
        }
    }

    public final boolean D(int i10) {
        f81 f81Var = this.f20943c;
        f81Var.f14317b = null;
        f81Var.f14318c = null;
        tx1 tx1Var = this.f19806x;
        tx1Var.g();
        int iK = k(f81Var, tx1Var, i10 | 4);
        if (iK == -5) {
            a0(f81Var);
            return true;
        }
        if (iK != -4 || !tx1Var.f(4)) {
            return false;
        }
        this.f19793m0 = true;
        o0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b4 A[Catch: Exception -> 0x01fe, TRY_LEAVE, TryCatch #6 {Exception -> 0x01fe, blocks: (B:90:0x0151, B:92:0x0159, B:95:0x018e, B:103:0x01ae, B:105:0x01b4, B:109:0x01c8), top: B:183:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b9 A[Catch: Exception -> 0x010d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:74:0x0105, B:94:0x0165, B:97:0x019c, B:99:0x01a6, B:108:0x01b9, B:112:0x01d6, B:114:0x01dc, B:116:0x01e0, B:118:0x01eb, B:87:0x0123), top: B:174:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0 A[Catch: Exception -> 0x010d, TryCatch #1 {Exception -> 0x010d, blocks: (B:74:0x0105, B:94:0x0165, B:97:0x019c, B:99:0x01a6, B:108:0x01b9, B:112:0x01d6, B:114:0x01dc, B:116:0x01e0, B:118:0x01eb, B:87:0x0123), top: B:174:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0266 A[Catch: q22 -> 0x0280, TryCatch #10 {q22 -> 0x0280, blocks: (B:145:0x0234, B:147:0x0266, B:150:0x0273, B:152:0x027d, B:156:0x0297, B:159:0x029f, B:160:0x02a1, B:155:0x0282, B:162:0x02a5, B:163:0x02a6, B:165:0x02ad, B:166:0x02ae, B:167:0x02b8, B:169:0x02bb), top: B:190:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0270  */
    /* JADX WARN: Code duplicated, block: B:152:0x027d A[Catch: q22 -> 0x0280, TryCatch #10 {q22 -> 0x0280, blocks: (B:145:0x0234, B:147:0x0266, B:150:0x0273, B:152:0x027d, B:156:0x0297, B:159:0x029f, B:160:0x02a1, B:155:0x0282, B:162:0x02a5, B:163:0x02a6, B:165:0x02ad, B:166:0x02ae, B:167:0x02b8, B:169:0x02bb), top: B:190:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0282 A[Catch: q22 -> 0x0280, TryCatch #10 {q22 -> 0x0280, blocks: (B:145:0x0234, B:147:0x0266, B:150:0x0273, B:152:0x027d, B:156:0x0297, B:159:0x029f, B:160:0x02a1, B:155:0x0282, B:162:0x02a5, B:163:0x02a6, B:165:0x02ad, B:166:0x02ae, B:167:0x02b8, B:169:0x02bb), top: B:190:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x029d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0165 A[Catch: Exception -> 0x010d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:74:0x0105, B:94:0x0165, B:97:0x019c, B:99:0x01a6, B:108:0x01b9, B:112:0x01d6, B:114:0x01dc, B:116:0x01e0, B:118:0x01eb, B:87:0x0123), top: B:174:0x0105 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0165, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.p22] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.gms.internal.ads.s22] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.s22] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.p22] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void E() {
        g22 g22Var;
        ?? r2;
        boolean z10;
        Throwable th2;
        ArrayDeque arrayDeque;
        ?? r10;
        ?? r11;
        ?? r12;
        Exception exc;
        q22 q22Var;
        ?? diagnosticInfo;
        q22 q22Var2;
        ?? r13;
        ?? r14;
        long jElapsedRealtime;
        boolean z11;
        m22 m22Var;
        s22 s22Var = this;
        eb1 eb1Var = s22Var.f19809y0;
        j22 j22Var = s22Var.A;
        if (s22Var.N != null || s22Var.f19783b0 || (g22Var = s22Var.F) == null) {
            return;
        }
        boolean z12 = true;
        s22 s22Var2 = null;
        if (s22Var.I == null && s22Var.S(g22Var)) {
            s22Var.f19783b0 = false;
            s22Var.i0();
            String str = g22Var.f14678o;
            if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                j22Var.f15941k = 32;
            } else {
                j22Var.f15941k = 1;
            }
            s22Var.f19783b0 = true;
            return;
        }
        s22Var.H = s22Var.I;
        try {
            g22 g22Var2 = s22Var.F;
            Throwable th3 = null;
            try {
                if (g22Var2 == null) {
                    throw null;
                }
                if (s22Var.S == null) {
                    try {
                        ArrayList arrayListR = s22Var.R(s22Var.f19802v, g22Var2);
                        arrayListR.isEmpty();
                        s22Var.S = new ArrayDeque();
                        if (!arrayListR.isEmpty()) {
                            s22Var.S.add((p22) arrayListR.get(0));
                        }
                        s22Var.T = null;
                    } catch (v22 e10) {
                        throw new q22(g22Var2, e10, -49998);
                    }
                }
                if (s22Var.S.isEmpty()) {
                    throw new q22(g22Var2, null, -49999);
                }
                ArrayDeque arrayDeque2 = s22Var.S;
                if (arrayDeque2 == null) {
                    r2 = s22Var;
                    throw null;
                }
                while (true) {
                    r2 = s22Var;
                    if (r2.N != null) {
                        r2.S = th3;
                        return;
                    }
                    p22 p22Var = (p22) arrayDeque2.peekFirst();
                    if (p22Var == null) {
                        throw th3;
                    }
                    r2.M(g22Var2);
                    if (!r2.F(p22Var)) {
                        return;
                    }
                    try {
                        r2.U = p22Var;
                        g22 g22Var3 = r2.F;
                        if (g22Var3 == null) {
                            throw th3;
                        }
                        String str2 = p22Var.f18452a;
                        float f10 = r2.M;
                        try {
                            g22[] g22VarArr = r2.f20950j;
                            g22VarArr.getClass();
                            float fW = r2.W(f10, g22Var3, g22VarArr);
                            if (fW <= r2.f19804w) {
                                fW = -1.0f;
                            }
                            r2.f20947g.getClass();
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            o8 o8VarT = r2.T(p22Var, g22Var3, fW);
                            z10 = z12;
                            try {
                                int i10 = Build.VERSION.SDK_INT;
                                ?? r15 = 31;
                                try {
                                    try {
                                        try {
                                            try {
                                                if (i10 >= 31) {
                                                    th2 = th3;
                                                    try {
                                                        j02 j02Var = r2.f20946f;
                                                        j02Var.getClass();
                                                        try {
                                                            synchronized (j02Var) {
                                                                try {
                                                                    i02 i02Var = j02Var.f15894b;
                                                                    if (i02Var == null) {
                                                                        throw th2;
                                                                    }
                                                                    LogSessionId logSessionId = i02Var.f15468a;
                                                                    boolean zEquals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                                                                    r15 = logSessionId;
                                                                    if (!zEquals) {
                                                                        String str3 = "log-session-id";
                                                                        arrayDeque = arrayDeque2;
                                                                        try {
                                                                            ((MediaFormat) o8VarT.f18182c).setString("log-session-id", logSessionId.getStringId());
                                                                            r14 = str3;
                                                                        } catch (Exception e11) {
                                                                            e = e11;
                                                                            exc = e;
                                                                            r11 = r2;
                                                                            r12 = p22Var;
                                                                            v71.B("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r12.f18452a), exc);
                                                                            arrayDeque.removeFirst();
                                                                            String str4 = r12.f18452a;
                                                                            int length = str4.length();
                                                                            String string = g22Var2.toString();
                                                                            String strH = d5.u.h(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str4, ", ", string);
                                                                            String str5 = g22Var2.f14678o;
                                                                            if (exc instanceof MediaCodec.CodecException) {
                                                                                diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                                            } else {
                                                                                diagnosticInfo = th2;
                                                                            }
                                                                            q22Var = new q22(strH, exc, str5, r12, diagnosticInfo);
                                                                            r11.Z(q22Var);
                                                                            q22Var2 = r11.T;
                                                                            if (q22Var2 == null) {
                                                                                r11.T = q22Var;
                                                                            } else {
                                                                                r11.T = new q22(q22Var2.getMessage(), q22Var2.getCause(), q22Var2.f18900a, q22Var2.f18901b, q22Var2.f18902c);
                                                                            }
                                                                            if (arrayDeque.isEmpty()) {
                                                                                throw r11.T;
                                                                            }
                                                                        }
                                                                    }
                                                                    StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                                                                    sb2.append("createCodec:");
                                                                    sb2.append(str2);
                                                                    Trace.beginSection(sb2.toString());
                                                                    m22 m22VarA = r2.f19800u.a(o8VarT);
                                                                    r2.N = m22VarA;
                                                                    r14 = 14;
                                                                    m22VarA.m(new wv0(r2, 14));
                                                                    Trace.endSection();
                                                                    r2.f20947g.getClass();
                                                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                                                    if (!p22Var.b(r2.f19799t, g22Var3)) {
                                                                        String strC = g22.c(g22Var3);
                                                                        String str6 = uu0.f20901a;
                                                                        Locale locale = Locale.US;
                                                                        v71.y("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strC + ", " + str2 + X3.j.f27836e);
                                                                    }
                                                                    r2.R = fW;
                                                                    r2.O = g22Var3;
                                                                    if (!"Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && p22Var.f18457f) {
                                                                        z11 = z10;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    r2.V = z11;
                                                                    if (r2.N != null) {
                                                                        throw th2;
                                                                    }
                                                                    if (r2.f20948h == 2) {
                                                                        r2.f20947g.getClass();
                                                                        r2.X = SystemClock.elapsedRealtime() + 1000;
                                                                    }
                                                                    r2.f19796p0.f22023b++;
                                                                    long j10 = jElapsedRealtime - jElapsedRealtime2;
                                                                    if (i10 >= 31 && !eb1Var.isEmpty()) {
                                                                        m22Var = r2.N;
                                                                        if (m22Var != null) {
                                                                            throw th2;
                                                                        }
                                                                        m22Var.g(new ArrayList(eb1Var));
                                                                    }
                                                                    r10 = p22Var;
                                                                    try {
                                                                        r2.X(jElapsedRealtime, j10, str2);
                                                                        r11 = r2;
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        r13 = r2;
                                                                        exc = e;
                                                                        r12 = r10;
                                                                        r11 = r13;
                                                                        v71.B("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r12.f18452a), exc);
                                                                        arrayDeque.removeFirst();
                                                                        String str7 = r12.f18452a;
                                                                        int length2 = str7.length();
                                                                        String string2 = g22Var2.toString();
                                                                        String strH2 = d5.u.h(new StringBuilder(length2 + 23 + string2.length()), "Decoder init failed: ", str7, ", ", string2);
                                                                        String str8 = g22Var2.f14678o;
                                                                        if (exc instanceof MediaCodec.CodecException) {
                                                                            diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                                                                        } else {
                                                                            diagnosticInfo = th2;
                                                                        }
                                                                        q22Var = new q22(strH2, exc, str8, r12, diagnosticInfo);
                                                                        r11.Z(q22Var);
                                                                        q22Var2 = r11.T;
                                                                        if (q22Var2 == null) {
                                                                            r11.T = q22Var;
                                                                        } else {
                                                                            r11.T = new q22(q22Var2.getMessage(), q22Var2.getCause(), q22Var2.f18900a, q22Var2.f18901b, q22Var2.f18902c);
                                                                        }
                                                                        if (arrayDeque.isEmpty()) {
                                                                            throw r11.T;
                                                                        }
                                                                    }
                                                                    r2 = r11;
                                                                    z12 = z10;
                                                                    th3 = th2;
                                                                    arrayDeque2 = arrayDeque;
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        arrayDeque = arrayDeque2;
                                                    }
                                                } else {
                                                    th2 = th3;
                                                }
                                                r2.f20947g.getClass();
                                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                                if (!p22Var.b(r2.f19799t, g22Var3)) {
                                                    String strC2 = g22.c(g22Var3);
                                                    String str9 = uu0.f20901a;
                                                    Locale locale2 = Locale.US;
                                                    v71.y("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strC2 + ", " + str2 + X3.j.f27836e);
                                                }
                                                r2.R = fW;
                                                r2.O = g22Var3;
                                                if (!"Amazon".equals(Build.MANUFACTURER)) {
                                                    z11 = false;
                                                } else {
                                                    z11 = false;
                                                }
                                                r2.V = z11;
                                                if (r2.N != null) {
                                                    throw th2;
                                                }
                                                if (r2.f20948h == 2) {
                                                    r2.f20947g.getClass();
                                                    r2.X = SystemClock.elapsedRealtime() + 1000;
                                                }
                                                r2.f19796p0.f22023b++;
                                                long j11 = jElapsedRealtime - jElapsedRealtime2;
                                                if (i10 >= 31) {
                                                    m22Var = r2.N;
                                                    if (m22Var != null) {
                                                        throw th2;
                                                    }
                                                    m22Var.g(new ArrayList(eb1Var));
                                                }
                                                r10 = p22Var;
                                                r2.X(jElapsedRealtime, j11, str2);
                                                r11 = r2;
                                                r2 = r11;
                                                z12 = z10;
                                                th3 = th2;
                                                arrayDeque2 = arrayDeque;
                                            } catch (Exception e14) {
                                                e = e14;
                                                r10 = p22Var;
                                                r13 = r2;
                                            }
                                            Trace.endSection();
                                        } catch (Exception e15) {
                                            e = e15;
                                        }
                                        StringBuilder sb3 = new StringBuilder(str2.length() + 12);
                                        sb3.append("createCodec:");
                                        sb3.append(str2);
                                        Trace.beginSection(sb3.toString());
                                        m22 m22VarA2 = r2.f19800u.a(o8VarT);
                                        r2.N = m22VarA2;
                                        r14 = 14;
                                        m22VarA2.m(new wv0(r2, 14));
                                    } catch (Exception e16) {
                                        e = e16;
                                        r10 = i10;
                                        r13 = r14;
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                                arrayDeque = arrayDeque2;
                                r14 = r15;
                            } catch (Exception e17) {
                                e = e17;
                                r13 = r2;
                                r10 = p22Var;
                                th2 = th3;
                                arrayDeque = arrayDeque2;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            z10 = z12;
                            th2 = th3;
                            arrayDeque = arrayDeque2;
                        }
                    } catch (Exception e19) {
                        e = e19;
                        z10 = z12;
                        th2 = th3;
                        arrayDeque = arrayDeque2;
                    }
                    r10 = p22Var;
                    r13 = r2;
                    exc = e;
                    r12 = r10;
                    r11 = r13;
                    v71.B("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r12.f18452a), exc);
                    arrayDeque.removeFirst();
                    String str10 = r12.f18452a;
                    int length3 = str10.length();
                    String string3 = g22Var2.toString();
                    String strH3 = d5.u.h(new StringBuilder(length3 + 23 + string3.length()), "Decoder init failed: ", str10, ", ", string3);
                    String str11 = g22Var2.f14678o;
                    if (exc instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = th2;
                    }
                    q22Var = new q22(strH3, exc, str11, r12, diagnosticInfo);
                    r11.Z(q22Var);
                    q22Var2 = r11.T;
                    if (q22Var2 == null) {
                        r11.T = q22Var;
                    } else {
                        r11.T = new q22(q22Var2.getMessage(), q22Var2.getCause(), q22Var2.f18900a, q22Var2.f18901b, q22Var2.f18902c);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw r11.T;
                    }
                    r2 = r11;
                    z12 = z10;
                    th3 = th2;
                    arrayDeque2 = arrayDeque;
                }
            } catch (q22 e20) {
                e = e20;
                throw s22Var2.j(e, g22Var, false, 4001);
            }
        } catch (q22 e21) {
            e = e21;
            s22Var2 = s22Var;
            throw s22Var2.j(e, g22Var, false, 4001);
        }
    }

    public boolean F(p22 p22Var) {
        return true;
    }

    public final void G() {
        try {
            m22 m22Var = this.N;
            if (m22Var != null) {
                m22Var.zzl();
                this.f19796p0.f22024c++;
                p22 p22Var = this.U;
                if (p22Var == null) {
                    throw null;
                }
                Y(p22Var.f18452a);
            }
            this.N = null;
            this.H = null;
            K();
        } catch (Throwable th2) {
            this.N = null;
            this.H = null;
            K();
            throw th2;
        }
    }

    public boolean H() {
        int i10 = this.f19788h0;
        if (i10 == 3) {
            return true;
        }
        if (i10 == 2) {
            try {
                z61 z61Var = this.I;
                z61Var.getClass();
                this.H = z61Var;
                this.g0 = 0;
                this.f19788h0 = 0;
            } catch (dy1 e10) {
                v71.B("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                return true;
            }
        }
        return false;
    }

    public boolean I() {
        return true;
    }

    public void J() {
        this.Y = -1;
        this.f19808y.f20523e = null;
        this.Z = -1;
        this.f19782a0 = null;
        this.f19791k0 = C.TIME_UNSET;
        this.f19792l0 = C.TIME_UNSET;
        q0().f19310f = C.TIME_UNSET;
        this.r0 = C.TIME_UNSET;
        this.X = C.TIME_UNSET;
        this.f19790j0 = false;
        this.W = C.TIME_UNSET;
        this.f19789i0 = false;
        this.g0 = 0;
        this.f19788h0 = 0;
        this.f19787f0 = this.f19786e0 ? 1 : 0;
        this.f19801u0 = false;
        this.f19803v0 = 0L;
    }

    public final void K() {
        J();
        this.S = null;
        this.U = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.R = -1.0f;
        this.V = false;
        this.f19786e0 = false;
        this.f19787f0 = 0;
    }

    public o22 L(IllegalStateException illegalStateException, p22 p22Var) {
        return new o22(illegalStateException, p22Var);
    }

    public int O(tx1 tx1Var) {
        return 0;
    }

    public boolean P(tx1 tx1Var) {
        return false;
    }

    public abstract int Q(b02 b02Var, g22 g22Var);

    public abstract ArrayList R(b02 b02Var, g22 g22Var);

    public boolean S(g22 g22Var) {
        return false;
    }

    public abstract o8 T(p22 p22Var, g22 g22Var, float f10);

    public abstract yx1 U(p22 p22Var, g22 g22Var, g22 g22Var2, boolean z10);

    public long V(long j10) {
        if (this.f20948h != 1) {
            return Xa.f27908s;
        }
        if (q() || r()) {
            return 1000000L;
        }
        return Xa.f27908s;
    }

    public abstract float W(float f10, g22 g22Var, g22[] g22VarArr);

    public abstract void X(long j10, long j11, String str);

    public abstract void Y(String str);

    public abstract void Z(Exception exc);

    @Override // com.google.android.gms.internal.ads.ux1
    public void a(long j10, boolean z10, boolean z11) {
        ArrayDeque arrayDeque = this.C;
        if (!arrayDeque.isEmpty()) {
            this.f19797q0 = (r22) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.f19793m0 = false;
            this.f19794n0 = false;
            if (this.f19783b0) {
                i0();
            } else if (this.N != null) {
                if (H()) {
                    G();
                    E();
                } else if (I()) {
                    C();
                } else {
                    this.f19801u0 = true;
                }
            }
            if (this.f19797q0.f19308d.h() > 0) {
                this.f19795o0 = true;
            }
            ht0 ht0Var = this.f19797q0.f19308d;
            synchronized (ht0Var) {
                ht0Var.f15389c = 0;
                ht0Var.f15390d = 0;
                Arrays.fill(ht0Var.f15388b, (Object) null);
            }
            this.f19797q0.f19309e = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
    public yx1 a0(f81 f81Var) {
        int i10;
        Pair pairB;
        String str;
        this.f19795o0 = true;
        g22 g22Var = (g22) f81Var.f14318c;
        g22Var.getClass();
        String str2 = g22Var.f14678o;
        if (str2 == null) {
            throw j(new IllegalArgumentException("Sample MIME type is null."), g22Var, false, 4005);
        }
        if (str2.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) || str2.equals(MimeTypes.VIDEO_VP9)) {
            if (!g22Var.f14681r.isEmpty()) {
                i12 i12Var = new i12(g22Var);
                i12Var.f15514q = null;
                g22Var = new g22(i12Var);
            }
        } else if (str2.equals("video/dolby-vision")) {
            byte[] bArr = re0.f19567a;
            if (str2.equals("video/dolby-vision") && (pairB = re0.b(g22Var)) != null) {
                int iIntValue = ((Integer) pairB.first).intValue();
                if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                    str = "video/hevc";
                } else if (iIntValue == 512) {
                    str = "video/avc";
                } else if (iIntValue != 1024) {
                    str = null;
                } else {
                    str = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                }
            } else {
                str = null;
            }
            if (Objects.equals(str, com.unity3d.services.core.device.MimeTypes.VIDEO_AV1)) {
                if (!g22Var.f14681r.isEmpty()) {
                    i12 i12Var2 = new i12(g22Var);
                    i12Var2.f15514q = null;
                    g22Var = new g22(i12Var2);
                }
            }
        }
        g22 g22Var2 = g22Var;
        this.I = (z61) f81Var.f14317b;
        this.F = g22Var2;
        if (this.f19783b0) {
            this.f19785d0 = true;
            return null;
        }
        m22 m22Var = this.N;
        if (m22Var == null) {
            this.S = null;
            E();
            return null;
        }
        p22 p22Var = this.U;
        p22Var.getClass();
        g22 g22Var3 = this.O;
        g22Var3.getClass();
        z61 z61Var = this.H;
        z61 z61Var2 = this.I;
        if (z61Var != z61Var2) {
            n0();
            return new yx1(p22Var.f18452a, g22Var3, g22Var2, 0, 128);
        }
        yx1 yx1VarU = U(p22Var, g22Var3, g22Var2, q0().f19309e);
        int i11 = yx1VarU.f22398d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (l0(g22Var2)) {
                        this.O = g22Var2;
                        if (z61Var2 != z61Var && !m0()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (l0(g22Var2)) {
                    this.f19786e0 = true;
                    this.f19787f0 = 1;
                    this.O = g22Var2;
                    if (z61Var2 != z61Var && !m0()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (l0(g22Var2)) {
                this.O = g22Var2;
                if (z61Var2 != z61Var) {
                    if (!m0()) {
                        i10 = 2;
                    }
                } else if (this.f19789i0) {
                    this.g0 = 1;
                    if (H()) {
                        this.f19788h0 = 3;
                        i10 = 2;
                    } else {
                        this.f19788h0 = 1;
                    }
                }
            } else {
                i10 = 16;
            }
            return (i11 != 0 || (this.N == m22Var && this.f19788h0 != 3)) ? yx1VarU : new yx1(p22Var.f18452a, g22Var3, g22Var2, 0, i10);
        }
        n0();
        i10 = 0;
        if (i11 != 0) {
        }
    }

    public abstract void b0(g22 g22Var, MediaFormat mediaFormat);

    public abstract void c0();

    public abstract boolean d0(long j10, long j11, m22 m22Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, g22 g22Var);

    public abstract void e0(wx1 wx1Var);

    @Override // com.google.android.gms.internal.ads.ux1
    public void f() {
        this.F = null;
        p0(r22.f19304g);
        this.C.clear();
        if (this.f19783b0) {
            this.f19783b0 = false;
            i0();
        } else {
            if (this.N == null) {
                return;
            }
            if (H()) {
                G();
            } else if (I()) {
                C();
            } else {
                this.f19801u0 = true;
            }
        }
    }

    public abstract void f0();

    public abstract void h0(tx1 tx1Var);

    public final void i0() {
        this.f19791k0 = C.TIME_UNSET;
        this.f19792l0 = C.TIME_UNSET;
        q0().f19310f = C.TIME_UNSET;
        this.r0 = C.TIME_UNSET;
        this.f19785d0 = false;
        this.A.g();
        this.f19810z.g();
        this.f19784c0 = false;
        q5 q5Var = this.D;
        q5Var.getClass();
        q5Var.f18934c = x40.f21739a;
        q5Var.f18933b = 0;
        q5Var.f18932a = 2;
    }

    public void j0(long j10) {
        this.r0 = Math.max(j10, this.r0);
        while (true) {
            ArrayDeque arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j10 < ((r22) arrayDeque.peek()).f19305a) {
                return;
            }
            r22 r22Var = (r22) arrayDeque.poll();
            r22Var.getClass();
            p0(r22Var);
            c0();
        }
    }

    public final void k0(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.f19805w0.f21619a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    public final boolean l0(g22 g22Var) {
        if (this.N != null && this.f19788h0 != 3 && this.f20948h != 0) {
            float f10 = this.M;
            g22Var.getClass();
            g22[] g22VarArr = this.f20950j;
            g22VarArr.getClass();
            float fW = W(f10, g22Var, g22VarArr);
            float f11 = this.R;
            if (f11 != fW) {
                if (fW == -1.0f) {
                    n0();
                    return false;
                }
                if (f11 != -1.0f || fW > this.f19804w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fW);
                    m22 m22Var = this.N;
                    m22Var.getClass();
                    m22Var.h(bundle);
                    this.R = fW;
                }
            }
        }
        return true;
    }

    public final boolean m0() {
        if (this.f19789i0) {
            this.g0 = 1;
            if (H()) {
                this.f19788h0 = 3;
                return false;
            }
            this.f19788h0 = 2;
            return true;
        }
        z61 z61Var = this.I;
        z61Var.getClass();
        this.H = z61Var;
        this.g0 = 0;
        this.f19788h0 = 0;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public void n(float f10, float f11) {
        this.L = f10;
        this.M = f11;
        l0(this.O);
    }

    public final void n0() {
        if (this.f19789i0) {
            this.g0 = 1;
            this.f19788h0 = 3;
        } else {
            G();
            E();
        }
    }

    public final void o0() {
        int i10 = this.f19788h0;
        if (i10 == 1) {
            C();
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                this.f19794n0 = true;
                f0();
                return;
            } else {
                G();
                E();
                return;
            }
        }
        C();
        z61 z61Var = this.I;
        z61Var.getClass();
        this.H = z61Var;
        this.g0 = 0;
        this.f19788h0 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e4 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01fb A[LOOP:5: B:66:0x00f3->B:119:0x01fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0210 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0445 A[Catch: CryptoException -> 0x0012, IllegalStateException -> 0x0089, TryCatch #0 {CryptoException -> 0x0012, blocks: (B:3:0x0005, B:5:0x0009, B:12:0x0016, B:14:0x001b, B:17:0x0023, B:24:0x0049, B:26:0x006a, B:28:0x007f, B:39:0x009c, B:34:0x0091, B:266:0x0445, B:275:0x046a, B:277:0x046e, B:279:0x0473, B:283:0x047b, B:285:0x047f, B:287:0x0487, B:289:0x0495, B:292:0x049a, B:294:0x049e, B:298:0x04b3, B:300:0x04b7, B:303:0x04bc, B:305:0x04c0, B:307:0x04c8, B:309:0x04d6, B:310:0x04dc, B:311:0x04dd, B:312:0x04e0, B:313:0x04e1, B:315:0x04e5, B:316:0x04ef, B:317:0x04f7, B:319:0x0500, B:321:0x0506, B:324:0x0513, B:326:0x0517, B:327:0x051c, B:329:0x0526, B:331:0x052c, B:333:0x0539, B:334:0x053e, B:336:0x0544, B:337:0x0549, B:339:0x054d, B:340:0x055e, B:342:0x0562, B:344:0x0568, B:346:0x056f, B:347:0x0572, B:349:0x057a, B:351:0x0580, B:352:0x0585, B:201:0x035e, B:203:0x0363, B:207:0x0371, B:210:0x038e, B:212:0x0392, B:214:0x0396, B:216:0x03a2, B:244:0x03e0, B:248:0x03ed, B:250:0x03fd, B:252:0x0412, B:257:0x0424, B:260:0x042a, B:261:0x0435, B:263:0x043d), top: B:460:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:268:0x0454  */
    /* JADX WARN: Code duplicated, block: B:269:0x0455  */
    /* JADX WARN: Code duplicated, block: B:270:0x0457  */
    /* JADX WARN: Code duplicated, block: B:273:0x045b A[LOOP:0: B:139:0x0251->B:273:0x045b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:419:0x067c A[Catch: IllegalStateException -> 0x0634, CryptoException -> 0x0637, TryCatch #5 {IllegalStateException -> 0x0634, blocks: (B:434:0x06c1, B:428:0x069c, B:419:0x067c, B:400:0x062f, B:413:0x0658, B:410:0x0642, B:412:0x064f, B:414:0x0668, B:416:0x066a, B:427:0x069b, B:430:0x06a3, B:432:0x06a7, B:433:0x06a8), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x068b  */
    /* JADX WARN: Code duplicated, block: B:422:0x068c  */
    /* JADX WARN: Code duplicated, block: B:423:0x068e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0691 A[LOOP:1: B:275:0x046a->B:425:0x0691, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:439:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:441:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:445:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:448:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:450:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:453:0x0702  */
    /* JADX WARN: Code duplicated, block: B:454:0x0705  */
    /* JADX WARN: Code duplicated, block: B:482:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x069c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0106 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0116 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x012b A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x013b A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:0x0146  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TRY_ENTER, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x015d A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0167 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a9 A[Catch: IllegalStateException -> 0x00b1, CryptoException -> 0x00b6, TryCatch #2 {IllegalStateException -> 0x00b1, blocks: (B:132:0x0222, B:47:0x00ae, B:57:0x00c1, B:59:0x00c5, B:62:0x00d4, B:65:0x00e4, B:66:0x00f3, B:70:0x0100, B:72:0x0106, B:122:0x020a, B:124:0x0210, B:125:0x0213, B:127:0x0219, B:129:0x021d, B:75:0x0116, B:77:0x011d, B:78:0x012b, B:80:0x013b, B:84:0x014a, B:85:0x0153, B:88:0x0159, B:90:0x015d, B:92:0x0167, B:94:0x0171, B:95:0x0199, B:96:0x01a1, B:97:0x01a2, B:99:0x01a9, B:101:0x01b1, B:103:0x01b9, B:104:0x01c0, B:109:0x01d1, B:111:0x01dd, B:116:0x01f4, B:120:0x01ff, B:114:0x01e4, B:121:0x0202, B:136:0x0237, B:138:0x0241, B:139:0x0251, B:141:0x0255, B:151:0x0270, B:153:0x0274, B:181:0x0311, B:156:0x0280, B:157:0x028b, B:159:0x0294, B:161:0x02a0, B:170:0x02b3, B:172:0x02b9, B:173:0x02bd, B:174:0x02d3, B:175:0x02db, B:176:0x02e7, B:177:0x02f3, B:178:0x02ff, B:180:0x030c, B:182:0x031f, B:183:0x0320, B:185:0x0324, B:187:0x0328, B:189:0x032c, B:190:0x032f, B:192:0x0335, B:194:0x0345), top: B:462:0x0033 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.s22, com.google.android.gms.internal.ads.ux1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    @Override // com.google.android.gms.internal.ads.ux1
    public void p(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r2;
        o22 o22VarL;
        int i10;
        StackTraceElement[] stackTrace;
        f81 f81Var;
        tx1 tx1Var;
        ?? r3;
        boolean z13;
        boolean z14;
        f81 f81Var2;
        int iK;
        int i11;
        char c4;
        g22 g22Var;
        long j12;
        g22 g22Var2;
        Throwable th2;
        tx1 tx1Var2;
        long j13;
        f81 f81Var3;
        int i12;
        Throwable th3;
        ?? r15;
        tx1 tx1Var3;
        int i13;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        Throwable th4;
        eb1 eb1Var = this.f19809y0;
        boolean z22 = true;
        boolean z23 = true;
        boolean z24 = true;
        z = true;
        boolean z25 = true;
        ?? r10 = 1;
        try {
            try {
                if (this.f19794n0) {
                    f0();
                    return;
                }
                int i14 = 2;
                if (this.F == null && !D(2)) {
                    return;
                }
                E();
                boolean z26 = this.f19783b0;
                char c5 = 0;
                char c10 = 0;
                f81 f81Var4 = this.f20943c;
                byte b10 = -5;
                int i15 = 4;
                tx1 tx1Var4 = this.f19808y;
                ?? r12 = 0;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (z26) {
                                            try {
                                                Trace.beginSection("bypassRender");
                                                while (true) {
                                                    ps1.c0(this.f19794n0 ^ z24);
                                                    j22 j22Var = this.A;
                                                    try {
                                                        if (j22Var.m()) {
                                                            ByteBuffer byteBuffer = j22Var.f20523e;
                                                            f81 f81Var5 = f81Var4;
                                                            int i16 = this.Z;
                                                            int iL = j22Var.l();
                                                            tx1 tx1Var5 = tx1Var4;
                                                            ?? r16 = r12;
                                                            long j14 = j22Var.f20524f;
                                                            boolean zR0 = r0(this.l, j22Var.f15939i);
                                                            boolean zF = j22Var.f(i15);
                                                            g22 g22Var3 = this.G;
                                                            if (g22Var3 == null) {
                                                                throw r16;
                                                            }
                                                            tx1Var = tx1Var5;
                                                            f81Var = f81Var5;
                                                            if (d0(j10, j11, null, byteBuffer, i16, 0, iL, j14, zR0, zF, g22Var3)) {
                                                                j0(j22Var.f15939i);
                                                                j22Var.g();
                                                                r3 = 0;
                                                            } else {
                                                                z13 = true;
                                                            }
                                                            z14 = false;
                                                            break;
                                                        }
                                                        f81Var = f81Var4;
                                                        tx1Var = tx1Var4;
                                                        r3 = r12;
                                                        if (this.f19793m0) {
                                                            z13 = true;
                                                            this.f19794n0 = true;
                                                            z14 = false;
                                                            break;
                                                        }
                                                        z13 = true;
                                                        z25 = true;
                                                        z13 = true;
                                                        z24 = true;
                                                        boolean z27 = this.f19784c0;
                                                        tx1 tx1Var6 = this.f19810z;
                                                        if (z27) {
                                                            ps1.c0(j22Var.n(tx1Var6));
                                                            z14 = false;
                                                            this.f19784c0 = false;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (this.f19785d0) {
                                                            if (!j22Var.m()) {
                                                                this.f19783b0 = z14;
                                                                i0();
                                                                this.f19785d0 = z14;
                                                                E();
                                                                if (!this.f19783b0) {
                                                                    break;
                                                                }
                                                                ps1.c0(!this.f19793m0);
                                                                f81Var2 = f81Var;
                                                                f81Var2.f14317b = r3;
                                                                f81Var2.f14318c = r3;
                                                                tx1Var6.g();
                                                                while (true) {
                                                                    tx1Var6.g();
                                                                    iK = k(f81Var2, tx1Var6, z14 ? 1 : 0);
                                                                    if (iK != -5) {
                                                                        tx1Var = tx1Var;
                                                                        i11 = 4;
                                                                        c4 = 0;
                                                                        a0(f81Var2);
                                                                        break;
                                                                    }
                                                                    if (iK != -4) {
                                                                        if (x()) {
                                                                            q0().c(this.f19791k0);
                                                                        }
                                                                        i11 = 4;
                                                                    } else {
                                                                        i11 = 4;
                                                                        if (tx1Var6.f(4)) {
                                                                            this.f19793m0 = true;
                                                                            q0().c(this.f19791k0);
                                                                        } else {
                                                                            this.f19791k0 = Math.max(this.f19791k0, tx1Var6.f20524f);
                                                                            if (x()) {
                                                                                tx1Var = tx1Var;
                                                                            } else {
                                                                                tx1Var = tx1Var;
                                                                                if (tx1Var.f(536870912)) {
                                                                                }
                                                                                if (this.f19795o0) {
                                                                                    g22Var2 = this.F;
                                                                                    if (g22Var2 != null) {
                                                                                        throw r3;
                                                                                    }
                                                                                    this.G = g22Var2;
                                                                                    if (Objects.equals(g22Var2.f14678o, MimeTypes.AUDIO_OPUS)) {
                                                                                        byte[] bArr = (byte[]) this.G.f14681r.get(z14 ? 1 : 0);
                                                                                        int i17 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                                                                                        i12 i12VarA = this.G.a();
                                                                                        i12VarA.a(i17);
                                                                                        this.G = i12VarA.b();
                                                                                    }
                                                                                    b0(this.G, r3);
                                                                                    this.f19795o0 = z14;
                                                                                }
                                                                                tx1Var6.j();
                                                                                g22Var = this.G;
                                                                                if (g22Var == null) {
                                                                                    c4 = 0;
                                                                                } else {
                                                                                    c4 = 0;
                                                                                }
                                                                                if (!j22Var.m()) {
                                                                                    j12 = this.l;
                                                                                    if (r0(j12, j22Var.f15939i) == r0(j12, tx1Var6.f20524f)) {
                                                                                    }
                                                                                    this.f19784c0 = true;
                                                                                    break;
                                                                                }
                                                                                if (!j22Var.n(tx1Var6)) {
                                                                                    this.f19784c0 = true;
                                                                                    break;
                                                                                }
                                                                                tx1Var = tx1Var;
                                                                            }
                                                                            q0().c(this.f19791k0);
                                                                            if (this.f19795o0) {
                                                                                g22Var2 = this.F;
                                                                                if (g22Var2 != null) {
                                                                                    throw r3;
                                                                                }
                                                                                this.G = g22Var2;
                                                                                if (Objects.equals(g22Var2.f14678o, MimeTypes.AUDIO_OPUS)) {
                                                                                    byte[] bArr2 = (byte[]) this.G.f14681r.get(z14 ? 1 : 0);
                                                                                    int i18 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                                                                                    i12 i12VarA2 = this.G.a();
                                                                                    i12VarA2.a(i18);
                                                                                    this.G = i12VarA2.b();
                                                                                }
                                                                                b0(this.G, r3);
                                                                                this.f19795o0 = z14;
                                                                            }
                                                                            tx1Var6.j();
                                                                            g22Var = this.G;
                                                                            if (g22Var == null) {
                                                                                c4 = 0;
                                                                            } else {
                                                                                c4 = 0;
                                                                            }
                                                                            if (!j22Var.m()) {
                                                                                j12 = this.l;
                                                                                if (r0(j12, j22Var.f15939i) == r0(j12, tx1Var6.f20524f)) {
                                                                                }
                                                                                this.f19784c0 = true;
                                                                                break;
                                                                            }
                                                                            if (!j22Var.n(tx1Var6)) {
                                                                                this.f19784c0 = true;
                                                                                break;
                                                                            }
                                                                            tx1Var = tx1Var;
                                                                        }
                                                                    }
                                                                    c4 = 0;
                                                                    break;
                                                                }
                                                                if (j22Var.m()) {
                                                                    j22Var.j();
                                                                }
                                                                if (!j22Var.m()) {
                                                                    break;
                                                                    break;
                                                                }
                                                                continue;
                                                            } else {
                                                                f81Var2 = f81Var;
                                                                tx1Var = tx1Var;
                                                                i11 = 4;
                                                                c4 = 0;
                                                            }
                                                            r12 = r3;
                                                            f81Var4 = f81Var2;
                                                            c5 = c4;
                                                            b10 = -5;
                                                            tx1Var4 = tx1Var;
                                                            i15 = i11;
                                                            c10 = 0;
                                                        } else {
                                                            ps1.c0(!this.f19793m0);
                                                            f81Var2 = f81Var;
                                                            f81Var2.f14317b = r3;
                                                            f81Var2.f14318c = r3;
                                                            tx1Var6.g();
                                                            while (true) {
                                                                tx1Var6.g();
                                                                iK = k(f81Var2, tx1Var6, z14 ? 1 : 0);
                                                                if (iK != -5) {
                                                                    tx1Var = tx1Var;
                                                                    i11 = 4;
                                                                    c4 = 0;
                                                                    a0(f81Var2);
                                                                    break;
                                                                }
                                                                if (iK != -4) {
                                                                    if (x()) {
                                                                        q0().c(this.f19791k0);
                                                                    }
                                                                    i11 = 4;
                                                                } else {
                                                                    i11 = 4;
                                                                    if (tx1Var6.f(4)) {
                                                                        this.f19793m0 = true;
                                                                        q0().c(this.f19791k0);
                                                                    } else {
                                                                        this.f19791k0 = Math.max(this.f19791k0, tx1Var6.f20524f);
                                                                        if (x()) {
                                                                            tx1Var = tx1Var;
                                                                            if (tx1Var.f(536870912)) {
                                                                            }
                                                                            if (this.f19795o0) {
                                                                                g22Var2 = this.F;
                                                                                if (g22Var2 != null) {
                                                                                    throw r3;
                                                                                }
                                                                                this.G = g22Var2;
                                                                                if (Objects.equals(g22Var2.f14678o, MimeTypes.AUDIO_OPUS) && !this.G.f14681r.isEmpty()) {
                                                                                    byte[] bArr3 = (byte[]) this.G.f14681r.get(z14 ? 1 : 0);
                                                                                    int i19 = (bArr3[10] & 255) | ((bArr3[11] & 255) << 8);
                                                                                    i12 i12VarA3 = this.G.a();
                                                                                    i12VarA3.a(i19);
                                                                                    this.G = i12VarA3.b();
                                                                                }
                                                                                b0(this.G, r3);
                                                                                this.f19795o0 = z14;
                                                                            }
                                                                            tx1Var6.j();
                                                                            g22Var = this.G;
                                                                            if (g22Var == null && Objects.equals(g22Var.f14678o, MimeTypes.AUDIO_OPUS)) {
                                                                                c4 = 0;
                                                                                if (tx1Var6.f(268435456)) {
                                                                                    tx1Var6.f20521c = this.G;
                                                                                    h0(tx1Var6);
                                                                                }
                                                                                if (this.l - tx1Var6.f20524f <= 80000 ? true : z14 ? 1 : 0) {
                                                                                    this.D.b(tx1Var6, this.G.f14681r);
                                                                                }
                                                                            } else {
                                                                                c4 = 0;
                                                                            }
                                                                            if (!j22Var.m()) {
                                                                                j12 = this.l;
                                                                                if (r0(j12, j22Var.f15939i) == r0(j12, tx1Var6.f20524f)) {
                                                                                }
                                                                                this.f19784c0 = true;
                                                                                break;
                                                                            }
                                                                            if (!j22Var.n(tx1Var6)) {
                                                                                this.f19784c0 = true;
                                                                                break;
                                                                            }
                                                                            tx1Var = tx1Var;
                                                                        } else {
                                                                            tx1Var = tx1Var;
                                                                        }
                                                                        q0().c(this.f19791k0);
                                                                        if (this.f19795o0) {
                                                                            g22Var2 = this.F;
                                                                            if (g22Var2 != null) {
                                                                                throw r3;
                                                                            }
                                                                            this.G = g22Var2;
                                                                            if (Objects.equals(g22Var2.f14678o, MimeTypes.AUDIO_OPUS)) {
                                                                                byte[] bArr4 = (byte[]) this.G.f14681r.get(z14 ? 1 : 0);
                                                                                int i110 = (bArr4[10] & 255) | ((bArr4[11] & 255) << 8);
                                                                                i12 i12VarA4 = this.G.a();
                                                                                i12VarA4.a(i110);
                                                                                this.G = i12VarA4.b();
                                                                            }
                                                                            b0(this.G, r3);
                                                                            this.f19795o0 = z14;
                                                                        }
                                                                        tx1Var6.j();
                                                                        g22Var = this.G;
                                                                        if (g22Var == null) {
                                                                            c4 = 0;
                                                                        } else {
                                                                            c4 = 0;
                                                                        }
                                                                        if (!j22Var.m()) {
                                                                            j12 = this.l;
                                                                            if (r0(j12, j22Var.f15939i) == r0(j12, tx1Var6.f20524f)) {
                                                                            }
                                                                            this.f19784c0 = true;
                                                                            break;
                                                                        }
                                                                        if (!j22Var.n(tx1Var6)) {
                                                                            this.f19784c0 = true;
                                                                            break;
                                                                        }
                                                                        tx1Var = tx1Var;
                                                                    }
                                                                }
                                                                c4 = 0;
                                                                break;
                                                            }
                                                            if (j22Var.m()) {
                                                                j22Var.j();
                                                            }
                                                            if (!j22Var.m() && !this.f19793m0 && !this.f19785d0) {
                                                                break;
                                                            }
                                                            r12 = r3;
                                                            f81Var4 = f81Var2;
                                                            c5 = c4;
                                                            b10 = -5;
                                                            tx1Var4 = tx1Var;
                                                            i15 = i11;
                                                            c10 = 0;
                                                        }
                                                    } catch (IllegalStateException e10) {
                                                        e = e10;
                                                        z25 = true;
                                                        z26 = false;
                                                        z11 = z25;
                                                        r10 = z26;
                                                        z12 = e instanceof MediaCodec.CodecException;
                                                        if (!z12) {
                                                            stackTrace = e.getStackTrace();
                                                            if (stackTrace.length > 0) {
                                                            }
                                                            throw e;
                                                        }
                                                        Z(e);
                                                        if (z12) {
                                                            r2 = z11;
                                                            r2 = r10;
                                                        } else {
                                                            r2 = z11;
                                                            r2 = r10;
                                                        }
                                                        if (r2 != 0) {
                                                            G();
                                                        }
                                                        o22VarL = L(e, this.U);
                                                        if (o22VarL.f18092a == 1101) {
                                                            i10 = 4006;
                                                        } else {
                                                            i10 = 4003;
                                                        }
                                                        throw j(o22VarL, this.F, r2, i10);
                                                    }
                                                }
                                                Trace.endSection();
                                            } catch (IllegalStateException e11) {
                                                e = e11;
                                            }
                                        } else {
                                            int i20 = 4;
                                            tx1 tx1Var7 = tx1Var4;
                                            Throwable th5 = null;
                                            boolean z28 = false;
                                            if (this.N != null) {
                                                s6 s6Var = this.f20947g;
                                                s6Var.getClass();
                                                long jP = s6Var.p();
                                                Trace.beginSection("drainAndFeed");
                                                f81 f81Var6 = f81Var4;
                                                while (true) {
                                                    m22 m22Var = this.N;
                                                    if (m22Var == null) {
                                                        throw th5;
                                                    }
                                                    boolean z29 = this.Z >= 0 ? z23 : z28;
                                                    long j15 = this.K;
                                                    MediaCodec.BufferInfo bufferInfo = this.B;
                                                    if (z29) {
                                                        th4 = th5;
                                                    } else {
                                                        try {
                                                            int iN = m22Var.n(bufferInfo);
                                                            if (iN >= 0) {
                                                                Throwable th6 = th5;
                                                                try {
                                                                    bufferInfo.presentationTimeUs -= this.f19803v0;
                                                                    if (bufferInfo.size != 0 || (bufferInfo.flags & i20) == 0) {
                                                                        this.Z = iN;
                                                                        ByteBuffer byteBufferA = m22Var.a(iN);
                                                                        this.f19782a0 = byteBufferA;
                                                                        if (byteBufferA != null) {
                                                                            byteBufferA.position(bufferInfo.offset);
                                                                            this.f19782a0.limit(bufferInfo.offset + bufferInfo.size);
                                                                        }
                                                                        g22 g22Var4 = (g22) this.f19797q0.f19308d.j(bufferInfo.presentationTimeUs);
                                                                        if (g22Var4 == null && this.f19798s0 && this.P != null) {
                                                                            g22Var4 = (g22) this.f19797q0.f19308d.i();
                                                                        }
                                                                        if (g22Var4 != null) {
                                                                            this.G = g22Var4;
                                                                        } else if (!this.Q || this.G == null) {
                                                                            z28 = false;
                                                                            th4 = th6;
                                                                        }
                                                                        g22 g22Var5 = this.G;
                                                                        if (g22Var5 == null) {
                                                                            z28 = false;
                                                                            throw th6;
                                                                        }
                                                                        b0(g22Var5, this.P);
                                                                        z28 = false;
                                                                        this.Q = false;
                                                                        this.f19798s0 = false;
                                                                        th4 = th6;
                                                                    } else {
                                                                        o0();
                                                                        th2 = th6;
                                                                    }
                                                                } catch (IllegalStateException e12) {
                                                                    e = e12;
                                                                    z28 = false;
                                                                    r10 = z28;
                                                                    z11 = true;
                                                                }
                                                                r10 = z28;
                                                                z11 = true;
                                                                z12 = e instanceof MediaCodec.CodecException;
                                                                if (!z12) {
                                                                    stackTrace = e.getStackTrace();
                                                                    if (stackTrace.length > 0 || !stackTrace[r10].getClassName().equals("android.media.MediaCodec")) {
                                                                        throw e;
                                                                    }
                                                                }
                                                                Z(e);
                                                                if (z12 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                                    r2 = z11;
                                                                    r2 = r10;
                                                                }
                                                                if (r2 != 0) {
                                                                    G();
                                                                }
                                                                o22VarL = L(e, this.U);
                                                                if (o22VarL.f18092a == 1101) {
                                                                    i10 = 4006;
                                                                } else {
                                                                    i10 = 4003;
                                                                }
                                                                throw j(o22VarL, this.F, r2, i10);
                                                            }
                                                            if (iN == -2) {
                                                                m22 m22Var2 = this.N;
                                                                if (m22Var2 == null) {
                                                                    throw th5;
                                                                }
                                                                MediaFormat mediaFormatZzg = m22Var2.zzg();
                                                                if (!eb1Var.isEmpty()) {
                                                                    wx1 wx1Var = wx1.f21618b;
                                                                    HashMap map = new HashMap();
                                                                    Iterator it = eb1Var.iterator();
                                                                    while (true) {
                                                                        v81 v81Var = (v81) it;
                                                                        if (!v81Var.hasNext()) {
                                                                            break;
                                                                        }
                                                                        String str = (String) v81Var.next();
                                                                        if (mediaFormatZzg.containsKey(str)) {
                                                                            int valueTypeForKey = mediaFormatZzg.getValueTypeForKey(str);
                                                                            if (valueTypeForKey == z23) {
                                                                                map.put(str, Integer.valueOf(mediaFormatZzg.getInteger(str)));
                                                                            } else if (valueTypeForKey == i14) {
                                                                                map.put(str, Long.valueOf(mediaFormatZzg.getLong(str)));
                                                                            } else if (valueTypeForKey == 3) {
                                                                                map.put(str, Float.valueOf(mediaFormatZzg.getFloat(str)));
                                                                            } else if (valueTypeForKey == i20) {
                                                                                map.put(str, mediaFormatZzg.getString(str));
                                                                            } else if (valueTypeForKey == 5) {
                                                                                ByteBuffer byteBuffer2 = mediaFormatZzg.getByteBuffer(str);
                                                                                if (byteBuffer2 == null) {
                                                                                    map.put(str, th5);
                                                                                } else {
                                                                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer2.remaining());
                                                                                    byteBufferAllocate.put(byteBuffer2.duplicate());
                                                                                    byteBufferAllocate.flip();
                                                                                    map.put(str, byteBufferAllocate);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    wx1 wx1Var2 = new wx1(map);
                                                                    if (!wx1Var2.equals(this.f19807x0)) {
                                                                        this.f19807x0 = wx1Var2;
                                                                        e0(wx1Var2);
                                                                    }
                                                                }
                                                                this.P = mediaFormatZzg;
                                                                this.Q = z23;
                                                                th3 = th5;
                                                                tx1Var2 = tx1Var7;
                                                                j13 = j15;
                                                                f81Var3 = f81Var6;
                                                                i12 = -1;
                                                                if (j13 != C.TIME_UNSET) {
                                                                    this.f20947g.getClass();
                                                                    if (SystemClock.elapsedRealtime() - jP < j13) {
                                                                        z21 = true;
                                                                    } else {
                                                                        z21 = false;
                                                                    }
                                                                } else {
                                                                    z21 = true;
                                                                }
                                                                if (!z21) {
                                                                    r15 = th3;
                                                                    break;
                                                                }
                                                                th5 = th3;
                                                                f81Var6 = f81Var3;
                                                                tx1Var7 = tx1Var2;
                                                                z23 = true;
                                                                z28 = false;
                                                                i14 = 2;
                                                            } else {
                                                                if (this.V && (this.f19793m0 || this.g0 == i14)) {
                                                                    o0();
                                                                }
                                                                long j16 = this.W;
                                                                if (j16 != C.TIME_UNSET) {
                                                                    long j17 = j16 + 100;
                                                                    this.f20947g.getClass();
                                                                    if (j17 < System.currentTimeMillis()) {
                                                                        o0();
                                                                    }
                                                                }
                                                                th2 = th5;
                                                            }
                                                            tx1Var2 = tx1Var7;
                                                            j13 = j15;
                                                            f81Var3 = f81Var6;
                                                            i12 = -1;
                                                            r15 = th2;
                                                            break;
                                                        } catch (IllegalStateException e13) {
                                                            e = e13;
                                                        }
                                                    }
                                                    boolean z30 = (this.f19801u0 || bufferInfo.presentationTimeUs < this.l) ? true : z28;
                                                    long j18 = this.f19797q0.f19310f;
                                                    boolean z31 = j18 != C.TIME_UNSET && j18 <= bufferInfo.presentationTimeUs;
                                                    ByteBuffer byteBuffer3 = this.f19782a0;
                                                    int i21 = this.Z;
                                                    int i22 = bufferInfo.flags;
                                                    j13 = j15;
                                                    long j19 = bufferInfo.presentationTimeUs;
                                                    Throwable th7 = th4;
                                                    g22 g22Var6 = this.G;
                                                    if (g22Var6 == null) {
                                                        throw th7;
                                                    }
                                                    f81Var3 = f81Var6;
                                                    tx1Var2 = tx1Var7;
                                                    boolean z32 = z31;
                                                    if (!d0(j10, j11, m22Var, byteBuffer3, i21, i22, 1, j19, z30, z32, g22Var6)) {
                                                        i12 = -1;
                                                        i20 = 4;
                                                        r15 = 0;
                                                        break;
                                                    }
                                                    j0(bufferInfo.presentationTimeUs);
                                                    i20 = 4;
                                                    boolean z33 = (bufferInfo.flags & 4) != 0;
                                                    if (!z33 && this.f19790j0 && z32) {
                                                        this.f20947g.getClass();
                                                        this.W = System.currentTimeMillis();
                                                    }
                                                    i12 = -1;
                                                    this.Z = -1;
                                                    th3 = null;
                                                    r15 = 0;
                                                    this.f19782a0 = null;
                                                    if (z33) {
                                                        o0();
                                                        break;
                                                    }
                                                    if (j13 != C.TIME_UNSET) {
                                                        this.f20947g.getClass();
                                                        if (SystemClock.elapsedRealtime() - jP < j13) {
                                                            z21 = true;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                    } else {
                                                        z21 = true;
                                                    }
                                                    if (!z21) {
                                                        r15 = th3;
                                                        break;
                                                    }
                                                    th5 = th3;
                                                    f81Var6 = f81Var3;
                                                    tx1Var7 = tx1Var2;
                                                    z23 = true;
                                                    z28 = false;
                                                    i14 = 2;
                                                }
                                                while (true) {
                                                    m22 m22Var3 = this.N;
                                                    if (m22Var3 != null) {
                                                        int i23 = 2;
                                                        if (this.g0 != 2 && !this.f19793m0) {
                                                            if (this.Y < 0) {
                                                                int iZze = m22Var3.zze();
                                                                this.Y = iZze;
                                                                if (iZze >= 0) {
                                                                    tx1Var3 = tx1Var2;
                                                                    tx1Var3.f20523e = m22Var3.e(iZze);
                                                                    tx1Var3.g();
                                                                }
                                                            } else {
                                                                tx1Var3 = tx1Var2;
                                                            }
                                                            if (this.g0 == 1) {
                                                                if (!this.V) {
                                                                    this.f19790j0 = true;
                                                                    m22Var3.z(this.Y, 0, 4, 0L);
                                                                    this.Y = i12;
                                                                    tx1Var3.f20523e = r15;
                                                                }
                                                                this.g0 = 2;
                                                            } else {
                                                                try {
                                                                    if (this.f19787f0 == 1) {
                                                                        int i24 = 0;
                                                                        while (true) {
                                                                            g22 g22Var7 = this.O;
                                                                            if (g22Var7 == null) {
                                                                                throw r15;
                                                                            }
                                                                            if (i24 >= g22Var7.f14681r.size()) {
                                                                                this.f19787f0 = 2;
                                                                                break;
                                                                            }
                                                                            byte[] bArr5 = (byte[]) this.O.f14681r.get(i24);
                                                                            ByteBuffer byteBuffer4 = tx1Var3.f20523e;
                                                                            if (byteBuffer4 == null) {
                                                                                throw r15;
                                                                            }
                                                                            byteBuffer4.put(bArr5);
                                                                            i24++;
                                                                        }
                                                                    }
                                                                    ByteBuffer byteBuffer5 = tx1Var3.f20523e;
                                                                    if (byteBuffer5 == null) {
                                                                        throw r15;
                                                                    }
                                                                    int iPosition = byteBuffer5.position();
                                                                    f81 f81Var7 = f81Var3;
                                                                    f81Var7.f14317b = r15;
                                                                    f81Var7.f14318c = r15;
                                                                    try {
                                                                        m22Var3.f(new f12(i23, this, f81Var7));
                                                                        int i25 = this.E.get();
                                                                        if (i25 != -3) {
                                                                            if (i25 == -5) {
                                                                                if (this.f19787f0 == 2) {
                                                                                    tx1Var3.g();
                                                                                    this.f19787f0 = 1;
                                                                                }
                                                                                a0(f81Var7);
                                                                            } else if (tx1Var3.f(i20)) {
                                                                                q0().c(this.f19791k0);
                                                                                if (this.f19787f0 == 2) {
                                                                                    tx1Var3.g();
                                                                                    this.f19787f0 = 1;
                                                                                }
                                                                                this.f19793m0 = true;
                                                                                if (!this.f19789i0) {
                                                                                    o0();
                                                                                } else if (!this.V) {
                                                                                    this.f19790j0 = true;
                                                                                    m22Var3.z(this.Y, 0, 4, 0L);
                                                                                    this.Y = i12;
                                                                                    tx1Var3.f20523e = r15;
                                                                                }
                                                                            } else if (this.f19789i0 || tx1Var3.d()) {
                                                                                long j20 = tx1Var3.f20524f;
                                                                                if (!P(tx1Var3)) {
                                                                                    boolean zI = tx1Var3.i();
                                                                                    if (zI) {
                                                                                        tx1Var3.f20522d.a(iPosition);
                                                                                    }
                                                                                    if (this.f19795o0) {
                                                                                        try {
                                                                                            r22 r22VarQ0 = q0();
                                                                                            ht0 ht0Var = r22VarQ0.f19308d;
                                                                                            g22 g22Var8 = this.F;
                                                                                            if (g22Var8 == null) {
                                                                                                z18 = false;
                                                                                                throw r15;
                                                                                            }
                                                                                            ht0Var.g(j20, g22Var8);
                                                                                            r22VarQ0.b();
                                                                                            z18 = false;
                                                                                            try {
                                                                                                this.f19795o0 = false;
                                                                                            } catch (MediaCodec.CryptoException e14) {
                                                                                                e = e14;
                                                                                            } catch (IllegalStateException e15) {
                                                                                                e = e15;
                                                                                                z19 = z18;
                                                                                                z11 = true;
                                                                                                r10 = z19;
                                                                                                z12 = e instanceof MediaCodec.CodecException;
                                                                                                if (!z12) {
                                                                                                    stackTrace = e.getStackTrace();
                                                                                                    if (stackTrace.length > 0) {
                                                                                                    }
                                                                                                    throw e;
                                                                                                }
                                                                                                Z(e);
                                                                                                if (z12) {
                                                                                                    r2 = z11;
                                                                                                    r2 = r10;
                                                                                                } else {
                                                                                                    r2 = z11;
                                                                                                    r2 = r10;
                                                                                                }
                                                                                                if (r2 != 0) {
                                                                                                    G();
                                                                                                }
                                                                                                o22VarL = L(e, this.U);
                                                                                                if (o22VarL.f18092a == 1101) {
                                                                                                    i10 = 4006;
                                                                                                } else {
                                                                                                    i10 = 4003;
                                                                                                }
                                                                                                throw j(o22VarL, this.F, r2, i10);
                                                                                            }
                                                                                        } catch (MediaCodec.CryptoException e16) {
                                                                                            e = e16;
                                                                                            z18 = false;
                                                                                        } catch (IllegalStateException e17) {
                                                                                            e = e17;
                                                                                            z18 = false;
                                                                                        }
                                                                                        z22 = z18;
                                                                                        throw j(e, this.F, z22, uu0.g(e.getErrorCode()));
                                                                                    }
                                                                                    z18 = false;
                                                                                    this.f19791k0 = Math.max(this.f19791k0, j20);
                                                                                    if (this.f20957r == C.TIME_UNSET || j20 - q0().a() < this.f20957r) {
                                                                                        this.f19792l0 = Math.max(this.f19792l0, j20);
                                                                                    }
                                                                                    if (x() || tx1Var3.f(536870912)) {
                                                                                        q0().c(this.f19791k0);
                                                                                    }
                                                                                    tx1Var3.j();
                                                                                    if (tx1Var3.f(268435456)) {
                                                                                        h0(tx1Var3);
                                                                                    }
                                                                                    if (this.f19801u0) {
                                                                                        long j21 = this.f19791k0;
                                                                                        if (j20 <= j21) {
                                                                                            this.f19803v0 = (j21 - j20) + 1 + this.f19803v0;
                                                                                        }
                                                                                        this.f19791k0 = j20;
                                                                                        this.f19792l0 = j20;
                                                                                        this.f19801u0 = z18;
                                                                                    }
                                                                                    N(tx1Var3);
                                                                                    int iO = O(tx1Var3);
                                                                                    long j22 = j20 + this.f19803v0;
                                                                                    if (zI) {
                                                                                        boolean z34 = z18;
                                                                                        try {
                                                                                            try {
                                                                                                z15 = true;
                                                                                                m22Var3.u(this.Y, tx1Var3.f20522d, j22, iO);
                                                                                                z20 = z34;
                                                                                            } catch (IllegalStateException e18) {
                                                                                                e = e18;
                                                                                                z11 = true;
                                                                                                r10 = z34;
                                                                                            }
                                                                                        } catch (IllegalStateException e19) {
                                                                                            e = e19;
                                                                                            z19 = z34;
                                                                                            z11 = true;
                                                                                            r10 = z19;
                                                                                        }
                                                                                    } else {
                                                                                        z20 = z18;
                                                                                        z15 = true;
                                                                                        int i26 = this.Y;
                                                                                        ByteBuffer byteBuffer6 = tx1Var3.f20523e;
                                                                                        if (byteBuffer6 == null) {
                                                                                            throw r15;
                                                                                        }
                                                                                        m22Var3.z(i26, byteBuffer6.limit(), iO, j22);
                                                                                    }
                                                                                    i13 = -1;
                                                                                    this.Y = -1;
                                                                                    tx1Var3.f20523e = r15;
                                                                                    this.f19789i0 = z15;
                                                                                    this.f19787f0 = z20 ? 1 : 0;
                                                                                    this.f19796p0.f22025d += z15 ? 1 : 0;
                                                                                    z16 = z20;
                                                                                }
                                                                                if (j13 != C.TIME_UNSET) {
                                                                                    this.f20947g.getClass();
                                                                                    if (SystemClock.elapsedRealtime() - jP < j13) {
                                                                                        z17 = z15;
                                                                                    } else {
                                                                                        z17 = z16;
                                                                                    }
                                                                                } else {
                                                                                    z17 = z15;
                                                                                }
                                                                                if (z17) {
                                                                                    i12 = i13;
                                                                                    f81Var3 = f81Var7;
                                                                                    tx1Var2 = tx1Var3;
                                                                                    i20 = 4;
                                                                                } else {
                                                                                    Trace.endSection();
                                                                                }
                                                                            } else {
                                                                                tx1Var3.g();
                                                                                if (this.f19787f0 == 2) {
                                                                                    this.f19787f0 = 1;
                                                                                }
                                                                            }
                                                                            i13 = i12;
                                                                            z15 = true;
                                                                            z16 = false;
                                                                            if (j13 != C.TIME_UNSET) {
                                                                                this.f20947g.getClass();
                                                                                if (SystemClock.elapsedRealtime() - jP < j13) {
                                                                                    z17 = z15;
                                                                                } else {
                                                                                    z17 = z16;
                                                                                }
                                                                            } else {
                                                                                z17 = z15;
                                                                            }
                                                                            if (z17) {
                                                                                i12 = i13;
                                                                                f81Var3 = f81Var7;
                                                                                tx1Var2 = tx1Var3;
                                                                                i20 = 4;
                                                                            } else {
                                                                                Trace.endSection();
                                                                            }
                                                                        } else if (x()) {
                                                                            q0().c(this.f19791k0);
                                                                        }
                                                                    } catch (sx1 e20) {
                                                                        i13 = i12;
                                                                        z15 = true;
                                                                        z16 = false;
                                                                        Z(e20);
                                                                        D(0);
                                                                        C();
                                                                    }
                                                                } catch (IllegalStateException e21) {
                                                                    e = e21;
                                                                    z10 = true;
                                                                    r10 = 0;
                                                                    z11 = z10;
                                                                }
                                                            }
                                                            Trace.endSection();
                                                        }
                                                    }
                                                    Trace.endSection();
                                                }
                                            } else {
                                                xx1 xx1Var = this.f19796p0;
                                                int i27 = xx1Var.f22026e;
                                                o42 o42Var = this.f20949i;
                                                o42Var.getClass();
                                                xx1Var.f22026e = i27 + o42Var.a(j10 - this.f20951k);
                                                D(1);
                                            }
                                        }
                                        this.f19796p0.a();
                                    } catch (MediaCodec.CryptoException e22) {
                                        e = e22;
                                        z22 = z26;
                                    }
                                } catch (IllegalStateException e23) {
                                    e = e23;
                                    z10 = true;
                                }
                            } catch (MediaCodec.CryptoException e24) {
                                e = e24;
                            }
                        } catch (MediaCodec.CryptoException e25) {
                            e = e25;
                            z26 = false;
                            z22 = z26;
                        }
                    } catch (IllegalStateException e26) {
                        e = e26;
                    }
                } catch (IllegalStateException e27) {
                    e = e27;
                }
            } catch (IllegalStateException e28) {
                e = e28;
                z10 = true;
            }
        } catch (MediaCodec.CryptoException e29) {
            e = e29;
            z22 = false;
        }
    }

    public final void p0(r22 r22Var) {
        this.f19797q0 = r22Var;
        long j10 = r22Var.f19307c;
        if (j10 != C.TIME_UNSET) {
            this.f19798s0 = true;
            g0(j10);
        }
    }

    public final r22 q0() {
        ArrayDeque arrayDeque = this.C;
        return !arrayDeque.isEmpty() ? (r22) arrayDeque.getLast() : this.f19797q0;
    }

    public final boolean r0(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        g22 g22Var = this.G;
        return g22Var == null || !Objects.equals(g22Var.f14678o, MimeTypes.AUDIO_OPUS) || j10 - j11 > 80000;
    }

    @Override // com.google.android.gms.internal.ads.ux1
    public final int t(g22 g22Var) throws dy1 {
        try {
            return Q(this.f19802v, g22Var);
        } catch (v22 e10) {
            throw j(e10, g22Var, false, 4002);
        }
    }

    public void M(g22 g22Var) {
    }

    public void N(tx1 tx1Var) {
    }

    public void g0(long j10) {
    }
}

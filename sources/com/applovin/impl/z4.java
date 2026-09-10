package com.applovin.impl;

import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C0526q2;
import com.ironsource.C0697zc;
import com.ironsource.O6;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z4 implements Comparable {
    public static final z4 A;
    public static final z4 A0;
    public static final z4 A1;
    public static final z4 A2;
    public static final z4 A3;
    public static final z4 A4;
    public static final z4 A5;
    public static final z4 A6;
    public static final z4 B;
    public static final z4 B0;
    public static final z4 B1;
    public static final z4 B2;
    public static final z4 B3;
    public static final z4 B4;
    public static final z4 B5;
    public static final z4 B6;
    public static final z4 C;
    public static final z4 C0;
    public static final z4 C1;
    public static final z4 C2;
    public static final z4 C3;
    public static final z4 C4;
    public static final z4 C5;
    public static final z4 C6;
    public static final z4 D;
    public static final z4 D0;
    public static final z4 D1;
    public static final z4 D2;
    public static final z4 D3;
    public static final z4 D4;
    public static final z4 D5;
    public static final z4 D6;
    public static final z4 E;
    public static final z4 E0;
    public static final z4 E1;
    public static final z4 E2;
    public static final z4 E3;
    public static final z4 E4;
    public static final z4 E5;
    public static final z4 E6;
    public static final z4 F;
    public static final z4 F0;
    public static final z4 F1;
    public static final z4 F2;
    public static final z4 F3;
    public static final z4 F4;
    public static final z4 F5;
    public static final z4 F6;
    public static final z4 G;
    public static final z4 G0;
    public static final z4 G1;
    public static final z4 G2;
    public static final z4 G3;
    public static final z4 G4;
    public static final z4 G5;
    public static final z4 G6;
    public static final z4 H;
    public static final z4 H0;
    public static final z4 H1;
    public static final z4 H2;
    public static final z4 H3;
    public static final z4 H4;
    public static final z4 H5;
    public static final z4 H6;
    public static final z4 I;
    public static final z4 I0;
    public static final z4 I1;
    public static final z4 I2;
    public static final z4 I3;
    public static final z4 I4;
    public static final z4 I5;
    public static final z4 I6;
    public static final z4 J;
    public static final z4 J0;
    public static final z4 J1;
    public static final z4 J2;
    public static final z4 J3;
    public static final z4 J4;
    public static final z4 J5;
    public static final z4 J6;
    public static final z4 K;
    public static final z4 K0;
    public static final z4 K1;
    public static final z4 K2;
    public static final z4 K3;
    public static final z4 K4;
    public static final z4 K5;
    public static final z4 K6;
    public static final z4 L;
    public static final z4 L0;
    public static final z4 L1;
    public static final z4 L2;
    public static final z4 L3;
    public static final z4 L4;
    public static final z4 L5;
    public static final z4 L6;
    public static final z4 M;
    public static final z4 M0;
    public static final z4 M1;
    public static final z4 M2;
    public static final z4 M3;
    public static final z4 M4;
    public static final z4 M5;
    public static final z4 M6;
    public static final z4 N;
    public static final z4 N0;
    public static final z4 N1;
    public static final z4 N2;
    public static final z4 N3;
    public static final z4 N4;
    public static final z4 N5;
    public static final z4 N6;
    public static final z4 O;
    public static final z4 O0;
    public static final z4 O1;
    public static final z4 O2;
    public static final z4 O3;
    public static final z4 O4;
    public static final z4 O5;
    public static final z4 O6;
    public static final z4 P;
    public static final z4 P0;
    public static final z4 P1;
    public static final z4 P2;
    public static final z4 P3;
    public static final z4 P4;
    public static final z4 P5;
    public static final z4 P6;
    public static final z4 Q;
    public static final z4 Q0;
    public static final z4 Q1;
    public static final z4 Q2;
    public static final z4 Q3;
    public static final z4 Q4;
    public static final z4 Q5;
    public static final z4 Q6;
    public static final z4 R;
    public static final z4 R0;
    public static final z4 R1;
    public static final z4 R2;
    public static final z4 R3;
    public static final z4 R4;
    public static final z4 R5;
    public static final z4 R6;
    public static final z4 S;
    public static final z4 S0;
    public static final z4 S1;
    public static final z4 S2;
    public static final z4 S3;
    public static final z4 S4;
    public static final z4 S5;
    public static final z4 S6;
    public static final z4 T;
    public static final z4 T0;
    public static final z4 T1;
    public static final z4 T2;
    public static final z4 T3;
    public static final z4 T4;
    public static final z4 T5;
    public static final z4 T6;
    public static final z4 U;
    public static final z4 U0;
    public static final z4 U1;
    public static final z4 U2;
    public static final z4 U3;
    public static final z4 U4;
    public static final z4 U5;
    public static final z4 U6;
    public static final z4 V;
    public static final z4 V0;
    public static final z4 V1;
    public static final z4 V2;
    public static final z4 V3;
    public static final z4 V4;
    public static final z4 V5;
    public static final z4 V6;
    public static final z4 W;
    public static final z4 W0;
    public static final z4 W1;
    public static final z4 W2;
    public static final z4 W3;
    public static final z4 W4;
    public static final z4 W5;
    public static final z4 W6;
    public static final z4 X;
    public static final z4 X0;
    public static final z4 X1;
    public static final z4 X2;
    public static final z4 X3;
    public static final z4 X4;
    public static final z4 X5;
    public static final z4 X6;
    public static final z4 Y;
    public static final z4 Y0;
    public static final z4 Y1;
    public static final z4 Y2;
    public static final z4 Y3;
    public static final z4 Y4;
    public static final z4 Y5;
    public static final z4 Y6;
    public static final z4 Z;
    public static final z4 Z0;
    public static final z4 Z1;
    public static final z4 Z2;
    public static final z4 Z3;
    public static final z4 Z4;
    public static final z4 Z5;
    public static final z4 Z6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final z4 f10098a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final z4 f10099a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final z4 f10100a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final z4 f10101a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final z4 f10102a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final z4 f10103a5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final z4 f10104a6;

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    public static final z4 f10105a7;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final z4 f10106b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final z4 f10107b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final z4 f10108b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final z4 f10109b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final z4 f10110b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final z4 f10111b5;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final z4 f10112b6;

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    public static final z4 f10113b7;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final z4 f10115c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final z4 f10116c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final z4 f10117c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final z4 f10118c3;
    public static final z4 c4;
    public static final z4 c5;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final z4 f10119c6;

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    public static final z4 f10120c7;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final z4 f10122d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final z4 f10123d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final z4 f10124d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final z4 f10125d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final z4 f10126d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final z4 f10127d5;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final z4 f10128d6;

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    public static final z4 f10129d7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z4 f10130e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final z4 f10131e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final z4 f10132e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final z4 f10133e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final z4 f10134e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final z4 f10135e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final z4 f10136e5;

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final z4 f10137e6;

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    public static final z4 f10138e7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z4 f10139f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final z4 f10140f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final z4 f10141f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final z4 f10142f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final z4 f10143f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final z4 f10144f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final z4 f10145f5;

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final z4 f10146f6;

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    public static final z4 f10147f7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z4 f10148g;
    public static final z4 g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final z4 f10149g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final z4 f10150g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final z4 f10151g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final z4 f10152g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final z4 f10153g5;

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final z4 f10154g6;

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    public static final z4 f10155g7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z4 f10156h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final z4 f10157h0;
    public static final z4 h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final z4 f10158h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final z4 f10159h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final z4 f10160h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final z4 f10161h5;

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final z4 f10162h6;
    public static final z4 h7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z4 f10163i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final z4 f10164i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final z4 f10165i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final z4 f10166i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final z4 f10167i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final z4 f10168i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final z4 f10169i5;

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final z4 f10170i6;

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    public static final z4 f10171i7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z4 f10172j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final z4 f10173j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final z4 f10174j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final z4 f10175j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final z4 f10176j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final z4 f10177j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final z4 f10178j5;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final z4 f10179j6;

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    public static final z4 f10180j7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z4 f10181k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final z4 f10182k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final z4 f10183k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final z4 f10184k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final z4 f10185k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final z4 f10186k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final z4 f10187k5;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final z4 f10188k6;

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    public static final z4 f10189k7;
    public static final z4 l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final z4 f10190l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final z4 f10191l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final z4 f10192l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final z4 f10193l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final z4 f10194l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final z4 f10195l5;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final z4 f10196l6;

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    public static final z4 f10197l7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z4 f10198m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final z4 f10199m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final z4 f10200m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final z4 f10201m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final z4 f10202m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final z4 f10203m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final z4 f10204m5;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static final z4 f10205m6;
    public static final z4 m7;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z4 f10206n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final z4 f10207n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final z4 f10208n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final z4 f10209n2;
    public static final z4 n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final z4 f10210n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final z4 f10211n5;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static final z4 f10212n6;

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public static final z4 f10213n7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z4 f10214o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final z4 f10215o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final z4 f10216o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final z4 f10217o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final z4 f10218o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final z4 f10219o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final z4 f10220o5;
    public static final z4 o6;
    public static final z4 o7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z4 f10221p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final z4 f10222p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final z4 f10223p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final z4 f10224p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final z4 f10225p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final z4 f10226p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final z4 f10227p5;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public static final z4 f10228p6;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    public static final z4 f10229p7;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z4 f10230q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final z4 f10231q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final z4 f10232q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final z4 f10233q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final z4 f10234q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final z4 f10235q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final z4 f10236q5;
    public static final z4 q6;

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    public static final z4 f10237q7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z4 f10238r;
    public static final z4 r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final z4 f10239r1;
    public static final z4 r2;
    public static final z4 r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final z4 f10240r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final z4 f10241r5;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public static final z4 f10242r6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z4 f10243s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final z4 f10244s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final z4 f10245s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final z4 f10246s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final z4 f10247s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final z4 f10248s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final z4 f10249s5;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public static final z4 f10250s6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z4 f10251t;
    public static final z4 t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final z4 f10252t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final z4 f10253t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final z4 f10254t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final z4 f10255t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final z4 f10256t5;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public static final z4 f10257t6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z4 f10258u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final z4 f10259u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final z4 f10260u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final z4 f10261u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final z4 f10262u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final z4 f10263u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final z4 f10264u5;
    public static final z4 u6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z4 f10265v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final z4 f10266v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final z4 f10267v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final z4 f10268v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final z4 f10269v3;
    public static final z4 v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final z4 f10270v5;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public static final z4 f10271v6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z4 f10272w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final z4 f10273w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final z4 f10274w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final z4 f10275w2;
    public static final z4 w3;
    public static final z4 w4;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final z4 f10276w5;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public static final z4 f10277w6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z4 f10278x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final z4 f10279x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final z4 f10280x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final z4 f10281x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final z4 f10282x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final z4 f10283x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final z4 f10284x5;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public static final z4 f10285x6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final z4 f10286y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final z4 f10287y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final z4 f10288y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final z4 f10289y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final z4 f10290y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final z4 f10291y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final z4 f10292y5;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public static final z4 f10293y6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z4 f10294z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final z4 f10295z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final z4 f10296z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final z4 f10297z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final z4 f10298z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final z4 f10299z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final z4 f10300z5;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final z4 f10301z6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f10114c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f10121d = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f10130e = a("is_disabled", bool);
        f10139f = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f10148g = a("rss", bool2);
        f10156h = a("rssoitf", bool);
        f10163i = a("cpoitf", bool);
        f10172j = a("device_token", "");
        f10181k = a("is_verbose_logging", bool);
        l = a("sc", "");
        f10198m = a("sc2", "");
        f10206n = a("sc3", "");
        f10214o = a("server_installed_at", "");
        f10221p = a("clear_completion_callback_on_failure", bool);
        f10230q = a("sicd_ms", 0L);
        f10238r = a("logcat_max_line_size", 1000);
        f10243s = a("exception_handler_enabled", bool2);
        f10251t = a(O6.f26751u, "");
        f10258u = a("lsu", bool);
        f10265v = a("tla_ms", -1L);
        f10272w = a("uactlac", bool);
        f10278x = a("vsk", bool);
        f10286y = a("avt_ms", -1L);
        f10294z = a("avsves", bool);
        A = a("avrctr", "");
        B = a("error_reporter_v1_sample_percent", 100);
        C = a("health_events_reporter_v1_endpoint", "https://sts.applovin.com/v1/stats/sdk");
        D = a("health_events_reporter_v1_event_level_sampling_percentages", "");
        Float fValueOf = Float.valueOf(-1.0f);
        E = a("health_events_reporter_v1_ad_sampling_percent", fValueOf);
        F = a("health_events_reporter_v1_error_sampling_percent", fValueOf);
        G = a("health_events_reporter_v1_user_session_sampling_percent", fValueOf);
        H = a("health_events_reporter_v1_sampling_percent", Float.valueOf(1.0f));
        I = a("health_events_reporter_v1_batch_grouped_events", bool);
        J = a("health_events_reporter_should_skip_al_events_in_max", bool);
        K = a("health_events_reporter_valid_network_status_codes", "");
        L = a("health_events_reporter_include_cached_asset_info", bool);
        M = a("health_events_reporter_include_html_source", bool);
        N = a("stps", 2);
        O = a("auxiliary_operations_threads", 1);
        P = a("apsobt", bool2);
        Q = a("tmtp", 1);
        R = a("network_thread_count", 2);
        S = a("ntp", 5);
        T = a("ueq", bool);
        U = a("coretc", 1);
        V = a("cachetc", 1);
        W = a("mtc", 1);
        X = a("ttc", 1);
        Y = a("otc", 1);
        Z = a("uaeq", bool);
        f10098a0 = a("init_omsdk", bool2);
        f10106b0 = a("omsdk_partner_name", "applovin");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10115c0 = ca.k("ttc_max_click_duration_ms", 1L, timeUnit);
        f10122d0 = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f10131e0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f10140f0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        g0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        f10157h0 = a("ttc_edge_buffer_dp", 0);
        f10164i0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f10173j0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f10182k0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f10190l0 = a("adserver_endpoint", "https://a.applovin.com/");
        f10199m0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
        f10207n0 = a("api_endpoint", "https://d.applovin.com/");
        f10215o0 = a("api_backup_endpoint", "https://d.applvn.com/");
        f10222p0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        f10231q0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        r0 = a("eete", "https://b.applovin.com/");
        f10244s0 = a("eetbe", "");
        t0 = a("webview_network_error_endpoints_to_report", "applovin.com,applvn.com");
        f10259u0 = a("vle", "");
        f10266v0 = a("vlbe", "");
        f10273w0 = a("vlep", "");
        f10279x0 = a("token_type_prefixes_r", "4!");
        f10287y0 = a("token_type_prefixes_arj", "json_v3!");
        f10295z0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        A0 = a("axon_events", String.join(",", "rewarded_ad_opportunity", "ad_view", "ad_clicked", "page_view", "view_item", "add_to_cart", "begin_checkout", "purchase", "add_payment_info", "remove_from_cart", "view_cart", "wishlist_updated", "refund_requested", "financial_deposit", "financial_withdraw", "financial_transaction", "level_start", "level_complete", "level_fail", "virtual_resource_transaction", "tutorial_complete", "energy_depleted", "use_prop", "game_shop_enter", "generate_lead", AppLovinEventTypes.USER_LOGGED_IN, "sign_up", AppLovinEventTypes.USER_EXECUTED_SEARCH, "product_review", "app_open", "account_verification_start", "account_verification_complete", C0526q2.f30055u, "account_linked", "friend_invite", "gift_transaction", "group_joined", "chat_sent", "post_view", "post_created", "subscribe", "start_trial"));
        B0 = a("max_tracked_axon_events", 20);
        C0 = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
        D0 = a("cache_max_size_mb", -1);
        E0 = a("precache_delimiters", ")]', ");
        F0 = a("ad_resource_caching_enabled", bool2);
        G0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        H0 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        I0 = a("resource_max_filename_length", 255);
        J0 = a("ccrc", bool);
        K0 = a("ustpfcrc", bool);
        L0 = a("mcct", 3);
        M0 = a("mchct", 3);
        N0 = a("dfirf", bool);
        O0 = a("dfipf", bool);
        P0 = a("dcrome", bool);
        Q0 = a("dcrobs", bool);
        R0 = a("pcro", bool);
        S0 = a("serfaad", bool);
        T0 = a("mdafra", 1);
        U0 = a("ssch", bool2);
        V0 = a("suaf", bool);
        W0 = a("lfblrs", bool);
        X0 = a("pawnrrm", bool);
        Y0 = a("rctoa", bool);
        Z0 = a("staurao", bool);
        f10099a1 = a("altb_ms", -1L);
        f10107b1 = a("ape", bool);
        f10116c1 = a("pafqi", bool);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f10123d1 = ca.k("pae_ms", 5L, timeUnit2);
        f10132e1 = ca.k("pamttl_ms", 5L, timeUnit);
        f10141f1 = a("saewib", bool);
        f10149g1 = a("fsae_ms", -1L);
        h1 = a("raae", bool);
        f10165i1 = a("vr_retry_count_v1", 1);
        f10174j1 = a("cr_retry_count_v1", 1);
        f10183k1 = a("saru", bool);
        f10191l1 = a("spvtzians", bool);
        f10200m1 = a("close_button_touch_area", 0);
        f10208n1 = a("close_button_outside_touch_area", 0);
        f10216o1 = a("creative_debugger_enabled", bool2);
        f10223p1 = a("smdfhcdb", bool2);
        f10232q1 = a("use_background_view_for_ad_clicks", bool2);
        f10239r1 = ca.k("viewability_adview_imp_delay_ms", 1L, timeUnit);
        f10245s1 = a("viewability_adview_banner_min_width", 320);
        f10252t1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f10260u1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f10267v1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f10274w1 = a("viewability_adview_leader_min_width", 728);
        f10280x1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f10288y1 = a("viewability_adview_native_min_width", 0);
        f10296z1 = a("viewability_adview_native_min_height", 0);
        A1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        B1 = ca.k("viewability_timer_min_visible_ms", 1L, timeUnit);
        C1 = a("viewability_timer_interval_ms", 100L);
        D1 = a("expandable_close_button_size", 27);
        E1 = a("expandable_h_close_button_margin", 10);
        F1 = a("expandable_t_close_button_margin", 10);
        G1 = a("expandable_lhs_close_button", bool);
        H1 = a("expandable_close_button_touch_area", 0);
        I1 = a("forward_lifecycle_events_to_adview_webview", bool);
        J1 = a("forward_in_app_browser_events_to_adview_webview", bool);
        K1 = a("forward_external_redirect_events_to_adview_webview", bool);
        L1 = a("forward_preload_events_to_adview_webview", bool);
        M1 = a("iaad", bool);
        N1 = ca.k("fullscreen_ad_pending_display_state_timeout_ms", 10L, timeUnit);
        O1 = ca.k("fullscreen_ad_showing_state_timeout_ms", 2L, timeUnit2);
        P1 = a("lhs_close_button_video", bool);
        Q1 = a("close_button_right_margin_video", 4);
        R1 = a("close_button_size_video", 30);
        S1 = a("close_button_top_margin_video", 8);
        T1 = a("video_countdown_clock_margin", 10);
        U1 = a("video_countdown_clock_gravity", 83);
        V1 = a("countdown_clock_size", 32);
        W1 = a("countdown_clock_stroke_size", 4);
        X1 = a("countdown_clock_text_size", 28);
        Y1 = a("draw_countdown_clock", bool2);
        Z1 = a("inter_display_delay", 200L);
        f10100a2 = a("maximum_close_button_delay_seconds", 999L);
        f10108b2 = a("respect_close_button", bool2);
        f10117c2 = a("lhs_skip_button", bool2);
        f10124d2 = a("mute_controls_enabled", bool);
        f10133e2 = a("allow_user_muting", bool2);
        f10142f2 = a("mute_videos", bool);
        f10150g2 = a("show_mute_by_default", bool);
        f10158h2 = a("mute_with_user_settings", bool2);
        f10166i2 = a("mute_button_size", 32);
        f10175j2 = a("mute_button_margin", 10);
        f10184k2 = a("mute_button_gravity", 85);
        f10192l2 = a("progress_bar_step", 25L);
        f10201m2 = a("progress_bar_scale", 10000);
        f10209n2 = a("progress_bar_vertical_padding", -8);
        f10217o2 = a("vs_buffer_indicator_size", 50);
        f10224p2 = a("video_zero_length_as_computed", bool);
        f10233q2 = a("set_poststitial_muted_initial_delay_ms", 500L);
        r2 = a("fsahrpg", bool2);
        f10246s2 = a("eaafrwsoa", bool2);
        f10253t2 = a("postitial_progress_bar_step_ms", 25L);
        f10261u2 = a("postitial_progress_bar_on_bottom", bool2);
        f10268v2 = a("postitial_progress_bar_vertical_padding", -8);
        f10275w2 = a("postitial_progress_bar_scale", 10000);
        f10281x2 = a("fahosu", bool);
        f10289y2 = a("system_insets_mask", Integer.valueOf(q7.g()));
        f10297z2 = a("system_bars_hide_list", "");
        A2 = a("aarwdc", bool);
        B2 = a("track_app_killed", bool);
        C2 = a("track_ad_duration", bool);
        D2 = ca.k("track_ad_duration_interval_ms", 1L, timeUnit);
        E2 = a("simplified_app_killed_detection", bool);
        F2 = ca.k("app_closed_time_threshold_for_app_killed_event_ms", 60L, timeUnit);
        G2 = a("track_app_killed_during_mediated_ad", bool);
        H2 = a("track_mediated_ad_duration_interval_ms", -1L);
        I2 = ca.k("app_closed_time_threshold_for_app_killed_during_mediated_ad_event_ms", 60L, timeUnit);
        J2 = a("nsuttcl", bool);
        K2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit.toMillis(10L)));
        L2 = a("submit_postback_retries", 4);
        M2 = a("max_postback_attempts", 3);
        N2 = a("max_persisted_postbacks", 100);
        O2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit.toMillis(7L)));
        P2 = a("sossp", bool);
        Q2 = a("spp", bool2);
        R2 = a("fire_native_ad_postbacks_from_webview", bool);
        S2 = a("use_requests_for_native_ad_click_postbacks", bool);
        T2 = a("preload_postback_webview", bool);
        U2 = a("sejwp", bool);
        V2 = ca.k("ejt_ms", 5L, timeUnit);
        W2 = a("stahcmi", bool);
        X2 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        Y2 = a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        Z2 = a("http_socket_timeout", Integer.valueOf((int) timeUnit.toMillis(20L)));
        f10101a3 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f10109b3 = a("fetch_ad_retry_count_v1", 1);
        f10118c3 = a("faer", bool);
        f10125d3 = a("faroae", bool);
        f10134e3 = a("submit_data_retry_count_v1", 1);
        f10143f3 = a("response_buffer_size", 16000);
        f10151g3 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f10159h3 = a("fetch_basic_settings_retry_count", 3);
        f10167i3 = a("fetch_basic_settings_on_reconnect", bool);
        f10176j3 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f10185k3 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit.toMillis(2L)));
        f10193l3 = a("idflrwbe", bool);
        f10202m3 = a("falawpr", bool);
        n3 = a("sort_query_parameters", bool);
        f10218o3 = ca.k("communicator_request_timeout_ms", 10L, timeUnit);
        f10225p3 = a("communicator_request_retry_count", 3);
        f10234q3 = ca.k("communicator_request_retry_delay_ms", 2L, timeUnit);
        r3 = a("rfbsd_ms", -1L);
        f10247s3 = a("ehkpd_ms", 500L);
        f10254t3 = a("rironc", bool);
        f10262u3 = a("rroncbd", bool);
        f10269v3 = ca.k("wverc_ms", 5L, timeUnit);
        w3 = a("scrsifm", bool);
        f10282x3 = a("suohfrl", bool);
        f10290y3 = a("lvrc", 1);
        f10298z3 = a("spbuuws", bool);
        A3 = a("session_tracking_cooldown_on_event_fire", bool2);
        B3 = a("session_tracking_resumed_cooldown_minutes", 90L);
        C3 = a("session_tracking_paused_cooldown_minutes", 90L);
        D3 = a("qq", bool);
        E3 = a("qq1", bool2);
        F3 = a("qq2", bool);
        G3 = a("qq3", bool2);
        H3 = a("qq4", bool2);
        I3 = a("qq5", bool2);
        J3 = a("qq6", bool2);
        K3 = a("qq7", bool2);
        L3 = a("qq8", bool2);
        M3 = a("qq9", bool);
        N3 = a("qq10", bool2);
        O3 = a("qq11", bool2);
        P3 = a("qq12", bool2);
        Q3 = a("pui", bool2);
        R3 = a("plugin_version", "");
        S3 = a("validate_admob_adapter_sdk_version", bool2);
        T3 = a("ccbtbsic", bool);
        U3 = a("hgn", bool2);
        V3 = a("cso", bool2);
        W3 = a("cfs", bool2);
        X3 = a("cmi", bool2);
        Y3 = a("crat", bool2);
        Z3 = a("cvs", bool2);
        f10102a4 = a("caf", bool2);
        f10110b4 = a("cf", bool2);
        c4 = a("cmtl", bool2);
        f10126d4 = a("cnr", bool2);
        f10135e4 = a("ccr", bool);
        f10144f4 = a("adr", bool2);
        f10152g4 = a("volume_normalization_factor", Float.valueOf(100.0f));
        f10160h4 = a("system_user_agent_collection_enabled", bool);
        f10168i4 = a("user_agent_collection_enabled", bool);
        f10177j4 = a("use_cached_user_agent_as_default", bool2);
        f10186k4 = a("collect_device_angle", bool2);
        f10194l4 = a("collect_device_movement", bool2);
        f10203m4 = a("movement_degradation", Float.valueOf(0.75f));
        f10210n4 = a("device_sensor_period_ms", 250);
        f10219o4 = a("mps", "");
        f10226p4 = a("mpsl", 3);
        f10235q4 = a(C0697zc.f31354c, "com.applovin,dalvik,java,android,com.android");
        f10240r4 = a("cmps", bool);
        f10248s4 = a("rmps", bool);
        f10255t4 = a("collect_webview_package_info", bool);
        f10263u4 = a("webview_package_names", "com.google.android.webview,com.android.webview");
        v4 = a("collect_opengl_version", bool);
        w4 = a("ncre", bool);
        f10283x4 = a("ncrs", "4,5,6,7,8,11,16");
        f10291y4 = a("ncrcs", bool);
        f10299z4 = a("ncrcai", bool2);
        A4 = a("tmas", "");
        B4 = a("tmasl", "");
        C4 = a("tmahl", 1);
        D4 = a("suia", bool2);
        E4 = a("asicl", 1);
        F4 = a("aeicl", 1);
        G4 = a("aeisupf", bool);
        H4 = a("aeistl", -1);
        I4 = a("aeistsr", CampaignEx.CLICKMODE_ON);
        J4 = a("csbi", bool);
        K4 = ca.k("btt_ms", 20L, timeUnit);
        L4 = a("chs", bool);
        M4 = a("dltc", "");
        N4 = a("sy_stc", JsonUtils.EMPTY_JSON);
        O4 = a("se_stc", JsonUtils.EMPTY_JSON);
        P4 = a("gl_stc", JsonUtils.EMPTY_JSON);
        Q4 = a("crpaf", bool);
        R4 = a("umsm", bool);
        S4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        T4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        U4 = a("vast_max_response_length", 640000);
        V4 = a("vast_max_wrapper_depth", 5);
        W4 = a("vast_unsupported_video_extensions", "ogv,flv");
        X4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        Y4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        Z4 = a("vast_wrapper_resolution_retry_count_v1", 1);
        f10103a5 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f10111b5 = a("vast_industry_icon_max_size", 20);
        c5 = a("vast_industry_icon_margin", 12);
        f10127d5 = a("vast_industry_icon_gravity", 85);
        f10136e5 = a("vast_native_mute_button_size", 24);
        f10145f5 = a("vast_native_play_pause_button_size", 24);
        f10153g5 = a("vast_native_video_widget_padding", 6);
        f10161h5 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f10169i5 = a("vast_native_video_widgets_enabled", bool2);
        f10178j5 = a("vast_replay_video_upon_completion", bool2);
        f10187k5 = a("vast_replay_icon_size", 64);
        f10195l5 = a("vcjfhr", bool);
        f10204m5 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f10211n5 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        f10220o5 = a("vast_fire_trackers_from_webview", bool);
        f10227p5 = a("ree", bool2);
        w4.a aVar = w4.a.DEFAULT;
        f10236q5 = a("ree_t", Integer.valueOf(aVar.b()));
        f10241r5 = a("btee", bool2);
        f10249s5 = a("btet", Integer.valueOf(aVar.b()));
        f10256t5 = a("reetoa", bool);
        f10264u5 = a("reet_msfs", Integer.valueOf(aVar.b()));
        w4.a aVar2 = w4.a.V2;
        f10270v5 = a("reet_msma", Integer.valueOf(aVar2.b()));
        f10276w5 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f10284x5 = a("reet_asfp", Integer.valueOf(aVar.b()));
        f10292y5 = a("reet_asfg", Integer.valueOf(aVar.b()));
        f10300z5 = a("reet_aset", Integer.valueOf(aVar.b()));
        A5 = a("reet_asaet", Integer.valueOf(aVar2.b()));
        B5 = a("reet_esdi", Integer.valueOf(aVar.b()));
        C5 = a("reet_esrp", Integer.valueOf(aVar.b()));
        D5 = a("reet_lv", Integer.valueOf(aVar2.b()));
        E5 = a("apdra", bool);
        F5 = a("apdrfs", bool);
        G5 = a("apdrma", bool);
        H5 = a("apdrmd", bool);
        I5 = a("apdrfa", bool);
        J5 = a("apdrev", bool);
        K5 = a("apdrdi", bool);
        L5 = a("apdrrp", bool);
        M5 = a("server_timestamp_ms", 0L);
        N5 = a("device_timestamp_ms", 0L);
        O5 = a("stpfef", bool);
        P5 = a("gzip_min_length", 0);
        Q5 = a("gzip_encoding_default", bool);
        R5 = a("fetch_settings_gzip", bool);
        S5 = a("device_init_gzip", bool);
        T5 = a("fetch_ad_gzip", bool);
        U5 = a("event_tracking_gzip", bool);
        V5 = a("reward_postback_gzip", bool);
        W5 = a("avg", bool);
        X5 = a("handle_render_process_gone", bool2);
        Y5 = a("rworpg", bool2);
        Z5 = a("fdadaomr", bool2);
        f10104a6 = a("vfswccar", bool);
        f10112b6 = a("sparafad", bool);
        f10119c6 = a("fahctdmr", bool);
        f10128d6 = a("mmcarc", bool);
        f10137e6 = a("teorpc", bool);
        f10146f6 = a("set_webview_render_process_client", bool);
        f10154g6 = a("disable_webview_hardware_acceleration", bool);
        f10162h6 = a("anr_detection_enabled", bool);
        f10170i6 = a("anr_trigger_millis", 4000L);
        f10179j6 = a("anr_touch_millis", Long.valueOf(Xa.C));
        f10188k6 = a("anr_check_millis", Long.valueOf(Xa.C));
        f10196l6 = a("spadib", bool);
        f10205m6 = a("uobid", bool2);
        f10212n6 = a("bvde", bool);
        o6 = a("bvdidm", 1000L);
        f10228p6 = a("bvdim", 4000L);
        q6 = a("bvdrs", 10);
        f10242r6 = a("bvdct", 230);
        f10250s6 = a("bvdict", 3);
        f10257t6 = a("bvad", bool);
        u6 = a("bvebb", bool2);
        f10271v6 = a("bvscb", bool2);
        f10277w6 = a("bvlmtb", -1L);
        f10285x6 = a("bvsafw", bool2);
        f10293y6 = a("bvdtr", 2);
        f10301z6 = a("bvdtc", 2);
        A6 = a("stcpc", bool);
        B6 = a("stcic", bool2);
        C6 = a("qjscwwvl", bool);
        D6 = a("web_contents_debugging_enabled", bool);
        E6 = a("fcioiauiidb", bool2);
        F6 = a("teouauiidb", bool2);
        G6 = a("usc", bool);
        H6 = a("should_apply_web_view_settings_to_web_view_button", bool);
        I6 = a("should_use_cached_screen_size_for_foldable_devices", bool2);
        J6 = a("should_persist_shared_prefs_with_background_commit", bool);
        K6 = a("wvmldt", -1);
        L6 = a("fmldt", -1);
        M6 = a("csl", -1);
        N6 = a("should_use_applovin_adaptive_sizing_formula", bool);
        O6 = a("cdbpn", bool);
        P6 = a("cavdi", bool);
        Q6 = a("pvdiaqp", bool);
        R6 = a("sudbia", bool);
        S6 = a("pbpn", "");
        T6 = a("nvelifapd", bool);
        U6 = a("ssarwusa", bool);
        V6 = a("ignored_auto_redirect_schemes", String.join(",", "about", "data", X3.i.f27782b));
        W6 = a("esowod", bool);
        X6 = a("sswskan", bool);
        Y6 = a("rfipt", bool);
        Z6 = a("fraseon", bool);
        f10105a7 = a("config_consent_dialog_state", "unknown");
        f10113b7 = a("country_code", "");
        f10120c7 = a("approved_installers_for_package_name_override", "com.google.android.packageinstaller");
        f10129d7 = a("consent_flow_doc_url", "https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow");
        f10138e7 = a("consent_flow_unity_doc_url", "https://support.axon.ai/en/max/unity/overview/terms-and-privacy-policy-flow");
        f10147f7 = a("cfadtml", 20);
        f10155g7 = a("cfgcsmrc", -1);
        h7 = a("cfgcsrec", String.valueOf(3));
        f10171i7 = a("enable_custom_tabs_service", bool2);
        f10180j7 = a("custom_tabs_chrome_package_names", "com.android.chrome");
        f10189k7 = a("custom_tabs_prefer_default_browser", bool2);
        f10197l7 = a("custom_tabs_animation_enabled", bool2);
        m7 = a("custom_tabs_open_external_browser_on_failure", bool2);
        f10213n7 = a("gawvbu", "https://applovin.com");
        o7 = a("c_sticky_topics", "safedk_init,user_info");
        f10229p7 = a("communicator_enabled", bool2);
        f10237q7 = a("adse", bool2);
    }

    public z4(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f10302a = str;
        this.f10303b = obj;
    }

    public static Collection c() {
        return Collections.synchronizedCollection(f10121d.values());
    }

    public Object a() {
        return this.f10303b;
    }

    public String b() {
        return this.f10302a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof z4)) {
            return 0;
        }
        return this.f10302a.compareTo(((z4) obj).b());
    }

    public Object a(Object obj) {
        return this.f10303b.getClass().cast(obj);
    }

    public static z4 a(String str, Object obj) {
        if (obj != null) {
            if (f10114c.contains(obj.getClass())) {
                z4 z4Var = new z4(str, obj);
                Map map = f10121d;
                if (!map.containsKey(str)) {
                    map.put(str, z4Var);
                    return z4Var;
                }
                throw new IllegalArgumentException(defpackage.e.n("Setting has already been used: ", str));
            }
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static z4 a(String str) {
        return (z4) f10121d.get(str);
    }
}

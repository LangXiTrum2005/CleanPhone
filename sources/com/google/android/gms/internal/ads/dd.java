package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13496a;

    static {
        ka1 ka1Var;
        uo0 uo0Var = new uo0(11);
        uo0Var.l(rc.f19519a, -42L, -64L);
        uo0Var.l(rc.f19521b, -6L, -53L);
        uo0Var.l(rc.f19523c, -41L, -31L);
        uo0Var.l(rc.f19525d, -40L, -28L);
        uo0Var.l(rc.f19527e, -29L, -37L);
        uo0Var.l(rc.f19529f, -80L, -32L);
        uo0Var.l(rc.f19531g, -17L, -36L);
        uo0Var.l(rc.f19532h, -82L, -35L);
        uo0Var.l(rc.f19534i, -63L, -52L);
        uo0Var.l(rc.f19536j, -23L, -11L);
        uo0Var.l(rc.f19538k, -69L, -68L);
        uo0Var.l(rc.l, -62L, -55L);
        uo0Var.l(rc.f19541m, -78L, -25L);
        uo0Var.l(rc.f19543n, -71L, -3L);
        uo0Var.l(rc.f19545o, -18L, -4L);
        uo0Var.l(rc.f19546p, -67L, -19L);
        uo0Var.l(rc.f19547q, -58L);
        uo0Var.l(rc.f19548r, -2L);
        uo0Var.l(rc.f19549s, -34L);
        uo0Var.l(rc.f19550t, -30L);
        uo0Var.l(rc.f19551u, -56L);
        uo0Var.l(rc.f19553w, -57L);
        uo0Var.l(rc.f19554x, -66L);
        uo0Var.l(rc.f19555y, -60L);
        uo0Var.l(rc.f19556z, -27L);
        uo0Var.l(rc.A, -26L);
        uo0Var.l(rc.B, -74L);
        uo0Var.l(rc.C, -77L);
        uo0Var.l(rc.E, -38L);
        uo0Var.l(rc.G, -79L);
        uo0Var.l(rc.H, -7L);
        uo0Var.l(rc.I, -51L);
        uo0Var.l(rc.J, -9L);
        uo0Var.l(rc.K, -47L);
        uo0Var.l(rc.L, -70L);
        uo0Var.l(rc.M, -14L);
        uo0Var.l(rc.N, -5L);
        uo0Var.l(rc.O, -39L);
        uo0Var.l(rc.P, -8L);
        uo0Var.l(rc.Q, -54L);
        uo0Var.l(rc.R, -15L);
        uo0Var.l(rc.S, -12L);
        uo0Var.l(rc.T, -21L);
        uo0Var.l(rc.U, -43L);
        uo0Var.l(rc.F, -20L);
        uo0Var.l(rc.D, -81L);
        uo0Var.l(rc.V, -46L);
        uo0Var.l(rc.W, -61L);
        uo0Var.l(rc.X, -44L);
        uo0Var.l(rc.f19552v, -59L);
        uo0Var.l(rc.Y, -49L);
        uo0Var.l(rc.Z, -75L);
        uo0Var.l(rc.f19520a0, -24L);
        uo0Var.l(rc.f19530f0, -13L);
        uo0Var.l(rc.g0, -1L);
        uo0Var.l(rc.f19522b0, -33L);
        uo0Var.l(rc.f19524c0, -45L);
        uo0Var.l(rc.f19526d0, -50L);
        uo0Var.l(rc.f19528e0, -65L);
        uo0Var.l(rc.f19533h0, -16L);
        uo0Var.l(rc.f19535i0, -73L);
        uo0Var.l(rc.f19537j0, -10L);
        uo0Var.l(rc.f19539k0, -48L);
        uo0Var.l(rc.f19540l0, -22L);
        uo0Var.l(rc.f19542m0, -76L);
        uo0Var.l(rc.f19544n0, -72L);
        r91 r91Var = (r91) uo0Var.f20839b;
        if (r91Var == null) {
            ka1Var = w91.f21468g;
        } else {
            Collection collectionEntrySet = r91Var.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                ka1Var = w91.f21468g;
            } else {
                o91<Map.Entry> o91Var = (o91) collectionEntrySet;
                pb pbVar = new pb(o91Var.f18206b.size());
                int size = 0;
                for (Map.Entry entry : o91Var) {
                    Object key = entry.getKey();
                    ia1 ia1VarV = ia1.v(((ha1) entry.getValue()).h());
                    if (!ia1VarV.isEmpty()) {
                        pbVar.e(key, ia1VarV);
                        size += ia1VarV.size();
                    }
                }
                ka1Var = new ka1(pbVar.p(true), size);
            }
        }
        ja1 ja1Var = ka1Var.f16401f;
        if (ja1Var == null) {
            ja1Var = new ja1(ka1Var);
            ka1Var.f16401f = ja1Var;
        }
        mb1 mb1VarH = ja1Var.h();
        while (mb1VarH.hasNext()) {
            Map.Entry entry2 = (Map.Entry) mb1VarH.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new aa.b(pc.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())), 3);
            }
        }
        HashMap map = new HashMap();
        ja1 ja1Var2 = ka1Var.f16401f;
        if (ja1Var2 == null) {
            ja1Var2 = new ja1(ka1Var);
            ka1Var.f16401f = ja1Var2;
        }
        mb1 mb1VarH2 = ja1Var2.h();
        while (mb1VarH2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) mb1VarH2.next();
            rc rcVar = (rc) entry3.getKey();
            Long l = (Long) entry3.getValue();
            long jLongValue = l.longValue();
            if (map.containsKey(l)) {
                String strValueOf = String.valueOf(map.get(l));
                String strValueOf2 = String.valueOf(rcVar);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + String.valueOf(jLongValue).length() + 27 + 5 + strValueOf2.length());
                sb2.append(pc.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA=="));
                sb2.append(jLongValue);
                sb2.append(pc.a("cQk="));
                sb2.append(strValueOf);
                sb2.append(pc.a("a0ivq0U="));
                sb2.append(strValueOf2);
                throw new aa.b(sb2.toString(), 3);
            }
            map.put(l, rcVar);
        }
        f13496a = map;
    }
}

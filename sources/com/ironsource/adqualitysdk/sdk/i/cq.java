package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cq {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f1483;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private dz f1484;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends d {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean mo1745(Cif cif) {
            return m1746().isInstance(cif.mo2410());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b extends d {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo1745(Cif cif) {
            return m1746().equals(cif.mo2411().getType());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends d {
        public c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* JADX INFO: renamed from: ｋ */
        public final boolean mo1745(Cif cif) {
            return m1746().isAssignableFrom(cif.mo2411().getType());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Class f1485;

        public d(Class cls) {
            this.f1485 = cls;
        }

        /* JADX INFO: renamed from: ｋ */
        public abstract boolean mo1745(Cif cif);

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final Class m1746() {
            return this.f1485;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private cq f1486 = new cq();

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m1748(Class cls) {
            this.f1486.f1483 = new a(cls);
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final e m1750(Class cls) {
            this.f1486.f1483 = new c(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final e m1751(Class cls) {
            this.f1486.f1483 = new b(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final e m1747(dz dzVar) {
            this.f1486.f1484 = dzVar;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final cq m1749() {
            return this.f1486;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m1744(Cif cif, ee eeVar, cl clVar, List<Object> list) {
        d dVar = this.f1483;
        if (dVar != null && !dVar.mo1745(cif)) {
            return false;
        }
        if (this.f1484 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, cif);
        return this.f1484.m2113(eeVar, clVar, arrayList).m2125();
    }
}

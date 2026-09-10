package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class co {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private c f1320;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private dt f1321;

    public static class a extends c {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.co.c
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean mo1561(ht htVar) {
            return m1567().isInstance(htVar.mo2260());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private co f1322 = new co();

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final b m1562(Class cls) {
            this.f1322.f1320 = new a(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final b m1564(dt dtVar) {
            this.f1322.f1321 = dtVar;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final b m1565(Class cls) {
            this.f1322.f1320 = new d(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final b m1566(Class cls) {
            this.f1322.f1320 = new e(cls);
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final co m1563() {
            return this.f1322;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Class f1323;

        public c(Class cls) {
            this.f1323 = cls;
        }

        /* JADX INFO: renamed from: ﻐ */
        public abstract boolean mo1561(ht htVar);

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final Class m1567() {
            return this.f1323;
        }
    }

    public static class d extends c {
        public d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.co.c
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo1561(ht htVar) {
            return m1567().equals(htVar.mo2261().getType());
        }
    }

    public static class e extends c {
        public e(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.co.c
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo1561(ht htVar) {
            return m1567().isAssignableFrom(htVar.mo2261().getType());
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m1560(ht htVar, dr drVar, cp cpVar, List<Object> list) {
        c cVar = this.f1320;
        if (cVar != null && !cVar.mo1561(htVar)) {
            return false;
        }
        if (this.f1321 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, htVar);
        return this.f1321.m2037(drVar, cpVar, arrayList).m2047();
    }
}

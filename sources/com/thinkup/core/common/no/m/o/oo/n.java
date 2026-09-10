package com.thinkup.core.common.no.m.o.oo;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public static final String m = ":status";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42054n = ":method";
    public static final String o0 = ":path";
    public static final String om = ":authority";
    public static final String oo = ":scheme";
    public final com.thinkup.core.common.no.n.om n0;
    final int nm;
    public final com.thinkup.core.common.no.n.om no;
    public static final com.thinkup.core.common.no.n.om o = com.thinkup.core.common.no.n.om.o(":");
    public static final com.thinkup.core.common.no.n.om on = com.thinkup.core.common.no.n.om.o(":status");
    public static final com.thinkup.core.common.no.n.om m0 = com.thinkup.core.common.no.n.om.o(":method");
    public static final com.thinkup.core.common.no.n.om mo = com.thinkup.core.common.no.n.om.o(":path");
    public static final com.thinkup.core.common.no.n.om mm = com.thinkup.core.common.no.n.om.o(":scheme");
    public static final com.thinkup.core.common.no.n.om mn = com.thinkup.core.common.no.n.om.o(":authority");

    public n(String str, String str2) {
        this(com.thinkup.core.common.no.n.om.o(str), com.thinkup.core.common.no.n.om.o(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.n0.equals(nVar.n0) && this.no.equals(nVar.no)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.no.hashCode() + ((this.n0.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return com.thinkup.core.common.no.m.o.n.o("%s: %s", this.n0.o(), this.no.o());
    }

    public n(com.thinkup.core.common.no.n.om omVar, String str) {
        this(omVar, com.thinkup.core.common.no.n.om.o(str));
    }

    public n(com.thinkup.core.common.no.n.om omVar, com.thinkup.core.common.no.n.om omVar2) {
        this.n0 = omVar;
        this.no = omVar2;
        this.nm = omVar2.mm() + omVar.mm() + 32;
    }
}

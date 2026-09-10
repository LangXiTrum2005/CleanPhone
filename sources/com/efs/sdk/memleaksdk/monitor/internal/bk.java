package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class bk implements Serializable {
    public static final a c = new a(0);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bi f611a;
    final b b;
    private final String d;
    private final String e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public enum b {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY
    }

    public bk(bi biVar, b bVar, String str, String str2) {
        AbstractC2995aW.q(biVar, "originObject");
        AbstractC2995aW.q(bVar, "referenceType");
        AbstractC2995aW.q(str, "owningClassName");
        AbstractC2995aW.q(str2, "referenceName");
        this.f611a = biVar;
        this.b = bVar;
        this.d = str;
        this.e = str2;
    }

    public final String a() {
        return ct.a(this.d, '.');
    }

    public final String b() {
        int i = bl.f613a[this.b.ordinal()];
        if (i == 1) {
            return DM.l(new StringBuilder("["), this.e, ']');
        }
        if (i == 2 || i == 3) {
            return this.e;
        }
        if (i == 4) {
            return "<Java Local>";
        }
        throw new C3770jF(7, 0);
    }

    public final String c() {
        int i = bl.b[this.b.ordinal()];
        if (i == 1) {
            return "[x]";
        }
        if (i == 2 || i == 3) {
            return this.e;
        }
        if (i == 4) {
            return "<Java Local>";
        }
        throw new C3770jF(7, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return AbstractC2995aW.i(this.f611a, bkVar.f611a) && AbstractC2995aW.i(this.b, bkVar.b) && AbstractC2995aW.i(this.d, bkVar.d) && AbstractC2995aW.i(this.e, bkVar.e);
    }

    public int hashCode() {
        bi biVar = this.f611a;
        int iHashCode = (biVar != null ? biVar.hashCode() : 0) * 31;
        b bVar = this.b;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LeakTraceReference(originObject=");
        sb.append(this.f611a);
        sb.append(", referenceType=");
        sb.append(this.b);
        sb.append(", owningClassName=");
        sb.append(this.d);
        sb.append(", referenceName=");
        return DM.m(sb, this.e, ")");
    }
}

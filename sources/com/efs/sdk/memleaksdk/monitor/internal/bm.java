package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bm extends bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f614a = new a(0);
    private static final long serialVersionUID = 3943636164568681903L;
    private final List<bg> c;
    private final bx d;
    private final String e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(List<bg> list, bx bxVar, String str) {
        super((byte) 0);
        AbstractC2995aW.q(list, "leakTraces");
        AbstractC2995aW.q(bxVar, "pattern");
        AbstractC2995aW.q(str, "description");
        this.c = list;
        this.d = bxVar;
        this.e = str;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bf
    public String a() {
        return ct.a(this.d.toString());
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bf
    public List<bg> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return AbstractC2995aW.i(c(), bmVar.c()) && AbstractC2995aW.i(this.d, bmVar.d) && AbstractC2995aW.i(this.e, bmVar.e);
    }

    public int hashCode() {
        List<bg> listC = c();
        int iHashCode = (listC != null ? listC.hashCode() : 0) * 31;
        bx bxVar = this.d;
        int iHashCode2 = (iHashCode + (bxVar != null ? bxVar.hashCode() : 0)) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bf
    public String toString() {
        StringBuilder sb = new StringBuilder("Leak pattern: ");
        sb.append(this.d);
        sb.append("\nDescription: ");
        sb.append(this.e);
        sb.append('\n');
        return DM.l(sb, super.toString(), '\n');
    }
}

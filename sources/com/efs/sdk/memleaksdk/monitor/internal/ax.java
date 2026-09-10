package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ax {
    public static final a d = new a(0 == true ? 1 : 0);
    private static final Map<String, bd> f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f573a;
    public final bd b;
    public final int c;
    private final long e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final ax a(n nVar) throws IOException {
            AbstractC2995aW.q(nVar, "source");
            if (!(!nVar.b())) {
                throw new IllegalArgumentException("Source has no available bytes");
            }
            String strA = nVar.a(nVar.a((byte) 0));
            bd bdVar = (bd) ax.f.get(strA);
            if (bdVar != null) {
                nVar.c(1L);
                return new ax(nVar.f(), bdVar, nVar.e());
            }
            StringBuilder sbU = AbstractC3950lJ.u("Unsupported Hprof version [", strA, "] not in supported list ");
            sbU.append(ax.f.keySet());
            throw new IllegalStateException(sbU.toString().toString());
        }
    }

    static {
        bd[] bdVarArrValues = bd.values();
        ArrayList arrayList = new ArrayList(bdVarArrValues.length);
        for (bd bdVar : bdVarArrValues) {
            arrayList.add(new C4839vT(bdVar.e, bdVar));
        }
        f = U5.A0(arrayList);
    }

    public ax() {
        this(0L, null, 0, 7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return this.e == axVar.e && AbstractC2995aW.i(this.b, axVar.b) && this.c == axVar.c;
    }

    public int hashCode() {
        long j = this.e;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        bd bdVar = this.b;
        return ((i + (bdVar != null ? bdVar.hashCode() : 0)) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HprofHeader(heapDumpTimestamp=");
        sb.append(this.e);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", identifierByteSize=");
        return AbstractC5044xl.o(sb, this.c, ")");
    }

    public ax(long j, bd bdVar, int i) {
        AbstractC2995aW.q(bdVar, "version");
        this.e = j;
        this.b = bdVar;
        this.c = i;
        String str = bdVar.e;
        Charset charset = AbstractC2307Be.f2881a;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC2995aW.p(bytes, "(this as java.lang.String).getBytes(charset)");
        this.f573a = bytes.length + 13;
    }

    public /* synthetic */ ax(long j, bd bdVar, int i, int i2) {
        this((i2 & 1) != 0 ? System.currentTimeMillis() : j, (i2 & 2) != 0 ? bd.ANDROID : bdVar, (i2 & 4) != 0 ? 4 : i);
    }
}

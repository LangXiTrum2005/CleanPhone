package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class bt implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f624a = new a(0);
    private final l b;
    private final bb c;
    private final bu d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final bt a(bv bvVar, ax axVar) {
            AbstractC2995aW.q(bvVar, "hprofSourceProvider");
            AbstractC2995aW.q(axVar, "hprofHeader");
            return new bt(bvVar.b(), axVar, (byte) 0);
        }
    }

    private bt(bu buVar, ax axVar) {
        this.d = buVar;
        l lVar = new l();
        this.b = lVar;
        this.c = new bb(axVar, lVar);
    }

    public final <T> T a(long j, long j2, InterfaceC2766Sw interfaceC2766Sw) throws IOException {
        long j3 = j2;
        AbstractC2995aW.q(interfaceC2766Sw, "withRecordReader");
        if (j3 <= 0) {
            throw new IllegalArgumentException(AbstractC5044xl.i("recordSize ", j3, " must be > 0").toString());
        }
        long j4 = j;
        while (j3 > 0) {
            long jA = this.d.a(this.b, j4, j3);
            if (jA <= 0) {
                throw new IllegalStateException(AbstractC3950lJ.s(DM.p("Requested ", j3, " bytes after reading "), j4 - j, ", got 0 bytes instead.").toString());
            }
            j4 += jA;
            j3 -= jA;
        }
        T t = (T) interfaceC2766Sw.invoke(this.c);
        if (this.b.a() == 0) {
            return t;
        }
        throw new IllegalStateException(("Buffer not fully consumed: " + this.b.a() + " bytes left").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public /* synthetic */ bt(bu buVar, ax axVar, byte b) {
        this(buVar, axVar);
    }
}

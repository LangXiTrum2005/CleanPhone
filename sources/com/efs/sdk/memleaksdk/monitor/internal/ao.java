package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class ao implements an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f533a;

    public static final class a implements bu {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FileChannel f534a;

        public a(FileChannel fileChannel) {
            this.f534a = fileChannel;
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.bu
        public long a(l lVar, long j, long j2) {
            AbstractC2995aW.q(lVar, "sink");
            return this.f534a.transferTo(j, j2, lVar);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f534a.close();
        }
    }

    public ao(File file) {
        AbstractC2995aW.q(file, "file");
        this.f533a = file;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.ca
    public n a() {
        n nVarA = p.a(p.a(new FileInputStream(this.f533a)));
        AbstractC2995aW.p(nVarA, "Okio.buffer(\n    Okio.source(file.inputStream()))");
        return nVarA;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.bv
    public bu b() {
        return new a(new FileInputStream(this.f533a).getChannel());
    }
}

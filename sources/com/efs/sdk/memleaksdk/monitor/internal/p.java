package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f690a = Logger.getLogger(p.class.getName());

    private p() {
    }

    public static n a(v vVar) {
        return new q(vVar);
    }

    public static v a(InputStream inputStream) {
        return a(inputStream, new w());
    }

    private static v a(final InputStream inputStream, final w wVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (wVar != null) {
            return new v() { // from class: com.efs.sdk.memleaksdk.monitor.internal.p.1
                @Override // com.efs.sdk.memleaksdk.monitor.internal.v
                public long b(l lVar, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException(AbstractC5044xl.h("byteCount < 0: ", j));
                    }
                    if (j == 0) {
                        return 0L;
                    }
                    try {
                        wVar.a();
                        r rVarA = lVar.a(1);
                        int i = inputStream.read(rVarA.f693a, rVarA.c, (int) Math.min(j, 8192 - rVarA.c));
                        if (i == -1) {
                            return -1L;
                        }
                        rVarA.c += i;
                        long j2 = i;
                        lVar.b += j2;
                        return j2;
                    } catch (AssertionError e) {
                        if (p.a(e)) {
                            throw new IOException(e);
                        }
                        throw e;
                    }
                }

                @Override // com.efs.sdk.memleaksdk.monitor.internal.v, java.lang.AutoCloseable, java.nio.channels.Channel
                public void close() throws IOException {
                    inputStream.close();
                }

                public String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}

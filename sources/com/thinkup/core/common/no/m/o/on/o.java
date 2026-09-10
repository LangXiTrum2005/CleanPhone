package com.thinkup.core.common.no.m.o.on;

import android.net.ssl.SSLSockets;
import com.thinkup.core.common.no.m.on0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes6.dex */
final class o extends m {
    private o(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    private static void m(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.m, com.thinkup.core.common.no.m.o.on.n
    public final String o(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    public static n o() {
        if (!n.on()) {
            return null;
        }
        try {
            if (m.o0() >= 29) {
                return new o(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    @Override // com.thinkup.core.common.no.m.o.on.m, com.thinkup.core.common.no.m.o.on.n
    public final void o(SSLSocket sSLSocket, String str, List<on0> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                on0 on0Var = list.get(i2);
                if (on0Var != on0.HTTP_1_0) {
                    arrayList.add(on0Var.toString());
                }
            }
            sSLParameters.setApplicationProtocols((String[]) arrayList.toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}

package com.thinkup.core.common.no.m.o.n;

import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.oom;
import java.net.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public final class mo {
    private mo() {
    }

    private static boolean m(onm onmVar, Proxy.Type type) {
        return !onmVar.on() && type == Proxy.Type.HTTP;
    }

    private static String o(onm onmVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(onmVar.m());
        sb.append(' ');
        if (onmVar.on() || type != Proxy.Type.HTTP) {
            sb.append(o(onmVar.o()));
        } else {
            sb.append(onmVar.o());
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static String o(oom oomVar) {
        String strM0 = oomVar.m0();
        String strMm = oomVar.mm();
        if (strMm == null) {
            return strM0;
        }
        return strM0 + '?' + strMm;
    }
}

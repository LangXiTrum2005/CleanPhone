package com.thinkup.core.common.no.m;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface o0o {
    public static final o0o o = new o0o() { // from class: com.thinkup.core.common.no.m.o0o.1
        @Override // com.thinkup.core.common.no.m.o0o
        public final List<InetAddress> o(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e2);
                throw unknownHostException;
            }
        }
    };

    List<InetAddress> o(String str);
}

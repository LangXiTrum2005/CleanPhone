package com.thinkup.core.common.n0;

import android.content.Context;
import android.support.v4.media.a;
import com.thinkup.core.api.AdError;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o00 extends o {
    @Override // com.thinkup.core.common.n0.o
    public final String m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strN = com.thinkup.core.common.ooo.nm.n(String.valueOf(jCurrentTimeMillis));
        StringBuilder sb = new StringBuilder();
        com.thinkup.core.common.mo.o();
        sb.append(com.thinkup.core.common.mo.mo() ? com.thinkup.core.common.n.mo.oo.ono : com.thinkup.core.common.n.mo.oo.mn);
        sb.append("?t=");
        sb.append(jCurrentTimeMillis);
        return a.r(sb, "&sign=", strN);
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, Object> m0() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Map<String, String> n() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void n0() {
    }

    @Override // com.thinkup.core.common.n0.o
    public final com.thinkup.core.common.n0.m.o0 nn() {
        return com.thinkup.core.common.n0.m.o0.o("eu_traffic");
    }

    @Override // com.thinkup.core.common.n0.o
    public final boolean no() {
        return true;
    }

    @Override // com.thinkup.core.common.n0.o
    public final int o() {
        return 2;
    }

    @Override // com.thinkup.core.common.n0.o
    public final byte[] o0() {
        return new byte[0];
    }

    @Override // com.thinkup.core.common.n0.o
    public final Context om() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String on() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final String oo() {
        return null;
    }

    @Override // com.thinkup.core.common.n0.o
    public final Object o(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.n0.o
    public final void o(AdError adError) {
    }
}

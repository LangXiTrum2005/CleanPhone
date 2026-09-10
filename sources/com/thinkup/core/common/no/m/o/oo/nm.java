package com.thinkup.core.common.no.m.o.oo;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class nm extends IOException {
    public final m o;

    public nm(m mVar) {
        super("stream was reset: ".concat(String.valueOf(mVar)));
        this.o = mVar;
    }
}

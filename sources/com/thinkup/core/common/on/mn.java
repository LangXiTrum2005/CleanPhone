package com.thinkup.core.common.on;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public final class mn extends IllegalStateException {
    public String m;
    public AdError o;

    public mn(AdError adError, String str) {
        this.o = adError;
        this.m = str;
    }
}

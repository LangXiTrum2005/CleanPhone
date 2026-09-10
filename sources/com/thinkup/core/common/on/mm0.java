package com.thinkup.core.common.on;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public final class mm0 {
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42197n;
    private String o;
    private int o0;
    private String om;
    private int oo;

    private static mm0 on() {
        return new mm0();
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.f42197n;
    }

    public final String o() {
        return this.o;
    }

    public final int o0() {
        return this.o0;
    }

    public final String om() {
        return this.om;
    }

    public final int oo() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcpmEncDecInfo{uniqueId='");
        sb.append(this.o);
        sb.append("', ecpmEncryptInfo='");
        sb.append(this.m);
        sb.append("', ecpmEncPubKey='");
        sb.append(this.f42197n);
        sb.append("', ecpmDecPvtKeyServerId=");
        sb.append(this.o0);
        sb.append(", ecpmDecPvtKeyClientId=");
        sb.append(this.oo);
        sb.append(", ecpmRmbEncryptInfo='");
        return a.r(sb, this.om, "'}");
    }

    public final void m(String str) {
        this.m = str;
    }

    public final void n(String str) {
        this.f42197n = str;
    }

    public final void o(String str) {
        this.o = str;
    }

    public final void o0(String str) {
        this.om = str;
    }

    public final void m(int i2) {
        this.oo = i2;
    }

    public final void o(int i2) {
        this.o0 = i2;
    }
}

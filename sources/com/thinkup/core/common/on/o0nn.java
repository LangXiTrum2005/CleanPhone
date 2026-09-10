package com.thinkup.core.common.on;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class o0nn {
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42238n;
    public String o;
    private final String o0;
    private final o0mm om;
    private final double oo;

    public o0nn(int i2, String str, String str2, double d, String str3, o0mm o0mmVar) {
        this.f42238n = i2;
        this.o = str;
        this.m = str3;
        this.oo = d;
        this.o0 = str2;
        this.om = o0mmVar;
    }

    private String n() {
        return this.o;
    }

    private String o0() {
        return this.m;
    }

    private int oo() {
        return this.f42238n;
    }

    public final String m() {
        return this.o0;
    }

    public final void o(double d) {
        o0mm o0mmVar = this.om;
        if (o0mmVar != null) {
            o0mmVar.nmn(2);
            this.om.mm(d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{channelId='");
        sb.append(this.o);
        sb.append("', bidType='");
        sb.append(this.o0);
        sb.append("', price=");
        sb.append(this.oo);
        sb.append(", adnPlacementId='");
        sb.append(this.m);
        sb.append("', filterType=");
        return a.p(sb, this.f42238n, AbstractJsonLexerKt.END_OBJ);
    }

    public final void o(String str) {
        o0mm o0mmVar = this.om;
        if (o0mmVar != null) {
            o0mmVar.o00(str);
        }
    }

    public final double o() {
        return this.oo;
    }
}

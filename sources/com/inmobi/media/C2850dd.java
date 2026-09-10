package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2850dd implements ro {
    public final Jg a;
    public final Rg b;
    public final Hc c;
    public final Gc d;
    public C2799be e;

    public C2850dd(InMobiNative inMobiNative, Context context, long j) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        Intrinsics.checkNotNullParameter(context, "context");
        Jg jg = new Jg();
        jg.a = j;
        this.a = jg;
        C2824cd c2824cd = new C2824cd(this);
        Rg rg = new Rg();
        this.b = rg;
        Hc hc = new Hc(inMobiNative, rg, c2824cd);
        this.c = hc;
        this.d = new Gc(context, jg, hc);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d) {
        return this.d.a(d);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i, double d) {
        return this.d.a(i, d);
    }
}

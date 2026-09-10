package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: renamed from: com.applovin.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0963t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f11896a = new StringBuilder();

    public void a(C0967v0 c0967v0, long j) {
        if (c0967v0.d() == C0967v0.b.DECISION) {
            return;
        }
        a(a(c0967v0), j);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.f11896a.toString();
    }

    public void b(String str) {
        a(android.support.v4.media.a.C("Invalid state: ", str));
    }

    public void a(C0967v0 c0967v0, boolean z2, long j) {
        a(a(c0967v0) + ": " + z2, j);
    }

    public void a() {
        this.f11896a.setLength(0);
    }

    private void a(String str, long j) {
        a(str + " after " + j + "ms");
    }

    private void a(String str) {
        StringBuilder sb = this.f11896a;
        sb.append(str);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    private String a(C0967v0 c0967v0) {
        C0967v0.b bVarD = c0967v0.d();
        if (bVarD == C0967v0.b.EVENT) {
            return ((y0) c0967v0).g();
        }
        if (bVarD == C0967v0.b.DECISION) {
            return StringUtils.emptyIfNull(c0967v0.b());
        }
        return StringUtils.emptyIfNull(c0967v0.e());
    }
}

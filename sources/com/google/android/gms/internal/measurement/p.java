package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Level f23825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f23826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final di f23827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = q.f23870f;
        this.f23825b = level;
        this.f23826c = q.f23870f;
        this.f23827d = q.f23871g;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean e(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void f(bh bhVar) {
        String strA = (String) bhVar.c().j(uh.f24051a);
        if (strA == null) {
            strA = (String) this.f24166a;
        }
        if (strA == null) {
            ih ihVar = bhVar.f23328d;
            if (ihVar == null) {
                throw new IllegalStateException("cannot request log site information prior to postProcess()");
            }
            strA = ihVar.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        q.m(bhVar, h.c(strA), this.f23825b, this.f23826c, this.f23827d);
    }
}

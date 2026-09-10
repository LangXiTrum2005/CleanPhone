package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36923b;

    public g(String str, String str2) {
        this.f36922a = str;
        this.f36923b = str2;
    }

    public final String a() {
        return this.f36922a;
    }

    public final String b() {
        return this.f36923b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f36922a, gVar.f36922a) && TextUtils.equals(this.f36923b, gVar.f36923b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f36923b.hashCode() + (this.f36922a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f36922a);
        sb2.append(",value=");
        return defpackage.e.q(this.f36923b, X3.j.f27836e, sb2);
    }
}

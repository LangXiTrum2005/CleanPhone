package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12708b;

    public bb(String str, String str2) {
        this.f12707a = str;
        this.f12708b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bb.class == obj.getClass()) {
            bb bbVar = (bb) obj;
            if (TextUtils.equals(this.f12707a, bbVar.f12707a) && TextUtils.equals(this.f12708b, bbVar.f12708b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12708b.hashCode() + (this.f12707a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f12707a;
        int length = String.valueOf(str).length();
        String str2 = this.f12708b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        d5.u.r(sb2, "Header[name=", str, ",value=", str2);
        sb2.append(X3.j.f27836e);
        return sb2.toString();
    }
}

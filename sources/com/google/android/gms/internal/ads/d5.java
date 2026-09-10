package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 extends x4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13400c;

    public d5(String str, String str2, String str3) {
        super(str);
        this.f13399b = str2;
        this.f13400c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d5.class == obj.getClass()) {
            d5 d5Var = (d5) obj;
            if (this.f21738a.equals(d5Var.f21738a) && Objects.equals(this.f13399b, d5Var.f13399b) && Objects.equals(this.f13400c, d5Var.f13400c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f21738a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.f13399b;
        return this.f13400c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f21738a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f13400c;
        return q4.a.j(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}

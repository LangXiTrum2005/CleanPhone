package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f16671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ca1 f16673c;

    static {
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public l2(Uri uri, ca1 ca1Var) {
        List list = Collections.EMPTY_LIST;
        this.f16671a = uri;
        ArrayList arrayList = na.f17726a;
        this.f16672b = list;
        this.f16673c = ca1Var;
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (ca1Var.size() <= 0) {
            ca1.A(0, objArr);
        } else {
            ca1Var.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f16671a.equals(l2Var.f16671a) && this.f16672b.equals(l2Var.f16672b) && this.f16673c.equals(l2Var.f16673c);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.f16673c.hashCode() + q4.a.g(this.f16671a.hashCode() * 923521, 961, this.f16672b)) * 31)) * 31) + C.TIME_UNSET);
    }
}

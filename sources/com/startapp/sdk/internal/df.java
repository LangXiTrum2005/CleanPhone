package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class df extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9 f40912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40913b;

    public df(h9 h9Var, String str) {
        this.f40912a = h9Var;
        this.f40913b = str;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (obj instanceof x9) {
            h9 h9Var = this.f40912a;
            g9 g9Var = ((x9) obj).j0;
            if (h9Var == g9Var.f40999a) {
                String str = this.f40913b;
                return str == null || str.equals(g9Var.d);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df.class == obj.getClass()) {
            df dfVar = (df) obj;
            if (vi.a(this.f40912a, dfVar.f40912a) && vi.a((Object) this.f40913b, (Object) dfVar.f40913b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f40912a, this.f40913b};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}

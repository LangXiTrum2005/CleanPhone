package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class af extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40804a;

    public af(int i2) {
        this.f40804a = i2;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (obj instanceof z1) {
            int i2 = ((z1) obj).Z;
            if ((this.f40804a & i2) == i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && af.class == obj.getClass() && this.f40804a == ((af) obj).f40804a;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f40804a)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}

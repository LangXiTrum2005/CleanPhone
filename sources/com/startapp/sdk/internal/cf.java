package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class cf extends ff {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bf f40879c;

    public cf(String str, HashMap map) {
        super(str, map);
    }

    @Override // com.startapp.sdk.internal.kf
    public final void a(Context context, hf hfVar) {
        if (this.f40879c != null) {
            throw new IllegalStateException();
        }
        bf bfVar = new bf(this, hfVar);
        this.f40879c = bfVar;
        context.registerReceiver(bfVar, new IntentFilter(this.f40973a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cf.class != obj.getClass()) {
            return false;
        }
        return vi.a(this.f40879c, ((cf) obj).f40879c);
    }

    public final int hashCode() {
        Object[] objArr = {this.f40879c};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    @Override // com.startapp.sdk.internal.kf
    public final void a(Context context) {
        bf bfVar = this.f40879c;
        if (bfVar != null) {
            context.unregisterReceiver(bfVar);
            this.f40879c = null;
            return;
        }
        throw new IllegalStateException();
    }
}

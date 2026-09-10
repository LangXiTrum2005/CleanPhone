package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11738b;

    public n(i0 i0Var, AlertDialog alertDialog) {
        this.f11737a = alertDialog;
        this.f11738b = i0Var;
    }

    public void a(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f11737a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f11738b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).H(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new j9.e(status));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((n) this.f11738b).f11738b).remove((TaskCompletionSource) this.f11737a);
    }

    public n() {
        this.f11737a = Collections.synchronizedMap(new WeakHashMap());
        this.f11738b = Collections.synchronizedMap(new WeakHashMap());
    }

    public n(n nVar, TaskCompletionSource taskCompletionSource) {
        this.f11737a = taskCompletionSource;
        Objects.requireNonNull(nVar);
        this.f11738b = nVar;
    }
}

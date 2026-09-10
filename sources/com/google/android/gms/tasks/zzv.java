package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class zzv extends g {
    private final List zza;

    private zzv(h hVar) {
        super(hVar);
        this.zza = new ArrayList();
        this.mLifecycleFragment.g("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        h fragment = g.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.j(zzv.class, "TaskOnStopCallback");
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}

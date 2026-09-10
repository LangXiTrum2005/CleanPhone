package com.unity3d.scar.adapter.common.signals;

import com.unity3d.scar.adapter.common.DispatchGroup;

/* JADX INFO: loaded from: classes6.dex */
public class SignalCallbackListener<T> implements ISignalCallbackListener<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DispatchGroup f42795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SignalsResult f42796b;

    public SignalCallbackListener(DispatchGroup dispatchGroup, SignalsResult signalsResult) {
        this.f42795a = dispatchGroup;
        this.f42796b = signalsResult;
    }

    public final void a(String str) {
        Runnable runnable;
        this.f42796b.f42800b = str;
        DispatchGroup dispatchGroup = this.f42795a;
        synchronized (dispatchGroup) {
            int i2 = dispatchGroup.f42782a - 1;
            dispatchGroup.f42782a = i2;
            if (i2 <= 0 && (runnable = dispatchGroup.f42783b) != null) {
                ((SignalsCollectorBase.GMAScarDispatchCompleted) runnable).run();
            }
        }
    }

    public final void b(String str, String str2) {
        Runnable runnable;
        this.f42796b.f42799a.put(str, str2);
        DispatchGroup dispatchGroup = this.f42795a;
        synchronized (dispatchGroup) {
            int i2 = dispatchGroup.f42782a - 1;
            dispatchGroup.f42782a = i2;
            if (i2 <= 0 && (runnable = dispatchGroup.f42783b) != null) {
                ((SignalsCollectorBase.GMAScarDispatchCompleted) runnable).run();
            }
        }
    }
}

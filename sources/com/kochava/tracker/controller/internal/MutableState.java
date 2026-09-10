package com.kochava.tracker.controller.internal;

import com.kochava.core.identity.internal.Identity;
import com.kochava.core.task.manager.internal.TaskManager;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.tracker.privacy.internal.ConsentState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes5.dex */
public final class MutableState implements MutableStateApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskManager f28119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Identity f28120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Identity f28121c;
    public final Identity d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f28122e = androidx.media3.extractor.text.ttml.a.u();
    public final List f = androidx.media3.extractor.text.ttml.a.u();
    public final List g = androidx.media3.extractor.text.ttml.a.u();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f28123h = androidx.media3.extractor.text.ttml.a.u();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f28124i = new ArrayList();
    public final HashMap j = new HashMap();
    public Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28125l;
    public ConsentState m;

    class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    class b implements Runnable {
        public final /* synthetic */ ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ boolean f28126Y;

        public b(ArrayList arrayList, boolean z2) {
            this.X = arrayList;
            this.f28126Y = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((AppLimitAdTrackingChangedListener) it.next()).c(this.f28126Y);
            }
        }
    }

    class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    class d implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    class e implements Runnable {
        public final /* synthetic */ ArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ ConsentState f28127Y;

        public e(ArrayList arrayList, ConsentState consentState) {
            this.X = arrayList;
            this.f28127Y = consentState;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.X.iterator();
            while (it.hasNext()) {
                ((ConsentStateChangedListener) it.next()).b(this.f28127Y);
            }
        }
    }

    public MutableState(TaskManager taskManager) {
        new CountDownLatch(1);
        this.f28125l = false;
        this.m = ConsentState.NOT_ANSWERED;
        this.f28119a = taskManager;
        this.k = null;
        this.f28120b = new Identity(taskManager);
        this.f28121c = new Identity(taskManager);
        this.d = new Identity(taskManager);
    }

    public final synchronized ConsentState a() {
        return this.m;
    }

    public final synchronized Identity b() {
        return this.f28120b;
    }

    public final synchronized Identity c() {
        return this.d;
    }

    public final synchronized Identity d() {
        return this.f28121c;
    }

    public final synchronized boolean e() {
        Boolean bool = this.k;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final synchronized boolean f() {
        return this.f28125l;
    }

    public final synchronized void g(boolean z2) {
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != z2) {
            this.k = Boolean.valueOf(z2);
            ArrayList arrayListQ = ObjectUtil.q(this.f);
            if (!arrayListQ.isEmpty()) {
                this.f28119a.b(new b(arrayListQ, z2));
            }
        }
    }

    public final synchronized void h(boolean z2) {
        this.f28125l = z2;
    }
}

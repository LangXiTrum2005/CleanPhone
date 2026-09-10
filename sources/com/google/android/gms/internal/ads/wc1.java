package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 extends vc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21487a = AtomicReferenceFieldUpdater.newUpdater(cd1.class, Thread.class, "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21488b = AtomicReferenceFieldUpdater.newUpdater(cd1.class, cd1.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21489c = AtomicReferenceFieldUpdater.newUpdater(dd1.class, cd1.class, "c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21490d = AtomicReferenceFieldUpdater.newUpdater(dd1.class, rc1.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21491e = AtomicReferenceFieldUpdater.newUpdater(dd1.class, Object.class, "a");

    @Override // com.google.android.gms.internal.ads.vc1
    public final void d(cd1 cd1Var, Thread thread) {
        f21487a.lazySet(cd1Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final void g(cd1 cd1Var, cd1 cd1Var2) {
        f21488b.lazySet(cd1Var, cd1Var2);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean i(dd1 dd1Var, cd1 cd1Var, cd1 cd1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f21489c;
            if (atomicReferenceFieldUpdater.compareAndSet(dd1Var, cd1Var, cd1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(dd1Var) == cd1Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean k(uc1 uc1Var, rc1 rc1Var, rc1 rc1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f21490d;
            if (atomicReferenceFieldUpdater.compareAndSet(uc1Var, rc1Var, rc1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(uc1Var) == rc1Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final cd1 l(uc1 uc1Var) {
        return (cd1) f21489c.getAndSet(uc1Var, cd1.f13138c);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final rc1 n(uc1 uc1Var) {
        return (rc1) f21490d.getAndSet(uc1Var, rc1.f19557d);
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public final boolean o(dd1 dd1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f21491e;
            if (atomicReferenceFieldUpdater.compareAndSet(dd1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(dd1Var) == obj);
        return false;
    }
}

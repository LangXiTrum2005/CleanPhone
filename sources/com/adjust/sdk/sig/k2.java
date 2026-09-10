package com.adjust.sdk.sig;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements u1, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6976c = AtomicReferenceFieldUpdater.newUpdater(k2.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile g0 f6977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f6978b = l3.f6982a;

    public k2(g0 g0Var) {
        this.f6977a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        Object obj = this.f6978b;
        l3 l3Var = l3.f6982a;
        if (obj != l3Var) {
            return obj;
        }
        g0 g0Var = this.f6977a;
        if (g0Var != null) {
            Object objA = g0Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6976c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, l3Var, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != l3Var) {
                }
            }
            this.f6977a = null;
            return objA;
        }
        return this.f6978b;
    }

    public final String toString() {
        return this.f6978b != l3.f6982a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

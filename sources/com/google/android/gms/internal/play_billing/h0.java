package com.google.android.gms.internal.play_billing;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f24273c = AtomicReferenceFieldUpdater.newUpdater(k0.class, Thread.class, "a");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f24274d = AtomicReferenceFieldUpdater.newUpdater(k0.class, k0.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f24275e = AtomicReferenceFieldUpdater.newUpdater(l0.class, k0.class, "c");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f24276f = AtomicReferenceFieldUpdater.newUpdater(l0.class, f0.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f24277g = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "a");

    @Override // a.a
    public final f0 I(u0 u0Var) {
        return (f0) f24276f.getAndSet(u0Var, f0.f24264d);
    }

    @Override // a.a
    public final k0 J(u0 u0Var) {
        return (k0) f24275e.getAndSet(u0Var, k0.f24392c);
    }

    @Override // a.a
    public final void K(k0 k0Var, k0 k0Var2) {
        f24274d.lazySet(k0Var, k0Var2);
    }

    @Override // a.a
    public final void L(k0 k0Var, Thread thread) {
        f24273c.lazySet(k0Var, thread);
    }

    @Override // a.a
    public final boolean M(u0 u0Var, f0 f0Var, f0 f0Var2) {
        return android.support.v4.media.session.a.K(f24276f, u0Var, f0Var, f0Var2);
    }

    @Override // a.a
    public final boolean N(l0 l0Var, Object obj, Object obj2) {
        return android.support.v4.media.session.a.K(f24277g, l0Var, obj, obj2);
    }

    @Override // a.a
    public final boolean O(l0 l0Var, k0 k0Var, k0 k0Var2) {
        return android.support.v4.media.session.a.K(f24275e, l0Var, k0Var, k0Var2);
    }
}

package com.ironsource;

import android.os.OutcomeReceiver;

/* JADX INFO: renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0614v1 {

    /* JADX INFO: renamed from: com.ironsource.v1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements OutcomeReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ak.f f30834a;

        public a(ak.f fVar) {
            this.f30834a = fVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            kotlin.jvm.internal.n.f(error, "error");
            this.f30834a.resumeWith(t9.e.c(error));
        }

        public void onResult(Object obj) {
            this.f30834a.resumeWith(wj.r.f53297a);
        }
    }

    public static final OutcomeReceiver a(ak.f fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        return new a(fVar);
    }
}

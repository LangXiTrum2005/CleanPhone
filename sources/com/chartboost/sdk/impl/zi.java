package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface zi {

    public static final class a {
        public static /* synthetic */ void a(zi ziVar, long j, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProgressUpdate");
            }
            if ((i2 & 1) != 0) {
                j = 500;
            }
            ziVar.a(j);
        }
    }

    public interface b {
        long a();
    }

    void a();

    void a(long j);
}

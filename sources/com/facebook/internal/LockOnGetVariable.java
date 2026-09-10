package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/LockOnGetVariable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class LockOnGetVariable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f16349b = new CountDownLatch(1);

    public LockOnGetVariable(final Callable callable) {
        FacebookSdk.e().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.LockOnGetVariable.1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                LockOnGetVariable lockOnGetVariable = LockOnGetVariable.this;
                try {
                    lockOnGetVariable.f16348a = callable.call();
                } finally {
                    CountDownLatch countDownLatch = lockOnGetVariable.f16349b;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            }
        }));
    }
}

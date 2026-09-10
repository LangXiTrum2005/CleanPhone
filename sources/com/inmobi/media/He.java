package com.inmobi.media;

import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public abstract class He {
    public static final boolean a(Response response) {
        Intrinsics.f(response, "<this>");
        int iCode = response.code();
        return !(400 <= iCode && iCode < 600);
    }

    public static final Object a(ExecutorService executorService, long j, TimeUnit unit, Callable task) throws Throwable {
        Intrinsics.f(executorService, "<this>");
        Intrinsics.f(unit, "unit");
        Intrinsics.f(task, "task");
        Future futureSubmit = executorService.submit(task);
        Intrinsics.e(futureSubmit, "submit(...)");
        try {
            return futureSubmit.get(j, unit);
        } catch (InterruptedException e2) {
            futureSubmit.cancel(true);
            Thread.currentThread().interrupt();
            throw e2;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                throw e3;
            }
            throw cause;
        } catch (TimeoutException unused) {
            futureSubmit.cancel(true);
            throw new SocketTimeoutException();
        }
    }
}

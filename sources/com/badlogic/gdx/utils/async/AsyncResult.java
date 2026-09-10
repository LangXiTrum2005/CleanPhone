package com.badlogic.gdx.utils.async;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AsyncResult<T> {
    private final Future<T> future;

    public AsyncResult(Future<T> future) {
        this.future = future;
    }

    public T get() {
        try {
            return this.future.get();
        } catch (InterruptedException unused) {
            return null;
        } catch (ExecutionException e) {
            throw new GdxRuntimeException(e.getCause());
        }
    }

    public boolean isDone() {
        return this.future.isDone();
    }
}

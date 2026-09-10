package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class SimpleResource<T> implements Resource<T> {
    public final Object X;

    public SimpleResource(Object obj) {
        Preconditions.c(obj, "Argument must not be null");
        this.X = obj;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return this.X.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.X;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return 1;
    }
}

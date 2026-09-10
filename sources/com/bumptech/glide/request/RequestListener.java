package com.bumptech.glide.request;

import com.bumptech.glide.load.engine.GlideException;

/* JADX INFO: loaded from: classes.dex */
public interface RequestListener<R> {
    boolean b(Object obj);

    boolean h(GlideException glideException);
}

package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class BytesResource implements Resource<byte[]> {
    public final byte[] X;

    public BytesResource(byte[] bArr) {
        Preconditions.c(bArr, "Argument must not be null");
        this.X = bArr;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.X;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.X.length;
    }
}

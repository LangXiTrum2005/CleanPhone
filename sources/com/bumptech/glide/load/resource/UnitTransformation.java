package com.bumptech.glide.load.resource;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class UnitTransformation<T> implements Transformation<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UnitTransformation f12630b = new UnitTransformation();

    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i2, int i3) {
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
    }
}

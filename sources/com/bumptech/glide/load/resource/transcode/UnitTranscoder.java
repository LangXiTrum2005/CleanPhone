package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public class UnitTranscoder<Z> implements ResourceTranscoder<Z, Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UnitTranscoder f12745a = new UnitTranscoder();

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public final Resource a(Resource resource, Options options) {
        return resource;
    }
}

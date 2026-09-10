package com.bumptech.glide.provider;

import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class LoadPathCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LoadPath f12774c = new LoadPath(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new UnitTranscoder(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap f12775a = new ArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f12776b = new AtomicReference();
}

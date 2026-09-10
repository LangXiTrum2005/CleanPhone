package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GlideExperiments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12297a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f12298a = new HashMap();
    }

    public interface Experiment {
    }

    public GlideExperiments(Builder builder) {
        this.f12297a = Collections.unmodifiableMap(new HashMap(builder.f12298a));
    }
}

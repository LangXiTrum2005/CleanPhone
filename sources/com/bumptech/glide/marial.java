package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: GlideExperiments.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, Object> f17857attabal;

    /* JADX INFO: compiled from: GlideExperiments.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<Class<?>, Object> f17858attabal = new HashMap();

        public marial saneness() {
            return new marial(this);
        }
    }

    public marial(attabal attabalVar) {
        this.f17857attabal = Collections.unmodifiableMap(new HashMap(attabalVar.f17858attabal));
    }

    public boolean attabal(Class<Object> cls) {
        return this.f17857attabal.containsKey(cls);
    }
}

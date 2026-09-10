package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataRewinderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class beachfront {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final marial.attabal<?> f17591saneness = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, marial.attabal<?>> f17592attabal = new HashMap();

    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public class attabal implements marial.attabal<Object> {
        @Override // com.bumptech.glide.load.data.marial.attabal
        public Class<Object> attabal() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.marial.attabal
        public marial<Object> saneness(Object obj) {
            return new saneness(obj);
        }
    }

    public synchronized <T> marial<T> attabal(T t) {
        marial.attabal<?> attabalVar;
        try {
            com.bumptech.glide.util.apical.wireman(t);
            attabalVar = this.f17592attabal.get(t.getClass());
            if (attabalVar == null) {
                for (marial.attabal<?> attabalVar2 : this.f17592attabal.values()) {
                    if (attabalVar2.attabal().isAssignableFrom(t.getClass())) {
                        attabalVar = attabalVar2;
                        break;
                    }
                }
            }
            if (attabalVar == null) {
                attabalVar = f17591saneness;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (marial<T>) attabalVar.saneness(t);
    }

    public synchronized void saneness(marial.attabal<?> attabalVar) {
        this.f17592attabal.put(attabalVar.attabal(), attabalVar);
    }

    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public static final class saneness implements marial<Object> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Object f17593attabal;

        public saneness(Object obj) {
            this.f17593attabal = obj;
        }

        @Override // com.bumptech.glide.load.data.marial
        public Object attabal() {
            return this.f17593attabal;
        }

        @Override // com.bumptech.glide.load.data.marial
        public void saneness() {
        }
    }
}

package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: GlideContext.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman extends ContextWrapper {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final taiyuan<?, ?> f17948apical = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final trawler.saneness f17949attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Map<Class<?>, taiyuan<?, ?>> f17950beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.beachfront f17951competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public awlwort.competently f17952cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final belongingness.saneness f17953dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final marial f17954impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<awlwort.beachfront<Object>> f17955marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final com.bumptech.glide.util.beachfront.saneness<Registry> f17956saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f17957taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final saneness.attabal f17958wireman;

    public wireman(Context context, trawler.saneness sanenessVar, com.bumptech.glide.util.beachfront.saneness<Registry> sanenessVar2, belongingness.saneness sanenessVar3, saneness.attabal attabalVar, Map<Class<?>, taiyuan<?, ?>> map, List<awlwort.beachfront<Object>> list, com.bumptech.glide.load.engine.beachfront beachfrontVar, marial marialVar, int i) {
        super(context.getApplicationContext());
        this.f17949attabal = sanenessVar;
        this.f17953dern = sanenessVar3;
        this.f17958wireman = attabalVar;
        this.f17955marial = list;
        this.f17950beachfront = map;
        this.f17951competently = beachfrontVar;
        this.f17954impromptu = marialVar;
        this.f17957taiyuan = i;
        this.f17956saneness = com.bumptech.glide.util.beachfront.attabal(sanenessVar2);
    }

    public trawler.saneness attabal() {
        return this.f17949attabal;
    }

    public marial beachfront() {
        return this.f17954impromptu;
    }

    public int competently() {
        return this.f17957taiyuan;
    }

    public synchronized awlwort.competently dern() {
        try {
            if (this.f17952cutely == null) {
                this.f17952cutely = this.f17958wireman.build().seminary();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17952cutely;
    }

    public Registry impromptu() {
        return this.f17956saneness.get();
    }

    public com.bumptech.glide.load.engine.beachfront marial() {
        return this.f17951competently;
    }

    public List<awlwort.beachfront<Object>> saneness() {
        return this.f17955marial;
    }

    public <T> taiyuan<?, T> wireman(Class<T> cls) {
        taiyuan<?, T> taiyuanVar = (taiyuan) this.f17950beachfront.get(cls);
        if (taiyuanVar == null) {
            for (Map.Entry<Class<?>, taiyuan<?, ?>> entry : this.f17950beachfront.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    taiyuanVar = (taiyuan) entry.getValue();
                }
            }
        }
        return taiyuanVar == null ? (taiyuan<?, T>) f17948apical : taiyuanVar;
    }
}

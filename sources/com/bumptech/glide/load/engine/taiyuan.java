package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: LoadPath.java */
/* JADX INFO: loaded from: classes2.dex */
public class taiyuan<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<Data> f17776attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final List<? extends marial<Data, ResourceType, Transcode>> f17777dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final technofreak.competently<List<Throwable>> f17778saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f17779wireman;

    public taiyuan(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<marial<Data, ResourceType, Transcode>> list, technofreak.competently<List<Throwable>> competentlyVar) {
        this.f17776attabal = cls;
        this.f17778saneness = competentlyVar;
        this.f17777dern = (List) com.bumptech.glide.util.apical.dern(list);
        this.f17779wireman = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public endosteum.cutely<Transcode> attabal(com.bumptech.glide.load.data.marial<Data> marialVar, maggot.wireman wiremanVar, int i, int i2, marial.attabal<ResourceType> attabalVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.apical.wireman(this.f17778saneness.saneness());
        try {
            return saneness(marialVar, wiremanVar, i, i2, attabalVar, list);
        } finally {
            this.f17778saneness.attabal(list);
        }
    }

    public final endosteum.cutely<Transcode> saneness(com.bumptech.glide.load.data.marial<Data> marialVar, maggot.wireman wiremanVar, int i, int i2, marial.attabal<ResourceType> attabalVar, List<Throwable> list) throws GlideException {
        int size = this.f17777dern.size();
        endosteum.cutely<Transcode> cutelyVarAttabal = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                cutelyVarAttabal = this.f17777dern.get(i3).attabal(marialVar, i, i2, wiremanVar, attabalVar);
            } catch (GlideException e) {
                list.add(e);
            }
            if (cutelyVarAttabal != null) {
                break;
            }
        }
        if (cutelyVarAttabal != null) {
            return cutelyVarAttabal;
        }
        throw new GlideException(this.f17779wireman, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f17777dern.toArray()) + '}';
    }
}

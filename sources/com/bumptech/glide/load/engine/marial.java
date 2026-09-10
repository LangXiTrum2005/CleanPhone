package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: DecodePath.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<DataType> f17762attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final environ.marial<ResourceType, Transcode> f17763dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f17764marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<? extends maggot.marial<DataType, ResourceType>> f17765saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final technofreak.competently<List<Throwable>> f17766wireman;

    /* JADX INFO: compiled from: DecodePath.java */
    public interface attabal<ResourceType> {
        endosteum.cutely<ResourceType> attabal(endosteum.cutely<ResourceType> cutelyVar);
    }

    public marial(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends maggot.marial<DataType, ResourceType>> list, environ.marial<ResourceType, Transcode> marialVar, technofreak.competently<List<Throwable>> competentlyVar) {
        this.f17762attabal = cls;
        this.f17765saneness = list;
        this.f17763dern = marialVar;
        this.f17766wireman = competentlyVar;
        this.f17764marial = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public endosteum.cutely<Transcode> attabal(com.bumptech.glide.load.data.marial<DataType> marialVar, int i, int i2, maggot.wireman wiremanVar, attabal<ResourceType> attabalVar) throws GlideException {
        return this.f17763dern.attabal(attabalVar.attabal(saneness(marialVar, i, i2, wiremanVar)), wiremanVar);
    }

    public final endosteum.cutely<ResourceType> dern(com.bumptech.glide.load.data.marial<DataType> marialVar, int i, int i2, maggot.wireman wiremanVar, List<Throwable> list) throws GlideException {
        int size = this.f17765saneness.size();
        endosteum.cutely<ResourceType> cutelyVarAttabal = null;
        for (int i3 = 0; i3 < size; i3++) {
            maggot.marial<DataType, ResourceType> marialVar2 = this.f17765saneness.get(i3);
            try {
                if (marialVar2.saneness(marialVar.attabal(), wiremanVar)) {
                    cutelyVarAttabal = marialVar2.attabal(marialVar.attabal(), i, i2, wiremanVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(marialVar2);
                }
                list.add(e);
            }
            if (cutelyVarAttabal != null) {
                break;
            }
        }
        if (cutelyVarAttabal != null) {
            return cutelyVarAttabal;
        }
        throw new GlideException(this.f17764marial, new ArrayList(list));
    }

    public final endosteum.cutely<ResourceType> saneness(com.bumptech.glide.load.data.marial<DataType> marialVar, int i, int i2, maggot.wireman wiremanVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.apical.wireman(this.f17766wireman.saneness());
        try {
            return dern(marialVar, i, i2, wiremanVar, list);
        } finally {
            this.f17766wireman.attabal(list);
        }
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f17762attabal + ", decoders=" + this.f17765saneness + ", transcoder=" + this.f17763dern + '}';
    }
}

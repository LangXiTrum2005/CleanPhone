package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TranscoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12741a = new ArrayList();

    public static final class Entry<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f12742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f12743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceTranscoder f12744c;

        public Entry(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
            this.f12742a = cls;
            this.f12743b = cls2;
            this.f12744c = resourceTranscoder;
        }
    }

    public final synchronized ResourceTranscoder a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.f12745a;
        }
        for (Entry entry : this.f12741a) {
            if (entry.f12742a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.f12743b)) {
                return entry.f12744c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (Entry entry : this.f12741a) {
            if ((entry.f12742a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.f12743b)) && !arrayList.contains(entry.f12743b)) {
                arrayList.add(entry.f12743b);
            }
        }
        return arrayList;
    }

    public final synchronized void c(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
        this.f12741a.add(new Entry(cls, cls2, resourceTranscoder));
    }
}

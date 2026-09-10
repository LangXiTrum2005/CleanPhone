package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ResourceDecoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12779a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12780b = new HashMap();

    public static class Entry<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f12781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f12782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceDecoder f12783c;

        public Entry(Class cls, Class cls2, ResourceDecoder resourceDecoder) {
            this.f12781a = cls;
            this.f12782b = cls2;
            this.f12783c = resourceDecoder;
        }
    }

    public final synchronized void a(ResourceDecoder resourceDecoder, Class cls, Class cls2, String str) {
        c(str).add(new Entry(cls, cls2, resourceDecoder));
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f12779a.iterator();
        while (it.hasNext()) {
            List<Entry> list = (List) this.f12780b.get((String) it.next());
            if (list != null) {
                for (Entry entry : list) {
                    if (entry.f12781a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.f12782b)) {
                        arrayList.add(entry.f12783c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f12779a.contains(str)) {
                this.f12779a.add(str);
            }
            arrayList = (List) this.f12780b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f12780b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f12779a.iterator();
        while (it.hasNext()) {
            List<Entry> list = (List) this.f12780b.get((String) it.next());
            if (list != null) {
                for (Entry entry : list) {
                    if ((entry.f12781a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.f12782b)) && !arrayList.contains(entry.f12782b)) {
                        arrayList.add(entry.f12782b);
                    }
                }
            }
        }
        return arrayList;
    }
}

package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ResourceEncoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12784a = new ArrayList();

    public static final class Entry<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f12785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResourceEncoder f12786b;

        public Entry(Class cls, ResourceEncoder resourceEncoder) {
            this.f12785a = cls;
            this.f12786b = resourceEncoder;
        }
    }

    public final synchronized void a(Class cls, ResourceEncoder resourceEncoder) {
        this.f12784a.add(new Entry(cls, resourceEncoder));
    }

    public final synchronized ResourceEncoder b(Class cls) {
        int size = this.f12784a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) this.f12784a.get(i2);
            if (entry.f12785a.isAssignableFrom(cls)) {
                return entry.f12786b;
            }
        }
        return null;
    }
}

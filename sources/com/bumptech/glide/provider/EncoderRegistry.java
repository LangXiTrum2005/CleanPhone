package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class EncoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12770a = new ArrayList();

    public static final class Entry<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f12771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Encoder f12772b;

        public Entry(Class cls, Encoder encoder) {
            this.f12771a = cls;
            this.f12772b = encoder;
        }
    }

    public final synchronized void a(Class cls, Encoder encoder) {
        this.f12770a.add(new Entry(cls, encoder));
    }

    public final synchronized Encoder b(Class cls) {
        for (Entry entry : this.f12770a) {
            if (entry.f12771a.isAssignableFrom(cls)) {
                return entry.f12772b;
            }
        }
        return null;
    }
}

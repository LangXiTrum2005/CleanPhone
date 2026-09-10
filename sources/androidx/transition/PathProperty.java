package androidx.transition;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
class PathProperty<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8424a;

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.f8424a);
    }

    @Override // android.util.Property
    public final void set(Object obj, Float f) {
        this.f8424a = f.floatValue();
        throw null;
    }
}

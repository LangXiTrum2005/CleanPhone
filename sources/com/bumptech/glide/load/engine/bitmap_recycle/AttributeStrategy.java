package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
class AttributeStrategy implements LruPoolStrategy {

    public static class Key implements Poolable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyPool f12481a;

        public Key(KeyPool keyPool) {
            this.f12481a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f12481a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            ((Key) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return (((0 * 31) + 0) * 31) + 0;
        }

        public final String toString() {
            StringBuilder sbP = a.p(0, 0, d9.i.d, "x", "], ");
            sbP.append((Object) null);
            return sbP.toString();
        }
    }

    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    public final String toString() {
        return "AttributeStrategy:\n  null";
    }
}

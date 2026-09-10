package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
final class SizeStrategy implements LruPoolStrategy {

    public static final class Key implements Poolable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyPool f12510a;

        public Key(KeyPool keyPool) {
            this.f12510a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f12510a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            ((Key) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return a.k(d9.i.d, 0, d9.i.f24752e);
        }
    }

    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    public final String toString() {
        return "SizeStrategy:\n  null\n  SortedSizesnull";
    }
}

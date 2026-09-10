package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Bytes {

    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20049Y;

        public ByteArrayAsList(int i2, int i3) {
            this.X = i2;
            this.f20049Y = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            ((Byte) obj).byteValue();
            if (this.X >= this.f20049Y) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((ByteArrayAsList) obj).size() != size) {
                return false;
            }
            if (size <= 0) {
                return true;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, size());
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            if (this.X >= this.f20049Y) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            ((Byte) obj).byteValue();
            if (this.X >= this.f20049Y) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            ((Byte) obj).byteValue();
            if (this.f20049Y - 1 < this.X) {
                return -1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            Preconditions.i(i2, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f20049Y - this.X;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            Preconditions.l(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int i4 = this.X;
            return new ByteArrayAsList(i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 5).append(AbstractJsonLexerKt.BEGIN_LIST);
            throw null;
        }
    }
}

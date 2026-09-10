package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Chars {

    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20050Y;

        public CharArrayAsList(int i2, int i3) {
            this.X = i2;
            this.f20050Y = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            ((Character) obj).charValue();
            if (this.X >= this.f20050Y) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            int size = size();
            if (((CharArrayAsList) obj).size() != size) {
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
            if (this.X >= this.f20050Y) {
                return 1;
            }
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            ((Character) obj).charValue();
            if (this.X >= this.f20050Y) {
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
            if (!(obj instanceof Character)) {
                return -1;
            }
            ((Character) obj).charValue();
            if (this.f20050Y - 1 < this.X) {
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
            return this.f20050Y - this.X;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i2, int i3) {
            Preconditions.l(i2, i3, size());
            if (i2 == i3) {
                return Collections.EMPTY_LIST;
            }
            int i4 = this.X;
            return new CharArrayAsList(i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            new StringBuilder(size() * 3).append(AbstractJsonLexerKt.BEGIN_LIST);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LexicographicalComparator implements Comparator<char[]> {
        public static final /* synthetic */ LexicographicalComparator[] X = {new LexicographicalComparator("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        LexicographicalComparator EF5;

        public static LexicographicalComparator valueOf(String str) {
            return (LexicographicalComparator) Enum.valueOf(LexicographicalComparator.class, str);
        }

        public static LexicographicalComparator[] values() {
            return (LexicographicalComparator[]) X.clone();
        }

        @Override // java.util.Comparator
        public final int compare(char[] cArr, char[] cArr2) {
            char[] cArr3 = cArr;
            char[] cArr4 = cArr2;
            int iMin = Math.min(cArr3.length, cArr4.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int i3 = cArr3[i2] - cArr4[i2];
                if (i3 != 0) {
                    return i3;
                }
            }
            return cArr3.length - cArr4.length;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    public static char a(long j) {
        char c2 = (char) j;
        Preconditions.d(j, ((long) c2) == j, "Out of range: %s");
        return c2;
    }
}

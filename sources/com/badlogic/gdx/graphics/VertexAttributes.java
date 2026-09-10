package com.badlogic.gdx.graphics;

import com.badlogic.gdx.utils.Collections;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class VertexAttributes implements Iterable<VertexAttribute>, Comparable<VertexAttributes> {
    private final VertexAttribute[] attributes;
    private ReadonlyIterable<VertexAttribute> iterable;
    public final int vertexSize;
    private long mask = -1;
    private int boneWeightUnits = -1;
    private int textureCoordinates = -1;

    public static class ReadonlyIterable<T> implements Iterable<T> {
        private final T[] array;
        private ReadonlyIterator iterator1;
        private ReadonlyIterator iterator2;

        public ReadonlyIterable(T[] tArr) {
            this.array = tArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (Collections.allocateIterators) {
                return new ReadonlyIterator(this.array);
            }
            if (this.iterator1 == null) {
                this.iterator1 = new ReadonlyIterator(this.array);
                this.iterator2 = new ReadonlyIterator(this.array);
            }
            ReadonlyIterator readonlyIterator = this.iterator1;
            if (!readonlyIterator.valid) {
                readonlyIterator.index = 0;
                readonlyIterator.valid = true;
                this.iterator2.valid = false;
                return readonlyIterator;
            }
            ReadonlyIterator readonlyIterator2 = this.iterator2;
            readonlyIterator2.index = 0;
            readonlyIterator2.valid = true;
            readonlyIterator.valid = false;
            return readonlyIterator2;
        }
    }

    public static class ReadonlyIterator<T> implements Iterator<T>, Iterable<T> {
        private final T[] array;
        int index;
        boolean valid = true;

        public ReadonlyIterator(T[] tArr) {
            this.array = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.index < this.array.length;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.index;
            T[] tArr = this.array;
            if (i >= tArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            if (!this.valid) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            this.index = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new GdxRuntimeException("Remove not allowed.");
        }

        public void reset() {
            this.index = 0;
        }
    }

    public static final class Usage {
        public static final int BiNormal = 256;
        public static final int BoneWeight = 64;
        public static final int ColorPacked = 4;
        public static final int ColorUnpacked = 2;
        public static final int Generic = 32;
        public static final int Normal = 8;
        public static final int Position = 1;
        public static final int Tangent = 128;
        public static final int TextureCoordinates = 16;
    }

    public VertexAttributes(VertexAttribute... vertexAttributeArr) {
        if (vertexAttributeArr.length == 0) {
            throw new IllegalArgumentException("attributes must be >= 1");
        }
        VertexAttribute[] vertexAttributeArr2 = new VertexAttribute[vertexAttributeArr.length];
        for (int i = 0; i < vertexAttributeArr.length; i++) {
            vertexAttributeArr2[i] = vertexAttributeArr[i];
        }
        this.attributes = vertexAttributeArr2;
        this.vertexSize = calculateOffsets();
    }

    private int calculateOffsets() {
        int i = 0;
        int sizeInBytes = 0;
        while (true) {
            VertexAttribute[] vertexAttributeArr = this.attributes;
            if (i >= vertexAttributeArr.length) {
                return sizeInBytes;
            }
            VertexAttribute vertexAttribute = vertexAttributeArr[i];
            vertexAttribute.offset = sizeInBytes;
            sizeInBytes += vertexAttribute.getSizeInBytes();
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VertexAttributes)) {
            return false;
        }
        VertexAttributes vertexAttributes = (VertexAttributes) obj;
        if (this.attributes.length != vertexAttributes.attributes.length) {
            return false;
        }
        int i = 0;
        while (true) {
            VertexAttribute[] vertexAttributeArr = this.attributes;
            if (i >= vertexAttributeArr.length) {
                return true;
            }
            if (!vertexAttributeArr[i].equals(vertexAttributes.attributes[i])) {
                return false;
            }
            i++;
        }
    }

    public VertexAttribute findByUsage(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (get(i2).usage == i) {
                return get(i2);
            }
        }
        return null;
    }

    public VertexAttribute get(int i) {
        return this.attributes[i];
    }

    public int getBoneWeights() {
        if (this.boneWeightUnits < 0) {
            int i = 0;
            this.boneWeightUnits = 0;
            while (true) {
                VertexAttribute[] vertexAttributeArr = this.attributes;
                if (i >= vertexAttributeArr.length) {
                    break;
                }
                VertexAttribute vertexAttribute = vertexAttributeArr[i];
                if (vertexAttribute.usage == 64) {
                    this.boneWeightUnits = Math.max(this.boneWeightUnits, vertexAttribute.unit + 1);
                }
                i++;
            }
        }
        return this.boneWeightUnits;
    }

    public long getMask() {
        if (this.mask == -1) {
            long j = 0;
            int i = 0;
            while (true) {
                VertexAttribute[] vertexAttributeArr = this.attributes;
                if (i >= vertexAttributeArr.length) {
                    break;
                }
                j |= (long) vertexAttributeArr[i].usage;
                i++;
            }
            this.mask = j;
        }
        return this.mask;
    }

    public long getMaskWithSizePacked() {
        return getMask() | (((long) this.attributes.length) << 32);
    }

    public int getOffset(int i, int i2) {
        VertexAttribute vertexAttributeFindByUsage = findByUsage(i);
        return vertexAttributeFindByUsage == null ? i2 : vertexAttributeFindByUsage.offset / 4;
    }

    public int getTextureCoordinates() {
        if (this.textureCoordinates < 0) {
            int i = 0;
            this.textureCoordinates = 0;
            while (true) {
                VertexAttribute[] vertexAttributeArr = this.attributes;
                if (i >= vertexAttributeArr.length) {
                    break;
                }
                VertexAttribute vertexAttribute = vertexAttributeArr[i];
                if (vertexAttribute.usage == 16) {
                    this.textureCoordinates = Math.max(this.textureCoordinates, vertexAttribute.unit + 1);
                }
                i++;
            }
        }
        return this.textureCoordinates;
    }

    public int hashCode() {
        long length = this.attributes.length * 61;
        int i = 0;
        while (true) {
            VertexAttribute[] vertexAttributeArr = this.attributes;
            if (i >= vertexAttributeArr.length) {
                return (int) (length ^ (length >> 32));
            }
            length = (length * 61) + ((long) vertexAttributeArr[i].hashCode());
            i++;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<VertexAttribute> iterator() {
        if (this.iterable == null) {
            this.iterable = new ReadonlyIterable<>(this.attributes);
        }
        return this.iterable.iterator();
    }

    public int size() {
        return this.attributes.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.attributes.length; i++) {
            sb.append("(");
            sb.append(this.attributes[i].alias);
            sb.append(", ");
            sb.append(this.attributes[i].usage);
            sb.append(", ");
            sb.append(this.attributes[i].numComponents);
            sb.append(", ");
            sb.append(this.attributes[i].offset);
            sb.append(")\n");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(VertexAttributes vertexAttributes) {
        VertexAttribute[] vertexAttributeArr = this.attributes;
        int length = vertexAttributeArr.length;
        VertexAttribute[] vertexAttributeArr2 = vertexAttributes.attributes;
        if (length != vertexAttributeArr2.length) {
            return vertexAttributeArr.length - vertexAttributeArr2.length;
        }
        long mask = getMask();
        long mask2 = vertexAttributes.getMask();
        if (mask != mask2) {
            return mask < mask2 ? -1 : 1;
        }
        for (int length2 = this.attributes.length - 1; length2 >= 0; length2--) {
            VertexAttribute vertexAttribute = this.attributes[length2];
            VertexAttribute vertexAttribute2 = vertexAttributes.attributes[length2];
            int i = vertexAttribute.usage;
            int i2 = vertexAttribute2.usage;
            if (i != i2) {
                return i - i2;
            }
            int i3 = vertexAttribute.unit;
            int i4 = vertexAttribute2.unit;
            if (i3 != i4) {
                return i3 - i4;
            }
            int i5 = vertexAttribute.numComponents;
            int i6 = vertexAttribute2.numComponents;
            if (i5 != i6) {
                return i5 - i6;
            }
            boolean z = vertexAttribute.normalized;
            if (z != vertexAttribute2.normalized) {
                return z ? 1 : -1;
            }
            int i7 = vertexAttribute.type;
            int i8 = vertexAttribute2.type;
            if (i7 != i8) {
                return i7 - i8;
            }
        }
        return 0;
    }

    public int getOffset(int i) {
        return getOffset(i, 0);
    }
}

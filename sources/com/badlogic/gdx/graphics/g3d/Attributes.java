package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.utils.Array;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Attributes implements Iterable<Attribute>, Comparator<Attribute>, Comparable<Attributes> {
    protected long mask;
    protected final Array<Attribute> attributes = new Array<>();
    protected boolean sorted = true;

    private final void disable(long j) {
        this.mask = (~j) & this.mask;
    }

    private final void enable(long j) {
        this.mask = j | this.mask;
    }

    public int attributesHash() {
        sort();
        int i = this.attributes.size;
        long jHashCode = this.mask + 71;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 7) & 65535;
            jHashCode += this.mask * ((long) this.attributes.get(i3).hashCode()) * ((long) i2);
        }
        return (int) ((jHashCode >> 32) ^ jHashCode);
    }

    public void clear() {
        this.mask = 0L;
        this.attributes.clear();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (!(obj instanceof Attributes)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return same((Attributes) obj, true);
    }

    public final Attribute get(long j) {
        if (!has(j)) {
            return null;
        }
        int i = 0;
        while (true) {
            Array<Attribute> array = this.attributes;
            if (i >= array.size) {
                return null;
            }
            if (array.get(i).type == j) {
                return this.attributes.get(i);
            }
            i++;
        }
    }

    public final long getMask() {
        return this.mask;
    }

    public final boolean has(long j) {
        return j != 0 && (this.mask & j) == j;
    }

    public int hashCode() {
        return attributesHash();
    }

    public int indexOf(long j) {
        if (!has(j)) {
            return -1;
        }
        int i = 0;
        while (true) {
            Array<Attribute> array = this.attributes;
            if (i >= array.size) {
                return -1;
            }
            if (array.get(i).type == j) {
                return i;
            }
            i++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Attribute> iterator() {
        return this.attributes.iterator();
    }

    public final void remove(long j) {
        for (int i = this.attributes.size - 1; i >= 0; i--) {
            long j2 = this.attributes.get(i).type;
            if ((j & j2) == j2) {
                this.attributes.removeIndex(i);
                disable(j2);
                this.sorted = false;
            }
        }
        sort();
    }

    public final boolean same(Attributes attributes, boolean z) {
        if (attributes == this) {
            return true;
        }
        if (attributes == null || this.mask != attributes.mask) {
            return false;
        }
        if (!z) {
            return true;
        }
        sort();
        attributes.sort();
        int i = 0;
        while (true) {
            Array<Attribute> array = this.attributes;
            if (i >= array.size) {
                return true;
            }
            if (!array.get(i).equals(attributes.attributes.get(i))) {
                return false;
            }
            i++;
        }
    }

    public final void set(Attribute attribute) {
        int iIndexOf = indexOf(attribute.type);
        if (iIndexOf < 0) {
            enable(attribute.type);
            this.attributes.add(attribute);
            this.sorted = false;
        } else {
            this.attributes.set(iIndexOf, attribute);
        }
        sort();
    }

    public int size() {
        return this.attributes.size;
    }

    public final void sort() {
        if (this.sorted) {
            return;
        }
        this.attributes.sort(this);
        this.sorted = true;
    }

    @Override // java.util.Comparator
    public final int compare(Attribute attribute, Attribute attribute2) {
        return (int) (attribute.type - attribute2.type);
    }

    @Override // java.lang.Comparable
    public int compareTo(Attributes attributes) {
        if (attributes == this) {
            return 0;
        }
        long j = this.mask;
        long j2 = attributes.mask;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        sort();
        attributes.sort();
        int i = 0;
        while (true) {
            Array<Attribute> array = this.attributes;
            if (i >= array.size) {
                return 0;
            }
            int iCompareTo = array.get(i).compareTo(attributes.attributes.get(i));
            if (iCompareTo != 0) {
                if (iCompareTo < 0) {
                    return -1;
                }
                return iCompareTo > 0 ? 1 : 0;
            }
            i++;
        }
    }

    public final <T extends Attribute> T get(Class<T> cls, long j) {
        return (T) get(j);
    }

    public final Array<Attribute> get(Array<Attribute> array, long j) {
        int i = 0;
        while (true) {
            Array<Attribute> array2 = this.attributes;
            if (i >= array2.size) {
                return array;
            }
            if ((array2.get(i).type & j) != 0) {
                array.add(this.attributes.get(i));
            }
            i++;
        }
    }

    public final boolean same(Attributes attributes) {
        return same(attributes, false);
    }

    public final void set(Attribute attribute, Attribute attribute2) {
        set(attribute);
        set(attribute2);
    }

    public final void set(Attribute attribute, Attribute attribute2, Attribute attribute3) {
        set(attribute);
        set(attribute2);
        set(attribute3);
    }

    public final void set(Attribute attribute, Attribute attribute2, Attribute attribute3, Attribute attribute4) {
        set(attribute);
        set(attribute2);
        set(attribute3);
        set(attribute4);
    }

    public final void set(Attribute... attributeArr) {
        for (Attribute attribute : attributeArr) {
            set(attribute);
        }
    }

    public final void set(Iterable<Attribute> iterable) {
        Iterator<Attribute> it = iterable.iterator();
        while (it.hasNext()) {
            set(it.next());
        }
    }
}

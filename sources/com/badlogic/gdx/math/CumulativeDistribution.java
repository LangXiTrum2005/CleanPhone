package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: loaded from: classes.dex */
public class CumulativeDistribution<T> {
    private Array<CumulativeDistribution<T>.CumulativeValue> values = new Array<>(false, 10, CumulativeValue.class);

    public class CumulativeValue {
        public float frequency;
        public float interval;
        public T value;

        public CumulativeValue(T t, float f, float f2) {
            this.value = t;
            this.frequency = f;
            this.interval = f2;
        }
    }

    public void add(T t, float f) {
        this.values.add(new CumulativeValue(t, 0.0f, f));
    }

    public void clear() {
        this.values.clear();
    }

    public void generate() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            Array<CumulativeDistribution<T>.CumulativeValue> array = this.values;
            if (i >= array.size) {
                return;
            }
            CumulativeDistribution<T>.CumulativeValue[] cumulativeValueArr = array.items;
            f += cumulativeValueArr[i].interval;
            cumulativeValueArr[i].frequency = f;
            i++;
        }
    }

    public void generateNormalized() {
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        while (true) {
            Array<CumulativeDistribution<T>.CumulativeValue> array = this.values;
            if (i2 >= array.size) {
                break;
            }
            f2 += array.items[i2].interval;
            i2++;
        }
        while (true) {
            Array<CumulativeDistribution<T>.CumulativeValue> array2 = this.values;
            if (i >= array2.size) {
                return;
            }
            CumulativeDistribution<T>.CumulativeValue[] cumulativeValueArr = array2.items;
            f += cumulativeValueArr[i].interval / f2;
            cumulativeValueArr[i].frequency = f;
            i++;
        }
    }

    public void generateUniform() {
        float f = 1.0f / this.values.size;
        int i = 0;
        while (true) {
            Array<CumulativeDistribution<T>.CumulativeValue> array = this.values;
            if (i >= array.size) {
                return;
            }
            CumulativeDistribution<T>.CumulativeValue[] cumulativeValueArr = array.items;
            cumulativeValueArr[i].interval = f;
            CumulativeDistribution<T>.CumulativeValue cumulativeValue = cumulativeValueArr[i];
            i++;
            cumulativeValue.frequency = i * f;
        }
    }

    public float getInterval(int i) {
        return this.values.items[i].interval;
    }

    public T getValue(int i) {
        return this.values.items[i].value;
    }

    public void setInterval(T t, float f) {
        Array.ArrayIterator<CumulativeDistribution<T>.CumulativeValue> it = this.values.iterator();
        while (it.hasNext()) {
            CumulativeDistribution<T>.CumulativeValue next = it.next();
            if (next.value == t) {
                next.interval = f;
                return;
            }
        }
    }

    public int size() {
        return this.values.size;
    }

    public T value(float f) {
        int i = this.values.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = ((i - i2) / 2) + i2;
            float f2 = this.values.items[i3].frequency;
            if (f >= f2) {
                if (f <= f2) {
                    break;
                }
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        return this.values.items[i2].value;
    }

    public void add(T t) {
        this.values.add(new CumulativeValue(t, 0.0f, 0.0f));
    }

    public void setInterval(int i, float f) {
        this.values.items[i].interval = f;
    }

    public T value() {
        return value(MathUtils.random());
    }
}

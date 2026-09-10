package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.Rectangle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class QuadTreeFloat implements Pool.Poolable {
    public static final int DISTSQR = 3;
    public static final int VALUE = 0;
    public static final int X = 1;
    public static final int Y = 2;
    private static final Pool<QuadTreeFloat> pool = new Pool(128, 4096) { // from class: com.badlogic.gdx.utils.QuadTreeFloat.1
        @Override // com.badlogic.gdx.utils.Pool
        public Object newObject() {
            return new QuadTreeFloat();
        }
    };
    public int count;
    public int depth;
    public float height;
    public final int maxDepth;
    public final int maxValues;

    @Null
    public QuadTreeFloat ne;

    @Null
    public QuadTreeFloat nw;

    @Null
    public QuadTreeFloat se;

    @Null
    public QuadTreeFloat sw;
    public float[] values;
    public float width;
    public float x;
    public float y;

    public QuadTreeFloat() {
        this(16, 8);
    }

    private void addToChild(float f, float f2, float f3) {
        QuadTreeFloat quadTreeFloatObtainChild;
        float f4 = this.width / 2.0f;
        float f5 = this.height / 2.0f;
        float f6 = this.x;
        if (f2 < f6 + f4) {
            float f7 = this.y;
            if (f3 < f7 + f5) {
                quadTreeFloatObtainChild = this.sw;
                if (quadTreeFloatObtainChild == null) {
                    quadTreeFloatObtainChild = obtainChild(f6, f7, f4, f5, this.depth + 1);
                    this.sw = quadTreeFloatObtainChild;
                }
            } else {
                quadTreeFloatObtainChild = this.nw;
                if (quadTreeFloatObtainChild == null) {
                    quadTreeFloatObtainChild = obtainChild(f6, f7 + f5, f4, f5, this.depth + 1);
                    this.nw = quadTreeFloatObtainChild;
                }
            }
        } else {
            float f8 = this.y;
            if (f3 < f8 + f5) {
                quadTreeFloatObtainChild = this.se;
                if (quadTreeFloatObtainChild == null) {
                    quadTreeFloatObtainChild = obtainChild(f6 + f4, f8, f4, f5, this.depth + 1);
                    this.se = quadTreeFloatObtainChild;
                }
            } else {
                quadTreeFloatObtainChild = this.ne;
                if (quadTreeFloatObtainChild == null) {
                    quadTreeFloatObtainChild = obtainChild(f6 + f4, f8 + f5, f4, f5, this.depth + 1);
                    this.ne = quadTreeFloatObtainChild;
                }
            }
        }
        quadTreeFloatObtainChild.add(f, f2, f3);
    }

    private void findNearestInternal(float f, float f2, FloatArray floatArray) {
        float f3 = this.x;
        if (f3 >= f || f3 + this.width <= f) {
            return;
        }
        float f4 = this.y;
        if (f4 >= f2 || f4 + this.height <= f2) {
            return;
        }
        int i = this.count;
        if (i == -1) {
            QuadTreeFloat quadTreeFloat = this.nw;
            if (quadTreeFloat != null) {
                quadTreeFloat.findNearestInternal(f, f2, floatArray);
            }
            QuadTreeFloat quadTreeFloat2 = this.sw;
            if (quadTreeFloat2 != null) {
                quadTreeFloat2.findNearestInternal(f, f2, floatArray);
            }
            QuadTreeFloat quadTreeFloat3 = this.ne;
            if (quadTreeFloat3 != null) {
                quadTreeFloat3.findNearestInternal(f, f2, floatArray);
            }
            QuadTreeFloat quadTreeFloat4 = this.se;
            if (quadTreeFloat4 != null) {
                quadTreeFloat4.findNearestInternal(f, f2, floatArray);
                return;
            }
            return;
        }
        float fFirst = floatArray.first();
        float f5 = floatArray.get(1);
        float f6 = floatArray.get(2);
        float f7 = floatArray.get(3);
        float[] fArr = this.values;
        for (int i2 = 1; i2 < i; i2 += 3) {
            float f8 = fArr[i2];
            float f9 = fArr[i2 + 1];
            float f10 = f8 - f;
            float f11 = f9 - f2;
            float f12 = (f11 * f11) + (f10 * f10);
            if (f12 < f7) {
                fFirst = fArr[i2 - 1];
                f5 = f8;
                f6 = f9;
                f7 = f12;
            }
        }
        floatArray.set(0, fFirst);
        floatArray.set(1, f5);
        floatArray.set(2, f6);
        floatArray.set(3, f7);
    }

    private QuadTreeFloat obtainChild(float f, float f2, float f3, float f4, int i) {
        QuadTreeFloat quadTreeFloatObtain = pool.obtain();
        quadTreeFloatObtain.x = f;
        quadTreeFloatObtain.y = f2;
        quadTreeFloatObtain.width = f3;
        quadTreeFloatObtain.height = f4;
        quadTreeFloatObtain.depth = i;
        return quadTreeFloatObtain;
    }

    private void split(float f, float f2, float f3) {
        float[] fArr = this.values;
        for (int i = 0; i < this.maxValues; i += 3) {
            addToChild(fArr[i], fArr[i + 1], fArr[i + 2]);
        }
        this.count = -1;
        addToChild(f, f2, f3);
    }

    public void add(float f, float f2, float f3) {
        int i = this.count;
        if (i == -1) {
            addToChild(f, f2, f3);
            return;
        }
        if (this.depth >= this.maxDepth) {
            float[] fArr = this.values;
            if (i == fArr.length) {
                this.values = Arrays.copyOf(fArr, growValues());
            }
        } else if (i == this.maxValues) {
            split(f, f2, f3);
            return;
        }
        float[] fArr2 = this.values;
        fArr2[i] = f;
        fArr2[i + 1] = f2;
        fArr2[i + 2] = f3;
        this.count += 3;
    }

    public int growValues() {
        return this.count + 30;
    }

    public boolean nearest(float f, float f2, FloatArray floatArray) {
        floatArray.clear();
        floatArray.add(0.0f);
        floatArray.add(0.0f);
        floatArray.add(0.0f);
        floatArray.add(Float.POSITIVE_INFINITY);
        findNearestInternal(f, f2, floatArray);
        float fFirst = floatArray.first();
        float f3 = floatArray.get(1);
        float f4 = floatArray.get(2);
        float f5 = floatArray.get(3);
        boolean z = f5 != Float.POSITIVE_INFINITY;
        if (!z) {
            float fMax = Math.max(this.width, this.height);
            f5 = fMax * fMax;
        }
        floatArray.clear();
        query(f, f2, (float) Math.sqrt(f5), floatArray);
        int i = floatArray.size;
        for (int i2 = 3; i2 < i; i2 += 4) {
            float f6 = floatArray.get(i2);
            if (f6 < f5) {
                fFirst = floatArray.get(i2 - 3);
                f3 = floatArray.get(i2 - 2);
                f4 = floatArray.get(i2 - 1);
                f5 = f6;
            }
        }
        if (!z && floatArray.isEmpty()) {
            return false;
        }
        floatArray.clear();
        floatArray.add(fFirst);
        floatArray.add(f3);
        floatArray.add(f4);
        floatArray.add(f5);
        return true;
    }

    public void query(float f, float f2, float f3, FloatArray floatArray) {
        query(f, f2, f3 * f3, f - f3, f2 - f3, f3 * 2.0f, floatArray);
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
        if (this.count == -1) {
            QuadTreeFloat quadTreeFloat = this.nw;
            if (quadTreeFloat != null) {
                pool.free(quadTreeFloat);
                this.nw = null;
            }
            QuadTreeFloat quadTreeFloat2 = this.sw;
            if (quadTreeFloat2 != null) {
                pool.free(quadTreeFloat2);
                this.sw = null;
            }
            QuadTreeFloat quadTreeFloat3 = this.ne;
            if (quadTreeFloat3 != null) {
                pool.free(quadTreeFloat3);
                this.ne = null;
            }
            QuadTreeFloat quadTreeFloat4 = this.se;
            if (quadTreeFloat4 != null) {
                pool.free(quadTreeFloat4);
                this.se = null;
            }
        }
        this.count = 0;
        int length = this.values.length;
        int i = this.maxValues;
        if (length > i) {
            this.values = new float[i];
        }
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public QuadTreeFloat(int i, int i2) {
        int i3 = i * 3;
        this.maxValues = i3;
        this.maxDepth = i2;
        this.values = new float[i3];
    }

    private void query(float f, float f2, float f3, float f4, float f5, float f6, FloatArray floatArray) {
        float f7 = this.x;
        if (f7 >= f4 + f6 || f7 + this.width <= f4) {
            return;
        }
        float f8 = this.y;
        if (f8 >= f5 + f6 || f8 + this.height <= f5) {
            return;
        }
        int i = this.count;
        if (i == -1) {
            QuadTreeFloat quadTreeFloat = this.nw;
            if (quadTreeFloat != null) {
                quadTreeFloat.query(f, f2, f3, f4, f5, f6, floatArray);
            }
            QuadTreeFloat quadTreeFloat2 = this.sw;
            if (quadTreeFloat2 != null) {
                quadTreeFloat2.query(f, f2, f3, f4, f5, f6, floatArray);
            }
            QuadTreeFloat quadTreeFloat3 = this.ne;
            if (quadTreeFloat3 != null) {
                quadTreeFloat3.query(f, f2, f3, f4, f5, f6, floatArray);
            }
            QuadTreeFloat quadTreeFloat4 = this.se;
            if (quadTreeFloat4 != null) {
                quadTreeFloat4.query(f, f2, f3, f4, f5, f6, floatArray);
                return;
            }
            return;
        }
        float[] fArr = this.values;
        for (int i2 = 1; i2 < i; i2 += 3) {
            float f9 = fArr[i2];
            float f10 = fArr[i2 + 1];
            float f11 = f9 - f;
            float f12 = f10 - f2;
            float f13 = (f12 * f12) + (f11 * f11);
            if (f13 <= f3) {
                floatArray.add(fArr[i2 - 1]);
                floatArray.add(f9);
                floatArray.add(f10);
                floatArray.add(f13);
            }
        }
    }

    public void query(Rectangle rectangle, FloatArray floatArray) {
        float f = this.x;
        float f2 = rectangle.x;
        if (f >= rectangle.width + f2 || f + this.width <= f2) {
            return;
        }
        float f3 = this.y;
        float f4 = rectangle.y;
        if (f3 >= rectangle.height + f4 || f3 + this.height <= f4) {
            return;
        }
        int i = this.count;
        if (i != -1) {
            float[] fArr = this.values;
            for (int i2 = 1; i2 < i; i2 += 3) {
                float f5 = fArr[i2];
                float f6 = fArr[i2 + 1];
                if (rectangle.contains(f5, f6)) {
                    floatArray.add(fArr[i2 - 1]);
                    floatArray.add(f5);
                    floatArray.add(f6);
                }
            }
            return;
        }
        QuadTreeFloat quadTreeFloat = this.nw;
        if (quadTreeFloat != null) {
            quadTreeFloat.query(rectangle, floatArray);
        }
        QuadTreeFloat quadTreeFloat2 = this.sw;
        if (quadTreeFloat2 != null) {
            quadTreeFloat2.query(rectangle, floatArray);
        }
        QuadTreeFloat quadTreeFloat3 = this.ne;
        if (quadTreeFloat3 != null) {
            quadTreeFloat3.query(rectangle, floatArray);
        }
        QuadTreeFloat quadTreeFloat4 = this.se;
        if (quadTreeFloat4 != null) {
            quadTreeFloat4.query(rectangle, floatArray);
        }
    }
}

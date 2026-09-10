package com.badlogic.gdx.math;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public final class WindowedMean {
    int last_value;
    float[] values;
    int added_values = 0;
    float mean = 0.0f;
    boolean dirty = true;

    public WindowedMean(int i) {
        this.values = new float[i];
    }

    public void addValue(float f) {
        int i = this.added_values;
        float[] fArr = this.values;
        if (i < fArr.length) {
            this.added_values = i + 1;
        }
        int i2 = this.last_value;
        int i3 = i2 + 1;
        this.last_value = i3;
        fArr[i2] = f;
        if (i3 > fArr.length - 1) {
            this.last_value = 0;
        }
        this.dirty = true;
    }

    public void clear() {
        int i = 0;
        this.added_values = 0;
        this.last_value = 0;
        while (true) {
            float[] fArr = this.values;
            if (i >= fArr.length) {
                this.dirty = true;
                return;
            } else {
                fArr[i] = 0.0f;
                i++;
            }
        }
    }

    public float getHighest() {
        float fMax = Float.MIN_NORMAL;
        int i = 0;
        while (true) {
            float[] fArr = this.values;
            if (i >= fArr.length) {
                return fMax;
            }
            fMax = Math.max(fMax, fArr[i]);
            i++;
        }
    }

    public float getLatest() {
        float[] fArr = this.values;
        int length = this.last_value;
        if (length - 1 == -1) {
            length = fArr.length;
        }
        return fArr[length - 1];
    }

    public float getLowest() {
        float fMin = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            float[] fArr = this.values;
            if (i >= fArr.length) {
                return fMin;
            }
            fMin = Math.min(fMin, fArr[i]);
            i++;
        }
    }

    public float getMean() {
        float[] fArr;
        float f = 0.0f;
        if (!hasEnoughData()) {
            return 0.0f;
        }
        if (this.dirty) {
            int i = 0;
            while (true) {
                fArr = this.values;
                if (i >= fArr.length) {
                    break;
                }
                f += fArr[i];
                i++;
            }
            this.mean = f / fArr.length;
            this.dirty = false;
        }
        return this.mean;
    }

    public float getOldest() {
        int i = this.added_values;
        float[] fArr = this.values;
        return i < fArr.length ? fArr[0] : fArr[this.last_value];
    }

    public int getValueCount() {
        return this.added_values;
    }

    public int getWindowSize() {
        return this.values.length;
    }

    public float[] getWindowValues() {
        int i = this.added_values;
        float[] fArr = new float[i];
        if (hasEnoughData()) {
            for (int i2 = 0; i2 < i; i2++) {
                float[] fArr2 = this.values;
                fArr[i2] = fArr2[(this.last_value + i2) % fArr2.length];
            }
        } else {
            System.arraycopy(this.values, 0, fArr, 0, this.added_values);
        }
        return fArr;
    }

    public boolean hasEnoughData() {
        return this.added_values >= this.values.length;
    }

    public float standardDeviation() {
        float fW = 0.0f;
        if (!hasEnoughData()) {
            return 0.0f;
        }
        float mean = getMean();
        int i = 0;
        while (true) {
            float[] fArr = this.values;
            if (i >= fArr.length) {
                return (float) Math.sqrt(fW / fArr.length);
            }
            float f = fArr[i];
            fW = AbstractC5044xl.w(f, mean, f - mean, fW);
            i++;
        }
    }
}

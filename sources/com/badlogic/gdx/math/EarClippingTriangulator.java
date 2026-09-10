package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.ShortArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class EarClippingTriangulator {
    private static final int CONCAVE = -1;
    private static final int CONVEX = 1;
    private short[] indices;
    private int vertexCount;
    private float[] vertices;
    private final ShortArray indicesArray = new ShortArray();
    private final IntArray vertexTypes = new IntArray();
    private final ShortArray triangles = new ShortArray();

    private int classifyVertex(int i) {
        short[] sArr = this.indices;
        int i2 = sArr[previousIndex(i)] * 2;
        int i3 = sArr[i] * 2;
        int i4 = sArr[nextIndex(i)] * 2;
        float[] fArr = this.vertices;
        return computeSpannedAreaSign(fArr[i2], fArr[i2 + 1], fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i4 + 1]);
    }

    private static int computeSpannedAreaSign(float f, float f2, float f3, float f4, float f5, float f6) {
        return (int) Math.signum(((f4 - f2) * f5) + AbstractC5044xl.w(f2, f6, f3, (f6 - f4) * f));
    }

    private void cutEarTip(int i) {
        short[] sArr = this.indices;
        ShortArray shortArray = this.triangles;
        shortArray.add(sArr[previousIndex(i)]);
        shortArray.add(sArr[i]);
        shortArray.add(sArr[nextIndex(i)]);
        this.indicesArray.removeIndex(i);
        this.vertexTypes.removeIndex(i);
        this.vertexCount--;
    }

    private int findEarTip() {
        int i = this.vertexCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (isEarTip(i2)) {
                return i2;
            }
        }
        int[] iArr = this.vertexTypes.items;
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] != -1) {
                return i3;
            }
        }
        return 0;
    }

    private boolean isEarTip(int i) {
        int[] iArr = this.vertexTypes.items;
        if (iArr[i] == -1) {
            return false;
        }
        int iPreviousIndex = previousIndex(i);
        int iNextIndex = nextIndex(i);
        short[] sArr = this.indices;
        int i2 = sArr[iPreviousIndex] * 2;
        int i3 = sArr[i] * 2;
        int i4 = sArr[iNextIndex] * 2;
        float[] fArr = this.vertices;
        float f = fArr[i2];
        int i5 = 1;
        float f2 = fArr[i2 + 1];
        float f3 = fArr[i3];
        float f4 = fArr[i3 + 1];
        float f5 = fArr[i4];
        float f6 = fArr[i4 + 1];
        int iNextIndex2 = nextIndex(iNextIndex);
        while (iNextIndex2 != iPreviousIndex) {
            if (iArr[iNextIndex2] != i5) {
                int i6 = sArr[iNextIndex2] * 2;
                float f7 = fArr[i6];
                float f8 = fArr[i6 + i5];
                if (computeSpannedAreaSign(f5, f6, f, f2, f7, f8) >= 0 && computeSpannedAreaSign(f, f2, f3, f4, f7, f8) >= 0 && computeSpannedAreaSign(f3, f4, f5, f6, f7, f8) >= 0) {
                    return false;
                }
            }
            iNextIndex2 = nextIndex(iNextIndex2);
            i5 = 1;
        }
        return true;
    }

    private int nextIndex(int i) {
        return (i + 1) % this.vertexCount;
    }

    private int previousIndex(int i) {
        if (i == 0) {
            i = this.vertexCount;
        }
        return i - 1;
    }

    private void triangulate() {
        int i;
        int[] iArr = this.vertexTypes.items;
        while (true) {
            i = this.vertexCount;
            int i2 = 0;
            if (i <= 3) {
                break;
            }
            int iFindEarTip = findEarTip();
            cutEarTip(iFindEarTip);
            int iPreviousIndex = previousIndex(iFindEarTip);
            if (iFindEarTip != this.vertexCount) {
                i2 = iFindEarTip;
            }
            iArr[iPreviousIndex] = classifyVertex(iPreviousIndex);
            iArr[i2] = classifyVertex(i2);
        }
        if (i == 3) {
            ShortArray shortArray = this.triangles;
            short[] sArr = this.indices;
            shortArray.add(sArr[0]);
            shortArray.add(sArr[1]);
            shortArray.add(sArr[2]);
        }
    }

    public ShortArray computeTriangles(FloatArray floatArray) {
        return computeTriangles(floatArray.items, 0, floatArray.size);
    }

    public ShortArray computeTriangles(float[] fArr) {
        return computeTriangles(fArr, 0, fArr.length);
    }

    public ShortArray computeTriangles(float[] fArr, int i, int i2) {
        this.vertices = fArr;
        int i3 = i2 / 2;
        this.vertexCount = i3;
        int i4 = i / 2;
        ShortArray shortArray = this.indicesArray;
        shortArray.clear();
        shortArray.ensureCapacity(i3);
        shortArray.size = i3;
        short[] sArr = shortArray.items;
        this.indices = sArr;
        if (GeometryUtils.isClockwise(fArr, i, i2)) {
            for (short s = 0; s < i3; s = (short) (s + 1)) {
                sArr[s] = (short) (i4 + s);
            }
        } else {
            int i5 = i3 - 1;
            for (int i6 = 0; i6 < i3; i6++) {
                sArr[i6] = (short) ((i4 + i5) - i6);
            }
        }
        IntArray intArray = this.vertexTypes;
        intArray.clear();
        intArray.ensureCapacity(i3);
        for (int i7 = 0; i7 < i3; i7++) {
            intArray.add(classifyVertex(i7));
        }
        ShortArray shortArray2 = this.triangles;
        shortArray2.clear();
        shortArray2.ensureCapacity(Math.max(0, i3 - 2) * 3);
        triangulate();
        return shortArray2;
    }
}

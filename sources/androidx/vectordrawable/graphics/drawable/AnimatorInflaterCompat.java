package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.core.graphics.PathParser;

/* JADX INFO: loaded from: classes.dex */
public class AnimatorInflaterCompat {

    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f8478a;

        @Override // android.animation.TypeEvaluator
        public final PathParser.PathDataNode[] evaluate(float f, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.a(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.a(this.f8478a, pathDataNodeArr3)) {
                this.f8478a = PathParser.d(pathDataNodeArr3);
            }
            for (int i2 = 0; i2 < pathDataNodeArr3.length; i2++) {
                PathParser.PathDataNode pathDataNode = this.f8478a[i2];
                PathParser.PathDataNode pathDataNode2 = pathDataNodeArr3[i2];
                PathParser.PathDataNode pathDataNode3 = pathDataNodeArr4[i2];
                pathDataNode.getClass();
                pathDataNode.f4301a = pathDataNode2.f4301a;
                int i3 = 0;
                while (true) {
                    float[] fArr = pathDataNode2.f4302b;
                    if (i3 < fArr.length) {
                        pathDataNode.f4302b[i3] = (pathDataNode3.f4302b[i3] * f) + ((1.0f - f) * fArr[i3]);
                        i3++;
                    }
                }
            }
            return this.f8478a;
        }
    }
}

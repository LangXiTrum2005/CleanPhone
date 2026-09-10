package com.airbnb.lottie.animation.content;

import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class MergePathsContent implements PathContent, GreedyContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9605a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f9606b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f9607c = new Path();
    public final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MergePaths f9608e;

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9609a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f9609a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9609a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9609a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9609a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9609a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f9608e = mergePaths;
    }

    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.f9606b;
        path.reset();
        Path path2 = this.f9605a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            PathContent pathContent = (PathContent) arrayList.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                ArrayList arrayList2 = (ArrayList) contentGroup.g();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathU = ((PathContent) arrayList2.get(size2)).u();
                    TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.k;
                    if (transformKeyframeAnimation != null) {
                        matrixE2 = transformKeyframeAnimation.e();
                    } else {
                        matrixE2 = contentGroup.f9574c;
                        matrixE2.reset();
                    }
                    pathU.transform(matrixE2);
                    path.addPath(pathU);
                }
            } else {
                path.addPath(pathContent.u());
            }
        }
        int i2 = 0;
        PathContent pathContent2 = (PathContent) arrayList.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List listG = contentGroup2.g();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listG;
                if (i2 >= arrayList3.size()) {
                    break;
                }
                Path pathU2 = ((PathContent) arrayList3.get(i2)).u();
                TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.k;
                if (transformKeyframeAnimation2 != null) {
                    matrixE = transformKeyframeAnimation2.e();
                } else {
                    matrixE = contentGroup2.f9574c;
                    matrixE.reset();
                }
                pathU2.transform(matrixE);
                path2.addPath(pathU2);
                i2++;
            }
        } else {
            path2.set(pathContent2.u());
        }
        this.f9607c.op(path2, path, op);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((PathContent) arrayList.get(i2)).b(list, list2);
            i2++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public final void g(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof PathContent) {
                this.d.add((PathContent) content);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path u() {
        Path path = this.f9607c;
        path.reset();
        MergePaths mergePaths = this.f9608e;
        if (!mergePaths.f9775b) {
            int iOrdinal = mergePaths.f9774a.ordinal();
            if (iOrdinal == 0) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((PathContent) arrayList.get(i2)).u());
                    i2++;
                }
            } else {
                if (iOrdinal == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}

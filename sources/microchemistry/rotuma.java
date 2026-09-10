package microchemistry;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.core.app.NotificationCompat;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Shapes.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmicrochemistry/adultoid;", "Landroid/graphics/Matrix;", "matrix", "dern", "(Lmicrochemistry/adultoid;Landroid/graphics/Matrix;)Lmicrochemistry/adultoid;", "Lmicrochemistry/impassible;", "", NotificationCompat.CATEGORY_PROGRESS, "Landroid/graphics/Path;", "path", "saneness", "(Lmicrochemistry/impassible;FLandroid/graphics/Path;)Landroid/graphics/Path;", "", "Lmicrochemistry/wireman;", "cubics", "", "attabal", "(Landroid/graphics/Path;Ljava/util/List;)V", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class rotuma {

    /* JADX INFO: compiled from: Shapes.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "x", "y", "Landroidx/collection/competently;", "Landroidx/graphics/shapes/TransformResult;", "attabal", "(FF)J"}, k = 3, mv = {1, 8, 0})
    public static final class attabal implements monoploid {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ float[] f33398attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Matrix f33399saneness;

        public attabal(float[] fArr, Matrix matrix) {
            this.f33398attabal = fArr;
            this.f33399saneness = matrix;
        }

        @Override // microchemistry.monoploid
        public final long attabal(float f, float f2) {
            float[] fArr = this.f33398attabal;
            fArr[0] = f;
            fArr[1] = f2;
            this.f33399saneness.mapPoints(fArr);
            float[] fArr2 = this.f33398attabal;
            return androidx.collection.competently.saneness(fArr2[0], fArr2[1]);
        }
    }

    public static final void attabal(Path path, List<? extends wireman> list) {
        path.rewind();
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            wireman wiremanVar = list.get(i);
            if (z) {
                path.moveTo(wiremanVar.saneness(), wiremanVar.dern());
                z = false;
            }
            path.cubicTo(wiremanVar.beachfront(), wiremanVar.competently(), wiremanVar.impromptu(), wiremanVar.taiyuan(), wiremanVar.wireman(), wiremanVar.marial());
        }
        path.close();
    }

    public static final adultoid dern(adultoid adultoidVar, Matrix matrix) {
        Intrinsics.checkNotNullParameter(adultoidVar, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return adultoidVar.impromptu(new attabal(new float[2], matrix));
    }

    public static final Path saneness(impassible impassibleVar, float f, Path path) {
        Intrinsics.checkNotNullParameter(impassibleVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        attabal(path, impassibleVar.attabal(f));
        return path;
    }
}

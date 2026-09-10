package phrasemonger;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: compiled from: ImageMatrixProperty.java */
/* JADX INFO: loaded from: classes3.dex */
public class competently extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Matrix f35297attabal;

    public competently() {
        super(Matrix.class, "imageMatrixProperty");
        this.f35297attabal = new Matrix();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f35297attabal.set(imageView.getImageMatrix());
        return this.f35297attabal;
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}

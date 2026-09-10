package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import earstone.sealless;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final boolean f13853attabal;

    /* JADX INFO: compiled from: TransitionUtils.java */
    public static class attabal {
        public static Bitmap attabal(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* JADX INFO: compiled from: TransitionUtils.java */
    public static class saneness implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final float[] f13854attabal = new float[9];

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final float[] f13856saneness = new float[9];

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Matrix f13855dern = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f13854attabal);
            matrix2.getValues(this.f13856saneness);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f13856saneness;
                float f2 = fArr[i];
                float f3 = this.f13854attabal[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f13855dern.setValues(this.f13856saneness);
            return this.f13855dern;
        }
    }

    static {
        f13853attabal = Build.VERSION.SDK_INT >= 28;
    }

    public static View attabal(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        sealless.impromptu(view, matrix);
        sealless.taiyuan(viewGroup, matrix);
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapSaneness = saneness(view, matrix, rectF, viewGroup);
        if (bitmapSaneness != null) {
            imageView.setImageBitmap(bitmapSaneness);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    public static Animator dern(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    public static Bitmap saneness(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        int iIndexOfChild;
        ViewGroup viewGroup2;
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        boolean z = viewGroup != null && viewGroup.isAttachedToWindow();
        Bitmap bitmapCreateBitmap = null;
        if (zIsAttachedToWindow) {
            iIndexOfChild = 0;
            viewGroup2 = null;
        } else {
            if (!z) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f13853attabal) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = attabal.attabal(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }
}

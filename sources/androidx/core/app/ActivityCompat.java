package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat extends ContextCompat {

    /* JADX INFO: renamed from: androidx.core.app.ActivityCompat$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class Api21Impl {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    public static class Api22Impl {
        public static Uri a(Activity activity) {
            return activity.getReferrer();
        }
    }

    public static class Api23Impl {
        public static void a(Object obj) {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i2) {
            activity.requestPermissions(strArr, i2);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class Api28Impl {
        public static <T> T a(Activity activity, int i2) {
            return (T) activity.requireViewById(i2);
        }
    }

    public static class Api30Impl {
        public static Display a(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        public static void b(Activity activity, LocusIdCompat locusIdCompat, Bundle bundle) {
            activity.setLocusContext(locusIdCompat == null ? null : locusIdCompat.f4255b, bundle);
        }
    }

    public static class Api31Impl {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    public static class Api32Impl {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface OnRequestPermissionsResultCallback {
    }

    public interface PermissionCompatDelegate {
    }

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i2);
    }

    public static class SharedElementCallback21Impl extends android.app.SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharedElementCallback f4164a;

        public SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.f4164a = sharedElementCallback;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Parcelable parcelable;
            Bitmap bitmap;
            SharedElementCallback sharedElementCallback = this.f4164a;
            sharedElementCallback.getClass();
            float f = 1048576.0f;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable == null || background != null) {
                    f = 1048576.0f;
                    parcelable = null;
                } else {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        parcelable = null;
                        bitmap = null;
                    } else {
                        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                            parcelable = null;
                        } else {
                            int i2 = (int) (intrinsicWidth * fMin);
                            int i3 = (int) (intrinsicHeight * fMin);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Rect bounds = drawable.getBounds();
                            int i4 = bounds.left;
                            int i5 = bounds.top;
                            parcelable = null;
                            int i6 = bounds.right;
                            int i7 = bounds.bottom;
                            drawable.setBounds(0, 0, i2, i3);
                            drawable.draw(canvas);
                            drawable.setBounds(i4, i5, i6, i7);
                            bitmap = bitmapCreateBitmap;
                        }
                    }
                    if (bitmap != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return bundle;
                    }
                }
            } else {
                f = 1048576.0f;
                parcelable = null;
            }
            int iRound = Math.round(rectF.width());
            int iRound2 = Math.round(rectF.height());
            if (iRound <= 0 || iRound2 <= 0) {
                return parcelable;
            }
            float fMin2 = Math.min(1.0f, f / (iRound * iRound2));
            int i8 = (int) (iRound * fMin2);
            int i9 = (int) (iRound2 * fMin2);
            if (sharedElementCallback.f4250a == null) {
                sharedElementCallback.f4250a = new Matrix();
            }
            sharedElementCallback.f4250a.set(matrix);
            sharedElementCallback.f4250a.postTranslate(-rectF.left, -rectF.top);
            sharedElementCallback.f4250a.postScale(fMin2, fMin2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.concat(sharedElementCallback.f4250a);
            view.draw(canvas2);
            return bitmapCreateBitmap2;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.f4164a.getClass();
            if (!(parcelable instanceof Bundle)) {
                if (!(parcelable instanceof Bitmap)) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap((Bitmap) parcelable);
                return imageView;
            }
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmap);
            imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView2.setImageMatrix(matrix);
            }
            return imageView2;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List list, Map map) {
            this.f4164a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List list) {
            this.f4164a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List list, List list2, List list3) {
            this.f4164a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List list, List list2, List list3) {
            this.f4164a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List list, List list2, android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f4164a.getClass();
            Api23Impl.a(onSharedElementsReadyListener);
        }
    }

    public static void a(FragmentActivity fragmentActivity) {
        Api21Impl.a(fragmentActivity);
    }

    public static void b(FragmentActivity fragmentActivity) {
        Api21Impl.b(fragmentActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                throw new IllegalArgumentException(android.support.v4.media.a.r(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        if (activity instanceof RequestPermissionsRequestCodeValidator) {
            ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i2);
        }
        Api23Impl.b(activity, strArr, i2);
    }

    public static void d(FragmentActivity fragmentActivity, SharedElementCallback sharedElementCallback) {
        Api21Impl.c(fragmentActivity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static void e(FragmentActivity fragmentActivity, SharedElementCallback sharedElementCallback) {
        Api21Impl.d(fragmentActivity, sharedElementCallback != null ? new SharedElementCallback21Impl(sharedElementCallback) : null);
    }

    public static boolean f(Activity activity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 >= 32) {
            return Api32Impl.a(activity, str);
        }
        return i2 == 31 ? Api31Impl.b(activity, str) : Api23Impl.c(activity, str);
    }

    public static void g(FragmentActivity fragmentActivity) {
        Api21Impl.e(fragmentActivity);
    }
}

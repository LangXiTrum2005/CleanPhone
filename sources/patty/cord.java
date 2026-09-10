package patty;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: TransformationUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cord {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Paint f35110dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Lock f35111marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Set<String> f35113wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Paint f35109attabal = new Paint(6);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Paint f35112saneness = new Paint(7);

    /* JADX INFO: compiled from: TransformationUtils.java */
    public class attabal implements saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ int f35114attabal;

        public attabal(int i) {
            this.f35114attabal = i;
        }

        @Override // patty.cord.saneness
        public void attabal(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f35114attabal;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    public static final class dern implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    /* JADX INFO: compiled from: TransformationUtils.java */
    public interface saneness {
        void attabal(Canvas canvas, Paint paint, RectF rectF);
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f35113wireman = hashSet;
        f35111marial = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new dern();
        Paint paint = new Paint(7);
        f35110dern = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Bitmap apical(trawler.wireman wiremanVar, Bitmap bitmap, int i) {
        com.bumptech.glide.util.apical.attabal(i > 0, "roundingRadius must be greater than 0.");
        return formularize(wiremanVar, bitmap, new attabal(i));
    }

    public static void attabal(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f35111marial.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f35109attabal);
            saneness(canvas);
        } finally {
            f35111marial.unlock();
        }
    }

    public static int beachfront(int i) {
        switch (i) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap.Config competently(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static Bitmap cutely(trawler.wireman wiremanVar, Bitmap bitmap, int i) {
        if (!taiyuan(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        impromptu(i, matrix);
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapWireman = wiremanVar.wireman(Math.round(rectF.width()), Math.round(rectF.height()), competently(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapWireman.setHasAlpha(bitmap.hasAlpha());
        attabal(bitmap, bitmapWireman, matrix);
        return bitmapWireman;
    }

    public static Bitmap dern(trawler.wireman wiremanVar, Bitmap bitmap) {
        Bitmap.Config configWireman = wireman(bitmap);
        if (configWireman.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapWireman = wiremanVar.wireman(bitmap.getWidth(), bitmap.getHeight(), configWireman);
        new Canvas(bitmapWireman).drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
        return bitmapWireman;
    }

    public static Bitmap formularize(trawler.wireman wiremanVar, Bitmap bitmap, saneness sanenessVar) {
        Bitmap.Config configWireman = wireman(bitmap);
        Bitmap bitmapDern = dern(wiremanVar, bitmap);
        Bitmap bitmapWireman = wiremanVar.wireman(bitmapDern.getWidth(), bitmapDern.getHeight(), configWireman);
        bitmapWireman.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapDern, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmapWireman.getWidth(), bitmapWireman.getHeight());
        Lock lock = f35111marial;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapWireman);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            sanenessVar.attabal(canvas, paint, rectF);
            saneness(canvas);
            lock.unlock();
            if (!bitmapDern.equals(bitmap)) {
                wiremanVar.dern(bitmapDern);
            }
            return bitmapWireman;
        } catch (Throwable th) {
            f35111marial.unlock();
            throw th;
        }
    }

    public static void impromptu(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static Lock marial() {
        return f35111marial;
    }

    public static void saneness(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static boolean taiyuan(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap.Config wireman(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }
}

package androidx.transition;

import android.graphics.Canvas;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class CanvasUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f8396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f8397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f8398c;

    public static class Api29Impl {
        public static void a(Canvas canvas) {
            canvas.disableZ();
        }

        public static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }
}

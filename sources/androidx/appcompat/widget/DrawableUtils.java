package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class DrawableUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3600a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3601b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f3602c = new Rect();

    public static class Api18Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f3603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f3604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f3605c;
        public static final Field d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Field f3606e;
        public static final Field f;

        /* JADX WARN: Code duplicated, block: B:25:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z2;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField(TtmlNode.LEFT);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(TtmlNode.RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z2 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z2 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z2 = false;
                        if (z2) {
                            f3604b = method;
                            f3605c = field;
                            d = field2;
                            f3606e = field3;
                            f = field4;
                            f3603a = true;
                            return;
                        }
                        f3604b = null;
                        f3605c = null;
                        d = null;
                        f3606e = null;
                        f = null;
                        f3603a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z2 = false;
                        if (z2) {
                            f3604b = method;
                            f3605c = field;
                            d = field2;
                            f3606e = field3;
                            f = field4;
                            f3603a = true;
                            return;
                        }
                        f3604b = null;
                        f3605c = null;
                        d = null;
                        f3606e = null;
                        f = null;
                        f3603a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z2 = false;
                        if (z2) {
                            f3604b = method;
                            f3605c = field;
                            d = field2;
                            f3606e = field3;
                            f = field4;
                            f3603a = true;
                            return;
                        }
                        f3604b = null;
                        f3605c = null;
                        d = null;
                        f3606e = null;
                        f = null;
                        f3603a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                        f3604b = method;
                        f3605c = field;
                        d = field2;
                        f3606e = field3;
                        f = field4;
                        f3603a = true;
                        return;
                    }
                    f3604b = null;
                    f3605c = null;
                    d = null;
                    f3606e = null;
                    f = null;
                    f3603a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                        f3604b = method;
                        f3605c = field;
                        d = field2;
                        f3606e = field3;
                        f = field4;
                        f3603a = true;
                        return;
                    }
                    f3604b = null;
                    f3605c = null;
                    d = null;
                    f3606e = null;
                    f = null;
                    f3603a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                        f3604b = method;
                        f3605c = field;
                        d = field2;
                        f3606e = field3;
                        f = field4;
                        f3603a = true;
                        return;
                    }
                    f3604b = null;
                    f3605c = null;
                    d = null;
                    f3606e = null;
                    f = null;
                    f3603a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z2) {
                f3604b = method;
                f3605c = field;
                d = field2;
                f3606e = field3;
                f = field4;
                f3603a = true;
                return;
            }
            f3604b = null;
            f3605c = null;
            d = null;
            f3606e = null;
            f = null;
            f3603a = false;
        }
    }

    public static class Api29Impl {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3600a);
        } else {
            drawable.setState(f3601b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Object objA;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Insets insetsA = Api29Impl.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (drawable instanceof WrappedDrawable) {
            objA = drawable;
            objA = ((WrappedDrawable) drawable).a();
        }
        if (i2 >= 29) {
            boolean z2 = Api18Impl.f3603a;
        } else if (Api18Impl.f3603a) {
            try {
                Object objInvoke = Api18Impl.f3604b.invoke(objA, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(Api18Impl.f3605c.getInt(objInvoke), Api18Impl.d.getInt(objInvoke), Api18Impl.f3606e.getInt(objInvoke), Api18Impl.f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f3602c;
    }

    public static PorterDuff.Mode c(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

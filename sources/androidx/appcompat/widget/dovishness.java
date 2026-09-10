package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: DrawableUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f5438attabal = {R.attr.state_checked};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f5440saneness = new int[0];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Rect f5439dern = new Rect();

    /* JADX INFO: compiled from: DrawableUtils.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final boolean f5441attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final Field f5442beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final Field f5443dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final Field f5444marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final Method f5445saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final Field f5446wireman;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField(TtmlNode.LEFT);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(TtmlNode.RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f5445saneness = method;
                            f5443dern = field;
                            f5446wireman = field2;
                            f5444marial = field3;
                            f5442beachfront = field4;
                            f5441attabal = true;
                            return;
                        }
                        f5445saneness = null;
                        f5443dern = null;
                        f5446wireman = null;
                        f5444marial = null;
                        f5442beachfront = null;
                        f5441attabal = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f5445saneness = method;
                            f5443dern = field;
                            f5446wireman = field2;
                            f5444marial = field3;
                            f5442beachfront = field4;
                            f5441attabal = true;
                            return;
                        }
                        f5445saneness = null;
                        f5443dern = null;
                        f5446wireman = null;
                        f5444marial = null;
                        f5442beachfront = null;
                        f5441attabal = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f5445saneness = method;
                            f5443dern = field;
                            f5446wireman = field2;
                            f5444marial = field3;
                            f5442beachfront = field4;
                            f5441attabal = true;
                            return;
                        }
                        f5445saneness = null;
                        f5443dern = null;
                        f5446wireman = null;
                        f5444marial = null;
                        f5442beachfront = null;
                        f5441attabal = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f5445saneness = method;
                        f5443dern = field;
                        f5446wireman = field2;
                        f5444marial = field3;
                        f5442beachfront = field4;
                        f5441attabal = true;
                        return;
                    }
                    f5445saneness = null;
                    f5443dern = null;
                    f5446wireman = null;
                    f5444marial = null;
                    f5442beachfront = null;
                    f5441attabal = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f5445saneness = method;
                        f5443dern = field;
                        f5446wireman = field2;
                        f5444marial = field3;
                        f5442beachfront = field4;
                        f5441attabal = true;
                        return;
                    }
                    f5445saneness = null;
                    f5443dern = null;
                    f5446wireman = null;
                    f5444marial = null;
                    f5442beachfront = null;
                    f5441attabal = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f5445saneness = method;
                        f5443dern = field;
                        f5446wireman = field2;
                        f5444marial = field3;
                        f5442beachfront = field4;
                        f5441attabal = true;
                        return;
                    }
                    f5445saneness = null;
                    f5443dern = null;
                    f5446wireman = null;
                    f5444marial = null;
                    f5442beachfront = null;
                    f5441attabal = false;
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
            if (z) {
                f5445saneness = method;
                f5443dern = field;
                f5446wireman = field2;
                f5444marial = field3;
                f5442beachfront = field4;
                f5441attabal = true;
                return;
            }
            f5445saneness = null;
            f5443dern = null;
            f5446wireman = null;
            f5444marial = null;
            f5442beachfront = null;
            f5441attabal = false;
        }

        public static Rect attabal(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f5441attabal) {
                try {
                    Object objInvoke = f5445saneness.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f5443dern.getInt(objInvoke), f5446wireman.getInt(objInvoke), f5444marial.getInt(objInvoke), f5442beachfront.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return dovishness.f5439dern;
        }
    }

    /* JADX INFO: compiled from: DrawableUtils.java */
    public static class saneness {
        public static Insets attabal(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    public static boolean attabal(Drawable drawable) {
        return true;
    }

    public static void dern(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f5438attabal);
        } else {
            drawable.setState(f5440saneness);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode marial(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
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

    public static void saneness(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        dern(drawable);
    }

    public static Rect wireman(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return attabal.attabal(DrawableCompat.unwrap(drawable));
        }
        Insets insetsAttabal = saneness.attabal(drawable);
        return new Rect(insetsAttabal.left, insetsAttabal.top, insetsAttabal.right, insetsAttabal.bottom);
    }
}

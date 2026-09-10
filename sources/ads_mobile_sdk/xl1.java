package ads_mobile_sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.saran;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.common.base.triweekly;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.imari;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class xl1 {
    public final Context a;
    public final jk0 b;
    public final loun c;

    public xl1(Context context, jk0 flags, loun traceLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = context;
        this.b = flags;
        this.c = traceLogger;
    }

    public final JsonObject a(String str, Point startingPoint, Point currentPoint) {
        Intrinsics.checkNotNullParameter(startingPoint, "startingPoint");
        Intrinsics.checkNotNullParameter(currentPoint, "currentPoint");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("x", Integer.valueOf(imari.marial(this.a, currentPoint.x)));
        jsonObject.addProperty("y", Integer.valueOf(imari.marial(this.a, currentPoint.y)));
        jsonObject.addProperty("start_x", Integer.valueOf(imari.marial(this.a, startingPoint.x)));
        jsonObject.addProperty("start_y", Integer.valueOf(imari.marial(this.a, startingPoint.y)));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("click_point", jsonObject);
        jsonObject2.addProperty("asset_id", str);
        return jsonObject2;
    }

    public final JsonObject b(FrameLayout frameLayout) {
        vl1 vl1Var;
        if (frameLayout == null) {
            return new JsonObject();
        }
        ViewParent parent = frameLayout.getParent();
        loop0: while (true) {
            if (parent == null) {
                vl1Var = vl1.SCROLL_VIEW_TYPE_NONE;
                break;
            }
            if (parent instanceof ScrollView) {
                vl1Var = vl1.SCROLL_VIEW_TYPE_SCROLL_VIEW;
                break;
            }
            if (parent instanceof AbsListView) {
                vl1Var = vl1.SCROLL_VIEW_TYPE_ABS_LIST_VIEW;
                break;
            }
            if (parent instanceof HorizontalScrollView) {
                vl1Var = vl1.SCROLL_VIEW_TYPE_HORIZONTAL_SCROLL_VIEW;
                break;
            }
            if (parent instanceof saran) {
                vl1Var = vl1.SCROLL_VIEW_TYPE_SCROLLING_VIEW;
                break;
            }
            jk0 jk0Var = this.b;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:native:enable_scroll_view_type_by_keyword", X3.i.W);
            if (((Boolean) jk0Var.a("gads:native:enable_scroll_view_type_by_keyword", Boolean.FALSE, zk.b)).booleanValue()) {
                jk0 jk0Var2 = this.b;
                jk0Var2.getClass();
                List defaultValue = adultoid.kowloon("recycler", "viewflipper");
                Intrinsics.checkNotNullParameter("gads:native:scrollable_container_keywords", X3.i.W);
                Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                for (String str : (List) jk0Var2.a("gads:native:scrollable_container_keywords", defaultValue, zk.g)) {
                    String name = parent.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String lowerCase = name.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (StringsKt.overspeculate(lowerCase, str, false, 2, null)) {
                        vl1Var = vl1.SCROLL_VIEW_TYPE_BY_KEYWORD;
                        break loop0;
                    }
                }
            }
            parent = parent.getParent();
        }
        JsonObject jsonObject = new JsonObject();
        jk0 jk0Var3 = this.b;
        jk0Var3.getClass();
        Intrinsics.checkNotNullParameter("gads:native:enable_contained_in_scroll_view_signal", X3.i.W);
        Boolean bool = Boolean.TRUE;
        jk jkVar = zk.b;
        if (((Boolean) jk0Var3.a("gads:native:enable_contained_in_scroll_view_signal", bool, jkVar)).booleanValue()) {
            jsonObject.addProperty("contained_in_scroll_view", Boolean.valueOf(vl1Var != vl1.SCROLL_VIEW_TYPE_NONE));
        }
        jk0 jk0Var4 = this.b;
        jk0Var4.getClass();
        Intrinsics.checkNotNullParameter("gads:native:enable_scroll_view_type_signal", X3.i.W);
        if (((Boolean) jk0Var4.a("gads:native:enable_scroll_view_type_signal", bool, jkVar)).booleanValue()) {
            jsonObject.addProperty("scroll_view_type", Integer.valueOf(vl1Var.a));
        }
        return jsonObject;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0178  */
    public final JsonObject c(FrameLayout frameLayout) {
        JsonObject jsonObjectA;
        String string;
        ViewGroup.LayoutParams layoutParams;
        JsonObject jsonObject = new JsonObject();
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            int[] iArr2 = {frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight()};
            ViewParent parent = frameLayout.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr2[0] = p002kotlin.ranges.wireman.competently(viewGroup.getMeasuredWidth(), iArr2[0]);
                iArr2[1] = p002kotlin.ranges.wireman.competently(viewGroup.getMeasuredHeight(), iArr2[1]);
                parent = viewGroup.getParent();
            }
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("width", Integer.valueOf(imari.marial(this.a, frameLayout.getMeasuredWidth())));
            jsonObject2.addProperty("height", Integer.valueOf(imari.marial(this.a, frameLayout.getMeasuredHeight())));
            jsonObject2.addProperty("x", Integer.valueOf(imari.marial(this.a, iArr[0])));
            jsonObject2.addProperty("y", Integer.valueOf(imari.marial(this.a, iArr[1])));
            jsonObject2.addProperty("maximum_visible_width", Integer.valueOf(imari.marial(this.a, iArr2[0])));
            jsonObject2.addProperty("maximum_visible_height", Integer.valueOf(imari.marial(this.a, iArr2[1])));
            jsonObject2.addProperty("relative_to", "window");
            jsonObject.add("frame", jsonObject2);
            Rect rect = new Rect();
            if (frameLayout.getGlobalVisibleRect(rect)) {
                jsonObjectA = a(this.a, rect);
            } else {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("width", (Number) 0);
                jsonObject3.addProperty("height", (Number) 0);
                jsonObject3.addProperty("x", Integer.valueOf(imari.marial(this.a, iArr[0])));
                jsonObject3.addProperty("y", Integer.valueOf(imari.marial(this.a, iArr[1])));
                jsonObject3.addProperty("relative_to", "window");
                jsonObjectA = jsonObject3;
            }
            jsonObject.add("visible_bounds", jsonObjectA);
            ViewParent parent2 = frameLayout.getParent();
            if (parent2 != null) {
                try {
                    Method method = parent2.getClass().getMethod("getTemplateTypeName", null);
                    Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
                    Object objInvoke = method.invoke(parent2, null);
                    if (objInvoke == null || (string = objInvoke.toString()) == null) {
                        string = "";
                    }
                } catch (IllegalAccessException e) {
                    triweekly triweeklyVar = kn0.a;
                    kn0.b("Cannot access method getTemplateTypeName: " + e, null);
                } catch (NoSuchMethodException unused) {
                } catch (SecurityException e2) {
                    triweekly triweeklyVar2 = kn0.a;
                    kn0.b("Cannot access method getTemplateTypeName: " + e2, null);
                } catch (InvocationTargetException e3) {
                    triweekly triweeklyVar3 = kn0.a;
                    kn0.b("Cannot access method getTemplateTypeName: " + e3, null);
                }
            } else {
                string = "";
            }
            if (Intrinsics.wireman(string, "small_template")) {
                ul1[] ul1VarArr = ul1.a;
                jsonObject.addProperty("native_template_type", (Number) 1);
            } else if (Intrinsics.wireman(string, "medium_template")) {
                ul1[] ul1VarArr2 = ul1.a;
                jsonObject.addProperty("native_template_type", (Number) 2);
            } else {
                ul1[] ul1VarArr3 = ul1.a;
                jsonObject.addProperty("native_template_type", (Number) 0);
            }
            if (this.b.P() && (layoutParams = frameLayout.getLayoutParams()) != null) {
                jsonObject.addProperty("view_width_layout_type", Integer.valueOf(a(layoutParams.width).ordinal()));
                jsonObject.addProperty("view_height_layout_type", Integer.valueOf(a(layoutParams.height).ordinal()));
            }
            if (this.b.O()) {
                jsonObject.addProperty("alpha", Float.valueOf(frameLayout.getAlpha()));
            }
        }
        return jsonObject;
    }

    public static wl1 a(int i) {
        if (i == -2) {
            return wl1.WRAP_CONTENT;
        }
        if (i != -1) {
            return wl1.STATIC_SIZE;
        }
        return wl1.MATCH_PARENT;
    }

    public final JsonObject a(FrameLayout frameLayout, ImageView.ScaleType mediaViewScaleType, Map assetViews) {
        ViewGroup.LayoutParams layoutParams;
        char c = 0;
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        if (frameLayout == null) {
            return new JsonObject();
        }
        JsonObject jsonObject = new JsonObject();
        int i = 2;
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        Iterator it = assetViews.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null) {
                int[] iArr2 = new int[i];
                view.getLocationOnScreen(iArr2);
                JsonObject jsonObject2 = new JsonObject();
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("width", Integer.valueOf(imari.marial(this.a, view.getMeasuredWidth())));
                jsonObject3.addProperty("height", Integer.valueOf(imari.marial(this.a, view.getMeasuredHeight())));
                char c2 = c;
                jsonObject3.addProperty("x", Integer.valueOf(imari.marial(this.a, iArr2[c] - iArr[c])));
                jsonObject3.addProperty("y", Integer.valueOf(imari.marial(this.a, iArr2[1] - iArr[1])));
                Iterator it2 = it;
                jsonObject3.addProperty("relative_to", "ad_view");
                jsonObject2.add("frame", jsonObject3);
                JsonObject jsonObject4 = new JsonObject();
                Rect rect = new Rect();
                if (view.getLocalVisibleRect(rect)) {
                    jsonObject4 = a(this.a, rect);
                } else {
                    jsonObject4.addProperty("width", (Number) 0);
                    jsonObject4.addProperty("height", (Number) 0);
                    jsonObject4.addProperty("x", Integer.valueOf(imari.marial(this.a, iArr2[c2] - iArr[c2])));
                    jsonObject4.addProperty("y", Integer.valueOf(imari.marial(this.a, iArr2[1] - iArr[1])));
                    jsonObject4.addProperty("relative_to", "ad_view");
                }
                jsonObject2.add("visible_bounds", jsonObject4);
                if (Intrinsics.wireman(str, "3010")) {
                    jsonObject2.addProperty("mediaview_graphics_matrix", view.getMatrix().toShortString());
                    if (this.b.P() && (layoutParams = view.getLayoutParams()) != null) {
                        Intrinsics.beachfront(layoutParams);
                        jsonObject2.addProperty("view_width_layout_type", Integer.valueOf(a(layoutParams.width).ordinal()));
                        jsonObject2.addProperty("view_height_layout_type", Integer.valueOf(a(layoutParams.height).ordinal()));
                    }
                    jk0 jk0Var = this.b;
                    jk0Var.getClass();
                    Intrinsics.checkNotNullParameter("gads:nas_collect_view_path:enabled", X3.i.W);
                    if (((Boolean) jk0Var.a("gads:nas_collect_view_path:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(view.getId()));
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                        }
                        jsonObject2.addProperty("view_path", CollectionsKt.preterite(arrayList, "/", null, null, 0, null, null, 62, null));
                    }
                    jsonObject2.addProperty("mediaview_scale_type", Integer.valueOf(mediaViewScaleType.ordinal()));
                }
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    jsonObject2.addProperty("text_color", Integer.valueOf(textView.getCurrentTextColor()));
                    jsonObject2.addProperty("font_size", Float.valueOf(textView.getTextSize()));
                    jsonObject2.addProperty("text", textView.getText().toString());
                }
                jsonObject2.addProperty("is_clickable", Boolean.valueOf(view.isClickable()));
                if (this.b.O()) {
                    jsonObject2.addProperty("alpha", Float.valueOf(view.getAlpha()));
                }
                jsonObject.add(str, jsonObject2);
                it = it2;
                c = c2;
                i = 2;
            }
        }
        return jsonObject;
    }

    public final NativeAd.NativeMediaAspectRatio b(String str) {
        if (str == null) {
            return NativeAd.NativeMediaAspectRatio.UNKNOWN;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull == null) {
            ((d13) this.c).a("Failed to parse media aspect ratio.", new NumberFormatException("Media aspect ratio (" + str + ") is not a number."));
            return NativeAd.NativeMediaAspectRatio.UNKNOWN;
        }
        int iIntValue = intOrNull.intValue();
        if (iIntValue == 1) {
            return NativeAd.NativeMediaAspectRatio.ANY;
        }
        if (iIntValue == 2) {
            return NativeAd.NativeMediaAspectRatio.LANDSCAPE;
        }
        if (iIntValue == 3) {
            return NativeAd.NativeMediaAspectRatio.PORTRAIT;
        }
        if (iIntValue != 4) {
            return NativeAd.NativeMediaAspectRatio.UNKNOWN;
        }
        return NativeAd.NativeMediaAspectRatio.SQUARE;
    }

    public final JsonObject a(FrameLayout frameLayout) {
        Window window;
        if (frameLayout != null) {
            JsonObject jsonObject = new JsonObject();
            Intrinsics.checkNotNullParameter(frameLayout, "<this>");
            View rootView = frameLayout.getRootView();
            Context context = rootView != null ? rootView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            WindowManager.LayoutParams attributes = (activity == null || (window = activity.getWindow()) == null) ? null : window.getAttributes();
            jsonObject.addProperty("can_show_on_lock_screen", Boolean.valueOf((attributes == null || (attributes.flags & Opcodes.ASM8) == 0) ? false : true));
            KeyguardManager keyguardManager = (KeyguardManager) this.a.getSystemService(KeyguardManager.class);
            jsonObject.addProperty("is_keyguard_locked", keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null);
            return jsonObject;
        }
        return new JsonObject();
    }

    public final AdChoicesPlacement a(String str) {
        if (str == null) {
            return AdChoicesPlacement.TOP_RIGHT;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull == null) {
            ((d13) this.c).a("Failed to parse ad choices position.", new NumberFormatException("Ad choices position (" + str + ") is not a number."));
            return AdChoicesPlacement.TOP_RIGHT;
        }
        int iIntValue = intOrNull.intValue();
        if (iIntValue == 0) {
            return AdChoicesPlacement.TOP_LEFT;
        }
        if (iIntValue == 2) {
            return AdChoicesPlacement.BOTTOM_RIGHT;
        }
        if (iIntValue != 3) {
            return AdChoicesPlacement.TOP_RIGHT;
        }
        return AdChoicesPlacement.BOTTOM_LEFT;
    }

    public final JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.widthPixels;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        jsonObject.addProperty("width", Integer.valueOf(pastie.dern.wireman(i / displayMetrics2.density)));
        Context context2 = this.a;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        DisplayMetrics displayMetrics3 = context2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        int i2 = displayMetrics3.heightPixels;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(context2, "<this>");
        DisplayMetrics displayMetrics4 = context2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "getDisplayMetrics(...)");
        jsonObject.addProperty("height", Integer.valueOf(pastie.dern.wireman(i2 / displayMetrics4.density)));
        return jsonObject;
    }

    public static JsonObject a(Context context, Rect rect) {
        JsonObject jsonObject = new JsonObject();
        int i = rect.right - rect.left;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        jsonObject.addProperty("width", Integer.valueOf(pastie.dern.wireman(i / displayMetrics.density)));
        int i2 = rect.bottom - rect.top;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        jsonObject.addProperty("height", Integer.valueOf(pastie.dern.wireman(i2 / displayMetrics2.density)));
        int i3 = rect.left;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        jsonObject.addProperty("x", Integer.valueOf(pastie.dern.wireman(i3 / displayMetrics3.density)));
        int i4 = rect.top;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "getDisplayMetrics(...)");
        jsonObject.addProperty("y", Integer.valueOf(pastie.dern.wireman(i4 / displayMetrics4.density)));
        jsonObject.addProperty("relative_to", "self");
        return jsonObject;
    }
}

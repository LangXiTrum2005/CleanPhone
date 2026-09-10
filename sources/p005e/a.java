package p005e;

import android.widget.LinearLayout;
import android.widget.Space;
import java.util.HashMap;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static String a(StringBuilder sb, int i2, String str, int i3, String str2) {
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    public static String b(ReflectionFactory reflectionFactory, Class cls, StringBuilder sb) {
        sb.append(reflectionFactory.b(cls));
        return sb.toString();
    }

    public static void c(int i2, int i3, float f, sg.bigo.ads.ad.interstitial.e.b.a aVar, Space space) {
        aVar.addView(space, new LinearLayout.LayoutParams(i2, i3, f));
    }

    public static void d(int i2, int i3, String str, String str2, String str3) {
        sg.bigo.ads.common.t.a.a(i2, i3, str3, str2.concat(String.valueOf(str)));
    }

    public static void e(int i2, HashMap map, String str, int i3, String str2) {
        map.put(str, Integer.valueOf(i2));
        map.put(str2, Integer.valueOf(i3));
    }

    public static void f(StringBuilder sb, int i2, String str, int i3, String str2) {
        sb.append(str);
        sg.bigo.ads.common.t.a.a(i2, i3, str2, sb.toString());
    }

    public static void g(ReflectionFactory reflectionFactory, Class cls, StringBuilder sb, String str, JsonElement jsonElement) {
        sb.append(reflectionFactory.b(cls).l());
        sb.append(str);
        sb.append(reflectionFactory.b(jsonElement.getClass()).l());
    }
}

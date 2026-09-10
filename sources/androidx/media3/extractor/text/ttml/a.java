package androidx.media3.extractor.text.ttml;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Pair;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobSupport;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(StringBuilder sb, MaxAdListener maxAdListener, o oVar, String str) {
        sb.append(maxAdListener);
        oVar.a(str, sb.toString());
    }

    public static void B(StringBuilder sb, String str, o oVar, String str2) {
        sb.append(str);
        oVar.a(str2, sb.toString());
    }

    public static void C(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static int a(int i2, int i3, int i4) {
        return (Integer.hashCode(i2) + i3) * i4;
    }

    public static int b(int i2, int i3, long j) {
        return (Long.hashCode(j) + i2) * i3;
    }

    public static int c(int i2, int i3, List list) {
        return (list.hashCode() + i2) * i3;
    }

    public static Bundle d(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static AlphaAnimation e(float f, float f2, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }

    public static RelativeLayout.LayoutParams f(int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i3);
        layoutParams.addRule(i4);
        return layoutParams;
    }

    public static ListenableFuture g(final Deferred deferred) {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) {
                final Deferred deferred2 = deferred;
                ((JobSupport) deferred2).s(new Function1<Throwable, Unit>() { // from class: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Throwable th = (Throwable) obj;
                        CallbackToFutureAdapter.Completer completer2 = completer;
                        if (th == null) {
                            completer2.a(deferred2.k());
                        } else if (th instanceof CancellationException) {
                            completer2.b();
                        } else {
                            completer2.c(th);
                        }
                        return Unit.f43263a;
                    }
                });
                return "Deferred.asListenableFuture";
            }
        });
    }

    public static Object h(int i2, List list) {
        return list.get(list.size() - i2);
    }

    public static String i(char c2, String str, String str2) {
        return str + str2 + c2;
    }

    public static String j(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String k(long j, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String l(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String m(String str) {
        String string = UUID.randomUUID().toString();
        Intrinsics.e(string, str);
        return string;
    }

    public static String n(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String o(StringBuilder sb, long j, char c2) {
        sb.append(j);
        sb.append(c2);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z2, char c2) {
        sb.append(z2);
        sb.append(c2);
        return sb.toString();
    }

    public static HashMap s(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static HashMap t(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }

    public static List u() {
        return Collections.synchronizedList(new ArrayList());
    }

    public static JSONArray v(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static void w(int i2, int i3, int i4, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i2, i3, i4)));
    }

    public static void x(MaxAdFormat maxAdFormat, StringBuilder sb, String str) {
        sb.append(maxAdFormat.getLabel());
        sb.append(str);
    }

    public static void y(String str, String str2, o oVar, String str3) {
        oVar.a(str3, str + str2);
    }

    public static void z(String str, String str2, ArrayList arrayList) {
        arrayList.add(new Pair(str, str2));
    }
}

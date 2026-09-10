package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import defpackage.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface WebViewBuilderBoundaryInterface {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f47590a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f47591b = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f47592c = new ArrayList();

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            LinkedHashMap linkedHashMap = this.f47591b;
            if (linkedHashMap.containsKey(str)) {
                throw new IllegalArgumentException(e.o("A duplicate JavaScript interface was provided for \"", str, "\""));
            }
            this.f47590a.add(obj);
            linkedHashMap.put(str, Boolean.TRUE);
            this.f47592c.add(list);
        }

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.f47590a, new ArrayList(this.f47591b.keySet()), this.f47592c});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int PROFILE_NAME = 3;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}

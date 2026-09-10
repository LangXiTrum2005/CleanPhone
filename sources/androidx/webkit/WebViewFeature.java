package androidx.webkit;

import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ConditionallySupportedFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class WebViewFeature {

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewStartupFeature {
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebViewSupportFeature {
    }

    public static boolean a(String str) {
        ApiFeature.N n2 = WebViewFeatureInternal.f8583a;
        Set<ConditionallySupportedFeature> setUnmodifiableSet = Collections.unmodifiableSet(ApiFeature.f8566c);
        HashSet hashSet = new HashSet();
        for (ConditionallySupportedFeature conditionallySupportedFeature : setUnmodifiableSet) {
            if (conditionallySupportedFeature.a().equals(str)) {
                hashSet.add(conditionallySupportedFeature);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ConditionallySupportedFeature) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}

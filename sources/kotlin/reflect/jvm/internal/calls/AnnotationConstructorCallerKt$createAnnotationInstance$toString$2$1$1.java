package kotlin.reflect.jvm.internal.calls;

import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.dc;
import com.smartdigimkt.b0.a;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", a.n0, "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 X = new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.f(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            Intrinsics.e(string, "toString(this)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            Intrinsics.e(string, "toString(this)");
        } else {
            string = value.toString();
        }
        return str + dc.T + string;
    }
}

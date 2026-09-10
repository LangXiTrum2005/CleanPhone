package com.google.common.base;

import com.p004ironsource.dc;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueHolder f19712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ValueHolder f19713c;

        public static final class UnconditionalValueHolder extends ValueHolder {
        }

        public static class ValueHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f19714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f19715b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ValueHolder f19716c;
        }

        public ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f19712b = valueHolder;
            this.f19713c = valueHolder;
            this.f19711a = str;
        }

        public final void a(long j, String str) {
            c(str, String.valueOf(j));
        }

        public final void b(Object obj, String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f19713c.f19716c = valueHolder;
            this.f19713c = valueHolder;
            valueHolder.f19715b = obj;
            valueHolder.f19714a = str;
        }

        public final void c(String str, String str2) {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.f19713c.f19716c = unconditionalValueHolder;
            this.f19713c = unconditionalValueHolder;
            unconditionalValueHolder.f19715b = str2;
            unconditionalValueHolder.f19714a = str;
        }

        public final void d(Object obj) {
            ValueHolder valueHolder = new ValueHolder();
            this.f19713c.f19716c = valueHolder;
            this.f19713c = valueHolder;
            valueHolder.f19715b = obj;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f19711a);
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            ValueHolder valueHolder = this.f19712b.f19716c;
            String str = "";
            while (valueHolder != null) {
                Object obj = valueHolder.f19715b;
                boolean z2 = valueHolder instanceof UnconditionalValueHolder;
                sb.append(str);
                String str2 = valueHolder.f19714a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append(dc.T);
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                valueHolder = valueHolder.f19716c;
                str = ", ";
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper b(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}

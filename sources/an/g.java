package an;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f3789a;

    public g(Pattern pattern) {
        this.f3789a = pattern;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f3789a;
        String strPattern = pattern.pattern();
        kotlin.jvm.internal.n.e(strPattern, "pattern(...)");
        return new f(strPattern, pattern.flags());
    }

    public final boolean a(String input) {
        kotlin.jvm.internal.n.f(input, "input");
        return this.f3789a.matcher(input).matches();
    }

    public final String b(String input, String str) {
        kotlin.jvm.internal.n.f(input, "input");
        String strReplaceAll = this.f3789a.matcher(input).replaceAll(str);
        kotlin.jvm.internal.n.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f3789a.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        return string;
    }

    public g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
        this.f3789a = patternCompile;
    }
}

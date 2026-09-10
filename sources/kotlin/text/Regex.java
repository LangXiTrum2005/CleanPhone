package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Serialized", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Regex implements Serializable {
    public final Pattern X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f44713Y;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public Serialized(String str, int i2) {
            this.X = str;
            this.f44713Y = i2;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.X, this.f44713Y);
            Intrinsics.e(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    public Regex(Pattern pattern) {
        this.X = pattern;
    }

    private final Object writeReplace() {
        Pattern pattern = this.X;
        String strPattern = pattern.pattern();
        Intrinsics.e(strPattern, "pattern(...)");
        return new Serialized(strPattern, pattern.flags());
    }

    public final MatchResult a(CharSequence input) {
        Intrinsics.f(input, "input");
        Matcher matcher = this.X.matcher(input);
        Intrinsics.e(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, input);
        }
        return null;
    }

    public final boolean b(CharSequence input) {
        Intrinsics.f(input, "input");
        return this.X.matcher(input).matches();
    }

    public final String c(String replacement, CharSequence input) {
        Intrinsics.f(input, "input");
        Intrinsics.f(replacement, "replacement");
        String strReplaceAll = this.X.matcher(input).replaceAll(replacement);
        Intrinsics.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String d(String input, Function1 function1) {
        Intrinsics.f(input, "input");
        Matcher matcher = this.X.matcher(input);
        Intrinsics.e(matcher, "matcher(...)");
        int i2 = 0;
        MatchResult matcherMatchResult = !matcher.find(0) ? null : new MatcherMatchResult(matcher, input);
        if (matcherMatchResult == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            MatcherMatchResult matcherMatchResult2 = (MatcherMatchResult) matcherMatchResult;
            sb.append((CharSequence) input, i2, matcherMatchResult2.c().X);
            sb.append((CharSequence) function1.invoke(matcherMatchResult));
            i2 = matcherMatchResult2.c().f43343Y + 1;
            matcherMatchResult = matcherMatchResult2.next();
            if (i2 >= length) {
                break;
            }
        } while (matcherMatchResult != null);
        if (i2 < length) {
            sb.append((CharSequence) input, i2, length);
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final String e(String replacement, CharSequence input) {
        Intrinsics.f(input, "input");
        Intrinsics.f(replacement, "replacement");
        String strReplaceFirst = this.X.matcher(input).replaceFirst(replacement);
        Intrinsics.e(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List f(CharSequence input, int i2) {
        Intrinsics.f(input, "input");
        StringsKt__StringsKt.g(i2);
        Matcher matcher = this.X.matcher(input);
        if (i2 == 1 || !matcher.find()) {
            return CollectionsKt.H(input.toString());
        }
        int i3 = 10;
        if (i2 > 0 && i2 <= 10) {
            i3 = i2;
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = i2 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i4 >= 0 && arrayList.size() == i4) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.X.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public Regex(String pattern) {
        Intrinsics.f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.e(patternCompile, "compile(...)");
        this.X = patternCompile;
    }

    public Regex(String str, int i2) {
        RegexOption[] regexOptionArr = RegexOption.f44714Y;
        Pattern patternCompile = Pattern.compile(str, 66);
        Intrinsics.e(patternCompile, "compile(...)");
        this.X = patternCompile;
    }
}

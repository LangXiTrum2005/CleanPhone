package com.google.common.base;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {

    /* JADX INFO: renamed from: com.google.common.base.CharMatcher$1, reason: invalid class name */
    class AnonymousClass1 extends NegatedFastMatcher {
        @Override // com.google.common.base.CharMatcher.Negated
        public final String toString() {
            return null;
        }
    }

    public static final class And extends CharMatcher {
        public final CharMatcher X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final CharMatcher f19693Y;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            charMatcher.getClass();
            this.X = charMatcher;
            charMatcher2.getClass();
            this.f19693Y = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return this.X.m(c2) && this.f19693Y.m(c2);
        }

        public final String toString() {
            return "CharMatcher.and(" + this.X + ", " + this.f19693Y + ")";
        }
    }

    public static final class Any extends NamedFastMatcher {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CharMatcher f19694Y = new Any("CharMatcher.any()");

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(String str) {
            return str.length();
        }

        @Override // com.google.common.base.CharMatcher
        public final int h(CharSequence charSequence, int i2) {
            int length = charSequence.length();
            Preconditions.k(i2, length);
            if (i2 == length) {
                return -1;
            }
            return i2;
        }

        @Override // com.google.common.base.CharMatcher
        public final int i(String str) {
            return str.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(String str) {
            str.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(String str) {
            return str.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return None.f19699Y;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }
    }

    public static final class AnyOf extends CharMatcher {
        public final char[] X;

        public AnyOf(String str) {
            char[] charArray = str.toString().toCharArray();
            this.X = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return Arrays.binarySearch(this.X, c2) >= 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c2 : this.X) {
                sb.append(CharMatcher.a(c2));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    public static final class Ascii extends NamedFastMatcher {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CharMatcher f19695Y = new Ascii("CharMatcher.ascii()");

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return c2 <= 127;
        }
    }

    public static final class BitSetMatcher extends NamedFastMatcher {
        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            throw null;
        }
    }

    public static final class BreakingWhitespace extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            if (c2 != ' ' && c2 != 133 && c2 != 5760) {
                if (c2 != 8199) {
                    if (c2 != 8287 && c2 != 12288 && c2 != 8232 && c2 != 8233) {
                        switch (c2) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c2 >= 8192 && c2 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class Digit extends RangesMatcher {
        static {
            char[] charArray = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
            char[] cArr = new char[37];
            for (int i2 = 0; i2 < 37; i2++) {
                cArr[i2] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i2) + '\t');
            }
            new Digit("CharMatcher.digit()", charArray, cArr);
        }
    }

    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher p() {
            return new NegatedFastMatcher(this);
        }
    }

    public static final class ForPredicate extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            ((Character) obj).getClass();
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        /* JADX INFO: renamed from: d */
        public final boolean apply(Character ch) {
            ch.getClass();
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            throw null;
        }

        public final String toString() {
            return "CharMatcher.forPredicate(null)";
        }
    }

    public static final class InRange extends FastMatcher {
        public final char X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final char f19696Y;

        public InRange(char c2, char c3) {
            Preconditions.f(c3 >= c2);
            this.X = c2;
            this.f19696Y = c3;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return this.X <= c2 && c2 <= this.f19696Y;
        }

        public final String toString() {
            return "CharMatcher.inRange('" + CharMatcher.a(this.X) + "', '" + CharMatcher.a(this.f19696Y) + "')";
        }
    }

    public static final class Invisible extends RangesMatcher {
        static {
            new Invisible("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    public static final class Is extends FastMatcher {
        public final char X;

        public Is(char c2) {
            this.X = c2;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.m(this.X) ? this : None.f19699Y;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return c2 == this.X;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return new IsNot(this.X);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            return charMatcher.m(this.X) ? charMatcher : new Or(this, charMatcher);
        }

        public final String toString() {
            return "CharMatcher.is('" + CharMatcher.a(this.X) + "')";
        }
    }

    public static final class IsEither extends FastMatcher {
        public final char X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final char f19697Y;

        public IsEither(char c2, char c3) {
            this.X = c2;
            this.f19697Y = c3;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return c2 == this.X || c2 == this.f19697Y;
        }

        public final String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.a(this.X) + CharMatcher.a(this.f19697Y) + "\")";
        }
    }

    public static final class IsNot extends FastMatcher {
        public final char X;

        public IsNot(char c2) {
            this.X = c2;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.m(this.X) ? new And(this, charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return c2 != this.X;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return new Is(this.X);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            return charMatcher.m(this.X) ? Any.f19694Y : this;
        }

        public final String toString() {
            return "CharMatcher.isNot('" + CharMatcher.a(this.X) + "')";
        }
    }

    public static final class JavaDigit extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return Character.isDigit(c2);
        }

        public final String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class JavaIsoControl extends NamedFastMatcher {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CharMatcher f19698Y = new JavaIsoControl("CharMatcher.javaIsoControl()");

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            if (c2 > 31) {
                return c2 >= 127 && c2 <= 159;
            }
            return true;
        }
    }

    public static final class JavaLetter extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return Character.isLetter(c2);
        }

        public final String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class JavaLetterOrDigit extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return Character.isLetterOrDigit(c2);
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class JavaLowerCase extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return Character.isLowerCase(c2);
        }

        public final String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class JavaUpperCase extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return Character.isUpperCase(c2);
        }

        public final String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class NamedFastMatcher extends FastMatcher {
        public final String X;

        public NamedFastMatcher(String str) {
            this.X = str;
        }

        public final String toString() {
            return this.X;
        }
    }

    public static class Negated extends CharMatcher {
        public final CharMatcher X;

        public Negated(CharMatcher charMatcher) {
            this.X = charMatcher;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(String str) {
            return str.length() - this.X.f(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return !this.X.m(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(String str) {
            return this.X.o(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(String str) {
            return this.X.n(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return this.X;
        }

        public String toString() {
            return this.X + ".negate()";
        }
    }

    public static class NegatedFastMatcher extends Negated {
    }

    public static final class None extends NamedFastMatcher {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final CharMatcher f19699Y = new None("CharMatcher.none()");

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(String str) {
            str.getClass();
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final int h(CharSequence charSequence, int i2) {
            Preconditions.k(i2, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final int i(String str) {
            str.getClass();
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(String str) {
            return str.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(String str) {
            str.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return Any.f19694Y;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }
    }

    public static final class Or extends CharMatcher {
        public final CharMatcher X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final CharMatcher f19700Y;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            charMatcher.getClass();
            this.X = charMatcher;
            charMatcher2.getClass();
            this.f19700Y = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return this.X.m(c2) || this.f19700Y.m(c2);
        }

        public final String toString() {
            return "CharMatcher.or(" + this.X + ", " + this.f19700Y + ")";
        }
    }

    public static class RangesMatcher extends CharMatcher {
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final char[] f19701Y;
        public final char[] Z;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.X = str;
            this.f19701Y = cArr;
            this.Z = cArr2;
            Preconditions.f(cArr.length == cArr2.length);
            int i2 = 0;
            while (i2 < cArr.length) {
                Preconditions.f(cArr[i2] <= cArr2[i2]);
                int i3 = i2 + 1;
                if (i3 < cArr.length) {
                    Preconditions.f(cArr2[i2] < cArr[i3]);
                }
                i2 = i3;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            int iBinarySearch = Arrays.binarySearch(this.f19701Y, c2);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i2 = (~iBinarySearch) - 1;
            return i2 >= 0 && c2 <= this.Z[i2];
        }

        public final String toString() {
            return this.X;
        }
    }

    public static final class SingleWidth extends RangesMatcher {
        static {
            new SingleWidth("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    public static final class Whitespace extends NamedFastMatcher {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final int f19702Y = Integer.numberOfLeadingZeros(31);
        public static final CharMatcher Z = new Whitespace("CharMatcher.whitespace()");

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c2) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> f19702Y) == c2;
        }
    }

    public static String a(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher c(String str) {
        int length = str.length();
        if (length == 0) {
            return None.f19699Y;
        }
        if (length != 1) {
            return length != 2 ? new AnyOf(str) : new IsEither(str.charAt(0), str.charAt(1));
        }
        return new Is(str.charAt(0));
    }

    public static CharMatcher e() {
        return Ascii.f19695Y;
    }

    public static CharMatcher g(char c2, char c3) {
        return new InRange(c2, c3);
    }

    public static CharMatcher j(char c2) {
        return new Is(c2);
    }

    public static CharMatcher k() {
        return new IsNot(' ');
    }

    public static CharMatcher l() {
        return JavaIsoControl.f19698Y;
    }

    public CharMatcher b(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    @Override // com.google.common.base.Predicate
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean apply(Character ch) {
        return m(ch.charValue());
    }

    public int f(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (m(str.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public int h(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.k(i2, length);
        while (i2 < length) {
            if (m(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int i(String str) {
        return h(str, 0);
    }

    public abstract boolean m(char c2);

    public boolean n(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (!m(str.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean o(String str) {
        return i(str) == -1;
    }

    public CharMatcher p() {
        return new Negated(this);
    }

    public CharMatcher q(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }
}

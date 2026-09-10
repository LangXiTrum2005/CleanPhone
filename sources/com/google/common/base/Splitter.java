package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Splitter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharMatcher f19719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Strategy f19721c;
    public final int d;

    /* JADX INFO: renamed from: com.google.common.base.Splitter$2, reason: invalid class name */
    class AnonymousClass2 implements Strategy {
        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int b(int i2) {
                    AnonymousClass2.this.getClass();
                    return 1 + i2;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int c(int i2) {
                    AnonymousClass2.this.getClass();
                    CharSequence charSequence2 = this.Z;
                    int length = charSequence2.length() - 1;
                    while (i2 <= length) {
                        if (charSequence2.charAt(i2) == " ".charAt(0)) {
                            return i2;
                        }
                        i2++;
                    }
                    return -1;
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$3, reason: invalid class name */
    class AnonymousClass3 implements Strategy {

        /* JADX INFO: renamed from: com.google.common.base.Splitter$3$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            public final /* synthetic */ CommonMatcher i0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Splitter splitter, CharSequence charSequence, CommonMatcher commonMatcher) {
                super(splitter, charSequence);
                this.i0 = commonMatcher;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public final int b(int i2) {
                return this.i0.a();
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public final int c(int i2) {
                CommonMatcher commonMatcher = this.i0;
                if (commonMatcher.b(i2)) {
                    return commonMatcher.c();
                }
                return -1;
            }
        }

        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$4, reason: invalid class name */
    class AnonymousClass4 implements Strategy {
        @Override // com.google.common.base.Splitter.Strategy
        public final Iterator a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int b(int i2) {
                    return i2;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public final int c(int i2) {
                    AnonymousClass4.this.getClass();
                    if (i2 < this.Z.length()) {
                        return i2;
                    }
                    return -1;
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$5, reason: invalid class name */
    class AnonymousClass5 implements Iterable<String> {
        @Override // java.lang.Iterable
        public final Iterator<String> iterator() {
            throw null;
        }

        public final String toString() {
            Joiner joiner = new Joiner(", ");
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            joiner.b(sb, iterator());
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    public static final class MapSplitter {
    }

    public static abstract class SplittingIterator extends AbstractIterator<String> {
        public final CharSequence Z;
        public final CharMatcher e0;
        public final boolean f0;
        public int g0;
        public int h0;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.X = AbstractIterator.State.f19692Y;
            this.g0 = 0;
            this.e0 = splitter.f19719a;
            this.f0 = splitter.f19720b;
            this.h0 = splitter.d;
            this.Z = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        public final Object a() {
            CharMatcher charMatcher;
            int i2 = this.g0;
            while (true) {
                int i3 = this.g0;
                if (i3 == -1) {
                    this.X = AbstractIterator.State.Z;
                    return null;
                }
                int iC = c(i3);
                CharSequence charSequence = this.Z;
                if (iC == -1) {
                    iC = charSequence.length();
                    this.g0 = -1;
                } else {
                    this.g0 = b(iC);
                }
                int i4 = this.g0;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.g0 = i5;
                    if (i5 > charSequence.length()) {
                        this.g0 = -1;
                    }
                } else {
                    while (true) {
                        charMatcher = this.e0;
                        if (i2 >= iC || !charMatcher.m(charSequence.charAt(i2))) {
                            break;
                        }
                        i2++;
                    }
                    while (iC > i2 && charMatcher.m(charSequence.charAt(iC - 1))) {
                        iC--;
                    }
                    if (!this.f0 || i2 != iC) {
                        int i6 = this.h0;
                        if (i6 == 1) {
                            iC = charSequence.length();
                            this.g0 = -1;
                            while (iC > i2 && charMatcher.m(charSequence.charAt(iC - 1))) {
                                iC--;
                            }
                        } else {
                            this.h0 = i6 - 1;
                        }
                        return charSequence.subSequence(i2, iC).toString();
                    }
                    i2 = this.g0;
                }
            }
        }

        public abstract int b(int i2);

        public abstract int c(int i2);
    }

    public interface Strategy {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(Strategy strategy) {
        CharMatcher charMatcher = CharMatcher.None.f19699Y;
        this.f19721c = strategy;
        this.f19720b = false;
        this.f19719a = charMatcher;
        this.d = Integer.MAX_VALUE;
    }

    public static Splitter a(char c2) {
        final CharMatcher.Is is = new CharMatcher.Is(c2);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public final Iterator a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int b(int i2) {
                        return i2 + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public final int c(int i2) {
                        return is.h(this.Z, i2);
                    }
                };
            }
        });
    }

    public static void b() {
        JdkPattern jdkPattern = new JdkPattern(Pattern.compile("\r\n|\n|\r"));
        Preconditions.g(!new JdkPattern.JdkMatcher(jdkPattern.X.matcher("")).f19707a.matches(), "The pattern may not match the empty string: %s", jdkPattern);
    }

    public final List c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itA = this.f19721c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void d() {
        CharMatcher.Whitespace.Z.getClass();
    }
}

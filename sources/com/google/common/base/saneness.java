package com.google.common.base;

/* JADX INFO: compiled from: CharMatcher.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class saneness implements impassible<Character> {

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class attabal extends saneness {
        @Override // com.google.common.base.impassible
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.saneness(ch);
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static abstract class dern extends attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final String f21541kowloon;

        public dern(String str) {
            this.f21541kowloon = (String) formularize.triweekly(str);
        }

        public final String toString() {
            return this.f21541kowloon;
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class marial extends dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final int f21542arytenoidectomy = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public static final saneness f21543monoploid = new marial();

        public marial() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.saneness
        public boolean marial(char c) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f21542arytenoidectomy) == c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class C0308saneness extends attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final char f21544kowloon;

        public C0308saneness(char c) {
            this.f21544kowloon = c;
        }

        @Override // com.google.common.base.saneness
        public boolean marial(char c) {
            return c == this.f21544kowloon;
        }

        public String toString() {
            return "CharMatcher.is('" + saneness.competently(this.f21544kowloon) + "')";
        }
    }

    /* JADX INFO: compiled from: CharMatcher.java */
    public static final class wireman extends dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final saneness f21545arytenoidectomy = new wireman();

        public wireman() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.saneness
        public int dern(CharSequence charSequence, int i) {
            formularize.monoploid(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.saneness
        public boolean marial(char c) {
            return false;
        }
    }

    public static saneness beachfront() {
        return wireman.f21545arytenoidectomy;
    }

    public static String competently(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static saneness impromptu() {
        return marial.f21543monoploid;
    }

    public static saneness wireman(char c) {
        return new C0308saneness(c);
    }

    public int dern(CharSequence charSequence, int i) {
        int length = charSequence.length();
        formularize.monoploid(i, length);
        while (i < length) {
            if (marial(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean marial(char c);

    @Deprecated
    public boolean saneness(Character ch) {
        return marial(ch.charValue());
    }
}

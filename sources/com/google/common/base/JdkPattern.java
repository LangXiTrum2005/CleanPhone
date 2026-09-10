package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class JdkPattern extends CommonPattern implements Serializable {
    private static final long serialVersionUID = 0;
    public final Pattern X;

    public static final class JdkMatcher extends CommonMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matcher f19707a;

        public JdkMatcher(Matcher matcher) {
            matcher.getClass();
            this.f19707a = matcher;
        }

        @Override // com.google.common.base.CommonMatcher
        public final int a() {
            return this.f19707a.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public final boolean b(int i2) {
            return this.f19707a.find(i2);
        }

        @Override // com.google.common.base.CommonMatcher
        public final int c() {
            return this.f19707a.start();
        }
    }

    public JdkPattern(Pattern pattern) {
        pattern.getClass();
        this.X = pattern;
    }

    public final String toString() {
        return this.X.toString();
    }
}

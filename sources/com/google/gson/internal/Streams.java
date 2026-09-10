package com.google.gson.internal;

import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class Streams {

    public static final class AppendableWriter extends Writer {

        public static class CurrentWrite implements CharSequence {
            public char[] X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public String f21238Y;

            @Override // java.lang.CharSequence
            public final char charAt(int i2) {
                return this.X[i2];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.X.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i2, int i3) {
                return new String(this.X, i2, i3 - i2);
            }

            @Override // java.lang.CharSequence
            public final String toString() {
                if (this.f21238Y == null) {
                    this.f21238Y = new String(this.X);
                }
                return this.f21238Y;
            }
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence) {
            throw null;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(int i2) {
            throw null;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(String str, int i2, int i3) {
            Objects.requireNonNull(str);
            throw null;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence, int i2, int i3) {
            throw null;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i2, int i3) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i2, int i3) {
            throw null;
        }
    }
}

package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.Comparator;

/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class czestochowa {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final czestochowa f21886attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final czestochowa f21888saneness = new saneness(-1);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final czestochowa f21887dern = new saneness(1);

    /* JADX INFO: compiled from: ComparisonChain.java */
    public class attabal extends czestochowa {
        public attabal() {
            super(null);
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa beachfront(Comparable<?> comparable, Comparable<?> comparable2) {
            return formularize(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.czestochowa
        public <T> czestochowa competently(T t, T t2, Comparator<T> comparator) {
            return formularize(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.czestochowa
        public int cutely() {
            return 0;
        }

        public czestochowa formularize(int i) {
            if (i < 0) {
                return czestochowa.f21888saneness;
            }
            return i > 0 ? czestochowa.f21887dern : czestochowa.f21886attabal;
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa impromptu(boolean z, boolean z2) {
            return formularize(com.google.common.primitives.attabal.attabal(z, z2));
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa marial(long j, long j2) {
            return formularize(com.google.common.primitives.beachfront.attabal(j, j2));
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa taiyuan(boolean z, boolean z2) {
            return formularize(com.google.common.primitives.attabal.attabal(z2, z));
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa wireman(int i, int i2) {
            return formularize(Ints.marial(i, i2));
        }
    }

    public /* synthetic */ czestochowa(attabal attabalVar) {
        this();
    }

    public static czestochowa apical() {
        return f21886attabal;
    }

    public abstract czestochowa beachfront(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> czestochowa competently(T t, T t2, Comparator<T> comparator);

    public abstract int cutely();

    public abstract czestochowa impromptu(boolean z, boolean z2);

    public abstract czestochowa marial(long j, long j2);

    public abstract czestochowa taiyuan(boolean z, boolean z2);

    public abstract czestochowa wireman(int i, int i2);

    public czestochowa() {
    }

    /* JADX INFO: compiled from: ComparisonChain.java */
    public static final class saneness extends czestochowa {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f21889wireman;

        public saneness(int i) {
            super(null);
            this.f21889wireman = i;
        }

        @Override // com.google.common.collect.czestochowa
        public int cutely() {
            return this.f21889wireman;
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa beachfront(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa impromptu(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa marial(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa taiyuan(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.czestochowa
        public czestochowa wireman(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.czestochowa
        public <T> czestochowa competently(T t, T t2, Comparator<T> comparator) {
            return this;
        }
    }
}

package com.google.common.base;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class Ticker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ticker f19732a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.common.base.Ticker$1, reason: invalid class name */
    public class AnonymousClass1 extends Ticker {
        @Override // com.google.common.base.Ticker
        public final long a() {
            return System.nanoTime();
        }
    }

    public abstract long a();
}

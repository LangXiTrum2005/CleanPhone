package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends Exception {

    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13970b = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 400454163;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BAD_BASE_64";
        }
    }

    public g() {
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

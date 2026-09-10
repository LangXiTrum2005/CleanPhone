package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15506c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CBError f15508b;

    public static final class a {
        public a() {
        }

        public final x2 a(Object obj) {
            return new x2(obj, null, 0 == true ? 1 : 0);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x2 a(CBError cBError) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new x2(defaultConstructorMarker, cBError, defaultConstructorMarker);
        }
    }

    public x2(Object obj, CBError cBError) {
        this.f15507a = obj;
        this.f15508b = cBError;
    }

    public static final x2 a(CBError cBError) {
        return f15506c.a(cBError);
    }

    public /* synthetic */ x2(Object obj, CBError cBError, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cBError);
    }
}

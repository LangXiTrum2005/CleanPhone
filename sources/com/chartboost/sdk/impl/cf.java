package com.chartboost.sdk.impl;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public enum cf {
    MRAID("mraid"),
    HTML("html"),
    VAST("vast"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13606b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13605i = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13602c = new a(null);

    public static final class a {
        public a() {
        }

        public final cf a(String str) {
            Object next;
            Iterator<E> it = cf.b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.r(((cf) next).c(), str, true));
            cf cfVar = (cf) next;
            return cfVar == null ? cf.UNKNOWN : cfVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    cf(String str) {
        this.f13606b = str;
    }

    public static EnumEntries b() {
        return f13605i;
    }

    public final String c() {
        return this.f13606b;
    }
}

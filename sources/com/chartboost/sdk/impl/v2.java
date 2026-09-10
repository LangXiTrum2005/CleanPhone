package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v2 {
    public static final a j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae f15346c;
    public final File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f15347e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f15349i;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum b {
        UI,
        ASYNC;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15352e = EnumEntriesKt.a(a());
    }

    public enum c {
        GET,
        POST;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f15355e = EnumEntriesKt.a(a());
    }

    public enum d {
        CANCELED,
        QUEUED,
        PROCESSING;

        public static final /* synthetic */ EnumEntries f = EnumEntriesKt.a(a());
    }

    public v2(c method, String uri, ae priority, File file) {
        Intrinsics.f(method, "method");
        Intrinsics.f(uri, "uri");
        Intrinsics.f(priority, "priority");
        this.f15344a = method;
        this.f15345b = uri;
        this.f15346c = priority;
        this.d = file;
        this.f15347e = new AtomicReference(d.QUEUED);
        this.f15349i = b.UI;
    }

    public void a(CBError cBError, y2 y2Var) {
    }

    public final boolean b() {
        AtomicReference atomicReference = this.f15347e;
        d dVar = d.QUEUED;
        d dVar2 = d.CANCELED;
        while (!atomicReference.compareAndSet(dVar, dVar2)) {
            if (atomicReference.get() != dVar) {
                return false;
            }
        }
        return true;
    }

    public final c c() {
        return this.f15344a;
    }

    public final ae d() {
        return this.f15346c;
    }

    public final String e() {
        return this.f15345b;
    }

    public void a(Object obj, y2 y2Var) {
    }

    public void a(String uri, long j2) {
        Intrinsics.f(uri, "uri");
    }

    public w2 a() {
        return new w2(null, null, null);
    }

    public x2 a(y2 y2Var) {
        return x2.f15506c.a((Object) null);
    }
}

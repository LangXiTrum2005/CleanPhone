package com.kochava.core.log.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
final class a implements ClassLoggerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f28029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28031c;

    public a(Logger logger, String str, String str2) {
        this.f28029a = logger;
        this.f28030b = str;
        this.f28031c = str2;
    }

    @Override // com.kochava.core.log.internal.ClassLoggerApi
    public final void a(Object obj) {
        this.f28029a.c(obj, this.f28030b, this.f28031c, 3);
    }

    @Override // com.kochava.core.log.internal.ClassLoggerApi
    public final void b(Serializable serializable) {
        this.f28029a.c(serializable, this.f28030b, this.f28031c, 6);
    }

    @Override // com.kochava.core.log.internal.ClassLoggerApi
    public final void c(Serializable serializable) {
        this.f28029a.c(serializable, this.f28030b, this.f28031c, 5);
    }

    @Override // com.kochava.core.log.internal.ClassLoggerApi
    public final void d(Object obj) {
        this.f28029a.c(obj, this.f28030b, this.f28031c, 2);
    }

    @Override // com.kochava.core.log.internal.ClassLoggerApi
    public final void info(String str) {
        this.f28029a.c(str, this.f28030b, this.f28031c, 4);
    }
}

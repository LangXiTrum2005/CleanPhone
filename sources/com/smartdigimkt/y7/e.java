package com.smartdigimkt.y7;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class e extends d {
    private static final int f = 5;
    private static final long g = 3600000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile g f40267e;

    public e(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.y7.d, com.smartdigimkt.y7.h
    public com.smartdigimkt.x7.e a(com.smartdigimkt.x7.c cVar) {
        if (!c(cVar)) {
            return null;
        }
        if (this.f40267e == null) {
            synchronized (this.f40266c) {
                try {
                    if (this.f40267e == null) {
                        this.f40267e = new g(this.f40264a, this.f40265b, new g.a(5, 3600000L));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f40267e.a(cVar, super.a(cVar));
    }

    @Override // com.smartdigimkt.y7.d
    public String b(com.smartdigimkt.x7.c cVar) {
        return this.f40267e != null ? this.f40267e.e(cVar) : cVar.c();
    }

    @Override // com.smartdigimkt.y7.d
    public boolean c(com.smartdigimkt.x7.c cVar) {
        Context context = this.f40264a;
        return context != null && cVar != null && com.smartdigimkt.n8.h.h(context) && "eu_traffic".equals(cVar.c());
    }

    @Override // com.smartdigimkt.y7.h
    public void a(com.smartdigimkt.x7.e eVar, com.smartdigimkt.x7.c cVar) {
        if (c(cVar) && this.f40267e != null) {
            this.f40267e.a(eVar, cVar);
        }
    }
}

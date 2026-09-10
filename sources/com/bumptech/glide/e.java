package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.gms.internal.ads.dm0;
import g6.m;
import java.util.List;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f10465j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dm0 f10466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9.i f10467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd.b f10468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x.e f10470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f10471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od.c f10472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w6.f f10474i;

    static {
        a aVar = new a();
        aVar.f10454a = y6.b.f54212a;
        f10465j = aVar;
    }

    public e(Context context, dm0 dm0Var, l lVar, fd.b bVar, x.e eVar, List list, m mVar, od.c cVar) {
        super(context.getApplicationContext());
        this.f10466a = dm0Var;
        this.f10468c = bVar;
        this.f10469d = list;
        this.f10470e = eVar;
        this.f10471f = mVar;
        this.f10472g = cVar;
        this.f10473h = 4;
        this.f10467b = new i9.i(lVar);
    }

    public final h a() {
        return (h) this.f10467b.get();
    }
}

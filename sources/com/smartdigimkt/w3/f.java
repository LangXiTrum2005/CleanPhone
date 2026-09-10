package com.smartdigimkt.w3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class f implements b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f39273e = 5000;
    public static final int f = 0;
    public static final int g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39274h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f39275i = "DefaultRenderersFactory";
    protected static final int j = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> f39277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39278c;
    private final long d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public f(Context context) {
        this(context, 0);
    }

    public void a(Context context, Handler handler, int i2, ArrayList<y> arrayList) {
    }

    @Deprecated
    public f(Context context, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar) {
        this(context, gVar, 0);
    }

    @Override // com.smartdigimkt.w3.b0
    public y[] a(Handler handler, com.smartdigimkt.q4.h hVar, com.smartdigimkt.y3.g gVar, com.smartdigimkt.e4.f fVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar2) {
        if (gVar2 == null) {
            gVar2 = this.f39277b;
        }
        com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar3 = gVar2;
        ArrayList<y> arrayList = new ArrayList<>();
        a(this.f39276a, gVar3, this.d, handler, hVar, this.f39278c, arrayList);
        a(this.f39276a, gVar3, a(), handler, gVar, this.f39278c, arrayList);
        a(this.f39276a, fVar, handler.getLooper(), this.f39278c, arrayList);
        a(this.f39276a, handler, this.f39278c, arrayList);
        return (y[]) arrayList.toArray(new y[arrayList.size()]);
    }

    public f(Context context, int i2) {
        this(context, null, i2, 5000L);
    }

    @Deprecated
    public f(Context context, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, int i2) {
        this(context, gVar, i2, 5000L);
    }

    public f(Context context, int i2, long j2) {
        this(context, null, i2, j2);
    }

    @Deprecated
    public f(Context context, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, int i2, long j2) {
        this.f39276a = context;
        this.f39278c = i2;
        this.d = j2;
        this.f39277b = gVar;
    }

    public void a(Context context, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, long j2, Handler handler, com.smartdigimkt.q4.h hVar, int i2, ArrayList<y> arrayList) {
        arrayList.add(new com.smartdigimkt.q4.e(context, com.smartdigimkt.d4.c.f34440a, j2, gVar, false, handler, hVar, 50));
        if (i2 == 0) {
            return;
        }
        arrayList.size();
    }

    public void a(Context context, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, com.smartdigimkt.y3.f[] fVarArr, Handler handler, com.smartdigimkt.y3.g gVar2, int i2, ArrayList<y> arrayList) {
        arrayList.add(new com.smartdigimkt.y3.o(context, com.smartdigimkt.d4.c.f34440a, gVar, false, handler, gVar2, com.smartdigimkt.y3.c.a(context), fVarArr));
        if (i2 == 0) {
            return;
        }
        arrayList.size();
    }

    public void a(Context context, com.smartdigimkt.e4.f fVar, Looper looper, int i2, ArrayList<y> arrayList) {
        arrayList.add(new com.smartdigimkt.e4.g(fVar, looper));
    }

    public com.smartdigimkt.y3.f[] a() {
        return new com.smartdigimkt.y3.f[0];
    }
}

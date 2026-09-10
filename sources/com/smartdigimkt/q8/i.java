package com.smartdigimkt.q8;

import android.content.Context;
import com.smartdigimkt.sdk.api.SDMAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37957c = "i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37959b;

    public class a implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f37960Y;
        final /* synthetic */ SDMAdRequest Z;
        final /* synthetic */ k e0;

        public a(Context context, int i2, SDMAdRequest sDMAdRequest, k kVar) {
            this.X = context;
            this.f37960Y = i2;
            this.Z = sDMAdRequest;
            this.e0 = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.n8.n.a(i.this.f37959b, com.smartdigimkt.n8.f.a(String.valueOf(i.this.f37958a)), "load", "start", "", true);
            com.smartdigimkt.u8.e eVar = new com.smartdigimkt.u8.e();
            eVar.a(new com.smartdigimkt.u8.g()).a(new com.smartdigimkt.u8.c()).a(new com.smartdigimkt.u8.h()).a(new com.smartdigimkt.u8.f()).a(new com.smartdigimkt.u8.b()).a(new com.smartdigimkt.u8.a());
            eVar.c(new com.smartdigimkt.s8.b(this.X, i.this.f37959b, i.this.f37958a, this.f37960Y, this.Z, this.e0));
        }
    }

    public i(int i2, String str) {
        this.f37958a = i2;
        this.f37959b = str;
    }

    public void a(Context context, k kVar, SDMAdRequest sDMAdRequest) {
        a(context, kVar, sDMAdRequest, 0);
    }

    public void a(Context context, k kVar, SDMAdRequest sDMAdRequest, int i2) {
        com.smartdigimkt.l7.b.a().g(new a(context, i2, sDMAdRequest, kVar));
    }
}

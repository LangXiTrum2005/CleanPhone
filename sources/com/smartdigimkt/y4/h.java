package com.smartdigimkt.y4;

import android.content.Context;
import android.view.ViewGroup;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.api.SDMAdConst;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class h extends c {
    private static final String q = "h";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f40228p;

    public class a implements Runnable {
        final /* synthetic */ ViewGroup X;

        public a(ViewGroup viewGroup) {
            this.X = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> mapE = h.this.e();
            if (mapE == null) {
                mapE = new HashMap<>(2);
            }
            h hVar = h.this;
            hVar.k.a(this.X, mapE, hVar.f40228p);
        }
    }

    public h(Context context, c.g gVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.l8.f fVar) {
        super(context, gVar, aVar, fVar);
    }

    @Override // com.smartdigimkt.y4.c
    public void a(d dVar) {
        super.a(dVar);
    }

    @Override // com.smartdigimkt.y4.c
    public void c() {
        super.c();
    }

    public boolean p() {
        return (this.j != null || i.f(this.f, this.d) || i.g(this.f, this.d)) ? false : true;
    }

    public void a(ViewGroup viewGroup) {
        com.smartdigimkt.j7.c.a(false);
        this.f40228p = com.smartdigimkt.n8.h.a(e(), SDMAdConst.EXTRA_PARAMS.SHOW_HIDE_SPLASH_SKIP_VIEW, false);
        com.smartdigimkt.l7.b.a().e(new a(viewGroup));
    }
}

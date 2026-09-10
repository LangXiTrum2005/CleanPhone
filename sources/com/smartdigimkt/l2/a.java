package com.smartdigimkt.l2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.i2.e;
import com.smartdigimkt.i2.h;
import com.smartdigimkt.r2.c;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.x.d;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public a(Context context, List<d> list, h hVar, Map<String, Object> map) {
        a(new c().a(context, list), hVar, map);
    }

    private void a(com.smartdigimkt.c2.c cVar, h hVar, Map<String, Object> map) {
        if (hVar == null) {
            return;
        }
        if (cVar == null) {
            hVar.a(com.smartdigimkt.f2.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (cVar.c() == null) {
            hVar.a(com.smartdigimkt.f2.b.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(cVar.g())) {
            hVar.a(com.smartdigimkt.f2.b.NOT_FOUND_LAYOUTNAME);
            return;
        }
        View viewInflate = LayoutInflater.from(cVar.c()).inflate(k.a(cVar.c(), cVar.g(), "layout"), (ViewGroup) null);
        com.smartdigimkt.e2.b.a().a(viewInflate, cVar, map);
        com.smartdigimkt.e2.a.a().a(viewInflate, cVar, map, new C0527a(hVar));
    }

    public a(com.smartdigimkt.c2.c cVar, h hVar, Map<String, Object> map) {
        a(cVar, hVar, map);
    }

    /* JADX INFO: renamed from: com.smartdigimkt.l2.a$a, reason: collision with other inner class name */
    public class C0527a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f36319a;

        public C0527a(h hVar) {
            this.f36319a = hVar;
        }

        @Override // com.smartdigimkt.i2.e
        public void a(View view, List<View> list) {
            com.smartdigimkt.c2.a aVar = new com.smartdigimkt.c2.a();
            aVar.a(view);
            aVar.a(list);
            aVar.a(false);
            this.f36319a.a(aVar);
        }

        @Override // com.smartdigimkt.i2.e
        public void a(com.smartdigimkt.f2.b bVar) {
            this.f36319a.a(bVar);
        }
    }
}

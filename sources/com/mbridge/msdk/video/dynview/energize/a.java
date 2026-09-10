package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.listener.e;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f37346b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f37347a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f37346b != null) {
            return f37346b;
        }
        synchronized (a.class) {
            try {
                if (f37346b == null) {
                    f37346b = new a();
                }
                aVar = f37346b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private void b(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().b(cVar, view, map, eVar);
    }

    private void c(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().c(cVar, view, map, eVar);
    }

    public void d() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f37347a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void b() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f37347a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f37347a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(View view, c cVar, Map map, e eVar) {
        int iG = cVar.g();
        if (iG == 1) {
            a(cVar, view, map, eVar);
            return;
        }
        if (iG == 2) {
            b(cVar, view, map, eVar);
            return;
        }
        if (iG == 4) {
            a(cVar, view, eVar);
        } else if (iG != 5) {
            eVar.a(view, new ArrayList());
        } else {
            c(cVar, view, map, eVar);
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.mbridge.msdk.video.dynview.wrapper.a aVar = new com.mbridge.msdk.video.dynview.wrapper.a();
        aVar.a(cVar, view, map, eVar);
        this.f37347a = aVar.l;
    }

    private void a(c cVar, View view, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().a(cVar, view, eVar);
    }
}

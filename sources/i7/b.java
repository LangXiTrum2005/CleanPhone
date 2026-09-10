package i7;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import i0.e;
import i0.f;
import java.util.ArrayList;
import java.util.Locale;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b implements n, ti.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f42906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42907b;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        this.f42907b = aVar.f50787a;
        p pVar = new p(aVar.f50789c, "uk.spiralarm.flutter/devicelocale");
        this.f42906a = pVar;
        pVar.b(this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f42906a.b(null);
    }

    @Override // xi.n
    public final void onMethodCall(m mVar, o oVar) {
        String str = mVar.f53822a;
        str.getClass();
        int i10 = 0;
        switch (str) {
            case "setLanguagePerApp":
                if (Build.VERSION.SDK_INT >= 33) {
                    new Handler(this.f42907b.getMainLooper()).post(new a(this, (String) mVar.a("locale")));
                    ((j) oVar).a(Boolean.TRUE);
                    break;
                } else {
                    ((j) oVar).a(Boolean.FALSE);
                    break;
                }
                break;
            case "isLanguagePerAppSettingSupported":
                ((j) oVar).a(Boolean.valueOf(Build.VERSION.SDK_INT >= 33));
                break;
            case "preferredLanguages":
                ArrayList arrayList = new ArrayList();
                e eVar = e.f42487b;
                e eVar2 = new e(new f(LocaleList.getAdjustedDefault()));
                while (true) {
                    f fVar = eVar2.f42488a;
                    if (i10 >= fVar.f42489a.size()) {
                        ((j) oVar).a(arrayList);
                    } else {
                        arrayList.add(fVar.f42489a.get(i10).toLanguageTag());
                        i10++;
                    }
                    break;
                }
                break;
            case "currentLocale":
                ((j) oVar).a(Locale.getDefault().toLanguageTag());
                break;
            default:
                ((j) oVar).c();
                break;
        }
    }
}

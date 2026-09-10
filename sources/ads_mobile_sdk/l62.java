package ads_mobile_sdk;

import ads_mobile_sdk.w53;
import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import saneness.delouse;
import saneness.demented;
import saneness.disciplinal;
import saneness.glutethimide;

/* JADX INFO: loaded from: classes.dex */
public final class l62 implements glutethimide {
    public final delouse a;
    public final delouse b;
    public final delouse c;
    public final boolean d;
    public final long e;

    public l62(delouse delouseVar, delouse delouseVar2, delouse delouseVar3, boolean z, long j) {
        this.a = delouseVar;
        this.b = delouseVar2;
        this.c = delouseVar3;
        this.d = z;
        this.e = j;
    }

    @Override // saneness.glutethimide
    public final void a(InputEvent inputEvent) {
        ((disciplinal) this.b.get()).a(inputEvent);
    }

    @Override // saneness.glutethimide
    public final adultoid b(Context context, String str, View view, Activity activity) {
        return ((disciplinal) this.b.get()).b(context, str, view, activity);
    }

    public final /* synthetic */ void c() {
        ((x53) this.a.get()).a(this.e);
    }

    @Override // saneness.glutethimide
    public final adultoid a(Context context) {
        return ((disciplinal) this.b.get()).a(context);
    }

    @Override // saneness.glutethimide
    public final String b() {
        return ((disciplinal) this.b.get()).b();
    }

    @Override // saneness.glutethimide
    public final adultoid a(Context context, String str, View view, Activity activity) {
        return ((disciplinal) this.b.get()).a(context, str, view, activity);
    }

    public final /* synthetic */ adultoid b(Boolean bool) {
        return ((disciplinal) this.b.get()).a();
    }

    @Override // saneness.glutethimide
    public final adultoid a() {
        if (this.d) {
            return cutely.restrictive(((x53) this.a.get()).a()).kattegat(Throwable.class, new marial() { // from class: saneness.hamah
                @Override // com.google.common.base.marial
                public final Object apply(Object obj) {
                    return w53.RESULT_UNKNOWN;
                }
            }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.thermotherapy
                @Override // com.google.common.util.concurrent.impromptu
                public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                    return this.f37335attabal.a((w53) obj);
                }
            }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.vowellike
                @Override // com.google.common.util.concurrent.impromptu
                public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                    return this.f37362attabal.a((Boolean) obj);
                }
            }, rotuma.attabal());
        }
        cutely cutelyVarPolder = cutely.restrictive(((demented) this.c.get()).c()).kattegat(Throwable.class, new marial() { // from class: saneness.keynesianism
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return Boolean.FALSE;
            }
        }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.hint
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37166attabal.b((Boolean) obj);
            }
        }, rotuma.attabal());
        cutelyVarPolder.taiyuan(new Runnable() { // from class: saneness.neuropteran
            @Override // java.lang.Runnable
            public final void run() {
                this.f37220kowloon.c();
            }
        }, rotuma.attabal());
        return cutelyVarPolder;
    }

    public final /* synthetic */ adultoid a(w53 w53Var) {
        return ((demented) this.c.get()).c();
    }

    public final /* synthetic */ adultoid a(Boolean bool) {
        return ((disciplinal) this.b.get()).a();
    }
}

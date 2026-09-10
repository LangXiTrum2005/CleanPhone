package com.smartdigimkt.k5;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.smartdigimkt.w6.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f36206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.v6.a f36207c;
    b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.smartdigimkt.k5.a f36208e;
    c f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36210i;
    private WeakReference<View> j;
    private List<WeakReference<View>> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f36211l;
    float m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36205a = "d";
    private boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36209h = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f36212n = false;
    boolean o = false;

    public class a implements Runnable {
        final /* synthetic */ View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f36213Y;

        public a(View view, int i2) {
            this.X = view;
            this.f36213Y = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            b bVar;
            View view;
            View view2;
            d dVar2 = d.this;
            if (dVar2.f36212n || dVar2.o) {
                return;
            }
            Context contextK = com.smartdigimkt.m6.b.p().k();
            if (contextK == null) {
                contextK = com.smartdigimkt.k3.c.d().b();
            }
            if (contextK == null && (view2 = this.X) != null && (contextK = view2.getContext()) != null) {
                contextK = contextK.getApplicationContext();
            }
            String unused = d.this.f36205a;
            int i2 = this.f36213Y;
            try {
                switch (i2) {
                    case 112:
                        d dVar3 = d.this;
                        b bVar2 = dVar3.d;
                        if (bVar2 != null) {
                            dVar3.o = true;
                            bVar2.a();
                            d.this.d = null;
                        }
                        break;
                    case 113:
                        d dVar4 = d.this;
                        c cVar = dVar4.f;
                        if (cVar != null && dVar4.d != null) {
                            cVar.h();
                            break;
                        }
                        break;
                    case 114:
                        if (d.this.f36209h) {
                            break;
                        } else {
                            d.this.f36209h = true;
                            if (!d.this.b()) {
                                boolean zIsEmpty = TextUtils.isEmpty(d.this.f36206b.k0());
                                boolean z2 = !zIsEmpty;
                                d dVar5 = d.this;
                                b bVar3 = dVar5.d;
                                if (bVar3 != null && dVar5.f36208e == null) {
                                    dVar5.f36208e = bVar3.c();
                                }
                                d dVar6 = d.this;
                                com.smartdigimkt.k5.a aVar = dVar6.f36208e;
                                if (aVar != null) {
                                    aVar.a(z2);
                                    d.this.f36208e.a();
                                } else {
                                    com.smartdigimkt.v6.a aVar2 = dVar6.f36207c;
                                    String str = aVar2 != null ? aVar2.f : "";
                                    f fVar = dVar6.f36206b;
                                    iN = fVar != null ? fVar.N() : 0;
                                    String unused2 = d.this.f36205a;
                                    com.smartdigimkt.i7.d.a("Omsdk Exception", "create omsdkAdEvent fail:is empty,requestId:" + str + ",offerResourceType:" + iN, com.smartdigimkt.m6.b.p().q());
                                }
                                if (!zIsEmpty && (bVar = (dVar = d.this).d) != null && dVar.f == null) {
                                    dVar.f = bVar.b();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        switch (i2) {
                            case 201:
                                if (this.X == null) {
                                    d.this.a("2", "omsdkMeasureView is empty");
                                    d.this.f36212n = true;
                                } else {
                                    if (!d.this.b()) {
                                        boolean z3 = !TextUtils.isEmpty(d.this.f36206b.k0());
                                        d dVar7 = d.this;
                                        e eVarA = e.a();
                                        d dVar8 = d.this;
                                        dVar7.d = eVarA.a(contextK, z3, dVar8.f36206b, dVar8.f36207c);
                                    } else if (!(this.X instanceof WebView) || contextK == null) {
                                        d.this.a("2", "omsdkMeasureView is not webview");
                                    } else if (!TextUtils.isEmpty(d.this.f36206b.K())) {
                                        d dVar9 = d.this;
                                        e eVarA2 = e.a();
                                        WebView webView = (WebView) this.X;
                                        d dVar10 = d.this;
                                        dVar9.d = eVarA2.a(contextK, webView, dVar10.f36206b, dVar10.f36207c);
                                    }
                                    d dVar11 = d.this;
                                    b bVar4 = dVar11.d;
                                    if (bVar4 != null) {
                                        bVar4.b(this.X);
                                        if (d.this.j != null && (view = (View) d.this.j.get()) != null) {
                                            d.this.d.a(view);
                                        }
                                        if (d.this.k != null && !d.this.k.isEmpty()) {
                                            ArrayList arrayList = new ArrayList();
                                            for (int iN = 0; iN < d.this.k.size(); iN++) {
                                                View view3 = (View) ((WeakReference) d.this.k.get(iN)).get();
                                                if (view3 != null) {
                                                    arrayList.add(view3);
                                                }
                                            }
                                            d.this.d.a(arrayList);
                                        }
                                        d.this.d.start();
                                    } else {
                                        dVar11.f36212n = true;
                                    }
                                }
                                break;
                            case 202:
                                d dVar12 = d.this;
                                c cVar2 = dVar12.f;
                                if (cVar2 != null && dVar12.d != null) {
                                    cVar2.a(dVar12.f36211l, dVar12.m);
                                    break;
                                }
                                break;
                            case 203:
                                d dVar13 = d.this;
                                c cVar3 = dVar13.f;
                                if (cVar3 != null && dVar13.d != null) {
                                    cVar3.c();
                                    break;
                                }
                                break;
                            case 204:
                                d dVar14 = d.this;
                                c cVar4 = dVar14.f;
                                if (cVar4 != null && dVar14.d != null) {
                                    cVar4.e();
                                    break;
                                }
                                break;
                            case 205:
                                d dVar15 = d.this;
                                c cVar5 = dVar15.f;
                                if (cVar5 != null && dVar15.d != null) {
                                    cVar5.f();
                                    break;
                                }
                                break;
                            case 206:
                                d dVar16 = d.this;
                                c cVar6 = dVar16.f;
                                if (cVar6 != null && dVar16.d != null) {
                                    cVar6.d();
                                    break;
                                }
                                break;
                            case 207:
                                d dVar17 = d.this;
                                c cVar7 = dVar17.f;
                                if (cVar7 != null && dVar17.d != null) {
                                    cVar7.pause();
                                    break;
                                }
                                break;
                            case 208:
                                d dVar18 = d.this;
                                c cVar8 = dVar18.f;
                                if (cVar8 != null && dVar18.d != null) {
                                    cVar8.resume();
                                    break;
                                }
                                break;
                            case 209:
                                d dVar19 = d.this;
                                c cVar9 = dVar19.f;
                                if (cVar9 != null && dVar19.d != null) {
                                    cVar9.b();
                                    break;
                                }
                                break;
                            case 210:
                                d dVar20 = d.this;
                                c cVar10 = dVar20.f;
                                if (cVar10 != null && dVar20.d != null) {
                                    cVar10.g();
                                    break;
                                }
                                break;
                            case BaseATView.g.f38289J /* 211 */:
                                d dVar21 = d.this;
                                c cVar11 = dVar21.f;
                                if (cVar11 != null && dVar21.d != null) {
                                    cVar11.a();
                                    break;
                                }
                                break;
                            case 212:
                                d dVar22 = d.this;
                                c cVar12 = dVar22.f;
                                if (cVar12 != null && dVar22.d != null) {
                                    cVar12.a(dVar22.m);
                                    break;
                                }
                                break;
                        }
                        break;
                }
            } catch (Throwable th) {
                if (com.smartdigimkt.m6.b.p().D()) {
                    th.printStackTrace();
                }
                String unused3 = d.this.f36205a;
                th.getMessage();
                com.smartdigimkt.i7.d.a("Omsdk Exception", "handle:" + this.f36213Y + " with throwable:" + th.getMessage(), com.smartdigimkt.m6.b.p().q());
            }
        }
    }

    public d(f fVar, com.smartdigimkt.v6.a aVar) {
        this.f36206b = fVar;
        this.f36207c = aVar;
        boolean zF = com.smartdigimkt.j5.c.a().f();
        this.f36210i = zF;
        if (zF) {
            return;
        }
        com.smartdigimkt.m6.b.p().D();
    }

    public boolean b() {
        return !i.g(this.f36206b, this.f36207c) && this.f36206b.v0();
    }

    public boolean c() {
        return e.a().c();
    }

    public void a(int i2, View view) {
        if (this.g || !this.f36210i || !c() || this.f36212n || this.o || TextUtils.isEmpty(this.f36206b.S())) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new a(view, i2));
    }

    public void b(View view) {
        if (view != null) {
            this.j = new WeakReference<>(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        String str3;
        if (!b()) {
            if (!TextUtils.isEmpty(this.f36206b.k0())) {
                str3 = "3";
            } else {
                str3 = "2";
            }
        } else {
            str3 = "1";
        }
        com.smartdigimkt.i7.d.a(this.f36207c, this.f36206b, e.a().b(), str3, false, str, str2);
    }

    public void a(boolean z2) {
        if (z2) {
            this.m = 0.0f;
        } else {
            this.m = 1.0f;
        }
    }

    public void a(long j) {
        this.f36211l = j;
    }

    public void a(View view) {
        if (view != null) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(new WeakReference<>(view));
        }
    }

    public void a() {
        this.g = true;
    }
}

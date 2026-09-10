package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n9 implements d.b, u2.a, UserMessagingPlatform.OnConsentFormLoadSuccessListener, com.applovin.impl.sdk.d.c, i2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f8860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8863d;

    public /* synthetic */ n9(l lVar, com.applovin.impl.sdk.l lVar2, n nVar, o oVar) {
        this.f8863d = lVar;
        this.f8860a = lVar2;
        this.f8861b = nVar;
        this.f8862c = oVar;
    }

    @Override // com.applovin.impl.d.b
    public void a(Activity activity) {
        l.a((t2) this.f8863d, (n) this.f8861b, (o) this.f8862c, (com.applovin.impl.sdk.l) this.f8860a, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // i2.m
    public oa.n1 b(int i10, i1.q0 q0Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        i1.q0 q0Var2 = q0Var;
        i2.i iVar = (i2.i) this.f8863d;
        String str = (String) this.f8861b;
        int[] iArr2 = (int[]) this.f8862c;
        Point point = (Point) this.f8860a;
        int i15 = iArr2[i10];
        int i16 = point != null ? point.x : iVar.f42677e;
        int i17 = point != null ? point.y : iVar.f42678f;
        boolean z10 = iVar.f42680h;
        if (i16 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            int i18 = Integer.MAX_VALUE;
            for (int i19 = 0; i19 < q0Var2.f42659a; i19++) {
                i1.p pVar = q0Var2.f42662d[i19];
                int i20 = pVar.f42650u;
                int i21 = pVar.f42651v;
                if (i20 > 0 && i21 > 0) {
                    if (!z10) {
                        i13 = i17;
                        i14 = i16;
                    } else if ((i20 > i21) != (i16 > i17)) {
                        i14 = i17;
                        i13 = i16;
                    } else {
                        i13 = i17;
                        i14 = i16;
                    }
                    int i22 = i20 * i13;
                    int i23 = i21 * i14;
                    Point point2 = i22 >= i23 ? new Point(i14, l1.y.g(i23, i20)) : new Point(l1.y.g(i22, i21), i13);
                    int i24 = pVar.f42650u;
                    int i25 = i24 * i21;
                    if (i24 >= ((int) (point2.x * 0.98f)) && i21 >= ((int) (point2.y * 0.98f)) && i25 < i18) {
                        i18 = i25;
                    }
                }
            }
            i11 = i18;
        }
        oa.e0 e0VarU = oa.j0.u();
        int i26 = 0;
        while (i26 < q0Var2.f42659a) {
            i1.p pVar2 = q0Var2.f42662d[i26];
            int i27 = pVar2.f42650u;
            int i28 = (i27 == -1 || (i12 = pVar2.f42651v) == -1) ? -1 : i27 * i12;
            e0VarU.b(new i2.o(i10, q0Var2, i26, iVar, iArr[i26], str, i15, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11)));
            i26++;
            q0Var2 = q0Var;
        }
        return e0VarU.g();
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((com.applovin.impl.privacy.cmp.a) this.f8863d).a((com.applovin.impl.privacy.cmp.a.InterfaceC0014a) this.f8861b, (FormError) this.f8862c, (m0) this.f8860a, consentForm);
    }

    public /* synthetic */ n9(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f8863d = obj;
        this.f8861b = obj2;
        this.f8862c = obj3;
        this.f8860a = obj4;
    }

    @Override // com.applovin.impl.u2.a
    public void a(l2 l2Var, t2 t2Var) {
        ((l) this.f8863d).a((com.applovin.impl.sdk.l) this.f8860a, (n) this.f8861b, (o) this.f8862c, l2Var, t2Var);
    }

    @Override // com.applovin.impl.sdk.d.c
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        ((com.applovin.impl.sdk.e) this.f8863d).a((com.applovin.impl.sdk.e.a) this.f8861b, (com.applovin.impl.sdk.d.a) this.f8862c, (u) this.f8860a, bVar, str);
    }
}

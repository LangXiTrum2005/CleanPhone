package com.smartdigimkt.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.smartdigimkt.f0.c;
import com.smartdigimkt.f1.k;
import com.smartdigimkt.n1.b;
import com.smartdigimkt.x.d;

/* JADX INFO: loaded from: classes5.dex */
public class ATAdChoice extends ATImageView {
    private static final String l0 = "MBAdChoice";
    private String h0;
    private String i0;
    private String j0;
    private final Context k0;

    public class a implements c {
        public a() {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            ATAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public ATAdChoice(Context context) {
        super(context);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "";
        this.k0 = context;
        b();
    }

    private boolean a(d dVar) {
        com.smartdigimkt.n1.a aVarC = b.b().c(com.smartdigimkt.u.a.f().a());
        c(dVar, aVarC);
        a(dVar, aVarC);
        b(dVar, aVarC);
        boolean z2 = (TextUtils.isEmpty(this.h0) || TextUtils.isEmpty(this.j0) || TextUtils.isEmpty(this.i0)) ? false : true;
        setImageUrl(this.h0);
        return z2;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(d dVar, com.smartdigimkt.n1.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.j0 = aVar.j();
                return;
            }
            return;
        }
        String strF1 = dVar.F1();
        this.j0 = strF1;
        if (TextUtils.isEmpty(strF1)) {
            d.a aVarW = dVar.W();
            if (aVarW != null) {
                this.j0 = aVarW.e();
            }
            if (!TextUtils.isEmpty(this.j0) || aVar == null) {
                return;
            }
            this.j0 = aVar.j();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        c();
        return true;
    }

    public void setCampaign(k kVar) {
        if ((kVar instanceof d) && a((d) kVar)) {
            a();
        }
    }

    private void b(d dVar, com.smartdigimkt.n1.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.i0 = aVar.k();
                return;
            }
            return;
        }
        d.a aVarW = dVar.W();
        if (aVarW != null) {
            this.i0 = aVarW.f();
        }
        if (!TextUtils.isEmpty(this.i0) || aVar == null) {
            return;
        }
        this.i0 = aVar.k();
    }

    public ATAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "";
        this.k0 = context;
        b();
    }

    private void c() {
        if (TextUtils.isEmpty(this.j0)) {
            return;
        }
        com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), this.j0);
    }

    private void a(d dVar, com.smartdigimkt.n1.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.h0 = aVar.i();
                return;
            }
            return;
        }
        d.a aVarW = dVar.W();
        if (aVarW != null) {
            this.h0 = aVarW.d();
        }
        if (!TextUtils.isEmpty(this.h0) || aVar == null) {
            return;
        }
        this.h0 = aVar.i();
    }

    public ATAdChoice(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h0 = "";
        this.i0 = "";
        this.j0 = "";
        this.k0 = context;
        b();
    }

    private void a() {
        if (this.k0 != null) {
            com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(this.h0, new a());
        }
    }
}

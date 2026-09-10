package com.smartdigimkt.v3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class j extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f39124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f39125c;
    com.smartdigimkt.c7.c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f39126e;

    public class a implements View.OnClickListener {
        final /* synthetic */ Dialog X;

        public a(Dialog dialog) {
            this.X = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j jVar = j.this;
            String str = jVar.f39125c;
            String strL = jVar.f39090a.L();
            j jVar2 = j.this;
            com.smartdigimkt.i7.d.a(str, strL, jVar2.f39124b, 7, (String) null, 0L, 0L, jVar2.f39090a);
            try {
                this.X.dismiss();
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements View.OnClickListener {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Dialog f39128Y;

        public b(Context context, Dialog dialog) {
            this.X = context;
            this.f39128Y = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                j jVar = j.this;
                String str = jVar.f39125c;
                String strL = jVar.f39090a.L();
                j jVar2 = j.this;
                com.smartdigimkt.i7.d.a(str, strL, jVar2.f39124b, 8, (String) null, 0L, 0L, jVar2.f39090a);
                boolean zB = com.smartdigimkt.m3.f.b(this.X, j.this.f39090a);
                if (zB) {
                    j jVar3 = j.this;
                    String str2 = jVar3.f39125c;
                    String strL2 = jVar3.f39090a.L();
                    j jVar4 = j.this;
                    com.smartdigimkt.i7.d.a(str2, strL2, jVar4.f39124b, 9, (String) null, 0L, 0L, jVar4.f39090a, 0, jVar4.f39126e);
                } else {
                    j jVar5 = j.this;
                    String str3 = jVar5.f39125c;
                    String strL3 = jVar5.f39090a.L();
                    j jVar6 = j.this;
                    com.smartdigimkt.i7.d.a(str3, strL3, jVar6.f39124b, 13, (String) null, 0L, 0L, jVar6.f39090a);
                }
                this.f39128Y.dismiss();
                com.smartdigimkt.c7.c cVar = j.this.d;
                if (cVar != null) {
                    cVar.a(zB);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public j(com.smartdigimkt.w6.f fVar, String str, String str2, com.smartdigimkt.c7.c cVar, long j) {
        this.f39124b = str;
        this.f39125c = str2;
        this.f39090a = fVar;
        this.d = cVar;
        this.f39126e = j;
    }

    @Override // com.smartdigimkt.v3.f
    public void a(Activity activity) {
        try {
            com.smartdigimkt.w6.f fVar = this.f39090a;
            String strZ0 = fVar instanceof com.smartdigimkt.w6.l ? ((com.smartdigimkt.w6.l) fVar).z0() : "";
            if (TextUtils.isEmpty(strZ0)) {
                strZ0 = this.f39090a.g0();
            }
            Context contextK = com.smartdigimkt.m6.b.p().k();
            View viewInflate = LayoutInflater.from(activity).inflate(com.smartdigimkt.n8.h.a(contextK, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(com.smartdigimkt.n8.h.a(contextK, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) viewInflate.findViewById(com.smartdigimkt.n8.h.a(contextK, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) viewInflate.findViewById(com.smartdigimkt.n8.h.a(contextK, "myoffer_confirm_continue", "id"));
            String string = contextK.getString(com.smartdigimkt.n8.h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_confirm_msg", com.smartdigimkt.v0.k.f38992h));
            String string2 = contextK.getString(com.smartdigimkt.n8.h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_give_up", com.smartdigimkt.v0.k.f38992h));
            String string3 = contextK.getString(com.smartdigimkt.n8.h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_continue", com.smartdigimkt.v0.k.f38992h));
            textView.setText(string + "\"" + strZ0 + "\"?");
            textView2.setText(string2);
            textView3.setText(string3);
            Dialog dialog = new Dialog(activity, com.smartdigimkt.n8.h.a(contextK, "style_full_screen_translucent_dialog", "style"));
            dialog.setContentView(viewInflate);
            dialog.setCancelable(false);
            textView2.setOnClickListener(new a(dialog));
            textView3.setOnClickListener(new b(contextK, dialog));
            dialog.show();
        } catch (Throwable unused) {
        }
    }
}

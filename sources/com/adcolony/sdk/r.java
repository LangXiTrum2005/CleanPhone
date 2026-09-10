package com.adcolony.sdk;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h0 f9337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f9338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9339c;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (!com.adcolony.sdk.a.c() || !(com.adcolony.sdk.a.a() instanceof Activity)) {
                new e0.a().a("Missing Activity reference, can't build AlertDialog.").a(e0.f9132i);
            } else if (c0.b(h0Var.a(), "on_resume")) {
                r.this.f9337a = h0Var;
            } else {
                r.this.a(h0Var);
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f9341a;

        public b(h0 h0Var) {
            this.f9341a = h0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            r.this.f9338b = null;
            dialogInterface.dismiss();
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "positive", true);
            r.this.f9339c = false;
            this.f9341a.a(f1VarB).c();
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f9343a;

        public c(h0 h0Var) {
            this.f9343a = h0Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            r.this.f9338b = null;
            dialogInterface.dismiss();
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "positive", false);
            r.this.f9339c = false;
            this.f9343a.a(f1VarB).c();
        }
    }

    public class d implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f9345a;

        public d(h0 h0Var) {
            this.f9345a = h0Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            r.this.f9338b = null;
            r.this.f9339c = false;
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "positive", false);
            this.f9345a.a(f1VarB).c();
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog.Builder f9347a;

        public e(AlertDialog.Builder builder) {
            this.f9347a = builder;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f9339c = true;
            r.this.f9338b = this.f9347a.show();
        }
    }

    public r() {
        com.adcolony.sdk.a.a("Alert.show", new a());
    }

    public void c() {
        h0 h0Var = this.f9337a;
        if (h0Var != null) {
            a(h0Var);
            this.f9337a = null;
        }
    }

    public boolean b() {
        return this.f9339c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h0 h0Var) {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(contextA, R.style.Theme.Material.Dialog.Alert);
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, PglCryptUtils.KEY_MESSAGE);
        String strH2 = c0.h(f1VarA, "title");
        String strH3 = c0.h(f1VarA, "positive");
        String strH4 = c0.h(f1VarA, "negative");
        builder.setMessage(strH);
        builder.setTitle(strH2);
        builder.setPositiveButton(strH3, new b(h0Var));
        if (!strH4.equals("")) {
            builder.setNegativeButton(strH4, new c(h0Var));
        }
        builder.setOnCancelListener(new d(h0Var));
        z0.b(new e(builder));
    }

    public AlertDialog a() {
        return this.f9338b;
    }

    public void a(AlertDialog alertDialog) {
        this.f9338b = alertDialog;
    }
}

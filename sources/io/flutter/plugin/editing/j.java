package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.ads.n3;
import io.flutter.plugin.platform.n;
import qj.x;
import wi.m;
import wi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f43296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f43297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wi.b f43298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n3 f43299e = new n3(1, 0, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f43300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray f43301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f43302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputConnection f43304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f43305k;
    public final io.flutter.plugin.platform.m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f43306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f43307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f43308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f43309p;

    public j(View view, wi.b bVar, x xVar, n nVar, io.flutter.plugin.platform.m mVar) {
        this.f43295a = view;
        this.f43302h = new f(null, view);
        this.f43296b = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.f43297c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
        this.f43307n = imeSyncDeferringInsetsCallback;
        imeSyncDeferringInsetsCallback.install();
        imeSyncDeferringInsetsCallback.setImeVisibilityListener(new s4.i(this));
        this.f43298d = bVar;
        bVar.f53212b = new n5.f(this, 18);
        ((p) bVar.f53211a).a("TextInputClient.requestExistingInputState", null, null);
        this.f43305k = nVar;
        nVar.f43358g = this;
        this.l = mVar;
        mVar.f43341f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r7 == r0.f53273e) goto L42;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r18) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.j.a(boolean):void");
    }

    public final void b(int i10) {
        n3 n3Var = this.f43299e;
        int i11 = n3Var.f17624a;
        if ((i11 == 3 || i11 == 4) && n3Var.f17625b == i10) {
            this.f43299e = new n3(1, 0, false);
            d();
            View view = this.f43295a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f43296b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f43303i = false;
        }
    }

    public final void c() {
        this.f43305k.f43358g = null;
        this.l.f43341f = null;
        this.f43298d.f53212b = null;
        d();
        this.f43302h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f43307n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        m mVar;
        k5.g gVar;
        AutofillManager autofillManager = this.f43297c;
        if (autofillManager == null || (mVar = this.f43300f) == null || (gVar = mVar.f53263j) == null || this.f43301g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f43295a, ((String) gVar.f44325a).hashCode());
    }
}

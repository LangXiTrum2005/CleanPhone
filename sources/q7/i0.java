package q7;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.ironsource.X3;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f48698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception[] f48699c = new Exception[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f48700d;

    public i0(l0 l0Var, String str, Bundle bundle) {
        this.f48700d = l0Var;
        this.f48697a = str;
        this.f48698b = bundle;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [q7.h0] */
    public final String[] a(Void... p10) {
        if (!v7.a.b(this)) {
            try {
                if (!v7.a.b(this)) {
                    try {
                        kotlin.jvm.internal.n.f(p10, "p0");
                        String[] stringArray = this.f48698b.getStringArray(X3.i.I0);
                        if (stringArray != null) {
                            final String[] strArr = new String[stringArray.length];
                            this.f48699c = new Exception[stringArray.length];
                            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                            Date date = l7.a.l;
                            l7.a aVarD = go.k.D();
                            try {
                                int length = stringArray.length;
                                for (final int i10 = 0; i10 < length; i10++) {
                                    if (isCancelled()) {
                                        Iterator it = concurrentLinkedQueue.iterator();
                                        while (it.hasNext()) {
                                            ((l7.c0) it.next()).cancel(true);
                                        }
                                    } else {
                                        Uri uri = Uri.parse(stringArray[i10]);
                                        if (e0.x(uri)) {
                                            strArr[i10] = uri.toString();
                                            countDownLatch.countDown();
                                        } else {
                                            ?? r10 = new l7.w() { // from class: q7.h0
                                                @Override // l7.w
                                                public final void a(l7.e0 e0Var) {
                                                    String[] strArr2 = strArr;
                                                    int i11 = i10;
                                                    try {
                                                        l7.q qVar = e0Var.f45111c;
                                                        String str = "Error staging photo.";
                                                        if (qVar != null) {
                                                            String strA = qVar.a();
                                                            if (strA != null) {
                                                                str = strA;
                                                            }
                                                            throw new l7.o(e0Var, str);
                                                        }
                                                        JSONObject jSONObject = e0Var.f45110b;
                                                        if (jSONObject == null) {
                                                            throw new l7.n("Error staging photo.");
                                                        }
                                                        String strOptString = jSONObject.optString("uri");
                                                        if (strOptString == null) {
                                                            throw new l7.n("Error staging photo.");
                                                        }
                                                        strArr2[i11] = strOptString;
                                                        countDownLatch.countDown();
                                                    } catch (Exception e10) {
                                                        this.f48699c[i11] = e10;
                                                    }
                                                }
                                            };
                                            kotlin.jvm.internal.n.e(uri, "uri");
                                            concurrentLinkedQueue.add(com.bumptech.glide.c.x(aVarD, uri, r10).d());
                                        }
                                    }
                                }
                                countDownLatch.await();
                                return strArr;
                            } catch (Exception unused) {
                                Iterator it2 = concurrentLinkedQueue.iterator();
                                while (it2.hasNext()) {
                                    ((l7.c0) it2.next()).cancel(true);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        v7.a.a(this, th2);
                    }
                }
            } catch (Throwable th3) {
                v7.a.a(this, th3);
                return null;
            }
        }
        return null;
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.f48698b;
        l0 l0Var = this.f48700d;
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = l0Var.f48715e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                for (Exception exc : this.f48699c) {
                    if (exc != null) {
                        l0Var.e(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    l0Var.e(new l7.n("Failed to stage photos for web dialog"));
                    return;
                }
                List listA0 = xj.k.a0(strArr);
                if (listA0.contains(null)) {
                    l0Var.e(new l7.n("Failed to stage photos for web dialog"));
                    return;
                }
                e0.F(bundle, new JSONArray((Collection) listA0));
                l0Var.f48711a = e0.a(f.e(), bundle, l7.s.e() + "/dialog/" + this.f48697a).toString();
                ImageView imageView = l0Var.f48716f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                l0Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String[]] */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (!v7.a.b(this)) {
            try {
                if (!v7.a.b(this)) {
                    try {
                        this = a((Void[]) objArr);
                        return this;
                    } catch (Throwable th2) {
                        v7.a.a(this, th2);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                v7.a.a(this, th3);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                b((String[]) obj);
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }
}

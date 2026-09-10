package od;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import cn.l;
import com.adjust.sdk.t0;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.T3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.storage.androidcleaner.R;
import d5.u;
import e6.i;
import ea.e4;
import ea.k4;
import ea.m1;
import ea.s0;
import he.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import k6.a0;
import k6.r;
import k6.s;
import k6.x;
import kb.h;
import kb.j;
import lm.e;
import m0.m0;
import m0.r1;
import m0.v;
import o.k;
import o.m;
import oa.k0;
import oe.f;
import om.n;
import org.json.JSONObject;
import p.b3;
import xi.g;
import zk.b0;
import zk.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements k4, vj.a, v, s, e6.b, h, e, mg.a, OnCompleteListener, d, n, k, xi.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f47384c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47386b;

    public /* synthetic */ c(int i10, boolean z10) {
        this.f47385a = i10;
    }

    public static ArrayList h(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add(T3.f27210b);
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add(T3.f27213e);
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add(T3.f27212d);
        }
        if (Build.VERSION.SDK_INT >= 35 && networkCapabilities.hasTransport(10)) {
            arrayList.add("satellite");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public static boolean k(int i10) {
        return (48 <= i10 && i10 <= 57) || i10 == 35 || i10 == 42;
    }

    @Override // k6.s
    public r M(x xVar) {
        switch (this.f47385a) {
            case 14:
                return new k6.c((a0) this.f47386b, 1);
            default:
                return new k6.b((Resources) this.f47386b, xVar.b(Uri.class, InputStream.class));
        }
    }

    @Override // ea.k4
    public void a(String str, Bundle bundle, String str2) {
        e4 e4Var = (e4) this.f47386b;
        if (!TextUtils.isEmpty(str)) {
            e4Var.P().P0(new t0(this, str, str2, bundle, 9));
            return;
        }
        m1 m1Var = e4Var.l;
        if (m1Var != null) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(str2, "AppId not known when logging event");
        }
    }

    @Override // mg.a
    public long b(vf.c type, long j10) {
        kotlin.jvm.internal.n.f(type, "type");
        wf.e eVar = (wf.e) this.f47386b;
        long jLongValue = ((Number) eVar.l(type)).longValue();
        if (jLongValue != Long.MIN_VALUE) {
            long j11 = jLongValue + 1;
            if (j10 < j11) {
                j10 = j11;
            }
        }
        eVar.b(type, Long.valueOf(j10));
        return j10;
    }

    @Override // o.k
    public boolean c(m mVar, MenuItem menuItem) {
        p.m mVar2 = ((ActionMenuView) this.f47386b).f3929z;
        return mVar2 != null && ((Toolbar) ((k0) mVar2).f47269b).G.a(menuItem);
    }

    @Override // e6.b
    public boolean d(Object obj, File file, i iVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        dm0 dm0Var = (dm0) this.f47386b;
        byte[] bArr = (byte[]) dm0Var.d(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        dm0Var.h(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        dm0Var.h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                dm0Var.h(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    @Override // m0.v
    public r1 f(View view, r1 r1Var) {
        boolean z10;
        boolean z11;
        int iD = r1Var.d();
        k.v vVar = (k.v) this.f47386b;
        Context context = vVar.f44172k;
        int iD2 = r1Var.d();
        ActionBarContextView actionBarContextView = vVar.f44182v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f44182v.getLayoutParams();
            boolean z12 = true;
            if (vVar.f44182v.isShown()) {
                if (vVar.f44167c0 == null) {
                    vVar.f44167c0 = new Rect();
                    vVar.f44168d0 = new Rect();
                }
                Rect rect = vVar.f44167c0;
                Rect rect2 = vVar.f44168d0;
                rect.set(r1Var.b(), r1Var.d(), r1Var.c(), r1Var.a());
                b3.a(vVar.A, rect, rect2);
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup = vVar.A;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                r1 r1VarA = m0.a(viewGroup);
                int iB = r1VarA == null ? 0 : r1VarA.b();
                int iC = r1VarA == null ? 0 : r1VarA.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || vVar.C != null) {
                    View view2 = vVar.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            vVar.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vVar.C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    vVar.A.addView(vVar.C, -1, layoutParams);
                }
                View view4 = vVar.C;
                z12 = view4 != null;
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = vVar.C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Segment.SIZE) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!vVar.H && z12) {
                    iD2 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                vVar.f44182v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vVar.C;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return m0.s0.d(view, iD != iD2 ? r1Var.e(r1Var.b(), iD2, r1Var.c(), r1Var.a()) : r1Var);
    }

    @Override // xi.h
    public void g(g gVar) {
        k0 k0Var = new k0(gVar, 4);
        m5.k kVar = (m5.k) ((na.g) this.f47386b).f46631b;
        kVar.f45902b = k0Var;
        kVar.D();
    }

    @Override // vj.a
    public Object get() {
        mb.g gVar = (mb.g) ((k5.g) this.f47386b).f44325a;
        com.bumptech.glide.d.j(gVar);
        return gVar;
    }

    @Override // he.d
    public ke.b i(String str, int i10, EnumMap enumMap) {
        if (i10 == 15) {
            return ((f) this.f47386b).i("0".concat(String.valueOf(str)), 8, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(u.A(i10)));
    }

    @Override // lm.e
    public lm.d j(yl.b classId) {
        lm.d dVarJ;
        kotlin.jvm.internal.n.f(classId, "classId");
        d0 d0Var = (d0) this.f47386b;
        yl.c cVarG = classId.g();
        kotlin.jvm.internal.n.e(cVarG, "classId.packageFqName");
        for (b0 b0Var : zk.u.i(d0Var, cVarG)) {
            if ((b0Var instanceof mm.c) && (dVarJ = ((mm.c) b0Var).f46258i.j(classId)) != null) {
                return dVarJ;
            }
        }
        return null;
    }

    @Override // kb.h
    public Object l(String str) {
        j jVar = (j) this.f47386b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return jVar.c(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return jVar.c(str, null);
    }

    @Override // om.n
    public void lock() {
        ((ReentrantLock) this.f47386b).lock();
    }

    public hc.b m(JSONObject jSONObject) {
        hc.d a0Var;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            a0Var = new ea.b0(23);
        } else {
            a0Var = new ea.a0(24);
        }
        return a0Var.h((v1.j) this.f47386b, jSONObject);
    }

    @Override // xi.h
    public void onCancel() {
        m5.k kVar = (m5.k) ((na.g) this.f47386b).f46631b;
        kVar.f45902b = null;
        kVar.D();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        l lVar = (l) this.f47386b;
        Exception exception = task.getException();
        if (exception != null) {
            lVar.resumeWith(t9.e.c(exception));
        } else if (task.isCanceled()) {
            lVar.f(null);
        } else {
            lVar.resumeWith(task.getResult());
        }
    }

    @Override // o.k
    public void q(m mVar) {
        na.g gVar = ((ActionMenuView) this.f47386b).f3924u;
        if (gVar != null) {
            gVar.q(mVar);
        }
    }

    @Override // om.n
    public void unlock() {
        ((ReentrantLock) this.f47386b).unlock();
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f47385a = i10;
        this.f47386b = obj;
    }

    public c(ni.f fVar) {
        this.f47385a = 3;
        this.f47386b = Collections.unmodifiableMap(new HashMap(fVar.f46764a));
    }

    public c(int i10) {
        this.f47385a = i10;
        switch (i10) {
            case 2:
                this.f47386b = new LinkedHashSet();
                break;
            case 14:
                this.f47386b = new a0(7);
                break;
            case 20:
                this.f47386b = new wf.e((Object) Long.MIN_VALUE, (Object) Long.MIN_VALUE);
                break;
            case 24:
                this.f47386b = new f(0);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                this.f47386b = new LinkedHashMap();
                break;
            default:
                this.f47386b = new HashSet();
                break;
        }
    }

    public c(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
        this.f47385a = 9;
        this.f47386b = uuid;
    }

    public c(a6.a aVar) {
        this.f47385a = 1;
        this.f47386b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}

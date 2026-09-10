package oa;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.gms.internal.ads.n3;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class k0 implements org.chromium.net.c, p.m, ph.b, zk.r, rl.k, androidx.lifecycle.g0, wd.b, xi.b, xi.n, xb.b, yb.a, ym.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47269b;

    public /* synthetic */ k0(int i10, boolean z10) {
        this.f47268a = i10;
    }

    public static u1.b C(cc.a2 a2Var) {
        new m5.k(2);
        a2Var.getClass();
        new HashMap();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, mi.d] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, mi.d] */
    private final void F(xi.m mVar, xi.o oVar) {
        ClipDescription primaryClipDescription;
        int i10;
        wi.c cVarA;
        v6.c cVar = (v6.c) this.f47269b;
        if (((io.flutter.plugin.platform.l) cVar.f52488b) == null) {
            return;
        }
        String str = mVar.f53822a;
        Object obj = mVar.f53823b;
        try {
            boolean zHasMimeType = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).f42855e.w(((Boolean) obj).booleanValue());
                        ((wi.j) oVar).a(null);
                    }
                    ((wi.j) oVar).c();
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        i3.f fVar = (i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", (String) obj);
                        ((Activity) fVar.f42853c).startActivity(Intent.createChooser(intent, null));
                        ((wi.j) oVar).a(null);
                    }
                    ((wi.j) oVar).c();
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        i3.f fVar2 = (i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b;
                        if (!fVar2.f42855e.r()) {
                            Activity activity = (Activity) fVar2.f42853c;
                            if (activity instanceof f.v) {
                                ((f.v) activity).getOnBackPressedDispatcher().b().a();
                            } else {
                                activity.finish();
                            }
                        }
                        ((wi.j) oVar).a(null);
                    }
                    ((wi.j) oVar).c();
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        ((ClipboardManager) ((Activity) ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).f42853c).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                        ((wi.j) oVar).a(null);
                    }
                    ((wi.j) oVar).c();
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        i3.f fVar3 = (i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b;
                        View decorView = ((Activity) fVar3.f42853c).getWindow().getDecorView();
                        decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.c(fVar3, decorView));
                        ((wi.j) oVar).a(null);
                    }
                    ((wi.j) oVar).c();
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            int i11 = jSONObject.getInt("primaryColor");
                            if (i11 != 0) {
                                i11 |= -16777216;
                            }
                            ((Activity) ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).f42853c).setTaskDescription(new ActivityManager.TaskDescription(jSONObject.getString("label"), 0, i11));
                            ((wi.j) oVar).a(null);
                        } catch (JSONException e10) {
                            ((wi.j) oVar).b("error", e10.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        try {
                            ((io.flutter.plugin.platform.l) cVar.f52488b).k(q4.a.c((String) obj));
                            ((wi.j) oVar).a(null);
                        } catch (NoSuchFieldException e11) {
                            ((wi.j) oVar).b("error", e11.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        try {
                            int iD = q4.a.d((String) obj);
                            i3.f fVar4 = (i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b;
                            if (iD == 1) {
                                ((Activity) fVar4.f42853c).getWindow().getDecorView().playSoundEffect(0);
                            }
                            ((wi.j) oVar).a(null);
                        } catch (NoSuchFieldException e12) {
                            ((wi.j) oVar).b("error", e12.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).v();
                        ((wi.j) oVar).a(null);
                    }
                    ((wi.j) oVar).c();
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        ClipboardManager clipboardManager = (ClipboardManager) ((Activity) ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).f42853c).getSystemService("clipboard");
                        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                            zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(X3.i.X, zHasMimeType);
                        ((wi.j) oVar).a(jSONObject2);
                    }
                    ((wi.j) oVar).c();
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        try {
                            int iL = v6.c.l((String) obj, cVar);
                            i3.f fVar5 = (i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b;
                            if (iL == 1) {
                                i10 = 1798;
                            } else if (iL == 2) {
                                i10 = 3846;
                            } else if (iL != 3) {
                                if (iL == 4) {
                                    i10 = 1792;
                                }
                                ((wi.j) oVar).a(null);
                            } else {
                                i10 = 5894;
                            }
                            fVar5.f42852b = i10;
                            fVar5.v();
                            ((wi.j) oVar).a(null);
                        } catch (NoSuchFieldException | JSONException e13) {
                            ((wi.j) oVar).b("error", e13.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        try {
                            ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).r(v6.c.m(cVar, (JSONObject) obj));
                            ((wi.j) oVar).a(null);
                        } catch (NoSuchFieldException | JSONException e14) {
                            ((wi.j) oVar).b("error", e14.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        String str2 = (String) obj;
                        if (str2 != null) {
                            try {
                                cVarA = wi.c.a(str2);
                            } catch (NoSuchFieldException unused) {
                                ((wi.j) oVar).b("error", "No such clipboard content format: ".concat(str2), null);
                                cVarA = null;
                            }
                        } else {
                            cVarA = null;
                        }
                        CharSequence charSequenceD = ((io.flutter.plugin.platform.l) cVar.f52488b).d(cVarA);
                        if (charSequenceD == null) {
                            ((wi.j) oVar).a(null);
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("text", charSequenceD);
                            ((wi.j) oVar).a(jSONObject3);
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        try {
                            ((io.flutter.plugin.platform.l) cVar.f52488b).j(v6.c.k(cVar, (JSONArray) obj));
                            ((wi.j) oVar).a(null);
                        } catch (NoSuchFieldException | JSONException e15) {
                            ((wi.j) oVar).b("error", e15.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        try {
                            ((Activity) ((i3.f) ((io.flutter.plugin.platform.l) cVar.f52488b).f43335b).f42853c).setRequestedOrientation(v6.c.j(cVar, (JSONArray) obj));
                            ((wi.j) oVar).a(null);
                        } catch (NoSuchFieldException | JSONException e16) {
                            ((wi.j) oVar).b("error", e16.getMessage(), null);
                            return;
                        }
                    }
                    ((wi.j) oVar).c();
                    break;
                default:
                    ((wi.j) oVar).c();
                    break;
            }
        } catch (JSONException e17) {
            ((wi.j) oVar).b("error", "JSON error: " + e17.getMessage(), null);
        }
    }

    public static String G(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // androidx.lifecycle.g0
    public void A(Object obj) {
        switch (this.f47268a) {
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                t.l lVar = (t.l) this.f47269b;
                if (charSequence != null) {
                    lVar.F();
                    lVar.f50295a.c(null);
                }
                break;
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                t.z zVar = (t.z) this.f47269b;
                Handler handler = zVar.f50322q;
                q5.a aVar = zVar.f50323r;
                handler.removeCallbacks(aVar);
                TextView textView = zVar.f50328w;
                if (textView != null) {
                    textView.setText(charSequence2);
                }
                handler.postDelayed(aVar, 2000L);
                break;
        }
    }

    public synchronized e6.l D(Class cls) {
        int size = ((ArrayList) this.f47269b).size();
        for (int i10 = 0; i10 < size; i10++) {
            v6.e eVar = (v6.e) ((ArrayList) this.f47269b).get(i10);
            if (eVar.f52492a.isAssignableFrom(cls)) {
                return eVar.f52493b;
            }
        }
        return null;
    }

    public u1.h E(i1.y yVar) {
        yVar.f42714b.getClass();
        yVar.f42714b.getClass();
        return u1.h.f51661a;
    }

    @Override // yb.a
    public void a(zb.q qVar) {
        this.f47269b = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // zk.r
    public zk.r b(al.j additionalAnnotations) {
        kotlin.jvm.internal.n.f(additionalAnnotations, "additionalAnnotations");
        return this;
    }

    @Override // zk.r
    public zk.s build() {
        return (rm.b) this.f47269b;
    }

    @Override // zk.r
    public zk.r d(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        return this;
    }

    @Override // zk.r
    public zk.r e(int i10) {
        d5.u.n(i10, "kind");
        return this;
    }

    @Override // org.chromium.net.c
    public FileChannel g() {
        return new FileInputStream((File) this.f47269b).getChannel();
    }

    @Override // vj.a
    public Object get() {
        return new ud.l((tc.b) ((rb.c) this.f47269b).f49529b);
    }

    @Override // zk.r
    public zk.r i(zk.j owner) {
        kotlin.jvm.internal.n.f(owner, "owner");
        return this;
    }

    @Override // rl.k
    public rl.l l(yl.f fVar) {
        if (DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B.equals(fVar.b())) {
            return new sl.b(this, 2);
        }
        return null;
    }

    @Override // zk.r
    public zk.r o(pm.y type) {
        kotlin.jvm.internal.n.f(type, "type");
        return this;
    }

    @Override // ph.b
    public void onAdLoaded() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.f47269b;
        ((ConcurrentHashMap) ((rh.a) m0Var.f11736d).f38583b).put(((ph.c) m0Var.f11734b).f48371a, (th.e) m0Var.f11735c);
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, xi.o oVar) {
        Bundle bundle;
        switch (this.f47268a) {
            case 21:
                wi.b bVar = (wi.b) this.f47269b;
                if (((rb.c) bVar.f53212b) != null) {
                    String str = mVar.f53822a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((wi.j) oVar).c();
                    } else {
                        JSONObject jSONObject = (JSONObject) mVar.f53823b;
                        try {
                            ((wi.j) oVar).a(((rb.c) bVar.f53212b).o(jSONObject.getString(X3.i.W), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                        } catch (JSONException e10) {
                            ((wi.j) oVar).b("error", e10.getMessage(), null);
                            return;
                        }
                    }
                    break;
                }
                break;
            case 22:
                F(mVar, oVar);
                break;
            case 23:
                p.s sVar = (p.s) this.f47269b;
                String str2 = mVar.f53822a;
                Object obj = mVar.f53823b;
                str2.getClass();
                if (str2.equals("get")) {
                    sVar.f47792e = true;
                    if (sVar.f47791d || !sVar.f47790c) {
                        ((wi.j) oVar).a(p.s.d((byte[]) sVar.f47793f));
                    } else {
                        sVar.f47789b = (wi.j) oVar;
                    }
                } else if (str2.equals("put")) {
                    sVar.f47793f = (byte[]) obj;
                    ((wi.j) oVar).a(null);
                } else {
                    ((wi.j) oVar).c();
                }
                break;
            default:
                wi.b bVar2 = (wi.b) this.f47269b;
                if (((n5.f) bVar2.f53212b) != null) {
                    String str3 = mVar.f53822a;
                    Object obj2 = mVar.f53823b;
                    str3.getClass();
                    switch (str3) {
                        case "TextInput.setPlatformViewClient":
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj2;
                                int i10 = jSONObject2.getInt("platformViewId");
                                boolean zOptBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) ((n5.f) bVar2.f53212b).f46523b;
                                View view = jVar.f43295a;
                                if (zOptBoolean) {
                                    view.requestFocus();
                                    jVar.f43299e = new n3(3, i10, false);
                                    jVar.f43296b.restartInput(view);
                                    jVar.f43303i = false;
                                } else {
                                    jVar.f43299e = new n3(4, i10, false);
                                    jVar.f43304j = null;
                                }
                                ((wi.j) oVar).a(null);
                                break;
                            } catch (JSONException e11) {
                                ((wi.j) oVar).b("error", e11.getMessage(), null);
                            }
                            break;
                        case "TextInput.setEditingState":
                            try {
                                ((n5.f) bVar2.f53212b).z(wi.o.a((JSONObject) obj2));
                                ((wi.j) oVar).a(null);
                                break;
                            } catch (JSONException e12) {
                                ((wi.j) oVar).b("error", e12.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setClient":
                            try {
                                JSONArray jSONArray = (JSONArray) obj2;
                                ((n5.f) bVar2.f53212b).x(jSONArray.getInt(0), wi.m.a(jSONArray.getJSONObject(1)));
                                ((wi.j) oVar).a(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e13) {
                                ((wi.j) oVar).b("error", e13.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.hide":
                            io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) ((n5.f) bVar2.f53212b).f46523b;
                            if (jVar2.f43299e.f17624a == 4) {
                                jVar2.d();
                            } else {
                                View view2 = jVar2.f43295a;
                                jVar2.d();
                                jVar2.f43296b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            ((wi.j) oVar).a(null);
                            break;
                        case "TextInput.show":
                            io.flutter.plugin.editing.j jVar3 = (io.flutter.plugin.editing.j) ((n5.f) bVar2.f53212b).f46523b;
                            InputMethodManager inputMethodManager = jVar3.f43296b;
                            View view3 = jVar3.f43295a;
                            wi.m mVar2 = jVar3.f43300f;
                            if (mVar2 == null || mVar2.f53260g.f53266a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                jVar3.d();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            ((wi.j) oVar).a(null);
                            break;
                        case "TextInput.sendAppPrivateCommand":
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj2;
                                String string = jSONObject3.getString("action");
                                String string2 = jSONObject3.getString("data");
                                if (string2 == null || string2.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                }
                                io.flutter.plugin.editing.j jVar4 = (io.flutter.plugin.editing.j) ((n5.f) bVar2.f53212b).f46523b;
                                jVar4.f43296b.sendAppPrivateCommand(jVar4.f43295a, string, bundle);
                                ((wi.j) oVar).a(null);
                                break;
                            } catch (JSONException e14) {
                                ((wi.j) oVar).b("error", e14.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setEditableSizeAndTransform":
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj2;
                                double d10 = jSONObject4.getDouble("width");
                                double d11 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i11 = 0; i11 < 16; i11++) {
                                    dArr[i11] = jSONArray2.getDouble(i11);
                                }
                                ((n5.f) bVar2.f53212b).y(d10, d11, dArr);
                                ((wi.j) oVar).a(null);
                                break;
                            } catch (JSONException e15) {
                                ((wi.j) oVar).b("error", e15.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.finishAutofillContext":
                            n5.f fVar = (n5.f) bVar2.f53212b;
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            AutofillManager autofillManager = ((io.flutter.plugin.editing.j) fVar.f46523b).f43297c;
                            if (autofillManager != null) {
                                if (zBooleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                            ((wi.j) oVar).a(null);
                            break;
                        case "TextInput.clearClient":
                            io.flutter.plugin.editing.j jVar5 = (io.flutter.plugin.editing.j) ((n5.f) bVar2.f53212b).f46523b;
                            View view4 = jVar5.f43295a;
                            if (jVar5.f43299e.f17624a != 3) {
                                jVar5.f43302h.e(jVar5);
                                jVar5.d();
                                jVar5.f43300f = null;
                                jVar5.f43301g = null;
                                jVar5.f43299e = new n3(1, 0, false);
                                jVar5.f43306m = null;
                                WeakHashMap weakHashMap = m0.s0.f45746a;
                                m0.r1 r1VarA = m0.m0.a(view4);
                                if (r1VarA != null && !r1VarA.f45740a.p(8)) {
                                    jVar5.f43296b.restartInput(view4);
                                }
                            }
                            ((wi.j) oVar).a(null);
                            break;
                        case "TextInput.requestAutofill":
                            io.flutter.plugin.editing.j jVar6 = (io.flutter.plugin.editing.j) ((n5.f) bVar2.f53212b).f46523b;
                            View view5 = jVar6.f43295a;
                            AutofillManager autofillManager2 = jVar6.f43297c;
                            if (autofillManager2 != null && jVar6.f43301g != null) {
                                String str4 = (String) jVar6.f43300f.f53263j.f44325a;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(jVar6.f43306m);
                                rect.offset(iArr[0], iArr[1]);
                                autofillManager2.notifyViewEntered(view5, str4.hashCode(), rect);
                            }
                            ((wi.j) oVar).a(null);
                            break;
                        default:
                            ((wi.j) oVar).c();
                            break;
                    }
                }
                break;
        }
    }

    @Override // zk.r
    public zk.r q(int i10) {
        d5.u.n(i10, "modality");
        return this;
    }

    @Override // ym.a
    public Iterable r(Object obj) {
        yk.l lVar = (yk.l) this.f47269b;
        Collection collectionF = ((zk.e) obj).n().f();
        kotlin.jvm.internal.n.e(collectionF, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            zk.g gVarE = ((pm.y) it.next()).P().e();
            zk.g gVarA = gVarE != null ? gVarE.a() : null;
            zk.e eVar = gVarA instanceof zk.e ? (zk.e) gVarA : null;
            ml.j jVarF = eVar != null ? lVar.f(eVar) : null;
            if (jVarF != null) {
                arrayList.add(jVarF);
            }
        }
        return arrayList;
    }

    @Override // xi.b
    public void t(Object obj, wi.b bVar) {
        qd.i iVar = (qd.i) this.f47269b;
        if (((io.flutter.view.a) iVar.f48982d) == null) {
            bVar.e(null);
            return;
        }
        HashMap map = (HashMap) obj;
        String str = (String) map.get("type");
        HashMap map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                if (((String) map2.get("message")) != null) {
                    ((io.flutter.view.a) iVar.f48982d).getClass();
                    break;
                }
                break;
            case "announce":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) iVar.f48982d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.g) aVar.f43416a).f43479a.announceForAccessibility(str2);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) iVar.f48982d;
                    ((io.flutter.view.g) aVar2.f43416a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) iVar.f48982d;
                    ((io.flutter.view.g) aVar3.f43416a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) iVar.f48982d;
                    ((io.flutter.view.g) aVar4.f43416a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        bVar.e(null);
    }

    @Override // xb.b
    public void x(Bundle bundle, String str) {
        zb.q qVar = (zb.q) this.f47269b;
        if (qVar != null) {
            try {
                String str2 = "$A$:" + G(bundle, str);
                zb.r rVar = qVar.f54735a;
                rVar.f54750p.f3462a.b(new zb.p(rVar, System.currentTimeMillis() - rVar.f54739d, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // zk.r
    public zk.r y(il.o visibility) {
        kotlin.jvm.internal.n.f(visibility, "visibility");
        return this;
    }

    @Override // rl.k
    public rl.k z(yl.b bVar, yl.f fVar) {
        return null;
    }

    public /* synthetic */ k0(Object obj, int i10) {
        this.f47268a = i10;
        this.f47269b = obj;
    }

    public k0(int i10) {
        this.f47268a = i10;
        switch (i10) {
            case 15:
                this.f47269b = new b6.e();
                break;
            case 16:
                this.f47269b = new Object();
                break;
            case 18:
                this.f47269b = new SparseArray();
                break;
            case 19:
                this.f47269b = new ArrayList();
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                this.f47269b = new AtomicBoolean(false);
                break;
            default:
                this.f47269b = new ConcurrentHashMap();
                break;
        }
    }

    public k0(Bundle bundle, String str) {
        Uri uriA;
        String str2;
        this.f47268a = 3;
        bundle = bundle == null ? new Bundle() : bundle;
        int[] iArrD = v0.i.d(2);
        ArrayList arrayList = new ArrayList(iArrD.length);
        for (int i10 : iArrD) {
            if (i10 == 1) {
                str2 = "context_choose";
            } else {
                if (i10 != 2) {
                    throw null;
                }
                str2 = "join_tournament";
            }
            arrayList.add(str2);
        }
        if (arrayList.contains(str)) {
            l7.s sVar = l7.s.f45212a;
            uriA = q7.e0.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), bundle, "/dialog/".concat(str));
        } else {
            uriA = q7.e0.a(q7.f.e(), bundle, l7.s.e() + "/dialog/" + str);
        }
        this.f47269b = uriA;
    }

    @Override // zk.r
    public zk.r B() {
        return this;
    }

    @Override // zk.r
    public zk.r h() {
        return this;
    }

    @Override // zk.r
    public zk.r j() {
        return this;
    }

    @Override // rl.k
    public void k() {
    }

    @Override // zk.r
    public zk.r m() {
        return this;
    }

    @Override // zk.r
    public zk.r n() {
        return this;
    }

    @Override // zk.r
    public zk.r s() {
        return this;
    }

    @Override // zk.r
    public zk.r v() {
        return this;
    }

    @Override // zk.r
    public zk.r c(List list) {
        return this;
    }

    @Override // zk.r
    public zk.r f(cl.z zVar) {
        return this;
    }

    public k0(n.j jVar) {
        this.f47268a = 24;
        new xi.p(jVar, "flutter/sensitivecontent", xi.v.f53830b).b(new rb.c(this, 18));
    }

    @Override // rl.k
    public void p(yl.f fVar, Object obj) {
    }

    @Override // rl.k
    public void u(yl.f fVar, dm.f fVar2) {
    }

    @Override // rl.k
    public void w(yl.f fVar, yl.b bVar, yl.f fVar2) {
    }
}

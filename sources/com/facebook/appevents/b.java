package com.facebook.appevents;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.storage.androidcleaner.R;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.e0;
import l7.q;
import l7.s;
import l7.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.r;
import q7.u;
import t1.t;
import y7.e;
import y7.f;
import y7.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10576e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10572a = i10;
        this.f10573b = obj;
        this.f10574c = obj2;
        this.f10575d = obj3;
        this.f10576e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x019f  */
    @Override // l7.w
    public final void a(e0 e0Var) {
        JSONArray jSONArrayOptJSONArray;
        JSONException jSONException;
        switch (this.f10572a) {
            case 0:
                AppEventQueue.buildRequestForSession$lambda$4((AccessTokenAppIdPair) this.f10573b, (b0) this.f10574c, (SessionEventsState) this.f10575d, (FlushStatistics) this.f10576e, e0Var);
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f10573b;
                HashSet hashSet = (HashSet) this.f10574c;
                HashSet hashSet2 = (HashSet) this.f10575d;
                HashSet hashSet3 = (HashSet) this.f10576e;
                JSONObject jSONObject = e0Var.f45112d;
                if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String status = jSONObjectOptJSONObject.optString("status");
                            if (!q7.e0.w(strOptString) && !q7.e0.w(status)) {
                                n.e(status, "status");
                                Locale US = Locale.US;
                                n.e(US, "US");
                                String lowerCase = status.toLowerCase(US);
                                n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        } else {
                                            Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                                        }
                                    } else if (lowerCase.equals("granted")) {
                                        hashSet.add(strOptString);
                                    } else {
                                        Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                                    }
                                } else if (lowerCase.equals("expired")) {
                                    hashSet3.add(strOptString);
                                } else {
                                    Log.w("AccessTokenManager", "Unexpected status: ".concat(lowerCase));
                                }
                            }
                        }
                    }
                }
                break;
            default:
                final h hVar = (h) this.f10573b;
                final String str = (String) this.f10574c;
                final Date date = (Date) this.f10575d;
                final Date date2 = (Date) this.f10576e;
                if (!hVar.f54240u.get()) {
                    q qVar = e0Var.f45111c;
                    if (qVar != null) {
                        l7.n nVar = qVar.f45210i;
                        if (nVar == null) {
                            nVar = new l7.n();
                        }
                        hVar.J(nVar);
                    } else {
                        try {
                            JSONObject jSONObject2 = e0Var.f45110b;
                            if (jSONObject2 == null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                } catch (JSONException e10) {
                                    jSONException = e10;
                                    hVar.J(new l7.n(jSONException));
                                }
                            }
                            final String string = jSONObject2.getString("id");
                            n.e(string, "jsonObject.getString(\"id\")");
                            final t tVarF = un.a.f(jSONObject2);
                            String string2 = jSONObject2.getString("name");
                            n.e(string2, "jsonObject.getString(\"name\")");
                            f fVar = hVar.f54243x;
                            if (fVar != null) {
                                p7.b.a(fVar.f54231b);
                            }
                            r rVarB = u.b(s.c());
                            if (!n.a(rVarB != null ? Boolean.valueOf(rVarB.f48759c.contains(q7.b0.f48667d)) : null, Boolean.TRUE) || hVar.f54245z) {
                                hVar.G(string, tVarF, str, date, date2);
                            } else {
                                hVar.f54245z = true;
                                String string3 = hVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                                n.e(string3, "resources.getString(R.st…login_confirmation_title)");
                                String string4 = hVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                                n.e(string4, "resources.getString(R.st…confirmation_continue_as)");
                                String string5 = hVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                                n.e(string5, "resources.getString(R.st…ogin_confirmation_cancel)");
                                String str2 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                                AlertDialog.Builder builder = new AlertDialog.Builder(hVar.getContext());
                                builder.setMessage(string3).setCancelable(true).setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: y7.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                        h this$0 = hVar;
                                        kotlin.jvm.internal.n.f(this$0, "this$0");
                                        String userId = string;
                                        kotlin.jvm.internal.n.f(userId, "$userId");
                                        t1.t permissions = tVarF;
                                        kotlin.jvm.internal.n.f(permissions, "$permissions");
                                        String accessToken = str;
                                        kotlin.jvm.internal.n.f(accessToken, "$accessToken");
                                        this$0.G(userId, permissions, accessToken, date, date2);
                                    }
                                }).setPositiveButton(string5, new e(hVar, 0));
                                builder.create().show();
                            }
                        } catch (JSONException e11) {
                            jSONException = e11;
                        }
                    }
                    break;
                }
                break;
        }
    }
}

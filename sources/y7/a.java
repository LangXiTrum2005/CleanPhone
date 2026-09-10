package y7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u {
    public static final Parcelable.Creator<a> CREATOR = new l7.h(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f54213j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f54214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f54215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f54216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f54217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l7.g f54218i;

    public a(Parcel parcel) {
        super(parcel, 1);
        this.f54217h = "custom_tab";
        this.f54218i = l7.g.f45126e;
        this.f54215f = parcel.readString();
        this.f54216g = q7.f.h(super.f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y7.t
    public final String e() {
        return this.f54217h;
    }

    @Override // y7.t
    public final String f() {
        return this.f54216g;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: JSONException -> 0x0070, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0070, blocks: (B:24:0x0056, B:27:0x005f), top: B:69:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // y7.u, y7.t
    public final boolean h(int i10, int i11, Intent intent) {
        n nVar;
        String stringExtra;
        Bundle bundleE;
        String string;
        String string2;
        String string3;
        int i12;
        String string4;
        boolean zA = false;
        if (intent != null) {
            int i13 = CustomTabMainActivity.f10565c;
            if (!intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                if (i10 == 1 && (nVar = d().f54300g) != null) {
                    if (i11 == -1) {
                        s(nVar, null, new l7.p());
                        return false;
                    }
                    if (intent != null) {
                        int i14 = CustomTabMainActivity.f10565c;
                        stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
                    } else {
                        stringExtra = null;
                    }
                    if (stringExtra != null && (an.p.p0(stringExtra, "fbconnect://cct.", false) || an.p.p0(stringExtra, super.f(), false))) {
                        Uri uri = Uri.parse(stringExtra);
                        bundleE = e0.E(uri.getQuery());
                        bundleE.putAll(e0.E(uri.getFragment()));
                        try {
                            string4 = bundleE.getString("state");
                            if (string4 == null) {
                                zA = kotlin.jvm.internal.n.a(new JSONObject(string4).getString("7_challenge"), this.f54215f);
                            }
                        } catch (JSONException unused) {
                        }
                        if (zA) {
                            string = bundleE.getString("error");
                            if (string == null) {
                                string = bundleE.getString("error_type");
                            }
                            string2 = bundleE.getString("error_msg");
                            if (string2 == null) {
                                string2 = bundleE.getString("error_message");
                            }
                            if (string2 == null) {
                                string2 = bundleE.getString("error_description");
                            }
                            string3 = bundleE.getString("error_code");
                            if (string3 != null) {
                                try {
                                    i12 = Integer.parseInt(string3);
                                } catch (NumberFormatException unused2) {
                                    i12 = -1;
                                }
                            } else {
                                i12 = -1;
                            }
                            if (!e0.w(string) && e0.w(string2) && i12 == -1) {
                                if (bundleE.containsKey("access_token")) {
                                    s(nVar, bundleE, null);
                                } else {
                                    l7.s.d().execute(new ld.f(this, nVar, bundleE, 11));
                                }
                            } else if ((string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || i12 == 4201) {
                                s(nVar, null, new l7.p());
                            } else {
                                s(nVar, null, new l7.u(new l7.q(i12, string, string2), string2));
                            }
                        } else {
                            s(nVar, null, new l7.n("Invalid state parameter"));
                        }
                    }
                    return true;
                }
            }
        } else if (i10 == 1) {
            if (i11 == -1) {
                s(nVar, null, new l7.p());
                return false;
            }
            if (intent != null) {
                int i15 = CustomTabMainActivity.f10565c;
                stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                Uri uri2 = Uri.parse(stringExtra);
                bundleE = e0.E(uri2.getQuery());
                bundleE.putAll(e0.E(uri2.getFragment()));
                string4 = bundleE.getString("state");
                if (string4 == null) {
                    zA = kotlin.jvm.internal.n.a(new JSONObject(string4).getString("7_challenge"), this.f54215f);
                }
                if (zA) {
                    s(nVar, null, new l7.n("Invalid state parameter"));
                } else {
                    string = bundleE.getString("error");
                    if (string == null) {
                        string = bundleE.getString("error_type");
                    }
                    string2 = bundleE.getString("error_msg");
                    if (string2 == null) {
                        string2 = bundleE.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = bundleE.getString("error_description");
                    }
                    string3 = bundleE.getString("error_code");
                    if (string3 != null) {
                        i12 = Integer.parseInt(string3);
                    } else {
                        i12 = -1;
                    }
                    if (!e0.w(string)) {
                        if (string == null) {
                            s(nVar, null, new l7.u(new l7.q(i12, string, string2), string2));
                        } else {
                            s(nVar, null, new l7.u(new l7.q(i12, string, string2), string2));
                        }
                    } else if (string == null) {
                        s(nVar, null, new l7.u(new l7.q(i12, string, string2), string2));
                    } else {
                        s(nVar, null, new l7.u(new l7.q(i12, string, string2), string2));
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // y7.t
    public final void j(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f54215f);
    }

    @Override // y7.t
    public final int k(n request) {
        kotlin.jvm.internal.n.f(request, "request");
        int i10 = request.f54277n;
        p pVarD = d();
        if (this.f54216g.length() == 0) {
            return 0;
        }
        Bundle bundleN = n(request);
        l(bundleN, request);
        if (f54213j) {
            bundleN.putString("cct_over_app_switch", "1");
        }
        if (l7.s.f45223m) {
            if (i10 == 2) {
                ReentrantLock reentrantLock = b.f54219b;
                e0.a(q7.f.f(), bundleN, "oauth/authorize");
                ReentrantLock reentrantLock2 = b.f54219b;
                reentrantLock2.lock();
                reentrantLock2.unlock();
                reentrantLock2.lock();
                reentrantLock2.unlock();
            } else {
                ReentrantLock reentrantLock3 = b.f54219b;
                e0.a(q7.f.e(), bundleN, l7.s.e() + "/dialog/oauth");
                ReentrantLock reentrantLock4 = b.f54219b;
                reentrantLock4.lock();
                reentrantLock4.unlock();
                reentrantLock4.lock();
                reentrantLock4.unlock();
            }
        }
        FragmentActivity fragmentActivityE = pVarD.e();
        if (fragmentActivityE == null) {
            return 0;
        }
        Intent intent = new Intent(fragmentActivityE, (Class<?>) CustomTabMainActivity.class);
        int i11 = CustomTabMainActivity.f10565c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", bundleN);
        String strC = this.f54214e;
        if (strC == null) {
            strC = q7.f.c();
            this.f54214e = strC;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", strC);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", wi.d.e(i10));
        q qVar = pVarD.f54296c;
        if (qVar != null) {
            qVar.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // y7.u
    public final void l(Bundle bundle, n request) {
        kotlin.jvm.internal.n.f(request, "request");
        String str = request.f54270f;
        super.l(bundle, request);
        String strConcat = request.f54269e;
        if (strConcat == null || strConcat.length() == 0) {
            strConcat = (str == null || str.length() == 0) ? this.f54216g : "intent://".concat(str);
        }
        bundle.putString("redirect_uri", strConcat);
    }

    @Override // y7.u
    public final String o() {
        return "chrome_custom_tab";
    }

    @Override // y7.u
    public final l7.g p() {
        return this.f54218i;
    }

    @Override // y7.t, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.f(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f54215f);
    }

    public a(p pVar) {
        this.f54315b = pVar;
        this.f54217h = "custom_tab";
        this.f54218i = l7.g.f45126e;
        String string = new BigInteger(100, new SecureRandom()).toString(32);
        kotlin.jvm.internal.n.e(string, "BigInteger(length * 5, r).toString(32)");
        this.f54215f = string;
        f54213j = false;
        this.f54216g = q7.f.h(super.f());
    }
}

package d0;

import ad.d;
import am.m;
import an.p;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.media.MediaCodecInfo;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import cc.a2;
import cl.x0;
import cl.z;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.auth.a0;
import com.google.android.gms.internal.auth.x;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.l4;
import com.google.android.gms.internal.play_billing.m4;
import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.X3;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import go.k;
import i1.d0;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import lo.n;
import mb.g;
import mb.i;
import o8.f;
import oa.e0;
import oa.j0;
import oa.n1;
import pm.c0;
import pm.y;
import pm.y0;
import qk.i0;
import r1.q;
import r8.o;
import tk.i1;
import tk.v1;
import xh.e;
import xi.l;
import xj.v;
import y1.s;
import y1.u;
import zc.h;
import zk.h0;
import zk.j;
import zk.p0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b f38616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ArrayList f38617b;

    public static long A(int i10, byte[] bArr) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    public static void B(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                qb.b bVar = (qb.b) g.e().c(qb.b.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (bVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    qb.c cVar = (qb.c) bVar;
                    if (rb.a.a("fcm") && rb.a.c("fcm", "_ln")) {
                        c8 c8Var = cVar.f48930a.f24514a;
                        c8Var.c(new l7(c8Var, "fcm", "_ln", (Object) string, true));
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString(Constants.MEDIUM, "notification");
                    bundle2.putString(MBInterstitialActivity.INTENT_CAMAPIGN, string);
                    cVar.a("fcm", "_cmp", bundle2);
                } else {
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        D(bundle, "_no");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0196  */
    /* JADX WARN: Code duplicated, block: B:108:0x019f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[PHI: r7
  0x00db: PHI (r7v22 java.lang.String) = (r7v21 java.lang.String), (r7v34 java.lang.String) binds: [B:44:0x00c3, B:48:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0165  */
    public static void C(Intent intent) {
        int iIntValue;
        int i10;
        String string;
        ad.b bVar;
        String string2;
        byte b10;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j10;
        g gVarE;
        i iVar;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (M(intent)) {
            D(intent.getExtras(), "_nr");
        }
        int i11 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : e()) {
            f fVar = (f) FirebaseMessaging.f24673o.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            int i12 = 1;
            d dVar = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            g gVarE2 = g.e();
                            Object obj2 = uc.c.f51984m;
                            string = (String) Tasks.await(((uc.c) gVarE2.c(uc.d.class)).c());
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    String str10 = string;
                    g gVarE3 = g.e();
                    gVarE3.a();
                    String packageName = gVarE3.f45928a.getPackageName();
                    if (e.l(extras)) {
                        bVar = ad.b.DISPLAY_NOTIFICATION;
                    } else {
                        bVar = ad.b.DATA_MESSAGE;
                    }
                    ad.b bVar2 = bVar;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if (Constants.HIGH.equals(string2)) {
                            b10 = 1;
                        } else if (Constants.NORMAL.equals(string2)) {
                            b10 = 2;
                        } else {
                            b10 = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        b10 = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if (Constants.HIGH.equals(string2)) {
                            b10 = 1;
                        } else if (Constants.NORMAL.equals(string2)) {
                            b10 = 2;
                        } else {
                            b10 = 0;
                        }
                    }
                    if (b10 == 2) {
                        i11 = 5;
                    } else if (b10 == 1) {
                        i11 = 10;
                    }
                    int i13 = i11;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e11) {
                            Log.w("FirebaseMessaging", "error parsing project number", e11);
                            gVarE = g.e();
                            iVar = gVarE.f45930c;
                            gVarE.a();
                            str6 = iVar.f45947e;
                            if (str6 != null) {
                                try {
                                    j10 = Long.parseLong(str6);
                                } catch (NumberFormatException e12) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                                    gVarE.a();
                                    str7 = iVar.f45944b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j10 = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j10 = 0;
                                            } else {
                                                try {
                                                    j10 = Long.parseLong(str8);
                                                } catch (NumberFormatException e13) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                                    j10 = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j10 = Long.parseLong(str7);
                                        } catch (NumberFormatException e14) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                            j10 = 0;
                                        }
                                    }
                                }
                            } else {
                                gVarE.a();
                                str7 = iVar.f45944b;
                                if (str7.startsWith("1:")) {
                                    j10 = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j10 = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j10 = 0;
                                        } else {
                                            j10 = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        gVarE = g.e();
                        iVar = gVarE.f45930c;
                        gVarE.a();
                        str6 = iVar.f45947e;
                        if (str6 != null) {
                            j10 = Long.parseLong(str6);
                        } else {
                            gVarE.a();
                            str7 = iVar.f45944b;
                            if (str7.startsWith("1:")) {
                                j10 = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j10 = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j10 = 0;
                                    } else {
                                        j10 = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    dVar = new d(j10 > 0 ? j10 : 0L, str, str10, bVar2, packageName, str3, i13, i10, str2, str4, str5);
                }
                i10 = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    g gVarE4 = g.e();
                    Object obj3 = uc.c.f51984m;
                    string = (String) Tasks.await(((uc.c) gVarE4.c(uc.d.class)).c());
                }
                String str11 = string;
                g gVarE5 = g.e();
                gVarE5.a();
                String packageName2 = gVarE5.f45928a.getPackageName();
                if (e.l(extras)) {
                    bVar = ad.b.DISPLAY_NOTIFICATION;
                } else {
                    bVar = ad.b.DATA_MESSAGE;
                }
                ad.b bVar3 = bVar;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if (Constants.HIGH.equals(string2)) {
                        b10 = 1;
                    } else if (Constants.NORMAL.equals(string2)) {
                        b10 = 2;
                    } else {
                        b10 = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    b10 = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if (Constants.HIGH.equals(string2)) {
                        b10 = 1;
                    } else if (Constants.NORMAL.equals(string2)) {
                        b10 = 2;
                    } else {
                        b10 = 0;
                    }
                }
                if (b10 == 2) {
                    i11 = 5;
                } else if (b10 == 1) {
                    i11 = 10;
                }
                int i14 = i11;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j10 = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    gVarE = g.e();
                    iVar = gVarE.f45930c;
                    gVarE.a();
                    str6 = iVar.f45947e;
                    if (str6 != null) {
                        j10 = Long.parseLong(str6);
                    } else {
                        gVarE.a();
                        str7 = iVar.f45944b;
                        if (str7.startsWith("1:")) {
                            j10 = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j10 = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j10 = 0;
                                } else {
                                    j10 = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                dVar = new d(j10 > 0 ? j10 : 0L, str, str11, bVar3, packageName2, str3, i14, i10, str2, str4, str5);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new o8.c("proto"), new h(i12)).y(new o8.a(new ad.e(dVar), o8.d.f47211a, new o8.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new q(4));
            } catch (RuntimeException e15) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
            }
        }
    }

    public static void D(Bundle bundle, String str) {
        try {
            g.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = e.l(bundle) ? X3.i.f27786d : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            qb.b bVar = (qb.b) g.e().c(qb.b.class);
            if (bVar != null) {
                ((qb.c) bVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static hh.a E(File file) {
        v vVar = v.f53866a;
        try {
            if (!file.exists()) {
                return new hh.a(vVar);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                og.b bVar = new og.b(new n(q1.B(fileInputStream)));
                ArrayList arrayList = new ArrayList();
                bVar.n();
                while (bVar.s()) {
                    if (kotlin.jvm.internal.n.a(bVar.x(), "folders")) {
                        bVar.k();
                        while (bVar.s()) {
                            try {
                                arrayList.add(i0.b0(bVar));
                            } catch (Exception e10) {
                                Log.e("AssetFolderStorage", "Folder Parsing: Error parsing individual folder", e10);
                                bVar.F();
                            }
                        }
                        bVar.q();
                    } else {
                        bVar.F();
                    }
                }
                bVar.r();
                hh.a aVar = new hh.a(arrayList);
                fileInputStream.close();
                return aVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Log.e("ProjectLogger", "JSON Parsing: Error parsing folders JSON", e11);
            return new hh.a(vVar);
        }
    }

    public static final String F(yl.f fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        String strB = fVar.b();
        kotlin.jvm.internal.n.e(strB, "asString()");
        if (!m.f3754a.contains(strB)) {
            for (int i10 = 0; i10 < strB.length(); i10++) {
                char cCharAt = strB.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strB2 = fVar.b();
            kotlin.jvm.internal.n.e(strB2, "asString()");
            return strB2;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB3 = fVar.b();
        kotlin.jvm.internal.n.e(strB3, "asString()");
        sb2.append("`".concat(strB3));
        sb2.append('`');
        return sb2.toString();
    }

    public static final String G(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yl.f fVar = (yl.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(F(fVar));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String H(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        kotlin.jvm.internal.n.f(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.n.f(lowerPrefix, "lowerPrefix");
        kotlin.jvm.internal.n.f(upperRendered, "upperRendered");
        kotlin.jvm.internal.n.f(upperPrefix, "upperPrefix");
        kotlin.jvm.internal.n.f(foldedPrefix, "foldedPrefix");
        if (!p.p0(lowerRendered, lowerPrefix, false) || !p.p0(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!S(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static void I(Context context, String str) {
        context.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = ((ArrayList) u(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    public static q3.f J(q3.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (q3.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                q3.f fVar2 = new q3.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((q3.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((q3.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((q3.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }

    public static void K(Context context, ArrayList arrayList) {
        context.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).getClass();
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (a aVar : arrayList) {
            aVar.getClass();
            ShortcutInfo.Builder intents = new ShortcutInfo.Builder(aVar.f38610a, aVar.f38611b).setShortLabel(aVar.f38613d).setIntents(aVar.f38612c);
            IconCompat iconCompat = aVar.f38615f;
            if (iconCompat != null) {
                intents.setIcon(iconCompat.g());
            }
            if (!TextUtils.isEmpty(aVar.f38614e)) {
                intents.setLongLabel(aVar.f38614e);
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setDisabledMessage(null);
            }
            intents.setRank(0);
            int i10 = Build.VERSION.SDK_INT;
            intents.setLongLived(false);
            if (i10 >= 33) {
                b6.d.n(intents);
            }
            arrayList3.add(intents.build());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList3)) {
            v(context).getClass();
            v(context).getClass();
            Iterator it2 = ((ArrayList) u(context)).iterator();
            if (it2.hasNext()) {
                throw f2.j(it2);
            }
        }
    }

    public static void L(xi.f binaryMessenger, final tj.o oVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        l hVar = (oVar == null || (nfVar = oVar.f50873a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", hVar, obj);
        if (oVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.b0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    int i11 = i10;
                    o oVar2 = oVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                oVar2.getClass();
                                listQ = j1.f.C(dName.getCName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                oVar2.getClass();
                                listQ2 = j1.f.C(dName2.getDName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                oVar2.getClass();
                                listQ3 = j1.f.C(dName3.getOName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                oVar2.getClass();
                                listQ4 = j1.f.C(dName4.getUName());
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", hVar, obj);
        if (oVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.b0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    int i12 = i11;
                    o oVar2 = oVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                oVar2.getClass();
                                listQ = j1.f.C(dName.getCName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                oVar2.getClass();
                                listQ2 = j1.f.C(dName2.getDName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                oVar2.getClass();
                                listQ3 = j1.f.C(dName3.getOName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                oVar2.getClass();
                                listQ4 = j1.f.C(dName4.getUName());
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", hVar, obj);
        if (oVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.b0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    int i13 = i12;
                    o oVar2 = oVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                oVar2.getClass();
                                listQ = j1.f.C(dName.getCName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                oVar2.getClass();
                                listQ2 = j1.f.C(dName2.getDName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                oVar2.getClass();
                                listQ3 = j1.f.C(dName3.getOName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                oVar2.getClass();
                                listQ4 = j1.f.C(dName4.getUName());
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", hVar, obj);
        if (oVar == null) {
            gVar4.C(null);
        } else {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: tj.b0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    int i14 = i13;
                    o oVar2 = oVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                oVar2.getClass();
                                listQ = j1.f.C(dName.getCName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                oVar2.getClass();
                                listQ2 = j1.f.C(dName2.getDName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                oVar2.getClass();
                                listQ3 = j1.f.C(dName3.getOName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                oVar2.getClass();
                                listQ4 = j1.f.C(dName4.getUName());
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                    }
                }
            });
        }
    }

    public static boolean M(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void N(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static final long O(int i10, bn.c unit) {
        kotlin.jvm.internal.n.f(unit, "unit");
        return unit.compareTo(bn.c.SECONDS) <= 0 ? g(go.c.d(i10, unit, bn.c.NANOSECONDS)) : P(i10, unit);
    }

    public static final long P(long j10, bn.c unit) {
        kotlin.jvm.internal.n.f(unit, "unit");
        bn.c cVar = bn.c.NANOSECONDS;
        long jD = go.c.d(4611686018426999999L, cVar, unit);
        return ((-jD) > j10 || j10 > jD) ? f(com.bumptech.glide.d.n(go.c.c(j10, unit, bn.c.MILLISECONDS))) : g(go.c.d(j10, unit, cVar));
    }

    public static final Class Q(y yVar) {
        c0 c0VarF;
        kotlin.jvm.internal.n.f(yVar, "<this>");
        Class clsR = R(yVar.P().e());
        if (clsR == null) {
            return null;
        }
        if (y0.e(yVar) && ((c0VarF = bm.g.f(yVar)) == null || y0.e(c0VarF) || wk.h.F(c0VarF))) {
            return null;
        }
        return clsR;
    }

    public static final Class R(j jVar) {
        if (!(jVar instanceof zk.e) || !bm.g.b(jVar)) {
            return null;
        }
        zk.e eVar = (zk.e) jVar;
        Class clsJ = v1.j(eVar);
        if (clsJ != null) {
            return clsJ;
        }
        throw new cn.c0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + fm.e.f((zk.g) jVar) + ')', 3);
    }

    public static final boolean S(String lower, String upper) {
        kotlin.jvm.internal.n.f(lower, "lower");
        kotlin.jvm.internal.n.f(upper, "upper");
        if (lower.equals(p.n0(upper, "?", ""))) {
            return true;
        }
        if (p.h0(upper, "?", false) && kotlin.jvm.internal.n.a(lower.concat("?"), upper)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(lower);
        sb2.append(")?");
        return kotlin.jvm.internal.n.a(sb2.toString(), upper);
    }

    public static ArrayList U(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        if (th2 instanceof jj.e) {
            jj.e eVar = (jj.e) th2;
            arrayList.add(eVar.f43938a);
            arrayList.add(eVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static x V(x xVar) {
        if ((xVar instanceof a0) || (xVar instanceof com.google.android.gms.internal.auth.y)) {
            return xVar;
        }
        if (xVar instanceof Serializable) {
            return new com.google.android.gms.internal.auth.y(xVar);
        }
        a0 a0Var = new a0();
        a0Var.f22791a = xVar;
        return a0Var;
    }

    public static m4 W(k4 k4Var) {
        j4 j4Var = new j4();
        j4Var.f24386c = new n4();
        m4 m4Var = new m4(j4Var);
        j4Var.f24385b = m4Var;
        j4Var.f24384a = k4Var.getClass();
        try {
            j4Var.f24384a = k4Var.zza(j4Var);
            return m4Var;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.f2 f2Var = new com.google.android.gms.internal.play_billing.f2(e10);
            a2 a2Var = i4.f24292f;
            l4 l4Var = m4Var.f24427b;
            if (a2Var.T(l4Var, null, f2Var)) {
                i4.b(l4Var);
            }
            return m4Var;
        }
    }

    public static void a(long j10, lo.e eVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        ArrayList arrayList3;
        long j11;
        int i15;
        int i16 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((lo.h) arrayList4.get(i17)).d() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        lo.h hVar = (lo.h) arrayList.get(i11);
        lo.h hVar2 = (lo.h) arrayList4.get(i12 - 1);
        if (i16 == hVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i18 = i11 + 1;
            lo.h hVar3 = (lo.h) arrayList4.get(i18);
            i13 = i18;
            i14 = iIntValue;
            hVar = hVar3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (hVar.i(i16) == hVar2.i(i16)) {
            int iMin = Math.min(hVar.d(), hVar2.d());
            int i19 = 0;
            for (int i20 = i16; i20 < iMin && hVar.i(i20) == hVar2.i(i20); i20++) {
                i19++;
            }
            long j12 = 4;
            long j13 = (eVar.f45637b / j12) + j10 + ((long) 2) + ((long) i19) + 1;
            eVar.s(-i19);
            eVar.s(i14);
            int i21 = i16 + i19;
            while (i16 < i21) {
                eVar.s(hVar.i(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i21 != ((lo.h) arrayList4.get(i13)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                eVar.s(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                lo.e eVar2 = new lo.e();
                eVar.s(((int) ((eVar2.f45637b / j12) + j13)) * (-1));
                a(j13, eVar2, i21, arrayList4, i13, i12, arrayList5);
                eVar.p(eVar2);
                return;
            }
        }
        int i22 = 1;
        for (int i23 = i13 + 1; i23 < i12; i23++) {
            if (((lo.h) arrayList4.get(i23 - 1)).i(i16) != ((lo.h) arrayList4.get(i23)).i(i16)) {
                i22++;
            }
        }
        long j14 = 4;
        long j15 = (eVar.f45637b / j14) + j10 + ((long) 2) + ((long) (i22 * 2));
        eVar.s(i22);
        eVar.s(i14);
        for (int i24 = i13; i24 < i12; i24++) {
            int i25 = ((lo.h) arrayList4.get(i24)).i(i16);
            if (i24 == i13 || i25 != ((lo.h) arrayList4.get(i24 - 1)).i(i16)) {
                eVar.s(i25 & 255);
            }
        }
        lo.e eVar3 = new lo.e();
        int i26 = i13;
        while (i26 < i12) {
            byte bI = ((lo.h) arrayList4.get(i26)).i(i16);
            int i27 = i26 + 1;
            int i28 = i27;
            while (true) {
                if (i28 >= i12) {
                    i28 = i12;
                    break;
                } else if (bI != ((lo.h) arrayList4.get(i28)).i(i16)) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i27 == i28 && i16 + 1 == ((lo.h) arrayList4.get(i26)).d()) {
                eVar.s(((Number) arrayList5.get(i26)).intValue());
                arrayList3 = arrayList5;
                j11 = j15;
                i15 = i28;
            } else {
                eVar.s(((int) ((eVar3.f45637b / j14) + j15)) * (-1));
                arrayList3 = arrayList5;
                j11 = j15;
                i15 = i28;
                a(j11, eVar3, i16 + 1, arrayList, i26, i15, arrayList3);
                arrayList4 = arrayList;
            }
            j15 = j11;
            i26 = i15;
            arrayList5 = arrayList3;
        }
        eVar.p(eVar3);
    }

    public static final Object b(Object obj, zk.c cVar) {
        y yVarN;
        Class clsQ;
        return (((cVar instanceof h0) && bm.g.d((p0) cVar)) || (yVarN = n(cVar)) == null || (clsQ = Q(yVarN)) == null) ? obj : x(clsQ, cVar).invoke(obj, null);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jA = A(0, bArr) & 67108863;
        int i10 = 3;
        long jA2 = (A(3, bArr) >> 2) & 67108611;
        long jA3 = (A(6, bArr) >> 4) & 67092735;
        long jA4 = (A(9, bArr) >> 6) & 66076671;
        long jA5 = (A(12, bArr) >> 8) & 1048575;
        long j10 = jA2 * 5;
        long j11 = jA3 * 5;
        long j12 = jA4 * 5;
        long j13 = jA5 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        int i11 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jA6 = j18 + (A(0, bArr3) & 67108863);
            long jA7 = j14 + ((A(i10, bArr3) >> 2) & 67108863);
            long jA8 = j15 + ((A(6, bArr3) >> 4) & 67108863);
            long jA9 = j16 + ((A(9, bArr3) >> 6) & 67108863);
            long j19 = jA2;
            long jA10 = j17 + (((A(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j20 = (jA10 * j10) + (jA9 * j11) + (jA8 * j12) + (jA7 * j13) + (jA6 * jA);
            long j21 = (jA10 * j11) + (jA9 * j12) + (jA8 * j13) + (jA7 * jA) + (jA6 * j19);
            long j22 = (jA10 * j12) + (jA9 * j13) + (jA8 * jA) + (jA7 * j19) + (jA6 * jA3);
            long j23 = (jA10 * j13) + (jA9 * jA) + (jA8 * j19) + (jA7 * jA3) + (jA6 * jA4);
            long j24 = jA9 * j19;
            long j25 = jA10 * jA;
            long j26 = j21 + (j20 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j23 + (j27 >> 26);
            long j29 = j25 + j24 + (jA8 * jA3) + (jA7 * jA4) + (jA6 * jA5) + (j28 >> 26);
            long j30 = j29 >> 26;
            j17 = j29 & 67108863;
            long j31 = (j30 * 5) + (j20 & 67108863);
            i11 += 16;
            j15 = j27 & 67108863;
            j16 = j28 & 67108863;
            j18 = j31 & 67108863;
            j14 = (j26 & 67108863) + (j31 >> 26);
            jA2 = j19;
            i10 = 3;
        }
        long j32 = j15 + (j14 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j16 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j17 + (j34 >> 26);
        long j37 = j36 & 67108863;
        long j38 = ((j36 >> 26) * 5) + j18;
        long j39 = j38 >> 26;
        long j40 = j38 & 67108863;
        long j41 = (j14 & 67108863) + j39;
        long j42 = j40 + 5;
        long j43 = j42 & 67108863;
        long j44 = j41 + (j42 >> 26);
        long j45 = j33 + (j44 >> 26);
        long j46 = j35 + (j45 >> 26);
        long j47 = j46 & 67108863;
        long j48 = (j37 + (j46 >> 26)) - 67108864;
        long j49 = j48 >> 63;
        long j50 = j40 & j49;
        long j51 = j41 & j49;
        long j52 = j33 & j49;
        long j53 = j35 & j49;
        long j54 = j37 & j49;
        long j55 = ~j49;
        long j56 = j51 | (j44 & 67108863 & j55);
        long j57 = j52 | (j45 & 67108863 & j55);
        long j58 = j53 | (j47 & j55);
        long j59 = (j50 | (j43 & j55) | (j56 << 26)) & 4294967295L;
        long j60 = ((j56 >> 6) | (j57 << 20)) & 4294967295L;
        long j61 = ((j57 >> 12) | (j58 << 14)) & 4294967295L;
        long j62 = ((j58 >> 18) | ((j54 | (j48 & j55)) << 8)) & 4294967295L;
        long jA11 = A(16, bArr) + j59;
        long j63 = jA11 & 4294967295L;
        long jA12 = A(20, bArr) + j60 + (jA11 >> 32);
        long jA13 = A(24, bArr) + j61 + (jA12 >> 32);
        long jA14 = (A(28, bArr) + j62 + (jA13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        N(j63, bArr4, 0);
        N(jA12 & 4294967295L, bArr4, 4);
        N(jA13 & 4294967295L, bArr4, 8);
        N(jA14, bArr4, 12);
        return bArr4;
    }

    public static final uk.f d(uk.f fVar, zk.c descriptor, boolean z10) {
        y returnType;
        y yVarN;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        if (!bm.g.a(descriptor)) {
            List listB = descriptor.B();
            kotlin.jvm.internal.n.e(listB, "descriptor.valueParameters");
            List list = listB;
            if ((list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? fVar : fVar;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                y type = ((x0) it.next()).getType();
                kotlin.jvm.internal.n.e(type, "it.type");
                if (bm.g.c(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !bm.g.c(returnType)) && ((fVar instanceof uk.e) || (yVarN = n(descriptor)) == null || !bm.g.c(yVarN))) {
            }
        }
        return new uk.v(fVar, descriptor, z10);
    }

    public static boolean e() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g.e();
            g gVarE = g.e();
            gVarE.a();
            Context context = gVarE.f45928a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final long f(long j10) {
        long j11 = (j10 << 1) + 1;
        int i10 = bn.a.f5743d;
        int i11 = bn.b.f5745a;
        return j11;
    }

    public static final long g(long j10) {
        long j11 = j10 << 1;
        int i10 = bn.a.f5743d;
        int i11 = bn.b.f5745a;
        return j11;
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int i(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            i1.o oVar = new i1.o();
            oVar.f42600m = d0.n("video/avc");
            i1.p pVar = new i1.p(oVar);
            String str = pVar.f42643n;
            if (str != null) {
                List listE = u.e(str, z10, false);
                String strC = u.c(pVar);
                Iterable iterableE = strC == null ? n1.f47281e : u.e(strC, z10, false);
                e0 e0VarU = j0.u();
                e0VarU.d(listE);
                e0VarU.d(iterableE);
                n1 n1VarG = e0VarU.g();
                for (int i10 = 0; i10 < n1VarG.f47283d; i10++) {
                    if (((y1.m) n1VarG.get(i10)).f54130d != null && (videoCapabilities = ((y1.m) n1VarG.get(i10)).f54130d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                            if (supportedPerformancePoints.get(i11).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (s unused) {
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    public static final fl.d j(Annotation[] annotationArr, yl.c fqName) {
        kotlin.jvm.internal.n.f(annotationArr, "<this>");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (fl.c.a(p(l(annotation))).b().equals(fqName)) {
                if (annotation != null) {
                    return new fl.d(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new fl.d(annotation);
        }
        return null;
    }

    public static rl.o k(t9.e eVar) {
        if (eVar instanceof xl.e) {
            xl.e eVar2 = (xl.e) eVar;
            String name = eVar2.f53900d;
            String desc = eVar2.f53901e;
            kotlin.jvm.internal.n.f(name, "name");
            kotlin.jvm.internal.n.f(desc, "desc");
            return new rl.o(name.concat(desc));
        }
        if (!(eVar instanceof xl.d)) {
            throw new aa.b((byte) 0, 20);
        }
        xl.d dVar = (xl.d) eVar;
        String name2 = dVar.f53898d;
        String desc2 = dVar.f53899e;
        kotlin.jvm.internal.n.f(name2, "name");
        kotlin.jvm.internal.n.f(desc2, "desc");
        return new rl.o(name2 + '#' + desc2);
    }

    public static final qk.d l(Annotation annotation) {
        kotlin.jvm.internal.n.f(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        kotlin.jvm.internal.n.e(clsAnnotationType, "annotationType(...)");
        return s(clsAnnotationType);
    }

    public static final ArrayList m(Annotation[] annotationArr) {
        kotlin.jvm.internal.n.f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new fl.d(annotation));
        }
        return arrayList;
    }

    public static final y n(zk.c cVar) {
        z zVarJ = cVar.J();
        z zVarG = cVar.G();
        if (zVarJ != null) {
            return zVarJ.getType();
        }
        if (zVarG != null) {
            if (cVar instanceof zk.i) {
                return zVarG.getType();
            }
            j jVarE = cVar.e();
            zk.e eVar = jVarE instanceof zk.e ? (zk.e) jVarE : null;
            if (eVar != null) {
                return eVar.g();
            }
        }
        return null;
    }

    public static final Class p(qk.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.e) dVar).a();
        kotlin.jvm.internal.n.d(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static final Class q(qk.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.e) dVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals(Constants.LONG) ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsA : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class r(qk.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.e) dVar).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final qk.d s(Class cls) {
        kotlin.jvm.internal.n.f(cls, "<this>");
        return kotlin.jvm.internal.d0.f44761a.b(cls);
    }

    public static String t(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public static List u(Context context) {
        Bundle bundle;
        String string;
        if (f38617b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, c.class.getClassLoader()).getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (f38617b == null) {
                f38617b = arrayList;
            }
        }
        return f38617b;
    }

    public static b v(Context context) {
        if (f38616a == null) {
            try {
                f38616a = (b) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, c.class.getClassLoader()).getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f38616a == null) {
                f38616a = new b();
            }
        }
        return f38616a;
    }

    public static final Method x(Class cls, zk.c descriptor) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            kotlin.jvm.internal.n.e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new cn.c0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')', 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean z(i1 i1Var) {
        kotlin.jvm.internal.n.f(i1Var, "<this>");
        if (i1Var instanceof qk.m) {
            Field fieldF = k.F(i1Var);
            if (!(fieldF != null ? fieldF.isAccessible() : true)) {
                return false;
            }
            Method methodG = k.G(i1Var.getGetter());
            if (!(methodG != null ? methodG.isAccessible() : true)) {
                return false;
            }
            Method methodG2 = k.G(((qk.m) i1Var).getSetter());
            if (!(methodG2 != null ? methodG2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldF2 = k.F(i1Var);
            if (!(fieldF2 != null ? fieldF2.isAccessible() : true)) {
                return false;
            }
            Method methodG3 = k.G(i1Var.getGetter());
            if (!(methodG3 != null ? methodG3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public abstract void T(ArrayList arrayList);

    public abstract pk.e o();

    public abstract List w();

    public abstract long y();
}

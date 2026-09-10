package x7;

import aa.b;
import an.h;
import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.r0;
import cn.e1;
import cn.l;
import com.applovin.impl.z8;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.auth.o;
import com.google.android.gms.internal.play_billing.q1;
import com.google.crypto.tink.shaded.protobuf.p;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import eb.d0;
import eb.g0;
import eb.i0;
import eb.j0;
import en.r;
import i.d;
import i.e;
import i.f;
import i.g;
import im.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import jb.a1;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import l1.q;
import l7.s;
import n.c;
import t5.i;
import t5.j;
import t5.k;
import xj.t;
import xj.v;
import xj.w;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f53660a = true;

    public static final String A(String kid) {
        n.f(kid, "kid");
        URL url = new URL("https", "www." + s.f45228r, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        c0 c0Var = new c0();
        s.d().execute(new z8(url, c0Var, kid, reentrantLock, conditionNewCondition, 11));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) c0Var.f44760a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static ResolveInfo B(Context context) {
        n.f(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String C(g input) {
        n.f(input, "input");
        if (input instanceof e) {
            return "image/*";
        }
        if (input instanceof f) {
            return "video/*";
        }
        if (input instanceof d) {
            return null;
        }
        throw new b((byte) 0, 20);
    }

    public static final boolean D(h0 h0Var) {
        n.f(h0Var, "<this>");
        return h0Var.getGetter() == null;
    }

    public static final ym.f E(ArrayList arrayList) {
        ym.f fVar = new ym.f();
        for (Object obj : arrayList) {
            im.n nVar = (im.n) obj;
            if (nVar != null && nVar != m.f43190b) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public static Drawable F(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            c cVar = new c(context);
            cVar.f46269b = theme;
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return o.i(context, i10);
    }

    public static void G(Activity activity, Context context, boolean z10, Map map) {
        if (activity == null && context == null) {
            return;
        }
        Intent intent = new Intent(z10 ? "android.intent.action.INSERT" : "android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
        if (map != null) {
            s5.a aVarL = t9.e.l(map);
            String string = aVarL.f50129b;
            if (string.length() == 0) {
                t5.f fVar = aVarL.f50133f;
                string = h.T0(fVar.f50508a + " " + fVar.f50509b).toString();
            }
            if (string.length() > 0) {
                intent.putExtra("name", string);
            }
            if (!aVarL.f50134g.isEmpty()) {
                intent.putExtra("phone", ((i) xj.n.o0(aVarL.f50134g)).f50525a);
            }
            if (!aVarL.f50135h.isEmpty()) {
                intent.putExtra(NotificationCompat.CATEGORY_EMAIL, ((t5.c) xj.n.o0(aVarL.f50135h)).f50497a);
            }
            if (!aVarL.f50136i.isEmpty()) {
                intent.putExtra("postal", ((t5.b) xj.n.o0(aVarL.f50136i)).f50485a);
            }
            if (!aVarL.f50137j.isEmpty()) {
                intent.putExtra("company", ((t5.h) xj.n.o0(aVarL.f50137j)).f50518a);
                intent.putExtra("job_title", ((t5.h) xj.n.o0(aVarL.f50137j)).f50519b);
            }
            if (!aVarL.f50140n.isEmpty()) {
                intent.putExtra("notes", ((t5.g) xj.n.o0(aVarL.f50140n)).f50517a);
            }
        }
        intent.putExtra("finishActivityOnSaveCompleted", true);
        if (activity != null) {
            activity.startActivityForResult(intent, z10 ? s5.h.f50160f : s5.h.f50159e);
            return;
        }
        intent.setFlags(268435456);
        n.c(context);
        context.startActivity(intent);
    }

    public static void H(Activity activity, Context context, String id2, boolean z10) {
        n.f(id2, "id");
        if (activity == null && context == null) {
            return;
        }
        Uri uriWithAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, id2);
        Intent intent = new Intent(z10 ? "android.intent.action.EDIT" : "android.intent.action.VIEW");
        intent.setDataAndType(uriWithAppendedPath, "vnd.android.cursor.item/contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        if (activity != null) {
            activity.startActivityForResult(intent, z10 ? s5.h.f50158d : s5.h.f50157c);
            return;
        }
        intent.setFlags(268435456);
        n.c(context);
        context.startActivity(intent);
    }

    public static va.i I(byte[] bArr) throws GeneralSecurityException {
        try {
            a1 a1VarH = a1.H(bArr, p.a());
            eb.o oVar = eb.o.f40004b;
            lb.a aVarA = j0.a(a1VarH.D());
            d0 d0Var = new d0(0, a1VarH, aVarA);
            i0 i0Var = (i0) oVar.f40005a.get();
            i0Var.getClass();
            return !i0Var.f39993d.containsKey(new g0(d0.class, aVarA)) ? new eb.i(d0Var) : oVar.b(d0Var);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static long J(q qVar, int i10, int i11) {
        qVar.M(i10);
        if (qVar.a() < 5) {
            return C.TIME_UNSET;
        }
        int iM = qVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i11 || (iM & 32) == 0 || qVar.z() < 7 || qVar.a() < 7 || (qVar.z() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        qVar.k(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:136:0x0458. Please report as an issue. */
    public static List K(ContentResolver contentResolver, List list, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) throws IOException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String string;
        String str6;
        String str7;
        String str8;
        String string2;
        Map map;
        String str9;
        LinkedHashMap linkedHashMap;
        String str10;
        String str11;
        String string3;
        Integer numValueOf;
        Integer numValueOf2;
        Integer num;
        String str12;
        String str13;
        String str14;
        String str15;
        String string4;
        String string5;
        String str16 = "vnd.android.cursor.item/email_v2";
        String str17 = "vnd.android.cursor.item/phone_v2";
        String str18 = "mimetype";
        String str19 = "starred";
        String str20 = "display_name";
        String str21 = "contact_id";
        String str22 = "is_primary";
        String str23 = "data3";
        String str24 = "data4";
        if (list != null || z10 || z11 || z12 || !z15) {
            Object obj = "vnd.android.cursor.item/email_v2";
            String str25 = "starred";
            String str26 = "display_name";
            String str27 = "contact_id";
            ArrayList arrayListS = xj.o.S("contact_id", "mimetype", "display_name", "starred", "data1", "data1");
            String str28 = "data15";
            if (z11) {
                arrayListS.add("data15");
            }
            if (z10) {
                arrayListS.addAll(xj.o.Q("data4", "data2", "data5", "data3", "data6", "data1", "data7", "data9", "data8", "data1", "data4", "data2", "data3", "is_primary", "data1", "data2", "data3", "is_primary", "data1", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data2", "data3", "data1", "data4", "data5", "data6", "data7", "data8", "data9", "data1", "data2", "data3", "data1", "data5", "data6", "data1", "data2", "data3", "data1"));
            }
            String str29 = "account_name";
            String str30 = "account_type";
            String str31 = "raw_contact_id";
            if (z14 || !z15) {
                arrayListS.addAll(xj.o.Q("raw_contact_id", "account_type", "account_name"));
            }
            if (z13) {
                arrayListS.add("data1");
            }
            Map mapS = z13 ? s(contentResolver) : w.f53867a;
            ArrayList arrayList = new ArrayList();
            if (!z16) {
                arrayList.add("in_visible_group = 1");
            }
            String[] strArr = new String[0];
            if (list != null) {
                String strU0 = xj.n.u0(list, ",", null, null, new bh.a(19), 30);
                if (z17 || !z15) {
                    arrayList.add("raw_contact_id IN (" + strU0 + ")");
                } else {
                    arrayList.add("contact_id IN (" + strU0 + ")");
                }
                strArr = (String[]) list.toArray(new String[0]);
            } else {
                str22 = "is_primary";
                str23 = "data3";
            }
            Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, (String[]) arrayListS.toArray(new String[0]), arrayList.isEmpty() ? null : xj.n.u0(arrayList, " AND ", null, null, null, 62), strArr, null);
            ArrayList arrayList2 = new ArrayList();
            if (cursorQuery != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cursorQuery.moveToNext()) {
                    str27 = str27;
                    String strL = z15 ? L(cursorQuery, str27) : L(cursorQuery, str31);
                    if (linkedHashMap2.containsKey(strL)) {
                        str26 = str26;
                        str25 = str25;
                    } else {
                        String str32 = str26;
                        String strL2 = L(cursorQuery, str32);
                        str26 = str32;
                        String str33 = str25;
                        str25 = str33;
                        s5.a aVar = new s5.a(strL, strL2, cursorQuery.getInt(cursorQuery.getColumnIndex(str33)) == 1);
                        if (z12) {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(strL));
                            n.e(uriWithAppendedId, "withAppendedId(...)");
                            Uri uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedId, "display_photo");
                            n.e(uriWithAppendedPath, "withAppendedPath(...)");
                            try {
                                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriWithAppendedPath);
                                aVar.f50131d = inputStreamOpenInputStream != null ? no.b.E(inputStreamOpenInputStream) : null;
                            } catch (FileNotFoundException unused) {
                            }
                        }
                        linkedHashMap2.put(strL, Integer.valueOf(arrayList2.size()));
                        arrayList2.add(aVar);
                    }
                    Object obj2 = linkedHashMap2.get(strL);
                    n.c(obj2);
                    s5.a aVar2 = (s5.a) arrayList2.get(((Number) obj2).intValue());
                    String strL3 = L(cursorQuery, str18);
                    if (z11 && strL3.equals("vnd.android.cursor.item/photo")) {
                        aVar2.f50130c = cursorQuery.getBlob(cursorQuery.getColumnIndex(str28));
                    }
                    if (z10) {
                        if (z14) {
                            String strL4 = L(cursorQuery, str31);
                            String strL5 = L(cursorQuery, str30);
                            str = str18;
                            String strL6 = L(cursorQuery, str29);
                            str2 = str28;
                            Iterator it = aVar2.f50141o.iterator();
                            boolean z18 = false;
                            while (it.hasNext()) {
                                it = it;
                                t5.a aVar3 = (t5.a) it.next();
                                str29 = str29;
                                if (aVar3.f50481a.equals(strL4)) {
                                    ArrayList arrayListD0 = xj.n.D0(aVar3.f50484d, strL3);
                                    String str34 = str30;
                                    TreeSet treeSet = new TreeSet();
                                    xj.n.L0(arrayListD0, treeSet);
                                    aVar3.f50484d = xj.n.N0(treeSet);
                                    str30 = str34;
                                    z18 = true;
                                }
                            }
                            str3 = str29;
                            str4 = str30;
                            if (!z18) {
                                aVar2.f50141o = xj.n.D0(aVar2.f50141o, new t5.a(strL4, strL5, strL6, j1.f.C(strL3)));
                            }
                        } else {
                            str = str18;
                            str2 = str28;
                            str3 = str29;
                            str4 = str30;
                        }
                        String str35 = str31;
                        switch (strL3.hashCode()) {
                            case -1569536764:
                                map = mapS;
                                str9 = str24;
                                linkedHashMap = linkedHashMap2;
                                Object obj3 = obj;
                                str10 = str22;
                                str11 = str23;
                                if (strL3.equals(obj3)) {
                                    String strW = w(cursorQuery);
                                    if (!strW.equals("custom") || (string3 = cursorQuery.getString(cursorQuery.getColumnIndex(str11))) == null) {
                                        string3 = "";
                                    }
                                    aVar2.f50135h = xj.n.D0(aVar2.f50135h, new t5.c(L(cursorQuery, "data1"), strW, string3, cursorQuery.getInt(cursorQuery.getColumnIndex(str10)) == 1));
                                }
                                obj = obj3;
                                str22 = str10;
                                str23 = str11;
                                str24 = str9;
                                str17 = str17;
                                mapS = map;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                linkedHashMap2 = linkedHashMap;
                                break;
                            case -1328682538:
                                map = mapS;
                                str9 = str24;
                                linkedHashMap = linkedHashMap2;
                                str10 = str22;
                                str11 = str23;
                                if (strL3.equals("vnd.android.cursor.item/contact_event")) {
                                    String strL7 = L(cursorQuery, "data1");
                                    if (s5.h.f50155a.a(strL7)) {
                                        String strSubstring = strL7.substring(0, 4);
                                        n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strSubstring));
                                        String strSubstring2 = strL7.substring(5, 7);
                                        n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                        numValueOf2 = Integer.valueOf(Integer.parseInt(strSubstring2));
                                        String strSubstring3 = strL7.substring(8, 10);
                                        n.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                        numValueOf = Integer.valueOf(Integer.parseInt(strSubstring3));
                                        num = numValueOf3;
                                    } else {
                                        if (s5.h.f50156b.a(strL7)) {
                                            String strSubstring4 = strL7.substring(2, 4);
                                            n.e(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            Integer numValueOf4 = Integer.valueOf(Integer.parseInt(strSubstring4));
                                            String strSubstring5 = strL7.substring(5, 7);
                                            n.e(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            numValueOf = Integer.valueOf(Integer.parseInt(strSubstring5));
                                            numValueOf2 = numValueOf4;
                                        } else {
                                            numValueOf = null;
                                            numValueOf2 = null;
                                        }
                                        num = null;
                                    }
                                    if (numValueOf2 != null && numValueOf != null) {
                                        int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("data2"));
                                        if (i10 == 0) {
                                            str12 = "custom";
                                        } else if (i10 == 1) {
                                            str12 = "anniversary";
                                        } else if (i10 != 2) {
                                            str12 = i10 != 3 ? "" : "birthday";
                                        } else {
                                            str12 = "other";
                                        }
                                        if (str12.equals("custom")) {
                                            String string6 = cursorQuery.getString(cursorQuery.getColumnIndex(str11));
                                            if (string6 == null) {
                                                string6 = "";
                                            }
                                            str13 = string6;
                                        } else {
                                            str13 = "";
                                        }
                                        aVar2.f50139m = xj.n.D0(aVar2.f50139m, new t5.d(num, numValueOf2.intValue(), numValueOf.intValue(), str12, str13));
                                    }
                                }
                                str22 = str10;
                                str23 = str11;
                                str24 = str9;
                                str17 = str17;
                                mapS = map;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                linkedHashMap2 = linkedHashMap;
                                break;
                            case -1079224304:
                                map = mapS;
                                str9 = str24;
                                linkedHashMap = linkedHashMap2;
                                str10 = str22;
                                str11 = str23;
                                if (strL3.equals("vnd.android.cursor.item/name")) {
                                    aVar2.f50133f = new t5.f(L(cursorQuery, "data2"), L(cursorQuery, str11), L(cursorQuery, "data5"), L(cursorQuery, str9), L(cursorQuery, "data6"), aVar2.f50133f.f50513f, L(cursorQuery, "data7"), L(cursorQuery, "data9"), L(cursorQuery, "data8"));
                                }
                                str22 = str10;
                                str23 = str11;
                                str24 = str9;
                                str17 = str17;
                                mapS = map;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                linkedHashMap2 = linkedHashMap;
                                break;
                            case -1079210633:
                                map = mapS;
                                str9 = str24;
                                linkedHashMap = linkedHashMap2;
                                str10 = str22;
                                str11 = str23;
                                if (strL3.equals("vnd.android.cursor.item/note") && L(cursorQuery, "data1").length() != 0) {
                                    String strL8 = L(cursorQuery, "data1");
                                    t5.g gVar = new t5.g();
                                    gVar.f50517a = strL8;
                                    aVar2.f50140n = xj.n.D0(aVar2.f50140n, gVar);
                                }
                                str22 = str10;
                                str23 = str11;
                                str24 = str9;
                                str17 = str17;
                                mapS = map;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                linkedHashMap2 = linkedHashMap;
                                break;
                            case -601229436:
                                map = mapS;
                                str9 = str24;
                                linkedHashMap = linkedHashMap2;
                                str10 = str22;
                                str11 = str23;
                                if (strL3.equals("vnd.android.cursor.item/postal-address_v2")) {
                                    int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("data2"));
                                    if (i11 == 0) {
                                        str14 = "custom";
                                    } else if (i11 == 1) {
                                        str14 = "home";
                                    } else if (i11 != 2) {
                                        str14 = i11 != 3 ? "" : "other";
                                    } else {
                                        str14 = "work";
                                    }
                                    if (str14.equals("custom")) {
                                        String string7 = cursorQuery.getString(cursorQuery.getColumnIndex(str11));
                                        if (string7 == null) {
                                            string7 = "";
                                        }
                                        str15 = string7;
                                    } else {
                                        str15 = "";
                                    }
                                    aVar2.f50136i = xj.n.D0(aVar2.f50136i, new t5.b(L(cursorQuery, "data1"), str14, str15, L(cursorQuery, str9), L(cursorQuery, "data5"), L(cursorQuery, "data6"), L(cursorQuery, "data7"), L(cursorQuery, "data8"), L(cursorQuery, "data9"), L(cursorQuery, "data10"), "", "", ""));
                                }
                                str22 = str10;
                                str23 = str11;
                                str24 = str9;
                                str17 = str17;
                                mapS = map;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                linkedHashMap2 = linkedHashMap;
                                break;
                            case 456415478:
                                String str36 = str17;
                                String str37 = str22;
                                String str38 = str23;
                                if (strL3.equals("vnd.android.cursor.item/website")) {
                                    switch (cursorQuery.getInt(cursorQuery.getColumnIndex("data2"))) {
                                        case 0:
                                            str5 = "custom";
                                            break;
                                        case 1:
                                            str5 = "homepage";
                                            break;
                                        case 2:
                                            str5 = "blog";
                                            break;
                                        case 3:
                                            str5 = "profile";
                                            break;
                                        case 4:
                                            str5 = "home";
                                            break;
                                        case 5:
                                            str5 = "work";
                                            break;
                                        case 6:
                                            str5 = "ftp";
                                            break;
                                        case 7:
                                            str5 = "other";
                                            break;
                                        default:
                                            str5 = "";
                                            break;
                                    }
                                    if (!str5.equals("custom") || (string = cursorQuery.getString(cursorQuery.getColumnIndex(str38))) == null) {
                                        string = "";
                                    }
                                    aVar2.f50138k = xj.n.D0(aVar2.f50138k, new k(L(cursorQuery, "data1"), str5, string));
                                }
                                str17 = str36;
                                str23 = str38;
                                str22 = str37;
                                str24 = str24;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                            case 684173810:
                                String str39 = str17;
                                String str40 = str24;
                                if (strL3.equals(str39)) {
                                    String strX = x(cursorQuery);
                                    if (strX.equals("custom")) {
                                        str6 = str23;
                                        String string8 = cursorQuery.getString(cursorQuery.getColumnIndex(str6));
                                        if (string8 == null) {
                                            string8 = "";
                                        }
                                        str7 = string8;
                                    } else {
                                        str6 = str23;
                                        str7 = "";
                                    }
                                    String str41 = str22;
                                    aVar2.f50134g = xj.n.D0(aVar2.f50134g, new i(L(cursorQuery, "data1"), L(cursorQuery, str40), strX, str7, cursorQuery.getInt(cursorQuery.getColumnIndex(str41)) == 1));
                                    str17 = str39;
                                    str24 = str40;
                                    str23 = str6;
                                    str22 = str41;
                                } else {
                                    str17 = str39;
                                    str24 = str40;
                                }
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                            case 689862072:
                                if (strL3.equals("vnd.android.cursor.item/organization")) {
                                    String str42 = str24;
                                    aVar2.f50137j = xj.n.D0(aVar2.f50137j, new t5.h(L(cursorQuery, "data1"), L(cursorQuery, str42), L(cursorQuery, "data5"), L(cursorQuery, "data6"), L(cursorQuery, "data7"), L(cursorQuery, "data8"), L(cursorQuery, "data9")));
                                    str24 = str42;
                                    str17 = str17;
                                } else {
                                    str17 = str17;
                                    str24 = str24;
                                }
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                            case 950831081:
                                if (strL3.equals("vnd.android.cursor.item/im")) {
                                    switch (cursorQuery.getInt(cursorQuery.getColumnIndex("data5"))) {
                                        case -1:
                                            str8 = "custom";
                                            break;
                                        case 0:
                                            str8 = "aim";
                                            break;
                                        case 1:
                                            str8 = "msn";
                                            break;
                                        case 2:
                                            str8 = "yahoo";
                                            break;
                                        case 3:
                                            str8 = "skype";
                                            break;
                                        case 4:
                                            str8 = "qqchat";
                                            break;
                                        case 5:
                                            str8 = "googleTalk";
                                            break;
                                        case 6:
                                            str8 = "icq";
                                            break;
                                        case 7:
                                            str8 = "jabber";
                                            break;
                                        case 8:
                                            str8 = "netmeeting";
                                            break;
                                        default:
                                            str8 = "";
                                            break;
                                    }
                                    if (!str8.equals("custom") || (string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data6"))) == null) {
                                        string2 = "";
                                    }
                                    aVar2.l = xj.n.D0(aVar2.l, new j(L(cursorQuery, "data1"), str8, string2));
                                }
                                str17 = str17;
                                str24 = str24;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                            case 1464725403:
                                if (strL3.equals("vnd.android.cursor.item/group_membership") && z13) {
                                    String strL9 = L(cursorQuery, "data1");
                                    if (mapS.containsKey(strL9)) {
                                        List list2 = aVar2.f50142p;
                                        Object obj4 = mapS.get(strL9);
                                        n.c(obj4);
                                        aVar2.f50142p = xj.n.D0(list2, obj4);
                                    }
                                }
                                str17 = str17;
                                str24 = str24;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                            case 2034973555:
                                if (strL3.equals("vnd.android.cursor.item/nickname")) {
                                    t5.f fVar = aVar2.f50133f;
                                    String strL10 = L(cursorQuery, "data1");
                                    fVar.getClass();
                                    fVar.f50513f = strL10;
                                }
                                str17 = str17;
                                str24 = str24;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                            default:
                                str17 = str17;
                                str24 = str24;
                                str18 = str;
                                str28 = str2;
                                str29 = str3;
                                str30 = str4;
                                str31 = str35;
                                break;
                        }
                    } else {
                        str24 = str24;
                        str17 = str17;
                        mapS = mapS;
                    }
                }
                cursorQuery.close();
                ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((s5.a) it2.next()).a());
                }
                return arrayList3;
            }
        } else {
            Cursor cursorQuery2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, (String[]) xj.o.Q("contact_id", "mimetype", "display_name", "starred", "data1", "data4", "data2", "data3", "is_primary", "data1", "data2", "data3", "is_primary").toArray(new String[0]), z16 ? null : "in_visible_group = 1", null, null);
            ArrayList arrayList4 = new ArrayList();
            if (cursorQuery2 != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                while (cursorQuery2.moveToNext()) {
                    String strZ = z(cursorQuery2, str21);
                    if (!linkedHashMap3.containsKey(strZ)) {
                        s5.a aVar4 = new s5.a(strZ, z(cursorQuery2, str20), cursorQuery2.getInt(cursorQuery2.getColumnIndex(str19)) == 1);
                        linkedHashMap3.put(strZ, Integer.valueOf(arrayList4.size()));
                        arrayList4.add(aVar4);
                    }
                    Object obj5 = linkedHashMap3.get(strZ);
                    n.c(obj5);
                    s5.a aVar5 = (s5.a) arrayList4.get(((Number) obj5).intValue());
                    String strZ2 = z(cursorQuery2, "mimetype");
                    if (strZ2.equals("vnd.android.cursor.item/phone_v2")) {
                        String strX2 = x(cursorQuery2);
                        if (!strX2.equals("custom") || (string5 = cursorQuery2.getString(cursorQuery2.getColumnIndex("data3"))) == null) {
                            string5 = "";
                        }
                        aVar5.f50134g = xj.n.D0(aVar5.f50134g, new i(z(cursorQuery2, "data1"), z(cursorQuery2, "data4"), strX2, string5, cursorQuery2.getInt(cursorQuery2.getColumnIndex("is_primary")) == 1));
                    } else if (strZ2.equals(str16)) {
                        String strW2 = w(cursorQuery2);
                        if (!strW2.equals("custom") || (string4 = cursorQuery2.getString(cursorQuery2.getColumnIndex("data3"))) == null) {
                            string4 = "";
                        }
                        LinkedHashMap linkedHashMap4 = linkedHashMap3;
                        String str43 = str16;
                        Cursor cursor = cursorQuery2;
                        aVar5.f50135h = xj.n.D0(aVar5.f50135h, new t5.c(z(cursorQuery2, "data1"), strW2, string4, cursorQuery2.getInt(cursorQuery2.getColumnIndex("is_primary")) == 1));
                        linkedHashMap3 = linkedHashMap4;
                        cursorQuery2 = cursor;
                        str16 = str43;
                    }
                }
                cursorQuery2.close();
                ArrayList arrayList5 = new ArrayList(xj.p.W(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((s5.a) it3.next()).a());
                }
                return arrayList5;
            }
        }
        return v.f53866a;
    }

    public static final String L(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndex(str));
        return string == null ? "" : string;
    }

    public static byte[] M(va.i iVar) {
        return iVar instanceof eb.i ? ((a1) ((eb.i) iVar).f39989a.f39977c).d() : ((a1) ((d0) eb.o.f40004b.h(iVar)).f39977c).d();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    public static final void N(File file, File target) throws IOException {
        n.f(target, "target");
        File parentFile = target.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
            throw new IllegalStateException(defpackage.e.n("Failed to create target directory: ", parentFile.getAbsolutePath()));
        }
        if (parentFile == null) {
            parentFile = new File(".");
        }
        String name = target.getName();
        n.e(name, "getName(...)");
        String strR0 = h.R0(name, ".", name);
        if (h.y0(strR0)) {
            strR0 = "tmp";
        }
        File fileCreateTempFile = File.createTempFile(strR0.concat("_copy_"), ".tmp", parentFile);
        while (n.a(fileCreateTempFile.getAbsolutePath(), file.getAbsolutePath())) {
            fileCreateTempFile = File.createTempFile(strR0.concat("_copy_"), ".tmp", parentFile);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i10);
                        }
                        if (fileCreateTempFile.exists()) {
                            fileCreateTempFile.delete();
                        }
                        throw th;
                    }
                    fileInputStream.close();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    try {
                        Files.move(fileCreateTempFile.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                    } catch (Exception unused) {
                        Files.move(fileCreateTempFile.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    }
                    if (fileCreateTempFile.exists()) {
                        fileCreateTempFile.delete();
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        qk.i0.j(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    qk.i0.j(fileOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            if (fileCreateTempFile.exists()) {
                fileCreateTempFile.delete();
            }
            throw th6;
        }
    }

    public static final String O(String str) {
        n.f(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!h.q0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                n.e(ascii, "toASCII(host)");
                Locale US = Locale.US;
                n.e(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (n.h(cCharAt, 31) <= 0 || n.h(cCharAt, 127) >= 0 || h.v0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM = (an.p.p0(str, X3.j.f27834d, false) && an.p.h0(str, X3.j.f27836e, false)) ? m(str, 1, str.length() - 1) : m(str, 0, str.length());
        if (inetAddressM == null) {
            return null;
        }
        byte[] address = inetAddressM.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM.getHostAddress();
            }
            throw new AssertionError(defpackage.e.f('\'', "Invalid IPv6 address: '", str));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        lo.e eVar = new lo.e();
        while (i10 < address.length) {
            if (i10 == i11) {
                eVar.q(58);
                i10 += i14;
                if (i10 == 16) {
                    eVar.q(58);
                }
            } else {
                if (i10 > 0) {
                    eVar.q(58);
                }
                byte b10 = address[i10];
                byte[] bArr = yn.a.f54560a;
                eVar.r(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return eVar.readUtf8();
    }

    public static final boolean P(String str, jk.a aVar) {
        try {
            boolean zBooleanValue = ((Boolean) aVar.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final boolean Q(PublicKey publicKey, String data, String signature) {
        n.f(data, "data");
        n.f(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(an.a.f3768a);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            n.e(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void R(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] S(byte[] bArr, int i10, int i11, byte[] bArr2) {
        if (i11 < 0 || bArr.length - i11 < i10 || bArr2.length - i11 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i10] ^ bArr2[i12]);
        }
        return bArr3;
    }

    public static final byte[] T(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return S(bArr, 0, bArr.length, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static void U(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(l1.d.e(i11, "at index "));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(r rVar, jk.a aVar, ck.c cVar) {
        en.p pVar;
        if (cVar instanceof en.p) {
            pVar = (en.p) cVar;
            int i10 = pVar.f40175h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f40175h = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new en.p(cVar);
            }
        } else {
            pVar = new en.p(cVar);
        }
        Object obj = pVar.f40174g;
        int i11 = pVar.f40175h;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                if (pVar.getContext().get(e1.f6705a) != rVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                pVar.f40173f = (kotlin.jvm.internal.o) aVar;
                pVar.f40175h = 1;
                l lVar = new l(1, q1.t(pVar));
                lVar.t();
                ((en.q) rVar).f0(new cl.a(lVar, 1));
                Object objS = lVar.s();
                bk.a aVar2 = bk.a.f5708a;
                aVar = aVar;
                if (objS == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jk.a aVar3 = (jk.a) pVar.f40173f;
                t9.e.z(obj);
                aVar = aVar3;
            }
            aVar.invoke();
            return wj.r.f53297a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:128:0x0312  */
    /* JADX WARN: Code duplicated, block: B:157:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:271:0x0698  */
    /* JADX WARN: Code duplicated, block: B:314:0x075f  */
    /* JADX WARN: Code duplicated, block: B:94:0x024c  */
    public static void b(s5.a aVar, ArrayList arrayList, String str) {
        s5.d dVar;
        s5.f fVar;
        String str2;
        String str3;
        String str4;
        s5.g gVar;
        s5.b bVar;
        String str5;
        String str6;
        String str7;
        String str8;
        s5.c cVar;
        s5.e eVar;
        s5.a aVar2 = aVar;
        t5.f fVar2 = aVar2.f50133f;
        String str9 = "data2";
        String str10 = "data5";
        String str11 = "data3";
        String str12 = "data4";
        String str13 = "data6";
        String str14 = "data7";
        String str15 = "data8";
        String str16 = "data9";
        ContentProviderOperation contentProviderOperationBuild = d(str).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", c(fVar2.f50508a)).withValue("data5", c(fVar2.f50510c)).withValue("data3", c(fVar2.f50509b)).withValue("data4", c(fVar2.f50511d)).withValue("data6", c(fVar2.f50512e)).withValue("data7", c(fVar2.f50514g)).withValue("data8", c(fVar2.f50516i)).withValue("data9", c(fVar2.f50515h)).build();
        n.e(contentProviderOperationBuild, "build(...)");
        arrayList.add(contentProviderOperationBuild);
        if (fVar2.f50513f.length() != 0) {
            ContentProviderOperation contentProviderOperationBuild2 = d(str).withValue("mimetype", "vnd.android.cursor.item/nickname").withValue("data1", fVar2.f50513f).build();
            n.e(contentProviderOperationBuild2, "build(...)");
            arrayList.add(contentProviderOperationBuild2);
        }
        Iterator it = aVar2.f50134g.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Iterator it2 = it;
            String str17 = "mobile";
            String str18 = "home";
            String str19 = str16;
            String str20 = "work";
            String str21 = str15;
            String str22 = "other";
            String str23 = str14;
            String str24 = "custom";
            String str25 = str13;
            String str26 = "";
            String str27 = str10;
            if (!zHasNext) {
                String str28 = str12;
                Iterator it3 = aVar2.f50135h.iterator();
                while (it3.hasNext()) {
                    t5.c cVar2 = (t5.c) it3.next();
                    Iterator it4 = it3;
                    String str29 = cVar2.f50498b;
                    String str30 = cVar2.f50499c;
                    switch (str29.hashCode()) {
                        case -1349088399:
                            if (str29.equals("custom")) {
                                cVar = new s5.c(0, str30);
                            } else {
                                cVar = new s5.c(0, str29);
                            }
                            break;
                        case -1068855134:
                            if (str29.equals(str17)) {
                                cVar = new s5.c(4, "");
                            } else {
                                cVar = new s5.c(0, str29);
                            }
                            break;
                        case 3208415:
                            if (str29.equals("home")) {
                                cVar = new s5.c(1, "");
                            } else {
                                cVar = new s5.c(0, str29);
                            }
                            break;
                        case 3655441:
                            if (str29.equals("work")) {
                                cVar = new s5.c(2, "");
                            } else {
                                cVar = new s5.c(0, str29);
                            }
                            break;
                        case 106069776:
                            if (str29.equals("other")) {
                                cVar = new s5.c(3, "");
                            } else {
                                cVar = new s5.c(0, str29);
                            }
                            break;
                        default:
                            cVar = new s5.c(0, str29);
                            break;
                    }
                    ContentProviderOperation.Builder builderWithValue = d(str).withValue("mimetype", "vnd.android.cursor.item/email_v2");
                    String str31 = cVar2.f50497a;
                    if (str31.length() == 0) {
                        str31 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue2 = builderWithValue.withValue("data1", str31).withValue("data2", Integer.valueOf(cVar.f50145a));
                    String str32 = cVar.f50146b;
                    if (str32.length() == 0) {
                        str32 = "";
                    }
                    ContentProviderOperation contentProviderOperationBuild3 = builderWithValue2.withValue("data3", str32).withValue("is_primary", Integer.valueOf(cVar2.f50500d ? 1 : 0)).build();
                    n.e(contentProviderOperationBuild3, "build(...)");
                    arrayList.add(contentProviderOperationBuild3);
                    aVar2 = aVar;
                    it3 = it4;
                    str17 = str17;
                }
                Iterator it5 = aVar2.f50136i.iterator();
                while (it5.hasNext()) {
                    t5.b bVar2 = (t5.b) it5.next();
                    String str33 = bVar2.f50486b;
                    String str34 = bVar2.f50487c;
                    switch (str33.hashCode()) {
                        case -1349088399:
                            if (str33.equals(str24)) {
                                bVar = new s5.b(0, str34);
                            } else {
                                bVar = new s5.b(0, str33);
                            }
                            break;
                        case 3208415:
                            if (str33.equals(str18)) {
                                bVar = new s5.b(1, "");
                            } else {
                                bVar = new s5.b(0, str33);
                            }
                            break;
                        case 3655441:
                            if (str33.equals(str20)) {
                                bVar = new s5.b(2, "");
                            } else {
                                bVar = new s5.b(0, str33);
                            }
                            break;
                        case 106069776:
                            if (str33.equals("other")) {
                                bVar = new s5.b(3, "");
                            } else {
                                bVar = new s5.b(0, str33);
                            }
                            break;
                        default:
                            bVar = new s5.b(0, str33);
                            break;
                    }
                    ContentProviderOperation.Builder builderWithValue3 = d(str).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2");
                    String str35 = bVar2.f50485a;
                    if (str35.length() == 0) {
                        str35 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue4 = builderWithValue3.withValue("data1", str35).withValue(str9, Integer.valueOf(bVar.f50143a));
                    String str36 = bVar.f50144b;
                    if (str36.length() == 0) {
                        str36 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue5 = builderWithValue4.withValue(str11, str36);
                    String str37 = bVar2.f50488d;
                    if (str37.length() == 0) {
                        str37 = "";
                    }
                    String str38 = str28;
                    ContentProviderOperation.Builder builderWithValue6 = builderWithValue5.withValue(str38, str37);
                    String str39 = bVar2.f50489e;
                    if (str39.length() == 0) {
                        str39 = "";
                    }
                    String str40 = str11;
                    String str41 = str27;
                    ContentProviderOperation.Builder builderWithValue7 = builderWithValue6.withValue(str41, str39);
                    String str42 = bVar2.f50490f;
                    if (str42.length() == 0) {
                        str5 = str25;
                        str42 = "";
                    } else {
                        str5 = str25;
                    }
                    ContentProviderOperation.Builder builderWithValue8 = builderWithValue7.withValue(str5, str42);
                    String str43 = bVar2.f50491g;
                    if (str43.length() == 0) {
                        str6 = str23;
                        str43 = "";
                    } else {
                        str6 = str23;
                    }
                    ContentProviderOperation.Builder builderWithValue9 = builderWithValue8.withValue(str6, str43);
                    String str44 = bVar2.f50492h;
                    if (str44.length() == 0) {
                        str7 = str21;
                        str44 = "";
                    } else {
                        str7 = str21;
                    }
                    ContentProviderOperation.Builder builderWithValue10 = builderWithValue9.withValue(str7, str44);
                    String str45 = bVar2.f50493i;
                    if (str45.length() == 0) {
                        str8 = str19;
                        str45 = "";
                    } else {
                        str8 = str19;
                    }
                    ContentProviderOperation.Builder builderWithValue11 = builderWithValue10.withValue(str8, str45);
                    String str46 = bVar2.f50494j;
                    if (str46.length() == 0) {
                        str46 = "";
                    }
                    ContentProviderOperation contentProviderOperationBuild4 = builderWithValue11.withValue("data10", str46).build();
                    n.e(contentProviderOperationBuild4, "build(...)");
                    arrayList.add(contentProviderOperationBuild4);
                    str21 = str7;
                    str18 = str18;
                    str25 = str5;
                    str9 = str9;
                    str23 = str6;
                    str24 = str24;
                    str19 = str8;
                    str20 = str20;
                    str27 = str41;
                    it5 = it5;
                    str11 = str40;
                    str28 = str38;
                }
                String str47 = str21;
                String str48 = str18;
                String str49 = str25;
                String str50 = str9;
                String str51 = str23;
                String str52 = str24;
                String str53 = str19;
                String str54 = str20;
                String str55 = str28;
                String str56 = str11;
                String str57 = str27;
                Iterator it6 = aVar2.f50137j.iterator();
                while (it6.hasNext()) {
                    t5.h hVar = (t5.h) it6.next();
                    Iterator it7 = it6;
                    ContentProviderOperation.Builder builderWithValue12 = d(str).withValue("mimetype", "vnd.android.cursor.item/organization");
                    String str58 = hVar.f50518a;
                    if (str58.length() == 0) {
                        str58 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue13 = builderWithValue12.withValue("data1", str58);
                    String str59 = hVar.f50519b;
                    if (str59.length() == 0) {
                        str59 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue14 = builderWithValue13.withValue(str55, str59);
                    String str60 = hVar.f50520c;
                    if (str60.length() == 0) {
                        str60 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue15 = builderWithValue14.withValue(str57, str60);
                    String str61 = hVar.f50521d;
                    if (str61.length() == 0) {
                        str61 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue16 = builderWithValue15.withValue(str49, str61);
                    String str62 = hVar.f50522e;
                    if (str62.length() == 0) {
                        str62 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue17 = builderWithValue16.withValue(str51, str62);
                    String str63 = hVar.f50523f;
                    if (str63.length() == 0) {
                        str63 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue18 = builderWithValue17.withValue(str47, str63);
                    String str64 = hVar.f50524g;
                    if (str64.length() == 0) {
                        str64 = "";
                    }
                    ContentProviderOperation contentProviderOperationBuild5 = builderWithValue18.withValue(str53, str64).build();
                    n.e(contentProviderOperationBuild5, "build(...)");
                    arrayList.add(contentProviderOperationBuild5);
                    it6 = it7;
                }
                Iterator it8 = aVar2.f50138k.iterator();
                while (it8.hasNext()) {
                    k kVar = (k) it8.next();
                    String str65 = kVar.f50534b;
                    String str66 = kVar.f50535c;
                    switch (str65.hashCode()) {
                        case -1349088399:
                            str2 = str54;
                            str3 = str48;
                            str4 = str52;
                            if (str65.equals(str4)) {
                                it8 = it8;
                                gVar = new s5.g(0, str66);
                            } else {
                                it8 = it8;
                                gVar = new s5.g(0, str65);
                            }
                            break;
                        case -485371922:
                            str2 = str54;
                            str3 = str48;
                            if (str65.equals("homepage")) {
                                gVar = new s5.g(1, "");
                                it8 = it8;
                                str4 = str52;
                            }
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                        case -309425751:
                            str2 = str54;
                            str3 = str48;
                            if (str65.equals("profile")) {
                                gVar = new s5.g(3, "");
                                it8 = it8;
                                str4 = str52;
                            }
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                        case 101730:
                            str2 = str54;
                            str3 = str48;
                            if (str65.equals("ftp")) {
                                gVar = new s5.g(6, "");
                                it8 = it8;
                                str4 = str52;
                            }
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                        case 3026850:
                            str2 = str54;
                            str3 = str48;
                            if (str65.equals("blog")) {
                                gVar = new s5.g(2, "");
                                it8 = it8;
                                str4 = str52;
                            }
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                        case 3208415:
                            str2 = str54;
                            str3 = str48;
                            if (str65.equals(str3)) {
                                gVar = new s5.g(4, "");
                                it8 = it8;
                                str4 = str52;
                            }
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                        case 3655441:
                            str2 = str54;
                            if (str65.equals(str2)) {
                                gVar = new s5.g(5, "");
                                str3 = str48;
                                str4 = str52;
                            }
                            str3 = str48;
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                        case 106069776:
                            if (str65.equals("other")) {
                                gVar = new s5.g(7, "");
                                str2 = str54;
                                str3 = str48;
                                str4 = str52;
                                break;
                            }
                        default:
                            str2 = str54;
                            str3 = str48;
                            str4 = str52;
                            it8 = it8;
                            gVar = new s5.g(0, str65);
                            break;
                    }
                    ContentProviderOperation.Builder builderWithValue19 = d(str).withValue("mimetype", "vnd.android.cursor.item/website");
                    String str67 = kVar.f50533a;
                    if (str67.length() == 0) {
                        str67 = "";
                    }
                    String str68 = str50;
                    ContentProviderOperation.Builder builderWithValue20 = builderWithValue19.withValue("data1", str67).withValue(str68, Integer.valueOf(gVar.f50153a));
                    String str69 = gVar.f50154b;
                    if (str69.length() == 0) {
                        str69 = "";
                    }
                    String str70 = str56;
                    ContentProviderOperation contentProviderOperationBuild6 = builderWithValue20.withValue(str70, str69).build();
                    n.e(contentProviderOperationBuild6, "build(...)");
                    arrayList.add(contentProviderOperationBuild6);
                    str56 = str70;
                    str50 = str68;
                    str54 = str2;
                    str48 = str3;
                    str52 = str4;
                    it8 = it8;
                }
                String str71 = str56;
                String str72 = str52;
                String str73 = str50;
                Iterator it9 = aVar2.l.iterator();
                while (it9.hasNext()) {
                    j jVar = (j) it9.next();
                    String str74 = jVar.f50531b;
                    String str75 = jVar.f50532c;
                    Iterator it10 = it9;
                    switch (str74.hashCode()) {
                        case -1535163771:
                            if (str74.equals("googleTalk")) {
                                fVar = new s5.f(5, "");
                            } else {
                                fVar = new s5.f(-1, str74);
                            }
                            break;
                        case -1349088399:
                            if (str74.equals(str72)) {
                                fVar = new s5.f(-1, str75);
                            } else {
                                fVar = new s5.f(-1, str74);
                            }
                            break;
                        case -1167678812:
                            if (str74.equals("jabber")) {
                                fVar = new s5.f(7, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        case -1061353986:
                            if (str74.equals("netmeeting")) {
                                fVar = new s5.f(8, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        case -952462984:
                            if (str74.equals("qqchat")) {
                                fVar = new s5.f(4, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        case 96581:
                            if (str74.equals("aim")) {
                                fVar = new s5.f(0, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        case 104087:
                            if (str74.equals("icq")) {
                                fVar = new s5.f(6, "");
                            } else {
                                fVar = new s5.f(-1, str74);
                            }
                            break;
                        case 108424:
                            if (str74.equals("msn")) {
                                fVar = new s5.f(1, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        case 109512406:
                            if (str74.equals("skype")) {
                                fVar = new s5.f(3, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        case 114739264:
                            if (str74.equals("yahoo")) {
                                fVar = new s5.f(2, "");
                            }
                            fVar = new s5.f(-1, str74);
                            break;
                        default:
                            fVar = new s5.f(-1, str74);
                            break;
                    }
                    ContentProviderOperation.Builder builderWithValue21 = d(str).withValue("mimetype", "vnd.android.cursor.item/im");
                    String str76 = jVar.f50530a;
                    if (str76.length() == 0) {
                        str76 = "";
                    }
                    ContentProviderOperation.Builder builderWithValue22 = builderWithValue21.withValue("data1", str76).withValue(str57, Integer.valueOf(fVar.f50151a));
                    String str77 = fVar.f50152b;
                    if (str77.length() == 0) {
                        str77 = "";
                    }
                    ContentProviderOperation contentProviderOperationBuild7 = builderWithValue22.withValue(str49, str77).build();
                    n.e(contentProviderOperationBuild7, "build(...)");
                    arrayList.add(contentProviderOperationBuild7);
                    it9 = it10;
                }
                Iterator it11 = aVar2.f50139m.iterator();
                while (it11.hasNext()) {
                    t5.d dVar2 = (t5.d) it11.next();
                    String str78 = dVar2.f50504d;
                    String str79 = dVar2.f50505e;
                    switch (str78.hashCode()) {
                        case -1349088399:
                            dVar = str78.equals(str72) ? new s5.d(0, str79) : new s5.d(0, str78);
                            break;
                        case -940675184:
                            if (str78.equals("anniversary")) {
                                dVar = new s5.d(1, str26);
                            }
                            break;
                        case 106069776:
                            if (str78.equals(str22)) {
                                dVar = new s5.d(2, str26);
                            }
                            break;
                        case 1069376125:
                            if (str78.equals("birthday")) {
                                dVar = new s5.d(3, str26);
                                break;
                            }
                        default:
                            break;
                    }
                    ContentProviderOperation.Builder builderWithValue23 = d(str).withValue("mimetype", "vnd.android.cursor.item/contact_event");
                    Integer num = dVar2.f50501a;
                    Iterator it12 = it11;
                    String str80 = str22;
                    ContentProviderOperation.Builder builderWithValue24 = builderWithValue23.withValue("data1", q4.a.i(num == null ? "--" : wi.d.h(h.C0(String.valueOf(num), 4, '0'), "-"), h.C0(String.valueOf(dVar2.f50502b), 2, '0'), "-", h.C0(String.valueOf(dVar2.f50503c), 2, '0'))).withValue(str73, Integer.valueOf(dVar.f50147a));
                    String str81 = dVar.f50148b;
                    if (str81.length() == 0) {
                        str81 = str26;
                    }
                    ContentProviderOperation contentProviderOperationBuild8 = builderWithValue24.withValue(str71, str81).build();
                    n.e(contentProviderOperationBuild8, "build(...)");
                    arrayList.add(contentProviderOperationBuild8);
                    it11 = it12;
                    str26 = str26;
                    str22 = str80;
                }
                for (t5.g gVar2 : aVar2.f50140n) {
                    if (gVar2.f50517a.length() != 0) {
                        ContentProviderOperation contentProviderOperationBuild9 = d(str).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", gVar2.f50517a).build();
                        n.e(contentProviderOperationBuild9, "build(...)");
                        arrayList.add(contentProviderOperationBuild9);
                    }
                }
                Iterator it13 = aVar2.f50142p.iterator();
                while (it13.hasNext()) {
                    ContentProviderOperation contentProviderOperationBuild10 = d(str).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", ((t5.e) it13.next()).f50506a).build();
                    n.e(contentProviderOperationBuild10, "build(...)");
                    arrayList.add(contentProviderOperationBuild10);
                }
                return;
            }
            i iVar = (i) it2.next();
            String str82 = str12;
            String str83 = iVar.f50527c;
            String str84 = iVar.f50528d;
            switch (str83) {
                case "custom":
                    eVar = new s5.e(0, str84);
                    break;
                case "faxHome":
                    eVar = new s5.e(5, "");
                    break;
                case "workMobile":
                    eVar = new s5.e(17, "");
                    break;
                case "faxWork":
                    eVar = new s5.e(4, "");
                    break;
                case "mobile":
                    eVar = new s5.e(2, "");
                    break;
                case "ttyTtd":
                    eVar = new s5.e(16, "");
                    break;
                case "companyMain":
                    eVar = new s5.e(10, "");
                    break;
                case "callback":
                    eVar = new s5.e(8, "");
                    break;
                case "car":
                    eVar = new s5.e(9, "");
                    break;
                case "mms":
                    eVar = new s5.e(20, "");
                    break;
                case "home":
                    eVar = new s5.e(1, "");
                    break;
                case "isdn":
                    eVar = new s5.e(11, "");
                    break;
                case "main":
                    eVar = new s5.e(12, "");
                    break;
                case "work":
                    eVar = new s5.e(3, "");
                    break;
                case "other":
                    eVar = new s5.e(7, "");
                    break;
                case "pager":
                    eVar = new s5.e(6, "");
                    break;
                case "radio":
                    eVar = new s5.e(14, "");
                    break;
                case "telex":
                    eVar = new s5.e(15, "");
                    break;
                case "workPager":
                    eVar = new s5.e(18, "");
                    break;
                case "faxOther":
                    eVar = new s5.e(13, "");
                    break;
                case "assistant":
                    eVar = new s5.e(19, "");
                    break;
                default:
                    eVar = new s5.e(0, str83);
                    break;
            }
            ContentProviderOperation.Builder builderWithValue25 = d(str).withValue("mimetype", "vnd.android.cursor.item/phone_v2");
            String str85 = iVar.f50525a;
            if (str85.length() == 0) {
                str85 = "";
            }
            ContentProviderOperation.Builder builderWithValue26 = builderWithValue25.withValue("data1", str85).withValue("data2", Integer.valueOf(eVar.f50149a));
            String str86 = eVar.f50150b;
            if (str86.length() != 0) {
                str26 = str86;
            }
            ContentProviderOperation contentProviderOperationBuild11 = builderWithValue26.withValue("data3", str26).withValue("is_primary", Integer.valueOf(iVar.f50529e ? 1 : 0)).build();
            n.e(contentProviderOperationBuild11, "build(...)");
            arrayList.add(contentProviderOperationBuild11);
            aVar2 = aVar;
            it = it2;
            str12 = str82;
            str16 = str19;
            str15 = str21;
            str14 = str23;
            str13 = str25;
            str10 = str27;
        }
    }

    public static final String c(String str) {
        return str.length() == 0 ? "" : str;
    }

    public static final ContentProviderOperation.Builder d(String str) {
        if (str != null) {
            ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", str);
            n.e(builderWithValue, "withValue(...)");
            return builderWithValue;
        }
        ContentProviderOperation.Builder builderWithValueBackReference = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0);
        n.e(builderWithValueBackReference, "withValueBackReference(...)");
        return builderWithValueBackReference;
    }

    public static void e(ContentResolver contentResolver, byte[] bArr, long j10) throws IOException {
        Uri uriWithAppendedPath = Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.RawContacts.CONTENT_URI, j10), "display_photo");
        n.e(uriWithAppendedPath, "withAppendedPath(...)");
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriWithAppendedPath, "rw");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            FileOutputStream fileOutputStreamCreateOutputStream = assetFileDescriptorOpenAssetFileDescriptor.createOutputStream();
            n.e(fileOutputStreamCreateOutputStream, "createOutputStream(...)");
            fileOutputStreamCreateOutputStream.write(bArr);
            fileOutputStreamCreateOutputStream.close();
            assetFileDescriptorOpenAssetFileDescriptor.close();
        }
    }

    public static final void f(jk.b bVar, lj.b bVar2) {
        bVar.invoke(new wj.h(t9.e.c(bVar2)));
    }

    public static int g(androidx.recyclerview.widget.e1 e1Var, androidx.recyclerview.widget.c0 c0Var, View view, View view2, r0 r0Var, boolean z10) {
        if (r0Var.v() == 0 || e1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(r0.C(view) - r0.C(view2)) + 1;
        }
        return Math.min(c0Var.l(), c0Var.b(view2) - c0Var.e(view));
    }

    public static int h(androidx.recyclerview.widget.e1 e1Var, androidx.recyclerview.widget.c0 c0Var, View view, View view2, r0 r0Var, boolean z10, boolean z11) {
        if (r0Var.v() == 0 || e1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (e1Var.b() - Math.max(r0.C(view), r0.C(view2))) - 1) : Math.max(0, Math.min(r0.C(view), r0.C(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(c0Var.b(view2) - c0Var.e(view)) / (Math.abs(r0.C(view) - r0.C(view2)) + 1))) + (c0Var.k() - c0Var.e(view)));
        }
        return iMax;
    }

    public static int i(androidx.recyclerview.widget.e1 e1Var, androidx.recyclerview.widget.c0 c0Var, View view, View view2, r0 r0Var, boolean z10) {
        if (r0Var.v() == 0 || e1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return e1Var.b();
        }
        return (int) (((c0Var.b(view2) - c0Var.e(view)) / (Math.abs(r0.C(view) - r0.C(view2)) + 1)) * e1Var.b());
    }

    public static final Collection j(Collection collection, Collection collection2) {
        n.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static byte[] k(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final File l(Context context, String fileName) {
        n.f(context, "<this>");
        n.f(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    public static final InetAddress m(String str, int i10, int i11) {
        int i12;
        int i13;
        int iQ;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i14 < i11) {
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && an.p.o0(str, i14, "::", false)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                i16 = i15;
                if (i18 == i11) {
                    break;
                }
                i17 = i18;
                i12 = 0;
                i14 = i17;
                while (i14 < i11) {
                    iQ = yn.a.q(str.charAt(i14));
                    if (iQ != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iQ;
                    i14++;
                }
                i13 = i14 - i17;
                return i13 == 0 ? null : null;
            }
            if (i15 != 0) {
                if (!an.p.o0(str, i14, ":", false)) {
                    if (!an.p.o0(str, i14, ".", false)) {
                        return null;
                    }
                    int i19 = i15 - 2;
                    int i20 = i19;
                    while (i17 < i11) {
                        if (i20 == 16) {
                            return null;
                        }
                        if (i20 != i19) {
                            if (str.charAt(i17) != '.') {
                                return null;
                            }
                            i17++;
                        }
                        int i21 = 0;
                        int i22 = i17;
                        while (i22 < i11) {
                            char cCharAt = str.charAt(i22);
                            if (n.h(cCharAt, 48) < 0 || n.h(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i21 == 0 && i17 != i22) || (i21 = ((i21 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i22++;
                        }
                        if (i22 - i17 == 0) {
                            return null;
                        }
                        bArr[i20] = (byte) i21;
                        i20++;
                        i17 = i22;
                    }
                    if (i20 != i15 + 2) {
                        return null;
                    }
                    i15 += 2;
                    break;
                }
                i14++;
            }
            i17 = i14;
            i12 = 0;
            i14 = i17;
            while (i14 < i11) {
                iQ = yn.a.q(str.charAt(i14));
                if (iQ != -1) {
                    break;
                }
                i12 = (i12 << 4) + iQ;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 == 0 && i13 <= 4) {
                int i23 = i15 + 1;
                bArr[i15] = (byte) (255 & (i12 >>> 8));
                i15 += 2;
                bArr[i23] = (byte) (i12 & 255);
            }
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            int i24 = i15 - i16;
            System.arraycopy(bArr, i16, bArr, 16 - i24, i24);
            Arrays.fill(bArr, i16, (16 - i15) + i16, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                return Arrays.equals((int[]) obj, (int[]) obj2);
            }
            if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                return Arrays.equals((long[]) obj, (long[]) obj2);
            }
            if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (dArr.length == dArr2.length) {
                    int length = dArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (r(dArr[i10], dArr2[i10])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (fArr.length == fArr2.length) {
                    int length2 = fArr.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (u(fArr[i11], fArr2[i11])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length == objArr2.length) {
                    int length3 = objArr.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        if (n(objArr[i12], objArr2[i12])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof List) && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        if (!n(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return r(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? u(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (n(key, entry2.getKey())) {
                                if (!n(entry.getValue(), entry2.getValue())) {
                                    break loop4;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int o(Object obj) {
        int iO = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int iO2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iO < length) {
                double d10 = dArr[iO];
                int i10 = iO2 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                iO2 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iO++;
            }
            return iO2;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iO < length2) {
                float f11 = fArr[iO];
                int i11 = iO2 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                iO2 = i11 + Float.floatToIntBits(f11);
                iO++;
            }
            return iO2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iO < length3) {
                iO2 = (iO2 * 31) + o(objArr[iO]);
                iO++;
            }
            return iO2;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iO2 = (iO2 * 31) + o(it.next());
            }
            return iO2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iO += o(entry.getValue()) ^ (o(entry.getKey()) * 31);
            }
            return iO;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long jDoubleToLongBits2 = Double.doubleToLongBits(dDoubleValue != 0.0d ? dDoubleValue : 0.0d);
            return (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = fFloatValue;
        }
        return Float.floatToIntBits(f10);
    }

    public static void p(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (tb.f fVar : (Set) it2.next()) {
                        for (tb.h hVar : fVar.f50690a.f50675c) {
                            if (hVar.f50697c == 0) {
                                Set<tb.f> set = (Set) map.get(new tb.g(hVar.f50695a, hVar.f50696b == 2));
                                if (set != null) {
                                    for (tb.f fVar2 : set) {
                                        fVar.f50691b.add(fVar2);
                                        fVar2.f50692c.add(fVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<tb.f> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (tb.f fVar3 : hashSet) {
                    if (fVar3.f50692c.isEmpty()) {
                        hashSet2.add(fVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    tb.f fVar4 = (tb.f) hashSet2.iterator().next();
                    hashSet2.remove(fVar4);
                    i10++;
                    for (tb.f fVar5 : fVar4.f50691b) {
                        fVar5.f50692c.remove(fVar4);
                        if (fVar5.f50692c.isEmpty()) {
                            hashSet2.add(fVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (tb.f fVar6 : hashSet) {
                    if (!fVar6.f50692c.isEmpty() && !fVar6.f50691b.isEmpty()) {
                        arrayList2.add(fVar6.f50690a);
                    }
                }
                throw new tb.i("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 18);
            }
            tb.a aVar = (tb.a) it.next();
            tb.f fVar7 = new tb.f(aVar);
            for (tb.q qVar : aVar.f50674b) {
                boolean z10 = aVar.f50677e == 0;
                tb.g gVar = new tb.g(qVar, !z10);
                if (!map.containsKey(gVar)) {
                    map.put(gVar, new HashSet());
                }
                Set set2 = (Set) map.get(gVar);
                if (!set2.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(fVar7);
            }
        }
    }

    public static boolean q(Method method, qk.d clazz) {
        n.f(clazz, "clazz");
        return method.getReturnType().equals(d0.c.p(clazz));
    }

    public static boolean r(double d10, double d11) {
        if ((d10 == 0.0d ? 0.0d : d10) == (d11 != 0.0d ? d11 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static Map s(ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.Groups.CONTENT_URI, (String[]) xj.o.Q("_id", "title").toArray(new String[0]), null, null, null);
        if (cursorQuery == null) {
            return w.f53867a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
            if (string2 != null) {
                str = string2;
            }
            t5.e eVar = new t5.e();
            eVar.f50506a = string;
            eVar.f50507b = str;
            linkedHashMap.put(string, eVar);
        }
        return linkedHashMap;
    }

    public static final HashSet t(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setE = ((im.n) it.next()).e();
            if (setE == null) {
                return null;
            }
            t.a0(setE, hashSet);
        }
        return hashSet;
    }

    public static boolean u(float f10, float f11) {
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f13 = f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f10;
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f12 = f11;
        }
        if (f13 == f12) {
            return true;
        }
        return Float.isNaN(f10) && Float.isNaN(f11);
    }

    public static Drawable v(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f53660a) {
                return F(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return context2.getDrawable(i10);
        } catch (NoClassDefFoundError unused2) {
            f53660a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = e0.j.f39004a;
        return resources.getDrawable(i10, theme);
    }

    public static String w(Cursor cursor) {
        int i10 = cursor.getInt(cursor.getColumnIndex("data2"));
        if (i10 == 0) {
            return "custom";
        }
        if (i10 == 1) {
            return "home";
        }
        if (i10 == 2) {
            return "work";
        }
        if (i10 != 3) {
            return i10 != 4 ? "home" : "mobile";
        }
        return "other";
    }

    public static String x(Cursor cursor) {
        switch (cursor.getInt(cursor.getColumnIndex("data2"))) {
            case 0:
                return "custom";
            case 1:
                return "home";
            case 2:
            default:
                return "mobile";
            case 3:
                return "work";
            case 4:
                return "faxWork";
            case 5:
                return "faxHome";
            case 6:
                return "pager";
            case 7:
                return "other";
            case 8:
                return "callback";
            case 9:
                return "car";
            case 10:
                return "companyMain";
            case 11:
                return "isdn";
            case 12:
                return X3.i.Z;
            case 13:
                return "faxOther";
            case 14:
                return "radio";
            case 15:
                return "telex";
            case 16:
                return "ttyTtd";
            case 17:
                return "workMobile";
            case 18:
                return "workPager";
            case 19:
                return "assistant";
            case 20:
                return "mms";
        }
    }

    public static final PublicKey y(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(an.p.n0(an.p.n0(an.p.n0(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        n.e(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        n.e(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    public static final String z(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndex(str));
        return string == null ? "" : string;
    }
}

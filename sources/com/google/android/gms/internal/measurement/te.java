package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23996c;

    public te(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f23994a = new HashMap();
        this.f23995b = new HashMap();
        this.f23996c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jf jfVar = (jf) it.next();
            if (TextUtils.isEmpty(jfVar.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                jf jfVar2 = (jf) this.f23994a.put(jfVar.zzc(), jfVar);
                if (jfVar2 != null) {
                    String canonicalName = jfVar2.getClass().getCanonicalName();
                    String canonicalName2 = jfVar.getClass().getCanonicalName();
                    throw new IllegalArgumentException(d5.u.h(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw f2.j(it2);
        }
        this.f23996c.addAll(list);
    }

    public final Object a(Uri uri, se seVar) {
        return seVar.a(b(uri));
    }

    public final re b(Uri uri) {
        List listW;
        oa.e0 e0VarU = oa.j0.u();
        oa.e0 e0VarU2 = oa.j0.u();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listW = oa.n1.f47281e;
        } else {
            String strSubstring = encodedFragment.substring(10);
            com.google.android.gms.common.api.internal.m mVarC = com.google.android.gms.common.api.internal.m.c("+".charAt(0));
            com.google.android.gms.common.api.internal.m mVar = new com.google.android.gms.common.api.internal.m((am.e) mVarC.f11729a, true, (na.b) mVarC.f11732d, Integer.MAX_VALUE);
            strSubstring.getClass();
            listW = oa.j0.w(new eb.u(mVar, strSubstring));
        }
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) listW.get(i10);
            Matcher matcher = ff.f23467a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            e0VarU2.b(matcher.group(1));
        }
        oa.n1 n1VarG = e0VarU2.g();
        if (n1VarG.f47283d > 0) {
            String str2 = (String) n1VarG.get(0);
            if (this.f23995b.get(str2) != null) {
                throw new ClassCastException();
            }
            String strValueOf = String.valueOf(uri);
            throw new b2.z(d5.u.h(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        oa.j0 j0VarE = e0VarU.g().E();
        re reVar = new re();
        String scheme = uri.getScheme();
        jf jfVar = (jf) this.f23994a.get(scheme);
        if (jfVar == null) {
            throw new b2.z(defpackage.e.n("Requested backend isn't registered: ", scheme));
        }
        reVar.f23935a = jfVar;
        reVar.f23937c = this.f23996c;
        reVar.f23936b = j0VarE;
        if (!j0VarE.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = j0VarE.listIterator(j0VarE.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        throw new ClassCastException();
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        reVar.f23938d = uri;
        re reVar2 = new re();
        reVar2.f23935a = reVar.f23935a;
        reVar2.f23936b = reVar.f23936b;
        reVar2.f23937c = reVar.f23937c;
        reVar2.f23938d = reVar.f23938d;
        return reVar2;
    }
}

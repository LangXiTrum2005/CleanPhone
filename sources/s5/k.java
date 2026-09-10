package s5;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import cn.a0;
import cn.d0;
import cn.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import qk.i0;
import wj.r;
import xj.b0;
import xj.p;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xi.m f50168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f50169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wi.j f50170i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, xi.m mVar, wi.j jVar, ak.f fVar) {
        super(2, fVar);
        this.f50167f = 0;
        this.f50169h = oVar;
        this.f50168g = mVar;
        this.f50170i = jVar;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f50167f) {
            case 0:
                return new k(this.f50169h, this.f50168g, this.f50170i, fVar);
            case 1:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 1);
            case 2:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 2);
            case 3:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 3);
            case 4:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 4);
            case 5:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 5);
            case 6:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 6);
            default:
                return new k(this.f50168g, this.f50169h, this.f50170i, fVar, 7);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) throws RemoteException, IOException, OperationApplicationException {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f50167f) {
            case 0:
                k kVar = (k) create(a0Var, fVar);
                r rVar = r.f53297a;
                kVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                k kVar2 = (k) create(a0Var, fVar);
                r rVar2 = r.f53297a;
                kVar2.invokeSuspend(rVar2);
                return rVar2;
            case 2:
                k kVar3 = (k) create(a0Var, fVar);
                r rVar3 = r.f53297a;
                kVar3.invokeSuspend(rVar3);
                return rVar3;
            case 3:
                k kVar4 = (k) create(a0Var, fVar);
                r rVar4 = r.f53297a;
                kVar4.invokeSuspend(rVar4);
                return rVar4;
            case 4:
                k kVar5 = (k) create(a0Var, fVar);
                r rVar5 = r.f53297a;
                kVar5.invokeSuspend(rVar5);
                return rVar5;
            case 5:
                k kVar6 = (k) create(a0Var, fVar);
                r rVar6 = r.f53297a;
                kVar6.invokeSuspend(rVar6);
                return rVar6;
            case 6:
                k kVar7 = (k) create(a0Var, fVar);
                r rVar7 = r.f53297a;
                kVar7.invokeSuspend(rVar7);
                return rVar7;
            default:
                k kVar8 = (k) create(a0Var, fVar);
                r rVar8 = r.f53297a;
                kVar8.invokeSuspend(rVar8);
                return rVar8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:156:0x07de  */
    /* JADX WARN: Code duplicated, block: B:160:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:162:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:163:0x0800  */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws RemoteException, IOException, OperationApplicationException {
        Activity activity;
        ContentResolver contentResolver;
        Cursor cursorQuery;
        int i10 = this.f50167f;
        r rVar = r.f53297a;
        wi.j jVar = this.f50170i;
        o oVar = this.f50169h;
        xi.m mVar = this.f50168g;
        switch (i10) {
            case 0:
                hn.d dVar = oVar.f50188a;
                t9.e.z(obj);
                if (o.f50180d == null) {
                    jn.e eVar = n0.f6748a;
                    d0.w(dVar, hn.o.f42451a, new i(jVar, null, 0), 2);
                } else {
                    Object obj2 = mVar.f53823b;
                    kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    Context context = o.f50180d;
                    kotlin.jvm.internal.n.c(context);
                    if (b0.b.a(context, "android.permission.READ_CONTACTS") != 0) {
                        activity = o.f50179c;
                        if (activity != null) {
                            o.f50182f = jVar;
                            if (zBooleanValue) {
                                b0.b.i(activity, new String[]{"android.permission.READ_CONTACTS"}, 1);
                            } else {
                                b0.b.i(activity, new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}, 0);
                            }
                        }
                    } else {
                        if (!zBooleanValue) {
                            Context context2 = o.f50180d;
                            kotlin.jvm.internal.n.c(context2);
                            if (b0.b.a(context2, "android.permission.WRITE_CONTACTS") != 0) {
                                activity = o.f50179c;
                                if (activity != null) {
                                    o.f50182f = jVar;
                                    if (zBooleanValue) {
                                        b0.b.i(activity, new String[]{"android.permission.READ_CONTACTS"}, 1);
                                    } else {
                                        b0.b.i(activity, new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}, 0);
                                    }
                                }
                            }
                        }
                        jn.e eVar2 = n0.f6748a;
                        d0.w(dVar, hn.o.f42451a, new i(jVar, null, 1), 2);
                    }
                }
                return rVar;
            case 1:
                t9.e.z(obj);
                Object obj3 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj3;
                List list2 = (List) list.get(0);
                Object obj4 = list.get(1);
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                Object obj5 = list.get(2);
                kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                Object obj6 = list.get(3);
                kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue4 = ((Boolean) obj6).booleanValue();
                Object obj7 = list.get(4);
                kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue5 = ((Boolean) obj7).booleanValue();
                Object obj8 = list.get(5);
                kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue6 = ((Boolean) obj8).booleanValue();
                Object obj9 = list.get(6);
                kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue7 = ((Boolean) obj9).booleanValue();
                Object obj10 = list.get(7);
                kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue8 = ((Boolean) obj10).booleanValue();
                an.g gVar = h.f50155a;
                ContentResolver contentResolver2 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver2);
                List listK = x7.a.K(contentResolver2, list2, zBooleanValue2, zBooleanValue3 || zBooleanValue4, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, false);
                hn.d dVar2 = oVar.f50188a;
                jn.e eVar3 = n0.f6748a;
                d0.w(dVar2, hn.o.f42451a, new l(jVar, listK, null, 0), 2);
                return rVar;
            case 2:
                t9.e.z(obj);
                Object obj11 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj11;
                Object obj12 = list3.get(0);
                kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Object obj13 = list3.get(1);
                kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue9 = ((Boolean) obj13).booleanValue();
                an.g gVar2 = h.f50155a;
                ContentResolver contentResolver3 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver3);
                a aVarL = t9.e.l((Map) obj12);
                ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("aggregation_mode", 3);
                kotlin.jvm.internal.n.e(builderWithValue, "withValue(...)");
                ArrayList arrayList = new ArrayList();
                if (aVarL.f50141o.isEmpty()) {
                    ContentProviderOperation contentProviderOperationBuild = builderWithValue.build();
                    kotlin.jvm.internal.n.e(contentProviderOperationBuild, "build(...)");
                    arrayList.add(contentProviderOperationBuild);
                } else {
                    ContentProviderOperation contentProviderOperationBuild2 = builderWithValue.withValue("account_type", ((t5.a) xj.n.o0(aVarL.f50141o)).f50482b).withValue("account_name", ((t5.a) xj.n.o0(aVarL.f50141o)).f50483c).build();
                    kotlin.jvm.internal.n.e(contentProviderOperationBuild2, "build(...)");
                    arrayList.add(contentProviderOperationBuild2);
                }
                ArrayList arrayList2 = new ArrayList();
                x7.a.b(aVarL, arrayList2, null);
                int size = 499 - arrayList.size();
                if (size < 0) {
                    size = 0;
                }
                arrayList.addAll(xj.n.K0(arrayList2, size));
                ContentProviderResult[] contentProviderResultArrApplyBatch = contentResolver3.applyBatch("com.android.contacts", new ArrayList<>(arrayList));
                kotlin.jvm.internal.n.e(contentProviderResultArrApplyBatch, "applyBatch(...)");
                Uri uri = contentProviderResultArrApplyBatch[0].uri;
                kotlin.jvm.internal.n.c(uri);
                long id2 = ContentUris.parseId(uri);
                if (size < arrayList2.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    x7.a.b(aVarL, arrayList3, String.valueOf(id2));
                    while (size < arrayList3.size()) {
                        int iMin = Math.min(size + 499, arrayList3.size());
                        contentResolver3.applyBatch("com.android.contacts", new ArrayList<>(arrayList3.subList(size, iMin)));
                        size = iMin;
                    }
                }
                byte[] bArr = aVarL.f50131d;
                if (bArr != null) {
                    x7.a.e(contentResolver3, bArr, id2);
                }
                Uri uri2 = ContactsContract.RawContacts.CONTENT_URI;
                ContentValues contentValues = new ContentValues();
                contentValues.put("starred", Integer.valueOf(aVarL.f50132e ? 1 : 0));
                contentResolver3.update(uri2, contentValues, "_id=?", new String[]{String.valueOf(id2)});
                if (zBooleanValue9) {
                    List list4 = aVarL.f50134g;
                    ArrayList arrayList4 = new ArrayList(p.W(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(an.h.T0(((t5.i) it.next()).f50525a).toString());
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj14 : arrayList4) {
                        if (((String) obj14).length() > 0) {
                            arrayList5.add(obj14);
                        }
                    }
                    List listJ0 = xj.n.j0(arrayList5);
                    List list5 = aVarL.f50135h;
                    ArrayList arrayList6 = new ArrayList(p.W(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(an.h.T0(((t5.c) it2.next()).f50497a).toString());
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj15 : arrayList6) {
                        if (((String) obj15).length() > 0) {
                            arrayList7.add(obj15);
                        }
                    }
                    List listJ1 = xj.n.j0(arrayList7);
                    if (listJ0.isEmpty() && listJ1.isEmpty()) {
                        contentResolver = contentResolver3;
                    } else {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        if (!listJ0.isEmpty()) {
                            List list6 = listJ0;
                            arrayList8.add("(mimetype=? AND data1 IN (" + xj.n.u0(list6, ",", null, null, new bh.a(22), 30) + "))");
                            arrayList9.add("vnd.android.cursor.item/phone_v2");
                            t.a0(list6, arrayList9);
                        }
                        if (!listJ1.isEmpty()) {
                            List list7 = listJ1;
                            arrayList8.add("(mimetype=? AND data1 IN (" + xj.n.u0(list7, ",", null, null, new bh.a(23), 30) + "))");
                            arrayList9.add("vnd.android.cursor.item/email_v2");
                            t.a0(list7, arrayList9);
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        String strO = defpackage.e.o("raw_contact_id != ? AND (", xj.n.u0(arrayList8, " OR ", null, null, null, 62), ")");
                        h2.d dVar3 = new h2.d(2);
                        dVar3.f(String.valueOf(id2));
                        dVar3.h(arrayList9.toArray(new String[0]));
                        ArrayList arrayList10 = dVar3.f42079a;
                        Cursor cursorQuery2 = contentResolver3.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, strO, (String[]) arrayList10.toArray(new String[arrayList10.size()]), null);
                        contentResolver = contentResolver3;
                        if (cursorQuery2 != null) {
                            Cursor cursor = cursorQuery2;
                            try {
                                Cursor cursor2 = cursor;
                                while (cursor2.moveToNext()) {
                                    linkedHashSet.add(Long.valueOf(cursor2.getLong(cursor2.getColumnIndexOrThrow("raw_contact_id"))));
                                }
                                cursor.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    i0.j(cursor, th2);
                                    throw th3;
                                }
                            }
                        }
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            long jLongValue = ((Number) it3.next()).longValue();
                            Uri uri3 = ContactsContract.AggregationExceptions.CONTENT_URI;
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("type", (Integer) 2);
                            contentValues2.put("raw_contact_id1", Long.valueOf(id2));
                            contentValues2.put("raw_contact_id2", Long.valueOf(jLongValue));
                            contentResolver.update(uri3, contentValues2, null, null);
                        }
                    }
                } else {
                    contentResolver = contentResolver3;
                }
                Map map = (Map) xj.n.q0(x7.a.K(contentResolver, j1.f.C(String.valueOf(id2)), true, true, true, false, true, true, true, true));
                hn.d dVar4 = oVar.f50188a;
                jn.e eVar4 = n0.f6748a;
                d0.w(dVar4, hn.o.f42451a, new m(map, jVar, null, 0), 2);
                return rVar;
            case 3:
                t9.e.z(obj);
                Object obj16 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj16;
                Object obj17 = list8.get(0);
                kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Object obj18 = list8.get(1);
                kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue10 = ((Boolean) obj18).booleanValue();
                an.g gVar3 = h.f50155a;
                ContentResolver contentResolver4 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver4);
                ArrayList arrayList11 = new ArrayList();
                a aVarL2 = t9.e.l((Map) obj17);
                String str = aVarL2.f50128a;
                String str2 = ((t5.a) xj.n.o0(aVarL2.f50141o)).f50481a;
                Uri uri4 = ContactsContract.Data.CONTENT_URI;
                ContentProviderOperation contentProviderOperationBuild3 = ContentProviderOperation.newDelete(uri4).withSelection("contact_id=? and mimetype in (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new String[]{str, "vnd.android.cursor.item/name", "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/website", "vnd.android.cursor.item/im", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/note"}).build();
                kotlin.jvm.internal.n.e(contentProviderOperationBuild3, "build(...)");
                arrayList11.add(contentProviderOperationBuild3);
                if (aVarL2.f50131d == null && aVarL2.f50130c == null) {
                    ContentProviderOperation contentProviderOperationBuild4 = ContentProviderOperation.newDelete(uri4).withSelection("contact_id=? and mimetype=?", new String[]{str, "vnd.android.cursor.item/photo"}).build();
                    kotlin.jvm.internal.n.e(contentProviderOperationBuild4, "build(...)");
                    arrayList11.add(contentProviderOperationBuild4);
                }
                if (zBooleanValue10) {
                    ContentProviderOperation contentProviderOperationBuild5 = ContentProviderOperation.newDelete(uri4).withSelection("contact_id=? and mimetype=?", new String[]{str, "vnd.android.cursor.item/group_membership"}).build();
                    kotlin.jvm.internal.n.e(contentProviderOperationBuild5, "build(...)");
                    arrayList11.add(contentProviderOperationBuild5);
                }
                x7.a.b(aVarL2, arrayList11, str2);
                byte[] bArr2 = aVarL2.f50131d;
                if (bArr2 != null) {
                    x7.a.e(contentResolver4, bArr2, Long.parseLong(str2));
                }
                contentResolver4.applyBatch("com.android.contacts", new ArrayList<>(arrayList11));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("starred", Integer.valueOf(aVarL2.f50132e ? 1 : 0));
                contentResolver4.update(ContactsContract.Contacts.CONTENT_URI, contentValues3, "_id=?", new String[]{str});
                List listK2 = x7.a.K(contentResolver4, j1.f.C(str2), true, true, true, false, true, true, true, true);
                Map map2 = listK2.isEmpty() ? null : (Map) listK2.get(0);
                hn.d dVar5 = oVar.f50188a;
                jn.e eVar5 = n0.f6748a;
                d0.w(dVar5, hn.o.f42451a, new m(map2, jVar, null, 1), 2);
                return rVar;
            case 4:
                t9.e.z(obj);
                an.g gVar4 = h.f50155a;
                ContentResolver contentResolver5 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver5);
                Object obj19 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                List list9 = (List) obj19;
                if (!list9.isEmpty()) {
                    ArrayList arrayList12 = new ArrayList();
                    for (List list10 : xj.n.h0(list9)) {
                        String strO2 = defpackage.e.o("contact_id IN (", xj.n.u0(list10, ",", null, null, new bh.a(20), 30), ")");
                        String[] strArr = (String[]) list10.toArray(new String[0]);
                        try {
                            cursorQuery = contentResolver5.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id", "raw_contact_is_read_only"}, strO2, strArr, null);
                        } catch (IllegalArgumentException unused) {
                            cursorQuery = contentResolver5.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, strO2, strArr, null);
                        }
                        if (cursorQuery != null) {
                            Cursor cursor3 = cursorQuery;
                            try {
                                Cursor cursor4 = cursor3;
                                int columnIndex = cursor4.getColumnIndex("raw_contact_is_read_only");
                                int columnIndexOrThrow = cursor4.getColumnIndexOrThrow("_id");
                                while (cursor4.moveToNext()) {
                                    if ((columnIndex >= 0 ? cursor4.getInt(columnIndex) : 0) == 0) {
                                        String string = cursor4.getString(columnIndexOrThrow);
                                        kotlin.jvm.internal.n.e(string, "getString(...)");
                                        arrayList12.add(string);
                                    }
                                }
                                cursor3.close();
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    i0.j(cursor3, th4);
                                    throw th5;
                                }
                            }
                        }
                        break;
                    }
                    for (List list11 : xj.n.h0(arrayList12)) {
                        List list12 = list11;
                        String strU0 = xj.n.u0(list12, ",", null, null, new bh.a(21), 30);
                        try {
                            contentResolver5.delete(ContactsContract.RawContacts.CONTENT_URI, "_id IN (" + strU0 + ")", (String[]) list11.toArray(new String[0]));
                        } catch (Exception unused2) {
                            Iterator it4 = list12.iterator();
                            while (it4.hasNext()) {
                                try {
                                    contentResolver5.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{(String) it4.next()});
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                }
                hn.d dVar6 = oVar.f50188a;
                jn.e eVar6 = n0.f6748a;
                d0.w(dVar6, hn.o.f42451a, new i(jVar, null, 3), 2);
                return rVar;
            case 5:
                t9.e.z(obj);
                Object obj20 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object obj21 = ((List) obj20).get(0);
                kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Map map3 = (Map) obj21;
                an.g gVar5 = h.f50155a;
                ContentResolver contentResolver6 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver6);
                ArrayList arrayList13 = new ArrayList();
                Object obj22 = map3.get("id");
                kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type kotlin.String");
                Object obj23 = map3.get("name");
                kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj23;
                ContentProviderOperation contentProviderOperationBuild6 = ContentProviderOperation.newInsert(ContactsContract.Groups.CONTENT_URI).withValue("title", str3).build();
                kotlin.jvm.internal.n.e(contentProviderOperationBuild6, "build(...)");
                arrayList13.add(contentProviderOperationBuild6);
                ContentProviderResult[] contentProviderResultArrApplyBatch2 = contentResolver6.applyBatch("com.android.contacts", new ArrayList<>(arrayList13));
                kotlin.jvm.internal.n.e(contentProviderResultArrApplyBatch2, "applyBatch(...)");
                Uri uri5 = contentProviderResultArrApplyBatch2[0].uri;
                kotlin.jvm.internal.n.c(uri5);
                String strValueOf = String.valueOf(ContentUris.parseId(uri5));
                kotlin.jvm.internal.n.f(strValueOf, "<set-?>");
                Map mapQ = b0.Q(new wj.f("id", strValueOf), new wj.f("name", str3));
                hn.d dVar7 = oVar.f50188a;
                jn.e eVar7 = n0.f6748a;
                d0.w(dVar7, hn.o.f42451a, new l(jVar, mapQ, null, 1), 2);
                return rVar;
            case 6:
                t9.e.z(obj);
                Object obj24 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object obj25 = ((List) obj24).get(0);
                kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Map map4 = (Map) obj25;
                an.g gVar6 = h.f50155a;
                ContentResolver contentResolver7 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver7);
                ArrayList arrayList14 = new ArrayList();
                Object obj26 = map4.get("id");
                kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                Object obj27 = map4.get("name");
                kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                ContentProviderOperation contentProviderOperationBuild7 = ContentProviderOperation.newUpdate(ContactsContract.Groups.CONTENT_URI).withSelection("_id=?", new String[]{(String) obj26}).withValue("title", (String) obj27).build();
                kotlin.jvm.internal.n.e(contentProviderOperationBuild7, "build(...)");
                arrayList14.add(contentProviderOperationBuild7);
                contentResolver7.applyBatch("com.android.contacts", new ArrayList<>(arrayList14));
                hn.d dVar8 = oVar.f50188a;
                jn.e eVar8 = n0.f6748a;
                d0.w(dVar8, hn.o.f42451a, new m(jVar, map4, null), 2);
                return rVar;
            default:
                t9.e.z(obj);
                Object obj28 = mVar.f53823b;
                kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                Object obj29 = ((List) obj28).get(0);
                kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                Map map5 = (Map) obj29;
                an.g gVar7 = h.f50155a;
                ContentResolver contentResolver8 = o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver8);
                ArrayList arrayList15 = new ArrayList();
                Object obj30 = map5.get("id");
                kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                Object obj31 = map5.get("name");
                kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type kotlin.String");
                ContentProviderOperation contentProviderOperationBuild8 = ContentProviderOperation.newDelete(ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", com.ironsource.mediationsdk.metadata.a.f29610g).build()).withSelection("_id=?", new String[]{(String) obj30}).build();
                kotlin.jvm.internal.n.e(contentProviderOperationBuild8, "build(...)");
                arrayList15.add(contentProviderOperationBuild8);
                kotlin.jvm.internal.n.e(contentResolver8.applyBatch("com.android.contacts", new ArrayList<>(arrayList15)), "applyBatch(...)");
                hn.d dVar9 = oVar.f50188a;
                jn.e eVar9 = n0.f6748a;
                d0.w(dVar9, hn.o.f42451a, new i(jVar, null, 4), 2);
                return rVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(xi.m mVar, o oVar, wi.j jVar, ak.f fVar, int i10) {
        super(2, fVar);
        this.f50167f = i10;
        this.f50168g = mVar;
        this.f50169h = oVar;
        this.f50170i = jVar;
    }
}

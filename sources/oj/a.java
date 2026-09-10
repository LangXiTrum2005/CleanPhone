package oj;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements ti.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f47463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne.a f47464b = new ne.a(4);

    public static void d(xi.f fVar, final a aVar) {
        ne.c cVarH = fVar.h(new xi.k());
        b bVar = b.f47467e;
        k5.g gVar = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", bVar, cVarH);
        if (aVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i11 = i10;
                    a aVar2 = this.f47476b;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", bVar, cVarH);
        if (aVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i12 = i11;
                    a aVar2 = this.f47476b;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", bVar, cVarH);
        if (aVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i13 = i12;
                    a aVar2 = this.f47476b;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", bVar, cVarH);
        if (aVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i14 = i13;
                    a aVar2 = this.f47476b;
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", bVar, cVarH);
        if (aVar != null) {
            final int i14 = 4;
            gVar5.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i15 = i14;
                    a aVar2 = this.f47476b;
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", bVar, cVarH);
        if (aVar != null) {
            final int i15 = 5;
            gVar6.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i16 = i15;
                    a aVar2 = this.f47476b;
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", bVar, cVarH);
        if (aVar != null) {
            final int i16 = 6;
            gVar7.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i17 = i16;
                    a aVar2 = this.f47476b;
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", bVar, cVarH);
        if (aVar != null) {
            final int i17 = 7;
            gVar8.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i18 = i17;
                    a aVar2 = this.f47476b;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", bVar, cVarH);
        if (aVar == null) {
            gVar9.C(null);
        } else {
            final int i18 = 8;
            gVar9.C(new xi.b(aVar) { // from class: oj.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f47476b;

                {
                    this.f47476b = aVar;
                }

                @Override // xi.b
                public final void t(Object obj, wi.b bVar2) {
                    int i19 = i18;
                    a aVar2 = this.f47476b;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(aVar2.f47463a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th2) {
                                arrayList = go.c.K(th2);
                            }
                            bVar2.e(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(aVar2.f47463a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                arrayList2 = go.c.K(th3);
                            }
                            bVar2.e(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, aVar2.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th4) {
                                arrayList4 = go.c.K(th4);
                            }
                            bVar2.e(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(aVar2.f47463a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th5) {
                                arrayList6 = go.c.K(th5);
                            }
                            bVar2.e(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d10 = (Double) arrayList9.get(1);
                            try {
                                aVar2.getClass();
                                String string = Double.toString(d10.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th6) {
                                arrayList8 = go.c.K(th6);
                            }
                            bVar2.e(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th7) {
                                arrayList10 = go.c.K(th7);
                            }
                            bVar2.e(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(aVar2.f47463a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar2.f47464b.l(list)).commit()));
                            } catch (Throwable th8) {
                                arrayList12 = go.c.K(th8);
                            }
                            bVar2.e(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, aVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th9) {
                                arrayList14 = go.c.K(th9);
                            }
                            bVar2.e(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, aVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th10) {
                                arrayList16 = go.c.K(th10);
                            }
                            bVar2.e(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor editorEdit = this.f47463a.edit();
        Map<String, ?> all = this.f47463a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final HashMap b(String str, List list) {
        Object bigInteger;
        Object objValueOf;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f47463a.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj = all.get(str2);
                Objects.requireNonNull(obj);
                boolean z10 = obj instanceof String;
                ne.a aVar = this.f47464b;
                if (z10) {
                    String str3 = (String) obj;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            objValueOf = obj;
                            String strSubstring = str3.substring(40);
                            aVar.getClass();
                            try {
                                objValueOf = (List) new c0(new ByteArrayInputStream(Base64.decode(strSubstring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str3.substring(44), 36);
                        objValueOf = bigInteger;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        objValueOf = obj;
                        objValueOf = Double.valueOf(str3.substring(40));
                    }
                } else if (obj instanceof Set) {
                    objValueOf = obj;
                    ArrayList arrayList = new ArrayList((Set) obj);
                    this.f47463a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar.l(arrayList)).apply();
                    bigInteger = arrayList;
                    objValueOf = bigInteger;
                }
                objValueOf = obj;
                objValueOf = obj;
                objValueOf = obj;
                map.put(str2, objValueOf);
            }
        }
        return map;
    }

    public final Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f47463a.edit().putString(str, str2).commit());
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        xi.f fVar = aVar.f50789c;
        this.f47463a = aVar.f50787a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        d(aVar.f50789c, null);
    }
}

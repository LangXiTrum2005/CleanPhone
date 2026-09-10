package nb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n7;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.X3;
import ea.z1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import k9.c0;
import oa.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tc.b f46661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46662b = null;

    public c(tc.b bVar) {
        this.f46661a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f46655a;
        String str2 = bVar.f46656b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f46655a.equals(str) && bVar2.f46656b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        qb.c cVar = (qb.c) ((qb.b) this.f46661a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.f48930a.f24514a.f("frc", "")) {
            u0 u0Var = rb.a.f49520a;
            c0.h(bundle);
            qb.a aVar = new qb.a();
            String str = (String) z1.e(bundle, "origin", String.class, null);
            c0.h(str);
            aVar.f48915a = str;
            String str2 = (String) z1.e(bundle, "name", String.class, null);
            c0.h(str2);
            aVar.f48916b = str2;
            aVar.f48917c = z1.e(bundle, X3.i.X, Object.class, null);
            aVar.f48918d = (String) z1.e(bundle, "trigger_event_name", String.class, null);
            aVar.f48919e = ((Long) z1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f48920f = (String) z1.e(bundle, "timed_out_event_name", String.class, null);
            aVar.f48921g = (Bundle) z1.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f48922h = (String) z1.e(bundle, "triggered_event_name", String.class, null);
            aVar.f48923i = (Bundle) z1.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.f48924j = ((Long) z1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f48925k = (String) z1.e(bundle, "expired_event_name", String.class, null);
            aVar.l = (Bundle) z1.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f48927n = ((Boolean) z1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f48926m = ((Long) z1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f48928o = ((Long) z1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x028e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0292  */
    /* JADX WARN: Code duplicated, block: B:112:0x029a  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:140:0x0307  */
    /* JADX WARN: Code duplicated, block: B:143:0x0317  */
    /* JADX WARN: Code duplicated, block: B:146:0x0320  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    /* JADX WARN: Code duplicated, block: B:98:0x026a  */
    public final void c(ArrayList arrayList) throws a {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        String str;
        String str2;
        Bundle bundle;
        String str3;
        Object obj;
        String str4;
        String str5;
        Bundle bundle2;
        String str6;
        Bundle bundle3;
        String str7;
        Bundle bundle4;
        tc.b bVar = this.f46661a;
        if (bVar.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<b> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str8 = "";
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (bVar.get() == null) {
                        throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        String str9 = ((qb.a) it2.next()).f48916b;
                        c8 c8Var = ((qb.c) ((qb.b) bVar.get())).f48930a.f24514a;
                        c8Var.c(new n7(c8Var, str9, (String) null, (Bundle) null));
                    }
                    return;
                }
                if (bVar.get() == null) {
                    throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<qb.a> arrayListB = b();
                ArrayList<b> arrayList3 = new ArrayList();
                for (qb.a aVar : arrayListB) {
                    String[] strArr = b.f46653g;
                    String str10 = aVar.f48918d;
                    arrayList3.add(new b(aVar.f48916b, String.valueOf(aVar.f48917c), str10 != null ? str10 : str8, new Date(aVar.f48926m), aVar.f48919e, aVar.f48924j));
                    str8 = str8;
                }
                ArrayList arrayList4 = new ArrayList();
                for (b bVar2 : arrayList3) {
                    if (!a(arrayList2, bVar2)) {
                        arrayList4.add(bVar2.a());
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    String str11 = ((qb.a) it3.next()).f48916b;
                    c8 c8Var2 = ((qb.c) ((qb.b) bVar.get())).f48930a.f24514a;
                    c8Var2.c(new n7(c8Var2, str11, (String) null, (Bundle) null));
                }
                ArrayList<b> arrayList5 = new ArrayList();
                for (b bVar3 : arrayList2) {
                    if (!a(arrayList3, bVar3)) {
                        arrayList5.add(bVar3);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f46662b == null) {
                    this.f46662b = Integer.valueOf(((qb.c) ((qb.b) bVar.get())).f48930a.f24514a.b("frc"));
                }
                int iIntValue = this.f46662b.intValue();
                for (b bVar4 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        String str12 = ((qb.a) arrayDeque.pollFirst()).f48916b;
                        c8 c8Var3 = ((qb.c) ((qb.b) bVar.get())).f48930a.f24514a;
                        c8Var3.c(new n7(c8Var3, str12, (String) null, (Bundle) null));
                    }
                    qb.a aVarA = bVar4.a();
                    qb.c cVar = (qb.c) ((qb.b) bVar.get());
                    cVar.getClass();
                    u0 u0Var = rb.a.f49520a;
                    String str13 = aVarA.f48915a;
                    if (!str13.isEmpty()) {
                        Object obj2 = aVarA.f48917c;
                        if (obj2 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj2);
                                    objectOutputStream.flush();
                                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object object = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            object = null;
                                        }
                                        if (object != null) {
                                            if (!rb.a.a(str13) && rb.a.c(str13, aVarA.f48916b)) {
                                                String str14 = aVarA.f48925k;
                                                if (str14 == null) {
                                                    str = aVarA.f48922h;
                                                    if (str == null) {
                                                        str2 = aVarA.f48920f;
                                                        if (str2 != null) {
                                                            if (rb.a.b(aVarA.f48921g, str2)) {
                                                                if (rb.a.d(str13, aVarA.f48921g, aVarA.f48920f)) {
                                                                }
                                                            }
                                                        }
                                                        AppMeasurementSdk appMeasurementSdk = cVar.f48930a;
                                                        bundle = new Bundle();
                                                        bundle.putString("origin", aVarA.f48915a);
                                                        str3 = aVarA.f48916b;
                                                        if (str3 != null) {
                                                            bundle.putString("name", str3);
                                                        }
                                                        obj = aVarA.f48917c;
                                                        if (obj != null) {
                                                            z1.c(bundle, obj);
                                                        }
                                                        str4 = aVarA.f48918d;
                                                        if (str4 != null) {
                                                            bundle.putString("trigger_event_name", str4);
                                                        }
                                                        bundle.putLong("trigger_timeout", aVarA.f48919e);
                                                        str5 = aVarA.f48920f;
                                                        if (str5 != null) {
                                                            bundle.putString("timed_out_event_name", str5);
                                                        }
                                                        bundle2 = aVarA.f48921g;
                                                        if (bundle2 != null) {
                                                            bundle.putBundle("timed_out_event_params", bundle2);
                                                        }
                                                        str6 = aVarA.f48922h;
                                                        if (str6 != null) {
                                                            bundle.putString("triggered_event_name", str6);
                                                        }
                                                        bundle3 = aVarA.f48923i;
                                                        if (bundle3 != null) {
                                                            bundle.putBundle("triggered_event_params", bundle3);
                                                        }
                                                        bundle.putLong("time_to_live", aVarA.f48924j);
                                                        str7 = aVarA.f48925k;
                                                        if (str7 != null) {
                                                            bundle.putString("expired_event_name", str7);
                                                        }
                                                        bundle4 = aVarA.l;
                                                        if (bundle4 != null) {
                                                            bundle.putBundle("expired_event_params", bundle4);
                                                        }
                                                        bundle.putLong("creation_timestamp", aVarA.f48926m);
                                                        bundle.putBoolean("active", aVarA.f48927n);
                                                        bundle.putLong("triggered_timestamp", aVarA.f48928o);
                                                        c8 c8Var4 = appMeasurementSdk.f24514a;
                                                        c8Var4.c(new m7(c8Var4, bundle, 0));
                                                    } else if (rb.a.b(aVarA.f48923i, str)) {
                                                        if (rb.a.d(str13, aVarA.f48923i, aVarA.f48922h)) {
                                                            str2 = aVarA.f48920f;
                                                            if (str2 != null) {
                                                                if (rb.a.b(aVarA.f48921g, str2)) {
                                                                    if (rb.a.d(str13, aVarA.f48921g, aVarA.f48920f)) {
                                                                    }
                                                                }
                                                            }
                                                            AppMeasurementSdk appMeasurementSdk2 = cVar.f48930a;
                                                            bundle = new Bundle();
                                                            bundle.putString("origin", aVarA.f48915a);
                                                            str3 = aVarA.f48916b;
                                                            if (str3 != null) {
                                                                bundle.putString("name", str3);
                                                            }
                                                            obj = aVarA.f48917c;
                                                            if (obj != null) {
                                                                z1.c(bundle, obj);
                                                            }
                                                            str4 = aVarA.f48918d;
                                                            if (str4 != null) {
                                                                bundle.putString("trigger_event_name", str4);
                                                            }
                                                            bundle.putLong("trigger_timeout", aVarA.f48919e);
                                                            str5 = aVarA.f48920f;
                                                            if (str5 != null) {
                                                                bundle.putString("timed_out_event_name", str5);
                                                            }
                                                            bundle2 = aVarA.f48921g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str6 = aVarA.f48922h;
                                                            if (str6 != null) {
                                                                bundle.putString("triggered_event_name", str6);
                                                            }
                                                            bundle3 = aVarA.f48923i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", aVarA.f48924j);
                                                            str7 = aVarA.f48925k;
                                                            if (str7 != null) {
                                                                bundle.putString("expired_event_name", str7);
                                                            }
                                                            bundle4 = aVarA.l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", aVarA.f48926m);
                                                            bundle.putBoolean("active", aVarA.f48927n);
                                                            bundle.putLong("triggered_timestamp", aVarA.f48928o);
                                                            c8 c8Var5 = appMeasurementSdk2.f24514a;
                                                            c8Var5.c(new m7(c8Var5, bundle, 0));
                                                        }
                                                    }
                                                } else if (rb.a.b(aVarA.l, str14)) {
                                                    if (rb.a.d(str13, aVarA.l, aVarA.f48925k)) {
                                                        str = aVarA.f48922h;
                                                        if (str == null) {
                                                            str2 = aVarA.f48920f;
                                                            if (str2 != null) {
                                                                if (rb.a.b(aVarA.f48921g, str2)) {
                                                                    if (rb.a.d(str13, aVarA.f48921g, aVarA.f48920f)) {
                                                                    }
                                                                }
                                                            }
                                                            AppMeasurementSdk appMeasurementSdk3 = cVar.f48930a;
                                                            bundle = new Bundle();
                                                            bundle.putString("origin", aVarA.f48915a);
                                                            str3 = aVarA.f48916b;
                                                            if (str3 != null) {
                                                                bundle.putString("name", str3);
                                                            }
                                                            obj = aVarA.f48917c;
                                                            if (obj != null) {
                                                                z1.c(bundle, obj);
                                                            }
                                                            str4 = aVarA.f48918d;
                                                            if (str4 != null) {
                                                                bundle.putString("trigger_event_name", str4);
                                                            }
                                                            bundle.putLong("trigger_timeout", aVarA.f48919e);
                                                            str5 = aVarA.f48920f;
                                                            if (str5 != null) {
                                                                bundle.putString("timed_out_event_name", str5);
                                                            }
                                                            bundle2 = aVarA.f48921g;
                                                            if (bundle2 != null) {
                                                                bundle.putBundle("timed_out_event_params", bundle2);
                                                            }
                                                            str6 = aVarA.f48922h;
                                                            if (str6 != null) {
                                                                bundle.putString("triggered_event_name", str6);
                                                            }
                                                            bundle3 = aVarA.f48923i;
                                                            if (bundle3 != null) {
                                                                bundle.putBundle("triggered_event_params", bundle3);
                                                            }
                                                            bundle.putLong("time_to_live", aVarA.f48924j);
                                                            str7 = aVarA.f48925k;
                                                            if (str7 != null) {
                                                                bundle.putString("expired_event_name", str7);
                                                            }
                                                            bundle4 = aVarA.l;
                                                            if (bundle4 != null) {
                                                                bundle.putBundle("expired_event_params", bundle4);
                                                            }
                                                            bundle.putLong("creation_timestamp", aVarA.f48926m);
                                                            bundle.putBoolean("active", aVarA.f48927n);
                                                            bundle.putLong("triggered_timestamp", aVarA.f48928o);
                                                            c8 c8Var6 = appMeasurementSdk3.f24514a;
                                                            c8Var6.c(new m7(c8Var6, bundle, 0));
                                                        } else if (rb.a.b(aVarA.f48923i, str)) {
                                                            if (rb.a.d(str13, aVarA.f48923i, aVarA.f48922h)) {
                                                                str2 = aVarA.f48920f;
                                                                if (str2 != null) {
                                                                    if (rb.a.b(aVarA.f48921g, str2)) {
                                                                        if (rb.a.d(str13, aVarA.f48921g, aVarA.f48920f)) {
                                                                        }
                                                                    }
                                                                }
                                                                AppMeasurementSdk appMeasurementSdk4 = cVar.f48930a;
                                                                bundle = new Bundle();
                                                                bundle.putString("origin", aVarA.f48915a);
                                                                str3 = aVarA.f48916b;
                                                                if (str3 != null) {
                                                                    bundle.putString("name", str3);
                                                                }
                                                                obj = aVarA.f48917c;
                                                                if (obj != null) {
                                                                    z1.c(bundle, obj);
                                                                }
                                                                str4 = aVarA.f48918d;
                                                                if (str4 != null) {
                                                                    bundle.putString("trigger_event_name", str4);
                                                                }
                                                                bundle.putLong("trigger_timeout", aVarA.f48919e);
                                                                str5 = aVarA.f48920f;
                                                                if (str5 != null) {
                                                                    bundle.putString("timed_out_event_name", str5);
                                                                }
                                                                bundle2 = aVarA.f48921g;
                                                                if (bundle2 != null) {
                                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                                }
                                                                str6 = aVarA.f48922h;
                                                                if (str6 != null) {
                                                                    bundle.putString("triggered_event_name", str6);
                                                                }
                                                                bundle3 = aVarA.f48923i;
                                                                if (bundle3 != null) {
                                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                                }
                                                                bundle.putLong("time_to_live", aVarA.f48924j);
                                                                str7 = aVarA.f48925k;
                                                                if (str7 != null) {
                                                                    bundle.putString("expired_event_name", str7);
                                                                }
                                                                bundle4 = aVarA.l;
                                                                if (bundle4 != null) {
                                                                    bundle.putBundle("expired_event_params", bundle4);
                                                                }
                                                                bundle.putLong("creation_timestamp", aVarA.f48926m);
                                                                bundle.putBoolean("active", aVarA.f48927n);
                                                                bundle.putLong("triggered_timestamp", aVarA.f48928o);
                                                                c8 c8Var7 = appMeasurementSdk4.f24514a;
                                                                c8Var7.c(new m7(c8Var7, bundle, 0));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    objectInputStream = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                objectOutputStream = null;
                                objectInputStream = null;
                            }
                        } else if (!rb.a.a(str13)) {
                        }
                    }
                    arrayDeque.offer(aVarA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = b.f46653g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = b.f46653g;
            for (int i10 = 0; i10 < 5; i10++) {
                String str15 = strArr3[i10];
                if (!map.containsKey(str15)) {
                    arrayList6.add(str15);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", b.f46654h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e10) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
            } catch (ParseException e11) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e11);
            }
        }
    }
}

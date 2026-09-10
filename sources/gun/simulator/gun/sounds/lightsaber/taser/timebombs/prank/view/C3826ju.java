package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zziq;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3826ju {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AW f4575a;
    public final String b = "frc";
    public Integer c = null;

    public C3826ju(AW aw) {
        this.f4575a = aw;
    }

    public static boolean a(ArrayList arrayList, Z z) {
        String str = z.f4051a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Z z2 = (Z) it.next();
            if (z2.f4051a.equals(str) && z2.b.equals(z.b)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        C3315e4 c3315e4 = (C3315e4) ((InterfaceC3227d4) this.f4575a.get());
        c3315e4.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : c3315e4.f4306a.getConditionalUserProperties(this.b, "")) {
            zzja zzjaVar = gp0.f4435a;
            Preconditions.checkNotNull(bundle);
            C3138c4 c3138c4 = new C3138c4();
            c3138c4.f4202a = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, "origin", String.class, null));
            c3138c4.b = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, "name", String.class, null));
            c3138c4.c = zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            c3138c4.d = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            c3138c4.e = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            c3138c4.f = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            c3138c4.g = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            c3138c4.h = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            c3138c4.i = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            c3138c4.j = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            c3138c4.k = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            c3138c4.l = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            c3138c4.n = ((Boolean) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            c3138c4.m = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            c3138c4.o = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(c3138c4);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) throws Y {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        AW aw = this.f4575a;
        if (aw.get() == null) {
            throw new Y("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<Z> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (aw.get() == null) {
                        throw new Y("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        ((C3315e4) ((InterfaceC3227d4) aw.get())).f4306a.clearConditionalUserProperty(((C3138c4) it2.next()).b, null, null);
                    }
                    return;
                }
                if (aw.get() == null) {
                    throw new Y("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<C3138c4> arrayListB = b();
                ArrayList arrayList3 = new ArrayList();
                for (C3138c4 c3138c4 : arrayListB) {
                    String[] strArr = Z.g;
                    String str5 = c3138c4.d;
                    arrayList3.add(new Z(c3138c4.b, String.valueOf(c3138c4.c), str5 != null ? str5 : "", new Date(c3138c4.m), c3138c4.e, c3138c4.j));
                    aw = aw;
                }
                AW aw2 = aw;
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    str = this.b;
                    if (!zHasNext) {
                        break;
                    }
                    Z z = (Z) it3.next();
                    if (!a(arrayList2, z)) {
                        arrayList4.add(z.a(str));
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ((C3315e4) ((InterfaceC3227d4) aw2.get())).f4306a.clearConditionalUserProperty(((C3138c4) it4.next()).b, null, null);
                }
                ArrayList<Z> arrayList5 = new ArrayList();
                for (Z z2 : arrayList2) {
                    if (!a(arrayList3, z2)) {
                        arrayList5.add(z2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.c == null) {
                    this.c = Integer.valueOf(((C3315e4) ((InterfaceC3227d4) aw2.get())).f4306a.getMaxUserProperties(str));
                }
                int iIntValue = this.c.intValue();
                for (Z z3 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        ((C3315e4) ((InterfaceC3227d4) aw2.get())).f4306a.clearConditionalUserProperty(((C3138c4) arrayDeque.pollFirst()).b, null, null);
                    }
                    C3138c4 c3138c4A = z3.a(str);
                    C3315e4 c3315e4 = (C3315e4) ((InterfaceC3227d4) aw2.get());
                    c3315e4.getClass();
                    zzja zzjaVar = gp0.f4435a;
                    String str6 = c3138c4A.f4202a;
                    if (str6 != null && !str6.isEmpty() && ((obj = c3138c4A.c) == null || zziq.zza(obj) != null)) {
                        if ((!gp0.b.contains(str6)) && gp0.c(str6, c3138c4A.b) && (((str2 = c3138c4A.k) == null || (gp0.b(c3138c4A.l, str2) && gp0.a(str6, c3138c4A.k, c3138c4A.l))) && (((str3 = c3138c4A.h) == null || (gp0.b(c3138c4A.i, str3) && gp0.a(str6, c3138c4A.h, c3138c4A.i))) && ((str4 = c3138c4A.f) == null || (gp0.b(c3138c4A.g, str4) && gp0.a(str6, c3138c4A.f, c3138c4A.g)))))) {
                            Bundle bundle = new Bundle();
                            String str7 = c3138c4A.f4202a;
                            if (str7 != null) {
                                bundle.putString("origin", str7);
                            }
                            String str8 = c3138c4A.b;
                            if (str8 != null) {
                                bundle.putString("name", str8);
                            }
                            Object obj2 = c3138c4A.c;
                            if (obj2 != null) {
                                zzgz.zzb(bundle, obj2);
                            }
                            String str9 = c3138c4A.d;
                            if (str9 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str9);
                            }
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, c3138c4A.e);
                            String str10 = c3138c4A.f;
                            if (str10 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str10);
                            }
                            Bundle bundle2 = c3138c4A.g;
                            if (bundle2 != null) {
                                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                            }
                            String str11 = c3138c4A.h;
                            if (str11 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str11);
                            }
                            Bundle bundle3 = c3138c4A.i;
                            if (bundle3 != null) {
                                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                            }
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, c3138c4A.j);
                            String str12 = c3138c4A.k;
                            if (str12 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str12);
                            }
                            Bundle bundle4 = c3138c4A.l;
                            if (bundle4 != null) {
                                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                            }
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, c3138c4A.m);
                            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, c3138c4A.n);
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, c3138c4A.o);
                            c3315e4.f4306a.setConditionalUserProperty(bundle);
                        }
                    }
                    arrayDeque.offer(c3138c4A);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = Z.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = Z.g;
            for (int i = 0; i < 5; i++) {
                String str13 = strArr3[i];
                if (!map.containsKey(str13)) {
                    arrayList6.add(str13);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new Y(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new Z((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", Z.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new Y("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new Y("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}

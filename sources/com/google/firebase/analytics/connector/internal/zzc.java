package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImmutableSet f20186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableList f20187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImmutableList f20188c;
    public static final ImmutableList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableList f20189e;
    public static final ImmutableList f;

    static {
        int i2 = ImmutableSet.Z;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f20186a = ImmutableSet.t(15, objArr);
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        ObjectArrays.a(7, objArr2);
        f20187b = ImmutableList.p(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        ObjectArrays.a(3, objArr3);
        f20188c = ImmutableList.p(3, objArr3);
        d = ImmutableList.A("_r", "_dbg");
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.i(zzjo.zza);
        builder.i(zzjo.zzb);
        f20189e = builder.j();
        f = ImmutableList.A("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Bundle bundle, String str) {
        if (f20187b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = d;
        int size = immutableList.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i2));
            i2++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Bundle bundle, String str, String str2) {
        byte b2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f20188c.contains(str) && bundle != null) {
            ImmutableList immutableList = d;
            int size = immutableList.size();
            int i2 = 0;
            while (i2 < size) {
                boolean zContainsKey = bundle.containsKey((String) immutableList.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("fdl")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
            if (b2 == 1) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
            if (b2 == 2) {
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
        }
        return false;
    }
}

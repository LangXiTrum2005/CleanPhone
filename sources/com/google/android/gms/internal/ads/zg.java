package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioDescriptor;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg {
    public static ca1 a(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            aa1 aa1Var = ca1.f13122b;
            return ya1.f22208e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(o02.f18074b).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorD = com.applovin.impl.sdk.b0.d(it.next());
            if (audioDescriptorD.getStandard() == 1) {
                byte[] descriptor = audioDescriptorD.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    com.applovin.impl.ca.r(new StringBuilder(String.valueOf(length).length() + 20), "Invalid SAD length: ", length, "AudioDescriptorUtil");
                } else {
                    byte b10 = descriptor[0];
                    int i10 = (b10 & 7) + 1;
                    if (((b10 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(uu0.e(i10)));
                    }
                }
            }
        }
        return ca1.y(treeSet);
    }

    public static String b(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        le1 le1Var = new le1();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new ye(le1Var, 1));
        return (String) le1Var.get();
    }
}

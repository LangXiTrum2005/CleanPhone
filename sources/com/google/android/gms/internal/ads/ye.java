package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ye implements PackageManager$OnChecksumsReadyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22216b;

    public /* synthetic */ ye(Object obj, int i10) {
        this.f22215a = i10;
        this.f22216b = obj;
    }

    public final void onChecksumsReady(List list) {
        int i10 = this.f22215a;
        int i11 = 0;
        Object obj = this.f22216b;
        switch (i10) {
            case 0:
                if (list == null) {
                    ((le1) obj).c("");
                } else {
                    try {
                        int size = list.size();
                        while (i11 < size) {
                            ApkChecksum apkChecksumB = com.applovin.impl.sdk.b0.b(list.get(i11));
                            if (apkChecksumB.getType() == 8) {
                                rb1 rb1VarF = rb1.f19515f.f();
                                byte[] value = apkChecksumB.getValue();
                                ((le1) obj).c(rb1VarF.g(value.length, value));
                            } else {
                                i11++;
                            }
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                    ((le1) obj).c("");
                }
                break;
            case 1:
                le1 le1Var = (le1) obj;
                if (list == null) {
                    le1Var.c(null);
                } else {
                    try {
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            ApkChecksum apkChecksumB2 = com.applovin.impl.sdk.b0.b(list.get(i12));
                            if (apkChecksumB2.getType() == 8) {
                                byte[] value2 = apkChecksumB2.getValue();
                                char[] cArr = ig.f15734a;
                                int length = value2.length;
                                char[] cArr2 = new char[length + length];
                                while (i11 < value2.length) {
                                    byte b10 = value2[i11];
                                    char[] cArr3 = ig.f15734a;
                                    int i13 = i11 + i11;
                                    cArr2[i13] = cArr3[(b10 & 255) >>> 4];
                                    cArr2[i13 + 1] = cArr3[b10 & 15];
                                    i11++;
                                }
                                le1Var.c(new String(cArr2));
                            }
                            break;
                        }
                        le1Var.c(null);
                    } catch (Throwable unused2) {
                        le1Var.c(null);
                        return;
                    }
                }
                break;
            default:
                z.i iVar = (z.i) obj;
                if (list == null) {
                    iVar.a("");
                } else {
                    try {
                        int size3 = list.size();
                        while (i11 < size3) {
                            ApkChecksum apkChecksumB3 = com.applovin.impl.sdk.b0.b(list.get(i11));
                            if (apkChecksumB3.getType() == 8) {
                                rb1 rb1VarF2 = rb1.f19515f.f();
                                byte[] value3 = apkChecksumB3.getValue();
                                iVar.a(rb1VarF2.g(value3.length, value3));
                            } else {
                                i11++;
                            }
                            break;
                        }
                    } catch (Throwable unused3) {
                    }
                    iVar.a("");
                }
                break;
        }
    }

    public ye() {
        this.f22215a = 0;
        this.f22216b = new le1();
    }
}

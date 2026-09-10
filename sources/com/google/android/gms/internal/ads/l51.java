package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f16739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f16740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f16741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dx1 f16742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a71 f16743e;

    public l51(Context context, SharedPreferences sharedPreferences, dx1 dx1Var, a71 a71Var) {
        this.f16741c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        rb0.C(dir, false);
        this.f16739a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        rb0.C(dir2, true);
        this.f16740b = dir2;
        this.f16742d = dx1Var;
        this.f16743e = a71Var;
    }

    public final void a(l31 l31Var, byte[] bArr, byte[] bArr2) {
        String strZ = l31Var.z().z();
        boolean zIsEmpty = TextUtils.isEmpty(strZ);
        a71 a71Var = this.f16743e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.f16740b;
            rb0.G(file);
            file.mkdirs();
            File fileV = rb0.v(file, strZ);
            fileV.getClass();
            fileV.mkdirs();
            File fileD = rb0.d(strZ, "pcam.jar", file);
            fileD.getClass();
            if (bArr == null || bArr.length <= 0 || rb0.t(fileD, bArr)) {
                File fileD2 = rb0.d(strZ, "pcbc", file);
                fileD2.getClass();
                if (rb0.t(fileD2, bArr2)) {
                    String strZ2 = l31Var.z().z();
                    if (!TextUtils.isEmpty(strZ2)) {
                        File fileD3 = rb0.d(strZ2, "pcam.jar", file);
                        fileD3.getClass();
                        File fileD4 = rb0.d(strZ2, "pcbc", file);
                        fileD4.getClass();
                        File fileD5 = rb0.d(strZ2, "pcam.jar", c());
                        fileD5.getClass();
                        File fileD6 = rb0.d(strZ2, "pcbc", c());
                        fileD6.getClass();
                        if (fileD3.exists() && !fileD3.renameTo(fileD5)) {
                            a71Var.b(15318);
                        } else if (fileD4.exists() && fileD4.renameTo(fileD6)) {
                            l31 l31VarB = b(1);
                            SharedPreferences.Editor editorEdit = this.f16741c.edit();
                            if (l31VarB != null && !l31Var.z().z().equals(l31VarB.z().z())) {
                                editorEdit.putString(d(), p9.c.b(l31VarB.b()));
                            }
                            editorEdit.putString(e(), p9.c.b(l31Var.b()));
                            if (!editorEdit.commit()) {
                                a71Var.b(15320);
                            }
                        } else {
                            a71Var.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    l31 l31VarB2 = b(1);
                    if (l31VarB2 != null) {
                        hashSet.add(l31VarB2.z().z());
                    }
                    l31 l31VarB3 = b(2);
                    if (l31VarB3 != null) {
                        hashSet.add(l31VarB3.z().z());
                    }
                    File[] fileArrListFiles = c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileV2 = rb0.v(c(), name);
                                fileV2.getClass();
                                rb0.G(fileV2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        a71Var.b(15316);
    }

    public final l31 b(int i10) {
        SharedPreferences sharedPreferences = this.f16741c;
        String string = i10 == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrJ = p9.c.j(string);
                l31 l31VarD = l31.D(cs1.D(bArrJ, 0, bArrJ.length));
                String strZ = l31VarD.z().z();
                File fileD = rb0.d(strZ, "pcam.jar", c());
                if (fileD == null) {
                    throw null;
                }
                if (!fileD.exists() && (fileD = rb0.d(strZ, "pcam", c())) == null) {
                    throw null;
                }
                File fileD2 = rb0.d(strZ, "pcbc", c());
                if (fileD2 == null) {
                    throw null;
                }
                if (fileD.exists() && fileD2.exists()) {
                    return l31VarD;
                }
            } catch (et1 unused) {
                this.f16743e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f16739a, Integer.toString(((hh) this.f16742d.zzb()).f15291a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i10 = ((hh) this.f16742d.zzb()).f15291a;
        return l1.d.k(new StringBuilder(String.valueOf(i10).length() + 6), "FBAMTD", i10);
    }

    public final String e() {
        int i10 = ((hh) this.f16742d.zzb()).f15291a;
        return l1.d.k(new StringBuilder(String.valueOf(i10).length() + 6), "LATMTD", i10);
    }
}

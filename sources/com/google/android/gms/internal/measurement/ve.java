package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.D1;
import com.ironsource.X3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ve implements jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24094a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24097d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24096c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ye f24095b = new ye();

    public ve(q6 q6Var) {
        this.f24094a = (Context) q6Var.f23891b;
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final bf a(Uri uri) throws b2.z, af {
        if (h(uri)) {
            throw new af("Android backend cannot perform remote operations without a remote backend");
        }
        File fileB = yg.b(g(uri));
        return new bf(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final boolean b(Uri uri) throws af {
        if (h(uri)) {
            throw new af("Android backend cannot perform remote operations without a remote backend");
        }
        return yg.b(g(uri)).exists();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:55:0x0112, B:57:0x0116, B:60:0x012b, B:61:0x012d), top: B:80:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.jf
    public final File c(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (h(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.f24094a;
        if (!uri.getScheme().equals("android")) {
            throw new b2.z("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new b2.z("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals(D1.f25920e)) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gb.i(context)) {
                        synchronized (this.f24096c) {
                            try {
                                if (this.f24097d == null) {
                                    this.f24097d = mb.c(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.f24097d;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new af("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gb.i(context)) {
                        synchronized (this.f24096c) {
                            if (this.f24097d == null) {
                                this.f24097d = mb.c(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f24097d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new af("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = mb.c(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gb.i(context)) {
                        synchronized (this.f24096c) {
                            if (this.f24097d == null) {
                                this.f24097d = mb.c(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f24097d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new af("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(mb.c(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = ue.f24047a;
                            if ("shared".equals(str3)) {
                                account = ue.f24047a;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                h.e(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!ue.f24047a.equals(account)) {
                                throw new b2.z("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e10) {
                            throw new b2.z(e10);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gb.i(context)) {
                        synchronized (this.f24096c) {
                            if (this.f24097d == null) {
                                this.f24097d = mb.c(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f24097d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new af("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gb.i(context)) {
                        synchronized (this.f24096c) {
                            if (this.f24097d == null) {
                                this.f24097d = mb.c(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f24097d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new af("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!gb.i(context)) {
                        synchronized (this.f24096c) {
                            if (this.f24097d == null) {
                                this.f24097d = mb.c(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f24097d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new af("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new b2.z(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final OutputStream d(Uri uri) {
        return this.f24095b.d(g(uri));
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final void e(Uri uri) throws IOException {
        this.f24095b.e(g(uri));
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final void f(Uri uri, Uri uri2) throws IOException {
        this.f24095b.f(g(uri), g(uri2));
    }

    public final Uri g(Uri uri) throws IOException {
        if (h(uri)) {
            throw new b2.z("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme(X3.i.f27782b).authority("").path("/");
        oa.e0 e0VarU = oa.j0.u();
        builderPath.path(fileC.getAbsolutePath());
        oa.n1 n1VarG = e0VarU.g();
        Pattern pattern = ff.f23467a;
        return builderPath.encodedFragment(n1VarG.isEmpty() ? null : "transform=".concat(String.valueOf(new na.g("+").C(n1VarG)))).build();
    }

    public final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f24094a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // com.google.android.gms.internal.measurement.jf
    public final String zzc() {
        return "android";
    }
}

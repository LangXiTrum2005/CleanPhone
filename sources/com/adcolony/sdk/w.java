package com.adcolony.sdk;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList<Runnable> f9427a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9428b;

    public class a implements j0 {

        /* JADX INFO: renamed from: com.adcolony.sdk.w$a$a, reason: collision with other inner class name */
        public class RunnableC0019a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9430a;

            public RunnableC0019a(h0 h0Var) {
                this.f9430a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.g(this.f9430a);
                w.this.a();
            }
        }

        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new RunnableC0019a(h0Var));
        }
    }

    public class b implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9433a;

            public a(h0 h0Var) {
                this.f9433a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.a(this.f9433a, new File(c0.h(this.f9433a.a(), "filepath")));
                w.this.a();
            }
        }

        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class c implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9436a;

            public a(h0 h0Var) {
                this.f9436a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.d(this.f9436a);
                w.this.a();
            }
        }

        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class d implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9439a;

            public a(h0 h0Var) {
                this.f9439a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.e(this.f9439a);
                w.this.a();
            }
        }

        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class e implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9442a;

            public a(h0 h0Var) {
                this.f9442a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.f(this.f9442a);
                w.this.a();
            }
        }

        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class f implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9445a;

            public a(h0 h0Var) {
                this.f9445a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.b(this.f9445a);
                w.this.a();
            }
        }

        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class g implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9448a;

            public a(h0 h0Var) {
                this.f9448a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.c(this.f9448a);
                w.this.a();
            }
        }

        public g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class h implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9451a;

            public a(h0 h0Var) {
                this.f9451a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.h(this.f9451a);
                w.this.a();
            }
        }

        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    public class i implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9454a;

            public a(h0 h0Var) {
                this.f9454a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.this.a(this.f9454a);
                w.this.a();
            }
        }

        public i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            w.this.a(new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            int iD = c0.d(f1VarA, "offset");
            int iD2 = c0.d(f1VarA, "size");
            boolean zB = c0.b(f1VarA, "gunzip");
            String strH2 = c0.h(f1VarA, "output_filepath");
            InputStream w0Var = new w0(new FileInputStream(strH), iD, iD2);
            if (zB) {
                w0Var = new GZIPInputStream(w0Var, 1024);
            }
            if (strH2.equals("")) {
                StringBuilder sb = new StringBuilder(w0Var.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = w0Var.read(bArr, 0, 1024);
                    if (i2 < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, i2, CharEncoding.ISO_8859_1));
                }
                c0.b(f1VarB, "size", sb.length());
                c0.a(f1VarB, "data", sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(strH2);
                byte[] bArr2 = new byte[1024];
                int i3 = 0;
                while (true) {
                    int i4 = w0Var.read(bArr2, 0, 1024);
                    if (i4 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, i4);
                    i3 += i4;
                }
                fileOutputStream.close();
                c0.b(f1VarB, "size", i3);
            }
            w0Var.close();
            c0.b(f1VarB, "success", true);
            h0Var.a(f1VarB).c();
            return true;
        } catch (IOException unused) {
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        } catch (OutOfMemoryError unused2) {
            new e0.a().a("Out of memory error - disabling AdColony.").a(e0.f9131h);
            com.adcolony.sdk.a.b().b(true);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        String[] list = new File(strH).list();
        if (list == null) {
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        e1 e1VarA = c0.a();
        for (String str : list) {
            f1 f1VarB2 = c0.b();
            c0.a(f1VarB2, "filename", str);
            if (new File(android.support.v4.media.a.m(strH, str)).isDirectory()) {
                c0.b(f1VarB2, "is_folder", true);
            } else {
                c0.b(f1VarB2, "is_folder", false);
            }
            c0.a(e1VarA, f1VarB2);
        }
        c0.b(f1VarB, "success", true);
        c0.a(f1VarB, "entries", e1VarA);
        h0Var.a(f1VarB).c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "filepath");
        String strH2 = c0.h(f1VarA, "encoding");
        boolean z2 = strH2 != null && strH2.equals("utf8");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            StringBuilder sbA = a(strH, z2);
            c0.b(f1VarB, "success", true);
            c0.a(f1VarB, "data", sbA.toString());
            h0Var.a(f1VarB).c();
            return sbA.toString();
        } catch (IOException unused) {
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "filepath");
        String strH2 = c0.h(f1VarA, "new_filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            if (new File(strH).renameTo(new File(strH2))) {
                c0.b(f1VarB, "success", true);
                h0Var.a(f1VarB).c();
                return true;
            }
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        } catch (Exception unused) {
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "filepath");
        String strH2 = c0.h(f1VarA, "data");
        boolean zEquals = c0.h(f1VarA, "encoding").equals("utf8");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            a(strH, strH2, zEquals);
            c0.b(f1VarB, "success", true);
            h0Var.a(f1VarB).c();
            return true;
        } catch (IOException unused) {
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(h0 h0Var) {
        boolean z2;
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "filepath");
        String strH2 = c0.h(f1VarA, "bundle_path");
        e1 e1VarA = c0.a(f1VarA, "bundle_filenames");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            try {
                File file = new File(strH2);
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                byte[] bArr = new byte[32];
                randomAccessFile.readInt();
                int i2 = randomAccessFile.readInt();
                e1 e1Var = new e1();
                byte[] bArr2 = new byte[1024];
                int i3 = 0;
                while (i3 < i2) {
                    File file2 = file;
                    randomAccessFile.seek((i3 * 44) + 8);
                    randomAccessFile.read(bArr);
                    randomAccessFile.readInt();
                    int i4 = randomAccessFile.readInt();
                    int i5 = randomAccessFile.readInt();
                    e1Var.f(i5);
                    try {
                        String str = strH + e1VarA.a(i3);
                        e1 e1Var2 = e1VarA;
                        String str2 = strH;
                        randomAccessFile.seek(i4);
                        FileOutputStream fileOutputStream = new FileOutputStream(str);
                        int i6 = i5 / 1024;
                        int i7 = i5 % 1024;
                        int i8 = 0;
                        while (i8 < i6) {
                            int i9 = i6;
                            z2 = false;
                            try {
                                randomAccessFile.read(bArr2, 0, 1024);
                                fileOutputStream.write(bArr2, 0, 1024);
                                i8++;
                                i6 = i9;
                            } catch (IOException unused) {
                                new e0.a().a("Failed to find or open ad unit bundle at path: ").a(strH2).a(e0.f9132i);
                                c0.b(f1VarB, "success", z2);
                                h0Var.a(f1VarB).c();
                                return z2;
                            }
                        }
                        randomAccessFile.read(bArr2, 0, i7);
                        fileOutputStream.write(bArr2, 0, i7);
                        fileOutputStream.close();
                        i3++;
                        strH = str2;
                        file = file2;
                        e1VarA = e1Var2;
                    } catch (JSONException unused2) {
                        new e0.a().a("Couldn't extract file name at index ").a(i3).a(" unpacking ad unit bundle at ").a(strH2).a(e0.f9131h);
                        z2 = false;
                        c0.b(f1VarB, "success", false);
                        h0Var.a(f1VarB).c();
                        return false;
                    }
                }
                File file3 = file;
                randomAccessFile.close();
                file3.delete();
                c0.b(f1VarB, "success", true);
                c0.a(f1VarB, "file_sizes", e1Var);
                h0Var.a(f1VarB).c();
                return true;
            } catch (IOException unused3) {
                z2 = false;
            }
        } catch (OutOfMemoryError unused4) {
            new e0.a().a("Out of memory error - disabling AdColony.").a(e0.f9131h);
            com.adcolony.sdk.a.b().b(true);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
    }

    public void b() {
        com.adcolony.sdk.a.a("FileSystem.save", new a());
        com.adcolony.sdk.a.a("FileSystem.delete", new b());
        com.adcolony.sdk.a.a("FileSystem.listing", new c());
        com.adcolony.sdk.a.a("FileSystem.load", new d());
        com.adcolony.sdk.a.a("FileSystem.rename", new e());
        com.adcolony.sdk.a.a("FileSystem.exists", new f());
        com.adcolony.sdk.a.a("FileSystem.extract", new g());
        com.adcolony.sdk.a.a("FileSystem.unpack_bundle", new h());
        com.adcolony.sdk.a.a("FileSystem.create_directory", new i());
    }

    public void a(String str, String str2, boolean z2) throws IOException {
        BufferedWriter bufferedWriter;
        if (z2) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), com.adcolony.sdk.h.f9168a));
        } else {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        }
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var, File file) {
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        if (a(file)) {
            c0.b(f1VarB, "success", true);
            h0Var.a(f1VarB).c();
            return true;
        }
        c0.b(f1VarB, "success", false);
        h0Var.a(f1VarB).c();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            boolean zA = a(strH);
            c0.b(f1VarB, "result", zA);
            c0.b(f1VarB, "success", true);
            h0Var.a(f1VarB).c();
            return zA;
        } catch (Exception e2) {
            c0.b(f1VarB, "result", false);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            e2.printStackTrace();
            return false;
        }
    }

    public boolean a(File file) {
        try {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    return file.delete();
                }
                String[] list = file.list();
                if (list.length > 0) {
                    return a(new File(file, list[0]));
                }
                if (file.list().length == 0) {
                    return file.delete();
                }
                return false;
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    public StringBuilder a(String str, boolean z2) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        if (z2) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), com.adcolony.sdk.h.f9168a));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    private boolean a(String str) {
        return new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "filepath");
        com.adcolony.sdk.a.b().z().h();
        f1 f1VarB = c0.b();
        try {
            if (new File(strH).mkdir()) {
                c0.b(f1VarB, "success", true);
                h0Var.a(f1VarB).c();
                return true;
            }
            c0.b(f1VarB, "success", false);
            return false;
        } catch (Exception unused) {
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (this.f9427a.isEmpty() && !this.f9428b) {
            this.f9428b = true;
            runnable.run();
        } else {
            this.f9427a.push(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f9428b = false;
        if (this.f9427a.isEmpty()) {
            return;
        }
        this.f9428b = true;
        this.f9427a.removeLast().run();
    }
}

package l7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.ironsource.X3;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45236a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f45238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f45239d;

    @Override // l7.x
    public void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        h(key, null, null);
        k("%s", value);
        m();
        q7.x xVar = (q7.x) this.f45239d;
        if (xVar != null) {
            xVar.b(value, "    ".concat(key));
        }
    }

    public xn.i b() {
        return new xn.i(this.f45236a, this.f45237b, (String[]) this.f45238c, (String[]) this.f45239d);
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.n.f(cipherSuites, "cipherSuites");
        if (!this.f45236a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f45238c = (String[]) cipherSuites.clone();
    }

    public void d(xn.h... cipherSuites) {
        kotlin.jvm.internal.n.f(cipherSuites, "cipherSuites");
        if (!this.f45236a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (xn.h hVar : cipherSuites) {
            arrayList.add(hVar.f53964a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void e(String... tlsVersions) {
        kotlin.jvm.internal.n.f(tlsVersions, "tlsVersions");
        if (!this.f45236a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f45239d = (String[]) tlsVersions.clone();
    }

    public void f(xn.a0... a0VarArr) {
        if (!this.f45236a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        for (xn.a0 a0Var : a0VarArr) {
            arrayList.add(a0Var.f53926a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void g(String str, Object... args) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f45238c;
        kotlin.jvm.internal.n.f(args, "args");
        if (this.f45237b) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
            kotlin.jvm.internal.n.e(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
            byte[] bytes = strEncode.getBytes(an.a.f3768a);
            kotlin.jvm.internal.n.e(bytes, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes);
            return;
        }
        if (this.f45236a) {
            Charset charset = an.a.f3768a;
            byte[] bytes2 = "--".getBytes(charset);
            kotlin.jvm.internal.n.e(bytes2, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes2);
            byte[] bytes3 = b0.f45085j.getBytes(charset);
            kotlin.jvm.internal.n.e(bytes3, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            kotlin.jvm.internal.n.e(bytes4, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes4);
            this.f45236a = false;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(an.a.f3768a);
        kotlin.jvm.internal.n.e(bytes5, "this as java.lang.String).getBytes(charset)");
        filterOutputStream.write(bytes5);
    }

    public void h(String str, String str2, String str3) throws IOException {
        if (this.f45237b) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.f45238c;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(an.a.f3768a);
            kotlin.jvm.internal.n.e(bytes, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes);
            return;
        }
        g("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            g("; filename=\"%s\"", str2);
        }
        k("", new Object[0]);
        if (str3 != null) {
            k("%s: %s", "Content-Type", str3);
        }
        k("", new Object[0]);
    }

    public void i(Uri contentUri, String key, String str) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f45238c;
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(contentUri, "contentUri");
        if (str == null) {
            str = "content/unknown";
        }
        h(key, key, str);
        int i10 = q7.e0.i(s.b().getContentResolver().openInputStream(contentUri), filterOutputStream);
        k("", new Object[0]);
        m();
        ((q7.x) this.f45239d).b(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)), "    ".concat(key));
    }

    public void j(String key, ParcelFileDescriptor descriptor, String str) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f45238c;
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        if (str == null) {
            str = "content/unknown";
        }
        h(key, key, str);
        int i10 = q7.e0.i(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), filterOutputStream);
        k("", new Object[0]);
        m();
        ((q7.x) this.f45239d).b(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)), "    ".concat(key));
    }

    public void k(String str, Object... objArr) throws IOException {
        g(str, Arrays.copyOf(objArr, objArr.length));
        if (this.f45237b) {
            return;
        }
        g("\r\n", new Object[0]);
    }

    public void l(String key, Object obj, b0 b0Var) {
        q7.x xVar = (q7.x) this.f45239d;
        kotlin.jvm.internal.n.f(key, "key");
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f45238c;
        String str = b0.f45085j;
        if (j2.n.y(obj)) {
            a(key, j2.n.j(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            h(key, key, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            k("", new Object[0]);
            m();
            xVar.b("<Image>", "    ".concat(key));
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            h(key, key, "content/unknown");
            filterOutputStream.write(bArr);
            k("", new Object[0]);
            m();
            xVar.b(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1)), "    ".concat(key));
            return;
        }
        if (obj instanceof Uri) {
            i((Uri) obj, key, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            j(key, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof y)) {
            throw new IllegalArgumentException("value is not a supported type.");
        }
        y yVar = (y) obj;
        Parcelable parcelable = yVar.f45235b;
        String str2 = yVar.f45234a;
        if (parcelable instanceof ParcelFileDescriptor) {
            j(key, (ParcelFileDescriptor) parcelable, str2);
        } else {
            if (!(parcelable instanceof Uri)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            i((Uri) parcelable, key, str2);
        }
    }

    public void m() throws IOException {
        if (!this.f45237b) {
            k("--%s", b0.f45085j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f45238c;
        byte[] bytes = X3.j.f27832c.getBytes(an.a.f3768a);
        kotlin.jvm.internal.n.e(bytes, "this as java.lang.String).getBytes(charset)");
        filterOutputStream.write(bytes);
    }
}

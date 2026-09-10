package com.smartdigimkt.o4;

import android.util.SparseArray;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.x;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f37434i = "cached_content_index.exi";
    private static final int j = 2;
    private static final int k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, g> f37435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f37436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.p4.b f37437c;
    private final Cipher d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SecretKeySpec f37438e;
    private final boolean f;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x f37439h;

    public h(File file) {
        this(file, null);
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
    private void h() throws Throwable {
        DataOutputStream dataOutputStream;
        Throwable th;
        IOException e2;
        DataOutputStream dataOutputStream2 = null;
        DataOutputStream dataOutputStream3 = null;
        try {
            OutputStream outputStreamD = this.f37437c.d();
            x xVar = this.f37439h;
            if (xVar == null) {
                this.f37439h = new x(outputStreamD);
            } else {
                xVar.a(outputStreamD);
            }
            dataOutputStream = new DataOutputStream(this.f37439h);
            try {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.f ? 1 : 0);
                if (this.f) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.d.init(1, this.f37438e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.f37439h, this.d));
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e4) {
                        e = e4;
                        throw new IllegalStateException(e);
                    }
                }
                try {
                    try {
                        dataOutputStream.writeInt(this.f37435a.size());
                        int iA = 0;
                        for (g gVar : this.f37435a.values()) {
                            gVar.a(dataOutputStream);
                            iA += gVar.a(2);
                        }
                        dataOutputStream.writeInt(iA);
                        this.f37437c.a(dataOutputStream);
                        f0.a((Closeable) null);
                    } catch (Throwable th2) {
                        DataOutputStream dataOutputStream4 = dataOutputStream;
                        th = th2;
                        dataOutputStream2 = dataOutputStream4;
                        Throwable th3 = th;
                        dataOutputStream = dataOutputStream2;
                        th = th3;
                        f0.a(dataOutputStream);
                        throw th;
                    }
                } catch (IOException e5) {
                    DataOutputStream dataOutputStream5 = dataOutputStream;
                    e = e5;
                    dataOutputStream3 = dataOutputStream5;
                    IOException iOException = e;
                    dataOutputStream = dataOutputStream3;
                    e2 = iOException;
                    throw new a.C0559a(e2);
                }
            } catch (IOException e6) {
                e2 = e6;
                throw new a.C0559a(e2);
            } catch (Throwable th4) {
                th = th4;
                f0.a(dataOutputStream);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Throwable th5) {
            th = th5;
            Throwable th6 = th;
            dataOutputStream = dataOutputStream2;
            th = th6;
            f0.a(dataOutputStream);
            throw th;
        }
    }

    public Collection<g> a() {
        return this.f37435a.values();
    }

    public int b(String str) {
        return e(str).f37430a;
    }

    public g c(String str) {
        return this.f37435a.get(str);
    }

    public void d() {
        com.smartdigimkt.p4.a.b(!this.g);
        if (e()) {
            return;
        }
        this.f37437c.a();
        this.f37435a.clear();
        this.f37436b.clear();
    }

    public g e(String str) {
        g gVar = this.f37435a.get(str);
        return gVar == null ? a(str) : gVar;
    }

    public void f(String str) {
        g gVar = this.f37435a.get(str);
        if (gVar == null || !gVar.c() || gVar.d()) {
            return;
        }
        this.f37435a.remove(str);
        this.f37436b.remove(gVar.f37430a);
        this.g = true;
    }

    public void g() throws Throwable {
        if (this.g) {
            h();
            this.g = false;
        }
    }

    public h(File file, byte[] bArr) {
        this(file, bArr, bArr != null);
    }

    private static Cipher b() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (f0.f37540a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public String a(int i2) {
        return this.f37436b.get(i2);
    }

    public Set<String> c() {
        return this.f37435a.keySet();
    }

    public h(File file, byte[] bArr, boolean z2) {
        this.f = z2;
        if (bArr != null) {
            com.smartdigimkt.p4.a.a(bArr.length == 16);
            try {
                this.d = b();
                this.f37438e = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            com.smartdigimkt.p4.a.b(!z2);
            this.d = null;
            this.f37438e = null;
        }
        this.f37435a = new HashMap<>();
        this.f37436b = new SparseArray<>();
        this.f37437c = new com.smartdigimkt.p4.b(new File(file, "cached_content_index.exi"));
    }

    private boolean e() throws Throwable {
        DataInputStream dataInputStream = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f37437c.b());
            DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
            try {
                int i2 = dataInputStream2.readInt();
                if (i2 >= 0 && i2 <= 2) {
                    if ((dataInputStream2.readInt() & 1) != 0) {
                        if (this.d == null) {
                            f0.a((Closeable) dataInputStream2);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream2.readFully(bArr);
                        try {
                            this.d.init(2, this.f37438e, new IvParameterSpec(bArr));
                            dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.d));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f) {
                        this.g = true;
                    }
                    int i3 = dataInputStream2.readInt();
                    int iA = 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        g gVarA = g.a(i2, dataInputStream2);
                        a(gVarA);
                        iA += gVarA.a(i2);
                    }
                    int i5 = dataInputStream2.readInt();
                    boolean z2 = dataInputStream2.read() == -1;
                    if (i5 == iA && z2) {
                        f0.a((Closeable) dataInputStream2);
                        return true;
                    }
                    f0.a((Closeable) dataInputStream2);
                    return false;
                }
                f0.a((Closeable) dataInputStream2);
                return false;
            } catch (IOException unused) {
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    f0.a((Closeable) dataInputStream);
                }
                return false;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    f0.a((Closeable) dataInputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void a(String str, k kVar) {
        if (e(str).a(kVar)) {
            this.g = true;
        }
    }

    private g a(String str) {
        g gVar = new g(a(this.f37436b), str);
        a(gVar);
        this.g = true;
        return gVar;
    }

    public i d(String str) {
        g gVarC = c(str);
        return gVarC != null ? gVarC.a() : l.d;
    }

    public void f() {
        int size = this.f37435a.size();
        String[] strArr = new String[size];
        this.f37435a.keySet().toArray(strArr);
        for (int i2 = 0; i2 < size; i2++) {
            f(strArr[i2]);
        }
    }

    private void a(g gVar) {
        this.f37435a.put(gVar.f37431b, gVar);
        this.f37436b.put(gVar.f37430a, gVar.f37431b);
    }

    public static int a(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i2 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i2 < size && i2 == sparseArray.keyAt(i2)) {
            i2++;
        }
        return i2;
    }
}

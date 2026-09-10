package com.smartdigimkt.o4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
final class g {
    private static final int f = 2;
    private static final int g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37431b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37433e;
    private l d = l.d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TreeSet<n> f37432c = new TreeSet<>();

    public g(int i2, String str) {
        this.f37430a = i2;
        this.f37431b = str;
    }

    public static g a(int i2, DataInputStream dataInputStream) throws IOException {
        g gVar = new g(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i2 >= 2) {
            gVar.d = l.a(dataInputStream);
            return gVar;
        }
        long j = dataInputStream.readLong();
        k kVar = new k();
        j.a(kVar, j);
        gVar.a(kVar);
        return gVar;
    }

    public TreeSet<n> b() {
        return this.f37432c;
    }

    public boolean c() {
        return this.f37432c.isEmpty();
    }

    public boolean d() {
        return this.f37433e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f37430a == gVar.f37430a && this.f37431b.equals(gVar.f37431b) && this.f37432c.equals(gVar.f37432c) && this.d.equals(gVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f37432c.hashCode() + (a(Integer.MAX_VALUE) * 31);
    }

    public n b(n nVar) throws a.C0559a {
        com.smartdigimkt.p4.a.b(this.f37432c.remove(nVar));
        n nVarA = nVar.a(this.f37430a);
        if (nVar.f37425e.renameTo(nVarA.f37425e)) {
            this.f37432c.add(nVarA);
            return nVarA;
        }
        throw new a.C0559a("Renaming of " + nVar.f37425e + " to " + nVarA.f37425e + " failed.");
    }

    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f37430a);
        dataOutputStream.writeUTF(this.f37431b);
        this.d.a(dataOutputStream);
    }

    public i a() {
        return this.d;
    }

    public boolean a(k kVar) {
        l lVar = this.d;
        l lVarA = lVar.a(kVar);
        this.d = lVarA;
        return !lVarA.equals(lVar);
    }

    public void a(boolean z2) {
        this.f37433e = z2;
    }

    public void a(n nVar) {
        this.f37432c.add(nVar);
    }

    public n a(long j) {
        n nVarA = n.a(this.f37431b, j);
        n nVarFloor = this.f37432c.floor(nVarA);
        if (nVarFloor != null && nVarFloor.f37423b + nVarFloor.f37424c > j) {
            return nVarFloor;
        }
        n nVarCeiling = this.f37432c.ceiling(nVarA);
        if (nVarCeiling == null) {
            return n.b(this.f37431b, j);
        }
        return n.a(this.f37431b, j, nVarCeiling.f37423b - j);
    }

    public long a(long j, long j2) {
        n nVarA = a(j);
        if (nVarA.a()) {
            return -Math.min(nVarA.b() ? Long.MAX_VALUE : nVarA.f37424c, j2);
        }
        long j3 = j + j2;
        long jMax = nVarA.f37423b + nVarA.f37424c;
        if (jMax < j3) {
            for (n nVar : this.f37432c.tailSet(nVarA, false)) {
                long j4 = nVar.f37423b;
                if (j4 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j4 + nVar.f37424c);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public boolean a(e eVar) {
        if (!this.f37432c.remove(eVar)) {
            return false;
        }
        eVar.f37425e.delete();
        return true;
    }

    public int a(int i2) {
        int iHashCode = this.f37431b.hashCode() + (this.f37430a * 31);
        if (i2 < 2) {
            long jA = j.a(this.d);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return this.d.hashCode() + (iHashCode * 31);
    }
}

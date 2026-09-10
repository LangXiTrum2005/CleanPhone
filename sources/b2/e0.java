package b2;

import android.os.Handler;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements j2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f5248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f5249b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f5250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f5251d;

    public e0(g0 g0Var, InputStream inputStream) {
        this.f5251d = g0Var;
        this.f5248a = new DataInputStream(inputStream);
    }

    @Override // j2.j
    public final void cancelLoad() {
        this.f5250c = true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    @Override // j2.j
    public final void load() throws IOException {
        String str;
        while (!this.f5250c) {
            byte b10 = this.f5248a.readByte();
            if (b10 == 36) {
                int unsignedByte = this.f5248a.readUnsignedByte();
                int unsignedShort = this.f5248a.readUnsignedShort();
                byte[] bArr = new byte[unsignedShort];
                this.f5248a.readFully(bArr, 0, unsignedShort);
                q0 q0Var = (q0) this.f5251d.f5281c.get(Integer.valueOf(unsignedByte));
                if (q0Var != null && !this.f5251d.f5284f) {
                    q0Var.f5388e.add(bArr);
                }
            } else if (this.f5251d.f5284f) {
                continue;
            } else {
                eb.d0 d0Var = this.f5251d.f5279a;
                d0 d0Var2 = this.f5249b;
                DataInputStream dataInputStream = this.f5248a;
                d0Var2.getClass();
                oa.j0 j0VarA = d0Var2.a(d0.b(b10, dataInputStream));
                while (j0VarA == null) {
                    if (d0Var2.f5246c == 3) {
                        long j10 = d0Var2.f5245b;
                        if (j10 <= 0) {
                            throw new IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int iC = com.bumptech.glide.c.c(j10);
                        go.k.t(iC != -1);
                        byte[] bArr2 = new byte[iC];
                        dataInputStream.readFully(bArr2, 0, iC);
                        ArrayList arrayList = (ArrayList) d0Var2.f5247d;
                        go.k.t(d0Var2.f5246c == 3);
                        if (iC > 0) {
                            int i10 = iC - 1;
                            if (bArr2[i10] == 10) {
                                if (iC > 1) {
                                    int i11 = iC - 2;
                                    if (bArr2[i11] == 13) {
                                        str = new String(bArr2, 0, i11, g0.f5278g);
                                    } else {
                                        str = new String(bArr2, 0, i10, g0.f5278g);
                                    }
                                } else {
                                    str = new String(bArr2, 0, i10, g0.f5278g);
                                }
                                arrayList.add(str);
                                j0VarA = oa.j0.x(arrayList);
                                ((ArrayList) d0Var2.f5247d).clear();
                                d0Var2.f5246c = 1;
                                d0Var2.f5245b = 0L;
                            }
                        }
                        throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    j0VarA = d0Var2.a(d0.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) d0Var.f39976b).post(new o(0, d0Var, j0VarA));
            }
        }
    }
}

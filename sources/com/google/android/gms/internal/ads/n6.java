package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n6 implements e3, zb0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n6 f17676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n6 f17677d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17679b;

    static {
        int i10 = 0;
        f17676c = new n6(true, i10);
        f17677d = new n6(false, i10);
    }

    public /* synthetic */ n6(int i10) {
        this.f17678a = i10;
    }

    public String toString() {
        switch (this.f17678a) {
            case 0:
                boolean z10 = !this.f17679b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
                sb2.append("IncorrectFragmentation{expected=");
                sb2.append(z10);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        wb0 wb0Var = (wb0) obj;
        switch (this.f17678a) {
            case 1:
                wb0Var.Y(this.f17679b);
                break;
            default:
                wb0Var.b0(this.f17679b);
                break;
        }
    }

    public /* synthetic */ n6(boolean z10, int i10) {
        this.f17678a = i10;
        this.f17679b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    public n6(b91 b91Var, n81 n81Var) throws x71 {
        this.f17678a = 5;
        int i10 = n81Var.f17713a;
        ByteBuffer byteBuffer = n81Var.f17714b;
        boolean z10 = false;
        ps1.v(i10 == 6 || i10 == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        gp0 gp0Var = new gp0(bArr, iMin);
        if (!b91Var.f12692a) {
            if (!gp0Var.g()) {
                int iH = gp0Var.h(2);
                boolean zG = gp0Var.g();
                if (b91Var.f12693b) {
                    throw new x71();
                }
                if (zG) {
                    boolean zG2 = (iH == 3 || iH == 0) ? true : gp0Var.g();
                    gp0Var.e();
                    if (b91Var.f12695d) {
                        if (gp0Var.g()) {
                            if (b91Var.f12696e) {
                                gp0Var.e();
                            } else {
                                throw new x71();
                            }
                        }
                        if (!b91Var.f12694c) {
                            if (iH != 3) {
                                gp0Var.e();
                            }
                            gp0Var.f(b91Var.f12697f);
                            if (iH != 2 && iH != 0 && !zG2) {
                                gp0Var.f(3);
                            }
                            if (iH == 3 || iH == 0 || gp0Var.h(8) != 0) {
                                z10 = true;
                            }
                        } else {
                            throw new x71();
                        }
                    } else {
                        throw new x71();
                    }
                } else {
                    z10 = true;
                }
            }
            this.f17679b = z10;
            return;
        }
        throw new x71();
    }
}

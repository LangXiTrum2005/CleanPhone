package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cp f2524a;
    private final dc b;

    public bt() {
        this(new cj.a());
    }

    private ck j(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        this.b.a(bArr);
        int length = bxVarArr.length + 1;
        bx[] bxVarArr2 = new bx[length];
        int i = 0;
        bxVarArr2[0] = bxVar;
        int i2 = 0;
        while (i2 < bxVarArr.length) {
            int i3 = i2 + 1;
            bxVarArr2[i3] = bxVarArr[i2];
            i2 = i3;
        }
        this.f2524a.j();
        ck ckVarL = null;
        while (i < length) {
            ckVarL = this.f2524a.l();
            if (ckVarL.b == 0 || ckVarL.c > bxVarArr2[i].a()) {
                return null;
            }
            if (ckVarL.c != bxVarArr2[i].a()) {
                cs.a(this.f2524a, ckVarL.b);
                this.f2524a.m();
            } else {
                i++;
                if (i < length) {
                    this.f2524a.j();
                }
            }
        }
        return ckVarL;
    }

    public void a(bq bqVar, byte[] bArr) throws bw {
        try {
            this.b.a(bArr);
            bqVar.read(this.f2524a);
        } finally {
            this.b.e();
            this.f2524a.B();
        }
    }

    public Byte b(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (Byte) a((byte) 3, bArr, bxVar, bxVarArr);
    }

    public Double c(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (Double) a((byte) 4, bArr, bxVar, bxVarArr);
    }

    public Short d(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (Short) a((byte) 6, bArr, bxVar, bxVarArr);
    }

    public Integer e(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (Integer) a((byte) 8, bArr, bxVar, bxVarArr);
    }

    public Long f(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (Long) a((byte) 10, bArr, bxVar, bxVarArr);
    }

    public String g(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (String) a((byte) 11, bArr, bxVar, bxVarArr);
    }

    public ByteBuffer h(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (ByteBuffer) a((byte) 100, bArr, bxVar, bxVarArr);
    }

    public Short i(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        try {
            try {
                if (j(bArr, bxVar, bxVarArr) == null) {
                    this.b.e();
                    this.f2524a.B();
                    return null;
                }
                this.f2524a.j();
                Short shValueOf = Short.valueOf(this.f2524a.l().c);
                this.b.e();
                this.f2524a.B();
                return shValueOf;
            } catch (Exception e) {
                throw new bw(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.f2524a.B();
            throw th;
        }
    }

    public bt(cr crVar) {
        dc dcVar = new dc();
        this.b = dcVar;
        this.f2524a = crVar.a(dcVar);
    }

    public void a(bq bqVar, String str, String str2) throws bw {
        try {
            try {
                a(bqVar, str.getBytes(str2));
                this.f2524a.B();
            } catch (UnsupportedEncodingException unused) {
                throw new bw("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } catch (Throwable th) {
            this.f2524a.B();
            throw th;
        }
    }

    public void a(bq bqVar, byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        try {
            try {
                if (j(bArr, bxVar, bxVarArr) != null) {
                    bqVar.read(this.f2524a);
                }
                this.b.e();
                this.f2524a.B();
            } catch (Exception e) {
                throw new bw(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.f2524a.B();
            throw th;
        }
    }

    public Boolean a(byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        return (Boolean) a((byte) 2, bArr, bxVar, bxVarArr);
    }

    private Object a(byte b, byte[] bArr, bx bxVar, bx... bxVarArr) throws bw {
        try {
            try {
                ck ckVarJ = j(bArr, bxVar, bxVarArr);
                if (ckVarJ != null) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 6) {
                                    if (b != 8) {
                                        if (b != 100) {
                                            if (b != 10) {
                                                if (b == 11 && ckVarJ.b == 11) {
                                                    String strZ = this.f2524a.z();
                                                    this.b.e();
                                                    this.f2524a.B();
                                                    return strZ;
                                                }
                                            } else if (ckVarJ.b == 10) {
                                                Long lValueOf = Long.valueOf(this.f2524a.x());
                                                this.b.e();
                                                this.f2524a.B();
                                                return lValueOf;
                                            }
                                        } else if (ckVarJ.b == 11) {
                                            ByteBuffer byteBufferA = this.f2524a.A();
                                            this.b.e();
                                            this.f2524a.B();
                                            return byteBufferA;
                                        }
                                    } else if (ckVarJ.b == 8) {
                                        Integer numValueOf = Integer.valueOf(this.f2524a.w());
                                        this.b.e();
                                        this.f2524a.B();
                                        return numValueOf;
                                    }
                                } else if (ckVarJ.b == 6) {
                                    Short shValueOf = Short.valueOf(this.f2524a.v());
                                    this.b.e();
                                    this.f2524a.B();
                                    return shValueOf;
                                }
                            } else if (ckVarJ.b == 4) {
                                Double dValueOf = Double.valueOf(this.f2524a.y());
                                this.b.e();
                                this.f2524a.B();
                                return dValueOf;
                            }
                        } else if (ckVarJ.b == 3) {
                            Byte bValueOf = Byte.valueOf(this.f2524a.u());
                            this.b.e();
                            this.f2524a.B();
                            return bValueOf;
                        }
                    } else if (ckVarJ.b == 2) {
                        Boolean boolValueOf = Boolean.valueOf(this.f2524a.t());
                        this.b.e();
                        this.f2524a.B();
                        return boolValueOf;
                    }
                }
                this.b.e();
                this.f2524a.B();
                return null;
            } catch (Exception e) {
                throw new bw(e);
            }
        } catch (Throwable th) {
            this.b.e();
            this.f2524a.B();
            throw th;
        }
    }

    public void a(bq bqVar, String str) throws bw {
        a(bqVar, str.getBytes());
    }
}
